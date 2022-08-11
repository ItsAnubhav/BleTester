package com.itsanubhav.bletester.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/itsanubhav/bletester/events/CharacteristicChangeEvent;", "", "device", "Landroid/bluetooth/BluetoothDevice;", "buffer", "", "(Landroid/bluetooth/BluetoothDevice;[B)V", "getBuffer", "()[B", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class CharacteristicChangeEvent {
    @org.jetbrains.annotations.NotNull()
    private final android.bluetooth.BluetoothDevice device = null;
    @org.jetbrains.annotations.NotNull()
    private final byte[] buffer = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.itsanubhav.bletester.events.CharacteristicChangeEvent copy(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device, @org.jetbrains.annotations.NotNull()
    byte[] buffer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CharacteristicChangeEvent(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device, @org.jetbrains.annotations.NotNull()
    byte[] buffer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothDevice component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothDevice getDevice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getBuffer() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}