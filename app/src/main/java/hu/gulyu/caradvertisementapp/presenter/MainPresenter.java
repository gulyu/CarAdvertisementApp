package hu.gulyu.caradvertisementapp.presenter;
import javax.inject.Inject;

import hu.gulyu.caradvertisementapp.CarAdvertisementApplication;
import hu.gulyu.caradvertisementapp.interactor.UserInteractor;
import hu.gulyu.caradvertisementapp.view.MainView;
/**
 * Created by Péter on 2016.04.11..
 */
public class MainPresenter extends Presenter<MainView>{
    @Inject
    public UserInteractor userInteractor;

    public MainPresenter() {
        CarAdvertisementApplication.injector.inject(this);
    }

    public void getUserData(){
        view.showUserData(userInteractor.getName(), userInteractor.getPassword());
    }

    public void setUserData(){
        userInteractor.setName(view.getUserName());
        userInteractor.setPassword(view.getPassword());
    }
}
