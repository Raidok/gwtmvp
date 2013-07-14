package gwtmvp.client.application.widget.header;

import gwtmvp.client.application.widget.navlogin.NavLoginPresenter;

import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.google.inject.Inject;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;

public class HeaderPresenter extends PresenterWidget<HeaderPresenter.MyView> {

	public static final Type<RevealContentHandler<?>> TYPE_SetNavLogin = new Type<RevealContentHandler<?>>();
	private final NavLoginPresenter navLogin;
	
	public interface MyView extends View {
	}

	@Inject
	public HeaderPresenter(final EventBus eventBus, final MyView view,
			final NavLoginPresenter navLogin) {
		super(eventBus, view);
		this.navLogin = navLogin;
	}

	@Override
	protected void onBind() {
		super.onBind();
		setInSlot(TYPE_SetNavLogin, navLogin);
	}
}
