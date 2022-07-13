package com.woocommerce.android.ui.coupons.edit;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EmailRestrictionViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "allowedEmailsDraft", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "navArgs", "Lcom/woocommerce/android/ui/coupons/edit/EmailRestrictionFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/coupons/edit/EmailRestrictionFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "viewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/coupons/edit/EmailRestrictionViewModel$ViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "onBackPressed", "", "ViewState", "WooCommerce_wasabiDebug"})
public final class EmailRestrictionViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> allowedEmailsDraft = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject
    public EmailRestrictionViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.coupons.edit.EmailRestrictionFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel.ViewState> getViewState() {
        return null;
    }
    
    public final void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EmailRestrictionViewModel$ViewState;", "", "hasChanges", "", "allowedEmails", "", "", "(ZLjava/util/List;)V", "getAllowedEmails", "()Ljava/util/List;", "getHasChanges", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewState {
        private final boolean hasChanges = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> allowedEmails = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel.ViewState copy(boolean hasChanges, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> allowedEmails) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ViewState(boolean hasChanges, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> allowedEmails) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getHasChanges() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getAllowedEmails() {
            return null;
        }
    }
}