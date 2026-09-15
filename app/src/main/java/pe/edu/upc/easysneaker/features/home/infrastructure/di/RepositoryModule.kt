package pe.edu.upc.easysneaker.features.home.infrastructure.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pe.edu.upc.easysneaker.features.home.domain.ProductRepository
import pe.edu.upc.easysneaker.features.home.infrastructure.repositories.ProductRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun provideProductRepository(impl: ProductRepositoryImpl): ProductRepository
}