package com.woocommerce.android.ui.compose.component;

import java.lang.System;

/**
 * Handles the mapping between the values of type [T] and their text representation, when used in a
 * typed [WCOutlinedTypedTextField].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH&\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/compose/component/TextFieldValueMapper;", "T", "", "equals", "", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "parseText", "text", "", "(Ljava/lang/String;)Ljava/lang/Object;", "printValue", "value", "(Ljava/lang/Object;)Ljava/lang/String;", "transformText", "oldText", "newText", "WooCommerce_vanillaDebug"})
public abstract interface TextFieldValueMapper<T extends java.lang.Object> {
    
    /**
     * Parse the passed [text] into a value of type [T].
     * When this throws an [Exception], the last text edit will be reverted.
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public abstract T parseText(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    /**
     * Returns a String representation of the instance [value], as it should be printed to the text field.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String printValue(T value);
    
    /**
     * Handles any text transformations before parsing the text.
     * This can be useful for cases when we want to filter the allowed characters, or for advanced text manipulations
     * (such as: disallowing empty values, advanced decimal formatting...)
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String transformText(@org.jetbrains.annotations.NotNull()
    java.lang.String oldText, @org.jetbrains.annotations.NotNull()
    java.lang.String newText);
    
    /**
     * Checks whether the old value that the text field had [oldValue] equals the [newValue]
     * The Text field won't emit changes until the values are different
     */
    public abstract boolean equals(T oldValue, T newValue);
    
    /**
     * Handles the mapping between the values of type [T] and their text representation, when used in a
     * typed [WCOutlinedTypedTextField].
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Handles any text transformations before parsing the text.
         * This can be useful for cases when we want to filter the allowed characters, or for advanced text manipulations
         * (such as: disallowing empty values, advanced decimal formatting...)
         */
        @org.jetbrains.annotations.NotNull()
        public static <T extends java.lang.Object>java.lang.String transformText(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.compose.component.TextFieldValueMapper<T> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String oldText, @org.jetbrains.annotations.NotNull()
        java.lang.String newText) {
            return null;
        }
        
        /**
         * Checks whether the old value that the text field had [oldValue] equals the [newValue]
         * The Text field won't emit changes until the values are different
         */
        public static <T extends java.lang.Object>boolean equals(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.compose.component.TextFieldValueMapper<T> $this, T oldValue, T newValue) {
            return false;
        }
    }
}