/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.docker.language;

import org.eclipse.docker.language.ContainerStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ContainerStandaloneSetup extends ContainerStandaloneSetupGenerated {
  public static void doSetup() {
    ContainerStandaloneSetup _containerStandaloneSetup = new ContainerStandaloneSetup();
    _containerStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}