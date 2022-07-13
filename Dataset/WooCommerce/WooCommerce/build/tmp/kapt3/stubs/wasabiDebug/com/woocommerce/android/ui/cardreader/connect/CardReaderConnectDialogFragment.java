package com.woocommerce.android.ui.cardreader.connect;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\b\u0010,\u001a\u00020\u0019H\u0016J\u001a\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010/\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u00101\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\f0\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00063"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "locationUtils", "Lcom/woocommerce/android/util/LocationUtils;", "getLocationUtils", "()Lcom/woocommerce/android/util/LocationUtils;", "setLocationUtils", "(Lcom/woocommerce/android/util/LocationUtils;)V", "requestBluetoothPermissionsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "requestEnableBluetoothLauncher", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "requestEnableLocationProviderLauncher", "requestPermissionLauncher", "viewModel", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initMultipleReadersFoundRecyclerView", "", "binding", "Lcom/woocommerce/android/databinding/CardReaderConnectDialogBinding;", "initObservers", "moveToReaderFoundState", "viewState", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "moveToState", "observeEvents", "observeState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "onViewCreated", "view", "openLocationSettings", "setupResultHandlers", "updateMultipleReadersFoundRecyclerView", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CardReaderConnectDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.util.LocationUtils locationUtils;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestBluetoothPermissionsLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestEnableBluetoothLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestEnableLocationProviderLauncher = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectDialogFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CONNECT_TO_READER_RESULT = "key_connect_to_reader_result";
    
    public CardReaderConnectDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.LocationUtils getLocationUtils() {
        return null;
    }
    
    public final void setLocationUtils(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.LocationUtils p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initMultipleReadersFoundRecyclerView(com.woocommerce.android.databinding.CardReaderConnectDialogBinding binding) {
    }
    
    private final void initObservers(com.woocommerce.android.databinding.CardReaderConnectDialogBinding binding) {
    }
    
    private final void observeState(com.woocommerce.android.databinding.CardReaderConnectDialogBinding binding) {
    }
    
    private final void setupResultHandlers(com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel viewModel) {
    }
    
    /**
     * When a reader is found, we fade out the scanning illustration, update the UI to the new state, then
     * fade in the reader found illustration
     */
    private final void moveToReaderFoundState(com.woocommerce.android.databinding.CardReaderConnectDialogBinding binding, com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState viewState) {
    }
    
    private final void moveToState(com.woocommerce.android.databinding.CardReaderConnectDialogBinding binding, com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState viewState) {
    }
    
    @kotlin.Suppress(names = {"ComplexMethod", "LongMethod"})
    private final void observeEvents() {
    }
    
    private final void updateMultipleReadersFoundRecyclerView(com.woocommerce.android.databinding.CardReaderConnectDialogBinding binding, com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState viewState) {
    }
    
    private final void openLocationSettings() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectDialogFragment$Companion;", "", "()V", "KEY_CONNECT_TO_READER_RESULT", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}