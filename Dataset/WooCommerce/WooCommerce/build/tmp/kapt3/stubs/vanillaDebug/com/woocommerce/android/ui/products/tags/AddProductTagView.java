package com.woocommerce.android.ui.products.tags;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000fJ)\u0010\u0019\u001a\u00020\f2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f0\u001bJ+\u0010 \u001a\u00020\f2#\u0010\u001a\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010!\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u001bJ\u0016\u0010\"\u001a\u0004\u0018\u00010#*\u00020$2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002J\u0012\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160&*\u00020$H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/AddProductTagView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/AddProductTagViewBinding;", "addSelectedTags", "", "selectedTags", "", "Lcom/woocommerce/android/model/ProductTag;", "listener", "Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$OnProductTagClickListener;", "addTag", "tag", "clearEnteredTag", "getEnteredTag", "", "removeSelectedTag", "selectedTag", "setOnEditorActionListener", "cb", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "text", "", "setOnEditorTextChangedListener", "Landroid/text/Editable;", "getSelectedChip", "Lcom/google/android/material/chip/Chip;", "Lcom/google/android/material/chip/ChipGroup;", "getSelectedChipIds", "", "WooCommerce_vanillaDebug"})
public final class AddProductTagView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.AddProductTagViewBinding binding = null;
    
    @kotlin.jvm.JvmOverloads()
    public AddProductTagView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddProductTagView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddProductTagView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void addSelectedTags(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.ProductTag> selectedTags, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.tags.ProductTagsAdapter.OnProductTagClickListener listener) {
    }
    
    public final void removeSelectedTag(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductTag selectedTag) {
    }
    
    public final void setOnEditorActionListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> cb) {
    }
    
    public final void setOnEditorTextChangedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> cb) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnteredTag() {
        return null;
    }
    
    public final void clearEnteredTag() {
    }
    
    private final void addTag(com.woocommerce.android.model.ProductTag tag, com.woocommerce.android.ui.products.tags.ProductTagsAdapter.OnProductTagClickListener listener) {
    }
    
    private final java.util.List<java.lang.String> getSelectedChipIds(com.google.android.material.chip.ChipGroup $this$getSelectedChipIds) {
        return null;
    }
    
    private final com.google.android.material.chip.Chip getSelectedChip(com.google.android.material.chip.ChipGroup $this$getSelectedChip, java.lang.String tag) {
        return null;
    }
}