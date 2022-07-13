package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Suppress(names = {"SameParameterValue"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00e0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00bd\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u00bd\u0001B\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0016\u00100\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b04H\u0016J\u0012\u00105\u001a\u00020-2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\n\u00108\u001a\u0004\u0018\u000107H\u0002J\u0012\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020/H\u0002J\b\u0010<\u001a\u00020\u0019H\u0016J\n\u0010=\u001a\u0004\u0018\u00010>H\u0002J\"\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u0002072\b\u0010A\u001a\u0004\u0018\u0001072\u0006\u0010B\u001a\u00020/H\u0016J\u0012\u0010C\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J:\u0010E\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\b\u0010F\u001a\u0004\u0018\u0001072\b\u0010G\u001a\u0004\u0018\u0001072\b\u0010H\u001a\u0004\u0018\u0001072\b\u0010I\u001a\u0004\u0018\u000107H\u0016J$\u0010J\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\u0006\u0010K\u001a\u00020/2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0012\u0010N\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u000107H\u0016J\u001c\u0010O\u001a\u00020-2\b\u0010P\u001a\u0004\u0018\u0001072\b\u0010Q\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010R\u001a\u00020-2\u0006\u0010S\u001a\u00020TH\u0016J\u001c\u0010U\u001a\u00020-2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u00020/H\u0002J\u0012\u0010[\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010\\\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010]\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u001c\u0010^\u001a\u00020-2\b\u0010_\u001a\u0004\u0018\u0001072\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J<\u0010b\u001a\u00020-2\u0006\u0010@\u001a\u0002072\b\u0010Q\u001a\u0004\u0018\u0001072\u0006\u0010_\u001a\u0002072\u0006\u0010c\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u0001072\u0006\u0010e\u001a\u000203H\u0016J\u0012\u0010f\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010g\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J<\u0010h\u001a\u00020-2\u0006\u0010@\u001a\u0002072\b\u0010Q\u001a\u0004\u0018\u0001072\u0006\u0010_\u001a\u0002072\u0006\u0010c\u001a\u0002072\b\u0010d\u001a\u0004\u0018\u0001072\u0006\u0010i\u001a\u00020/H\u0016J\u0012\u0010j\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010k\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010l\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010m\u001a\u00020-2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0012\u0010n\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J$\u0010o\u001a\u00020-2\b\u00106\u001a\u0004\u0018\u0001072\b\u0010_\u001a\u0004\u0018\u0001072\u0006\u0010p\u001a\u00020/H\u0016J\u001c\u0010q\u001a\u00020-2\b\u0010_\u001a\u0004\u0018\u0001072\b\u0010c\u001a\u0004\u0018\u000107H\u0002J\u0016\u0010r\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0016J\u001e\u0010s\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010t\u001a\u00020/H\u0016J\u0016\u0010u\u001a\u00020-2\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0016J\b\u0010v\u001a\u00020-H\u0016J\u0012\u0010w\u001a\u00020-2\b\u0010P\u001a\u0004\u0018\u000107H\u0016J.\u0010x\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\b\u0010G\u001a\u0004\u0018\u0001072\b\u0010I\u001a\u0004\u0018\u0001072\u0006\u0010y\u001a\u00020/H\u0016J\b\u0010z\u001a\u00020-H\u0016J\u001c\u0010{\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\b\u0010c\u001a\u0004\u0018\u000107H\u0016J;\u0010|\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\b\u0010}\u001a\u0004\u0018\u0001072\b\u0010~\u001a\u0004\u0018\u0001072\b\u0010\u007f\u001a\u0004\u0018\u0001072\t\u0010\u0080\u0001\u001a\u0004\u0018\u000107H\u0016J1\u0010\u0081\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\b\u0010c\u001a\u0004\u0018\u0001072\b\u0010G\u001a\u0004\u0018\u0001072\b\u0010I\u001a\u0004\u0018\u000107H\u0016J\t\u0010\u0082\u0001\u001a\u00020-H\u0016J\u0015\u0010\u0083\u0001\u001a\u00020-2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0014J\t\u0010\u0086\u0001\u001a\u00020-H\u0016J\u0013\u0010\u0087\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\t\u0010\u0088\u0001\u001a\u00020-H\u0016J\u0014\u0010\u0089\u0001\u001a\u00020-2\t\u0010\u008a\u0001\u001a\u0004\u0018\u000107H\u0016J2\u0010\u008b\u0001\u001a\u00020-2\t\u0010\u008c\u0001\u001a\u0004\u0018\u0001072\b\u0010D\u001a\u0004\u0018\u0001072\b\u0010H\u001a\u0004\u0018\u0001072\b\u0010_\u001a\u0004\u0018\u000107H\u0016J\u0013\u0010\u008d\u0001\u001a\u00020/2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\t\u0010\u0090\u0001\u001a\u00020-H\u0016J\t\u0010\u0091\u0001\u001a\u00020-H\u0014J\u0013\u0010\u0092\u0001\u001a\u00020-2\b\u0010\u0093\u0001\u001a\u00030\u0085\u0001H\u0014J\t\u0010\u0094\u0001\u001a\u00020-H\u0016J\t\u0010\u0095\u0001\u001a\u00020-H\u0016J\u0012\u0010\u0096\u0001\u001a\u00020-2\u0007\u0010\u0097\u0001\u001a\u00020/H\u0016J1\u0010\u0098\u0001\u001a\u00020-2\b\u0010_\u001a\u0004\u0018\u0001072\b\u0010c\u001a\u0004\u0018\u0001072\u0006\u0010F\u001a\u0002072\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0016J\u0013\u0010\u009b\u0001\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u000107H\u0016J$\u0010\u009c\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\u0006\u0010K\u001a\u00020/2\u0007\u0010\u009d\u0001\u001a\u00020/H\u0002J\t\u0010\u009e\u0001\u001a\u00020-H\u0016J\t\u0010\u009f\u0001\u001a\u00020-H\u0016J\t\u0010\u00a0\u0001\u001a\u00020-H\u0016J\u0012\u0010\u00a1\u0001\u001a\u00020-2\u0007\u0010\u00a2\u0001\u001a\u000207H\u0002J-\u0010\u00a3\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\u0006\u0010K\u001a\u00020/2\u0007\u0010\u00a4\u0001\u001a\u00020/2\u0007\u0010\u00a5\u0001\u001a\u00020/H\u0002J\u001c\u0010\u00a6\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\u0007\u0010\u00a4\u0001\u001a\u00020/H\u0016J\t\u0010\u00a7\u0001\u001a\u00020-H\u0002J\t\u0010\u00a8\u0001\u001a\u00020-H\u0002J\u0013\u0010\u00a9\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J;\u0010\u00aa\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\b\u0010F\u001a\u0004\u0018\u0001072\b\u0010G\u001a\u0004\u0018\u0001072\b\u0010H\u001a\u0004\u0018\u0001072\b\u0010I\u001a\u0004\u0018\u000107H\u0016J\t\u0010\u00ab\u0001\u001a\u00020-H\u0016J3\u0010\u00ac\u0001\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u0001072\b\u0010Q\u001a\u0004\u0018\u0001072\t\u0010\u00ad\u0001\u001a\u0004\u0018\u0001072\t\u0010\u00ae\u0001\u001a\u0004\u0018\u000107H\u0016J\t\u0010\u00af\u0001\u001a\u00020-H\u0016J%\u0010\u00b0\u0001\u001a\u00020-2\b\u0010\u00b1\u0001\u001a\u00030\u00b2\u00012\u0007\u0010\u00b3\u0001\u001a\u00020/2\u0007\u0010\u00b4\u0001\u001a\u000207H\u0002J\t\u0010\u00b5\u0001\u001a\u00020-H\u0002J\t\u0010\u00b6\u0001\u001a\u00020-H\u0016J\t\u0010\u00b7\u0001\u001a\u00020-H\u0016J\u001b\u0010\u00b8\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u0001072\u0006\u0010K\u001a\u00020/H\u0016J\u0013\u0010\u00b9\u0001\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000107H\u0016J\u0013\u0010\u00ba\u0001\u001a\u00020-2\b\u0010\u00bb\u0001\u001a\u00030\u00bc\u0001H\u0002R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006\u00be\u0001"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/wordpress/android/login/LoginListener;", "Lorg/wordpress/android/login/GoogleFragment$GoogleListener;", "Lcom/woocommerce/android/ui/login/LoginPrologueFragment$PrologueFinishedListener;", "Ldagger/android/HasAndroidInjector;", "Lcom/woocommerce/android/ui/login/LoginNoJetpackListener;", "Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment$Listener;", "()V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector$WooCommerce_wasabiDebug", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector$WooCommerce_wasabiDebug", "(Ldagger/android/DispatchingAndroidInjector;)V", "binding", "Lcom/woocommerce/android/databinding/ActivityLoginBinding;", "loginAnalyticsListener", "Lorg/wordpress/android/login/LoginAnalyticsListener;", "getLoginAnalyticsListener$WooCommerce_wasabiDebug", "()Lorg/wordpress/android/login/LoginAnalyticsListener;", "setLoginAnalyticsListener$WooCommerce_wasabiDebug", "(Lorg/wordpress/android/login/LoginAnalyticsListener;)V", "loginMode", "Lorg/wordpress/android/login/LoginMode;", "unifiedLoginTracker", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "getUnifiedLoginTracker$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "setUnifiedLoginTracker$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;)V", "urlUtils", "Lcom/woocommerce/android/util/UrlUtils;", "getUrlUtils$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/util/UrlUtils;", "setUrlUtils$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/util/UrlUtils;)V", "zendeskHelper", "Lcom/woocommerce/android/support/ZendeskHelper;", "getZendeskHelper$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/support/ZendeskHelper;", "setZendeskHelper$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/support/ZendeskHelper;)V", "addGoogleLoginFragment", "", "isSignupFromLoginEnabled", "", "alreadyLoggedInWpcom", "oldSitesIds", "Ljava/util/ArrayList;", "", "Ldagger/android/AndroidInjector;", "forgotPassword", "url", "", "getAuthTokenFromIntent", "getLoginEmailFragment", "Lorg/wordpress/android/login/LoginEmailFragment;", "siteCredsLayout", "getLoginMode", "getLoginViaSiteAddressFragment", "Lorg/wordpress/android/login/LoginSiteAddressFragment;", "gotConnectedSiteInfo", "siteAddress", "redirectUrl", "hasJetpack", "gotUnregisteredEmail", "email", "gotUnregisteredSocialAccount", "displayName", "idToken", "photoUrl", "service", "gotWpcomEmail", "verifyEmail", "authOptions", "Lorg/wordpress/android/login/AuthOptions;", "gotWpcomSiteInfo", "gotXmlRpcEndpoint", "inputSiteAddress", "endpointAddress", "handleSiteAddressError", "siteInfo", "Lorg/wordpress/android/fluxc/store/SiteStore$ConnectSiteInfoPayload;", "handleSslCertificateError", "memorizingTrustManager", "Lorg/wordpress/android/fluxc/network/MemorizingTrustManager;", "callback", "Lorg/wordpress/android/login/LoginListener$SelfSignedSSLCallback;", "hasMagicLinkLoginIntent", "help2FaScreen", "helpEmailPasswordScreen", "helpEmailScreen", "helpFindingSiteAddress", "username", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "helpHandleDiscoveryError", "password", "userAvatarUrl", "errorMessage", "helpMagicLinkRequest", "helpMagicLinkSent", "helpNoJetpackScreen", "checkJetpackAvailability", "helpSignupConfirmationScreen", "helpSignupEmailScreen", "helpSignupMagicLinkScreen", "helpSiteAddress", "helpSocialEmailScreen", "helpUsernamePassword", "isWpcom", "jumpToUsernamePassword", "loggedInViaPassword", "loggedInViaSocialAccount", "doLoginUpdate", "loggedInViaUsernamePassword", "loginViaSiteAddress", "loginViaSiteCredentials", "loginViaSocialAccount", "isPasswordRequired", "loginViaWpcomUsernameInstead", "needs2fa", "needs2faSocial", "userId", "nonceAuthenticator", "nonceBackup", "nonceSms", "needs2faSocialConnect", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEmailNeedMoreHelpClicked", "onGoogleEmailSelected", "onGoogleLoginFinished", "onGoogleSignupError", "msg", "onGoogleSignupFinished", "name", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrimaryButtonClicked", "onResume", "onSaveInstanceState", "outState", "onSecondaryButtonClicked", "onTermsOfServiceClicked", "openEmailClient", "isLogin", "saveCredentialsInSmartLock", "profilePicture", "Landroid/net/Uri;", "showEmailLoginScreen", "showEmailPasswordScreen", "allowMagicLink", "showHelpFindingConnectedEmail", "showJetpackInstructions", "showJetpackTroubleshootingTips", "showMagicLinkInterceptFragment", "authToken", "showMagicLinkRequestScreen", "allowPassword", "forceRequestAtStart", "showMagicLinkSentScreen", "showMainActivityAndFinish", "showPrologueFragment", "showSignupMagicLink", "showSignupSocial", "showSignupToLoginMessage", "showUsernamePasswordScreen", "inputUsername", "inputPassword", "showWhatIsJetpackDialog", "slideInFragment", "fragment", "Landroidx/fragment/app/Fragment;", "shouldAddToBackStack", "tag", "startLoginViaWPCom", "startOver", "startPostLoginServices", "useMagicLinkInstead", "usePasswordInstead", "viewHelpAndSupport", "origin", "Lcom/woocommerce/android/support/HelpActivity$Origin;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity implements org.wordpress.android.login.LoginListener, org.wordpress.android.login.GoogleFragment.GoogleListener, com.woocommerce.android.ui.login.LoginPrologueFragment.PrologueFinishedListener, dagger.android.HasAndroidInjector, com.woocommerce.android.ui.login.LoginNoJetpackListener, com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment.Listener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.login.LoginActivity.Companion Companion = null;
    private static final java.lang.String FORGOT_PASSWORD_URL_SUFFIX = "wp-login.php?action=lostpassword";
    private static final java.lang.String MAGIC_LOGIN = "magic-login";
    private static final java.lang.String TOKEN_PARAMETER = "token";
    private static final java.lang.String KEY_UNIFIED_TRACKER_SOURCE = "KEY_UNIFIED_TRACKER_SOURCE";
    private static final java.lang.String KEY_UNIFIED_TRACKER_FLOW = "KEY_UNIFIED_TRACKER_FLOW";
    @javax.inject.Inject
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> androidInjector;
    @javax.inject.Inject
    public org.wordpress.android.login.LoginAnalyticsListener loginAnalyticsListener;
    @javax.inject.Inject
    public com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker;
    @javax.inject.Inject
    public com.woocommerce.android.support.ZendeskHelper zendeskHelper;
    @javax.inject.Inject
    public com.woocommerce.android.util.UrlUtils urlUtils;
    private org.wordpress.android.login.LoginMode loginMode;
    private com.woocommerce.android.databinding.ActivityLoginBinding binding;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getAndroidInjector$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setAndroidInjector$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.login.LoginAnalyticsListener getLoginAnalyticsListener$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setLoginAnalyticsListener$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    org.wordpress.android.login.LoginAnalyticsListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.login.UnifiedLoginTracker getUnifiedLoginTracker$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setUnifiedLoginTracker$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.support.ZendeskHelper getZendeskHelper$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setZendeskHelper$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.support.ZendeskHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.UrlUtils getUrlUtils$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setUrlUtils$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.UrlUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    private final void showPrologueFragment() {
    }
    
    private final boolean hasMagicLinkLoginIntent() {
        return false;
    }
    
    private final java.lang.String getAuthTokenFromIntent() {
        return null;
    }
    
    private final void showMagicLinkInterceptFragment(java.lang.String authToken) {
    }
    
    private final void slideInFragment(androidx.fragment.app.Fragment fragment, boolean shouldAddToBackStack, java.lang.String tag) {
    }
    
    /**
     * The normal layout for the login library will include social login but
     * there is an alternative layout used specifically for logging in using the
     * site address flow. This layout includes an option to sign in with site
     * credentials.
     *
     * @param siteCredsLayout If true, use the layout that includes the option to log
     * in with site credentials.
     */
    private final org.wordpress.android.login.LoginEmailFragment getLoginEmailFragment(boolean siteCredsLayout) {
        return null;
    }
    
    private final org.wordpress.android.login.LoginSiteAddressFragment getLoginViaSiteAddressFragment() {
        return null;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.wordpress.android.login.LoginMode getLoginMode() {
        return null;
    }
    
    @java.lang.Override
    public void startOver() {
    }
    
    @java.lang.Override
    public void onPrimaryButtonClicked() {
    }
    
    @java.lang.Override
    public void onSecondaryButtonClicked() {
    }
    
    private final void showMainActivityAndFinish() {
    }
    
    private final void jumpToUsernamePassword(java.lang.String username, java.lang.String password) {
    }
    
    private final void startLoginViaWPCom() {
    }
    
    @java.lang.Override
    public void gotWpcomEmail(@org.jetbrains.annotations.Nullable
    java.lang.String email, boolean verifyEmail, @org.jetbrains.annotations.Nullable
    org.wordpress.android.login.AuthOptions authOptions) {
    }
    
    private final void showEmailPasswordScreen(java.lang.String email, boolean verifyEmail, boolean allowMagicLink) {
    }
    
    private final void showMagicLinkRequestScreen(java.lang.String email, boolean verifyEmail, boolean allowPassword, boolean forceRequestAtStart) {
    }
    
    @java.lang.Override
    public void loginViaSiteAddress() {
    }
    
    @java.lang.Override
    public void loginViaSocialAccount(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String idToken, @org.jetbrains.annotations.Nullable
    java.lang.String service, boolean isPasswordRequired) {
    }
    
    @java.lang.Override
    public void loggedInViaSocialAccount(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> oldSitesIds, boolean doLoginUpdate) {
    }
    
    @java.lang.Override
    public void loginViaWpcomUsernameInstead() {
    }
    
    @java.lang.Override
    public void showMagicLinkSentScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email, boolean allowPassword) {
    }
    
    @java.lang.Override
    public void openEmailClient(boolean isLogin) {
    }
    
    @java.lang.Override
    public void usePasswordInstead(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void forgotPassword(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
    }
    
    @java.lang.Override
    public void needs2fa(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String password) {
    }
    
    @java.lang.Override
    public void needs2faSocial(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.String nonceAuthenticator, @org.jetbrains.annotations.Nullable
    java.lang.String nonceBackup, @org.jetbrains.annotations.Nullable
    java.lang.String nonceSms) {
    }
    
    @java.lang.Override
    public void needs2faSocialConnect(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String idToken, @org.jetbrains.annotations.Nullable
    java.lang.String service) {
    }
    
    @java.lang.Override
    public void loggedInViaPassword(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> oldSitesIds) {
    }
    
    @java.lang.Override
    public void alreadyLoggedInWpcom(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> oldSitesIds) {
    }
    
    @java.lang.Override
    public void gotWpcomSiteInfo(@org.jetbrains.annotations.Nullable
    java.lang.String siteAddress) {
    }
    
    @java.lang.Override
    public void gotConnectedSiteInfo(@org.jetbrains.annotations.NotNull
    java.lang.String siteAddress, @org.jetbrains.annotations.Nullable
    java.lang.String redirectUrl, boolean hasJetpack) {
    }
    
    /**
     * Method called when Login with Site credentials link is clicked in the [LoginEmailFragment]
     * This method is called instead of [LoginListener.gotXmlRpcEndpoint] since calling that method overrides
     * the already saved [inputSiteAddress] without the protocol, with the same site address but with
     * the protocol. This may cause issues when attempting to match the url to the authenticated account later
     * in the login process.
     */
    @java.lang.Override
    public void loginViaSiteCredentials(@org.jetbrains.annotations.Nullable
    java.lang.String inputSiteAddress) {
    }
    
    @java.lang.Override
    public void gotXmlRpcEndpoint(@org.jetbrains.annotations.Nullable
    java.lang.String inputSiteAddress, @org.jetbrains.annotations.Nullable
    java.lang.String endpointAddress) {
    }
    
    @java.lang.Override
    public void handleSslCertificateError(@org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.network.MemorizingTrustManager memorizingTrustManager, @org.jetbrains.annotations.Nullable
    org.wordpress.android.login.LoginListener.SelfSignedSSLCallback callback) {
    }
    
    private final void viewHelpAndSupport(com.woocommerce.android.support.HelpActivity.Origin origin) {
    }
    
    @java.lang.Override
    public void helpSiteAddress(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
    }
    
    @java.lang.Override
    public void helpFindingSiteAddress(@org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.store.SiteStore siteStore) {
    }
    
    @java.lang.Override
    public void loggedInViaUsernamePassword(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> oldSitesIds) {
    }
    
    @java.lang.Override
    public void helpEmailScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void helpSocialEmailScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void addGoogleLoginFragment(boolean isSignupFromLoginEnabled) {
    }
    
    @java.lang.Override
    public void helpMagicLinkRequest(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void helpMagicLinkSent(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void helpEmailPasswordScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void help2FaScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void startPostLoginServices() {
    }
    
    @java.lang.Override
    public void helpUsernamePassword(@org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.Nullable
    java.lang.String username, boolean isWpcom) {
    }
    
    @java.lang.Override
    public void helpNoJetpackScreen(@org.jetbrains.annotations.NotNull
    java.lang.String siteAddress, @org.jetbrains.annotations.Nullable
    java.lang.String endpointAddress, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String userAvatarUrl, boolean checkJetpackAvailability) {
    }
    
    @java.lang.Override
    public void helpHandleDiscoveryError(@org.jetbrains.annotations.NotNull
    java.lang.String siteAddress, @org.jetbrains.annotations.Nullable
    java.lang.String endpointAddress, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String userAvatarUrl, int errorMessage) {
    }
    
    @java.lang.Override
    public void saveCredentialsInSmartLock(@org.jetbrains.annotations.Nullable
    java.lang.String username, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String displayName, @org.jetbrains.annotations.Nullable
    android.net.Uri profilePicture) {
    }
    
    @java.lang.Override
    public void helpSignupEmailScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void helpSignupMagicLinkScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void showSignupMagicLink(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void showSignupToLoginMessage() {
    }
    
    @java.lang.Override
    public void onTermsOfServiceClicked() {
    }
    
    @java.lang.Override
    public void onGoogleEmailSelected(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void onGoogleLoginFinished() {
    }
    
    @java.lang.Override
    public void onGoogleSignupFinished(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String username) {
    }
    
    @java.lang.Override
    public void onGoogleSignupError(@org.jetbrains.annotations.Nullable
    java.lang.String msg) {
    }
    
    @java.lang.Override
    public void showJetpackInstructions() {
    }
    
    @java.lang.Override
    public void showJetpackTroubleshootingTips() {
    }
    
    @java.lang.Override
    public void showWhatIsJetpackDialog() {
    }
    
    @java.lang.Override
    public void showHelpFindingConnectedEmail() {
    }
    
    @java.lang.Override
    public void onEmailNeedMoreHelpClicked() {
    }
    
    @java.lang.Override
    public void showEmailLoginScreen(@org.jetbrains.annotations.Nullable
    java.lang.String siteAddress) {
    }
    
    @java.lang.Override
    public void showUsernamePasswordScreen(@org.jetbrains.annotations.Nullable
    java.lang.String siteAddress, @org.jetbrains.annotations.Nullable
    java.lang.String endpointAddress, @org.jetbrains.annotations.Nullable
    java.lang.String inputUsername, @org.jetbrains.annotations.Nullable
    java.lang.String inputPassword) {
    }
    
    @java.lang.Override
    public void gotUnregisteredEmail(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void gotUnregisteredSocialAccount(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String displayName, @org.jetbrains.annotations.Nullable
    java.lang.String idToken, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String service) {
    }
    
    @java.lang.Override
    public void helpSignupConfirmationScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @java.lang.Override
    public void showSignupSocial(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String displayName, @org.jetbrains.annotations.Nullable
    java.lang.String idToken, @org.jetbrains.annotations.Nullable
    java.lang.String photoUrl, @org.jetbrains.annotations.Nullable
    java.lang.String service) {
    }
    
    @java.lang.Override
    public void useMagicLinkInstead(@org.jetbrains.annotations.Nullable
    java.lang.String email, boolean verifyEmail) {
    }
    
    /**
     * Allows for special handling of errors that come up during the login by address: check site address.
     */
    @java.lang.Override
    public void handleSiteAddressError(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.SiteStore.ConnectSiteInfoPayload siteInfo) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginActivity$Companion;", "", "()V", "FORGOT_PASSWORD_URL_SUFFIX", "", "KEY_UNIFIED_TRACKER_FLOW", "KEY_UNIFIED_TRACKER_SOURCE", "MAGIC_LOGIN", "TOKEN_PARAMETER", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}