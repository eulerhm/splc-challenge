package com.woocommerce.android.ui.mystore;

import java.lang.System;

/**
 * Interface that overrides the [OnChartGestureListener] class so as to NOT
 * implement unused methods to the implementing class
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/mystore/BarChartGestureListener;", "Lcom/github/mikephil/charting/listener/OnChartGestureListener;", "onChartDoubleTapped", "", "me", "Landroid/view/MotionEvent;", "onChartFling", "me1", "me2", "velocityX", "", "velocityY", "onChartGestureStart", "lastPerformedGesture", "Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;", "onChartLongPressed", "onChartScale", "scaleX", "scaleY", "onChartSingleTapped", "onChartTranslate", "dX", "dY", "WooCommerce_vanillaDebug"})
public abstract interface BarChartGestureListener extends com.github.mikephil.charting.listener.OnChartGestureListener {
    
    @java.lang.Override()
    public abstract void onChartLongPressed(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me);
    
    @java.lang.Override()
    public abstract void onChartSingleTapped(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me);
    
    @java.lang.Override()
    public abstract void onChartDoubleTapped(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me);
    
    @java.lang.Override()
    public abstract void onChartTranslate(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me, float dX, float dY);
    
    @java.lang.Override()
    public abstract void onChartScale(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me, float scaleX, float scaleY);
    
    @java.lang.Override()
    public abstract void onChartGestureStart(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me, @org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture lastPerformedGesture);
    
    @java.lang.Override()
    public abstract void onChartFling(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me1, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me2, float velocityX, float velocityY);
    
    /**
     * Interface that overrides the [OnChartGestureListener] class so as to NOT
     * implement unused methods to the implementing class
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onChartLongPressed(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.mystore.BarChartGestureListener $this, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me) {
        }
        
        @java.lang.Override()
        public static void onChartSingleTapped(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.mystore.BarChartGestureListener $this, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me) {
        }
        
        @java.lang.Override()
        public static void onChartDoubleTapped(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.mystore.BarChartGestureListener $this, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me) {
        }
        
        @java.lang.Override()
        public static void onChartTranslate(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.mystore.BarChartGestureListener $this, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me, float dX, float dY) {
        }
        
        @java.lang.Override()
        public static void onChartScale(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.mystore.BarChartGestureListener $this, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me, float scaleX, float scaleY) {
        }
        
        @java.lang.Override()
        public static void onChartGestureStart(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.mystore.BarChartGestureListener $this, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me, @org.jetbrains.annotations.Nullable()
        com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture lastPerformedGesture) {
        }
        
        @java.lang.Override()
        public static void onChartFling(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.mystore.BarChartGestureListener $this, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me1, @org.jetbrains.annotations.Nullable()
        android.view.MotionEvent me2, float velocityX, float velocityY) {
        }
    }
}