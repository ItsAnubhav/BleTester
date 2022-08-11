package com.itsanubhav.bletester.di

import android.content.Context
import com.itsanubhav.bletester.blemanagers.MyBleManager
import com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager
import com.itsanubhav.bletester.blemanagers.slate.SlateBleManager
import com.itsanubhav.bletester.blemanagers.tres.TresBleManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BleManagersModule {

    @Provides
    fun providesTresBleManger(@ApplicationContext context: Context) : TresBleManager{
        return TresBleManager(context)
    }

    @Provides
    fun providesSlateBleManager(@ApplicationContext context: Context) : SlateBleManager{
        return SlateBleManager(context)
    }

    @Provides
    fun providesBlazeBleManager(@ApplicationContext context: Context): BlazeBleManager {
        return BlazeBleManager(context)
    }

    @Provides
    fun providesMyBleManager(
        @ApplicationContext context: Context,
        tresBleManager : TresBleManager,
        slateBleManager: SlateBleManager,
        blazeBleManager: BlazeBleManager
    ) : MyBleManager{
        return MyBleManager(context,tresBleManager,slateBleManager,blazeBleManager)
    }

}