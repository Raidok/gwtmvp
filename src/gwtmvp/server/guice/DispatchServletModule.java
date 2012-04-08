package gwtmvp.server.guice;

import gwtmvp.server.DispatchServlet;

import com.google.inject.servlet.ServletModule;

public class DispatchServletModule extends ServletModule {

	@Override
	protected void configureServlets() {
		super.configureServlets();
		serve("/gwtmvp/dispatch").with(DispatchServlet.class);
	}

}
