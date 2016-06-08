/*
 * generated by Xtext 2.9.2
 */
package org.eclipse.docker.language.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.docker.language.ide.contentassist.antlr.internal.InternalContainerParser;
import org.eclipse.docker.language.services.ContainerGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class ContainerParser extends AbstractContentAssistParser {

	@Inject
	private ContainerGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalContainerParser createParser() {
		InternalContainerParser result = new InternalContainerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getRestartPolicyAccess().getAlternatives_1(), "rule__RestartPolicy__Alternatives_1");
					put(grammarAccess.getInternalProtocolAccess().getAlternatives(), "rule__InternalProtocol__Alternatives");
					put(grammarAccess.getAccessModeAccess().getAlternatives(), "rule__AccessMode__Alternatives");
					put(grammarAccess.getCapabilityAccess().getAlternatives(), "rule__Capability__Alternatives");
					put(grammarAccess.getDockerAccess().getGroup(), "rule__Docker__Group__0");
					put(grammarAccess.getBuildImagesExecutionAccess().getGroup(), "rule__BuildImagesExecution__Group__0");
					put(grammarAccess.getBuildImagesExecutionAccess().getGroup_3(), "rule__BuildImagesExecution__Group_3__0");
					put(grammarAccess.getRunContainerDefinationAccess().getGroup(), "rule__RunContainerDefination__Group__0");
					put(grammarAccess.getRunContainerDefinationAccess().getGroup_3(), "rule__RunContainerDefination__Group_3__0");
					put(grammarAccess.getImportContainerAccess().getGroup(), "rule__ImportContainer__Group__0");
					put(grammarAccess.getImportContainerAccess().getGroup_1(), "rule__ImportContainer__Group_1__0");
					put(grammarAccess.getImportedFQNAccess().getGroup(), "rule__ImportedFQN__Group__0");
					put(grammarAccess.getImportedFQNAccess().getGroup_1(), "rule__ImportedFQN__Group_1__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getContainerSectionAccess().getGroup(), "rule__ContainerSection__Group__0");
					put(grammarAccess.getImageSectionAccess().getGroup(), "rule__ImageSection__Group__0");
					put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
					put(grammarAccess.getImageAccess().getGroup_3_0(), "rule__Image__Group_3_0__0");
					put(grammarAccess.getImageAccess().getGroup_3_1(), "rule__Image__Group_3_1__0");
					put(grammarAccess.getImageAccess().getGroup_3_2(), "rule__Image__Group_3_2__0");
					put(grammarAccess.getImageAccess().getGroup_3_3(), "rule__Image__Group_3_3__0");
					put(grammarAccess.getImageAccess().getGroup_3_4(), "rule__Image__Group_3_4__0");
					put(grammarAccess.getImageAccess().getGroup_3_5(), "rule__Image__Group_3_5__0");
					put(grammarAccess.getImageAccess().getGroup_3_6(), "rule__Image__Group_3_6__0");
					put(grammarAccess.getImageAccess().getGroup_3_7(), "rule__Image__Group_3_7__0");
					put(grammarAccess.getImageAccess().getGroup_3_8(), "rule__Image__Group_3_8__0");
					put(grammarAccess.getImageAccess().getGroup_3_9(), "rule__Image__Group_3_9__0");
					put(grammarAccess.getImageAccess().getGroup_3_10(), "rule__Image__Group_3_10__0");
					put(grammarAccess.getBuildArgsAccess().getGroup(), "rule__BuildArgs__Group__0");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getContainerAccess().getGroup_5_0(), "rule__Container__Group_5_0__0");
					put(grammarAccess.getContainerAccess().getGroup_5_1(), "rule__Container__Group_5_1__0");
					put(grammarAccess.getContainerAccess().getGroup_5_2(), "rule__Container__Group_5_2__0");
					put(grammarAccess.getContainerAccess().getGroup_5_3(), "rule__Container__Group_5_3__0");
					put(grammarAccess.getContainerAccess().getGroup_5_4(), "rule__Container__Group_5_4__0");
					put(grammarAccess.getContainerAccess().getGroup_5_5(), "rule__Container__Group_5_5__0");
					put(grammarAccess.getContainerAccess().getGroup_5_6(), "rule__Container__Group_5_6__0");
					put(grammarAccess.getContainerAccess().getGroup_5_7(), "rule__Container__Group_5_7__0");
					put(grammarAccess.getContainerAccess().getGroup_5_8(), "rule__Container__Group_5_8__0");
					put(grammarAccess.getContainerAccess().getGroup_5_9(), "rule__Container__Group_5_9__0");
					put(grammarAccess.getContainerAccess().getGroup_5_10(), "rule__Container__Group_5_10__0");
					put(grammarAccess.getContainerAccess().getGroup_5_11(), "rule__Container__Group_5_11__0");
					put(grammarAccess.getContainerAccess().getGroup_5_12(), "rule__Container__Group_5_12__0");
					put(grammarAccess.getContainerAccess().getGroup_5_13(), "rule__Container__Group_5_13__0");
					put(grammarAccess.getContainerAccess().getGroup_5_14(), "rule__Container__Group_5_14__0");
					put(grammarAccess.getContainerAccess().getGroup_5_15(), "rule__Container__Group_5_15__0");
					put(grammarAccess.getContainerAccess().getGroup_5_16(), "rule__Container__Group_5_16__0");
					put(grammarAccess.getContainerAccess().getGroup_5_17(), "rule__Container__Group_5_17__0");
					put(grammarAccess.getContainerAccess().getGroup_5_18(), "rule__Container__Group_5_18__0");
					put(grammarAccess.getContainerAccess().getGroup_5_19(), "rule__Container__Group_5_19__0");
					put(grammarAccess.getContainerAccess().getGroup_5_20(), "rule__Container__Group_5_20__0");
					put(grammarAccess.getContainerAccess().getGroup_5_21(), "rule__Container__Group_5_21__0");
					put(grammarAccess.getContainerAccess().getGroup_5_22(), "rule__Container__Group_5_22__0");
					put(grammarAccess.getContainerAccess().getGroup_5_23(), "rule__Container__Group_5_23__0");
					put(grammarAccess.getContainerAccess().getGroup_5_24(), "rule__Container__Group_5_24__0");
					put(grammarAccess.getContainerAccess().getGroup_5_25(), "rule__Container__Group_5_25__0");
					put(grammarAccess.getContainerAccess().getGroup_5_26(), "rule__Container__Group_5_26__0");
					put(grammarAccess.getContainerAccess().getGroup_5_27(), "rule__Container__Group_5_27__0");
					put(grammarAccess.getContainerAccess().getGroup_5_28(), "rule__Container__Group_5_28__0");
					put(grammarAccess.getContainerAccess().getGroup_5_29(), "rule__Container__Group_5_29__0");
					put(grammarAccess.getContainerAccess().getGroup_5_30(), "rule__Container__Group_5_30__0");
					put(grammarAccess.getContainerAccess().getGroup_5_31(), "rule__Container__Group_5_31__0");
					put(grammarAccess.getContainerAccess().getGroup_5_32(), "rule__Container__Group_5_32__0");
					put(grammarAccess.getContainerAccess().getGroup_5_33(), "rule__Container__Group_5_33__0");
					put(grammarAccess.getContainerAccess().getGroup_5_33_2(), "rule__Container__Group_5_33_2__0");
					put(grammarAccess.getContainerAccess().getGroup_5_34(), "rule__Container__Group_5_34__0");
					put(grammarAccess.getContainerAccess().getGroup_5_35(), "rule__Container__Group_5_35__0");
					put(grammarAccess.getVolumesFromAccess().getGroup(), "rule__VolumesFrom__Group__0");
					put(grammarAccess.getRestartPolicyAccess().getGroup(), "rule__RestartPolicy__Group__0");
					put(grammarAccess.getRestartPolicyAccess().getGroup_1_1(), "rule__RestartPolicy__Group_1_1__0");
					put(grammarAccess.getPortBindingAccess().getGroup(), "rule__PortBinding__Group__0");
					put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getLinkAccess().getGroup_2(), "rule__Link__Group_2__0");
					put(grammarAccess.getUlimitAccess().getGroup(), "rule__Ulimit__Group__0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getExposedPortAccess().getGroup(), "rule__ExposedPort__Group__0");
					put(grammarAccess.getDeviceAccess().getGroup(), "rule__Device__Group__0");
					put(grammarAccess.getBindAccess().getGroup(), "rule__Bind__Group__0");
					put(grammarAccess.getBindAccess().getGroup_4(), "rule__Bind__Group_4__0");
					put(grammarAccess.getDockerAccess().getImportsAssignment_0(), "rule__Docker__ImportsAssignment_0");
					put(grammarAccess.getDockerAccess().getContainerRegionAssignment_1_0(), "rule__Docker__ContainerRegionAssignment_1_0");
					put(grammarAccess.getDockerAccess().getImageRegionAssignment_1_1(), "rule__Docker__ImageRegionAssignment_1_1");
					put(grammarAccess.getDockerAccess().getBuildAssignment_2(), "rule__Docker__BuildAssignment_2");
					put(grammarAccess.getDockerAccess().getRuntimeAssignment_3(), "rule__Docker__RuntimeAssignment_3");
					put(grammarAccess.getBuildImagesExecutionAccess().getSequenceAssignment_2(), "rule__BuildImagesExecution__SequenceAssignment_2");
					put(grammarAccess.getBuildImagesExecutionAccess().getSequenceAssignment_3_1(), "rule__BuildImagesExecution__SequenceAssignment_3_1");
					put(grammarAccess.getRunContainerDefinationAccess().getSequenceAssignment_2(), "rule__RunContainerDefination__SequenceAssignment_2");
					put(grammarAccess.getRunContainerDefinationAccess().getSequenceAssignment_3_1(), "rule__RunContainerDefination__SequenceAssignment_3_1");
					put(grammarAccess.getImportContainerAccess().getImportedNamespaceAssignment_1_0(), "rule__ImportContainer__ImportedNamespaceAssignment_1_0");
					put(grammarAccess.getImportContainerAccess().getImportURIAssignment_2(), "rule__ImportContainer__ImportURIAssignment_2");
					put(grammarAccess.getContainerSectionAccess().getNameAssignment_2(), "rule__ContainerSection__NameAssignment_2");
					put(grammarAccess.getContainerSectionAccess().getContainersAssignment_4(), "rule__ContainerSection__ContainersAssignment_4");
					put(grammarAccess.getImageSectionAccess().getNameAssignment_2(), "rule__ImageSection__NameAssignment_2");
					put(grammarAccess.getImageSectionAccess().getImagesAssignment_4(), "rule__ImageSection__ImagesAssignment_4");
					put(grammarAccess.getImageAccess().getNameAssignment_1(), "rule__Image__NameAssignment_1");
					put(grammarAccess.getImageAccess().getTagAssignment_3_0_1(), "rule__Image__TagAssignment_3_0_1");
					put(grammarAccess.getImageAccess().getDockerFilelocationAssignment_3_1_1(), "rule__Image__DockerFilelocationAssignment_3_1_1");
					put(grammarAccess.getImageAccess().getForceRMAssignment_3_2_1(), "rule__Image__ForceRMAssignment_3_2_1");
					put(grammarAccess.getImageAccess().getNoCacheAssignment_3_3_1(), "rule__Image__NoCacheAssignment_3_3_1");
					put(grammarAccess.getImageAccess().getMemoryAssignment_3_4_1(), "rule__Image__MemoryAssignment_3_4_1");
					put(grammarAccess.getImageAccess().getMemswapAssignment_3_5_1(), "rule__Image__MemswapAssignment_3_5_1");
					put(grammarAccess.getImageAccess().getCpusetcpusAssignment_3_6_1(), "rule__Image__CpusetcpusAssignment_3_6_1");
					put(grammarAccess.getImageAccess().getCpusharesAssignment_3_7_1(), "rule__Image__CpusharesAssignment_3_7_1");
					put(grammarAccess.getImageAccess().getRemoveAssignment_3_8_1(), "rule__Image__RemoveAssignment_3_8_1");
					put(grammarAccess.getImageAccess().getQuietAssignment_3_9_1(), "rule__Image__QuietAssignment_3_9_1");
					put(grammarAccess.getImageAccess().getPullAssignment_3_10_1(), "rule__Image__PullAssignment_3_10_1");
					put(grammarAccess.getBuildArgsAccess().getKeyAssignment_1(), "rule__BuildArgs__KeyAssignment_1");
					put(grammarAccess.getBuildArgsAccess().getValueAssignment_2(), "rule__BuildArgs__ValueAssignment_2");
					put(grammarAccess.getContainerAccess().getNameAssignment_1(), "rule__Container__NameAssignment_1");
					put(grammarAccess.getContainerAccess().getImageAssignment_4(), "rule__Container__ImageAssignment_4");
					put(grammarAccess.getContainerAccess().getBindsAssignment_5_0_2(), "rule__Container__BindsAssignment_5_0_2");
					put(grammarAccess.getContainerAccess().getCapabilityAddAssignment_5_1_2(), "rule__Container__CapabilityAddAssignment_5_1_2");
					put(grammarAccess.getContainerAccess().getCapabilityDropAssignment_5_2_2(), "rule__Container__CapabilityDropAssignment_5_2_2");
					put(grammarAccess.getContainerAccess().getCommandsAssignment_5_3_2(), "rule__Container__CommandsAssignment_5_3_2");
					put(grammarAccess.getContainerAccess().getContainerIDFileAssignment_5_4_1(), "rule__Container__ContainerIDFileAssignment_5_4_1");
					put(grammarAccess.getContainerAccess().getCpuPeriodAssignment_5_5_1(), "rule__Container__CpuPeriodAssignment_5_5_1");
					put(grammarAccess.getContainerAccess().getCpusetCpusAssignment_5_6_1(), "rule__Container__CpusetCpusAssignment_5_6_1");
					put(grammarAccess.getContainerAccess().getCpusetMemsAssignment_5_7_1(), "rule__Container__CpusetMemsAssignment_5_7_1");
					put(grammarAccess.getContainerAccess().getCpuSharesAssignment_5_8_1(), "rule__Container__CpuSharesAssignment_5_8_1");
					put(grammarAccess.getContainerAccess().getDevicesAssignment_5_9_2(), "rule__Container__DevicesAssignment_5_9_2");
					put(grammarAccess.getContainerAccess().getDnsAssignment_5_10_1(), "rule__Container__DnsAssignment_5_10_1");
					put(grammarAccess.getContainerAccess().getDnsSearchAssignment_5_11_2(), "rule__Container__DnsSearchAssignment_5_11_2");
					put(grammarAccess.getContainerAccess().getDomainNameAssignment_5_12_1(), "rule__Container__DomainNameAssignment_5_12_1");
					put(grammarAccess.getContainerAccess().getEntrypointAssignment_5_13_2(), "rule__Container__EntrypointAssignment_5_13_2");
					put(grammarAccess.getContainerAccess().getEnvAssignment_5_14_2(), "rule__Container__EnvAssignment_5_14_2");
					put(grammarAccess.getContainerAccess().getExposedPortsAssignment_5_15_2(), "rule__Container__ExposedPortsAssignment_5_15_2");
					put(grammarAccess.getContainerAccess().getExtraHostsAssignment_5_16_2(), "rule__Container__ExtraHostsAssignment_5_16_2");
					put(grammarAccess.getContainerAccess().getLabelsAssignment_5_17_2(), "rule__Container__LabelsAssignment_5_17_2");
					put(grammarAccess.getContainerAccess().getLinksAssignment_5_18_2(), "rule__Container__LinksAssignment_5_18_2");
					put(grammarAccess.getContainerAccess().getMacAddressAssignment_5_19_1(), "rule__Container__MacAddressAssignment_5_19_1");
					put(grammarAccess.getContainerAccess().getMemoryAssignment_5_20_1(), "rule__Container__MemoryAssignment_5_20_1");
					put(grammarAccess.getContainerAccess().getMemorySwapAssignment_5_21_1(), "rule__Container__MemorySwapAssignment_5_21_1");
					put(grammarAccess.getContainerAccess().getDisableNetworkAssignment_5_22_1(), "rule__Container__DisableNetworkAssignment_5_22_1");
					put(grammarAccess.getContainerAccess().getNetworkModeAssignment_5_23_1(), "rule__Container__NetworkModeAssignment_5_23_1");
					put(grammarAccess.getContainerAccess().getPortBindingsAssignment_5_24_2(), "rule__Container__PortBindingsAssignment_5_24_2");
					put(grammarAccess.getContainerAccess().getPrivilegedAssignment_5_25_1(), "rule__Container__PrivilegedAssignment_5_25_1");
					put(grammarAccess.getContainerAccess().getPublishAllPortsAssignment_5_26_1(), "rule__Container__PublishAllPortsAssignment_5_26_1");
					put(grammarAccess.getContainerAccess().getReadonlyRootfsAssignment_5_27_1(), "rule__Container__ReadonlyRootfsAssignment_5_27_1");
					put(grammarAccess.getContainerAccess().getPidModeAssignment_5_28_1(), "rule__Container__PidModeAssignment_5_28_1");
					put(grammarAccess.getContainerAccess().getWorkingDirAssignment_5_29_1(), "rule__Container__WorkingDirAssignment_5_29_1");
					put(grammarAccess.getContainerAccess().getUserAssignment_5_30_1(), "rule__Container__UserAssignment_5_30_1");
					put(grammarAccess.getContainerAccess().getTtyAssignment_5_31_1(), "rule__Container__TtyAssignment_5_31_1");
					put(grammarAccess.getContainerAccess().getRestartPolicyAssignment_5_32_1(), "rule__Container__RestartPolicyAssignment_5_32_1");
					put(grammarAccess.getContainerAccess().getVolumesAssignment_5_33_2_1(), "rule__Container__VolumesAssignment_5_33_2_1");
					put(grammarAccess.getContainerAccess().getVolumesFromAssignment_5_34_2(), "rule__Container__VolumesFromAssignment_5_34_2");
					put(grammarAccess.getContainerAccess().getUlimitsAssignment_5_35_2(), "rule__Container__UlimitsAssignment_5_35_2");
					put(grammarAccess.getVolumesFromAccess().getContainerAssignment_1(), "rule__VolumesFrom__ContainerAssignment_1");
					put(grammarAccess.getVolumesFromAccess().getAccessModeAssignment_3(), "rule__VolumesFrom__AccessModeAssignment_3");
					put(grammarAccess.getRestartPolicyAccess().getValueAssignment_1_0(), "rule__RestartPolicy__ValueAssignment_1_0");
					put(grammarAccess.getRestartPolicyAccess().getValueAssignment_1_1_0(), "rule__RestartPolicy__ValueAssignment_1_1_0");
					put(grammarAccess.getRestartPolicyAccess().getMaximumRetryCountAssignment_1_1_1(), "rule__RestartPolicy__MaximumRetryCountAssignment_1_1_1");
					put(grammarAccess.getRestartPolicyAccess().getValueAssignment_1_2(), "rule__RestartPolicy__ValueAssignment_1_2");
					put(grammarAccess.getPortBindingAccess().getBindingAssignment_1(), "rule__PortBinding__BindingAssignment_1");
					put(grammarAccess.getPortBindingAccess().getExposedPortAssignment_2(), "rule__PortBinding__ExposedPortAssignment_2");
					put(grammarAccess.getBindingAccess().getHostIPAssignment_1(), "rule__Binding__HostIPAssignment_1");
					put(grammarAccess.getBindingAccess().getHostPortAssignment_3(), "rule__Binding__HostPortAssignment_3");
					put(grammarAccess.getLinkAccess().getContainerLinkAssignment_1(), "rule__Link__ContainerLinkAssignment_1");
					put(grammarAccess.getLinkAccess().getAliasAssignment_2_1(), "rule__Link__AliasAssignment_2_1");
					put(grammarAccess.getUlimitAccess().getNameAssignment_1(), "rule__Ulimit__NameAssignment_1");
					put(grammarAccess.getUlimitAccess().getSoftAssignment_2(), "rule__Ulimit__SoftAssignment_2");
					put(grammarAccess.getUlimitAccess().getHardAssignment_3(), "rule__Ulimit__HardAssignment_3");
					put(grammarAccess.getLabelAccess().getKeyAssignment_0(), "rule__Label__KeyAssignment_0");
					put(grammarAccess.getLabelAccess().getValueAssignment_1(), "rule__Label__ValueAssignment_1");
					put(grammarAccess.getExposedPortAccess().getPortAssignment_1(), "rule__ExposedPort__PortAssignment_1");
					put(grammarAccess.getExposedPortAccess().getProtocolAssignment_3(), "rule__ExposedPort__ProtocolAssignment_3");
					put(grammarAccess.getDeviceAccess().getCGroupPermissionsAssignment_1(), "rule__Device__CGroupPermissionsAssignment_1");
					put(grammarAccess.getDeviceAccess().getPathOnHostAssignment_2(), "rule__Device__PathOnHostAssignment_2");
					put(grammarAccess.getDeviceAccess().getPathInContainerAssignment_3(), "rule__Device__PathInContainerAssignment_3");
					put(grammarAccess.getBindAccess().getLocationAssignment_1(), "rule__Bind__LocationAssignment_1");
					put(grammarAccess.getBindAccess().getVolumeAssignment_3(), "rule__Bind__VolumeAssignment_3");
					put(grammarAccess.getBindAccess().getAccessMode1Assignment_4_1(), "rule__Bind__AccessMode1Assignment_4_1");
					put(grammarAccess.getVolumeAccess().getPathAssignment(), "rule__Volume__PathAssignment");
					put(grammarAccess.getDockerAccess().getUnorderedGroup_1(), "rule__Docker__UnorderedGroup_1");
					put(grammarAccess.getImageAccess().getUnorderedGroup_3(), "rule__Image__UnorderedGroup_3");
					put(grammarAccess.getContainerAccess().getUnorderedGroup_5(), "rule__Container__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalContainerParser typedParser = (InternalContainerParser) parser;
			typedParser.entryRuleDocker();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ContainerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ContainerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
