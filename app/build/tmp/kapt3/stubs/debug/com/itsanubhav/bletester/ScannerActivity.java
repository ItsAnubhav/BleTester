package com.itsanubhav.bletester;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/itsanubhav/bletester/ScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "binding", "Lcom/itsanubhav/bletester/databinding/ActivityScannerBinding;", "isScanning", "", "()Z", "setScanning", "(Z)V", "mScanCallback", "Lno/nordicsemi/android/support/v18/scanner/ScanCallback;", "scannerAdapter", "Lcom/itsanubhav/bletester/ui/scanner/ScannerRVAdapter;", "checkSupportedDeviceName", "deviceName", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "startScan", "stopScan", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ScannerActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private com.itsanubhav.bletester.databinding.ActivityScannerBinding binding;
    private com.itsanubhav.bletester.ui.scanner.ScannerRVAdapter scannerAdapter;
    private boolean isScanning = false;
    private final no.nordicsemi.android.support.v18.scanner.ScanCallback mScanCallback = null;
    
    public ScannerActivity() {
        super();
    }
    
    public final boolean isScanning() {
        return false;
    }
    
    public final void setScanning(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public final void startScan() {
    }
    
    private final boolean checkSupportedDeviceName(java.lang.String deviceName) {
        return false;
    }
    
    public final void stopScan() {
    }
}