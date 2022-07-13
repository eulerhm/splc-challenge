package com.woocommerce.android.ui.orders.details.editing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020\"H\u0004J\u0012\u0010&\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0017J\u0018\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0017J\u0010\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\fH\u0017J\u0010\u00100\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0017J\b\u00101\u001a\u00020$H\u0017J\u001a\u00102\u001a\u00020\"2\u0006\u00103\u001a\u0002042\b\u0010\'\u001a\u0004\u0018\u00010(H\u0017J\b\u00105\u001a\u00020$H&J\b\u00106\u001a\u00020\"H\u0002J\b\u00107\u001a\u00020\"H\u0002J\b\u00108\u001a\u00020\"H\u0002J\b\u00109\u001a\u00020\"H\u0004R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006:"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/BaseOrderEditingFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "layoutId", "", "(I)V", "analyticsValue", "", "getAnalyticsValue", "()Ljava/lang/String;", "doneMenuItem", "Landroid/view/MenuItem;", "getDoneMenuItem", "()Landroid/view/MenuItem;", "setDoneMenuItem", "(Landroid/view/MenuItem;)V", "sharedViewModel", "Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel;", "getSharedViewModel", "()Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "textWatcher", "Landroid/text/TextWatcher;", "getTextWatcher", "()Landroid/text/TextWatcher;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "confirmDiscard", "", "hasChanges", "", "navigateUp", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "item", "onPrepareOptionsMenu", "onRequestAllowBackPress", "onViewCreated", "view", "Landroid/view/View;", "saveChanges", "setupObservers", "trackEventCanceled", "trackEventStarted", "updateDoneMenuItem", "WooCommerce_wasabiDebug"})
public abstract class BaseOrderEditingFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @org.jetbrains.annotations.Nullable
    private android.view.MenuItem doneMenuItem;
    
    /**
     * This TextWatcher can be used to detect EditText changes in any order editing fragment
     */
    @org.jetbrains.annotations.NotNull
    private final android.text.TextWatcher textWatcher = null;
    
    public BaseOrderEditingFragment() {
        super();
    }
    
    public BaseOrderEditingFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    protected final android.view.MenuItem getDoneMenuItem() {
        return null;
    }
    
    protected final void setDoneMenuItem(@org.jetbrains.annotations.Nullable
    android.view.MenuItem p0) {
    }
    
    /**
     * The value to pass to analytics for the specific screen, used to record when the user enters or
     * exits the screen. Should be one of:
     *     AnalyticsTracker.ORDER_EDIT_CUSTOMER_NOTE
     *     AnalyticsTracker.ORDER_EDIT_SHIPPING_ADDRESS
     *     AnalyticsTracker.ORDER_EDIT_BILLING_ADDRESS
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getAnalyticsValue();
    
    @org.jetbrains.annotations.NotNull
    protected final android.text.TextWatcher getTextWatcher() {
        return null;
    }
    
    /**
     * Descendants should return true if the user made any changes
     */
    public abstract boolean hasChanges();
    
    /**
     * Descendants should override this to tell the shared view model to save specific changes. Note that
     * since we're using optimistic updating, a True result doesn't necessarily mean the update succeeded,
     * just that it was sent. A False result means the request couldn't be sent, either due to connection
     * problems or validation issues.
     */
    public abstract boolean saveChanges();
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
    }
    
    private final void setupObservers() {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    protected final void updateDoneMenuItem() {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void confirmDiscard() {
    }
    
    protected final void navigateUp() {
    }
    
    private final void trackEventStarted() {
    }
    
    private final void trackEventCanceled() {
    }
}