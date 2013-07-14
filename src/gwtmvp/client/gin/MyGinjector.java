package gwtmvp.client.gin;

import gwtmvp.client.security.LoggedInGatekeeper;
import gwtmvp.client.application.AdminPresenter;
import gwtmvp.client.application.ErrorPresenter;
import gwtmvp.client.application.HomePresenter;
import gwtmvp.client.application.LayoutPresenter;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.resources.client.CssResource;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

@GinModules({ MyClientModule.class })
public interface MyGinjector extends Ginjector {
	EventBus getEventBus();
	PlaceManager getPlaceManager();
	CssResource getCss();
	LoggedInGatekeeper getLoggedInGatekeeper();
	Provider<LayoutPresenter> getLayoutPresenter();
	Provider<HomePresenter> getHomePresenter();
	AsyncProvider<AdminPresenter> getAdminPresenter();
	AsyncProvider<ErrorPresenter> getErrorPresenter();
}
