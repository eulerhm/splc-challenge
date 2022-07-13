package com.woocommerce.android.ui.mystore;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003stuB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010<\u001a\u00020\u0017J\u0006\u0010=\u001a\u00020\u0017J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020@2\u0006\u0010\'\u001a\u00020\u0011H\u0002J\u001c\u0010A\u001a\u00020B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0010H\u0002J\b\u0010D\u001a\u00020\tH\u0002J\u0010\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\tH\u0002J\u0018\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010I\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u0011H\u0002J\u0010\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u0014H\u0002J(\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00102\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010H\u0002J\u0010\u0010N\u001a\u00020\t2\u0006\u0010O\u001a\u00020\fH\u0007J\b\u0010P\u001a\u00020\u0017H\u0002J8\u0010Q\u001a\u00020\u00172\b\b\u0002\u0010R\u001a\u00020\f2\u0006\u00102\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\"2\u0006\u00108\u001a\u0002092\u0006\u0010S\u001a\u00020TJ\u000e\u0010U\u001a\u00020\u00172\u0006\u0010V\u001a\u00020\fJ\u001c\u0010W\u001a\u00020\u00172\b\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\b\u0010\\\u001a\u00020\u0017H\u0014J\b\u0010]\u001a\u00020\u0017H\u0016J\b\u0010^\u001a\u00020\u0017H\u0002J\u001c\u0010_\u001a\u00020\u00172\b\u0010`\u001a\u0004\u0018\u00010a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0006\u0010d\u001a\u00020\u0017J\u000e\u0010e\u001a\u00020\u00172\u0006\u0010f\u001a\u00020(J\u000e\u0010g\u001a\u00020\u00172\u0006\u0010f\u001a\u00020(J\u001a\u0010h\u001a\u00020\u00172\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010J\u0006\u0010i\u001a\u00020\u0017J\b\u0010j\u001a\u00020\u0017H\u0002J\u0012\u0010k\u001a\u00020\u00172\b\b\u0001\u0010l\u001a\u00020\tH\u0002J\b\u0010m\u001a\u00020\u0017H\u0002J\u001a\u0010n\u001a\u00020\u00172\b\u0010C\u001a\u0004\u0018\u00010/2\u0006\u0010V\u001a\u00020\fH\u0002J\u0018\u0010o\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010p\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010/J\u0010\u0010q\u001a\u00020\u00172\u0006\u0010r\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020(2\u0006\u0010\'\u001a\u00020(@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u001eR\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00106\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u000e\u00108\u001a\u000209X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010\u001e\u00a8\u0006v"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreStatsView;", "Lcom/google/android/material/card/MaterialCardView;", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/woocommerce/android/ui/mystore/BarChartGestureListener;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activeGranularity", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "binding", "Lcom/woocommerce/android/databinding/MyStoreStatsBinding;", "chartOrderStats", "", "", "", "chartRevenueStats", "", "chartUserInteractions", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "chartUserInteractionsJob", "Lkotlinx/coroutines/Job;", "chartVisitorStats", "conversionValue", "Lcom/google/android/material/textview/MaterialTextView;", "getConversionValue", "()Lcom/google/android/material/textview/MaterialTextView;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "fadeHandler", "Landroid/os/Handler;", "value", "", "isRequestingStats", "setRequestingStats", "(Z)V", "ordersValue", "getOrdersValue", "revenueStatsModel", "Lcom/woocommerce/android/ui/mystore/RevenueStatsUiModel;", "revenueValue", "getRevenueValue", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "statsDateValue", "getStatsDateValue", "usageTracksEventEmitter", "Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter;", "visitorsValue", "getVisitorsValue", "clearChartData", "clearStatsHeaderValues", "fadeInLabelValue", "view", "Landroid/widget/TextView;", "generateLineDataSet", "Lcom/github/mikephil/charting/data/LineDataSet;", "revenueStats", "getChartXAxisLabelCount", "getDateFromIndex", "dateIndex", "getDateValue", "dateString", "getEntryValue", "getFormattedRevenueValue", "revenue", "getFormattedVisitorStats", "visitorStats", "getStringForGranularity", "timeframe", "initChart", "initView", "period", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "loadDashboardStats", "granularity", "onChartGestureEnd", "me", "Landroid/view/MotionEvent;", "lastPerformedGesture", "Lcom/github/mikephil/charting/listener/ChartTouchListener$ChartGesture;", "onDetachedFromWindow", "onNothingSelected", "onUserInteractionWithChart", "onValueSelected", "entry", "Lcom/github/mikephil/charting/data/Entry;", "h", "Lcom/github/mikephil/charting/highlight/Highlight;", "showEmptyVisitorStatsForJetpackCP", "showErrorView", "show", "showSkeleton", "showVisitorStats", "showVisitorStatsError", "updateChartView", "updateColorForStatsHeaderValues", "colorRes", "updateConversionRate", "updateDate", "updateDateOnScrubbing", "updateView", "updateVisitorsValue", "date", "Companion", "RevenueAxisFormatter", "StartEndDateAxisFormatter", "WooCommerce_vanillaDebug"})
public final class MyStoreStatsView extends com.google.android.material.card.MaterialCardView implements com.github.mikephil.charting.listener.OnChartValueSelectedListener, com.woocommerce.android.ui.mystore.BarChartGestureListener {
    private final com.woocommerce.android.databinding.MyStoreStatsBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.mystore.MyStoreStatsView.Companion Companion = null;
    private static final int LINE_CHART_DOT_OFFSET = -5;
    private static final long EVENT_EMITTER_INTERACTION_DEBOUNCE = 1000L;
    private org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity activeGranularity;
    private com.woocommerce.android.tools.SelectedSite selectedSite;
    private com.woocommerce.android.util.DateUtils dateUtils;
    private com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter usageTracksEventEmitter;
    private com.woocommerce.android.ui.mystore.RevenueStatsUiModel revenueStatsModel;
    private java.util.Map<java.lang.String, java.lang.Double> chartRevenueStats;
    private java.util.Map<java.lang.String, java.lang.Long> chartOrderStats;
    private java.util.Map<java.lang.String, java.lang.Integer> chartVisitorStats;
    private com.woocommerce.android.widgets.SkeletonView skeletonView;
    private boolean isRequestingStats = false;
    private final android.os.Handler fadeHandler = null;
    private kotlinx.coroutines.CoroutineScope coroutineScope;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> chartUserInteractions = null;
    private kotlinx.coroutines.Job chartUserInteractionsJob;
    
