package com.woocommerce.android.ui.products.variations.attributes.edit;

import java.lang.System;

/**
 * Dialog displays a list of Attribute Options and
 * allows for selecting of single item
 *
 * This fragment should be instantiated using the [AttributeOptionSelectorDialog.newInstance] method.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/edit/AttributeOptionSelectorDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "attributeGroup", "Lcom/woocommerce/android/ui/products/variations/attributes/edit/VariationAttributeSelectionGroup;", "listener", "Lkotlin/Function1;", "", "onCreateDialog", "Landroidx/appcompat/app/AlertDialog;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionSelected", "dialog", "Landroid/content/DialogInterface;", "index", "", "Companion", "WooCommerce_vanillaDebug"})
public final class AttributeOptionSelectorDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.variations.attributes.edit.AttributeOptionSelectorDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "AttributeOptionSelectorDialog";
    private kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup, kotlin.Unit> listener;
    private com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup attributeGroup;
    
    public AttributeOptionSelectorDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.app.AlertDialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void onOptionSelected(android.content.DialogInterface dialog, int index) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/edit/AttributeOptionSelectorDialog$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/woocommerce/android/ui/products/variations/attributes/edit/AttributeOptionSelectorDialog;", "attributeGroup", "Lcom/woocommerce/android/ui/products/variations/attributes/edit/VariationAttributeSelectionGroup;", "onAttributeOptionSelected", "Lkotlin/Function1;", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.attributes.edit.AttributeOptionSelectorDialog newInstance(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup attributeGroup, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup, kotlin.Unit> onAttributeOptionSelected) {
            return null;
        }
    }
}