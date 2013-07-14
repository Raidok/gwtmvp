package gwtmvp.client.gin;

import gwtmvp.client.MyPlaceManager;
import gwtmvp.client.application.AdminPresenter;
import gwtmvp.client.application.AdminView;
import gwtmvp.client.application.ErrorPresenter;
import gwtmvp.client.application.ErrorView;
import gwtmvp.client.application.HomePresenter;
import gwtmvp.client.application.HomeView;
import gwtmvp.client.application.LayoutPresenter;
import gwtmvp.client.application.LayoutView;
import gwtmvp.client.resources.Resources;
import gwtmvp.shared.dto.CurrentUserDto;

import com.google.gwt.resources.client.CssResource;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class MyClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(MyPlaceManager.class));
		install(new DispatchAsyncModule.Builder().build());
		
		bindPresenter(LayoutPresenter.class, LayoutPresenter.MyView.class,
				LayoutView.class, LayoutPresenter.MyProxy.class);
		bindPresenter(HomePresenter.class, HomePresenter.MyView.class,
				HomeView.class, HomePresenter.MyProxy.class);
		bindPresenter(AdminPresenter.class, AdminPresenter.MyView.class,
				AdminView.class, AdminPresenter.MyProxy.class);
		bindPresenter(ErrorPresenter.class, ErrorPresenter.MyView.class,
				ErrorView.class, ErrorPresenter.MyProxy.class);
		
		bind(CurrentUserDto.class).asEagerSingleton();
	}

	@Inject
	@Provides CssResource getCss(final Resources resources) {
		CssResource style = resources.css();
		style.ensureInjected();
		return style;
	}

}
