package com.woocommerce.android.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002J\u001e\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\"\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u001aH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/analytics/AnalyticsTracker;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anonymousID", "", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "tracksClient", "Lcom/automattic/android/tracks/TracksClient;", "username", "clearAllData", "", "clearAnonID", "flush", "generateNewAnonID", "getAnonID", "refreshMetadata", "newUsername", "refreshSiteMetadata", "storeUsagePref", "track", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "properties", "", "Companion", "WooCommerce_wasabiDebug"})
public final class AnalyticsTracker {
    private final android.content.Context context = null;
    private com.automattic.android.tracks.TracksClient tracksClient;
    private java.lang.String username;
    private java.lang.String anonymousID;
    private org.wordpress.android.fluxc.model.SiteModel site;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.analytics.AnalyticsTracker.Companion Companion = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.woocommerce.android.analytics.AnalyticsTracker instance;
    private static final java.lang.String TRACKS_ANON_ID = "nosara_tracks_anon_id";
    private static final java.lang.String EVENTS_PREFIX = "woocommerceandroid_";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_DEBUG = "is_debug";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ALREADY_READ = "already_read";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_BLOG_ID = "blog_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CONTEXT = "context";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ERROR_CONTEXT = "error_context";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ERROR_DESC = "error_description";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ERROR_TYPE = "error_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_FROM = "from";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HAS_UNFULFILLED_ORDERS = "has_unfulfilled_orders";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ID = "id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ORDER_ID = "order_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PRODUCT_ID = "product_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PRODUCT_COUNT = "product_count";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IS_LOADING_MORE = "is_loading_more";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IS_WPCOM_STORE = "is_wpcom_store";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_NAME = "name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_NUMBER_OF_STORES = "number_of_stores";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PARENT_ID = "parent_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_RANGE = "range";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_RESULT = "result";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SELECTED_STORE_ID = "selected_store_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_STATE = "state";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HAS_CHANGED_DATA = "has_changed_data";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_STATUS = "status";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TOTAL_DURATION = "total_duration";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SEARCH = "search";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TO = "to";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TYPE = "type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CARRIER = "carrier";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_OPTION = "option";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_URL = "url";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HAS_CONNECTED_STORES = "has_connected_stores";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_LAST_KNOWN_VERSION_CODE = "last_known_version_code";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_REVIEW_ID = "review_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_NOTE_ID = "note_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IMAGE_SOURCE = "source";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_FILTERS = "filters";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_FULFILL_ORDER = "fulfill_order";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_STEP = "step";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ADDONS = "addons";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SOFTWARE_UPDATE_TYPE = "software_update_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SUBJECT = "subject";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_DATE_RANGE = "date_range";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SOURCE = "source";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SORT_ORDER = "order";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SORT_NAME_ASC = "name,ascending";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SORT_NAME_DESC = "name,descending";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SORT_DATE_ASC = "date,ascending";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SORT_DATE_DESC = "date,descending";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_API_SUCCESS = "success";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_API_FAILED = "failed";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SHIPMENT_TRACK = "track";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SHIPMENT_COPY = "copy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_ORDER = "order";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_REVIEW = "review";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_ORDER_DETAIL = "order_detail";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_STARTED = "started";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PURCHASE_INITIATED = "purchase_initiated";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_ORIGIN_ADDRESS_STARTED = "origin_address_started";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_DESTINATION_ADDRESS_STARTED = "destination_address_started";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PACKAGES_STARTED = "packages_started";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_CARRIER_RATES_STARTED = "carrier_rates_started";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_CUSTOMS_STARTED = "customs_started";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PAYMENT_METHOD_STARTED = "payment_method_started";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_ORIGIN_ADDRESS_COMPLETE = "origin_address_complete";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_DESTINATION_ADDRESS_COMPLETE = "destination_address_complete";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PACKAGES_SELECTED = "packages_selected";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_CARRIER_RATES_SELECTED = "carrier_rates_selected";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_CUSTOMS_COMPLETE = "customs_complete";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PAYMENT_METHOD_SELECTED = "payment_method_selected";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PURCHASE_FAILED = "purchase_failed";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PURCHASE_SUCCEEDED = "purchase_succeeded";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PURCHASE_READY = "purchase_ready";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_FLOW = "flow";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HAS_DIFFERENT_SHIPPING_DETAILS = "has_different_shipping_details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HAS_CUSTOMER_DETAILS = "has_customer_details";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HAS_FEES = "has_fees";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HAS_SHIPPING_METHOD = "has_shipping_method";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FLOW_CREATION = "creation";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FLOW_EDITING = "editing";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ORDER_EDIT_CUSTOMER_NOTE = "customer_note";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ORDER_EDIT_SHIPPING_ADDRESS = "shipping_address";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ORDER_EDIT_BILLING_ADDRESS = "billing_address";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_FEEDBACK_ACTION = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_FEEDBACK_CONTEXT = "context";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_GENERAL_CONTEXT = "general";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_PRODUCT_M3_CONTEXT = "products_m3";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_SHOWN = "shown";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_LIKED = "liked";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_NOT_LIKED = "didnt_like";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_LATER = "later";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_DECLINED = "declined";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_RATED = "rated";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_COMPLETED = "completed";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_OPENED = "opened";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_CANCELED = "canceled";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_DISMISSED = "dismissed";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_FEEDBACK_GIVEN = "gave_feedback";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PRODUCTS_VARIATIONS_FEEDBACK = "products_variations";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SHIPPING_LABELS_M4_FEEDBACK = "shipping_labels_m4";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_PRODUCT_ADDONS_FEEDBACK = "product_addons";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_COUPONS_FEEDBACK = "coupons";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_STATE_ON = "on";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_STATE_OFF = "off";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SIMPLE_PAYMENTS_FEEDBACK = "simple_payments";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SIMPLE_PAYMENTS_COLLECT_CARD = "card";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SIMPLE_PAYMENTS_COLLECT_CASH = "cash";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SIMPLE_PAYMENTS_COLLECT_LINK = "payment_link";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SIMPLE_PAYMENTS_SOURCE_AMOUNT = "amount";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SIMPLE_PAYMENTS_SOURCE_SUMMARY = "summary";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_SIMPLE_PAYMENTS_SOURCE_PAYMENT_METHOD = "payment_method";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_DOWNLOADABLE_FILE_ACTION = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_LINKED_PRODUCTS_ACTION = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CONNECTED_PRODUCTS_LIST_CONTEXT = "context";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_CONNECTED_PRODUCTS_LIST_ACTION = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IMAGE_SOURCE_CAMERA = "camera";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IMAGE_SOURCE_DEVICE = "device";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IMAGE_SOURCE_WPMEDIA = "wpmedia";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_REFUND_IS_FULL = "is_full";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_REFUND_TYPE = "method";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_REFUND_METHOD = "gateway";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_AMOUNT = "amount";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PAYMENT_METHOD = "payment_method";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IS_JETPACK_CP_CONNECTED = "is_jetpack_cp_conntected";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ACTIVE_JETPACK_CONNECTION_PLUGINS = "active_jetpack_connection_plugins";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_FETCH_SITES_DURATION = "duration";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_JETPACK_BENEFITS_BANNER_ACTION = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_JETPACK_INSTALLATION_SOURCE = "source";
    private static final java.lang.String PREFKEY_SEND_USAGE_STATS = "wc_pref_send_usage_stats";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ANNOUNCEMENT_VIEW_SOURCE = "source";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_ANNOUNCEMENT_SOURCE_UPGRADE = "app_upgrade";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_ANNOUNCEMENT_SOURCE_SETTINGS = "app_settings";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_MORE_MENU_VIEW_STORE = "view_store";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_MORE_MENU_ADMIN_MENU = "admin_menu";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_MORE_MENU_REVIEWS = "reviews";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_MORE_MENU_INBOX = "inbox";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_MORE_MENU_COUPONS = "coupons";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_INBOX_NOTE_ACTION = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_INBOX_NOTE_ACTION_OPEN = "open";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_INBOX_NOTE_ACTION_DISMISS = "dismiss";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String VALUE_INBOX_NOTE_ACTION_DISMISS_ALL = "dismiss_all";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_COUPON_ACTION = "action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_COUPON_ACTION_LOADED = "loaded";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_COUPON_ACTION_COPIED = "copied_code";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_COUPON_ACTION_SHARED = "shared_code";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_COUPON_ACTION_DELETED = "tapped_delete";
    private static boolean sendUsageStats = true;
    
