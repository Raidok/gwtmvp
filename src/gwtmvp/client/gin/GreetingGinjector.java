package gwtmvp.client.gin;

import gwtmvp.client.mvp.AppPresenter;
import net.customware.gwt.dispatch.client.gin.StandardDispatchModule;
import net.customware.gwt.presenter.client.place.PlaceManager;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules({ GreetingClientModule.class, StandardDispatchModule.class })
public interface GreetingGinjector extends Ginjector {
	AppPresenter getAppPresenter();
	PlaceManager getPlaceManager();
}
