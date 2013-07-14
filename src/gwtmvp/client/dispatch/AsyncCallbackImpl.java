package gwtmvp.client.dispatch;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class AsyncCallbackImpl<T> implements AsyncCallback<T> {
    @Override
    public void onFailure(Throwable caught) {
        Window.alert("Communication to the server has failed.");
    }
}