package com.itsanubhav.bletester.ui.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005\u00a8\u0006\u001f"}, d2 = {"Lcom/itsanubhav/bletester/ui/scanner/ScannerRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/itsanubhav/bletester/ui/scanner/ScannerRVAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deviceAddressList", "", "", "getDeviceAddressList", "()Ljava/util/List;", "deviceNameList", "getDeviceNameList", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "addDevice", "", "device", "name", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class ScannerRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.itsanubhav.bletester.ui.scanner.ScannerRVAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> deviceAddressList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> deviceNameList = null;
    
    public ScannerRVAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDeviceAddressList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDeviceNameList() {
        return null;
    }
    
    public final void addDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String device, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.itsanubhav.bletester.ui.scanner.ScannerRVAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.itsanubhav.bletester.ui.scanner.ScannerRVAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/itsanubhav/bletester/ui/scanner/ScannerRVAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "deviceMac", "Landroid/widget/TextView;", "getDeviceMac", "()Landroid/widget/TextView;", "setDeviceMac", "(Landroid/widget/TextView;)V", "deviceName", "getDeviceName", "setDeviceName", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView deviceName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView deviceMac;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDeviceName() {
            return null;
        }
        
        public final void setDeviceName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDeviceMac() {
            return null;
        }
        
        public final void setDeviceMac(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}