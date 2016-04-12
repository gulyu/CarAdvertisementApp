package hu.gulyu.caradvertisementapp;
import javax.inject.Singleton;

import dagger.Component;
import hu.gulyu.caradvertisementapp.interactor.InteractorModule;
import hu.gulyu.caradvertisementapp.interactor.UserInteractor;
import hu.gulyu.caradvertisementapp.model.ModelModule;
import hu.gulyu.caradvertisementapp.presenter.MainPresenter;
import hu.gulyu.caradvertisementapp.view.MainActivity;
import hu.gulyu.caradvertisementapp.view.ViewModule;
/**
 * Created by Péter on 2016.04.11..
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface CarAdvertisementApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(MainPresenter mainPresenter);

    void inject(UserInteractor stringInteractor);
}
