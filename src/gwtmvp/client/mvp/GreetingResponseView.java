package gwtmvp.client.mvp;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class GreetingResponseView extends ViewImpl implements GreetingResponsePresenter.MyView {
	private final Label textToServerLabel;
	private final HTML serverResponseLabel;
	private final Button closeButton;
	private final DialogBox dialog;

	public GreetingResponseView() {
		dialog = new DialogBox();
		dialog.setText("Remote Procedure Call");
		dialog.setAnimationEnabled(true);

		closeButton = new Button("Close");

		// We can set the id of a widget by accessing its Element
		closeButton.getElement().setId("closeButton");

		textToServerLabel = new Label();
		serverResponseLabel = new HTML();

		final VerticalPanel dialogVPanel = new VerticalPanel();

		dialogVPanel.addStyleName("dialogVPanel");
		dialogVPanel.add(new HTML("Sending name to the server:"));
		dialogVPanel.add(textToServerLabel);
		dialogVPanel.add(new HTML("Server replies:"));
		dialogVPanel.add(serverResponseLabel);
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		dialogVPanel.add(closeButton);

		dialog.setWidget(dialogVPanel);
	}

	@Override
	public HasText getTextToServer() {
		return textToServerLabel;
	}

	@Override
	public HasHTML getServerResponse() {
		return serverResponseLabel;
	}

	@Override
	public HasClickHandlers getClose() {
		return closeButton;
	}

	@Override
	public DialogBox getDialogBox() {
		return dialog;
	}

	/**
	 * Returns this widget as the {@link WidgetDisplay#asWidget()} value.
	 */
	@Override
	public Widget asWidget() {
		return dialog;
	}
}