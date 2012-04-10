package gwtmvp.client.gin;

import gwtmvp.client.dispatch.CachingDispatchAsync;
import gwtmvp.client.mvp.MainPresenter;
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

		bindPresenter(MainPresenter.class,
				MainPresenter.MyView.class,
				GreetingView.class,
				MainPresenter.MyProxy.class);
		bindPresenter(GreetingResponsePresenter.class,
				GreetingResponsePresenter.MyView.class,
				GreetingResponseView.class,
				GreetingResponsePresenter.MyProxy.class);

		bind(CachingDispatchAsync.class).in(Singleton.class);
	}

}
