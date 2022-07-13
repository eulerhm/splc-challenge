package com.woocommerce.android.ui.orders.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0003J\u0018\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u0007H\u0002J\u0018\u00101\u001a\u00020)2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020-H\u0002J \u00105\u001a\u00020)2\u0006\u00106\u001a\u00020+2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0002J\b\u0010:\u001a\u00020\u0007H\u0016J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0018\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\rH\u0016J\b\u0010J\u001a\u00020HH\u0016J\b\u0010K\u001a\u00020)H\u0016J\u001a\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020%2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010P\u001a\u00020)H\u0002J\u0010\u0010Q\u001a\u00020)2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010R\u001a\u00020)2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010S\u001a\u00020)2\u0006\u0010T\u001a\u00020HH\u0002J\b\u0010U\u001a\u00020)H\u0002J\u0014\u0010V\u001a\u00020)*\u0002032\u0006\u00104\u001a\u00020-H\u0002J\f\u0010W\u001a\u00020)*\u00020XH\u0002J\f\u0010Y\u001a\u00020)*\u00020@H\u0002J\f\u0010Z\u001a\u00020)*\u00020@H\u0002J\f\u0010[\u001a\u00020)*\u00020@H\u0002J\f\u0010\\\u001a\u00020)*\u00020@H\u0002J\f\u0010]\u001a\u00020)*\u00020@H\u0002J\f\u0010^\u001a\u00020)*\u00020@H\u0002R\'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'\u00a8\u0006_"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationFormFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "bigDecimalFormatter", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "getBigDecimalFormatter", "()Lkotlin/jvm/functions/Function1;", "bigDecimalFormatter$delegate", "Lkotlin/Lazy;", "createOrderMenuItem", "Landroid/view/MenuItem;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "orderUpdateFailureSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "viewModel$delegate", "productsAdapter", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationProductsAdapter;", "Landroid/view/View;", "getProductsAdapter", "(Landroid/view/View;)Lcom/woocommerce/android/ui/orders/creation/OrderCreationProductsAdapter;", "bindCustomerAddressSection", "", "customerAddressSection", "Lcom/woocommerce/android/ui/orders/creation/views/OrderCreationSectionView;", "order", "Lcom/woocommerce/android/model/Order;", "bindNotesSection", "notesSection", "customerNote", "bindPaymentSection", "paymentSection", "Lcom/woocommerce/android/databinding/OrderCreationPaymentSectionBinding;", "newOrderData", "bindProductsSection", "productsSection", "products", "", "Lcom/woocommerce/android/ui/orders/creation/ProductUIModel;", "getFragmentTitle", "handleViewModelEvents", "event", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "hideEditableControls", "binding", "Lcom/woocommerce/android/databinding/FragmentOrderCreationFormBinding;", "hideProgressDialog", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onStop", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "setupHandleResults", "setupObserversWith", "showEditableControls", "showOrHideErrorSnackBar", "show", "showProgressDialog", "bindFeesSubSection", "changeState", "Lcom/woocommerce/android/databinding/LayoutOrderCreationCustomerInfoBinding;", "initCustomerSection", "initNotesSection", "initOrderStatusView", "initPaymentSection", "initProductsSection", "initView", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OrderCreationFormFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private android.view.MenuItem createOrderMenuItem;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private com.google.android.material.snackbar.Snackbar orderUpdateFailureSnackBar;
    private final kotlin.Lazy bigDecimalFormatter$delegate = null;
    
    public OrderCreationFormFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel getViewModel() {
        return null;
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
    
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> getBigDecimalFormatter() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationProductsAdapter getProductsAdapter(android.view.View $this$productsAdapter) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    public void onStop() {
    }
    
    private final void initView(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding $this$initView) {
    }
    
    private final void initOrderStatusView(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding $this$initOrderStatusView) {
    }
    
    private final void initNotesSection(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding $this$initNotesSection) {
    }
    
    private final void initCustomerSection(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding $this$initCustomerSection) {
    }
    
    private final void initProductsSection(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding $this$initProductsSection) {
    }
    
    private final void initPaymentSection(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding $this$initPaymentSection) {
    }
    
    private final void changeState(com.woocommerce.android.databinding.LayoutOrderCreationCustomerInfoBinding $this$changeState) {
    }
    
    private final void setupObserversWith(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding binding) {
    }
    
    private final void bindPaymentSection(com.woocommerce.android.databinding.OrderCreationPaymentSectionBinding paymentSection, com.woocommerce.android.model.Order newOrderData) {
    }
    
    private final void bindFeesSubSection(com.woocommerce.android.databinding.OrderCreationPaymentSectionBinding $this$bindFeesSubSection, com.woocommerce.android.model.Order newOrderData) {
    }
    
    private final void bindNotesSection(com.woocommerce.android.ui.orders.creation.views.OrderCreationSectionView notesSection, java.lang.String customerNote) {
    }
    
    private final void bindProductsSection(com.woocommerce.android.ui.orders.creation.views.OrderCreationSectionView productsSection, java.util.List<com.woocommerce.android.ui.orders.creation.ProductUIModel> products) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void bindCustomerAddressSection(com.woocommerce.android.ui.orders.creation.views.OrderCreationSectionView customerAddressSection, com.woocommerce.android.model.Order order) {
    }
    
    private final void setupHandleResults() {
    }
    
    private final void handleViewModelEvents(com.woocommerce.android.viewmodel.MultiLiveEvent.Event event) {
    }
    
    private final void showProgressDialog() {
    }
    
    @kotlin.Suppress(names = {"MagicNumber"})
    private final void showOrHideErrorSnackBar(boolean show) {
    }
    
    private final void hideProgressDialog() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void showEditableControls(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding binding) {
    }
    
    private final void hideEditableControls(com.woocommerce.android.databinding.FragmentOrderCreationFormBinding binding) {
    }
}