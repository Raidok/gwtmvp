package gwtmvp.client.application.widget.navlogin;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class NavLoginView extends ViewImpl implements NavLoginPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, NavLoginView> {
	}

	@Inject
	public NavLoginView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
