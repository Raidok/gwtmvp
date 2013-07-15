package gwtmvp.client.application.widget;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import gwtmvp.client.application.widget.header.HeaderModule;
import gwtmvp.client.application.widget.navlogin.NavLoginModule;
import gwtmvp.client.application.widget.navuserinfo.NavUserInfoModule;

public class WidgetModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new HeaderModule());
		install(new NavLoginModule());
		install(new NavUserInfoModule());
	}

}
