package app.concertor.injection.modules

import app.concertor.interactor.events.GetEventsUseCase
import app.concertor.sections.home.HomeProcessor
import app.concertor.sections.home.HomeViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

    @Provides
    fun provideHomeProcessor(getEventsUseCase: GetEventsUseCase): HomeProcessor {
        return HomeProcessor(getEventsUseCase)
    }

    @Provides
    fun provideHomeViewModelFactory(
            homeProcessor: HomeProcessor
    ) = HomeViewModelFactory(homeProcessor)
}
