package com.haroldadmin.moonshot.features.search.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.epoxy.CallbackProp;
import com.airbnb.epoxy.ModelView;
import com.airbnb.epoxy.TextProp;
import com.haroldadmin.moonshot.features.search.R;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0012H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/haroldadmin/moonshot/features/search/views/SearchResultView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "resultType", "Landroidx/appcompat/widget/AppCompatTextView;", "title", "setOnClick", "", "onClick", "Landroid/view/View$OnClickListener;", "setResult", "result", "", "setResultType", "type", "search_debug"})
public final class SearchResultView extends android.widget.LinearLayout {
    private final androidx.appcompat.widget.AppCompatTextView resultType = null;
    private final androidx.appcompat.widget.AppCompatTextView title = null;
    private java.util.HashMap _$_findViewCache;
    
    @com.airbnb.epoxy.TextProp()
    public final void setResultType(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence type) {
    }
    
    @com.airbnb.epoxy.TextProp()
    public final void setResult(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence result) {
    }
    
    @com.airbnb.epoxy.CallbackProp()
    public final void setOnClick(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener onClick) {
    }
    
    public SearchResultView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public SearchResultView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SearchResultView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}