package com.woocommerce.android.widgets.tags;

import java.lang.System;

/**
 * Interface for working with individual Tag elements.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/widgets/tags/ITag;", "", "rawText", "", "(Ljava/lang/String;)V", "getRawText", "()Ljava/lang/String;", "compareTo", "", "other", "equals", "", "", "getTagConfiguration", "Lcom/woocommerce/android/widgets/tags/TagConfig;", "context", "Landroid/content/Context;", "hashCode", "WooCommerce_vanillaDebug"})
public abstract class ITag implements java.lang.Comparable<com.woocommerce.android.widgets.tags.ITag> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String rawText = null;
    
    public ITag(@org.jetbrains.annotations.NotNull()
    java.lang.String rawText) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawText() {
        return null;
    }
    
    /**
     * Returns the configuration to apply to this tag.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.woocommerce.android.widgets.tags.TagConfig getTagConfiguration(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.widgets.tags.ITag other) {
        return 0;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}