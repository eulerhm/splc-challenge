package com.woocommerce.android;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u00c7\u0002\u0018\u00002\u00020\u0001:\f\u00c9\u0001\u00ca\u0001\u00cb\u0001\u00cc\u0001\u00cd\u0001\u00ce\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J0\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b&\u0010\'J \u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J0\u0010*\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b+\u0010\'J(\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010.\u001a\u00020)J(\u0010/\u001a\u00020-2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u00100\u001a\u00020)H\u0002J \u00101\u001a\u0004\u0018\u00010-2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J0\u00102\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b3\u0010\'J\u0006\u00104\u001a\u00020\nJ\u001a\u00105\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001dH\u0002J\b\u00106\u001a\u000207H\u0002J\u0006\u00108\u001a\u00020-J\u0006\u00109\u001a\u00020\nJ\u001a\u0010:\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001dH\u0002J\u0006\u0010;\u001a\u00020\nJ\u0006\u0010<\u001a\u00020\"J\u0006\u0010=\u001a\u00020\u001dJ\b\u0010>\u001a\u0004\u0018\u00010-J\u0006\u0010?\u001a\u00020-J\u0006\u0010@\u001a\u00020-J\u0006\u0010A\u001a\u00020\nJ\u001a\u0010B\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\"H\u0002J\u0006\u0010C\u001a\u00020\u001dJ\u001a\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0E2\u0006\u0010F\u001a\u00020\u001dJ(\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020-H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\bJ\u0010KJ\u0016\u0010L\u001a\u00020-2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020-J\u0010\u0010M\u001a\u0004\u0018\u00010\u00172\u0006\u0010N\u001a\u00020-J\u000e\u0010O\u001a\n P*\u0004\u0018\u00010707J\u0010\u0010Q\u001a\u0004\u0018\u00010-2\u0006\u0010H\u001a\u00020\u001dJ \u0010R\u001a\u00020%2\u0006\u0010H\u001a\u00020\u001dH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\bS\u0010TJ8\u0010U\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010V\u001a\u00020\"H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\bW\u0010XJ&\u0010Y\u001a\u00020-2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010V\u001a\u00020\"J\u0006\u0010Z\u001a\u00020\u001dJ\u0006\u0010[\u001a\u00020-J\u0006\u0010\\\u001a\u00020-J\u0006\u0010]\u001a\u00020\nJ\u001a\u0010^\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010_\u001a\u00020-H\u0002J\u0006\u0010`\u001a\u00020-J\u0006\u0010a\u001a\u00020-J\b\u0010b\u001a\u0004\u0018\u00010-J\b\u0010c\u001a\u0004\u0018\u00010-J\u0006\u0010d\u001a\u00020-J\u000e\u0010e\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u001dJ\u0006\u0010f\u001a\u00020\nJ\u0006\u0010g\u001a\u00020\nJ\u0006\u0010h\u001a\u00020iJ\u000e\u0010j\u001a\u00020i2\u0006\u0010\u0003\u001a\u00020\u0004J\u001e\u0010k\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u0006\u0010l\u001a\u00020\nJ\u0006\u0010m\u001a\u00020\nJ\u0006\u0010n\u001a\u00020\nJ\u0006\u0010o\u001a\u00020\nJ\u0006\u0010p\u001a\u00020\nJ\u0006\u0010q\u001a\u00020\nJ\u0006\u0010r\u001a\u00020\nJ\u0006\u0010s\u001a\u00020\nJ\u0006\u0010t\u001a\u00020\nJ\u0006\u0010u\u001a\u00020\nJ\u0006\u0010v\u001a\u00020iJ\u0010\u0010w\u001a\u00020i2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010x\u001a\u00020iJ\u0006\u0010y\u001a\u00020iJ\u0006\u0010z\u001a\u00020iJ\u0010\u0010{\u001a\u00020i2\u0006\u0010|\u001a\u00020}H\u0002J\u0006\u0010~\u001a\u00020iJ\u0006\u0010\u007f\u001a\u00020iJ\u0007\u0010\u0080\u0001\u001a\u00020iJ\u0007\u0010\u0081\u0001\u001a\u00020iJ\u0010\u0010\u0082\u0001\u001a\u00020i2\u0007\u0010\u0083\u0001\u001a\u00020\u0019J\u0019\u0010\u0084\u0001\u001a\u00020i2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\u0085\u0001\u001a\u00020i2\u0007\u0010\u0086\u0001\u001a\u00020\u001dJ)\u0010\u0087\u0001\u001a\u00020i2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J*\u0010\u008a\u0001\u001a\u00020i2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010-2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u0007\u0010\u008c\u0001\u001a\u00020iJ\u0010\u0010\u008d\u0001\u001a\u00020i2\u0007\u0010\u008e\u0001\u001a\u00020\nJ\u000f\u0010\u008f\u0001\u001a\u00020i2\u0006\u0010\t\u001a\u00020\nJ\u0019\u0010\u0090\u0001\u001a\u00020i2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u001dH\u0002J\u0010\u0010\u0091\u0001\u001a\u00020i2\u0007\u0010\u0092\u0001\u001a\u00020-J\u0010\u0010\u0093\u0001\u001a\u00020i2\u0007\u0010\u008e\u0001\u001a\u00020\nJ\u0019\u0010\u0094\u0001\u001a\u00020i2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u001dH\u0002J\u000f\u0010\u0095\u0001\u001a\u00020i2\u0006\u0010p\u001a\u00020\nJ\u0010\u0010\u0096\u0001\u001a\u00020i2\u0007\u0010\u0097\u0001\u001a\u00020\nJ\u000f\u0010\u0098\u0001\u001a\u00020i2\u0006\u0010t\u001a\u00020\nJ\u0010\u0010\u0099\u0001\u001a\u00020i2\u0007\u0010\u0086\u0001\u001a\u00020\u001dJ\u0010\u0010\u009a\u0001\u001a\u00020i2\u0007\u0010\u009b\u0001\u001a\u00020-J\u0010\u0010\u009c\u0001\u001a\u00020i2\u0007\u0010\u009d\u0001\u001a\u00020-J\u0010\u0010\u009e\u0001\u001a\u00020i2\u0007\u0010\u009f\u0001\u001a\u00020-J\u0012\u0010\u00a0\u0001\u001a\u00020i2\t\b\u0002\u0010\u00a1\u0001\u001a\u00020\nJ\u0019\u0010\u00a2\u0001\u001a\u00020i2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\"H\u0002J!\u0010\u00a3\u0001\u001a\u00020i2\u0006\u0010F\u001a\u00020\u001d2\u0007\u0010\u00a4\u0001\u001a\u00020\"2\u0007\u0010\u00a5\u0001\u001a\u00020\"J \u0010\u00a6\u0001\u001a\u00020i2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020-2\u0007\u0010\u00a7\u0001\u001a\u00020-J\u0010\u0010\u00a8\u0001\u001a\u00020i2\u0007\u0010\u008e\u0001\u001a\u00020\nJ\u0010\u0010\u00a9\u0001\u001a\u00020i2\u0007\u0010\u008e\u0001\u001a\u00020\nJ\u0017\u0010\u00aa\u0001\u001a\u00020i2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020-J0\u0010\u00ab\u0001\u001a\u00020i2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010V\u001a\u00020\"2\u0007\u0010\u00ac\u0001\u001a\u00020-J\u0010\u0010\u00ad\u0001\u001a\u00020i2\u0007\u0010\u008e\u0001\u001a\u00020\nJ\u0010\u0010\u00ae\u0001\u001a\u00020i2\u0007\u0010\u00af\u0001\u001a\u00020\u001dJ\u0010\u0010\u00b0\u0001\u001a\u00020i2\u0007\u0010\u00b1\u0001\u001a\u00020\nJ\u0011\u0010\u00b2\u0001\u001a\u00020i2\b\u0010\u00b3\u0001\u001a\u00030\u00b4\u0001J\u0010\u0010\u00b5\u0001\u001a\u00020i2\u0007\u0010\u00b6\u0001\u001a\u00020-J\u0010\u0010\u00b7\u0001\u001a\u00020i2\u0007\u0010\u00b8\u0001\u001a\u00020\nJ\u0019\u0010\u00b9\u0001\u001a\u00020i2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020-H\u0002J\u0012\u0010\u00ba\u0001\u001a\u00020i2\t\u0010\u00bb\u0001\u001a\u0004\u0018\u00010-J\u0010\u0010\u00bc\u0001\u001a\u00020i2\u0007\u0010\u00bd\u0001\u001a\u00020-J\u0010\u0010\u00be\u0001\u001a\u00020i2\u0007\u0010\u00bf\u0001\u001a\u00020\nJ\u0010\u0010\u00c0\u0001\u001a\u00020i2\u0007\u0010\u00c1\u0001\u001a\u00020-J\u0010\u0010\u00c2\u0001\u001a\u00020i2\u0007\u0010\u00c3\u0001\u001a\u00020-J\u0010\u0010\u00c4\u0001\u001a\u00020i2\u0007\u0010\u00bb\u0001\u001a\u00020-J\u0010\u0010\u00c5\u0001\u001a\u00020i2\u0007\u0010\u00c6\u0001\u001a\u00020\nJ\u0018\u0010\u00c7\u0001\u001a\u00020i2\u0007\u0010\u00c8\u0001\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR(\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u00cf\u0001"}, d2 = {"Lcom/woocommerce/android/AppPrefs;", "", "()V", "context", "Landroid/content/Context;", "installationDate", "Ljava/util/Date;", "getInstallationDate", "()Ljava/util/Date;", "value", "", "isCouponsEnabled", "()Z", "setCouponsEnabled", "(Z)V", "isProductAddonsEnabled", "setProductAddonsEnabled", "relativeInstallationDate", "getRelativeInstallationDate", "setRelativeInstallationDate", "(Ljava/util/Date;)V", "exists", "key", "Lcom/woocommerce/android/AppPrefs$PrefKey;", "getAppTheme", "Lcom/woocommerce/android/util/ThemeOption;", "getBoolean", "default", "getCancelledAppVersionCode", "", "getCardReaderOnboardingStatus", "Lcom/woocommerce/android/AppPrefs$CardReaderOnboardingStatus;", "localSiteId", "remoteSiteId", "", "selfHostedSiteId", "getCardReaderOnboardingStatusKey", "Lcom/woocommerce/android/AppPrefs$PrefKeyString;", "getCardReaderOnboardingStatusKey-KwUQulI", "(IJJ)Ljava/lang/String;", "getCardReaderPreferredPlugin", "Lcom/woocommerce/android/ui/cardreader/onboarding/PluginType;", "getCardReaderPreferredPluginKey", "getCardReaderPreferredPluginKey-KwUQulI", "getCardReaderPreferredPluginVersion", "", "preferredPlugin", "getCardReaderPreferredPluginVersionKey", "plugin", "getCardReaderStatementDescriptor", "getCardReaderStatementDescriptorKey", "getCardReaderStatementDescriptorKey-KwUQulI", "getDatabaseDowngraded", "getDeletableInt", "getDeleteablePreferences", "Landroid/content/SharedPreferences;", "getFCMToken", "getImageOptimizationEnabled", "getInt", "getIsSelectedShipmentTrackingProviderCustom", "getJetpackBenefitsDismissalDate", "getLastAppVersionCode", "getLastConnectedCardReaderId", "getLastVersionWithAnnouncement", "getLoginSiteAddress", "getLoginUserBypassedJetpackRequired", "getLong", "getNumTimesMarkAllReadSnackShown", "getOrderFilterCustomDateRange", "Lkotlin/Pair;", "selectedSiteId", "getOrderFilterKey", "currentSiteId", "filterCategory", "getOrderFilterKey-Z-kaEu0", "(ILjava/lang/String;)Ljava/lang/String;", "getOrderFilters", "getPermissionAskedKey", "permission", "getPreferences", "kotlin.jvm.PlatformType", "getProductSortingChoice", "getProductSortingKey", "getProductSortingKey-rko039M", "(I)Ljava/lang/String;", "getReceiptKey", "orderId", "getReceiptKey-LHKrp54", "(IJJJ)Ljava/lang/String;", "getReceiptUrl", "getSelectedOrderListTabPosition", "getSelectedProductType", "getSelectedShipmentTrackingProviderName", "getShowCardReaderConnectedTutorial", "getString", "defaultValue", "getSupportEmail", "getSupportName", "getUnifiedLoginLastFlow", "getUnifiedLoginLastSource", "getUserEmail", "getWcShippingBannerDismissed", "hasSelectedOrderListTabPosition", "hasSupportEmail", "incNumTimesMarkAllReadSnackShown", "", "init", "isCardReaderOnboardingCompleted", "isCardReaderWelcomeDialogShown", "isCrashReportingEnabled", "isOrderNotificationsChaChingEnabled", "isOrderNotificationsEnabled", "isProductsFeatureEnabled", "isReviewNotificationsEnabled", "isSelectedProductVirtual", "isTrackingExtensionAvailable", "isUserEligible", "isV4StatsSupported", "recordJetpackBenefitsDismissal", "remove", "removeLastConnectedCardReaderId", "removeLoginSiteAddress", "removeLoginUserBypassedJetpackRequired", "removePreferencesWithDynamicKey", "editor", "Landroid/content/SharedPreferences$Editor;", "removeSupportEmail", "removeSupportName", "resetSitePreferences", "resetUserPreferences", "setAppTheme", "theme", "setBoolean", "setCancelledAppVersionCode", "versionCode", "setCardReaderOnboardingData", "data", "Lcom/woocommerce/android/ui/cardreader/onboarding/PersistentOnboardingData;", "setCardReaderStatementDescriptor", "statementDescriptor", "setCardReaderWelcomeDialogShown", "setCrashReportingEnabled", "enabled", "setDatabaseDowngraded", "setDeletableInt", "setFCMToken", "token", "setImageOptimizationEnabled", "setInt", "setIsProductsFeatureEnabled", "setIsSelectedShipmentTrackingProviderNameCustom", "isCustomProvider", "setIsUserEligible", "setLastAppVersionCode", "setLastConnectedCardReaderId", "readerId", "setLastVersionWithAnnouncement", "version", "setLoginSiteAddress", "loginSiteAddress", "setLoginUserBypassedJetpackRequired", "bypassedLogin", "setLong", "setOrderFilterCustomDateRange", "startDateMillis", "endDateMillis", "setOrderFilters", "filterValue", "setOrderNotificationsChaChingEnabled", "setOrderNotificationsEnabled", "setProductSortingChoice", "setReceiptUrl", "url", "setReviewNotificationsEnabled", "setSelectedOrderListTab", "selectedOrderListTabPosition", "setSelectedProductIsVirtual", "isVirtual", "setSelectedProductType", "type", "Lcom/woocommerce/android/ui/products/ProductType;", "setSelectedShipmentTrackingProviderName", "providerName", "setShowCardReaderConnectedTutorial", "show", "setString", "setSupportEmail", "email", "setSupportName", "name", "setTrackingExtensionAvailable", "isAvailable", "setUnifiedLoginLastFlow", "flow", "setUnifiedLoginLastSource", "source", "setUserEmail", "setV4StatsSupported", "isUsingV4Api", "setWcShippingBannerDismissed", "dismissed", "CardReaderOnboardingStatus", "DeletablePrefKey", "DeletableSitePrefKey", "PrefKey", "PrefKeyString", "UndeletablePrefKey", "WooCommerce_vanillaDebug"})
public final class AppPrefs {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.AppPrefs INSTANCE = null;
    private static android.content.Context context;
    
