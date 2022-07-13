package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Suppress(names = {"LargeClass"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u0000 \u00c1\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00c1\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010M\u001a\u00020NH\u0002J \u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u00020SH\u0002J\u000e\u0010T\u001a\u00020N2\u0006\u0010U\u001a\u00020\u001cJ\u0016\u0010V\u001a\u00020N2\u0006\u0010W\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020\u001cJ\n\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\n\u0010[\u001a\u0004\u0018\u00010\\H\u0002J\n\u0010]\u001a\u0004\u0018\u00010ZH\u0002J\f\u0010^\u001a\u00060_R\u00020`H\u0016J\u0006\u0010a\u001a\u00020NJ\b\u0010b\u001a\u00020\u001cH\u0002J\b\u0010c\u001a\u00020NH\u0016J\b\u0010d\u001a\u00020NH\u0016J\b\u0010e\u001a\u00020NH\u0016J\b\u0010f\u001a\u00020NH\u0002J\u0012\u0010g\u001a\u00020N2\b\u0010h\u001a\u0004\u0018\u00010iH\u0002J\b\u0010j\u001a\u00020\u001cH\u0016J\u0018\u0010k\u001a\u00020\u001c2\u0006\u0010l\u001a\u00020\u001c2\u0006\u0010m\u001a\u00020nH\u0002J\b\u0010o\u001a\u00020\u001cH\u0016J\u0010\u0010p\u001a\u00020\u001c2\u0006\u0010m\u001a\u00020nH\u0002J\b\u0010q\u001a\u00020NH\u0016J\"\u0010r\u001a\u00020N2\u0006\u0010s\u001a\u0002012\u0006\u0010t\u001a\u0002012\b\u0010u\u001a\u0004\u0018\u00010vH\u0016J\b\u0010w\u001a\u00020NH\u0016J\u0012\u0010x\u001a\u00020N2\b\u0010h\u001a\u0004\u0018\u00010iH\u0014J\u0010\u0010y\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010z\u001a\u00020NH\u0016J\u0010\u0010{\u001a\u00020N2\u0006\u0010|\u001a\u00020}H\u0016J\u0010\u0010~\u001a\u00020N2\u0006\u0010|\u001a\u00020}H\u0016J\u0013\u0010\u007f\u001a\u00020N2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010vH\u0014J\u0013\u0010\u0081\u0001\u001a\u00020\u001c2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016J\t\u0010\u0084\u0001\u001a\u00020NH\u0014J\t\u0010\u0085\u0001\u001a\u00020NH\u0014J\u0012\u0010\u0086\u0001\u001a\u00020N2\u0007\u0010\u0087\u0001\u001a\u00020iH\u0014J\t\u0010\u0088\u0001\u001a\u00020NH\u0002J\t\u0010\u0089\u0001\u001a\u00020NH\u0002J\u0011\u0010\u008a\u0001\u001a\u00020N2\u0006\u0010h\u001a\u00020iH\u0002J\u0013\u0010\u008b\u0001\u001a\u00020N2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002J\u0011\u0010\u008e\u0001\u001a\u00020N2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001J\u0015\u0010\u008f\u0001\u001a\u00020N2\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\t\u0010\u0091\u0001\u001a\u00020NH\u0002J\t\u0010\u0092\u0001\u001a\u00020NH\u0016J\u0013\u0010\u0093\u0001\u001a\u00020N2\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0016J\u0013\u0010\u0096\u0001\u001a\u00020N2\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0016J\t\u0010\u0097\u0001\u001a\u00020NH\u0016J\t\u0010\u0098\u0001\u001a\u00020NH\u0016J\t\u0010\u0099\u0001\u001a\u00020NH\u0016J\u0012\u0010\u009a\u0001\u001a\u00020N2\u0007\u0010\u009b\u0001\u001a\u000201H\u0002J\u0012\u0010\u009c\u0001\u001a\u00020N2\u0007\u0010\u009b\u0001\u001a\u000201H\u0016J$\u0010\u009d\u0001\u001a\u00020N2\u0007\u0010\u009e\u0001\u001a\u00020S2\u0007\u0010\u009f\u0001\u001a\u00020S2\u0007\u0010\u00a0\u0001\u001a\u00020\u001cH\u0016J%\u0010\u00a1\u0001\u001a\u00020N2\u0007\u0010\u009e\u0001\u001a\u00020S2\u0007\u0010\u009f\u0001\u001a\u00020S2\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001H\u0016J\u001b\u0010\u00a4\u0001\u001a\u00020N2\u0007\u0010\u00a5\u0001\u001a\u00020S2\u0007\u0010\u00a6\u0001\u001a\u00020\u001cH\u0016J%\u0010\u00a7\u0001\u001a\u00020N2\u0007\u0010\u00a5\u0001\u001a\u00020S2\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0007\u0010\u00a6\u0001\u001a\u00020\u001cH\u0016JE\u0010\u00a8\u0001\u001a\u00020N2\n\u0010\u00a9\u0001\u001a\u0005\u0018\u00010\u00aa\u00012\n\u0010\u00ab\u0001\u001a\u0005\u0018\u00010\u00aa\u00012\n\u0010\u00ac\u0001\u001a\u0005\u0018\u00010\u00aa\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u00aa\u00012\n\u0010\u00ae\u0001\u001a\u0005\u0018\u00010\u00aa\u0001H\u0016J\u001b\u0010\u00af\u0001\u001a\u00020N2\u0007\u0010\u00a5\u0001\u001a\u00020S2\u0007\u0010\u00b0\u0001\u001a\u00020SH\u0016J\u0014\u0010\u00b1\u0001\u001a\u00020N2\t\b\u0001\u0010\u00b2\u0001\u001a\u000201H\u0016J\'\u0010\u00b3\u0001\u001a\u00020N2\u0007\u0010\u00b4\u0001\u001a\u00020S2\u0007\u0010\u00a0\u0001\u001a\u00020\u001c2\n\u0010\u00b5\u0001\u001a\u0005\u0018\u00010\u00aa\u0001H\u0016J1\u0010\u00b6\u0001\u001a\u00020N2\u0007\u0010\u00b4\u0001\u001a\u00020S2\u0007\u0010\u00a0\u0001\u001a\u00020\u001c2\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\n\u0010\u00b5\u0001\u001a\u0005\u0018\u00010\u00aa\u0001H\u0016J\t\u0010\u00b7\u0001\u001a\u00020NH\u0002J\t\u0010\u00b8\u0001\u001a\u00020NH\u0016J\t\u0010\u00b9\u0001\u001a\u00020NH\u0002J\t\u0010\u00ba\u0001\u001a\u00020NH\u0016J\u0007\u0010\u00bb\u0001\u001a\u00020NJ\u0012\u0010\u00bc\u0001\u001a\u00020N2\u0007\u0010\u00bd\u0001\u001a\u00020\u001cH\u0016J\u0012\u0010\u00be\u0001\u001a\u00020N2\u0007\u0010\u00bf\u0001\u001a\u00020\u001cH\u0016J\t\u0010\u00c0\u0001\u001a\u00020NH\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001b\u00108\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b9\u0010\u0019R\u000e\u0010;\u001a\u00020<X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010G\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010H\u001a\u00020I8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010K\u00a8\u0006\u00c2\u0001"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivity;", "Lcom/woocommerce/android/ui/main/AppUpgradeActivity;", "Lcom/woocommerce/android/ui/main/MainContract$View;", "Lcom/woocommerce/android/ui/main/MainNavigationRouter;", "Lcom/woocommerce/android/ui/main/MainBottomNavigationView$MainNavigationListener;", "()V", "appBarOffsetListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "getAppBarOffsetListener", "()Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "appBarOffsetListener$delegate", "Lkotlin/Lazy;", "binding", "Lcom/woocommerce/android/databinding/ActivityMainBinding;", "crashLogging", "Lcom/automattic/android/tracks/crashlogging/CrashLogging;", "getCrashLogging", "()Lcom/automattic/android/tracks/crashlogging/CrashLogging;", "setCrashLogging", "(Lcom/automattic/android/tracks/crashlogging/CrashLogging;)V", "fragmentLifecycleObserver", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "hideSubtitleAnimator", "Landroid/animation/ValueAnimator;", "getHideSubtitleAnimator", "()Landroid/animation/ValueAnimator;", "hideSubtitleAnimator$delegate", "isBottomNavShowing", "", "isMainThemeApplied", "loginAnalyticsListener", "Lorg/wordpress/android/login/LoginAnalyticsListener;", "getLoginAnalyticsListener", "()Lorg/wordpress/android/login/LoginAnalyticsListener;", "setLoginAnalyticsListener", "(Lorg/wordpress/android/login/LoginAnalyticsListener;)V", "menu", "Landroid/view/Menu;", "navController", "Landroidx/navigation/NavController;", "presenter", "Lcom/woocommerce/android/ui/main/MainContract$Presenter;", "getPresenter", "()Lcom/woocommerce/android/ui/main/MainContract$Presenter;", "setPresenter", "(Lcom/woocommerce/android/ui/main/MainContract$Presenter;)V", "progressDialog", "Landroid/app/ProgressDialog;", "restoreToolbarHeight", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "getSelectedSite", "()Lcom/woocommerce/android/tools/SelectedSite;", "setSelectedSite", "(Lcom/woocommerce/android/tools/SelectedSite;)V", "showSubtitleAnimator", "getShowSubtitleAnimator", "showSubtitleAnimator$delegate", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "toolbarDisabledBehavior", "Lcom/woocommerce/android/widgets/DisabledAppBarLayoutBehavior;", "toolbarEnabledBehavior", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "unfilledOrderCount", "viewModel", "Lcom/woocommerce/android/ui/main/MainActivityViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/main/MainActivityViewModel;", "viewModel$delegate", "checkConnection", "", "createCollapsingToolbarMarginBottomAnimator", "from", "to", "duration", "", "enableToolbarExpansion", "enable", "expandToolbar", "expand", "animate", "getActiveChildFragment", "Landroidx/fragment/app/Fragment;", "getActiveTopLevelFragment", "Lcom/woocommerce/android/ui/base/TopLevelFragment;", "getHostChildFragment", "getTheme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "handleSitePickerResult", "hasMagicLinkLoginIntent", "hideBottomNav", "hideOrderBadge", "hideProgressDialog", "hideToolbar", "initFragment", "savedInstanceState", "Landroid/os/Bundle;", "isAtNavigationRoot", "isAtTopLevelNavigation", "isAtRoot", "destination", "Landroidx/navigation/NavDestination;", "isChildFragmentShowing", "isDialogDestination", "notifyTokenUpdated", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "onCreateOptionsMenu", "onDestroy", "onNavItemReselected", "navPos", "Lcom/woocommerce/android/ui/main/BottomNavigationPosition;", "onNavItemSelected", "onNewIntent", "intent", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onSaveInstanceState", "outState", "removeSubtitle", "restart", "restoreSavedInstanceState", "setFadingSubtitleOnCollapsingToolbar", "subtitle", "", "setSubtitle", "setTitle", "title", "setupObservers", "showAddProduct", "showAppUpdateFailedSnack", "actionListener", "Landroid/view/View$OnClickListener;", "showAppUpdateSuccessSnack", "showBottomNav", "showFeedbackSurvey", "showLoginScreen", "showMoreMenuBadge", "count", "showOrderBadge", "showOrderDetail", "orderId", "remoteNoteId", "launchedFromNotification", "showOrderDetailWithSharedTransition", "sharedView", "Landroid/view/View;", "showProductDetail", "remoteProductId", "enableTrash", "showProductDetailWithSharedTransition", "showProductFilters", "stockStatus", "", "productType", "productStatus", "productCategory", "productCategoryName", "showProductVariationDetail", "remoteVariationId", "showProgressDialog", "stringId", "showReviewDetail", "remoteReviewId", "tempStatus", "showReviewDetailWithSharedTransition", "showReviewList", "showSettingsScreen", "showToolbar", "showUserEligibilityErrorScreen", "startSitePicker", "updateOfflineStatusBar", "isConnected", "updateOrderBadge", "hideCountUntilComplete", "updateSelectedSite", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.woocommerce.android.ui.main.AppUpgradeActivity implements com.woocommerce.android.ui.main.MainContract.View, com.woocommerce.android.ui.main.MainNavigationRouter, com.woocommerce.android.ui.main.MainBottomNavigationView.MainNavigationListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.main.MainActivity.Companion Companion = null;
    private static final java.lang.String MAGIC_LOGIN = "magic-login";
    private static final java.lang.String KEY_BOTTOM_NAV_POSITION = "key-bottom-nav-position";
    private static final java.lang.String KEY_UNFILLED_ORDER_COUNT = "unfilled-order-count";
    private static final java.lang.String DIALOG_NAVIGATOR_NAME = "dialog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_OPENED_FROM_PUSH = "opened-from-push-notification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_REMOTE_NOTIFICATION = "remote-notification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_PUSH_ID = "local-push-id";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.main.MainContract.Presenter presenter;
    @javax.inject.Inject()
    public org.wordpress.android.login.LoginAnalyticsListener loginAnalyticsListener;
    @javax.inject.Inject()
    public com.woocommerce.android.tools.SelectedSite selectedSite;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject()
    public com.automattic.android.tracks.crashlogging.CrashLogging crashLogging;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isBottomNavShowing = true;
    private int unfilledOrderCount = 0;
    private boolean isMainThemeApplied = false;
    private int restoreToolbarHeight = 0;
    private android.view.Menu menu;
    private final com.google.android.material.appbar.AppBarLayout.Behavior toolbarEnabledBehavior = null;
    private final com.woocommerce.android.widgets.DisabledAppBarLayoutBehavior toolbarDisabledBehavior = null;
    private androidx.navigation.NavController navController;
    private com.woocommerce.android.databinding.ActivityMainBinding binding;
    private androidx.appcompat.widget.Toolbar toolbar;
    private final kotlin.Lazy appBarOffsetListener$delegate = null;
    private final kotlin.Lazy showSubtitleAnimator$delegate = null;
    private final kotlin.Lazy hideSubtitleAnimator$delegate = null;
    private android.app.ProgressDialog progressDialog;
    private final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleObserver = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.main.MainContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.main.MainContract.Presenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wordpress.android.login.LoginAnalyticsListener getLoginAnalyticsListener() {
        return null;
    }
    
    public final void setLoginAnalyticsListener(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.login.LoginAnalyticsListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.tools.SelectedSite getSelectedSite() {
        return null;
    }
    
    public final void setSelectedSite(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.automattic.android.tracks.crashlogging.CrashLogging getCrashLogging() {
        return null;
    }
    
    public final void setCrashLogging(@org.jetbrains.annotations.NotNull()
    com.automattic.android.tracks.crashlogging.CrashLogging p0) {
    }
    
    private final com.woocommerce.android.ui.main.MainActivityViewModel getViewModel() {
        return null;
    }
    
    private final com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener getAppBarOffsetListener() {
        return null;
    }
    
    private final android.animation.ValueAnimator getShowSubtitleAnimator() {
        return null;
    }
    
    private final android.animation.ValueAnimator getHideSubtitleAnimator() {
        return null;
    }
    
    /**
     * Manually set the theme here so the splash screen will be visible while this activity
     * is loading. Also setting it here ensures all fragments used in this activity will also
     * use this theme at runtime (in the case of switching the theme at runtime).
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.res.Resources.Theme getTheme() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void hideProgressDialog() {
    }
    
    @java.lang.Override()
    public void showProgressDialog(@androidx.annotation.StringRes()
    int stringId) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void restoreSavedInstanceState(android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * Returns true if the navigation controller is showing the root fragment (ie: a top level fragment is showing)
     */
    @java.lang.Override()
    public boolean isAtNavigationRoot() {
        return false;
    }
    
    /**
     * Return true if one of the nav component fragments is showing (the opposite of the above)
     */
    @java.lang.Override()
    public boolean isChildFragmentShowing() {
        return false;
    }
    
    /**
     * Returns the current top level fragment (ie: the one showing in the bottom nav)
     */
    private final com.woocommerce.android.ui.base.TopLevelFragment getActiveTopLevelFragment() {
        return null;
    }
    
    /**
     * Returns the fragment currently shown by the navigation component, or null if we're at the root
     */
    private final androidx.fragment.app.Fragment getActiveChildFragment() {
        return null;
    }
    
    /**
     * Get the actual primary navigation Fragment from the support manager
     */
    private final androidx.fragment.app.Fragment getHostChildFragment() {
        return null;
    }
    
    private final void showToolbar() {
    }
    
    private final void hideToolbar() {
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
    }
    
    public final void expandToolbar(boolean expand, boolean animate) {
    }
    
    public final void setSubtitle(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence subtitle) {
    }
    
    private final android.animation.ValueAnimator createCollapsingToolbarMarginBottomAnimator(int from, int to, long duration) {
        return null;
    }
    
    private final void removeSubtitle() {
    }
    
    private final void setFadingSubtitleOnCollapsingToolbar(java.lang.CharSequence subtitle) {
    }
    
    public final void enableToolbarExpansion(boolean enable) {
    }
    
    /**
     * Returns a Boolean value in order to set the behaviour from a root navigation type in terms of:
     * .menu items visibility
     * .top nav bar titles
     *
     * @param isAtRoot The value that tells if root fragment is in the current destination
     * @param destination The object for the next navigation destination
     */
    private final boolean isAtTopLevelNavigation(boolean isAtRoot, androidx.navigation.NavDestination destination) {
        return false;
    }
    
    private final boolean isDialogDestination(androidx.navigation.NavDestination destination) {
        return false;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void notifyTokenUpdated() {
    }
    
    @java.lang.Override()
    public void showLoginScreen() {
    }
    
    @java.lang.Override()
    public void showUserEligibilityErrorScreen() {
    }
    
    @java.lang.Override()
    public void showSettingsScreen() {
    }
    
    @java.lang.Override()
    public void updateSelectedSite() {
    }
    
    public final void startSitePicker() {
    }
    
    public final void handleSitePickerResult() {
    }
    
    /**
     * Called when the user switches sites - restarts the activity so all fragments and child fragments are reset
     */
    private final void restart() {
    }
    
    private final boolean hasMagicLinkLoginIntent() {
        return false;
    }
    
    @java.lang.Override()
    public void updateOrderBadge(boolean hideCountUntilComplete) {
    }
    
    @java.lang.Override()
    public void showOrderBadge(int count) {
    }
    
    @java.lang.Override()
    public void hideOrderBadge() {
    }
    
    private final void showMoreMenuBadge(int count) {
    }
    
    @java.lang.Override()
    public void onNavItemSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.main.BottomNavigationPosition navPos) {
    }
    
    @java.lang.Override()
    public void onNavItemReselected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.main.BottomNavigationPosition navPos) {
    }
    
    private final void initFragment(android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    public void showProductDetail(long remoteProductId, boolean enableTrash) {
    }
    
    @java.lang.Override()
    public void showProductDetailWithSharedTransition(long remoteProductId, @org.jetbrains.annotations.NotNull()
    android.view.View sharedView, boolean enableTrash) {
    }
    
    @java.lang.Override()
    public void showProductVariationDetail(long remoteProductId, long remoteVariationId) {
    }
    
    @java.lang.Override()
    public void showAddProduct() {
    }
    
    private final void showReviewList() {
    }
    
    @java.lang.Override()
    public void showReviewDetail(long remoteReviewId, boolean launchedFromNotification, @org.jetbrains.annotations.Nullable()
    java.lang.String tempStatus) {
    }
    
    @java.lang.Override()
    public void showReviewDetailWithSharedTransition(long remoteReviewId, boolean launchedFromNotification, @org.jetbrains.annotations.NotNull()
    android.view.View sharedView, @org.jetbrains.annotations.Nullable()
    java.lang.String tempStatus) {
    }
    
    @java.lang.Override()
    public void showProductFilters(@org.jetbrains.annotations.Nullable()
    java.lang.String stockStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String productType, @org.jetbrains.annotations.Nullable()
    java.lang.String productStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String productCategory, @org.jetbrains.annotations.Nullable()
    java.lang.String productCategoryName) {
    }
    
    @java.lang.Override()
    public void showOrderDetail(long orderId, long remoteNoteId, boolean launchedFromNotification) {
    }
    
    @java.lang.Override()
    public void showOrderDetailWithSharedTransition(long orderId, long remoteNoteId, @org.jetbrains.annotations.NotNull()
    android.view.View sharedView) {
    }
    
    @java.lang.Override()
    public void showFeedbackSurvey() {
    }
    
    @java.lang.Override()
    public void updateOfflineStatusBar(boolean isConnected) {
    }
    
    private final void checkConnection() {
    }
    
    @java.lang.Override()
    public void hideBottomNav() {
    }
    
    @java.lang.Override()
    public void showBottomNav() {
    }
    
    /**
     * The Flexible in app update is successful.
     * Display a success snack bar and ask users to manually restart the app
     */
    @java.lang.Override()
    public void showAppUpdateSuccessSnack(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
    }
    
    /**
     * The Flexible in app update was not successful.
     * Display a failure snack bar and ask users to retry
     */
    @java.lang.Override()
    public void showAppUpdateFailedSnack(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivity$Companion;", "", "()V", "DIALOG_NAVIGATOR_NAME", "", "FIELD_OPENED_FROM_PUSH", "FIELD_PUSH_ID", "FIELD_REMOTE_NOTIFICATION", "KEY_BOTTOM_NAV_POSITION", "KEY_UNFILLED_ORDER_COUNT", "MAGIC_LOGIN", "BackPressListener", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "", "onRequestAllowBackPress", "", "WooCommerce_vanillaDebug"})
        public static abstract interface BackPressListener {
            
            public abstract boolean onRequestAllowBackPress();
        }
    }
}