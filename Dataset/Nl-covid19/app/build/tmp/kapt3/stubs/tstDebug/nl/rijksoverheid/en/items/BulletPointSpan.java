package nl.rijksoverheid.en.items;

import java.lang.System;

/**
 * Bullet with custom color and gap size, consistent on every API level
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJh\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\bH\u0016J\u001b\u0010&\u001a\u00020\u0011*\u00020\u00152\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110(H\u0082\bR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lnl/rijksoverheid/en/items/BulletPointSpan;", "Landroid/text/style/LeadingMarginSpan;", "gapWidth", "", "bulletRadius", "", "color", "useColor", "", "(IFIZ)V", "bulletPath", "Landroid/graphics/Path;", "getBulletPath", "()Landroid/graphics/Path;", "bulletPath$delegate", "Lkotlin/Lazy;", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "currentMarginLocation", "paragraphDirection", "lineTop", "lineBaseline", "lineBottom", "text", "", "lineStart", "lineEnd", "isFirstLine", "layout", "Landroid/text/Layout;", "getCircleXLocation", "getCircleYLocation", "getLeadingMargin", "first", "withCustomColor", "block", "Lkotlin/Function0;", "app_tstDebug"})
public final class BulletPointSpan implements android.text.style.LeadingMarginSpan {
    private final kotlin.Lazy bulletPath$delegate = null;
    private final int gapWidth = 0;
    private final float bulletRadius = 0.0F;
    private final int color = 0;
    private final boolean useColor = false;
    
    private final android.graphics.Path getBulletPath() {
        return null;
    }
    
    @java.lang.Override()
    public int getLeadingMargin(boolean first) {
        return 0;
    }
    
    @java.lang.Override()
    public void drawLeadingMargin(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint, int currentMarginLocation, int paragraphDirection, int lineTop, int lineBaseline, int lineBottom, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int lineStart, int lineEnd, boolean isFirstLine, @org.jetbrains.annotations.NotNull()
    android.text.Layout layout) {
    }
    
    private final float getCircleYLocation(int lineBaseline) {
        return 0.0F;
    }
    
    private final float getCircleXLocation(int currentMarginLocation, int paragraphDirection) {
        return 0.0F;
    }
    
    private final void withCustomColor(android.graphics.Paint $this$withCustomColor, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public BulletPointSpan(@androidx.annotation.Px()
    int gapWidth, @androidx.annotation.Px()
    float bulletRadius, @androidx.annotation.ColorInt()
    int color, boolean useColor) {
        super();
    }
    
    public BulletPointSpan() {
        super();
    }
}