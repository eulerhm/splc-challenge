package com.woocommerce.android.ui.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0014J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/login/MagicLinkInterceptViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "magicLinkInterceptRepository", "Lcom/woocommerce/android/ui/login/MagicLinkInterceptRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/login/MagicLinkInterceptRepository;)V", "_isAuthTokenUpdated", "Landroidx/lifecycle/MutableLiveData;", "", "_isLoading", "_showRetryOption", "Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "_showSnackbarMessage", "", "isAuthTokenUpdated", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isLoading", "showRetryOption", "getShowRetryOption", "showSnackbarMessage", "getShowSnackbarMessage", "fetchAccountInfo", "", "handleRequestResultResponse", "requestResult", "Lcom/woocommerce/android/model/RequestResult;", "onCleared", "updateMagicLinkAuthToken", "authToken", "", "WooCommerce_wasabiDebug"})
public final class MagicLinkInterceptViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.login.MagicLinkInterceptRepository magicLinkInterceptRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isAuthTokenUpdated = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isAuthTokenUpdated = null;
    private final com.woocommerce.android.viewmodel.SingleLiveEvent<java.lang.Integer> _showSnackbarMessage = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Integer> showSnackbarMessage = null;
    private final com.woocommerce.android.viewmodel.SingleLiveEvent<java.lang.Boolean> _showRetryOption = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showRetryOption = null;
    
    @javax.inject.Inject
    public MagicLinkInterceptViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.MagicLinkInterceptRepository magicLinkInterceptRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isAuthTokenUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getShowSnackbarMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowRetryOption() {
        return null;
    }
    
    public final void updateMagicLinkAuthToken(@org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
    }
    
    public final void fetchAccountInfo() {
    }
    
    private final void handleRequestResultResponse(com.woocommerce.android.model.RequestResult requestResult) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}