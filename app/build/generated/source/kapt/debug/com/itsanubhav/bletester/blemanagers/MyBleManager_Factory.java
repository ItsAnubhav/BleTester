// Generated by Dagger (https://dagger.dev).
package com.itsanubhav.bletester.blemanagers;

import android.content.Context;
import com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager;
import com.itsanubhav.bletester.blemanagers.slate.SlateBleManager;
import com.itsanubhav.bletester.blemanagers.tres.TresBleManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyBleManager_Factory implements Factory<MyBleManager> {
  private final Provider<Context> contextProvider;

  private final Provider<TresBleManager> tresBleManagerProvider;

  private final Provider<SlateBleManager> slateBleManagerProvider;

  private final Provider<BlazeBleManager> blazeBleManagerProvider;

  public MyBleManager_Factory(Provider<Context> contextProvider,
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
    return newInstance(contextProvider.get(), tresBleManagerProvider.get(), slateBleManagerProvider.get(), blazeBleManagerProvider.get());
  }

  public static MyBleManager_Factory create(Provider<Context> contextProvider,
      Provider<TresBleManager> tresBleManagerProvider,
      Provider<SlateBleManager> slateBleManagerProvider,
      Provider<BlazeBleManager> blazeBleManagerProvider) {
    return new MyBleManager_Factory(contextProvider, tresBleManagerProvider, slateBleManagerProvider, blazeBleManagerProvider);
  }

  public static MyBleManager newInstance(Context context, TresBleManager tresBleManager,
      SlateBleManager slateBleManager, BlazeBleManager blazeBleManager) {
    return new MyBleManager(context, tresBleManager, slateBleManager, blazeBleManager);
  }
}
