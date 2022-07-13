package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002)*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016J\u001c\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u0019H\u0016J\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0019H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000RP\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00120\u000e2\u001c\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00120\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsLineAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsLineAdapter$CustomsLineViewHolder;", "weightUnit", "", "currencyUnit", "countries", "", "Lcom/woocommerce/android/model/Location;", "listener", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFormListener;", "(Ljava/lang/String;Ljava/lang/String;[Lcom/woocommerce/android/model/Location;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFormListener;)V", "[Lcom/woocommerce/android/model/Location;", "value", "", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/CustomsLine;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CustomsLineUiState;", "customsLines", "getCustomsLines", "()Ljava/util/List;", "setCustomsLines", "(Ljava/util/List;)V", "parentItemPosition", "", "getParentItemPosition", "()I", "setParentItemPosition", "(I)V", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CustomsLineDiffCallback", "CustomsLineViewHolder", "WooCommerce_vanillaDebug"})
public final class ShippingCustomsLineAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsLineAdapter.CustomsLineViewHolder> {
    private final java.lang.String weightUnit = null;
    private final java.lang.String currencyUnit = null;
    private final com.woocommerce.android.model.Location[] countries = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFormListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> customsLines;
    private int parentItemPosition = -1;
    
    public ShippingCustomsLineAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String weightUnit, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyUnit, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Location[] countries, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFormListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> getCustomsLines() {
        return null;
    }
    
    public final void setCustomsLines(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> value) {
    }
    
    public final int getParentItemPosition() {
        return 0;
    }
    
    public final void setParentItemPosition(int p0) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsLineAdapter.CustomsLineViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsLineAdapter.CustomsLineViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012J\b\u0010\u0013\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsLineAdapter$CustomsLineViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocommerce/android/databinding/ShippingCustomsLineListItemBinding;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsLineAdapter;Lcom/woocommerce/android/databinding/ShippingCustomsLineListItemBinding;)V", "getBinding", "()Lcom/woocommerce/android/databinding/ShippingCustomsLineListItemBinding;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "bind", "", "uiState", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/CustomsLine;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CustomsLineUiState;", "focusOnFirstInvalidField", "WooCommerce_vanillaDebug"})
    public final class CustomsLineViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ShippingCustomsLineListItemBinding binding = null;
        
        public CustomsLineViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ShippingCustomsLineListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ShippingCustomsLineListItemBinding getBinding() {
            return null;
        }
        
        private final android.content.Context getContext() {
            return null;
        }
        
        private final void focusOnFirstInvalidField() {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState> uiState) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsLineAdapter$CustomsLineDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/CustomsLine;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$LineValidationState;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CustomsLineUiState;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    static final class CustomsLineDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> oldList = null;
        private final java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> newList = null;
        
        public CustomsLineDiffCallback(@org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Pair<com.woocommerce.android.model.CustomsLine, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.LineValidationState>> newList) {
            super();
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
}