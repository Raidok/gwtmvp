package gwtmvp.client.gin;

import gwtmvp.client.dispatch.CachingDispatchAsync;
import gwtmvp.client.mvp.AppPresenter;
import gwtmvp.client.mvp.GreetingPresenter;
import gwtmvp.client.mvp.GreetingResponsePresenter;
import gwtmvp.client.mvp.GreetingResponseView;
import gwtmvp.client.mvp.GreetingView;
import net.customware.gwt.presenter.client.DefaultEventBus;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.gin.AbstractPresenterModule;

import com.google.inject.Singleton;

public class GreetingClientGin extends AbstractPresenterModule {

	@Override
	protected void configure() {
		bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);

		bindPresenter(GreetingPresenter.class, GreetingPresenter.Display.class, GreetingView.class);
		bindPresenter(GreetingResponsePresenter.class, GreetingResponsePresenter.Display.class, GreetingResponseView.class);

		bind(AppPresenter.class).in(Singleton.class);
		bind(CachingDispatchAsync.class).in(Singleton.class);
	}

}
