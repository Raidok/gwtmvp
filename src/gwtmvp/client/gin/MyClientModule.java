package gwtmvp.client.gin;

import gwtmvp.client.dispatch.CachingDispatchAsync;
import gwtmvp.client.mvp.LayoutPresenter;
import gwtmvp.client.mvp.LayoutView;
import gwtmvp.client.mvp.MyPlaceManager;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class MyClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(MyPlaceManager.class));

		bindPresenter(LayoutPresenter.class,
				LayoutPresenter.MyView.class,
				LayoutView.class,
				LayoutPresenter.MyProxy.class);

		bind(CachingDispatchAsync.class).in(Singleton.class);
	}

}
