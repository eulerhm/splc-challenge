package nl.rijksoverheid.en.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lnl/rijksoverheid/en/notification/PostNotificationViewModel;", "Landroidx/lifecycle/ViewModel;", "resourceBundleManager", "Lnl/rijksoverheid/en/resource/ResourceBundleManager;", "appConfigManager", "Lnl/rijksoverheid/en/config/AppConfigManager;", "(Lnl/rijksoverheid/en/resource/ResourceBundleManager;Lnl/rijksoverheid/en/config/AppConfigManager;)V", "exposureNotificationGuidanceArgs", "Landroidx/lifecycle/MutableLiveData;", "Lnl/rijksoverheid/en/notification/PostNotificationViewModel$ExposureNotificationGuidanceArgs;", "guidance", "Landroidx/lifecycle/LiveData;", "", "Lnl/rijksoverheid/en/api/model/ResourceBundle$Guidance$Element;", "getGuidance", "()Landroidx/lifecycle/LiveData;", "getAppointmentPhoneNumber", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setExposureNotificationGuidanceArgs", "", "exposureDate", "Ljava/time/LocalDate;", "notificationReceivedDate", "ExposureNotificationGuidanceArgs", "app_tstDebug"})
public final class PostNotificationViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<nl.rijksoverheid.en.notification.PostNotificationViewModel.ExposureNotificationGuidanceArgs> exposureNotificationGuidanceArgs = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<nl.rijksoverheid.en.api.model.ResourceBundle.Guidance.Element>> guidance = null;
    private final nl.rijksoverheid.en.resource.ResourceBundleManager resourceBundleManager = null;
    private final nl.rijksoverheid.en.config.AppConfigManager appConfigManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<nl.rijksoverheid.en.api.model.ResourceBundle.Guidance.Element>> getGuidance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAppointmentPhoneNumber(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    public final void setExposureNotificationGuidanceArgs(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate exposureDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate notificationReceivedDate) {
    }
    
    public PostNotificationViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.resource.ResourceBundleManager resourceBundleManager, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.config.AppConfigManager appConfigManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/notification/PostNotificationViewModel$ExposureNotificationGuidanceArgs;", "", "exposureDate", "Ljava/time/LocalDate;", "notificationReceivedDate", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "getExposureDate", "()Ljava/time/LocalDate;", "getNotificationReceivedDate", "app_tstDebug"})
    static final class ExposureNotificationGuidanceArgs {
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDate exposureDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.time.LocalDate notificationReceivedDate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDate getExposureDate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.LocalDate getNotificationReceivedDate() {
            return null;
        }
        
        public ExposureNotificationGuidanceArgs(@org.jetbrains.annotations.NotNull()
        java.time.LocalDate exposureDate, @org.jetbrains.annotations.Nullable()
        java.time.LocalDate notificationReceivedDate) {
            super();
        }
    }
}