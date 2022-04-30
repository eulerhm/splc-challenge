package nl.rijksoverheid.en.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lnl/rijksoverheid/en/util/LocaleHelper;", "", "application", "Landroid/app/Application;", "settings", "Lnl/rijksoverheid/en/settings/Settings;", "(Landroid/app/Application;Lnl/rijksoverheid/en/settings/Settings;)V", "isAppSetToDutch", "", "()Z", "isSystemLanguageDutch", "localeToUse", "Ljava/util/Locale;", "getLocaleToUse", "()Ljava/util/Locale;", "systemLocale", "applyLocale", "", "context", "Landroid/content/Context;", "locale", "updateResources", "resources", "Landroid/content/res/Resources;", "useAppInDutch", "Companion", "app_accDebug"})
public final class LocaleHelper {
    private java.util.Locale systemLocale;
    private final nl.rijksoverheid.en.settings.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Locale dutchLocale = null;
    private static nl.rijksoverheid.en.util.LocaleHelper localeHelper;
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.util.LocaleHelper.Companion Companion = null;
    
    public final boolean isAppSetToDutch() {
        return false;
    }
    
    public final boolean isSystemLanguageDutch() {
        return false;
    }
    
    private final java.util.Locale getLocaleToUse() {
        return null;
    }
    
    public final boolean useAppInDutch(boolean useAppInDutch, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private final void applyLocale(android.content.Context context, java.util.Locale locale) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void updateResources(android.content.res.Resources resources, java.util.Locale locale) {
    }
    
    private LocaleHelper(android.app.Application application, nl.rijksoverheid.en.settings.Settings settings) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lnl/rijksoverheid/en/util/LocaleHelper$Companion;", "", "()V", "dutchLocale", "Ljava/util/Locale;", "getDutchLocale", "()Ljava/util/Locale;", "localeHelper", "Lnl/rijksoverheid/en/util/LocaleHelper;", "getInstance", "initialize", "", "application", "Landroid/app/Application;", "app_accDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Locale getDutchLocale() {
            return null;
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.util.LocaleHelper getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}