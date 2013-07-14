package gwtmvp.server.guice;

import gwtmvp.server.handler.LogInHandler;
import gwtmvp.shared.rpc.LogInAction;

import org.apache.commons.logging.Log;

import com.google.inject.Singleton;
import com.gwtplatform.dispatch.server.guice.HandlerModule;

public class GuiceServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {
		bindHandler(LogInAction.class, LogInHandler.class);
		bind(Log.class).toProvider(LogProvider.class).in(Singleton.class);
	}

}
