package gwtmvp.client.mvp;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AppPresenter {
	private HasWidgets container;
	private GreetingPresenter greetingPresenter;

	@Inject
	public AppPresenter(final GreetingPresenter greetingPresenter) {
		this.greetingPresenter = greetingPresenter;
	}

	private void showMain() {
		container.clear();
		container.add(greetingPresenter.getDisplay().asWidget());
	}

	public void go(final HasWidgets container) {
		this.container = container;

		showMain();
	}
}