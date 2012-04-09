package gwtmvp.server;

import net.customware.gwt.dispatch.server.Dispatch;
import net.customware.gwt.dispatch.server.guice.GuiceStandardDispatchServlet;
import net.customware.gwt.dispatch.shared.Action;
import net.customware.gwt.dispatch.shared.ActionException;
import net.customware.gwt.dispatch.shared.DispatchException;
import net.customware.gwt.dispatch.shared.Result;

import org.mortbay.log.Log;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DispatchServlet extends GuiceStandardDispatchServlet {

	private static final long serialVersionUID = 4767502888712998380L;

	@Inject
	public DispatchServlet(final Dispatch dispatch) {
		super(dispatch);
	}

	@Override
	public Result execute(Action<?> action) throws DispatchException {
		try {
			Log.info("executing:"+action.getClass().getName());
			final Result result = super.execute(action);
			Log.info("finished:"+action.getClass().getName());
			return result;
		} catch (final ActionException ae) {
			Log.warn("ActionException: " + ae.getMessage());
			ae.printStackTrace();
			throw ae;
		} catch (final Exception e) {
			Log.warn("Unexpected exception: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
