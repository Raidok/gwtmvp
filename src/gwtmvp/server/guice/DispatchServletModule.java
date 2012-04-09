package gwtmvp.server.guice;

import com.google.inject.servlet.ServletModule;
import com.gwtplatform.dispatch.server.guice.DispatchServiceImpl;

public class DispatchServletModule extends ServletModule {

	@Override
	protected void configureServlets() {
		super.configureServlets();
		serve("/gwtmvp/dispatch").with(DispatchServiceImpl.class);
	}

}
