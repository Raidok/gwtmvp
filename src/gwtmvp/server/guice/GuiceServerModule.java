package gwtmvp.server.guice;

import gwtmvp.server.handler.SendGreetingHandler;
import gwtmvp.shared.rpc.SendGreeting;
import net.customware.gwt.dispatch.server.guice.ActionHandlerModule;

public class GuiceServerModule extends ActionHandlerModule {

	@Override
	protected void configureHandlers() {
		bindHandler(SendGreeting.class, SendGreetingHandler.class);
	}

}
