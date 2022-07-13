package com.woocommerce.android.ui.mystore;

import java.lang.System;

/**
 * Custom [BarChartRenderer] to handle rounded corner bars for our stats screen. This custom class takes in
 * an additional param [mRadius] which is used to determine the radius of the rounded corners.
 *
 * Round corner bars are not supported in MPAndroidChart lib and based on some suggestions from
 * StackOverFlow, the logic is to override the [drawDataSet] method of the [BarChartRenderer] class
 * and draw the bars with rounded corners:
 *
 * https://stackoverflow.com/questions/30761082/mpandroidchart-round-edged-bar-chart
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/mystore/RoundedBarChartRenderer;", "Lcom/github/mikephil/charting/renderer/BarChartRenderer;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "animator", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "viewPortHandler", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "mRadius", "", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;F)V", "mBarShadowRectBuffer", "Landroid/graphics/RectF;", "drawDataSet", "", "c", "Landroid/graphics/Canvas;", "dataSet", "Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;", "index", "", "drawHighlighted", "indices", "", "Lcom/github/mikephil/charting/highlight/Highlight;", "(Landroid/graphics/Canvas;[Lcom/github/mikephil/charting/highlight/Highlight;)V", "WooCommerce_wasabiDebug"})
public final class RoundedBarChartRenderer extends com.github.mikephil.charting.renderer.BarChartRenderer {
    private final float mRadius = 0.0F;
    private final android.graphics.RectF mBarShadowRectBuffer = null;
    
    public RoundedBarChartRenderer(@org.jetbrains.annotations.Nullable
    com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider chart, @org.jetbrains.annotations.Nullable
    com.github.mikephil.charting.animation.ChartAnimator animator, @org.jetbrains.annotations.Nullable
    com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float mRadius) {
        super(null, null, null);
    }
    
    @java.lang.Override
    public void drawHighlighted(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    com.github.mikephil.charting.highlight.Highlight[] indices) {
    }
    
    @kotlin.Suppress(names = {"LoopWithTooManyJumpStatements", "LongMethod", "ComplexMethod"})
    @java.lang.Override
    protected void drawDataSet(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    com.github.mikephil.charting.interfaces.datasets.IBarDataSet dataSet, int index) {
    }
}