    @kotlin.jvm.JvmOverloads()
    public MyStoreStatsView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MyStoreStatsView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public MyStoreStatsView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void setRequestingStats(boolean value) {
    }
    
    private final com.google.android.material.textview.MaterialTextView getStatsDateValue() {
        return null;
    }
    
    private final com.google.android.material.textview.MaterialTextView getRevenueValue() {
        return null;
    }
    
    private final com.google.android.material.textview.MaterialTextView getOrdersValue() {
        return null;
    }
    
    private final com.google.android.material.textview.MaterialTextView getVisitorsValue() {
        return null;
    }
    
    private final com.google.android.material.textview.MaterialTextView getConversionValue() {
        return null;
    }
    
    public final void initView(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity period, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils dateUtils, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter usageTracksEventEmitter, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleCoroutineScope lifecycleScope) {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public final void loadDashboardStats(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
    }
    
    public final void showSkeleton(boolean show) {
    }
    
    private final int getChartXAxisLabelCount() {
        return 0;
    }
    
    /**
     * One-time chart initialization with settings common to all granularities.
     */
    private final void initChart() {
    }
    
    /**
     * Called when nothing has been selected or an "un-select" has been made.
     */
    @java.lang.Override()
    public void onNothingSelected() {
    }
    
    private final void onUserInteractionWithChart() {
    }
    
    private final void updateColorForStatsHeaderValues(@androidx.annotation.ColorRes()
    int colorRes) {
    }
    
    /**
     * Method to update the date value for a given [revenueStatsModel] based on the [granularity]
     * This is used to display the date bar when the **stats tab is loaded**
     * [StatsGranularity.DAYS] would be Tuesday, Aug 08
     * [StatsGranularity.WEEKS] would be Aug 4 - Aug 08
     * [StatsGranularity.MONTHS] would be August
     * [StatsGranularity.YEARS] would be 2019
     */
    private final void updateDate(com.woocommerce.android.ui.mystore.RevenueStatsUiModel revenueStats, org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
    }
    
    /**
     * Method to get the date value for a given [dateString] based on the [activeGranularity]
     * This is used to populate the date bar when the **stats tab is loaded**
     * [StatsGranularity.DAYS] would be Tuesday, Aug 08
     * [StatsGranularity.WEEKS] would be Aug 4
     * [StatsGranularity.MONTHS] would be August
     * [StatsGranularity.YEARS] would be 2019
     */
    private final java.lang.String getDateValue(java.lang.String dateString, org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity activeGranularity) {
        return null;
    }
    
    @java.lang.Override()
    public void onValueSelected(@org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.data.Entry entry, @org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.highlight.Highlight h) {
    }
    
    private final void updateVisitorsValue(java.lang.String date) {
    }
    
    /**
     * Method to update the date value for a given [dateString] based on the [activeGranularity]
     * This is used to display the date bar when the **scrubbing interaction is taking place**
     * [StatsGranularity.DAYS] would be Tuesday, Aug 08›7am
     * [StatsGranularity.WEEKS] would be Aug 08
     * [StatsGranularity.MONTHS] would be August›08
     * [StatsGranularity.YEARS] would be 2019›August
     */
    private final void updateDateOnScrubbing(java.lang.String dateString, org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity activeGranularity) {
    }
    
    /**
     * Method called when a touch-gesture has ended on the chart (ACTION_UP, ACTION_CANCEL)
     * If the touch gesture has ended, then display the entire chart data again
     */
    @java.lang.Override()
    public void onChartGestureEnd(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me, @org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture lastPerformedGesture) {
    }
    
    public final void updateView(@org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.mystore.RevenueStatsUiModel revenueStatsModel) {
    }
    
    public final void showErrorView(boolean show) {
    }
    
    public final void showVisitorStats(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> visitorStats) {
    }
    
    public final void showVisitorStatsError() {
    }
    
    public final void showEmptyVisitorStatsForJetpackCP() {
    }
    
    private final void updateConversionRate() {
    }
    
    public final void clearStatsHeaderValues() {
    }
    
    public final void clearChartData() {
    }
    
    private final void updateChartView() {
    }
    
    private final java.lang.String getFormattedRevenueValue(double revenue) {
        return null;
    }
    
    private final java.lang.String getDateFromIndex(int dateIndex) {
        return null;
    }
    
    /**
     * Method to format the incoming visitor stats data
     * The [visitorStats] map keys are in a different date format compared to [chartRevenueStats] map date format.
     * To add scrubbing interaction, we are converting the [visitorStats] date format to [chartRevenueStats] date format
     * [StatsGranularity.WEEKS] format is the same for both
     * [StatsGranularity.MONTHS] format is the same for both
     * [StatsGranularity.YEARS] visitor stats date format (yyyy-MM-dd) to yyyy-MM
     * [StatsGranularity.DAYS] format is the same for both
     */
    private final java.util.Map<java.lang.String, java.lang.Integer> getFormattedVisitorStats(java.util.Map<java.lang.String, java.lang.Integer> visitorStats) {
        return null;
    }
    
    private final void fadeInLabelValue(android.widget.TextView view, java.lang.String value) {
    }
    
    private final com.github.mikephil.charting.data.LineDataSet generateLineDataSet(java.util.Map<java.lang.String, java.lang.Double> revenueStats) {
        return null;
    }
    
    @androidx.annotation.StringRes()
    public final int getStringForGranularity(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity timeframe) {
        return 0;
    }
    
    private final java.lang.String getEntryValue(java.lang.String dateString) {
        return null;
    }
    
    @java.lang.Override()
    public void onChartDoubleTapped(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me) {
    }
    
    @java.lang.Override()
    public void onChartFling(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me1, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me2, float velocityX, float velocityY) {
    }
    
    @java.lang.Override()
    public void onChartGestureStart(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me, @org.jetbrains.annotations.Nullable()
    com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture lastPerformedGesture) {
    }
    
    @java.lang.Override()
    public void onChartLongPressed(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me) {
    }
    
    @java.lang.Override()
    public void onChartScale(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me, float scaleX, float scaleY) {
    }
    
    @java.lang.Override()
    public void onChartSingleTapped(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me) {
    }
    
    @java.lang.Override()
    public void onChartTranslate(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent me, float dX, float dY) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreStatsView$StartEndDateAxisFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "(Lcom/woocommerce/android/ui/mystore/MyStoreStatsView;)V", "getAxisLabel", "", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "getLabelValue", "dateString", "getWeekLabelValue", "WooCommerce_vanillaDebug"})
    final class StartEndDateAxisFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
        
        public StartEndDateAxisFormatter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAxisLabel(float value, @org.jetbrains.annotations.NotNull()
        com.github.mikephil.charting.components.AxisBase axis) {
            return null;
        }
        
        /**
         * Displays the x-axis labels in the following format based on [StatsGranularity]
         * [StatsGranularity.DAYS] would be 7am, 8am, 9am
         * [StatsGranularity.WEEKS] would be Aug 31, Sept 1, 2, 3
         * [StatsGranularity.MONTHS] would be Aug 1, 2, 3
         * [StatsGranularity.YEARS] would be Jan, Feb, Mar
         */
        private final java.lang.String getLabelValue(java.lang.String dateString) {
            return null;
        }
        
        /**
         * Method returns the formatted date for the [StatsGranularity.WEEKS] tab,
         * if the date string is the first day of the month. i.e. date is equal to 1,
         * then the formatted date would be `MM-d` format.
         * Otherwise the formatted date would be `d` format
         */
        private final java.lang.String getWeekLabelValue(java.lang.String dateString) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreStatsView$RevenueAxisFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "(Lcom/woocommerce/android/ui/mystore/MyStoreStatsView;)V", "getAxisLabel", "", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "WooCommerce_vanillaDebug"})
    final class RevenueAxisFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
        
        public RevenueAxisFormatter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAxisLabel(float value, @org.jetbrains.annotations.NotNull()
        com.github.mikephil.charting.components.AxisBase axis) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreStatsView$Companion;", "", "()V", "EVENT_EMITTER_INTERACTION_DEBOUNCE", "", "LINE_CHART_DOT_OFFSET", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}