package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0004\u001a\f\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u0004\u001a\f\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0004\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u00a8\u0006\u000f"}, d2 = {"appendWithIfNotEmpty", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "line", "", "separator", "capitalizeWords", "fastStripHtml", "isFloat", "", "isNumeric", "orNullIfEmpty", "semverCompareTo", "", "otherVersion", "WooCommerce_wasabiDebug"})
public final class StringExtKt {
    
    /**
     * Checks if a given string is a number (supports positive or negative numbers)
     */
    public static final boolean isNumeric(@org.jetbrains.annotations.Nullable
    java.lang.String $this$isNumeric) {
        return false;
    }
    
    /**
     * Checks if a given string is a Float
     */
    public static final boolean isFloat(@org.jetbrains.annotations.Nullable
    java.lang.String $this$isFloat) {
        return false;
    }
    
    /**
     * If the provided [line] is not null and not empty, then add the string to this instance. Will prepend the
     * [separator] if the current contents of this StringBuilder are not empty.
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.StringBuilder appendWithIfNotEmpty(@org.jetbrains.annotations.NotNull
    java.lang.StringBuilder $this$appendWithIfNotEmpty, @org.jetbrains.annotations.Nullable
    java.lang.String line, @org.jetbrains.annotations.NotNull
    java.lang.String separator) {
        return null;
    }
    
    /**
     * This is much faster than Html.fromHtml but should only be used when we know the html is valid
     * since the regex will be unpredictable with invalid html
     * String param containing only valid html
     * @return String without HTML
     *
     * Replicated from HtmlUtils.fastStripHtml and HtmlUtils.trimStart
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String fastStripHtml(@org.jetbrains.annotations.NotNull
    java.lang.String $this$fastStripHtml) {
        return null;
    }
    
    public static final int semverCompareTo(@org.jetbrains.annotations.NotNull
    java.lang.String $this$semverCompareTo, @org.jetbrains.annotations.NotNull
    java.lang.String otherVersion) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String capitalizeWords(@org.jetbrains.annotations.NotNull
    java.lang.String $this$capitalizeWords) {
        return null;
    }
    
    /**
     * Returns this string if it's not empty or null otherwise.
     * Syntactic sugar for `string.ifEmpty { null }`.
     */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String orNullIfEmpty(@org.jetbrains.annotations.NotNull
    java.lang.String $this$orNullIfEmpty) {
        return null;
    }
}