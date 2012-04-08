package gwtmvp.client.gin;

import gwtmvp.client.mvp.AppPresenter;
import net.customware.gwt.presenter.client.place.PlaceManager;

import com.google.gwt.inject.client.Ginjector;

public interface GreetingGinjector extends Ginjector {
	AppPresenter getAppPresenter();
	PlaceManager getPlaceManager();
}
