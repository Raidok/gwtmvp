package gwtmvp.client.mvp;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class LayoutView extends ViewImpl implements LayoutPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, LayoutView> {
	}

	@UiField HTMLPanel headerPanel;
	@UiField HTMLPanel menuPanel;
	@UiField HTMLPanel contentPanel;
	@UiField HTMLPanel footerPanel;

	@Inject
	public LayoutView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == LayoutPresenter.TYPE_SetContent) {
			contentPanel.clear();

			if (content != null) {
				contentPanel.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}
}
