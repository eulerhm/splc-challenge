package nl.rijksoverheid.en.labtest;

import java.lang.System;

/**
 * Wrapper around (secure) shared preferences that stores [TemporaryExposureKey]s for upload
 * @param storageKey the key in the [prefs] to use
 * @param prefs the shared preferences to use for storage
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\u0014\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lnl/rijksoverheid/en/labtest/KeysStorage;", "", "storageKey", "", "prefs", "Landroid/content/SharedPreferences;", "(Ljava/lang/String;Landroid/content/SharedPreferences;)V", "clearKeys", "", "decodeKey", "Lcom/google/android/gms/nearby/exposurenotification/TemporaryExposureKey;", "encoded", "encodeKey", "key", "getKeys", "", "storeKeys", "keys", "app_accDebug"})
public final class KeysStorage {
    private final java.lang.String storageKey = null;
    private final android.content.SharedPreferences prefs = null;
    
    public final void storeKeys(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey> keys) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey> getKeys() {
        return null;
    }
    
    public final void clearKeys() {
    }
    
    private final com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey decodeKey(java.lang.String encoded) {
        return null;
    }
    
    private final java.lang.String encodeKey(com.google.android.gms.nearby.exposurenotification.TemporaryExposureKey key) {
        return null;
    }
    
    public KeysStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String storageKey, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs) {
        super();
    }
}