package gwtmvp.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

@GinModules({ GreetingClientModule.class, DispatchAsyncModule.class })
public interface GreetingGinjector extends Ginjector {
	PlaceManager getPlaceManager();
}
