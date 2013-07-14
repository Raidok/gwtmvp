package gwtmvp.client.gin;

import gwtmvp.client.MyPlaceManager;
import gwtmvp.client.application.ApplicationModule;
import gwtmvp.shared.dto.CurrentUserDto;

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

}
