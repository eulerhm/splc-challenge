package nl.rijksoverheid.en.labtest.coronatest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010%\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006)"}, d2 = {"Lnl/rijksoverheid/en/labtest/coronatest/CoronaTestKeySharingFragment;", "Lnl/rijksoverheid/en/BaseFragment;", "()V", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/GroupieViewHolder;", "binding", "Lnl/rijksoverheid/en/databinding/FragmentListBinding;", "labViewModel", "Lnl/rijksoverheid/en/labtest/LabTestViewModel;", "getLabViewModel", "()Lnl/rijksoverheid/en/labtest/LabTestViewModel;", "labViewModel$delegate", "Lkotlin/Lazy;", "requestUploadConsent", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "section", "Lnl/rijksoverheid/en/labtest/coronatest/CoronaTestKeySharingSection;", "viewModel", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "getViewModel", "()Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "viewModel$delegate", "copyToClipboard", "", "key", "", "finishCoronaTestKeySharing", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "openShareKeyUrl", "requestConsent", "intentSender", "Landroid/content/IntentSender;", "app_accDebug"})
public final class CoronaTestKeySharingFragment extends nl.rijksoverheid.en.BaseFragment {
    private final kotlin.Lazy labViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final nl.rijksoverheid.en.labtest.coronatest.CoronaTestKeySharingSection section = null;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.GroupieViewHolder> adapter = null;
    private nl.rijksoverheid.en.databinding.FragmentListBinding binding;
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> requestUploadConsent = null;
    
    private final nl.rijksoverheid.en.labtest.LabTestViewModel getLabViewModel() {
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
    
    private final void finishCoronaTestKeySharing() {
    }
    
    private final void requestConsent(android.content.IntentSender intentSender) {
    }
    
    private final void openShareKeyUrl() {
    }
    
    private final void copyToClipboard(java.lang.String key) {
    }
    
    public CoronaTestKeySharingFragment() {
        super(0, null);
    }
}