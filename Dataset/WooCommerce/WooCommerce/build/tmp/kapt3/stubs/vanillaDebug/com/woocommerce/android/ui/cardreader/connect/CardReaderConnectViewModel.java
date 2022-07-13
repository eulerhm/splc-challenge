package com.woocommerce.android.ui.cardreader.connect;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001kBG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020.H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020.H\u0002J\u0010\u00105\u001a\u0002032\u0006\u00106\u001a\u00020\u001fH\u0002J\u0018\u00107\u001a\u0004\u0018\u00010.2\f\u00108\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\b\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@H\u0002J\u0011\u0010A\u001a\u000203H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0011\u0010C\u001a\u000203H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0010\u0010D\u001a\u00020E2\u0006\u00101\u001a\u00020.H\u0002J\u0010\u0010F\u001a\u0002032\u0006\u0010G\u001a\u00020\u001fH\u0002J\b\u0010H\u001a\u000203H\u0002J\u0010\u0010I\u001a\u0002032\u0006\u0010G\u001a\u00020\u001fH\u0002J\u0010\u0010J\u001a\u0002032\u0006\u0010G\u001a\u00020\u001fH\u0002J\u0010\u0010K\u001a\u0002032\u0006\u0010G\u001a\u00020\u001fH\u0002J\u0018\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001fH\u0002J\u0010\u0010O\u001a\u0002032\u0006\u00104\u001a\u00020.H\u0002J\b\u0010P\u001a\u000203H\u0002J\b\u0010Q\u001a\u000203H\u0002J\b\u0010R\u001a\u000203H\u0002J\b\u0010S\u001a\u000203H\u0002J\b\u0010T\u001a\u000203H\u0002J\b\u0010U\u001a\u000203H\u0002J\b\u0010V\u001a\u000203H\u0002J\u0010\u0010W\u001a\u0002032\u0006\u00104\u001a\u00020.H\u0002J\b\u0010X\u001a\u000203H\u0002J\u0010\u0010Y\u001a\u0002032\u0006\u0010?\u001a\u00020ZH\u0002J\b\u0010[\u001a\u000203H\u0002J\u0010\u0010\\\u001a\u0002032\u0006\u0010G\u001a\u00020\u001fH\u0002J\u0010\u0010]\u001a\u0002032\u0006\u0010M\u001a\u00020\u001fH\u0002J\u0006\u0010^\u001a\u000203J\u000e\u0010_\u001a\u0002032\u0006\u0010`\u001a\u00020aJ\b\u0010b\u001a\u000203H\u0002J\b\u0010c\u001a\u000203H\u0002J\u0011\u0010d\u001a\u000203H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ\u0010\u0010e\u001a\u0002032\u0006\u00104\u001a\u00020.H\u0002J\u0012\u0010f\u001a\u0002032\b\u0010g\u001a\u0004\u0018\u00010hH\u0002J\u0010\u0010i\u001a\u0002032\u0006\u0010<\u001a\u00020jH\u0002R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\'0!\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006l"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "tracker", "Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;", "appPrefs", "Lcom/woocommerce/android/AppPrefsWrapper;", "locationRepository", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "cardReaderManager", "Lcom/woocommerce/android/cardreader/CardReaderManager;", "cardReaderTrackingInfoKeeper", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/cardreader/CardReaderTracker;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/cardreader/CardReaderManager;Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;)V", "_event", "Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "get_event", "()Lcom/woocommerce/android/viewmodel/SingleLiveEvent;", "arguments", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectDialogFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectDialogFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "connectionStarted", "", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "requiredUpdateStarted", "viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState;", "viewStateData", "getViewStateData", "buildMultipleReadersFoundState", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$MultipleReadersFoundState;", "availableReaders", "", "Lcom/woocommerce/android/cardreader/connection/CardReader;", "buildSingleReaderFoundState", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewState$ReaderFoundState;", "reader", "connectToReader", "", "cardReader", "exitFlow", "connected", "findLastKnowReader", "readers", "getPaymentPluginType", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "handleLocationFetchingError", "result", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error;", "handleScanEvent", "discoveryEvent", "Lcom/woocommerce/android/cardreader/connection/CardReaderDiscoveryEvents;", "listenToConnectionStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenToSoftwareUpdateStatus", "mapReaderToListItem", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "onBluetoothRuntimePermissionsRequestResult", "enabled", "onCancelClicked", "onCheckBluetoothPermissionsResult", "onCheckBluetoothResult", "onCheckLocationEnabledResult", "onCheckLocationPermissionsResult", "granted", "shouldShowRationale", "onConnectToReaderClicked", "onLocationPermissionRationaleConfirmed", "onLocationPermissionsVerified", "onLocationSettingsClosed", "onOpenBluetoothPermissionsSettingsClicked", "onOpenBluetoothSettingsClicked", "onOpenLocationProviderSettingsClicked", "onOpenPermissionsSettingsClicked", "onReaderConnected", "onReaderConnectionFailed", "onReadersFound", "Lcom/woocommerce/android/cardreader/connection/CardReaderDiscoveryEvents$ReadersFound;", "onReadyToStartScanning", "onRequestEnableBluetoothResult", "onRequestLocationPermissionsResult", "onScreenStarted", "onUpdateReaderResult", "updateResult", "Lcom/woocommerce/android/ui/cardreader/update/CardReaderUpdateViewModel$UpdateResult;", "restartFlow", "startFlow", "startScanningIfNotStarted", "storeConnectedReader", "trackLocationFailureFetching", "errorDescription", "", "triggerOpenUrlEventAndExitIfNeeded", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderLocationRepository$LocationIdFetchingResult$Error$MissingAddress;", "ListItemViewState", "WooCommerce_vanillaDebug"})
public final class CardReaderConnectViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTracker tracker = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefs = null;
    private final com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository locationRepository = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.cardreader.CardReaderManager cardReaderManager = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper cardReaderTrackingInfoKeeper = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    
    /**
     * This is a workaround for a bug in MultiLiveEvent, which can't be fixed without vital changes.
     * When multiple events are send synchronously to MultiLiveEvent only the first one gets handled
     * as MultiLiveEvent.pending field gets set to false when the first events is handled and all the other events
     * are ignored.
     * Example: Imagine VM sends CheckPermissions event -> the view layer synchronously checks the permissions and
     * invokes vm.permissionChecked(true), the vm sends CheckBluetoothEvent, but this event is never observed by the
     * view layer, since `MultiLiveEvent.pending` was set to false by the previous event.
     * Since this VM doesn't need to have support for MultiLiveEvent, it overrides _event from the parent
     * with SingleLiveEvent.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.SingleLiveEvent<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> event = null;
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState> viewState = null;
    private boolean requiredUpdateStarted = false;
    private boolean connectionStarted = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState> viewStateData = null;
    
    @javax.inject.Inject()
    public CardReaderConnectViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.CardReaderTracker tracker, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appPrefs, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository locationRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.cardreader.CardReaderManager cardReaderManager, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper cardReaderTrackingInfoKeeper) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectDialogFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.woocommerce.android.viewmodel.SingleLiveEvent<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> get_event() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState> getViewStateData() {
        return null;
    }
    
    private final void startFlow() {
    }
    
    private final void restartFlow() {
    }
    
    public final void onScreenStarted() {
    }
    
    private final void onCheckLocationPermissionsResult(boolean granted, boolean shouldShowRationale) {
    }
    
    private final void onLocationPermissionRationaleConfirmed() {
    }
    
    private final void onRequestLocationPermissionsResult(boolean granted) {
    }
    
    private final void onLocationPermissionsVerified() {
    }
    
    private final void onCheckLocationEnabledResult(boolean enabled) {
    }
    
    private final void onOpenPermissionsSettingsClicked() {
    }
    
    private final void onOpenLocationProviderSettingsClicked() {
    }
    
    private final void onLocationSettingsClosed() {
    }
    
    private final void onCheckBluetoothPermissionsResult(boolean enabled) {
    }
    
    private final void onBluetoothRuntimePermissionsRequestResult(boolean enabled) {
    }
    
    private final void onCheckBluetoothResult(boolean enabled) {
    }
    
    private final void onRequestEnableBluetoothResult(boolean enabled) {
    }
    
    private final void onOpenBluetoothPermissionsSettingsClicked() {
    }
    
    private final void onOpenBluetoothSettingsClicked() {
    }
    
    private final void onReadyToStartScanning() {
    }
    
    private final java.lang.Object startScanningIfNotStarted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object listenToConnectionStatus(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object listenToSoftwareUpdateStatus(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void handleScanEvent(com.woocommerce.android.cardreader.connection.CardReaderDiscoveryEvents discoveryEvent) {
    }
    
    public final void onUpdateReaderResult(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel.UpdateResult updateResult) {
    }
    
    private final void onReadersFound(com.woocommerce.android.cardreader.connection.CardReaderDiscoveryEvents.ReadersFound discoveryEvent) {
    }
    
    private final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.ReaderFoundState buildSingleReaderFoundState(com.woocommerce.android.cardreader.connection.CardReader reader) {
        return null;
    }
    
    private final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewState.MultipleReadersFoundState buildMultipleReadersFoundState(java.util.List<? extends com.woocommerce.android.cardreader.connection.CardReader> availableReaders) {
        return null;
    }
    
    private final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState mapReaderToListItem(com.woocommerce.android.cardreader.connection.CardReader reader) {
        return null;
    }
    
    private final void onConnectToReaderClicked(com.woocommerce.android.cardreader.connection.CardReader cardReader) {
    }
    
    private final void connectToReader(com.woocommerce.android.cardreader.connection.CardReader cardReader) {
    }
    
    private final com.woocommerce.android.ui.cardreader.onboarding.PluginType getPaymentPluginType() {
        return null;
    }
    
    private final void handleLocationFetchingError(com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error result) {
    }
    
    private final void onReaderConnectionFailed() {
    }
    
    private final void triggerOpenUrlEventAndExitIfNeeded(com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository.LocationIdFetchingResult.Error.MissingAddress result) {
    }
    
    private final void onCancelClicked() {
    }
    
    private final void onReaderConnected(com.woocommerce.android.cardreader.connection.CardReader cardReader) {
    }
    
    private final void exitFlow(boolean connected) {
    }
    
    private final void storeConnectedReader(com.woocommerce.android.cardreader.connection.CardReader cardReader) {
    }
    
    private final com.woocommerce.android.cardreader.connection.CardReader findLastKnowReader(java.util.List<? extends com.woocommerce.android.cardreader.connection.CardReader> readers) {
        return null;
    }
    
    private final void trackLocationFailureFetching(java.lang.String errorDescription) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "", "()V", "CardReaderListItem", "ScanningInProgressListItem", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState$ScanningInProgressListItem;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState$CardReaderListItem;", "WooCommerce_vanillaDebug"})
    public static abstract class ListItemViewState {
        
        private ListItemViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState$ScanningInProgressListItem;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "()V", "label", "Lcom/woocommerce/android/model/UiString$UiStringRes;", "getLabel", "()Lcom/woocommerce/android/model/UiString$UiStringRes;", "scanningIcon", "", "getScanningIcon", "()I", "WooCommerce_vanillaDebug"})
        public static final class ScanningInProgressListItem extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState.ScanningInProgressListItem INSTANCE = null;
            @org.jetbrains.annotations.NotNull()
            private static final com.woocommerce.android.model.UiString.UiStringRes label = null;
            @androidx.annotation.DrawableRes()
            private static final int scanningIcon = com.woocommerce.android.R.drawable.ic_loop_24px;
            
            private ScanningInProgressListItem() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.UiString.UiStringRes getLabel() {
                return null;
            }
            
            public final int getScanningIcon() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J/\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState$CardReaderListItem;", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "readerId", "", "readerType", "onConnectClicked", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "connectLabel", "Lcom/woocommerce/android/model/UiString;", "getConnectLabel", "()Lcom/woocommerce/android/model/UiString;", "getOnConnectClicked", "()Lkotlin/jvm/functions/Function0;", "getReaderId", "()Ljava/lang/String;", "getReaderType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class CardReaderListItem extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String readerId = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String readerType = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onConnectClicked = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.UiString connectLabel = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState.CardReaderListItem copy(@org.jetbrains.annotations.NotNull()
            java.lang.String readerId, @org.jetbrains.annotations.Nullable()
            java.lang.String readerType, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function0<kotlin.Unit> onConnectClicked) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public CardReaderListItem(@org.jetbrains.annotations.NotNull()
            java.lang.String readerId, @org.jetbrains.annotations.Nullable()
            java.lang.String readerType, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function0<kotlin.Unit> onConnectClicked) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getReaderId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReaderType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnConnectClicked() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.UiString getConnectLabel() {
                return null;
            }
        }
    }
}