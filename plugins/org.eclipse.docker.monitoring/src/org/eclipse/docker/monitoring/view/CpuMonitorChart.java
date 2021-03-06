package org.eclipse.docker.monitoring.view;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.docker.monitoring.events.CpuEvent;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.embed.swt.FXCanvas;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.input.MouseEvent;

public class CpuMonitorChart {
	private static final int MAX_DATA_POINTS = 30;

	private Series<Number, Number> series;
	private int xSeriesData = 0;
	private ConcurrentLinkedQueue<Number> dataQ = new ConcurrentLinkedQueue<Number>();
	private ExecutorService executor;
	private NumberAxis xAxis;

	private AreaChart<Number, Number> sc;

	private String name;

	public CpuMonitorChart(EventBus bus,String name) {
		bus.register(this);
		this.name=name;
	}

	public void start(FXCanvas primaryStage) throws Exception {
		init(primaryStage);
		// primaryStage.show();

		// -- Prepare Executor Services
		executor = Executors.newCachedThreadPool();

		// -- Prepare Timeline
		prepareTimeline();
	}

	// -- Timeline gets called in the JavaFX Main thread
	private void prepareTimeline() {
		// Every frame to take any data from queue and add to chart
		new AnimationTimer() {
			@Override
			public void handle(long now) {
				addDataToSeries();
			}
		}.start();
	}

	private void addDataToSeries() {
		// dataQ.add(10);
		for (int i = 0; i < 10; i++) { // -- add 20 numbers to the plot+
			if (dataQ.isEmpty())
				break;
			// if(xSeriesData>30){xSeriesData=0;}
			series.getData().add(new AreaChart.Data(xSeriesData++, dataQ.remove()));
		}
		// remove points to keep us at no more than MAX_DATA_POINTS

		if (series.getData().size() > MAX_DATA_POINTS) {
			series.getData().remove(0, series.getData().size() - MAX_DATA_POINTS);
		}
		
		// update
		xAxis.setLowerBound(xSeriesData - MAX_DATA_POINTS);
		xAxis.setUpperBound(xSeriesData - 1);
		// xSeriesData=0;
	}

	private void init(FXCanvas primaryStage) {
		// TODO Auto-generated method stub
		xAxis = new NumberAxis(0, MAX_DATA_POINTS, MAX_DATA_POINTS / 10);
		xAxis.setForceZeroInRange(false);
		xAxis.setAutoRanging(false);
		xAxis.setTickLabelsVisible(false);
		NumberAxis yAxis = new NumberAxis();
		yAxis.setAutoRanging(true);

		sc = new AreaChart<Number, Number>(xAxis, yAxis) {
			// Override to remove symbols on each data point
			@Override
			protected void dataItemAdded(Series<Number, Number> series, int itemIndex, Data<Number, Number> item) {
			}
		};
		sc.setAnimated(false);
		sc.setId("liveAreaChart");
		sc.setTitle("CPU Utilization chart");

		// -- Chart Series
		series = new AreaChart.Series<Number, Number>();
		series.setName("cpu used");
		sc.getData().add(series);
		
		primaryStage.setScene(new Scene(sc));
	}

	@Subscribe
	public void processCpu(CpuEvent event) {
		if(event.getName()==this.name){
		sc.setTitle(event.getMonitoring().getPercentage() + " %");
		dataQ.add(event.getMonitoring().getPercentage());
		}
	}

}