    private AnalyticsTracker(android.content.Context context) {
        super();
    }
    
    private final void clearAllData() {
    }
    
    private final void clearAnonID() {
    }
    
    private final java.lang.String getAnonID() {
        return null;
    }
    
    private final java.lang.String generateNewAnonID() {
        return null;
    }
    
    private final void track(com.woocommerce.android.analytics.AnalyticsEvent stat, java.util.Map<java.lang.String, ?> properties) {
    }
    
    private final void flush() {
    }
    
    private final void refreshMetadata(java.lang.String newUsername, org.wordpress.android.fluxc.model.SiteModel site) {
    }
    
    private final void refreshSiteMetadata(org.wordpress.android.fluxc.model.SiteModel site) {
    }
    
    private final void storeUsagePref() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\b\u00b7\u0001\u00b8\u0001\u00b9\u0001\u00ba\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001J\b\u0010\u00a3\u0001\u001a\u00030\u00a2\u0001J\u0012\u0010\u00a4\u0001\u001a\u00030\u00a2\u00012\b\u0010\u00a5\u0001\u001a\u00030\u00a6\u0001J!\u0010\u00a7\u0001\u001a\u00030\u00a2\u00012\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u00042\f\b\u0002\u0010\u00a9\u0001\u001a\u0005\u0018\u00010\u00aa\u0001J\u0012\u0010\u00ab\u0001\u001a\u00030\u00a2\u00012\b\u0010\u00a9\u0001\u001a\u00030\u00aa\u0001J3\u0010\u00ac\u0001\u001a\u00030\u00a2\u00012\b\u0010\u00ad\u0001\u001a\u00030\u00ae\u00012\t\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0004J(\u0010\u00ac\u0001\u001a\u00030\u00a2\u00012\b\u0010\u00ad\u0001\u001a\u00030\u00ae\u00012\u0014\b\u0002\u0010\u00b2\u0001\u001a\r\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00b3\u0001JI\u0010\u00ac\u0001\u001a\u00030\u00a2\u00012\b\u0010\u00ad\u0001\u001a\u00030\u00ae\u00012\u0014\u0010\u00b2\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00b3\u00012\t\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0004J\u0011\u0010\u00b4\u0001\u001a\u00030\u00a2\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\u0001J\u0011\u0010\u00b6\u0001\u001a\u00030\u00a2\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\u009c\u0001\u001a\u00030\u009b\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001@FX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010\u00a0\u0001\u00a8\u0006\u00bb\u0001"}, d2 = {"Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion;", "", "()V", "EVENTS_PREFIX", "", "IMAGE_SOURCE_CAMERA", "IMAGE_SOURCE_DEVICE", "IMAGE_SOURCE_WPMEDIA", "IS_DEBUG", "KEY_ACTIVE_JETPACK_CONNECTION_PLUGINS", "KEY_ADDONS", "KEY_ALREADY_READ", "KEY_AMOUNT", "KEY_ANNOUNCEMENT_VIEW_SOURCE", "KEY_BLOG_ID", "KEY_CARRIER", "KEY_CONNECTED_PRODUCTS_LIST_ACTION", "KEY_CONNECTED_PRODUCTS_LIST_CONTEXT", "KEY_CONTEXT", "KEY_COUPON_ACTION", "KEY_COUPON_ACTION_COPIED", "KEY_COUPON_ACTION_DELETED", "KEY_COUPON_ACTION_LOADED", "KEY_COUPON_ACTION_SHARED", "KEY_DATE_RANGE", "KEY_DOWNLOADABLE_FILE_ACTION", "KEY_ERROR_CONTEXT", "KEY_ERROR_DESC", "KEY_ERROR_TYPE", "KEY_FEEDBACK_ACTION", "KEY_FEEDBACK_CONTEXT", "KEY_FETCH_SITES_DURATION", "KEY_FILTERS", "KEY_FLOW", "KEY_FROM", "KEY_FULFILL_ORDER", "KEY_HAS_CHANGED_DATA", "KEY_HAS_CONNECTED_STORES", "KEY_HAS_CUSTOMER_DETAILS", "KEY_HAS_DIFFERENT_SHIPPING_DETAILS", "KEY_HAS_FEES", "KEY_HAS_SHIPPING_METHOD", "KEY_HAS_UNFULFILLED_ORDERS", "KEY_ID", "KEY_IMAGE_SOURCE", "KEY_INBOX_NOTE_ACTION", "KEY_IS_JETPACK_CP_CONNECTED", "KEY_IS_LOADING_MORE", "KEY_IS_WPCOM_STORE", "KEY_JETPACK_BENEFITS_BANNER_ACTION", "KEY_JETPACK_INSTALLATION_SOURCE", "KEY_LAST_KNOWN_VERSION_CODE", "KEY_LINKED_PRODUCTS_ACTION", "KEY_NAME", "KEY_NOTE_ID", "KEY_NUMBER_OF_STORES", "KEY_OPTION", "KEY_ORDER_ID", "KEY_PARENT_ID", "KEY_PAYMENT_METHOD", "KEY_PRODUCT_COUNT", "KEY_PRODUCT_ID", "KEY_RANGE", "KEY_REFUND_IS_FULL", "KEY_REFUND_METHOD", "KEY_REFUND_TYPE", "KEY_RESULT", "KEY_REVIEW_ID", "KEY_SEARCH", "KEY_SELECTED_STORE_ID", "KEY_SOFTWARE_UPDATE_TYPE", "KEY_SORT_ORDER", "KEY_SOURCE", "KEY_STATE", "KEY_STATUS", "KEY_STEP", "KEY_SUBJECT", "KEY_TO", "KEY_TOTAL_DURATION", "KEY_TYPE", "KEY_URL", "ORDER_EDIT_BILLING_ADDRESS", "ORDER_EDIT_CUSTOMER_NOTE", "ORDER_EDIT_SHIPPING_ADDRESS", "PREFKEY_SEND_USAGE_STATS", "TRACKS_ANON_ID", "VALUE_ANNOUNCEMENT_SOURCE_SETTINGS", "VALUE_ANNOUNCEMENT_SOURCE_UPGRADE", "VALUE_API_FAILED", "VALUE_API_SUCCESS", "VALUE_CARRIER_RATES_SELECTED", "VALUE_CARRIER_RATES_STARTED", "VALUE_COUPONS_FEEDBACK", "VALUE_CUSTOMS_COMPLETE", "VALUE_CUSTOMS_STARTED", "VALUE_DESTINATION_ADDRESS_COMPLETE", "VALUE_DESTINATION_ADDRESS_STARTED", "VALUE_FEEDBACK_CANCELED", "VALUE_FEEDBACK_COMPLETED", "VALUE_FEEDBACK_DECLINED", "VALUE_FEEDBACK_DISMISSED", "VALUE_FEEDBACK_GENERAL_CONTEXT", "VALUE_FEEDBACK_GIVEN", "VALUE_FEEDBACK_LATER", "VALUE_FEEDBACK_LIKED", "VALUE_FEEDBACK_NOT_LIKED", "VALUE_FEEDBACK_OPENED", "VALUE_FEEDBACK_PRODUCT_M3_CONTEXT", "VALUE_FEEDBACK_RATED", "VALUE_FEEDBACK_SHOWN", "VALUE_FLOW_CREATION", "VALUE_FLOW_EDITING", "VALUE_INBOX_NOTE_ACTION_DISMISS", "VALUE_INBOX_NOTE_ACTION_DISMISS_ALL", "VALUE_INBOX_NOTE_ACTION_OPEN", "VALUE_MORE_MENU_ADMIN_MENU", "VALUE_MORE_MENU_COUPONS", "VALUE_MORE_MENU_INBOX", "VALUE_MORE_MENU_REVIEWS", "VALUE_MORE_MENU_VIEW_STORE", "VALUE_ORDER", "VALUE_ORDER_DETAIL", "VALUE_ORIGIN_ADDRESS_COMPLETE", "VALUE_ORIGIN_ADDRESS_STARTED", "VALUE_PACKAGES_SELECTED", "VALUE_PACKAGES_STARTED", "VALUE_PAYMENT_METHOD_SELECTED", "VALUE_PAYMENT_METHOD_STARTED", "VALUE_PRODUCTS_VARIATIONS_FEEDBACK", "VALUE_PRODUCT_ADDONS_FEEDBACK", "VALUE_PURCHASE_FAILED", "VALUE_PURCHASE_INITIATED", "VALUE_PURCHASE_READY", "VALUE_PURCHASE_SUCCEEDED", "VALUE_REVIEW", "VALUE_SHIPMENT_COPY", "VALUE_SHIPMENT_TRACK", "VALUE_SHIPPING_LABELS_M4_FEEDBACK", "VALUE_SIMPLE_PAYMENTS_COLLECT_CARD", "VALUE_SIMPLE_PAYMENTS_COLLECT_CASH", "VALUE_SIMPLE_PAYMENTS_COLLECT_LINK", "VALUE_SIMPLE_PAYMENTS_FEEDBACK", "VALUE_SIMPLE_PAYMENTS_SOURCE_AMOUNT", "VALUE_SIMPLE_PAYMENTS_SOURCE_PAYMENT_METHOD", "VALUE_SIMPLE_PAYMENTS_SOURCE_SUMMARY", "VALUE_SORT_DATE_ASC", "VALUE_SORT_DATE_DESC", "VALUE_SORT_NAME_ASC", "VALUE_SORT_NAME_DESC", "VALUE_STARTED", "VALUE_STATE_OFF", "VALUE_STATE_ON", "instance", "Lcom/woocommerce/android/analytics/AnalyticsTracker;", "value", "", "sendUsageStats", "getSendUsageStats", "()Z", "setSendUsageStats", "(Z)V", "clearAllData", "", "flush", "init", "context", "Landroid/content/Context;", "refreshMetadata", "username", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "refreshSiteMetadata", "track", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "errorContext", "errorType", "errorDescription", "properties", "", "trackBackPressed", "view", "trackViewShown", "ConnectedProductsListAction", "ConnectedProductsListContext", "DownloadableFileAction", "LinkedProductsAction", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getSendUsageStats() {
            return false;
        }
        
