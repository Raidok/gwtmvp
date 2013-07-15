package gwtmvp.client.application.widget.header;

import gwtmvp.client.application.widget.navlogin.NavLoginPresenter;
import gwtmvp.client.application.widget.navuserinfo.NavUserInfoPresenter;
import gwtmvp.shared.dto.CurrentUserDto;
import gwtmvp.shared.event.CurrentUserChangeEvent;
import gwtmvp.shared.event.CurrentUserChangeEvent.CurrentUserChangeEventHandler;

import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.google.inject.Inject;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;

public class HeaderPresenter extends PresenterWidget<HeaderPresenter.MyView> 
		implements CurrentUserChangeEventHandler {

	public static final Type<RevealContentHandler<?>> TYPE_SetNavLogin = new Type<RevealContentHandler<?>>();
	
	private final NavLoginPresenter navLogin;
	private final NavUserInfoPresenter navUserInfo;
	private final CurrentUserDto currentUser;
	
	public interface MyView extends View {
	}

	@Inject
	public HeaderPresenter(final EventBus eventBus, final MyView view,
			final NavLoginPresenter navLogin,
			final NavUserInfoPresenter navUserInfo,
			final CurrentUserDto currentUser) {
		super(eventBus, view);
		this.navLogin = navLogin;
		this.navUserInfo = navUserInfo;
		this.currentUser = currentUser;
	}

	@Override
	protected void onBind() {
		super.onBind();
		addRegisteredHandler(CurrentUserChangeEvent.TYPE, this);
		updateLoginSlot(currentUser);
	}

	@Override
	public void onCurrentUserChange(CurrentUserChangeEvent event) {
		updateLoginSlot(event.getCurrentUser());
	}
	
	private void updateLoginSlot(CurrentUserDto currentUser) {
		if (!currentUser.isLoggedIn()) {
			setInSlot(TYPE_SetNavLogin, navLogin);
		} else {
			navUserInfo.getView().setHelloText("Hello, " + currentUser.getName() + "!");
			setInSlot(TYPE_SetNavLogin, navUserInfo);
		}
	}
}
