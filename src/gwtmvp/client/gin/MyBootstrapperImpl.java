package gwtmvp.client.gin;

import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Bootstrapper;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class MyBootstrapperImpl implements Bootstrapper {

	private final PlaceManager placeManager;
	
	@Inject
    public MyBootstrapperImpl(PlaceManager placeManager) {
        this.placeManager = placeManager;
    }
	
	@Override
	public void onBootstrap() {
		// do some custom logic before revealing
		placeManager.revealCurrentPlace();
	}

}
