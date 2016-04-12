package hu.gulyu.caradvertisementapp;
import android.app.Application;
import hu.gulyu.caradvertisementapp.view.ViewModule;

/**
 * Created by Péter on 2016.04.11..
 */
public class CarAdvertisementApplication extends Application {
    public static CarAdvertisementApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerCarAdvertisementApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
