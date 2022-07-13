package com.woocommerce.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J,\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0006\u0010\u0010\u001a\u00020\b\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/WooWellSqlConfig;", "Lorg/wordpress/android/fluxc/persistence/WellSqlConfig;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCursorWindowSize", "", "onDowngrade", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "helper", "Lcom/yarolegovich/wellsql/WellTableManager;", "oldVersion", "", "newVersion", "resetDatabase", "WooCommerce_vanillaDebug"})
public final class WooWellSqlConfig extends org.wordpress.android.fluxc.persistence.WellSqlConfig {
    
    public WooWellSqlConfig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    /**
     * Detect when the database is downgraded in debug and beta builds so we can recreate all the tables.
     * The initial purpose of this was to avoid the hassle of devs switching branches and having to clear
     * storage and login again due to a version downgrade, but we've had a couple of cases where a beta
     * build with a DB downgrade was released, resulting in a lot of crashes.
     */
    @java.lang.Override()
    public void onDowngrade(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase db, @org.jetbrains.annotations.Nullable()
    com.yarolegovich.wellsql.WellTableManager helper, int oldVersion, int newVersion) {
    }
    
    /**
     * Useful during development when we want to test features with a "fresh" database. This can be
     * called from WooCommerce.onCreate() after we initialize the database and access the selected
     * site. For safety, this has no effect when called from a release build.
     */
    public final void resetDatabase() {
    }
    
    /**
     * Increase the cursor window size to 5MB for devices running API 28 and above. This should reduce the
     * number of SQLiteBlobTooBigExceptions. Note that this is only called on API 28 and
     * above since earlier versions don't allow adjusting the cursor window size.
     */
    @java.lang.Override()
    public long getCursorWindowSize() {
        return 0L;
    }
}