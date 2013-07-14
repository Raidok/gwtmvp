package gwtmvp.server.handler;

import gwtmvp.shared.dto.CurrentUserDto;
import gwtmvp.shared.rpc.LogInAction;
import gwtmvp.shared.rpc.LogInResult;

import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class LogInHandler implements ActionHandler<LogInAction, LogInResult> {

	@Inject
	public LogInHandler() {
	}

	@Override
	public LogInResult execute(final LogInAction action,
			final ExecutionContext context) throws ActionException {
		
		final String name = action.getEmail().substring(0, action.getEmail().indexOf('@'));

		return new LogInResult(new CurrentUserDto(name, true));
	}

	@Override
	public void undo(LogInAction action, LogInResult result,
			ExecutionContext context) throws ActionException {
		// Nothing to do here

	}

	@Override
	public Class<LogInAction> getActionType() {
		return LogInAction.class;
	}
}