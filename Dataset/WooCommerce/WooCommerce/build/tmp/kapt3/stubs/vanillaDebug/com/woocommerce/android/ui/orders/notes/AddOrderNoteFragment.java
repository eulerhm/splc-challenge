package com.woocommerce.android.ui.orders.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\tH\u0016J\b\u0010)\u001a\u00020\'H\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\u001a\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\'H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00063"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "addMenuItem", "Landroid/view/MenuItem;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "initUi", "", "binding", "Lcom/woocommerce/android/databinding/FragmentAddOrderNoteBinding;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "showProgressDialog", "show", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddOrderNoteFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.notes.AddOrderNoteFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "AddOrderNoteFragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ADD_NOTE_RESULT = "key_add_note_result";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private android.view.MenuItem addMenuItem;
    
    public AddOrderNoteFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void initUi(com.woocommerce.android.databinding.FragmentAddOrderNoteBinding binding) {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentAddOrderNoteBinding binding) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/AddOrderNoteFragment$Companion;", "", "()V", "KEY_ADD_NOTE_RESULT", "", "TAG", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}