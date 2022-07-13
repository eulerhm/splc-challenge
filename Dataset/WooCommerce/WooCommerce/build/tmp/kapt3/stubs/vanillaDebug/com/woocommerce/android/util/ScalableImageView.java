package com.woocommerce.android.util;

import java.lang.System;

/**
 * Android ImageView's scaletype has limited options for cropping the image: center_crop. This class adds 2 new
 * scaleType options:
 * FIT_TOP -> Will crop the image starting from the bottom so the top of the image will be guaranteed to be displayed
 * FIT_BOTTOM -> Will crop the image from the top. The bottom of the image will be guaranteed to be displayed
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/util/ScalableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "matrixType", "Lcom/woocommerce/android/util/ScalableImageView$MatrixType;", "computeDrawableMatrix", "", "(Lcom/woocommerce/android/util/ScalableImageView$MatrixType;)Lkotlin/Unit;", "setFrame", "", "l", "t", "r", "b", "Companion", "MatrixType", "ScaleType", "WooCommerce_vanillaDebug"})
public final class ScalableImageView extends androidx.appcompat.widget.AppCompatImageView {
    private com.woocommerce.android.util.ScalableImageView.MatrixType matrixType;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.ScalableImageView.Companion Companion = null;
    private static final float TRUNCATE_PATCH = 0.5F;
    
    @kotlin.jvm.JvmOverloads()
    public ScalableImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ScalableImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ScalableImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    protected boolean setFrame(int l, int t, int r, int b) {
        return false;
    }
    
    private final kotlin.Unit computeDrawableMatrix(com.woocommerce.android.util.ScalableImageView.MatrixType matrixType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0082\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/util/ScalableImageView$ScaleType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "CENTER", "CENTER_CROP", "CENTER_INSIDE", "FIT_CENTER", "FIT_END", "FIT_START", "FIT_XY", "FIT_TOP", "FIT_BOTTOM", "MATRIX", "Companion", "WooCommerce_vanillaDebug"})
    static enum ScaleType {
        /*public static final*/ CENTER /* = new CENTER(null) */,
        /*public static final*/ CENTER_CROP /* = new CENTER_CROP(null) */,
        /*public static final*/ CENTER_INSIDE /* = new CENTER_INSIDE(null) */,
        /*public static final*/ FIT_CENTER /* = new FIT_CENTER(null) */,
        /*public static final*/ FIT_END /* = new FIT_END(null) */,
        /*public static final*/ FIT_START /* = new FIT_START(null) */,
        /*public static final*/ FIT_XY /* = new FIT_XY(null) */,
        /*public static final*/ FIT_TOP /* = new FIT_TOP(null) */,
        /*public static final*/ FIT_BOTTOM /* = new FIT_BOTTOM(null) */,
        /*public static final*/ MATRIX /* = new MATRIX(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.util.ScalableImageView.ScaleType.Companion Companion = null;
        
        ScaleType(java.lang.String id) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/util/ScalableImageView$ScaleType$Companion;", "", "()V", "getType", "Lcom/woocommerce/android/util/ScalableImageView$ScaleType;", "id", "", "WooCommerce_vanillaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.util.ScalableImageView.ScaleType getType(@org.jetbrains.annotations.Nullable()
            java.lang.String id) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/util/ScalableImageView$MatrixType;", "", "(Ljava/lang/String;I)V", "FIT_TOP", "FIT_BOTTOM", "WooCommerce_vanillaDebug"})
    static enum MatrixType {
        /*public static final*/ FIT_TOP /* = new FIT_TOP() */,
        /*public static final*/ FIT_BOTTOM /* = new FIT_BOTTOM() */;
        
        MatrixType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/util/ScalableImageView$Companion;", "", "()V", "TRUNCATE_PATCH", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}