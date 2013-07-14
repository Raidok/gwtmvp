package gwtmvp.client.gin;

import gwtmvp.client.MyPlaceManager;
import gwtmvp.client.application.ApplicationModule;
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
		install(new ApplicationModule());

		bind(CurrentUserDto.class).asEagerSingleton();
	}

	@Inject
	@Provides CssResource getCss(final Resources resources) {
		CssResource style = resources.css();
		style.ensureInjected();
		return style;
	}

}
