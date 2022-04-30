package nl.rijksoverheid.en.labtest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lnl/rijksoverheid/en/labtest/KeyShareOptionItem;", "Lnl/rijksoverheid/en/items/ActionItem;", "icon", "", "title", "subtitle", "(III)V", "CoronaTest", "GGD", "Lnl/rijksoverheid/en/labtest/KeyShareOptionItem$CoronaTest;", "Lnl/rijksoverheid/en/labtest/KeyShareOptionItem$GGD;", "app_accDebug"})
public abstract class KeyShareOptionItem extends nl.rijksoverheid.en.items.ActionItem {
    
    private KeyShareOptionItem(@androidx.annotation.DrawableRes()
    int icon, @androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int subtitle) {
        super(0, 0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/labtest/KeyShareOptionItem$CoronaTest;", "Lnl/rijksoverheid/en/labtest/KeyShareOptionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class CoronaTest extends nl.rijksoverheid.en.labtest.KeyShareOptionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.labtest.KeyShareOptionItem.CoronaTest INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private CoronaTest() {
            super(0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/labtest/KeyShareOptionItem$GGD;", "Lnl/rijksoverheid/en/labtest/KeyShareOptionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class GGD extends nl.rijksoverheid.en.labtest.KeyShareOptionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.labtest.KeyShareOptionItem.GGD INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private GGD() {
            super(0, 0, 0);
        }
    }
}