package com.itsanubhav.bletester.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J*\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0012\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/itsanubhav/bletester/di/BleManagersModule;", "", "()V", "providesBlazeBleManager", "Lcom/itsanubhav/bletester/blemanagers/blaze/BlazeBleManager;", "context", "Landroid/content/Context;", "providesMyBleManager", "Lcom/itsanubhav/bletester/blemanagers/MyBleManager;", "tresBleManager", "Lcom/itsanubhav/bletester/blemanagers/tres/TresBleManager;", "slateBleManager", "Lcom/itsanubhav/bletester/blemanagers/slate/SlateBleManager;", "blazeBleManager", "providesSlateBleManager", "providesTresBleManger", "app_debug"})
@dagger.Module()
public final class BleManagersModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.itsanubhav.bletester.di.BleManagersModule INSTANCE = null;
    
    private BleManagersModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.itsanubhav.bletester.blemanagers.tres.TresBleManager providesTresBleManger(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.itsanubhav.bletester.blemanagers.slate.SlateBleManager providesSlateBleManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager providesBlazeBleManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.itsanubhav.bletester.blemanagers.MyBleManager providesMyBleManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.blemanagers.tres.TresBleManager tresBleManager, @org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.blemanagers.slate.SlateBleManager slateBleManager, @org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager blazeBleManager) {
        return null;
    }
}