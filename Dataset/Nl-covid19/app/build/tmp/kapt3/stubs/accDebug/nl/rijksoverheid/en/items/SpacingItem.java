package nl.rijksoverheid.en.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0016J\u0014\u0010\u000e\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0016\u00a8\u0006\u000f"}, d2 = {"Lnl/rijksoverheid/en/items/SpacingItem;", "Lnl/rijksoverheid/en/items/BaseBindableItem;", "Lnl/rijksoverheid/en/databinding/ItemSpacingBinding;", "()V", "bind", "", "viewBinding", "position", "", "getLayout", "hasSameContentAs", "", "other", "Lcom/xwray/groupie/Item;", "isSameAs", "app_accDebug"})
public final class SpacingItem extends nl.rijksoverheid.en.items.BaseBindableItem<nl.rijksoverheid.en.databinding.ItemSpacingBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.items.SpacingItem INSTANCE = null;
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.databinding.ItemSpacingBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public boolean isSameAs(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Item<?> other) {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasSameContentAs(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Item<?> other) {
        return false;
    }
    
    private SpacingItem() {
        super();
    }
}