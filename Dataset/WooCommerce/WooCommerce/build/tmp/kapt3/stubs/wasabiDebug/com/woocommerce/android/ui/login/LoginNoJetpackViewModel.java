package com.woocommerce.android.ui.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginNoJetpackViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "loginNoJetpackRepository", "Lcom/woocommerce/android/ui/login/LoginNoJetpackRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/login/LoginNoJetpackRepository;)V", "_isJetpackAvailable", "Landroidx/lifecycle/MutableLiveData;", "", "_isLoading", "isJetpackAvailable", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isLoading", "onCleared", "", "verifyJetpackAvailable", "siteAddress", "", "WooCommerce_wasabiDebug"})
public final class LoginNoJetpackViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.login.LoginNoJetpackRepository loginNoJetpackRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isJetpackAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isJetpackAvailable = null;
    
    @javax.inject.Inject
    public LoginNoJetpackViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.LoginNoJetpackRepository loginNoJetpackRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isJetpackAvailable() {
        return null;
    }
    
    public final void verifyJetpackAvailable(@org.jetbrains.annotations.NotNull
    java.lang.String siteAddress) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}