/**
 * generated by Xtext 2.12.0
 */
package mcgill.xtext.turn.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import mcgill.xtext.turn.TURNRuntimeModule;
import mcgill.xtext.turn.TURNStandaloneSetup;
import mcgill.xtext.turn.ide.TURNIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TURNIdeSetup extends TURNStandaloneSetup {
  @Override
  public Injector createInjector() {
    TURNRuntimeModule _tURNRuntimeModule = new TURNRuntimeModule();
    TURNIdeModule _tURNIdeModule = new TURNIdeModule();
    return Guice.createInjector(Modules2.mixin(_tURNRuntimeModule, _tURNIdeModule));
  }
}
