/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.docker.language.ui.tests;

import com.google.inject.Injector;
import org.eclipse.docker.language.ui.internal.LanguageActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ContainerUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LanguageActivator.getInstance().getInjector("org.eclipse.docker.language.Container");
	}

}
