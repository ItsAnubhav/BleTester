// Generated by Dagger (https://dagger.dev).
package com.itsanubhav.bletester.di;

import android.content.Context;
import com.itsanubhav.bletester.blemanagers.MyBleManager;
import com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager;
import com.itsanubhav.bletester.blemanagers.slate.SlateBleManager;
import com.itsanubhav.bletester.blemanagers.tres.TresBleManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BleManagersModule_ProvidesMyBleManagerFactory implements Factory<MyBleManager> {
  private final Provider<Context> contextProvider;

  private final Provider<TresBleManager> tresBleManagerProvider;

  private final Provider<SlateBleManager> slateBleManagerProvider;

  private final Provider<BlazeBleManager> blazeBleManagerProvider;

  public BleManagersModule_ProvidesMyBleManagerFactory(Provider<Context> contextProvider,
      Provider<TresBleManager> tresBleManagerProvider,
      Provider<SlateBleManager> slateBleManagerProvider,
      Provider<BlazeBleManager> blazeBleManagerProvider) {
    this.contextProvider = contextProvider;
    this.tresBleManagerProvider = tresBleManagerProvider;
    this.slateBleManagerProvider = slateBleManagerProvider;
    this.blazeBleManagerProvider = blazeBleManagerProvider;
  }

  @Override
  public MyBleManager get() {
    return providesMyBleManager(contextProvider.get(), tresBleManagerProvider.get(), slateBleManagerProvider.get(), blazeBleManagerProvider.get());
  }

  public static BleManagersModule_ProvidesMyBleManagerFactory create(
      Provider<Context> contextProvider, Provider<TresBleManager> tresBleManagerProvider,
      Provider<SlateBleManager> slateBleManagerProvider,
      Provider<BlazeBleManager> blazeBleManagerProvider) {
    return new BleManagersModule_ProvidesMyBleManagerFactory(contextProvider, tresBleManagerProvider, slateBleManagerProvider, blazeBleManagerProvider);
  }

  public static MyBleManager providesMyBleManager(Context context, TresBleManager tresBleManager,
      SlateBleManager slateBleManager, BlazeBleManager blazeBleManager) {
    return Preconditions.checkNotNullFromProvides(BleManagersModule.INSTANCE.providesMyBleManager(context, tresBleManager, slateBleManager, blazeBleManager));
  }
}
