package gwtmvp.client.application.widget.navlogin;

import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class NavLoginView extends ViewWithUiHandlers<NavLoginUiHandlers> implements NavLoginPresenter.MyView {

	private final Widget widget;
	@UiField HasText emailField;
	@UiField HasText passwordField;
	@UiField HasClickHandlers signInButton;
	
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
	
	@UiHandler("signInButton")
    public void onSignInClick(ClickEvent event) {
		if (getUiHandlers() != null) {
			getUiHandlers().onSignInClick(emailField.getText(), passwordField.getText());
		}
    }
}
