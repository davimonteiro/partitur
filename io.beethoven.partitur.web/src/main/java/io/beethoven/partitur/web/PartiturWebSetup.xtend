/*
 * generated by Xtext 2.12.0
 */
package io.beethoven.partitur.web

import com.google.inject.Guice
import com.google.inject.Injector
import io.beethoven.partitur.PartiturRuntimeModule
import io.beethoven.partitur.PartiturStandaloneSetup
import io.beethoven.partitur.ide.PartiturIdeModule
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages in web applications.
 */
class PartiturWebSetup extends PartiturStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PartiturRuntimeModule, new PartiturIdeModule, new PartiturWebModule))
	}
	
}