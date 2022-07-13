package com.woocommerce.android.widgets.tags;

import java.lang.System;

/**
 * Custom tag view. This view displays a simple string label. The background and font colors are both styleable.
 * Font color will default to gray, background color will default to light gray.
 *
 * @attr ref com.woocommerce.android.R.styleable#tagText
 * @attr ref com.woocommerce.android.R.styleable#tagTextColor
 * @attr ref com.woocommerce.android.R.styleable#tagTextSize
 * @attr ref com.woocommerce.android.R.styleable#tagColor
 * @attr ref com.woocommerce.android.R.styleable#tagBorderColor
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/widgets/tags/TagView;", "Lcom/google/android/material/textview/MaterialTextView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "v", "Lcom/woocommerce/android/widgets/tags/ITag;", "tag", "getTag", "()Lcom/woocommerce/android/widgets/tags/ITag;", "setTag", "(Lcom/woocommerce/android/widgets/tags/ITag;)V", "initTag", "", "config", "Lcom/woocommerce/android/widgets/tags/TagConfig;", "WooCommerce_vanillaDebug"})
public final class TagView extends com.google.android.material.textview.MaterialTextView {
    @org.jetbrains.annotations.Nullable()
    private com.woocommerce.android.widgets.tags.ITag tag;
    
    @kotlin.jvm.JvmOverloads()
    public TagView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public TagView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public TagView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public TagView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.widgets.tags.ITag getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.Nullable()
    com.woocommerce.android.widgets.tags.ITag v) {
    }
    
    /**
     * Should be called anytime the tag changes. Sets the background color, border
     * color and corner radius of the tag view.
     */
    private final void initTag(com.woocommerce.android.widgets.tags.TagConfig config) {
    }
}