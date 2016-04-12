package hu.gulyu.caradvertisementapp.interactor;
import dagger.Module;
import dagger.Provides;
/**
 * Created by Péter on 2016.04.11..
 */
@Module
public class InteractorModule {
    @Provides
    public UserInteractor getUserInteractor() {
        return new UserInteractor();
    }
}
