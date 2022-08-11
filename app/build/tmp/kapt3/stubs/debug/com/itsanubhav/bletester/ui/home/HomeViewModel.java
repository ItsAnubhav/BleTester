package com.itsanubhav.bletester.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nJ\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/itsanubhav/bletester/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "bleManager", "Lcom/itsanubhav/bletester/blemanagers/MyBleManager;", "(Lcom/itsanubhav/bletester/blemanagers/MyBleManager;)V", "_bleManager", "get_bleManager", "()Lcom/itsanubhav/bletester/blemanagers/MyBleManager;", "_text", "Landroidx/lifecycle/MutableLiveData;", "", "device", "Landroid/bluetooth/BluetoothDevice;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "setDevice", "(Landroid/bluetooth/BluetoothDevice;)V", "text", "Landroidx/lifecycle/LiveData;", "getText", "()Landroidx/lifecycle/LiveData;", "changeLanguage", "", "connectDevice", "address", "name", "disconnectDevice", "fetchHr", "initialize", "isConnected", "", "syncDevice", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _text = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> text = null;
    @org.jetbrains.annotations.NotNull()
    private final com.itsanubhav.bletester.blemanagers.MyBleManager _bleManager = null;
    public android.bluetooth.BluetoothDevice device;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.blemanagers.MyBleManager bleManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.itsanubhav.bletester.blemanagers.MyBleManager get_bleManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothDevice getDevice() {
        return null;
    }
    
    public final void setDevice(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice p0) {
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    public final void connectDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void disconnectDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void syncDevice() {
    }
    
    public final void fetchHr() {
    }
    
    public final void changeLanguage() {
    }
    
    public final boolean isConnected() {
        return false;
    }
}