package gwtmvp.client.mvp;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class LayoutView extends ViewImpl implements LayoutPresenter.MyView {

	private static LayoutViewUiBinder uiBinder = GWT.create(LayoutViewUiBinder.class);

	interface LayoutViewUiBinder extends UiBinder<Widget, LayoutView> {
	}

	public final Widget widget;

	public LayoutView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@UiField
	HTMLPanel headerPanel;
	@UiField
	HTMLPanel menuPanel;
	@UiField
	HTMLPanel contentPanel;
	@UiField
	HTMLPanel footerPanel;

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public void setInSlot(Object slot, Widget content) {
		Log.info("setInSlot");
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
