package gwtmvp.client.gin;

import gwtmvp.client.dispatch.CachingDispatchAsync;
import gwtmvp.client.mvp.AppPresenter;
import gwtmvp.client.mvp.GreetingPresenter;
import gwtmvp.client.mvp.GreetingResponsePresenter;
import gwtmvp.client.mvp.GreetingResponseView;
import gwtmvp.client.mvp.GreetingView;
import gwtmvp.client.mvp.MyPlaceManager;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class GreetingClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(MyPlaceManager.class));

		bindPresenter(GreetingPresenter.class,
				GreetingPresenter.MyView.class,
				GreetingView.class,
				GreetingPresenter.MyProxy.class);
		bindPresenter(GreetingResponsePresenter.class,
				GreetingResponsePresenter.MyView.class,
				GreetingResponseView.class,
				GreetingResponsePresenter.MyProxy.class);

		bind(AppPresenter.class).in(Singleton.class);
		bind(CachingDispatchAsync.class).in(Singleton.class);
	}

}