    private AppPrefs() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getInstallationDate() {
        return null;
    }
    
    private final java.util.Date getRelativeInstallationDate() {
        return null;
    }
    
    private final void setRelativeInstallationDate(java.util.Date value) {
    }
    
    public final boolean isProductAddonsEnabled() {
        return false;
    }
    
    public final void setProductAddonsEnabled(boolean value) {
    }
    
    public final boolean isCouponsEnabled() {
        return false;
    }
    
    public final void setCouponsEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductSortingChoice(int currentSiteId) {
        return null;
    }
    
    public final void setProductSortingChoice(int currentSiteId, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int getLastAppVersionCode() {
        return 0;
    }
    
    public final void setLastAppVersionCode(int versionCode) {
    }
    
    public final int getCancelledAppVersionCode() {
        return 0;
    }
    
    public final void setCancelledAppVersionCode(int versionCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFCMToken() {
        return null;
    }
    
    public final void setFCMToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void setSupportEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSupportEmail() {
        return null;
    }
    
    public final boolean hasSupportEmail() {
        return false;
    }
    
    public final void removeSupportEmail() {
    }
    
    public final void setSupportName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSupportName() {
        return null;
    }
    
    public final void removeSupportName() {
    }
    
    /**
     * Method to check if the v4 stats UI is supported.
     */
    public final boolean isV4StatsSupported() {
        return false;
    }
    
    public final void setV4StatsSupported(boolean isUsingV4Api) {
    }
    
    public final boolean isUserEligible() {
        return false;
    }
    
    public final void setIsUserEligible(boolean isUserEligible) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceiptUrl(int localSiteId, long remoteSiteId, long selfHostedSiteId, long orderId) {
        return null;
    }
    
    public final void setReceiptUrl(int localSiteId, long remoteSiteId, long selfHostedSiteId, long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void setLastConnectedCardReaderId(@org.jetbrains.annotations.NotNull()
    java.lang.String readerId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastConnectedCardReaderId() {
        return null;
    }
    
    public final void removeLastConnectedCardReaderId() {
    }
    
    public final boolean getShowCardReaderConnectedTutorial() {
        return false;
    }
    
    public final void setShowCardReaderConnectedTutorial(boolean show) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastVersionWithAnnouncement() {
        return null;
    }
    
    public final void setLastVersionWithAnnouncement(@org.jetbrains.annotations.NotNull()
    java.lang.String version) {
    }
    
    public final void setCardReaderWelcomeDialogShown() {
    }
    
    /**
     * Flag to check products features are enabled
     */
    public final boolean isProductsFeatureEnabled() {
        return false;
    }
    
    public final void setIsProductsFeatureEnabled(boolean isProductsFeatureEnabled) {
    }
    
    public final boolean isCrashReportingEnabled() {
        return false;
    }
    
    public final void setCrashReportingEnabled(boolean enabled) {
    }
    
    public final boolean isOrderNotificationsEnabled() {
        return false;
    }
    
    public final void setOrderNotificationsEnabled(boolean enabled) {
    }
    
    public final boolean isReviewNotificationsEnabled() {
        return false;
    }
    
    public final void setReviewNotificationsEnabled(boolean enabled) {
    }
    
    public final boolean isOrderNotificationsChaChingEnabled() {
        return false;
    }
    
    public final void setOrderNotificationsChaChingEnabled(boolean enabled) {
    }
    
    public final int getNumTimesMarkAllReadSnackShown() {
        return 0;
    }
    
    public final void incNumTimesMarkAllReadSnackShown() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedShipmentTrackingProviderName() {
        return null;
    }
    
    public final void setSelectedShipmentTrackingProviderName(@org.jetbrains.annotations.NotNull()
    java.lang.String providerName) {
    }
    
    public final boolean getIsSelectedShipmentTrackingProviderCustom() {
        return false;
    }
    
    public final void setIsSelectedShipmentTrackingProviderNameCustom(boolean isCustomProvider) {
    }
    
    public final void setLoginSiteAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String loginSiteAddress) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLoginSiteAddress() {
        return null;
    }
    
    public final void removeLoginSiteAddress() {
    }
    
    public final void setLoginUserBypassedJetpackRequired(boolean bypassedLogin) {
    }
    
    public final boolean getLoginUserBypassedJetpackRequired() {
        return false;
    }
    
    public final void removeLoginUserBypassedJetpackRequired() {
    }
    
    public final boolean getDatabaseDowngraded() {
        return false;
    }
    
    public final void setDatabaseDowngraded(boolean value) {
    }
    
    public final void setSelectedOrderListTab(int selectedOrderListTabPosition) {
    }
    
    public final int getSelectedOrderListTabPosition() {
        return 0;
    }
    
    public final void setSelectedProductType(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductType type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedProductType() {
        return null;
    }
    
    public final void setSelectedProductIsVirtual(boolean isVirtual) {
    }
    
    public final boolean isSelectedProductVirtual() {
        return false;
    }
    
    /**
     * Checks if the user has a saved order list tab position yet. If no position has been saved,
     * then the value will be the default of -1.
     *
     * @return True if the saved position is not the default -1, else false
     */
    public final boolean hasSelectedOrderListTabPosition() {
        return false;
    }
    
    public final boolean getImageOptimizationEnabled() {
        return false;
    }
    
    public final void setImageOptimizationEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.ThemeOption getAppTheme() {
        return null;
    }
    
    public final void setAppTheme(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.ThemeOption theme) {
    }
    
    /**
     * Used during the unified login process to track the last source the user was in before
     * closing the app so if the user opens and finishes the flow at a later day the tracks
     * events will be complete.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUnifiedLoginLastSource() {
        return null;
    }
    
    public final void setUnifiedLoginLastSource(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
    
    /**
     * Used during the unified login process to track the last flow the user was in before
     * closing the app so if the user opens and finishes the flow at a later day the tracks
     * events will be complete.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUnifiedLoginLastFlow() {
        return null;
    }
    
    public final void setUnifiedLoginLastFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String flow) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.AppPrefs.CardReaderOnboardingStatus getCardReaderOnboardingStatus(int localSiteId, long remoteSiteId, long selfHostedSiteId) {
        return null;
    }
    
    public final boolean isCardReaderOnboardingCompleted(int localSiteId, long remoteSiteId, long selfHostedSiteId) {
        return false;
    }
    
    public final boolean isCardReaderWelcomeDialogShown() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.ui.cardreader.onboarding.PluginType getCardReaderPreferredPlugin(int localSiteId, long remoteSiteId, long selfHostedSiteId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCardReaderPreferredPluginVersion(int localSiteId, long remoteSiteId, long selfHostedSiteId, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.onboarding.PluginType preferredPlugin) {
        return null;
    }
    
    public final void setCardReaderOnboardingData(int localSiteId, long remoteSiteId, long selfHostedSiteId, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.onboarding.PersistentOnboardingData data) {
    }
    
    private final java.lang.String getCardReaderPreferredPluginVersionKey(int localSiteId, long remoteSiteId, long selfHostedSiteId, com.woocommerce.android.ui.cardreader.onboarding.PluginType plugin) {
        return null;
    }
    
    public final void setCardReaderStatementDescriptor(@org.jetbrains.annotations.Nullable()
    java.lang.String statementDescriptor, int localSiteId, long remoteSiteId, long selfHostedSiteId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCardReaderStatementDescriptor(int localSiteId, long remoteSiteId, long selfHostedSiteId) {
        return null;
    }
    
    public final long getJetpackBenefitsDismissalDate() {
        return 0L;
    }
    
    public final void recordJetpackBenefitsDismissal() {
    }
    
    public final boolean isTrackingExtensionAvailable() {
        return false;
    }
    
    public final void setTrackingExtensionAvailable(boolean isAvailable) {
    }
    
    public final void setOrderFilters(int currentSiteId, @org.jetbrains.annotations.NotNull()
    java.lang.String filterCategory, @org.jetbrains.annotations.NotNull()
    java.lang.String filterValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderFilters(int currentSiteId, @org.jetbrains.annotations.NotNull()
    java.lang.String filterCategory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Long, java.lang.Long> getOrderFilterCustomDateRange(int selectedSiteId) {
        return null;
    }
    
    public final void setOrderFilterCustomDateRange(int selectedSiteId, long startDateMillis, long endDateMillis) {
    }
    
    public final void setWcShippingBannerDismissed(boolean dismissed, int currentSiteId) {
    }
    
    public final boolean getWcShippingBannerDismissed(int currentSiteId) {
        return false;
    }
    
    /**
     * Remove all user and site-related preferences.
     */
    public final void resetUserPreferences() {
    }
    
    /**
     * This method removes entries in shared preferences which use dynamically created keys.
     *
     * For example order receipts are stored under "RECEIPT_PREFIX:siteId:...:orderId" - each entry has a different
     * key based on the currently selected site and the order it's related to.
     */
    private final void removePreferencesWithDynamicKey(android.content.SharedPreferences.Editor editor) {
    }
    
    /**
     * Remove all site-related preferences.
     */
    public final void resetSitePreferences() {
    }
    
    private final int getInt(com.woocommerce.android.AppPrefs.PrefKey key, int p1_772401952) {
        return 0;
    }
    
    private final void setInt(com.woocommerce.android.AppPrefs.PrefKey key, int value) {
    }
    
    private final long getLong(com.woocommerce.android.AppPrefs.PrefKey key, long p1_772401952) {
        return 0L;
    }
    
    private final void setLong(com.woocommerce.android.AppPrefs.PrefKey key, long value) {
    }
    
    private final java.lang.String getString(com.woocommerce.android.AppPrefs.PrefKey key, java.lang.String defaultValue) {
        return null;
    }
    
    private final void setString(com.woocommerce.android.AppPrefs.PrefKey key, java.lang.String value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs.PrefKey key, boolean p1_772401952) {
        return false;
    }
    
    public final void setBoolean(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs.PrefKey key, boolean value) {
    }
    
    public final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    private final void remove(com.woocommerce.android.AppPrefs.PrefKey key) {
    }
    
    public final boolean exists(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs.PrefKey key) {
        return false;
    }
    
    /**
     * Methods used to store values in SharedPreferences that are not backed up
     * when app is installed/uninstalled. Currently, only used for storing appVersionCode.
     * We might want to migrate this to it's own class if we are to use this for other
     * attributes as well.
     */
    private final int getDeletableInt(com.woocommerce.android.AppPrefs.PrefKey key, int p1_772401952) {
        return 0;
    }
    
    private final void setDeletableInt(com.woocommerce.android.AppPrefs.PrefKey key, int value) {
    }
    
    private final android.content.SharedPreferences getDeleteablePreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.AppPrefs.PrefKey getPermissionAskedKey(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/woocommerce/android/AppPrefs$PrefKey;", "", "WooCommerce_vanillaDebug"})
    public static abstract interface PrefKey {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/AppPrefs$PrefKeyString;", "Lcom/woocommerce/android/AppPrefs$PrefKey;", "key", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    @kotlin.jvm.JvmInline()
    public static final class PrefKeyString implements com.woocommerce.android.AppPrefs.PrefKey {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        @java.lang.Override()
        public boolean equals(java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
    }
    
    /**
     * Application related preferences. When the user logs out, these preferences are erased.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b \b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/AppPrefs$DeletablePrefKey;", "", "Lcom/woocommerce/android/AppPrefs$PrefKey;", "(Ljava/lang/String;I)V", "SUPPORT_EMAIL", "SUPPORT_NAME", "IS_USING_V4_API", "HAS_UNSEEN_REVIEWS", "SELECTED_SHIPMENT_TRACKING_PROVIDER_NAME", "SELECTED_SHIPMENT_TRACKING_PROVIDER_IS_CUSTOM", "LOGIN_SITE_ADDRESS", "DATABASE_DOWNGRADED", "IS_PRODUCTS_FEATURE_ENABLED", "IS_PRODUCT_ADDONS_ENABLED", "IS_COUPONS_ENABLED", "LOGIN_USER_BYPASSED_JETPACK_REQUIRED", "SELECTED_ORDER_LIST_TAB_POSITION", "IMAGE_OPTIMIZE_ENABLED", "SELECTED_APP_THEME", "SELECTED_PRODUCT_TYPE", "SELECTED_PRODUCT_IS_VIRTUAL", "UNIFIED_LOGIN_LAST_ACTIVE_SOURCE", "UNIFIED_LOGIN_LAST_ACTIVE_FLOW", "IS_USER_ELIGIBLE", "USER_EMAIL", "RECEIPT_PREFIX", "CARD_READER_ONBOARDING_COMPLETED_STATUS_V2", "CARD_READER_PREFERRED_PLUGIN", "CARD_READER_PREFERRED_PLUGIN_VERSION", "CARD_READER_STATEMENT_DESCRIPTOR", "ORDER_FILTER_PREFIX", "ORDER_FILTER_CUSTOM_DATE_RANGE_START", "ORDER_FILTER_CUSTOM_DATE_RANGE_END", "PRODUCT_SORTING_PREFIX", "WooCommerce_vanillaDebug"})
    static enum DeletablePrefKey implements com.woocommerce.android.AppPrefs.PrefKey {
        /*public static final*/ SUPPORT_EMAIL /* = new SUPPORT_EMAIL() */,
        /*public static final*/ SUPPORT_NAME /* = new SUPPORT_NAME() */,
        /*public static final*/ IS_USING_V4_API /* = new IS_USING_V4_API() */,
        /*public static final*/ HAS_UNSEEN_REVIEWS /* = new HAS_UNSEEN_REVIEWS() */,
        /*public static final*/ SELECTED_SHIPMENT_TRACKING_PROVIDER_NAME /* = new SELECTED_SHIPMENT_TRACKING_PROVIDER_NAME() */,
        /*public static final*/ SELECTED_SHIPMENT_TRACKING_PROVIDER_IS_CUSTOM /* = new SELECTED_SHIPMENT_TRACKING_PROVIDER_IS_CUSTOM() */,
        /*public static final*/ LOGIN_SITE_ADDRESS /* = new LOGIN_SITE_ADDRESS() */,
        /*public static final*/ DATABASE_DOWNGRADED /* = new DATABASE_DOWNGRADED() */,
        /*public static final*/ IS_PRODUCTS_FEATURE_ENABLED /* = new IS_PRODUCTS_FEATURE_ENABLED() */,
        /*public static final*/ IS_PRODUCT_ADDONS_ENABLED /* = new IS_PRODUCT_ADDONS_ENABLED() */,
        /*public static final*/ IS_COUPONS_ENABLED /* = new IS_COUPONS_ENABLED() */,
        /*public static final*/ LOGIN_USER_BYPASSED_JETPACK_REQUIRED /* = new LOGIN_USER_BYPASSED_JETPACK_REQUIRED() */,
        /*public static final*/ SELECTED_ORDER_LIST_TAB_POSITION /* = new SELECTED_ORDER_LIST_TAB_POSITION() */,
        /*public static final*/ IMAGE_OPTIMIZE_ENABLED /* = new IMAGE_OPTIMIZE_ENABLED() */,
        /*public static final*/ SELECTED_APP_THEME /* = new SELECTED_APP_THEME() */,
        /*public static final*/ SELECTED_PRODUCT_TYPE /* = new SELECTED_PRODUCT_TYPE() */,
        /*public static final*/ SELECTED_PRODUCT_IS_VIRTUAL /* = new SELECTED_PRODUCT_IS_VIRTUAL() */,
        /*public static final*/ UNIFIED_LOGIN_LAST_ACTIVE_SOURCE /* = new UNIFIED_LOGIN_LAST_ACTIVE_SOURCE() */,
        /*public static final*/ UNIFIED_LOGIN_LAST_ACTIVE_FLOW /* = new UNIFIED_LOGIN_LAST_ACTIVE_FLOW() */,
        /*public static final*/ IS_USER_ELIGIBLE /* = new IS_USER_ELIGIBLE() */,
        /*public static final*/ USER_EMAIL /* = new USER_EMAIL() */,
        /*public static final*/ RECEIPT_PREFIX /* = new RECEIPT_PREFIX() */,
        /*public static final*/ CARD_READER_ONBOARDING_COMPLETED_STATUS_V2 /* = new CARD_READER_ONBOARDING_COMPLETED_STATUS_V2() */,
        /*public static final*/ CARD_READER_PREFERRED_PLUGIN /* = new CARD_READER_PREFERRED_PLUGIN() */,
        /*public static final*/ CARD_READER_PREFERRED_PLUGIN_VERSION /* = new CARD_READER_PREFERRED_PLUGIN_VERSION() */,
        /*public static final*/ CARD_READER_STATEMENT_DESCRIPTOR /* = new CARD_READER_STATEMENT_DESCRIPTOR() */,
        /*public static final*/ ORDER_FILTER_PREFIX /* = new ORDER_FILTER_PREFIX() */,
        /*public static final*/ ORDER_FILTER_CUSTOM_DATE_RANGE_START /* = new ORDER_FILTER_CUSTOM_DATE_RANGE_START() */,
        /*public static final*/ ORDER_FILTER_CUSTOM_DATE_RANGE_END /* = new ORDER_FILTER_CUSTOM_DATE_RANGE_END() */,
        /*public static final*/ PRODUCT_SORTING_PREFIX /* = new PRODUCT_SORTING_PREFIX() */;
        
        DeletablePrefKey() {
        }
    }
    
    /**
     * Application related preferences. When the user changes a site, these preferences are erased.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/AppPrefs$DeletableSitePrefKey;", "", "Lcom/woocommerce/android/AppPrefs$PrefKey;", "(Ljava/lang/String;I)V", "TRACKING_EXTENSION_AVAILABLE", "JETPACK_BENEFITS_BANNER_DISMISSAL_DATE", "WooCommerce_vanillaDebug"})
    static enum DeletableSitePrefKey implements com.woocommerce.android.AppPrefs.PrefKey {
        /*public static final*/ TRACKING_EXTENSION_AVAILABLE /* = new TRACKING_EXTENSION_AVAILABLE() */,
        /*public static final*/ JETPACK_BENEFITS_BANNER_DISMISSAL_DATE /* = new JETPACK_BENEFITS_BANNER_DISMISSAL_DATE() */;
        
        DeletableSitePrefKey() {
        }
    }
    
    /**
     * These preferences won't be deleted when the user disconnects.
     * They should be used for device specific or user-independent preferences.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/AppPrefs$UndeletablePrefKey;", "", "Lcom/woocommerce/android/AppPrefs$PrefKey;", "(Ljava/lang/String;I)V", "LAST_APP_VERSION_CODE", "ENABLE_CRASH_REPORTING", "NOTIFS_ORDERS_ENABLED", "NOTIFS_REVIEWS_ENABLED", "NOTIFS_ORDERS_CHA_CHING_ENABLED", "NUM_TIMES_MARK_ALL_NOTIFS_READ_SNACK_SHOWN", "CANCELLED_APP_VERSION_CODE", "ASKED_PERMISSION_CAMERA", "APP_INSTALATION_DATE", "LAST_CONNECTED_CARD_READER_ID", "SHOW_CARD_READER_CONNECTED_TUTORIAL", "LAST_VERSION_WITH_ANNOUNCEMENT", "CARD_READER_WELCOME_SHOWN", "WC_PREF_NOTIFICATIONS_TOKEN", "WC_SHIPPING_BANNER_DISMISSED", "WooCommerce_vanillaDebug"})
    static enum UndeletablePrefKey implements com.woocommerce.android.AppPrefs.PrefKey {
        /*public static final*/ LAST_APP_VERSION_CODE /* = new LAST_APP_VERSION_CODE() */,
        /*public static final*/ ENABLE_CRASH_REPORTING /* = new ENABLE_CRASH_REPORTING() */,
        /*public static final*/ NOTIFS_ORDERS_ENABLED /* = new NOTIFS_ORDERS_ENABLED() */,
        /*public static final*/ NOTIFS_REVIEWS_ENABLED /* = new NOTIFS_REVIEWS_ENABLED() */,
        /*public static final*/ NOTIFS_ORDERS_CHA_CHING_ENABLED /* = new NOTIFS_ORDERS_CHA_CHING_ENABLED() */,
        /*public static final*/ NUM_TIMES_MARK_ALL_NOTIFS_READ_SNACK_SHOWN /* = new NUM_TIMES_MARK_ALL_NOTIFS_READ_SNACK_SHOWN() */,
        /*public static final*/ CANCELLED_APP_VERSION_CODE /* = new CANCELLED_APP_VERSION_CODE() */,
        /*public static final*/ ASKED_PERMISSION_CAMERA /* = new ASKED_PERMISSION_CAMERA() */,
        /*public static final*/ APP_INSTALATION_DATE /* = new APP_INSTALATION_DATE() */,
        /*public static final*/ LAST_CONNECTED_CARD_READER_ID /* = new LAST_CONNECTED_CARD_READER_ID() */,
        /*public static final*/ SHOW_CARD_READER_CONNECTED_TUTORIAL /* = new SHOW_CARD_READER_CONNECTED_TUTORIAL() */,
        /*public static final*/ LAST_VERSION_WITH_ANNOUNCEMENT /* = new LAST_VERSION_WITH_ANNOUNCEMENT() */,
        /*public static final*/ CARD_READER_WELCOME_SHOWN /* = new CARD_READER_WELCOME_SHOWN() */,
        /*public static final*/ WC_PREF_NOTIFICATIONS_TOKEN /* = new WC_PREF_NOTIFICATIONS_TOKEN() */,
        /*public static final*/ WC_SHIPPING_BANNER_DISMISSED /* = new WC_SHIPPING_BANNER_DISMISSED() */;
        
        UndeletablePrefKey() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/AppPrefs$CardReaderOnboardingStatus;", "", "(Ljava/lang/String;I)V", "CARD_READER_ONBOARDING_COMPLETED", "CARD_READER_ONBOARDING_PENDING", "CARD_READER_ONBOARDING_NOT_COMPLETED", "WooCommerce_vanillaDebug"})
    public static enum CardReaderOnboardingStatus {
        /*public static final*/ CARD_READER_ONBOARDING_COMPLETED /* = new CARD_READER_ONBOARDING_COMPLETED() */,
        /*public static final*/ CARD_READER_ONBOARDING_PENDING /* = new CARD_READER_ONBOARDING_PENDING() */,
        /*public static final*/ CARD_READER_ONBOARDING_NOT_COMPLETED /* = new CARD_READER_ONBOARDING_NOT_COMPLETED() */;
        
        CardReaderOnboardingStatus() {
        }
    }
}