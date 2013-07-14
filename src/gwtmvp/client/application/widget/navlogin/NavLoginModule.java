package gwtmvp.client.application.widget.navlogin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class NavLoginModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		bindSingletonPresenterWidget(NavLoginPresenter.class,
				NavLoginPresenter.MyView.class, NavLoginView.class);
	}

}
