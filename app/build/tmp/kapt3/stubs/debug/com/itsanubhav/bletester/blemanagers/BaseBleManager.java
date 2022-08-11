package com.itsanubhav.bletester.blemanagers;

import java.lang.System;

@android.annotation.SuppressLint(value = {"MissingPermission"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\'\u0018\u00002\u00020\u0001:\u0001BB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0012J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020\u0012J\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00120(J\b\u0010)\u001a\u00020\u0003H\u0002J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,J\u001c\u0010.\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u00010\u001eH\u0016J$\u00100\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u00010\u001e2\u0006\u00101\u001a\u00020\u0006H\u0016J$\u00102\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u00010\u001e2\u0006\u00101\u001a\u00020\u0006H\u0016J\"\u00103\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u00101\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0016J$\u00105\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u00020\u0006H\u0016J$\u00108\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u00020\u0006H\u0016J\u001a\u00109\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u00101\u001a\u00020\u0006H\u0016J\u0012\u0010:\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0002J\u000e\u0010;\u001a\u00020 2\u0006\u0010+\u001a\u00020,J\u0006\u0010<\u001a\u00020 J\u0006\u0010=\u001a\u00020 J\u0016\u0010>\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u001aJ\u001a\u0010@\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00122\b\u0010A\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0018\u00010\u001cR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/itsanubhav/bletester/blemanagers/BaseBleManager;", "Landroid/bluetooth/BluetoothGattCallback;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_connectTimeout", "", "_scanTimeout", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothLeScanner", "Landroid/bluetooth/le/BluetoothLeScanner;", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "bluetoothScanCallback", "Landroid/bluetooth/le/ScanCallback;", "deviceGattMap", "", "Landroid/bluetooth/BluetoothDevice;", "Landroid/bluetooth/BluetoothGatt;", "handler", "Landroid/os/Handler;", "isSendData", "", "listReadData", "", "", "sendDataRunnable", "Lcom/itsanubhav/bletester/blemanagers/BaseBleManager$SendDataRunnable;", "writeCharacteristic", "Landroid/bluetooth/BluetoothGattCharacteristic;", "addConnectedGatt", "", "gatt", "checkIfSupportBle", "disconnect", "device", "disconnectAllDevices", "getBluetoothGatt", "getConnectedDevices", "", "getContext", "getDeviceByAddress", "address", "", "isConnected", "onCharacteristicChanged", "characteristic", "onCharacteristicRead", "status", "onCharacteristicWrite", "onConnectionStateChange", "newState", "onDescriptorRead", "descriptor", "Landroid/bluetooth/BluetoothGattDescriptor;", "onDescriptorWrite", "onServicesDiscovered", "removeDisconnectedGatt", "simpleConnect", "startScan", "stopScan", "write", "value", "writeValue", "buffer", "SendDataRunnable", "app_debug"})
public abstract class BaseBleManager extends android.bluetooth.BluetoothGattCallback {
    private final int _scanTimeout = 10000;
    private final int _connectTimeout = 10000;
    private final android.content.Context mContext = null;
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private android.bluetooth.BluetoothManager bluetoothManager;
    private android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner;
    private final java.util.Map<android.bluetooth.BluetoothDevice, android.bluetooth.BluetoothGatt> deviceGattMap = null;
    private android.bluetooth.BluetoothGattCharacteristic writeCharacteristic;
    private final java.util.List<byte[]> listReadData = null;
    private boolean isSendData = false;
    private android.os.Handler handler;
    private com.itsanubhav.bletester.blemanagers.BaseBleManager.SendDataRunnable sendDataRunnable;
    private final android.bluetooth.le.ScanCallback bluetoothScanCallback = null;
    
    public BaseBleManager(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    public final void startScan() {
    }
    
    public final void stopScan() {
    }
    
    public final void simpleConnect(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onConnectionStateChange(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt, int status, int newState) {
    }
    
    public void addConnectedGatt(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt) {
    }
    
    private final void removeDisconnectedGatt(android.bluetooth.BluetoothGatt gatt) {
    }
    
    public final void disconnect(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.bluetooth.BluetoothDevice getDeviceByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public void disconnectAllDevices() {
    }
    
    public final boolean isConnected(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.bluetooth.BluetoothDevice> getConnectedDevices() {
        return null;
    }
    
    public final boolean checkIfSupportBle() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothGatt getBluetoothGatt(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device) {
        return null;
    }
    
    private final android.content.Context getContext() {
        return null;
    }
    
    public final boolean write(@org.jetbrains.annotations.NotNull()
    android.bluetooth.BluetoothDevice device, @org.jetbrains.annotations.NotNull()
    byte[] value) {
        return false;
    }
    
    private final void writeValue(android.bluetooth.BluetoothDevice device, byte[] buffer) {
    }
    
    @java.lang.Override()
    public void onServicesDiscovered(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt, int status) {
    }
    
    @java.lang.Override()
    public void onCharacteristicChanged(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt, @org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGattCharacteristic characteristic) {
    }
    
    @java.lang.Override()
    public void onCharacteristicRead(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt, @org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    }
    
    @java.lang.Override()
    public void onCharacteristicWrite(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt, @org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGattCharacteristic characteristic, int status) {
    }
    
    @java.lang.Override()
    public void onDescriptorRead(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt, @org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGattDescriptor descriptor, int status) {
    }
    
    @java.lang.Override()
    public void onDescriptorWrite(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGatt gatt, @org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothGattDescriptor descriptor, int status) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/itsanubhav/bletester/blemanagers/BaseBleManager$SendDataRunnable;", "Ljava/lang/Runnable;", "buffer", "", "device", "Landroid/bluetooth/BluetoothDevice;", "(Lcom/itsanubhav/bletester/blemanagers/BaseBleManager;[BLandroid/bluetooth/BluetoothDevice;)V", "currentDevice", "currentSendFrequency", "", "listData", "", "addData", "", "run", "app_debug"})
    public final class SendDataRunnable implements java.lang.Runnable {
        private final java.util.List<byte[]> listData = null;
        private android.bluetooth.BluetoothDevice currentDevice;
        
        /**
         * ��ǰ���ʹ���
         */
        private int currentSendFrequency;
        
        public SendDataRunnable(@org.jetbrains.annotations.NotNull()
        byte[] buffer, @org.jetbrains.annotations.NotNull()
        android.bluetooth.BluetoothDevice device) {
            super();
        }
        
        @java.lang.Override()
        public void run() {
        }
        
        public final void addData(@org.jetbrains.annotations.NotNull()
        byte[] buffer) {
        }
    }
}