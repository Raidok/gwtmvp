package gwtmvp.client.application.admin;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class AdminView extends ViewImpl implements AdminPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, AdminView> {
	}

	@Inject
	public AdminView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
