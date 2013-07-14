package gwtmvp.client.application.widget.header;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class HeaderView extends ViewImpl implements HeaderPresenter.MyView {

	private final Widget widget;
	
	@UiField SimplePanel loginSlot;
	@UiField Image loadingImage;

	public interface Binder extends UiBinder<Widget, HeaderView> {
	}

	@Inject
	public HeaderView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == HeaderPresenter.TYPE_SetNavLogin) {
			loginSlot.setWidget(content);
        }
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
