package com.itsanubhav.bletester.blemanagers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u000fJ\u001d\u0010\u0018\u001a\u00020\u0011*\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/itsanubhav/bletester/blemanagers/MyBleManager;", "Lcom/itsanubhav/bletester/blemanagers/BaseBleManager;", "context", "Landroid/content/Context;", "tresBleManager", "Lcom/itsanubhav/bletester/blemanagers/tres/TresBleManager;", "slateBleManager", "Lcom/itsanubhav/bletester/blemanagers/slate/SlateBleManager;", "blazeBleManager", "Lcom/itsanubhav/bletester/blemanagers/blaze/BlazeBleManager;", "(Landroid/content/Context;Lcom/itsanubhav/bletester/blemanagers/tres/TresBleManager;Lcom/itsanubhav/bletester/blemanagers/slate/SlateBleManager;Lcom/itsanubhav/bletester/blemanagers/blaze/BlazeBleManager;)V", "_blazeBleManager", "_slateBleManager", "_tresBleManager", "appSync", "", "isFirstTimeSync", "", "changeLanguage", "connect", "address", "", "name", "fetchHeartRate", "containsAnyOfIgnoreCase", "keywords", "", "(Ljava/lang/String;[Ljava/lang/String;)Z", "app_debug"})
public final class MyBleManager extends com.itsanubhav.bletester.blemanagers.BaseBleManager {
    private final com.itsanubhav.bletester.blemanagers.tres.TresBleManager _tresBleManager = null;
    private final com.itsanubhav.bletester.blemanagers.slate.SlateBleManager _slateBleManager = null;
    private final com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager _blazeBleManager = null;
    
    @javax.inject.Inject()
    public MyBleManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.blemanagers.tres.TresBleManager tresBleManager, @org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.blemanagers.slate.SlateBleManager slateBleManager, @org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.blemanagers.blaze.BlazeBleManager blazeBleManager) {
        super(null);
    }
    
    public final void connect(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void fetchHeartRate() {
    }
    
    public final void appSync(boolean isFirstTimeSync) {
    }
    
    public final void changeLanguage() {
    }
    
    public final boolean containsAnyOfIgnoreCase(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$containsAnyOfIgnoreCase, @org.jetbrains.annotations.NotNull()
    java.lang.String[] keywords) {
        return false;
    }
}