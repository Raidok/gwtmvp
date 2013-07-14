package gwtmvp.client.application.widget;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import gwtmvp.client.application.widget.header.HeaderModule;
import gwtmvp.client.application.widget.navlogin.NavLoginModule;

public class WidgetModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new HeaderModule());
		install(new NavLoginModule());
	}

}
