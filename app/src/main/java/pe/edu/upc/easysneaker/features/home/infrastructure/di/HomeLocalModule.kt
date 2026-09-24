package pe.edu.upc.easysneaker.features.home.infrastructure.di

import android.content.Context
import androidx.room3.Room
import androidx.sqlite.driver.AndroidSQLiteDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import pe.edu.upc.easysneaker.features.home.infrastructure.local.AppDatabase
import pe.edu.upc.easysneaker.features.home.infrastructure.local.ProductDao
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object HomeLocalModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room
            .databaseBuilder<AppDatabase>(context, "easysneaker-database")
            .setDriver(AndroidSQLiteDriver())
            .build()
    }

    @Provides
    @Singleton
    fun provideProductDao(appDatabase: AppDatabase): ProductDao {
        return appDatabase.productDao()
    }
}