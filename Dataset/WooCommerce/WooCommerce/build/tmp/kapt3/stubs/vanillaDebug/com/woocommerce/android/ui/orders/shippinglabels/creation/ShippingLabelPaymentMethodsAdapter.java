package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001c\u001dB\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u0014\u001a\u00020\u00072\n\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelPaymentMethodsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$PaymentMethodUiModel;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelPaymentMethodsAdapter$PaymentMethodViewHolder;", "onPaymentMethodSelected", "Lkotlin/Function1;", "Lcom/woocommerce/android/model/PaymentMethod;", "", "(Lkotlin/jvm/functions/Function1;)V", "dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "dateFormat$delegate", "Lkotlin/Lazy;", "isEditingEnabled", "", "()Z", "setEditingEnabled", "(Z)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PaymentMethodDiffCallBack", "PaymentMethodViewHolder", "WooCommerce_vanillaDebug"})
public final class ShippingLabelPaymentMethodsAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelPaymentMethodsAdapter.PaymentMethodViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.PaymentMethod, kotlin.Unit> onPaymentMethodSelected = null;
    private final kotlin.Lazy dateFormat$delegate = null;
    private boolean isEditingEnabled = true;
    
    public ShippingLabelPaymentMethodsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.PaymentMethod, kotlin.Unit> onPaymentMethodSelected) {
        super(null);
    }
    
    private final java.text.SimpleDateFormat getDateFormat() {
        return null;
    }
    
    public final boolean isEditingEnabled() {
        return false;
    }
    
    public final void setEditingEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelPaymentMethodsAdapter.PaymentMethodViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelPaymentMethodsAdapter.PaymentMethodViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelPaymentMethodsAdapter$PaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocommerce/android/databinding/ShippingLabelPaymentMethodListItemBinding;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelPaymentMethodsAdapter;Lcom/woocommerce/android/databinding/ShippingLabelPaymentMethodListItemBinding;)V", "getBinding", "()Lcom/woocommerce/android/databinding/ShippingLabelPaymentMethodListItemBinding;", "bind", "", "item", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$PaymentMethodUiModel;", "getPaymentMethodTranslation", "", "Landroid/content/Context;", "paymentMethod", "WooCommerce_vanillaDebug"})
    public final class PaymentMethodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ShippingLabelPaymentMethodListItemBinding binding = null;
        
        public PaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ShippingLabelPaymentMethodListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ShippingLabelPaymentMethodListItemBinding getBinding() {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel item) {
        }
        
        private final java.lang.String getPaymentMethodTranslation(android.content.Context $this$getPaymentMethodTranslation, java.lang.String paymentMethod) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelPaymentMethodsAdapter$PaymentMethodDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel$PaymentMethodUiModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_vanillaDebug"})
    public static final class PaymentMethodDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel> {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelPaymentMethodsAdapter.PaymentMethodDiffCallBack INSTANCE = null;
        
        private PaymentMethodDiffCallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel.PaymentMethodUiModel newItem) {
            return false;
        }
    }
}