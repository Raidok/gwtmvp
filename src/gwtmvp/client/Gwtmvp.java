package gwtmvp.client;

import gwtmvp.client.gin.GreetingGinjector;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwtmvp implements EntryPoint {
	private final GreetingGinjector ginjector = GWT.create(GreetingGinjector.class);

	@Override
	public void onModuleLoad() {

		DelayedBindRegistry.bind(ginjector);

		ginjector.getPlaceManager().revealCurrentPlace();
	}
}