package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Wrapper for custom view state which can be used to save the parent's (super.onSaveInstanceState) state
 * or any child view's state
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bB\u0019\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/widgets/WCSavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "inState", "(Landroid/os/Parcelable;Landroid/os/Parcelable;)V", "source", "Landroid/os/Parcel;", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;Landroid/os/Parcelable;)V", "(Landroid/os/Parcel;)V", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "<set-?>", "savedState", "getSavedState", "()Landroid/os/Parcelable;", "writeToParcel", "", "out", "flags", "", "Companion", "WooCommerce_wasabiDebug"})
public final class WCSavedState extends android.view.View.BaseSavedState {
    @org.jetbrains.annotations.Nullable
    private android.os.Parcelable savedState;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.widgets.WCSavedState.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public static final android.os.Parcelable.ClassLoaderCreator<com.woocommerce.android.widgets.WCSavedState> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable
    public final android.os.Parcelable getSavedState() {
        return null;
    }
    
    public WCSavedState(@org.jetbrains.annotations.Nullable
    android.os.Parcelable superState, @org.jetbrains.annotations.NotNull
    android.os.Parcelable inState) {
        super(null);
    }
    
    /**
     * Workaround to differentiate between this method and the one that requires API 24+ because
     * the super(source, loader) method won't work on older APIs - thus the app will crash.
     */
    public WCSavedState(@org.jetbrains.annotations.NotNull
    android.os.Parcel source, @org.jetbrains.annotations.Nullable
    java.lang.ClassLoader loader, @org.jetbrains.annotations.Nullable
    android.os.Parcelable superState) {
        super(null);
    }
    
    public WCSavedState(@org.jetbrains.annotations.NotNull
    android.os.Parcel source) {
        super(null);
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    public WCSavedState(@org.jetbrains.annotations.NotNull
    android.os.Parcel source, @org.jetbrains.annotations.Nullable
    java.lang.ClassLoader loader) {
        super(null);
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel out, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/widgets/WCSavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lcom/woocommerce/android/widgets/WCSavedState;", "getCREATOR$annotations", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Suppress(names = {"UNUSED"})
        @java.lang.Deprecated
        public static void getCREATOR$annotations() {
        }
    }
}