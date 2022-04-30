package nl.rijksoverheid.en.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0014\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016\u00a8\u0006\u0015"}, d2 = {"Lnl/rijksoverheid/en/items/BaseBindableItem;", "T", "Landroidx/databinding/ViewDataBinding;", "Lcom/xwray/groupie/viewbinding/BindableItem;", "()V", "bind", "", "viewHolder", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "position", "", "payloads", "", "", "initializeViewBinding", "view", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/databinding/ViewDataBinding;", "isClickable", "", "isLongClickable", "app_accDebug"})
public abstract class BaseBindableItem<T extends androidx.databinding.ViewDataBinding> extends com.xwray.groupie.viewbinding.BindableItem<T> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected T initializeViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.viewbinding.GroupieViewHolder<T> viewHolder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public boolean isClickable() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isLongClickable() {
        return false;
    }
    
    public BaseBindableItem() {
        super();
    }
}