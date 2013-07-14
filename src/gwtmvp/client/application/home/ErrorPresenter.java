package gwtmvp.client.application.home;

import gwtmvp.client.NameTokens;
import gwtmvp.client.application.ApplicationPresenter;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class ErrorPresenter extends
Presenter<ErrorPresenter.MyView, ErrorPresenter.MyProxy> {

	public interface MyView extends View {
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.error)
	public interface MyProxy extends ProxyPlace<ErrorPresenter> {
	}

	@Inject
	public ErrorPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ApplicationPresenter.TYPE_SetContent, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}
}
