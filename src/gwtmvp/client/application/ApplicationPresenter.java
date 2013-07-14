package gwtmvp.client.application;

import gwtmvp.client.application.widget.header.HeaderPresenter;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class ApplicationPresenter extends
Presenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy> {

	public static final Type<RevealContentHandler<?>> TYPE_SetHeader = new Type<RevealContentHandler<?>>();
	@ContentSlot
	public static final Type<RevealContentHandler<?>> TYPE_SetContent = new Type<RevealContentHandler<?>>();

	private final HeaderPresenter header;
	
	public interface MyView extends View {
	}

	@ProxyStandard
	public interface MyProxy extends Proxy<ApplicationPresenter> {
	}

	@Inject
	public ApplicationPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy, final HeaderPresenter header) {
		super(eventBus, view, proxy);
		this.header = header;
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		setInSlot(TYPE_SetHeader, header);
	}
}
