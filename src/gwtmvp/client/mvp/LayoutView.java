package gwtmvp.client.mvp;

import gwtmvp.client.resources.Resources;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class LayoutView extends ViewImpl implements LayoutPresenter.MyView {

	public interface Binder extends UiBinder<Widget, LayoutView> {
	}

	private final Widget widget;

	@UiField(provided = true) final Resources resources;
	@UiField HTMLPanel contentPanel;
	@UiField Image loadingImage;

	@Inject
	public LayoutView(final Binder binder, final Resources resources) {
		this.resources = resources;
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

	@Override
	public void showLoading(boolean visible) {
		loadingImage.setVisible(visible);
	}
}
