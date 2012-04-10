package gwtmvp.client.gin;

import gwtmvp.client.mvp.GreetingPresenter;
import gwtmvp.client.mvp.GreetingResponsePresenter;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

@GinModules({ GreetingClientModule.class, DispatchAsyncModule.class })
public interface GreetingGinjector extends Ginjector {
	EventBus getEventBus();
	PlaceManager getPlaceManager();
	Provider<GreetingPresenter> getGreetingPresenter();
	AsyncProvider<GreetingResponsePresenter> getGreetingResponsePresenter();
}
