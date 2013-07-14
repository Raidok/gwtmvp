package gwtmvp.client.application;

import gwtmvp.client.resources.Resources;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {

	public interface Binder extends UiBinder<Widget, ApplicationView> {
	}

	private final Widget widget;

	@UiField(provided = true) final Resources resources;
	@UiField HTMLPanel contentPanel;
	@UiField Image loadingImage;

	@Inject
	public ApplicationView(final Binder binder, final Resources resources) {
		this.resources = resources;
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == ApplicationPresenter.TYPE_SetContent) {
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