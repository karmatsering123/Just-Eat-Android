package myapp.tae.ac.uk.justeattest.DI.components;

import dagger.Component;
import myapp.tae.ac.uk.justeattest.DI.modules.APIModule;
import myapp.tae.ac.uk.justeattest.DI.scopes.ActivityScope;
import myapp.tae.ac.uk.justeattest.Interfaces.DataServiceInterface;
import myapp.tae.ac.uk.justeattest.MainActivity;
import myapp.tae.ac.uk.justeattest.Presenters.DataService;

/**
 * Created by Karma on 20/06/16.
 */
@ActivityScope
@Component(dependencies = NetComponent.class, modules = APIModule.class)
public interface APIComponent {
    void inject(DataService dataService);
}
