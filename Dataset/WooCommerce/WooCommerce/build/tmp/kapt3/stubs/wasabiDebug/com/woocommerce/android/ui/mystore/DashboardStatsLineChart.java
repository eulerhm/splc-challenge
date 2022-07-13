package com.woocommerce.android.ui.mystore;

import java.lang.System;

/**
 * Creating a custom BarChart to fix this issue:
 * https://github.com/woocommerce/woocommerce-android/issues/1048
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/mystore/DashboardStatsLineChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "startTouchPoint", "Landroid/graphics/Point;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "WooCommerce_wasabiDebug"})
public final class DashboardStatsLineChart extends com.github.mikephil.charting.charts.LineChart {
    private final android.graphics.Point startTouchPoint = null;
    
    public DashboardStatsLineChart(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    /**
     * Method added to prevent the chart's parent view (i.e ScrollView) from
     * intercepting the touch events during a horizontal scrubbing interaction
     */
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
}