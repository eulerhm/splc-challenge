package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lnl/rijksoverheid/en/status/StatusErrorItem;", "Lnl/rijksoverheid/en/status/BaseStatusErrorItem;", "error", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;", "action", "Lkotlin/Function0;", "", "(Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Error;Lkotlin/jvm/functions/Function0;)V", "viewState", "Lnl/rijksoverheid/en/status/BaseStatusErrorItem$ErrorViewState;", "getViewState", "()Lnl/rijksoverheid/en/status/BaseStatusErrorItem$ErrorViewState;", "bind", "viewBinding", "Lnl/rijksoverheid/en/databinding/ItemStatusErrorBinding;", "position", "", "getLayout", "app_tstDebug"})
public final class StatusErrorItem extends nl.rijksoverheid.en.status.BaseStatusErrorItem {
    @org.jetbrains.annotations.NotNull()
    private final nl.rijksoverheid.en.status.BaseStatusErrorItem.ErrorViewState viewState = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> action = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public nl.rijksoverheid.en.status.BaseStatusErrorItem.ErrorViewState getViewState() {
        return null;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.databinding.ItemStatusErrorBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    public StatusErrorItem(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Error error, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        super();
    }
}