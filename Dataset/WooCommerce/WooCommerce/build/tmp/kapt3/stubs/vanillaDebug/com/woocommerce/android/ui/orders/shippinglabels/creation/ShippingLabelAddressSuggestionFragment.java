package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\u001a\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001dH\u0003J\u0016\u0010)\u001a\u00020\u001b*\u00020*2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentShippingLabelAddressSuggestionBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentShippingLabelAddressSuggestionBinding;", "value", "", "screenTitle", "setScreenTitle", "(I)V", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "initializeViewModel", "", "initializeViews", "onDestroyView", "onRequestAllowBackPress", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeObservers", "toStringMarkingDifferences", "Lcom/woocommerce/android/model/Address;", "other", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShippingLabelAddressSuggestionFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUGGESTED_ADDRESS_DISCARDED = "key_suggested_address_dialog_closed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_ADDRESS_ACCEPTED = "key_selected_address_accepted";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_ADDRESS_TO_BE_EDITED = "key_selected_address_to_be_edited";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private com.woocommerce.android.databinding.FragmentShippingLabelAddressSuggestionBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private int screenTitle = 0;
    
    public ShippingLabelAddressSuggestionFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentShippingLabelAddressSuggestionBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel getViewModel() {
        return null;
    }
    
    private final void setScreenTitle(int value) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeViewModel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void subscribeObservers() {
    }
    
    private final java.lang.String toStringMarkingDifferences(com.woocommerce.android.model.Address $this$toStringMarkingDifferences, com.woocommerce.android.model.Address other) {
        return null;
    }
    
    private final void initializeViews() {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressSuggestionFragment$Companion;", "", "()V", "SELECTED_ADDRESS_ACCEPTED", "", "SELECTED_ADDRESS_TO_BE_EDITED", "SUGGESTED_ADDRESS_DISCARDED", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}