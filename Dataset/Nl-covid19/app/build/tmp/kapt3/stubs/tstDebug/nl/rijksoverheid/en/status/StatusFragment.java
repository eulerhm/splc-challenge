package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u001a\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\u001a\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\u001bH\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u000203H\u0002J\u0016\u00104\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00068"}, d2 = {"Lnl/rijksoverheid/en/status/StatusFragment;", "Lnl/rijksoverheid/en/BaseFragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Lkotlin/jvm/functions/Function0;)V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "disableBatteryOptimizationsResultRegistration", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "section", "Lnl/rijksoverheid/en/status/StatusSection;", "statusViewModel", "Lnl/rijksoverheid/en/status/StatusViewModel;", "getStatusViewModel", "()Lnl/rijksoverheid/en/status/StatusViewModel;", "statusViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "getViewModel", "()Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "viewModel$delegate", "navigateToInternetRequiredFragment", "", "navigateToNotificationSettings", "navigateToPostNotification", "lastExposureLocalDate", "Ljava/time/LocalDate;", "notificationReceivedLocalDate", "navigateToSharingKeys", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "requestEnableBluetooth", "requestEnableLocationServices", "requestTest", "resetAndRequestEnableNotifications", "share", "showRemoveNotificationConfirmationDialog", "formattedDate", "", "updateHeaderState", "headerState", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "updateNotificationState", "notificationState", "", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "app_tstDebug"})
public final class StatusFragment extends nl.rijksoverheid.en.BaseFragment {
    private final kotlin.Lazy statusViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private nl.rijksoverheid.en.status.StatusSection section;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> adapter = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> disableBatteryOptimizationsResultRegistration = null;
    
    private final nl.rijksoverheid.en.status.StatusViewModel getStatusViewModel() {
        return null;
    }
    
    private final nl.rijksoverheid.en.ExposureNotificationsViewModel getViewModel() {
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void updateHeaderState(nl.rijksoverheid.en.status.StatusViewModel.HeaderState headerState) {
    }
    
    private final void updateNotificationState(java.util.List<? extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState> notificationState) {
    }
    
    private final void requestTest() {
    }
    
    private final void resetAndRequestEnableNotifications() {
    }
    
    private final void requestEnableLocationServices() {
    }
    
    private final void requestEnableBluetooth() {
    }
    
    private final void navigateToInternetRequiredFragment() {
    }
    
    private final void navigateToSharingKeys() {
    }
    
    private final void navigateToPostNotification(java.time.LocalDate lastExposureLocalDate, java.time.LocalDate notificationReceivedLocalDate) {
    }
    
    private final void navigateToNotificationSettings() {
    }
    
    private final void showRemoveNotificationConfirmationDialog(java.lang.String formattedDate) {
    }
    
    private final void share() {
    }
    
    public StatusFragment(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> factoryProducer) {
        super(0, null);
    }
    
    public StatusFragment() {
        super(0, null);
    }
}