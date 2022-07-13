package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "description", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "getDescription", "(Lcom/woocommerce/android/model/ShippingLabelPackage;)Ljava/lang/String;", "initUi", "", "binding", "Lcom/woocommerce/android/databinding/DialogMoveShippingItemBinding;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "generateRadioButton", "Landroid/widget/RadioButton;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$DestinationPackage;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MoveShippingItemDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MOVE_ITEM_RESULT = "move-item-result";
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MoveShippingItemDialog() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi(com.woocommerce.android.databinding.DialogMoveShippingItemBinding binding) {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.DialogMoveShippingItemBinding binding) {
    }
    
    private final android.widget.RadioButton generateRadioButton(com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.DestinationPackage $this$generateRadioButton) {
        return null;
    }
    
    private final java.lang.String getDescription(com.woocommerce.android.model.ShippingLabelPackage $this$description) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemDialog$Companion;", "", "()V", "MOVE_ITEM_RESULT", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}