package nl.rijksoverheid.en.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016R\u0018\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lnl/rijksoverheid/en/items/BulletedListItem;", "Lnl/rijksoverheid/en/items/BaseBindableItem;", "Lnl/rijksoverheid/en/databinding/ItemParagraphBinding;", "text", "", "formatArgs", "", "", "(I[Ljava/lang/String;)V", "[Ljava/lang/String;", "bind", "", "viewBinding", "position", "getLayout", "hasSameContentAs", "", "other", "Lcom/xwray/groupie/Item;", "isSameAs", "app_accDebug"})
public final class BulletedListItem extends nl.rijksoverheid.en.items.BaseBindableItem<nl.rijksoverheid.en.databinding.ItemParagraphBinding> {
    private final int text = 0;
    private final java.lang.String[] formatArgs = null;
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.databinding.ItemParagraphBinding viewBinding, int position) {
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
    
    public BulletedListItem(@androidx.annotation.StringRes()
    int text, @org.jetbrains.annotations.NotNull()
    java.lang.String... formatArgs) {
        super();
    }
}