package com.woocommerce.android;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u00015B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+J\u001a\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\nH\u0002J\u000e\u00100\u001a\u0002012\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u00102\u001a\u0002012\u0006\u00103\u001a\u00020)J\u0018\u00104\u001a\u0002012\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\n \u000f*\u0004\u0018\u00010!0!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'\u00a8\u00066"}, d2 = {"Lcom/woocommerce/android/FeedbackPrefs;", "", "()V", "SIX_MONTHS_IN_DAYS", "", "THREE_MONTHS_IN_DAYS", "context", "Landroid/content/Context;", "featureMap", "", "", "getFeatureMap", "()Ljava/util/Map;", "featureMapTypeToken", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "getFeatureMapTypeToken", "()Ljava/lang/reflect/Type;", "featureMapTypeToken$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "value", "Ljava/util/Date;", "lastFeedbackDate", "getLastFeedbackDate", "()Ljava/util/Date;", "setLastFeedbackDate", "(Ljava/util/Date;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "userFeedbackIsDue", "", "getUserFeedbackIsDue", "()Z", "getFeatureFeedbackSettings", "Lcom/woocommerce/android/model/FeatureFeedbackSettings;", "feature", "Lcom/woocommerce/android/model/FeatureFeedbackSettings$Feature;", "getString", "key", "Lcom/woocommerce/android/FeedbackPrefs$FeedbackPrefKey;", "defaultValue", "init", "", "setFeatureFeedbackSettings", "settings", "setString", "FeedbackPrefKey", "WooCommerce_wasabiDebug"})
public final class FeedbackPrefs {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.FeedbackPrefs INSTANCE = null;
    private static android.content.Context context;
    private static final kotlin.Lazy gson$delegate = null;
    private static final kotlin.Lazy featureMapTypeToken$delegate = null;
    private static final int THREE_MONTHS_IN_DAYS = 90;
    private static final int SIX_MONTHS_IN_DAYS = 180;
    
    private FeedbackPrefs() {
        super();
    }
    
    private final com.google.gson.Gson getGson() {
        return null;
    }
    
    private final java.lang.reflect.Type getFeatureMapTypeToken() {
        return null;
    }
    
    private final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> getFeatureMap() {
        return null;
    }
    
    public final boolean getUserFeedbackIsDue() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getLastFeedbackDate() {
        return null;
    }
    
    public final void setLastFeedbackDate(@org.jetbrains.annotations.Nullable
    java.util.Date value) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.FeatureFeedbackSettings getFeatureFeedbackSettings(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.FeatureFeedbackSettings.Feature feature) {
        return null;
    }
    
    public final void setFeatureFeedbackSettings(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.FeatureFeedbackSettings settings) {
    }
    
    private final java.lang.String getString(com.woocommerce.android.FeedbackPrefs.FeedbackPrefKey key, java.lang.String defaultValue) {
        return null;
    }
    
    private final void setString(com.woocommerce.android.FeedbackPrefs.FeedbackPrefKey key, java.lang.String value) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/FeedbackPrefs$FeedbackPrefKey;", "", "(Ljava/lang/String;I)V", "LAST_FEEDBACK_DATE", "FEATURE_FEEDBACK_SETTINGS", "WooCommerce_wasabiDebug"})
    static enum FeedbackPrefKey {
        /*public static final*/ LAST_FEEDBACK_DATE /* = new LAST_FEEDBACK_DATE() */,
        /*public static final*/ FEATURE_FEEDBACK_SETTINGS /* = new FEATURE_FEEDBACK_SETTINGS() */;
        
        FeedbackPrefKey() {
        }
    }
}