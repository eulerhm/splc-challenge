package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Suppress(names = {"ComplexMethod"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0018H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0018H\u0002\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0018H\u0002\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0018H\u0002\u001a\b\u0010\u001d\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0018H\u0002\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0002\u001a\u0018\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0001H\u0002\u001a$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u000201H\u0002\u001a\n\u00102\u001a\u00020\u0001*\u000203\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"CHECK", "", "DATABASE_SIZE_UNIT", "HEADING_ACTIVE_PLUGINS", "HEADING_DATABASE", "HEADING_PAGES", "HEADING_SECURITY", "HEADING_SERVER_ENVIRONMENT", "HEADING_SETTINGS", "HEADING_SSR", "HEADING_STATUS_REPORT_INFORMATION", "HEADING_TEMPLATES", "HEADING_THEME", "HEADING_WP_ENVIRONMENT", "MISSING_VALUE", "NO_CHECK", "PAGE_NOT_SET", "checkIfTrue", "check", "", "formatActivePluginsData", "data", "Lorg/json/JSONArray;", "formatDatabaseData", "Lorg/json/JSONObject;", "formatEnvironmentData", "formatPagesData", "formatSecurityData", "formatSettingsData", "formatStatusReportInformationData", "formatTemplatesData", "formatThemeData", "formattedHeading", "text", "parseFormatSingleTableData", "table", "parseFormatTablesData", "tables", "tableType", "parseFormatTaxonomy", "taxonomies", "taxonomyType", "roundDoubleDecimal", "Ljava/math/BigDecimal;", "number", "", "scale", "", "mode", "Ljava/math/RoundingMode;", "formatResult", "Lorg/wordpress/android/fluxc/model/WCSSRModel;", "WooCommerce_vanillaDebug"})
public final class WCSSRModelExtKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MISSING_VALUE = "Info not found";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_SSR = "### System Status Report generated via the WooCommerce Android app ### \n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_WP_ENVIRONMENT = "WordPress Environment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_SERVER_ENVIRONMENT = "Server Environment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_DATABASE = "Database";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_SECURITY = "Security";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_ACTIVE_PLUGINS = "Active Plugins";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_SETTINGS = "Settings";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_PAGES = "WC Pages";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_THEME = "Theme";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_TEMPLATES = "Templates";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADING_STATUS_REPORT_INFORMATION = "Status report information";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHECK = "\u2714";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NO_CHECK = "\u2013";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_NOT_SET = "X Page not set";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_SIZE_UNIT = "MB";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatResult(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.WCSSRModel $this$formatResult) {
        return null;
    }
    
    private static final java.lang.String formatEnvironmentData(org.json.JSONObject data) {
        return null;
    }
    
    private static final java.lang.String formatDatabaseData(org.json.JSONObject data) {
        return null;
    }
    
    private static final java.lang.String formatSecurityData(org.json.JSONObject data) {
        return null;
    }
    
    private static final java.lang.String formatActivePluginsData(org.json.JSONArray data) {
        return null;
    }
    
    private static final java.lang.String formatSettingsData(org.json.JSONObject data) {
        return null;
    }
    
    private static final java.lang.String formatPagesData(org.json.JSONArray data) {
        return null;
    }
    
    private static final java.lang.String formatThemeData(org.json.JSONObject data) {
        return null;
    }
    
    private static final java.lang.String formatTemplatesData(org.json.JSONArray data) {
        return null;
    }
    
    private static final java.lang.String formatStatusReportInformationData() {
        return null;
    }
    
    private static final java.lang.String formattedHeading(java.lang.String text) {
        return null;
    }
    
    private static final java.lang.String checkIfTrue(boolean check) {
        return null;
    }
    
    private static final java.lang.String parseFormatTablesData(org.json.JSONObject tables, java.lang.String tableType) {
        return null;
    }
    
    private static final java.lang.String parseFormatSingleTableData(org.json.JSONObject table) {
        return null;
    }
    
    private static final java.lang.String parseFormatTaxonomy(org.json.JSONObject taxonomies, java.lang.String taxonomyType) {
        return null;
    }
    
    private static final java.math.BigDecimal roundDoubleDecimal(double number, int scale, java.math.RoundingMode mode) {
        return null;
    }
}