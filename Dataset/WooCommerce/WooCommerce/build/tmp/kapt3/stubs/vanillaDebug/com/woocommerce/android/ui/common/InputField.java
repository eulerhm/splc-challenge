package com.woocommerce.android.ui.common;

import java.lang.System;

/**
 * Base class for representing an input field, it allows holding the current content, to allow prefilling
 * and restoring it.
 * And allows representing [error] message that can be displayed if the input is not valid, the [error] is not
 * calculated until [validate] is called.
 * [isValid] will return the current validation status independently of whether an error is displayed or not.
 *
 * Child classes will have to implement the validation logic.
 *
 * This class is using a reverse generic type to allow returning the exact type of the class in [validate] function.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0086\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000b\u0010\u0017\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0018J\n\u0010\u0019\u001a\u0004\u0018\u00010\nH$R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/common/InputField;", "T", "Landroid/os/Parcelable;", "", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "<set-?>", "Lcom/woocommerce/android/model/UiString;", "error", "getError", "()Lcom/woocommerce/android/model/UiString;", "hasBeenValidated", "", "isValid", "()Z", "equals", "other", "", "hashCode", "", "validate", "()Lcom/woocommerce/android/ui/common/InputField;", "validateInternal", "WooCommerce_vanillaDebug"})
public abstract class InputField<T extends com.woocommerce.android.ui.common.InputField<T>> implements android.os.Parcelable, java.lang.Cloneable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String content = null;
    @org.jetbrains.annotations.Nullable()
    private com.woocommerce.android.model.UiString error;
    private boolean hasBeenValidated = false;
    
    public InputField(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.UiString getError() {
        return null;
    }
    
    public final boolean isValid() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T validate() {
        return null;
    }
    
    /**
     * Marking the implementation as final to avoid overriding it by Kotlin's data classes, as the generated one
     * doesn't check the parent class's fields, and would skip important details.
     */
    @java.lang.Override()
    public final int hashCode() {
        return 0;
    }
    
    /**
     * Marking the implementation as final to avoid overriding it by Kotlin's data classes, as the generated one
     * doesn't check the parent class's fields, and would skip important details.
     */
    @java.lang.Override()
    public final boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Perform specific field's validation
     * @return [UiString] holding the error to be displayed or null if it's valid
     */
    @org.jetbrains.annotations.Nullable()
    protected abstract com.woocommerce.android.model.UiString validateInternal();
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object clone() {
        return null;
    }
}