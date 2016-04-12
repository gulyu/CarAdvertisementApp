package hu.gulyu.caradvertisementapp.interactor;
import javax.inject.Inject;

import hu.gulyu.caradvertisementapp.CarAdvertisementApplication;
import hu.gulyu.caradvertisementapp.model.UserModel;
/**
 * Created by Péter on 2016.04.11..
 */
public class UserInteractor {
    @Inject
    UserModel model;

    public UserInteractor() {
        CarAdvertisementApplication.injector.inject(this);
    }

    public String getName() {
        return model.getName();
    }

    public String getPassword() {
        return model.getPassword();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void setPassword(String password) {
        model.setPassword(password);
    }
}
