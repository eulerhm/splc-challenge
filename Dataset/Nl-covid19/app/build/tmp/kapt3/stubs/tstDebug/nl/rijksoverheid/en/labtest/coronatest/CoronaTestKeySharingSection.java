package nl.rijksoverheid.en.labtest.coronatest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0018\u001a\u00020\u0004H\u0002J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0019\u001a\u00020\u0004R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0014@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lnl/rijksoverheid/en/labtest/coronatest/CoronaTestKeySharingSection;", "Lcom/xwray/groupie/Section;", "retry", "Lkotlin/Function0;", "", "requestConsent", "uploadKeys", "openCoronaTestWebsite", "copy", "Lkotlin/Function1;", "", "finish", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "hasSharedKeys", "", "<set-?>", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState;", "keyState", "getKeyState", "()Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState;", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "notificationsState", "getNotificationsState", "()Lnl/rijksoverheid/en/ExposureNotificationsViewModel$NotificationsState;", "update", "uploadKeysSucceeded", "app_tstDebug"})
public final class CoronaTestKeySharingSection extends com.xwray.groupie.Section {
    @org.jetbrains.annotations.NotNull()
    private nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState keyState;
    @org.jetbrains.annotations.NotNull()
    private nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState notificationsState;
    private boolean hasSharedKeys = false;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> retry = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> requestConsent = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> uploadKeys = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> openCoronaTestWebsite = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> copy = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> finish = null;
    
    @org.jetbrains.annotations.NotNull()
    public final nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState getKeyState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState getNotificationsState() {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState keyState) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.ExposureNotificationsViewModel.NotificationsState notificationsState) {
    }
    
    public final void uploadKeysSucceeded() {
    }
    
    private final void update() {
    }
    
    public CoronaTestKeySharingSection(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> requestConsent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> uploadKeys, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> openCoronaTestWebsite, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> copy, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> finish) {
        super();
    }
}