package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0005\'()*+B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0017\u001a\u00020\nJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000fJ\u001c\u0010!\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u000fH\u0007J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "", "analyticsTracker", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "(Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;)V", "value", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Flow;", "currentFlow", "setCurrentFlow", "(Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Flow;)V", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Source;", "currentSource", "setCurrentSource", "(Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Source;)V", "<set-?>", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Step;", "currentStep", "getCurrentStep", "()Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Step;", "buildDefaultParams", "", "", "getFlow", "getSource", "handleMissingFlowOrStep", "", "setFlow", "setFlowAndStep", "flow", "step", "setSource", "source", "setStep", "track", "trackClick", "click", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Click;", "trackFailure", "error", "Click", "Companion", "Flow", "Source", "Step", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class UnifiedLoginTracker {
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTracker = null;
    private com.woocommerce.android.ui.login.UnifiedLoginTracker.Source currentSource = com.woocommerce.android.ui.login.UnifiedLoginTracker.Source.DEFAULT;
    private com.woocommerce.android.ui.login.UnifiedLoginTracker.Flow currentFlow;
    @org.jetbrains.annotations.Nullable
    private com.woocommerce.android.ui.login.UnifiedLoginTracker.Step currentStep;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.login.UnifiedLoginTracker.Companion Companion = null;
    private static final java.lang.String SOURCE = "source";
    private static final java.lang.String FLOW = "flow";
    private static final java.lang.String STEP = "step";
    private static final java.lang.String FAILURE = "failure";
    private static final java.lang.String CLICK = "click";
    
    @javax.inject.Inject
    public UnifiedLoginTracker(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTracker) {
        super();
    }
    
    private final void setCurrentSource(com.woocommerce.android.ui.login.UnifiedLoginTracker.Source value) {
    }
    
    private final void setCurrentFlow(com.woocommerce.android.ui.login.UnifiedLoginTracker.Flow value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.ui.login.UnifiedLoginTracker.Step getCurrentStep() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads
    public final void track(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Flow flow, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Step step) {
    }
    
    @kotlin.jvm.JvmOverloads
    public final void track(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Step step) {
    }
    
    public final void trackFailure(@org.jetbrains.annotations.Nullable
    java.lang.String error) {
    }
    
    public final void trackClick(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Click click) {
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> buildDefaultParams() {
        return null;
    }
    
    private final void handleMissingFlowOrStep(java.lang.String value) {
    }
    
    public final void setSource(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Source source) {
    }
    
    public final void setSource(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void setFlow(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    public final void setStep(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Step step) {
    }
    
    public final void setFlowAndStep(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Flow flow, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker.Step step) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.login.UnifiedLoginTracker.Source getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.ui.login.UnifiedLoginTracker.Flow getFlow() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Source;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "JETPACK", "SHARE", "DEEPLINK", "REAUTHENTICATION", "SELF_HOSTED", "ADD_WORDPRESS_COM_ACCOUNT", "DEFAULT", "WooCommerce_wasabiDebug"})
    public static enum Source {
        /*public static final*/ JETPACK /* = new JETPACK(null) */,
        /*public static final*/ SHARE /* = new SHARE(null) */,
        /*public static final*/ DEEPLINK /* = new DEEPLINK(null) */,
        /*public static final*/ REAUTHENTICATION /* = new REAUTHENTICATION(null) */,
        /*public static final*/ SELF_HOSTED /* = new SELF_HOSTED(null) */,
        /*public static final*/ ADD_WORDPRESS_COM_ACCOUNT /* = new ADD_WORDPRESS_COM_ACCOUNT(null) */,
        /*public static final*/ DEFAULT /* = new DEFAULT(null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        
        Source(java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Flow;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PROLOGUE", "WORDPRESS_COM", "GOOGLE_LOGIN", "LOGIN_MAGIC_LINK", "LOGIN_PASSWORD", "LOGIN_STORE_CREDS", "LOGIN_SITE_ADDRESS", "SIGNUP", "GOOGLE_SIGNUP", "EPILOGUE", "WooCommerce_wasabiDebug"})
    public static enum Flow {
        /*public static final*/ PROLOGUE /* = new PROLOGUE(null) */,
        /*public static final*/ WORDPRESS_COM /* = new WORDPRESS_COM(null) */,
        /*public static final*/ GOOGLE_LOGIN /* = new GOOGLE_LOGIN(null) */,
        /*public static final*/ LOGIN_MAGIC_LINK /* = new LOGIN_MAGIC_LINK(null) */,
        /*public static final*/ LOGIN_PASSWORD /* = new LOGIN_PASSWORD(null) */,
        /*public static final*/ LOGIN_STORE_CREDS /* = new LOGIN_STORE_CREDS(null) */,
        /*public static final*/ LOGIN_SITE_ADDRESS /* = new LOGIN_SITE_ADDRESS(null) */,
        /*public static final*/ SIGNUP /* = new SIGNUP(null) */,
        /*public static final*/ GOOGLE_SIGNUP /* = new GOOGLE_SIGNUP(null) */,
        /*public static final*/ EPILOGUE /* = new EPILOGUE(null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        
        Flow(java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Step;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PROLOGUE", "START", "MAGIC_LINK_REQUESTED", "ENTER_SITE_ADDRESS", "ENTER_EMAIL_ADDRESS", "EMAIL_OPENED", "USERNAME_PASSWORD", "SUCCESS", "HELP", "SHOW_EMAIL_HINTS", "CONNECTION_ERROR", "WRONG_WP_ACCOUNT", "NO_WOO_STORES", "SITE_LIST", "JETPACK_NOT_CONNECTED", "NOT_WOO_STORE", "NO_WPCOM_ACCOUNT_FOUND", "NOT_WORDPRESS_SITE", "Companion", "WooCommerce_wasabiDebug"})
    public static enum Step {
        /*public static final*/ PROLOGUE /* = new PROLOGUE(null) */,
        /*public static final*/ START /* = new START(null) */,
        /*public static final*/ MAGIC_LINK_REQUESTED /* = new MAGIC_LINK_REQUESTED(null) */,
        /*public static final*/ ENTER_SITE_ADDRESS /* = new ENTER_SITE_ADDRESS(null) */,
        /*public static final*/ ENTER_EMAIL_ADDRESS /* = new ENTER_EMAIL_ADDRESS(null) */,
        /*public static final*/ EMAIL_OPENED /* = new EMAIL_OPENED(null) */,
        /*public static final*/ USERNAME_PASSWORD /* = new USERNAME_PASSWORD(null) */,
        /*public static final*/ SUCCESS /* = new SUCCESS(null) */,
        /*public static final*/ HELP /* = new HELP(null) */,
        /*public static final*/ SHOW_EMAIL_HINTS /* = new SHOW_EMAIL_HINTS(null) */,
        /*public static final*/ CONNECTION_ERROR /* = new CONNECTION_ERROR(null) */,
        /*public static final*/ WRONG_WP_ACCOUNT /* = new WRONG_WP_ACCOUNT(null) */,
        /*public static final*/ NO_WOO_STORES /* = new NO_WOO_STORES(null) */,
        /*public static final*/ SITE_LIST /* = new SITE_LIST(null) */,
        /*public static final*/ JETPACK_NOT_CONNECTED /* = new JETPACK_NOT_CONNECTED(null) */,
        /*public static final*/ NOT_WOO_STORE /* = new NOT_WOO_STORE(null) */,
        /*public static final*/ NO_WPCOM_ACCOUNT_FOUND /* = new NO_WPCOM_ACCOUNT_FOUND(null) */,
        /*public static final*/ NOT_WORDPRESS_SITE /* = new NOT_WORDPRESS_SITE(null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.login.UnifiedLoginTracker.Step.Companion Companion = null;
        private static final java.util.Map<java.lang.String, com.woocommerce.android.ui.login.UnifiedLoginTracker.Step> valueMap = null;
        
        Step(java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Step$Companion;", "", "()V", "valueMap", "", "", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Step;", "fromValue", "value", "WooCommerce_wasabiDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.ui.login.UnifiedLoginTracker.Step fromValue(@org.jetbrains.annotations.NotNull
            java.lang.String value) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Click;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUBMIT", "DISMISS", "CONTINUE_WITH_WORDPRESS_COM", "LOGIN_WITH_SITE_ADDRESS", "LOGIN_WITH_GOOGLE", "FORGOTTEN_PASSWORD", "OPEN_EMAIL_CLIENT", "SHOW_HELP", "SEND_CODE_WITH_TEXT", "SUBMIT_2FA_CODE", "REQUEST_MAGIC_LINK", "LOGIN_WITH_PASSWORD", "HELP_FINDING_SITE_ADDRESS", "SELECT_EMAIL_FIELD", "PICK_EMAIL_FROM_HINT", "LOGIN_WITH_SITE_CREDS", "VIEW_CONNECTED_STORES", "TRY_ANOTHER_ACCOUNT", "TRY_ANOTHER_STORE", "HELP_FINDING_CONNECTED_EMAIL", "REFRESH_APP", "HELP_TROUBLESHOOTING_TIPS", "TRY_AGAIN", "WooCommerce_wasabiDebug"})
    public static enum Click {
        /*public static final*/ SUBMIT /* = new SUBMIT(null) */,
        /*public static final*/ DISMISS /* = new DISMISS(null) */,
        /*public static final*/ CONTINUE_WITH_WORDPRESS_COM /* = new CONTINUE_WITH_WORDPRESS_COM(null) */,
        /*public static final*/ LOGIN_WITH_SITE_ADDRESS /* = new LOGIN_WITH_SITE_ADDRESS(null) */,
        /*public static final*/ LOGIN_WITH_GOOGLE /* = new LOGIN_WITH_GOOGLE(null) */,
        /*public static final*/ FORGOTTEN_PASSWORD /* = new FORGOTTEN_PASSWORD(null) */,
        /*public static final*/ OPEN_EMAIL_CLIENT /* = new OPEN_EMAIL_CLIENT(null) */,
        /*public static final*/ SHOW_HELP /* = new SHOW_HELP(null) */,
        /*public static final*/ SEND_CODE_WITH_TEXT /* = new SEND_CODE_WITH_TEXT(null) */,
        /*public static final*/ SUBMIT_2FA_CODE /* = new SUBMIT_2FA_CODE(null) */,
        /*public static final*/ REQUEST_MAGIC_LINK /* = new REQUEST_MAGIC_LINK(null) */,
        /*public static final*/ LOGIN_WITH_PASSWORD /* = new LOGIN_WITH_PASSWORD(null) */,
        /*public static final*/ HELP_FINDING_SITE_ADDRESS /* = new HELP_FINDING_SITE_ADDRESS(null) */,
        /*public static final*/ SELECT_EMAIL_FIELD /* = new SELECT_EMAIL_FIELD(null) */,
        /*public static final*/ PICK_EMAIL_FROM_HINT /* = new PICK_EMAIL_FROM_HINT(null) */,
        /*public static final*/ LOGIN_WITH_SITE_CREDS /* = new LOGIN_WITH_SITE_CREDS(null) */,
        /*public static final*/ VIEW_CONNECTED_STORES /* = new VIEW_CONNECTED_STORES(null) */,
        /*public static final*/ TRY_ANOTHER_ACCOUNT /* = new TRY_ANOTHER_ACCOUNT(null) */,
        /*public static final*/ TRY_ANOTHER_STORE /* = new TRY_ANOTHER_STORE(null) */,
        /*public static final*/ HELP_FINDING_CONNECTED_EMAIL /* = new HELP_FINDING_CONNECTED_EMAIL(null) */,
        /*public static final*/ REFRESH_APP /* = new REFRESH_APP(null) */,
        /*public static final*/ HELP_TROUBLESHOOTING_TIPS /* = new HELP_TROUBLESHOOTING_TIPS(null) */,
        /*public static final*/ TRY_AGAIN /* = new TRY_AGAIN(null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        
        Click(java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/login/UnifiedLoginTracker$Companion;", "", "()V", "CLICK", "", "FAILURE", "FLOW", "SOURCE", "STEP", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}