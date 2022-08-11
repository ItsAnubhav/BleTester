// Generated by Dagger (https://dagger.dev).
package com.itsanubhav.bletester.di;

import android.content.Context;
import com.itsanubhav.bletester.blemanagers.slate.SlateBleManager;
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
public final class BleManagersModule_ProvidesSlateBleManagerFactory implements Factory<SlateBleManager> {
  private final Provider<Context> contextProvider;

  public BleManagersModule_ProvidesSlateBleManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SlateBleManager get() {
    return providesSlateBleManager(contextProvider.get());
  }

  public static BleManagersModule_ProvidesSlateBleManagerFactory create(
      Provider<Context> contextProvider) {
    return new BleManagersModule_ProvidesSlateBleManagerFactory(contextProvider);
  }

  public static SlateBleManager providesSlateBleManager(Context context) {
    return Preconditions.checkNotNullFromProvides(BleManagersModule.INSTANCE.providesSlateBleManager(context));
  }
}