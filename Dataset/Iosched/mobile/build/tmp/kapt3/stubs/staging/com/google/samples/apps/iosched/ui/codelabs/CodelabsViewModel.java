package com.google.samples.apps.iosched.ui.codelabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/google/samples/apps/iosched/ui/codelabs/CodelabsViewModel;", "Landroidx/lifecycle/ViewModel;", "loadCodelabsUseCase", "Lcom/google/samples/apps/iosched/shared/domain/codelabs/LoadCodelabsUseCase;", "getCodelabsInfoCardShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/codelabs/GetCodelabsInfoCardShownUseCase;", "setCodelabsInfoCardShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/codelabs/SetCodelabsInfoCardShownUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/codelabs/LoadCodelabsUseCase;Lcom/google/samples/apps/iosched/shared/domain/codelabs/GetCodelabsInfoCardShownUseCase;Lcom/google/samples/apps/iosched/shared/domain/codelabs/SetCodelabsInfoCardShownUseCase;)V", "_codelabs", "Landroidx/lifecycle/MutableLiveData;", "", "", "codelabs", "Landroidx/lifecycle/LiveData;", "getCodelabs", "()Landroidx/lifecycle/LiveData;", "dismissCodelabsInfoCard", "", "refreshCodelabs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobile_staging"})
public final class CodelabsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Object>> _codelabs = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> codelabs = null;
    private final com.google.samples.apps.iosched.shared.domain.codelabs.LoadCodelabsUseCase loadCodelabsUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.codelabs.GetCodelabsInfoCardShownUseCase getCodelabsInfoCardShownUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase setCodelabsInfoCardShownUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> getCodelabs() {
        return null;
    }
    
    public final void dismissCodelabsInfoCard() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public CodelabsViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.codelabs.LoadCodelabsUseCase loadCodelabsUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.codelabs.GetCodelabsInfoCardShownUseCase getCodelabsInfoCardShownUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.codelabs.SetCodelabsInfoCardShownUseCase setCodelabsInfoCardShownUseCase) {
        super();
    }
}