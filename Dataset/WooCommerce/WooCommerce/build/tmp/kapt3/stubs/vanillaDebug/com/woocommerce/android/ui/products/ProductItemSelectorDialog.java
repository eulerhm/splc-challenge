package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Dialog displays a list of product items such as
 * [CoreProductBackOrders], [CoreProductStockStatus], [CoreProductTaxStatus] and
 * allows for selecting a single product item
 *
 * This fragment should be instantiated using the [ProductItemSelectorDialog.newInstance] method.
 * Calling classes can obtain the results of selection through the [onActivityResult]
 * via [ProductItemSelectorDialog.getTargetFragment].
 *
 * The [resultCode] passed to this fragment is used to classify the product item i.e.
 * [CoreProductBackOrders], [CoreProductStockStatus] or [CoreProductTaxStatus]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "dialogTitle", "", "listItemMap", "", "listener", "Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog$ProductItemSelectorDialogListener;", "resultCode", "", "selectedListItem", "getCurrentProductItemListIndex", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onResume", "Companion", "ProductItemSelectorDialogListener", "WooCommerce_vanillaDebug"})
public final class ProductItemSelectorDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductItemSelectorDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "ProductItemSelectorDialog";
    private int resultCode = -1;
    private java.lang.String selectedListItem;
    private java.lang.String dialogTitle;
    private java.util.Map<java.lang.String, java.lang.String> listItemMap;
    private com.woocommerce.android.ui.products.ProductItemSelectorDialog.ProductItemSelectorDialogListener listener;
    
    public ProductItemSelectorDialog() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final int getCurrentProductItemListIndex() {
        return 0;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog$ProductItemSelectorDialogListener;", "", "onProductItemSelected", "", "resultCode", "", "selectedItem", "", "WooCommerce_vanillaDebug"})
    public static abstract interface ProductItemSelectorDialogListener {
        
        public abstract void onProductItemSelected(int resultCode, @org.jetbrains.annotations.Nullable()
        java.lang.String selectedItem);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J<\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog;", "listener", "Landroidx/fragment/app/Fragment;", "requestCode", "", "dialogTitle", "listItemMap", "", "selectedListItem", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductItemSelectorDialog newInstance(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment listener, int requestCode, @org.jetbrains.annotations.NotNull()
        java.lang.String dialogTitle, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> listItemMap, @org.jetbrains.annotations.Nullable()
        java.lang.String selectedListItem) {
            return null;
        }
    }
}