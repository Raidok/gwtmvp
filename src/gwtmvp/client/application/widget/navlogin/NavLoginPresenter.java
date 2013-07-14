package gwtmvp.client.application.widget.navlogin;

import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class NavLoginPresenter extends
		PresenterWidget<NavLoginPresenter.MyView> {

	public interface MyView extends View {
	}

	@Inject
	public NavLoginPresenter(final EventBus eventBus, final MyView view) {
		super(eventBus, view);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}
}
