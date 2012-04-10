package gwtmvp.client.gin;

import gwtmvp.client.mvp.HomePresenter;
import gwtmvp.client.mvp.LayoutPresenter;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

@GinModules({ MyClientModule.class, DispatchAsyncModule.class })
public interface MyGinjector extends Ginjector {
	EventBus getEventBus();
	PlaceManager getPlaceManager();
	Provider<LayoutPresenter> getLayoutPresPresenter();
	Provider<HomePresenter> getHomePresenter();
}