        public final void setSendUsageStats(boolean value) {
        }
        
        public final void init(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        public final void track(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, ?> properties) {
        }
        
        /**
         * A convenience method for logging an error event with some additional meta data.
         * @param stat The stat to track.
         * @param errorContext A string providing additional context (if any) about the error.
         * @param errorType The type of error.
         * @param errorDescription The error text or other description.
         */
        public final void track(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.Nullable
        java.lang.String errorContext, @org.jetbrains.annotations.Nullable
        java.lang.String errorType, @org.jetbrains.annotations.Nullable
        java.lang.String errorDescription) {
        }
        
        /**
         * A convenience method for logging an error event with some additional meta data.
         * @param stat The stat to track.
         * @param properties Map of additional properties
         * @param errorContext A string providing additional context (if any) about the error.
         * @param errorType The type of error.
         * @param errorDescription The error text or other description.
         */
        public final void track(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, ? extends java.lang.Object> properties, @org.jetbrains.annotations.Nullable
        java.lang.String errorContext, @org.jetbrains.annotations.Nullable
        java.lang.String errorType, @org.jetbrains.annotations.Nullable
        java.lang.String errorDescription) {
        }
        
        /**
         * A convenience method for tracking views shown during a session.
         * @param view The view to be tracked
         */
        public final void trackViewShown(@org.jetbrains.annotations.NotNull
        java.lang.Object view) {
        }
        
        /**
         * A convenience method for tracking when a user clicks the "up" or "back" buttons.
         * @param view The active view when event was fired
         */
        public final void trackBackPressed(@org.jetbrains.annotations.NotNull
        java.lang.Object view) {
        }
        
        public final void flush() {
        }
        
        public final void clearAllData() {
        }
        
        public final void refreshMetadata(@org.jetbrains.annotations.Nullable
        java.lang.String username, @org.jetbrains.annotations.Nullable
        org.wordpress.android.fluxc.model.SiteModel site) {
        }
        
        public final void refreshSiteMetadata(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.model.SiteModel site) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$DownloadableFileAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADDED", "UPDATED", "DELETED", "WooCommerce_wasabiDebug"})
        public static enum DownloadableFileAction {
            /*public static final*/ ADDED /* = new ADDED(null) */,
            /*public static final*/ UPDATED /* = new UPDATED(null) */,
            /*public static final*/ DELETED /* = new DELETED(null) */;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            DownloadableFileAction(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$LinkedProductsAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SHOWN", "DONE", "WooCommerce_wasabiDebug"})
        public static enum LinkedProductsAction {
            /*public static final*/ SHOWN /* = new SHOWN(null) */,
            /*public static final*/ DONE /* = new DONE(null) */;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            LinkedProductsAction(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$ConnectedProductsListContext;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GROUPED_PRODUCTS", "UPSELLS", "CROSS_SELLS", "WooCommerce_wasabiDebug"})
        public static enum ConnectedProductsListContext {
            /*public static final*/ GROUPED_PRODUCTS /* = new GROUPED_PRODUCTS(null) */,
            /*public static final*/ UPSELLS /* = new UPSELLS(null) */,
            /*public static final*/ CROSS_SELLS /* = new CROSS_SELLS(null) */;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            ConnectedProductsListContext(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$ConnectedProductsListAction;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADD_TAPPED", "ADDED", "DONE_TAPPED", "DELETE_TAPPED", "WooCommerce_wasabiDebug"})
        public static enum ConnectedProductsListAction {
            /*public static final*/ ADD_TAPPED /* = new ADD_TAPPED(null) */,
            /*public static final*/ ADDED /* = new ADDED(null) */,
            /*public static final*/ DONE_TAPPED /* = new DONE_TAPPED(null) */,
            /*public static final*/ DELETE_TAPPED /* = new DELETE_TAPPED(null) */;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            
            ConnectedProductsListAction(java.lang.String value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
        }
    }
}