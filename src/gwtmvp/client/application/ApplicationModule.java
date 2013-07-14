package gwtmvp.client.application;

import gwtmvp.client.application.admin.AdminModule;
import gwtmvp.client.application.home.HomeModule;
import gwtmvp.client.application.widget.WidgetModule;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new HomeModule());
		install(new AdminModule());
		install(new WidgetModule());
		
		bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class,
				ApplicationView.class, ApplicationPresenter.MyProxy.class);
	}

}
