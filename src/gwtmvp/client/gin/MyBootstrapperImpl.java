package gwtmvp.client.gin;

import gwtmvp.client.gin.MyGinjector;

import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Bootstrapper;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class MyBootstrapperImpl implements Bootstrapper {

	private final PlaceManager placeManager;
	private final MyGinjector ginjector;
	
	@Inject
    public MyBootstrapperImpl(PlaceManager placeManager, MyGinjector ginjector) {
        this.placeManager = placeManager;
        this.ginjector = ginjector;
    }
	
	@Override
	public void onBootstrap() {
		ginjector.getCss();
		placeManager.revealCurrentPlace();
	}

}
