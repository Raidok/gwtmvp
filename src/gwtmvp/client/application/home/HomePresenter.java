package gwtmvp.client.application.home;
import gwtmvp.client.NameTokens;
import gwtmvp.client.application.ApplicationPresenter;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class HomePresenter extends Presenter<HomePresenter.MyView, HomePresenter.MyProxy>{

	public interface MyView extends View {
	}

	@ProxyStandard
	@NameToken(NameTokens.home)
	public interface MyProxy extends ProxyPlace<HomePresenter> {
	}

	@Inject
	public HomePresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ApplicationPresenter.TYPE_SetContent, this);
	}
}
