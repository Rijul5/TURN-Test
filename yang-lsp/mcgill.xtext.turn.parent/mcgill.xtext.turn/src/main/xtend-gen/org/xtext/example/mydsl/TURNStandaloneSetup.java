/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.TURNStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TURNStandaloneSetup extends TURNStandaloneSetupGenerated {
  public static void doSetup() {
    new TURNStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
