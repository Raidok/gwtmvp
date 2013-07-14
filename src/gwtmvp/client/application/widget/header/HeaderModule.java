package gwtmvp.client.application.widget.header;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import gwtmvp.client.application.widget.header.HeaderPresenter;
import gwtmvp.client.application.widget.header.HeaderView;

public class HeaderModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		bindSingletonPresenterWidget(HeaderPresenter.class,
				HeaderPresenter.MyView.class, HeaderView.class);
	}

}
