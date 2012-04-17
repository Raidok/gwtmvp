package gwtmvp.client.gin;

import gwtmvp.client.MyPlaceManager;
import gwtmvp.client.dispatch.CachingDispatchAsync;
import gwtmvp.client.mvp.AdminPresenter;
import gwtmvp.client.mvp.AdminView;
import gwtmvp.client.mvp.ErrorPresenter;
import gwtmvp.client.mvp.ErrorView;
import gwtmvp.client.mvp.HomePresenter;
import gwtmvp.client.mvp.HomeView;
import gwtmvp.client.mvp.LayoutPresenter;
import gwtmvp.client.mvp.LayoutView;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class MyClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(MyPlaceManager.class));
		bind(CachingDispatchAsync.class).in(Singleton.class);

		bindPresenter(LayoutPresenter.class, LayoutPresenter.MyView.class,
				LayoutView.class, LayoutPresenter.MyProxy.class);
		bindPresenter(HomePresenter.class, HomePresenter.MyView.class,
				HomeView.class, HomePresenter.MyProxy.class);
		bindPresenter(AdminPresenter.class, AdminPresenter.MyView.class,
				AdminView.class, AdminPresenter.MyProxy.class);
		bindPresenter(ErrorPresenter.class, ErrorPresenter.MyView.class,
				ErrorView.class, ErrorPresenter.MyProxy.class);
	}

}
