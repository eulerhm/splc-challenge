package com.woocommerce.android.ui.refunds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bJ\u0014\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$ViewHolder;", "checkedChangeListener", "Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$OnFeeLineCheckedChangeListener;", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "(Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$OnFeeLineCheckedChangeListener;Lkotlin/jvm/functions/Function1;)V", "items", "", "Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$FeeRefundListItem;", "selectedItemIds", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "newItems", "", "updateToggleStates", "feeLineIds", "FeeRefundListItem", "OnFeeLineCheckedChangeListener", "ViewHolder", "WooCommerce_wasabiDebug"})
public final class RefundFeeListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.ViewHolder> {
    private final com.woocommerce.android.ui.refunds.RefundFeeListAdapter.OnFeeLineCheckedChangeListener checkedChangeListener = null;
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrency = null;
    private java.util.List<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem> items;
    private java.util.List<java.lang.Long> selectedItemIds;
    
    public RefundFeeListAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.refunds.RefundFeeListAdapter.OnFeeLineCheckedChangeListener checkedChangeListener, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrency) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.refunds.RefundFeeListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.refunds.RefundFeeListAdapter.ViewHolder holder, int position) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem> newItems) {
    }
    
    public final void updateToggleStates(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> feeLineIds) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$OnFeeLineCheckedChangeListener;", "", "onFeeLineSwitchChanged", "", "isChecked", "", "itemId", "", "WooCommerce_wasabiDebug"})
    public static abstract interface OnFeeLineCheckedChangeListener {
        
        public abstract void onFeeLineSwitchChanged(boolean isChecked, long itemId);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "divider", "getDivider", "()Landroid/view/View;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "price", "getPrice", "switch", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "getSwitch", "()Lcom/google/android/material/switchmaterial/SwitchMaterial;", "WooCommerce_wasabiDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView price = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView name = null;
        @org.jetbrains.annotations.NotNull
        private final android.view.View divider = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.google.android.material.switchmaterial.SwitchMaterial getSwitch() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getDivider() {
            return null;
        }
    }
    
    @kotlinx.android.parcel.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$FeeRefundListItem;", "Landroid/os/Parcelable;", "feeLine", "Lcom/woocommerce/android/model/Order$FeeLine;", "(Lcom/woocommerce/android/model/Order$FeeLine;)V", "getFeeLine", "()Lcom/woocommerce/android/model/Order$FeeLine;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toDataModel", "Lorg/wordpress/android/fluxc/model/refunds/WCRefundModel$WCRefundItem;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class FeeRefundListItem implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.Order.FeeLine feeLine = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Order.FeeLine feeLine) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public FeeRefundListItem(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Order.FeeLine feeLine) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.FeeLine component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.FeeLine getFeeLine() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.wordpress.android.fluxc.model.refunds.WCRefundModel.WCRefundItem toDataModel() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem[] newArray(int size) {
                return null;
            }
        }
    }
}