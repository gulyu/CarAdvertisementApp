package hu.gulyu.caradvertisementapp.model;
import dagger.Module;
import dagger.Provides;
/**
 * Created by Péter on 2016.04.11..
 */
@Module
public class ModelModule {
    @Provides
    public UserModel getUserModel() {return new UserModel();}
}
