package com.woocommerce.android.ui.orders.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0080\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020@H\u0002J\b\u0010B\u001a\u00020@H\u0002J\u0010\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020\u001aH\u0002J\b\u0010E\u001a\u00020@H\u0002J\b\u0010F\u001a\u00020%H\u0016J\u0010\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020%H\u0002J\b\u0010I\u001a\u00020@H\u0002J\u0010\u0010J\u001a\u00020@2\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020@H\u0002J\b\u0010N\u001a\u00020@H\u0002J\b\u0010O\u001a\u00020\u001aH\u0002J\u0012\u0010P\u001a\u00020@2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0018\u0010S\u001a\u00020@2\u0006\u0010T\u001a\u00020 2\u0006\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020@H\u0016J\b\u0010X\u001a\u00020@H\u0002J\b\u0010Y\u001a\u00020@H\u0002J\u0012\u0010Z\u001a\u00020\u001a2\b\u0010[\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010\\\u001a\u00020\u001a2\b\u0010[\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010]\u001a\u00020\u001a2\u0006\u0010[\u001a\u00020$H\u0016J\u0010\u0010^\u001a\u00020@2\u0006\u0010T\u001a\u00020 H\u0016J\u0010\u0010_\u001a\u00020\u001a2\u0006\u0010`\u001a\u00020%H\u0016J\u0010\u0010a\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020%H\u0016J\b\u0010b\u001a\u00020@H\u0016J\u0010\u0010c\u001a\u00020@2\u0006\u0010d\u001a\u00020RH\u0016J\u001a\u0010e\u001a\u00020@2\u0006\u0010f\u001a\u00020g2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0012\u0010h\u001a\u00020@2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\b\u0010i\u001a\u00020@H\u0002J\"\u0010j\u001a\u00020@2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020%2\b\u0010n\u001a\u0004\u0018\u00010gH\u0016J\b\u0010o\u001a\u00020@H\u0002J\b\u0010p\u001a\u00020@H\u0002J\u0010\u0010q\u001a\u00020@2\u0006\u0010r\u001a\u00020\u0016H\u0002J\b\u0010s\u001a\u00020@H\u0016J\b\u0010t\u001a\u00020\u001aH\u0016J\b\u0010u\u001a\u00020\u001aH\u0002J\u0010\u0010v\u001a\u00020@2\u0006\u0010D\u001a\u00020\u001aH\u0002J\b\u0010w\u001a\u00020@H\u0002J\b\u0010x\u001a\u00020@H\u0002J\b\u0010y\u001a\u00020@H\u0002J\u0010\u0010z\u001a\u00020@2\u0006\u0010H\u001a\u00020%H\u0002J\u0010\u0010{\u001a\u00020@2\u0006\u0010H\u001a\u00020%H\u0002J\u0018\u0010|\u001a\u00020@2\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00020\u007f\u0018\u00010~H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020%8B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u00020.8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<\u00a8\u0006\u0081\u0001"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListFragment;", "Lcom/woocommerce/android/ui/base/TopLevelFragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Landroid/view/MenuItem$OnActionExpandListener;", "Lcom/woocommerce/android/ui/orders/list/OrderListListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentOrderListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentOrderListBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "emptyView", "Lcom/woocommerce/android/widgets/WCEmptyView;", "getEmptyView", "()Lcom/woocommerce/android/widgets/WCEmptyView;", "feedbackState", "Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "getFeedbackState", "()Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "value", "", "isSearching", "()Z", "setSearching", "(Z)V", "orderListMenu", "Landroid/view/Menu;", "searchHandler", "Landroid/os/Handler;", "searchMenuItem", "Landroid/view/MenuItem;", "", "searchQuery", "getSearchQuery", "()Ljava/lang/String;", "setSearchQuery", "(Ljava/lang/String;)V", "searchView", "Landroidx/appcompat/widget/SearchView;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "getSelectedSite$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/tools/SelectedSite;", "setSelectedSite$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/tools/SelectedSite;)V", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/list/OrderListViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/list/OrderListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkOrientation", "", "clearSearchResults", "disableSearchListeners", "displaySimplePaymentsWIPCard", "show", "enableSearchListeners", "getFragmentTitle", "handleNewSearchRequest", "query", "hideEmptyView", "initCreateOrderFAB", "fabButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "initObservers", "initializeResultHandlers", "isChildFragmentShowing", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onDismissWIPCardClicked", "onGiveFeedbackClicked", "onMenuItemActionCollapse", "item", "onMenuItemActionExpand", "onOptionsItemSelected", "onPrepareOptionsMenu", "onQueryTextChange", "newText", "onQueryTextSubmit", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "onViewStateRestored", "openOrderCreationFragment", "openOrderDetail", "orderId", "", "orderStatus", "sharedView", "refreshOptionsMenu", "refreshOrders", "registerFeedbackSetting", "state", "scrollToTop", "shouldExpandToolbar", "shouldShowSearchMenuItem", "showOptionsMenu", "showOrderCreationBottomSheet", "showOrderFilters", "showSimplePaymentsDialog", "submitSearchDelayed", "submitSearchQuery", "updatePagedListData", "pagedListData", "Landroidx/paging/PagedList;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OrderListFragment extends com.woocommerce.android.ui.base.TopLevelFragment implements androidx.appcompat.widget.SearchView.OnQueryTextListener, android.view.MenuItem.OnActionExpandListener, com.woocommerce.android.ui.orders.list.OrderListListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.list.OrderListFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "OrderListFragment";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STATE_KEY_SEARCH_QUERY = "search-query";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STATE_KEY_IS_SEARCHING = "is_searching";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILTER_CHANGE_NOTICE_KEY = "filters_changed_notice";
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.tools.SelectedSite selectedSite;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.view.Menu orderListMenu;
    private android.view.MenuItem searchMenuItem;
    private androidx.appcompat.widget.SearchView searchView;
    private final android.os.Handler searchHandler = null;
    private com.woocommerce.android.databinding.FragmentOrderListBinding _binding;
    
    public OrderListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setUiMessageResolver$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.SelectedSite getSelectedSite$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setSelectedSite$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setCurrencyFormatter$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    private final com.woocommerce.android.ui.orders.list.OrderListViewModel getViewModel() {
        return null;
    }
    
    private final void setSearching(boolean value) {
    }
    
    private final boolean isSearching() {
        return false;
    }
    
    private final com.woocommerce.android.databinding.FragmentOrderListBinding getBinding() {
        return null;
    }
    
    private final void setSearchQuery(java.lang.String value) {
    }
    
    private final java.lang.String getSearchQuery() {
        return null;
    }
    
    private final com.woocommerce.android.widgets.WCEmptyView getEmptyView() {
        return null;
    }
    
    private final com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState getFeedbackState() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    /**
     * This is a replacement for activity?.invalidateOptionsMenu() since that causes the
     * search menu item to collapse
     */
    private final void refreshOptionsMenu() {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initCreateOrderFAB(com.google.android.material.floatingactionbutton.FloatingActionButton fabButton) {
    }
    
    private final boolean isChildFragmentShowing() {
        return false;
    }
    
    private final boolean shouldShowSearchMenuItem() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void scrollToTop() {
    }
    
    @kotlin.Suppress(names = {"LongMethod"})
    private final void initObservers() {
    }
    
    private final void initializeResultHandlers() {
    }
    
    private final void showOrderFilters() {
    }
    
    private final void showSimplePaymentsDialog() {
    }
    
    private final void showOrderCreationBottomSheet() {
    }
    
    private final void openOrderCreationFragment() {
    }
    
    private final void hideEmptyView() {
    }
    
    private final void updatePagedListData(androidx.paging.PagedList<com.woocommerce.android.ui.orders.list.OrderListItemUIType> pagedListData) {
    }
    
    /**
     * We use this to clear the options menu when navigating to a child destination - otherwise this
     * fragment's menu will continue to appear when the child is shown
     */
    private final void showOptionsMenu(boolean show) {
    }
    
    @java.lang.Override
    public void openOrderDetail(long orderId, @org.jetbrains.annotations.NotNull
    java.lang.String orderStatus, @org.jetbrains.annotations.Nullable
    android.view.View sharedView) {
    }
    
    @java.lang.Override
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override
    public boolean onQueryTextChange(@org.jetbrains.annotations.NotNull
    java.lang.String newText) {
        return false;
    }
    
    @java.lang.Override
    public boolean onMenuItemActionExpand(@org.jetbrains.annotations.Nullable
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public boolean onMenuItemActionCollapse(@org.jetbrains.annotations.Nullable
    android.view.MenuItem item) {
        return false;
    }
    
    private final void clearSearchResults() {
    }
    
    /**
     * Submit the search after a brief delay unless the query has changed - this is used to
     * perform a search while the user is typing
     */
    private final void submitSearchDelayed(java.lang.String query) {
    }
    
    /**
     * Only fired while the user is actively typing in the search
     * field.
     */
    private final void handleNewSearchRequest(java.lang.String query) {
    }
    
    /**
     * Loads a new list with the search query. This can be called while the
     * user is interacting with the search component, or to reload the
     * view state.
     */
    private final void submitSearchQuery(java.lang.String query) {
    }
    
    private final void refreshOrders() {
    }
    
    private final void disableSearchListeners() {
    }
    
    /**
     * Method called when user clicks on the search menu icon.
     *
     * 1. The settings menu is hidden when the search filter is active to prevent the search view
     *   getting collapsed if the settings menu from the [MainActivity] is clicked.
     * 2. The order status list view is displayed by default
     */
    private final void enableSearchListeners() {
    }
    
    private final void checkOrientation() {
    }
    
    @java.lang.Override
    public boolean shouldExpandToolbar() {
        return false;
    }
    
    private final void displaySimplePaymentsWIPCard(boolean show) {
    }
    
    private final void onGiveFeedbackClicked() {
    }
    
    private final void onDismissWIPCardClicked() {
    }
    
    private final void registerFeedbackSetting(com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState state) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListFragment$Companion;", "", "()V", "FILTER_CHANGE_NOTICE_KEY", "", "STATE_KEY_IS_SEARCHING", "STATE_KEY_SEARCH_QUERY", "TAG", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}