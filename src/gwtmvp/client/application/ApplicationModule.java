package gwtmvp.client.application;

import gwtmvp.client.application.admin.AdminModule;
import gwtmvp.client.application.home.HomeModule;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new HomeModule());
		install(new AdminModule());
		
		bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class,
				ApplicationView.class, ApplicationPresenter.MyProxy.class);
	}

}
