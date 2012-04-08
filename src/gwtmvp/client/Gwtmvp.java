package gwtmvp.client;

import gwtmvp.client.gin.GreetingGinjector;
import gwtmvp.client.mvp.AppPresenter;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwtmvp implements EntryPoint {
	private final GreetingGinjector injector = GWT.create(GreetingGinjector.class);

	@Override
	public void onModuleLoad() {
		final AppPresenter appPresenter = injector.getAppPresenter();
		appPresenter.go(RootPanel.get());

		injector.getPlaceManager().fireCurrentPlace();
	}
}