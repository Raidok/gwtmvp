package gwtmvp.client.application.widget.navlogin;

import gwtmvp.client.dispatch.AsyncCallbackImpl;
import gwtmvp.shared.dto.CurrentUserDto;
import gwtmvp.shared.event.CurrentUserChangeEvent;
import gwtmvp.shared.rpc.LogInAction;
import gwtmvp.shared.rpc.LogInResult;

import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class NavLoginPresenter extends
		PresenterWidget<NavLoginPresenter.MyView> implements NavLoginUiHandlers {

	private final DispatchAsync dispatch;
	private final CurrentUserDto currentUser;
	
	
	public interface MyView extends View, HasUiHandlers<NavLoginUiHandlers> {
	}

	@Inject
	public NavLoginPresenter(final EventBus eventBus, final MyView view, final DispatchAsync dispatch,
			final CurrentUserDto currentUser) {
		super(eventBus, view);
		this.dispatch = dispatch;
		this.currentUser = currentUser;
		getView().setUiHandlers(this);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}

	@Override
	public void onSignInClick(String email, String password) {
		dispatch.execute(new LogInAction(email, password), new AsyncCallbackImpl<LogInResult>() {

			@Override
			public void onSuccess(LogInResult result) {
				currentUser.copyFrom(result.getCurrentUser());
				CurrentUserChangeEvent.fire(NavLoginPresenter.this, result.getCurrentUser());
			}
		});
	}
}
