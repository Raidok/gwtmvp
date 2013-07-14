package gwtmvp.client.application.widget.navlogin;

import com.gwtplatform.mvp.client.UiHandlers;

public interface NavLoginUiHandlers extends UiHandlers {
	void onSignInClick(String email, String password);
}
