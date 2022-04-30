package nl.rijksoverheid.en.databinding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u0012H\u0007J1\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\u0012H\u0007J\f\u0010\"\u001a\u00020\n*\u00020#H\u0002\u00a8\u0006$"}, d2 = {"Lnl/rijksoverheid/en/databinding/BindingAdapters;", "", "()V", "bindPausedState", "", "view", "Landroid/widget/TextView;", "pausedUntil", "Ljava/time/LocalDateTime;", "isSmallScreen", "", "configuration", "Landroid/content/res/Configuration;", "markAsButtonForAccessibility", "Landroid/view/View;", "mark", "setContentDescriptionRes", "stringRes", "", "setHtmlText", "htmlText", "", "setOptionalAnimation", "lottieView", "Lcom/airbnb/lottie/LottieAnimationView;", "src", "show", "keepInLayout", "hideOnSmallScreenHeight", "(Landroid/view/View;Ljava/lang/Boolean;ZLjava/lang/Boolean;)V", "showIfLabelSet", "button", "Landroid/widget/Button;", "label", "isImageFillingScreen", "Landroid/widget/ImageView;", "app_accDebug"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.databinding.BindingAdapters INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"show", "keepInLayout", "hideOnSmallScreenHeight"}, requireAll = false)
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean show, boolean keepInLayout, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean hideOnSmallScreenHeight) {
    }
    
    private final boolean isSmallScreen(android.content.res.Configuration configuration) {
        return false;
    }
    
    /**
     * Check if image would fill more than 90% of the screen when scaled full width while keeping the aspect ratio
     * @return true if the image fills more than 90% of the screen
     */
    private final boolean isImageFillingScreen(android.widget.ImageView $this$isImageFillingScreen) {
        return false;
    }
    
    @androidx.databinding.BindingAdapter(value = {"showIfLabelSet"})
    public static final void showIfLabelSet(@org.jetbrains.annotations.NotNull()
    android.widget.Button button, @androidx.annotation.StringRes()
    int label) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"htmlText"})
    public static final void setHtmlText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlText) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"optional_animation"})
    public static final void setOptionalAnimation(@org.jetbrains.annotations.NotNull()
    com.airbnb.lottie.LottieAnimationView lottieView, @androidx.annotation.RawRes()
    int src) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"contentDescriptionRes"})
    public static final void setContentDescriptionRes(@org.jetbrains.annotations.NotNull()
    android.view.View view, @androidx.annotation.StringRes()
    int stringRes) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"markAsButtonForAccessibility"})
    public static final void markAsButtonForAccessibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean mark) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"pausedState"})
    public static final void bindPausedState(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime pausedUntil) {
    }
    
    private BindingAdapters() {
        super();
    }
}