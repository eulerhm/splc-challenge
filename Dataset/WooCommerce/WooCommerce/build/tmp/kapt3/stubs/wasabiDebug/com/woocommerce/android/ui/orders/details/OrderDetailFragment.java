package com.woocommerce.android.ui.orders.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u0002:\u0002\u0093\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002J \u0010K\u001a\u00020H2\u0006\u0010L\u001a\u0002042\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u000204H\u0016J\b\u0010R\u001a\u00020HH\u0002J\u0012\u0010S\u001a\u00020H2\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\u0018\u0010V\u001a\u00020H2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020HH\u0016J\b\u0010\\\u001a\u00020HH\u0002J\b\u0010]\u001a\u00020HH\u0002J\u0010\u0010^\u001a\u00020J2\u0006\u0010_\u001a\u00020 H\u0016J\b\u0010`\u001a\u00020HH\u0016J\b\u0010a\u001a\u00020HH\u0016J\u001a\u0010b\u001a\u00020H2\u0006\u0010c\u001a\u00020d2\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010e\u001a\u00020H2\u0006\u0010f\u001a\u00020gH\u0016J\u0018\u0010h\u001a\u00020H2\u0006\u0010f\u001a\u00020g2\u0006\u0010i\u001a\u00020gH\u0016J\u0010\u0010j\u001a\u00020H2\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010k\u001a\u00020H2\u0006\u0010l\u001a\u00020\u001cH\u0002J\u0010\u0010m\u001a\u00020H2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010n\u001a\u00020H2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010o\u001a\u00020H2\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010p\u001a\u00020H2\u0006\u0010q\u001a\u0002042\u0006\u0010r\u001a\u000204H\u0002J\u0010\u0010s\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010t\u001a\u00020H2\u0006\u0010u\u001a\u00020JH\u0002J\u0010\u0010v\u001a\u00020H2\u0006\u0010u\u001a\u00020JH\u0002J \u0010w\u001a\u00020H2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020J2\u0006\u0010{\u001a\u00020JH\u0002J\u0016\u0010|\u001a\u00020H2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u007f0~H\u0002J\"\u0010\u0080\u0001\u001a\u00020H2\u000e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010~2\u0007\u0010\u0083\u0001\u001a\u000204H\u0002J!\u0010\u0084\u0001\u001a\u00020H2\u000e\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010~2\u0006\u0010x\u001a\u00020yH\u0002J\u0013\u0010\u0087\u0001\u001a\u00020H2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0002J\u0011\u0010\u008a\u0001\u001a\u00020H2\u0006\u0010u\u001a\u00020JH\u0002J\u0019\u0010\u008b\u0001\u001a\u00020H2\u000e\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010~H\u0002J\u0011\u0010\u008e\u0001\u001a\u00020H2\u0006\u0010u\u001a\u00020JH\u0002J\"\u0010\u008f\u0001\u001a\u00020H2\u000e\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010~2\u0007\u0010\u0083\u0001\u001a\u000204H\u0002J\u0011\u0010\u0092\u0001\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00105\u001a\u0002042\u0006\u00103\u001a\u000204@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bD\u0010E\u00a8\u0006\u0094\u0001"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/orders/OrderProductActionListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentOrderDetailBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentOrderDetailBinding;", "cardReaderManager", "Lcom/woocommerce/android/cardreader/CardReaderManager;", "getCardReaderManager", "()Lcom/woocommerce/android/cardreader/CardReaderManager;", "setCardReaderManager", "(Lcom/woocommerce/android/cardreader/CardReaderManager;)V", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "getDateUtils", "()Lcom/woocommerce/android/util/DateUtils;", "setDateUtils", "(Lcom/woocommerce/android/util/DateUtils;)V", "feedbackState", "Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "getFeedbackState", "()Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "menuSharePaymentLink", "Landroid/view/MenuItem;", "navigator", "Lcom/woocommerce/android/ui/orders/OrderNavigator;", "getNavigator", "()Lcom/woocommerce/android/ui/orders/OrderNavigator;", "setNavigator", "(Lcom/woocommerce/android/ui/orders/OrderNavigator;)V", "orderEditingViewModel", "Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel;", "getOrderEditingViewModel", "()Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel;", "orderEditingViewModel$delegate", "Lkotlin/Lazy;", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "getProductImageMap", "()Lcom/woocommerce/android/tools/ProductImageMap;", "setProductImageMap", "(Lcom/woocommerce/android/tools/ProductImageMap;)V", "value", "", "screenTitle", "setScreenTitle", "(Ljava/lang/String;)V", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "undoSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "viewModel", "Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/details/OrderDetailViewModel;", "viewModel$delegate", "displayShippingLabelsWIPCard", "", "show", "", "displayUndoSnackbar", "message", "actionListener", "Landroid/view/View$OnClickListener;", "dismissCallback", "Lcom/google/android/material/snackbar/Snackbar$Callback;", "getFragmentTitle", "navigateToInstallWcShippingFlow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onDismissProductWIPNoticeCardClicked", "onGiveFeedbackClicked", "onOptionsItemSelected", "item", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "openOrderProductDetail", "remoteProductId", "", "openOrderProductVariationDetail", "remoteVariationId", "refreshProduct", "registerFeedbackSetting", "state", "setupObservers", "setupOrderEditingObservers", "setupResultHandlers", "sharePaymentUrl", "storeName", "paymentUrl", "showAddShipmentTracking", "showInstallWcShippingBanner", "isVisible", "showMarkOrderCompleteButton", "showOrderDetail", "order", "Lcom/woocommerce/android/model/Order;", "isPaymentCollectableWithCardReader", "isReceiptButtonsVisible", "showOrderNotes", "orderNotes", "", "Lcom/woocommerce/android/model/OrderNote;", "showOrderProducts", "products", "Lcom/woocommerce/android/model/Order$Item;", "currency", "showOrderRefunds", "refunds", "Lcom/woocommerce/android/model/Refund;", "showOrderStatus", "orderStatus", "Lcom/woocommerce/android/model/Order$OrderStatus;", "showProductListMenuButton", "showShipmentTrackings", "shipmentTrackings", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "showShippingLabelButton", "showShippingLabels", "shippingLabels", "Lcom/woocommerce/android/model/ShippingLabel;", "showSkeleton", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OrderDetailFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.orders.OrderProductActionListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.details.OrderDetailFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy orderEditingViewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.ui.orders.OrderNavigator navigator;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.tools.ProductImageMap productImageMap;
    @javax.inject.Inject
    public com.woocommerce.android.util.DateUtils dateUtils;
    @javax.inject.Inject
    public com.woocommerce.android.cardreader.CardReaderManager cardReaderManager;
    private com.woocommerce.android.databinding.FragmentOrderDetailBinding _binding;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private com.google.android.material.snackbar.Snackbar undoSnackbar;
    private android.view.MenuItem menuSharePaymentLink;
    private java.lang.String screenTitle = "";
    
    public OrderDetailFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.details.OrderDetailViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel getOrderEditingViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.OrderNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.OrderNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.ProductImageMap getProductImageMap() {
        return null;
    }
    
    public final void setProductImageMap(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.DateUtils getDateUtils() {
        return null;
    }
    
    public final void setDateUtils(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.DateUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.cardreader.CardReaderManager getCardReaderManager() {
        return null;
    }
    
    public final void setCardReaderManager(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.cardreader.CardReaderManager p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentOrderDetailBinding getBinding() {
        return null;
    }
    
    private final void setScreenTitle(java.lang.String value) {
    }
    
    private final com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState getFeedbackState() {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void openOrderProductDetail(long remoteProductId) {
    }
    
    @java.lang.Override
    public void openOrderProductVariationDetail(long remoteProductId, long remoteVariationId) {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.orders.details.OrderDetailViewModel viewModel) {
    }
    
    private final void navigateToInstallWcShippingFlow() {
    }
    
    private final void showInstallWcShippingBanner(boolean isVisible) {
    }
    
    private final void setupOrderEditingObservers(com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel orderEditingViewModel) {
    }
    
    private final void setupResultHandlers(com.woocommerce.android.ui.orders.details.OrderDetailViewModel viewModel) {
    }
    
    private final void showOrderDetail(com.woocommerce.android.model.Order order, boolean isPaymentCollectableWithCardReader, boolean isReceiptButtonsVisible) {
    }
    
    private final void showOrderStatus(com.woocommerce.android.model.Order.OrderStatus orderStatus) {
    }
    
    private final void showMarkOrderCompleteButton(boolean isVisible) {
    }
    
    private final void showShippingLabelButton(boolean isVisible) {
    }
    
    private final void showProductListMenuButton(boolean isVisible) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void sharePaymentUrl(java.lang.String storeName, java.lang.String paymentUrl) {
    }
    
    private final void refreshProduct(long remoteProductId) {
    }
    
    private final void showOrderNotes(java.util.List<com.woocommerce.android.model.OrderNote> orderNotes) {
    }
    
    private final void showOrderRefunds(java.util.List<com.woocommerce.android.model.Refund> refunds, com.woocommerce.android.model.Order order) {
    }
    
    private final void showOrderProducts(java.util.List<com.woocommerce.android.model.Order.Item> products, java.lang.String currency) {
    }
    
    private final void showAddShipmentTracking(boolean show) {
    }
    
    private final void showShipmentTrackings(java.util.List<com.woocommerce.android.model.OrderShipmentTracking> shipmentTrackings) {
    }
    
    private final void showShippingLabels(java.util.List<com.woocommerce.android.model.ShippingLabel> shippingLabels, java.lang.String currency) {
    }
    
    private final void displayShippingLabelsWIPCard(boolean show) {
    }
    
    private final void onGiveFeedbackClicked() {
    }
    
    private final void onDismissProductWIPNoticeCardClicked() {
    }
    
    private final void registerFeedbackSetting(com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState state) {
    }
    
    private final void displayUndoSnackbar(java.lang.String message, android.view.View.OnClickListener actionListener, com.google.android.material.snackbar.Snackbar.Callback dismissCallback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
    }
}