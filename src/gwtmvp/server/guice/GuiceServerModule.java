package gwtmvp.server.guice;

import gwtmvp.server.handler.SendGreetingHandler;
import gwtmvp.shared.rpc.SendGreeting;
import net.customware.gwt.dispatch.server.guice.ActionHandlerModule;

import org.apache.commons.logging.Log;

import com.google.inject.Singleton;

public class GuiceServerModule extends ActionHandlerModule {

	@Override
	protected void configureHandlers() {
		bindHandler(SendGreeting.class, SendGreetingHandler.class);
		bind(Log.class).toProvider(LogProvider.class).in(Singleton.class);
	}

}
