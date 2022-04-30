package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"sessionTime", "", "textView", "Landroid/widget/TextView;", "feedSessionStartTime", "Lorg/threeten/bp/ZonedDateTime;", "feedSessionEndTime", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "mobile_staging"})
public final class FeedSessionsViewBinderKt {
    
    @androidx.databinding.BindingAdapter(value = {"feedSessionStartTime", "feedSessionEndTime", "timeZoneId"})
    public static final void sessionTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime feedSessionStartTime, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime feedSessionEndTime, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId timeZoneId) {
    }
}