package pe.edu.upc.easysneaker.features.auth.infrastructure.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.edu.upc.easysneaker.features.auth.domain.AuthRepository
import pe.edu.upc.easysneaker.features.auth.infrastructure.repositories.AuthRepositoryImpl


@Module
@InstallIn(SingletonComponent::class)
interface AuthRepositoryModule {

    @Binds
    fun provideAuthRepository(impl: AuthRepositoryImpl): AuthRepository
}