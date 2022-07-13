package dagger.hilt.android.internal.testing.root;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.android.volley.RequestQueue;
import com.automattic.android.tracks.crashlogging.CrashLogging;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import com.woocommerce.android.AppInitializer;
import com.woocommerce.android.AppInitializer_Factory;
import com.woocommerce.android.AppInitializer_MembersInjector;
import com.woocommerce.android.AppPrefs;
import com.woocommerce.android.AppPrefsWrapper;
import com.woocommerce.android.SiteObserver;
import com.woocommerce.android.WooCommerceDebug;
import com.woocommerce.android.WooCommerce_MembersInjector;
import com.woocommerce.android.analytics.AnalyticsTrackerWrapper;
import com.woocommerce.android.cardreader.CardReaderManager;
import com.woocommerce.android.cardreader.CardReaderStore;
import com.woocommerce.android.cardreader.internal.config.CardReaderConfigFactory;
import com.woocommerce.android.datastore.DataStoreModule;
import com.woocommerce.android.datastore.DataStoreModule_ProvideTrackerDataStoreFactory;
import com.woocommerce.android.di.ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector;
import com.woocommerce.android.di.AppConfigModule;
import com.woocommerce.android.di.AppConfigModule_ProvideAppSecretsFactory;
import com.woocommerce.android.di.AppConfigModule_ProvideDefaultLocaleFactory;
import com.woocommerce.android.di.AppConfigModule_ProvideUserAgentFactory;
import com.woocommerce.android.di.AppConfigModule_ProvidesAppPrefsFactory;
import com.woocommerce.android.di.ApplicationModule_Companion_ProvideAppCoroutineScopeFactory;
import com.woocommerce.android.di.ApplicationModule_Companion_ProvideBackgroundDispatcherFactory;
import com.woocommerce.android.di.CardReaderModule;
import com.woocommerce.android.di.CardReaderModule_ProvideCardReaderConfigFactoryFactory;
import com.woocommerce.android.di.CardReaderModule_ProvideCardReaderManagerFactory;
import com.woocommerce.android.di.CardReaderModule_ProvideInPersonPaymentsStoreFactory;
import com.woocommerce.android.di.CardReaderModule_ProvideLogWrapperFactory;
import com.woocommerce.android.di.DummyInterceptorModule;
import com.woocommerce.android.di.DummyInterceptorModule_ProvideNetworkInterceptorFactory;
import com.woocommerce.android.di.InterceptorModuleTest;
import com.woocommerce.android.di.InterceptorModuleTest_ProvideMockingInterceptorFactory;
import com.woocommerce.android.di.NetworkStatusModule;
import com.woocommerce.android.di.NetworkStatusModule_ProvideNetworkStatusFactory;
import com.woocommerce.android.di.NotificationModule;
import com.woocommerce.android.di.NotificationModule_ProvideWooNotificationBuilderFactory;
import com.woocommerce.android.di.SelectedSiteModule;
import com.woocommerce.android.di.SelectedSiteModule_ProvideSelectedSiteFactory;
import com.woocommerce.android.di.SupportModule;
import com.woocommerce.android.di.SupportModule_ProvideSupportHelperFactory;
import com.woocommerce.android.di.SupportModule_ProvideZendeskHelperFactory;
import com.woocommerce.android.di.ThreadModule;
import com.woocommerce.android.di.ThreadModule_ProvideDispatchersFactory;
import com.woocommerce.android.media.FileUtils;
import com.woocommerce.android.media.MediaFilesRepository;
import com.woocommerce.android.media.ProductImagesNotificationHandler;
import com.woocommerce.android.media.ProductImagesService;
import com.woocommerce.android.media.ProductImagesServiceWrapper;
import com.woocommerce.android.media.ProductImagesService_MembersInjector;
import com.woocommerce.android.media.ProductImagesUploadWorker;
import com.woocommerce.android.mediapicker.MediaPickerLoaderFactory;
import com.woocommerce.android.mediapicker.MediaPickerLogger;
import com.woocommerce.android.mediapicker.MediaPickerMimeTypeProvider;
import com.woocommerce.android.mediapicker.MediaPickerModule_Companion_ProvideSelectedSiteFactory;
import com.woocommerce.android.mediapicker.MediaPickerSetupFactory;
import com.woocommerce.android.model.GetLocations;
import com.woocommerce.android.model.OrderMapper;
import com.woocommerce.android.model.ShippingLabelAddressMapper;
import com.woocommerce.android.model.ShippingLabelMapper;
import com.woocommerce.android.network.ConnectionChangeReceiver;
import com.woocommerce.android.push.FCMMessageService;
import com.woocommerce.android.push.FCMMessageService_MembersInjector;
import com.woocommerce.android.push.NotificationAnalyticsTracker;
import com.woocommerce.android.push.NotificationMessageHandler;
import com.woocommerce.android.push.NotificationRepository;
import com.woocommerce.android.push.NotificationsProcessingService;
import com.woocommerce.android.push.NotificationsProcessingService_MembersInjector;
import com.woocommerce.android.push.RegisterDevice;
import com.woocommerce.android.push.UnseenReviewsCountHandler;
import com.woocommerce.android.push.WooNotificationBuilder;
import com.woocommerce.android.screenshots.ScreenshotTest;
import com.woocommerce.android.support.HelpActivity;
import com.woocommerce.android.support.HelpActivity_MembersInjector;
import com.woocommerce.android.support.SSRActivity;
import com.woocommerce.android.support.SSRActivityViewModel;
import com.woocommerce.android.support.SSRActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.support.SupportHelper;
import com.woocommerce.android.support.ZendeskHelper;
import com.woocommerce.android.tools.NetworkStatus;
import com.woocommerce.android.tools.ProductImageMap;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.tracker.DataStoreTrackerRepository;
import com.woocommerce.android.tracker.SendTelemetry;
import com.woocommerce.android.ui.analytics.AnalyticsFragment;
import com.woocommerce.android.ui.analytics.AnalyticsViewModel;
import com.woocommerce.android.ui.analytics.AnalyticsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRangeCalculator;
import com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRangeCardView;
import com.woocommerce.android.ui.aztec.AztecEditorFragment;
import com.woocommerce.android.ui.cardreader.CardReaderCountryConfigProvider;
import com.woocommerce.android.ui.cardreader.CardReaderTracker;
import com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoImpl;
import com.woocommerce.android.ui.cardreader.ClearCardReaderDataAction;
import com.woocommerce.android.ui.cardreader.InPersonPaymentsCanadaFeatureFlag;
import com.woocommerce.android.ui.cardreader.connect.CardReaderConnectDialogFragment;
import com.woocommerce.android.ui.cardreader.connect.CardReaderConnectDialogFragment_MembersInjector;
import com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel;
import com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.connect.CardReaderLocationRepository;
import com.woocommerce.android.ui.cardreader.detail.CardReaderDetailFragment;
import com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel;
import com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.hub.CardReaderHubFragment;
import com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel;
import com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsFragment;
import com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel;
import com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingFragment;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeDialogFragment;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.payment.CardReaderInteracRefundErrorMapper;
import com.woocommerce.android.ui.cardreader.payment.CardReaderInteracRefundableChecker;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCollectibilityChecker;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCurrencySupportedChecker;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentDialogFragment;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentDialogFragment_MembersInjector;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentErrorMapper;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewFragment;
import com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewFragment_MembersInjector;
import com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel;
import com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerDialogFragment;
import com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel;
import com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.cardreader.tutorial.CardReaderTutorialDialogFragment;
import com.woocommerce.android.ui.cardreader.tutorial.CardReaderTutorialDialogFragment_MembersInjector;
import com.woocommerce.android.ui.cardreader.update.CardReaderUpdateDialogFragment;
import com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel;
import com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.common.UserEligibilityErrorFragment;
import com.woocommerce.android.ui.common.UserEligibilityErrorFragment_MembersInjector;
import com.woocommerce.android.ui.common.UserEligibilityErrorViewModel;
import com.woocommerce.android.ui.common.UserEligibilityErrorViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.common.UserEligibilityFetcher;
import com.woocommerce.android.ui.common.texteditor.SimpleTextEditorFragment;
import com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel;
import com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewFragment;
import com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewFragment_MembersInjector;
import com.woocommerce.android.ui.coupons.CouponListFragment;
import com.woocommerce.android.ui.coupons.CouponListFragment_MembersInjector;
import com.woocommerce.android.ui.coupons.CouponListHandler;
import com.woocommerce.android.ui.coupons.CouponListViewModel;
import com.woocommerce.android.ui.coupons.CouponListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.coupons.CouponRepository;
import com.woocommerce.android.ui.coupons.details.CouponDetailsFragment;
import com.woocommerce.android.ui.coupons.details.CouponDetailsFragment_MembersInjector;
import com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel;
import com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.coupons.edit.CouponRestrictionsFragment;
import com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel;
import com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.coupons.edit.EditCouponFragment;
import com.woocommerce.android.ui.coupons.edit.EditCouponFragment_MembersInjector;
import com.woocommerce.android.ui.coupons.edit.EditCouponViewModel;
import com.woocommerce.android.ui.coupons.edit.EditCouponViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.coupons.edit.EmailRestrictionFragment;
import com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel;
import com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.inbox.InboxFragment;
import com.woocommerce.android.ui.inbox.InboxFragment_MembersInjector;
import com.woocommerce.android.ui.inbox.InboxViewModel;
import com.woocommerce.android.ui.inbox.InboxViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.inbox.domain.InboxRepository;
import com.woocommerce.android.ui.jetpack.JetpackBenefitsDialog;
import com.woocommerce.android.ui.jetpack.JetpackInstallProgressDialog;
import com.woocommerce.android.ui.jetpack.JetpackInstallProgressDialog_MembersInjector;
import com.woocommerce.android.ui.jetpack.JetpackInstallStartDialog;
import com.woocommerce.android.ui.jetpack.JetpackInstallStartDialog_MembersInjector;
import com.woocommerce.android.ui.jetpack.JetpackInstallViewModel;
import com.woocommerce.android.ui.jetpack.JetpackInstallViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.jetpack.PluginRepository;
import com.woocommerce.android.ui.login.LoginActivity;
import com.woocommerce.android.ui.login.LoginActivity_MembersInjector;
import com.woocommerce.android.ui.login.LoginAnalyticsModule;
import com.woocommerce.android.ui.login.LoginAnalyticsModule_ProvideAnalyticsListenerFactory;
import com.woocommerce.android.ui.login.LoginDiscoveryErrorFragment;
import com.woocommerce.android.ui.login.LoginDiscoveryErrorFragment_MembersInjector;
import com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment;
import com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment_MembersInjector;
import com.woocommerce.android.ui.login.LoginNoJetpackFragment;
import com.woocommerce.android.ui.login.LoginNoJetpackRepository;
import com.woocommerce.android.ui.login.LoginNoJetpackViewModel;
import com.woocommerce.android.ui.login.LoginNoJetpackViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.login.LoginNoWPcomAccountFoundFragment;
import com.woocommerce.android.ui.login.LoginNoWPcomAccountFoundFragment_MembersInjector;
import com.woocommerce.android.ui.login.LoginPrologueFragment;
import com.woocommerce.android.ui.login.LoginPrologueFragment_MembersInjector;
import com.woocommerce.android.ui.login.LoginSiteCheckErrorFragment;
import com.woocommerce.android.ui.login.LoginSiteCheckErrorFragment_MembersInjector;
import com.woocommerce.android.ui.login.MagicLinkInterceptActivity;
import com.woocommerce.android.ui.login.MagicLinkInterceptActivity_MembersInjector;
import com.woocommerce.android.ui.login.MagicLinkInterceptFragment;
import com.woocommerce.android.ui.login.MagicLinkInterceptRepository;
import com.woocommerce.android.ui.login.MagicLinkInterceptViewModel;
import com.woocommerce.android.ui.login.MagicLinkInterceptViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.login.UnifiedLoginTracker;
import com.woocommerce.android.ui.main.MainActivity;
import com.woocommerce.android.ui.main.MainActivityViewModel;
import com.woocommerce.android.ui.main.MainActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.main.MainActivity_MembersInjector;
import com.woocommerce.android.ui.main.MainContract;
import com.woocommerce.android.ui.main.MainModule_Companion_ProvideMainActivityFactory;
import com.woocommerce.android.ui.main.MainPresenter;
import com.woocommerce.android.ui.main.MainUIMessageResolver;
import com.woocommerce.android.ui.main.OrdersUITest;
import com.woocommerce.android.ui.main.ProductsUITest;
import com.woocommerce.android.ui.main.ReviewsUITest;
import com.woocommerce.android.ui.media.MediaFileUploadHandler;
import com.woocommerce.android.ui.media.MediaUploadErrorListFragment;
import com.woocommerce.android.ui.media.MediaUploadErrorListViewModel;
import com.woocommerce.android.ui.media.MediaUploadErrorListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.moremenu.MoreMenuFragment;
import com.woocommerce.android.ui.moremenu.MoreMenuFragment_MembersInjector;
import com.woocommerce.android.ui.moremenu.MoreMenuViewModel;
import com.woocommerce.android.ui.moremenu.MoreMenuViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.moremenu.domain.MoreMenuRepository;
import com.woocommerce.android.ui.mystore.MyStoreFragment;
import com.woocommerce.android.ui.mystore.MyStoreFragment_MembersInjector;
import com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter;
import com.woocommerce.android.ui.mystore.MyStoreViewModel;
import com.woocommerce.android.ui.mystore.MyStoreViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.mystore.data.StatsRepository;
import com.woocommerce.android.ui.mystore.domain.GetStats;
import com.woocommerce.android.ui.mystore.domain.GetTopPerformers;
import com.woocommerce.android.ui.orders.OrderNavigator;
import com.woocommerce.android.ui.orders.creation.CreateOrUpdateOrderDraft;
import com.woocommerce.android.ui.orders.creation.CreateOrderItem;
import com.woocommerce.android.ui.orders.creation.MapItemToProductUiModel;
import com.woocommerce.android.ui.orders.creation.OrderCreationCustomerAddFragment;
import com.woocommerce.android.ui.orders.creation.OrderCreationCustomerAddFragment_MembersInjector;
import com.woocommerce.android.ui.orders.creation.OrderCreationFormFragment;
import com.woocommerce.android.ui.orders.creation.OrderCreationFormFragment_MembersInjector;
import com.woocommerce.android.ui.orders.creation.OrderCreationRepository;
import com.woocommerce.android.ui.orders.creation.OrderCreationViewModel;
import com.woocommerce.android.ui.orders.creation.OrderCreationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeFragment;
import com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeFragment_MembersInjector;
import com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel;
import com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductDetailsFragment;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductDetailsFragment_MembersInjector;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionFragment;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionFragment_MembersInjector;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingFragment;
import com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingFragment_MembersInjector;
import com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel;
import com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionFragment;
import com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel;
import com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.details.OrderDetailFragment;
import com.woocommerce.android.ui.orders.details.OrderDetailFragment_MembersInjector;
import com.woocommerce.android.ui.orders.details.OrderDetailRepository;
import com.woocommerce.android.ui.orders.details.OrderDetailViewModel;
import com.woocommerce.android.ui.orders.details.OrderDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.details.PrintingInstructionsFragment;
import com.woocommerce.android.ui.orders.details.ShippingLabelOnboardingRepository;
import com.woocommerce.android.ui.orders.details.editing.BaseOrderEditingFragment_MembersInjector;
import com.woocommerce.android.ui.orders.details.editing.CustomerOrderNoteEditingFragment;
import com.woocommerce.android.ui.orders.details.editing.OrderEditingRepository;
import com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel;
import com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel;
import com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.details.editing.address.BaseAddressEditingFragment;
import com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesFragment;
import com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel;
import com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.filters.OrderFilterOptionsFragment;
import com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel;
import com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository;
import com.woocommerce.android.ui.orders.filters.domain.GetDateRangeFilterOptions;
import com.woocommerce.android.ui.orders.filters.domain.GetOrderStatusFilterOptions;
import com.woocommerce.android.ui.orders.filters.domain.GetSelectedOrderFiltersCount;
import com.woocommerce.android.ui.orders.filters.domain.GetTrackingForFilterSelection;
import com.woocommerce.android.ui.orders.filters.domain.GetWCOrderListDescriptorWithFilters;
import com.woocommerce.android.ui.orders.fulfill.OrderFulfillFragment;
import com.woocommerce.android.ui.orders.fulfill.OrderFulfillFragment_MembersInjector;
import com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel;
import com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.list.OrderListFragment;
import com.woocommerce.android.ui.orders.list.OrderListFragment_MembersInjector;
import com.woocommerce.android.ui.orders.list.OrderListRepository;
import com.woocommerce.android.ui.orders.list.OrderListViewModel;
import com.woocommerce.android.ui.orders.list.OrderListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.notes.AddOrderNoteFragment;
import com.woocommerce.android.ui.orders.notes.AddOrderNoteFragment_MembersInjector;
import com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel;
import com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormFragment;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelFragment;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundFragment;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository;
import com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemDialog;
import com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorFragment;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorFragment_MembersInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialog;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialog_MembersInjector;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragment;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragment_MembersInjector;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsRepository;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.simplepayments.TakePaymentFragment;
import com.woocommerce.android.ui.orders.simplepayments.TakePaymentFragment_MembersInjector;
import com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel;
import com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingFragment;
import com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingFragment_MembersInjector;
import com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel;
import com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListFragment;
import com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListFragment_MembersInjector;
import com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel;
import com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.orders.tracking.OrderShipmentProvidersRepository;
import com.woocommerce.android.ui.prefs.AboutConfigBuilder;
import com.woocommerce.android.ui.prefs.AppSettingsActivity;
import com.woocommerce.android.ui.prefs.AppSettingsActivity_MembersInjector;
import com.woocommerce.android.ui.prefs.AppSettingsContract;
import com.woocommerce.android.ui.prefs.AppSettingsPresenter;
import com.woocommerce.android.ui.prefs.MainSettingsContract;
import com.woocommerce.android.ui.prefs.MainSettingsFragment;
import com.woocommerce.android.ui.prefs.MainSettingsFragment_MembersInjector;
import com.woocommerce.android.ui.prefs.MainSettingsPresenter;
import com.woocommerce.android.ui.prefs.PrivacySettingsContract;
import com.woocommerce.android.ui.prefs.PrivacySettingsFragment;
import com.woocommerce.android.ui.prefs.PrivacySettingsFragment_MembersInjector;
import com.woocommerce.android.ui.prefs.PrivacySettingsPresenter;
import com.woocommerce.android.ui.prefs.UnifiedAboutScreenActivity;
import com.woocommerce.android.ui.prefs.UnifiedAboutScreenActivity_MembersInjector;
import com.woocommerce.android.ui.products.BaseProductEditorFragment_MembersInjector;
import com.woocommerce.android.ui.products.BaseProductFragment_MembersInjector;
import com.woocommerce.android.ui.products.GroupedProductListFragment;
import com.woocommerce.android.ui.products.GroupedProductListFragment_MembersInjector;
import com.woocommerce.android.ui.products.GroupedProductListRepository;
import com.woocommerce.android.ui.products.GroupedProductListViewModel;
import com.woocommerce.android.ui.products.GroupedProductListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.LinkedProductsFragment;
import com.woocommerce.android.ui.products.ParameterRepository;
import com.woocommerce.android.ui.products.ProductDetailBottomSheetFragment;
import com.woocommerce.android.ui.products.ProductDetailFragment;
import com.woocommerce.android.ui.products.ProductDetailFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductDetailRepository;
import com.woocommerce.android.ui.products.ProductDetailViewModel;
import com.woocommerce.android.ui.products.ProductDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductExternalLinkFragment;
import com.woocommerce.android.ui.products.ProductFilterListFragment;
import com.woocommerce.android.ui.products.ProductFilterListViewModel;
import com.woocommerce.android.ui.products.ProductFilterListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductFilterOptionListFragment;
import com.woocommerce.android.ui.products.ProductImageViewerFragment;
import com.woocommerce.android.ui.products.ProductImageViewerFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductImagesFragment;
import com.woocommerce.android.ui.products.ProductImagesFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductImagesViewModel;
import com.woocommerce.android.ui.products.ProductImagesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductInventoryFragment;
import com.woocommerce.android.ui.products.ProductInventoryViewModel;
import com.woocommerce.android.ui.products.ProductInventoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductListFragment;
import com.woocommerce.android.ui.products.ProductListFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductListRepository;
import com.woocommerce.android.ui.products.ProductListViewModel;
import com.woocommerce.android.ui.products.ProductListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductNavigator;
import com.woocommerce.android.ui.products.ProductPricingFragment;
import com.woocommerce.android.ui.products.ProductPricingFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductPricingViewModel;
import com.woocommerce.android.ui.products.ProductPricingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductSelectionListFragment;
import com.woocommerce.android.ui.products.ProductSelectionListFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductSelectionListViewModel;
import com.woocommerce.android.ui.products.ProductSelectionListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductShippingClassFragment;
import com.woocommerce.android.ui.products.ProductShippingClassRepository;
import com.woocommerce.android.ui.products.ProductShippingClassViewModel;
import com.woocommerce.android.ui.products.ProductShippingClassViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductShippingFragment;
import com.woocommerce.android.ui.products.ProductShippingViewModel;
import com.woocommerce.android.ui.products.ProductShippingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductSortingFragment;
import com.woocommerce.android.ui.products.ProductSortingFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductSortingViewModel;
import com.woocommerce.android.ui.products.ProductSortingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.ProductTypeBottomSheetBuilder;
import com.woocommerce.android.ui.products.ProductTypesBottomSheetFragment;
import com.woocommerce.android.ui.products.ProductTypesBottomSheetFragment_MembersInjector;
import com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel;
import com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.addons.AddonRepository;
import com.woocommerce.android.ui.products.addons.order.OrderedAddonFragment;
import com.woocommerce.android.ui.products.addons.order.OrderedAddonFragment_MembersInjector;
import com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel;
import com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.addons.product.ProductAddonsFragment;
import com.woocommerce.android.ui.products.addons.product.ProductAddonsFragment_MembersInjector;
import com.woocommerce.android.ui.products.categories.AddProductCategoryFragment;
import com.woocommerce.android.ui.products.categories.AddProductCategoryFragment_MembersInjector;
import com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel;
import com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.categories.ParentCategoryListFragment;
import com.woocommerce.android.ui.products.categories.ParentCategoryListFragment_MembersInjector;
import com.woocommerce.android.ui.products.categories.ProductCategoriesFragment;
import com.woocommerce.android.ui.products.categories.ProductCategoriesRepository;
import com.woocommerce.android.ui.products.categories.selector.ProductCategoryListHandler;
import com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorFragment;
import com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorFragment_MembersInjector;
import com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorRepository;
import com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel;
import com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.downloads.AddProductDownloadBottomSheetFragment;
import com.woocommerce.android.ui.products.downloads.AddProductDownloadBottomSheetFragment_MembersInjector;
import com.woocommerce.android.ui.products.downloads.AddProductDownloadViewModel;
import com.woocommerce.android.ui.products.downloads.AddProductDownloadViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsFragment;
import com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsFragment_MembersInjector;
import com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel;
import com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.downloads.ProductDownloadsFragment;
import com.woocommerce.android.ui.products.downloads.ProductDownloadsSettingsFragment;
import com.woocommerce.android.ui.products.reviews.ProductReviewsFragment;
import com.woocommerce.android.ui.products.reviews.ProductReviewsFragment_MembersInjector;
import com.woocommerce.android.ui.products.reviews.ProductReviewsRepository;
import com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel;
import com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.selector.ProductListHandler;
import com.woocommerce.android.ui.products.selector.ProductSelectorFragment;
import com.woocommerce.android.ui.products.selector.ProductSelectorFragment_MembersInjector;
import com.woocommerce.android.ui.products.selector.ProductSelectorRepository;
import com.woocommerce.android.ui.products.selector.ProductSelectorViewModel;
import com.woocommerce.android.ui.products.selector.ProductSelectorViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.settings.ProductSettingsFragment;
import com.woocommerce.android.ui.products.tags.ProductTagsFragment;
import com.woocommerce.android.ui.products.tags.ProductTagsRepository;
import com.woocommerce.android.ui.products.variations.VariationDetailFragment;
import com.woocommerce.android.ui.products.variations.VariationDetailFragment_MembersInjector;
import com.woocommerce.android.ui.products.variations.VariationDetailRepository;
import com.woocommerce.android.ui.products.variations.VariationDetailViewModel;
import com.woocommerce.android.ui.products.variations.VariationDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.variations.VariationListFragment;
import com.woocommerce.android.ui.products.variations.VariationListFragment_MembersInjector;
import com.woocommerce.android.ui.products.variations.VariationListViewModel;
import com.woocommerce.android.ui.products.variations.VariationListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.variations.VariationNavigator;
import com.woocommerce.android.ui.products.variations.VariationRepository;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerDialog;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerDialog_MembersInjector;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceFragment;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceFragment_MembersInjector;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.variations.attributes.AddAttributeFragment;
import com.woocommerce.android.ui.products.variations.attributes.AddAttributeTermsFragment;
import com.woocommerce.android.ui.products.variations.attributes.AttributeListFragment;
import com.woocommerce.android.ui.products.variations.attributes.AttributesAddedFragment;
import com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesFragment;
import com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel;
import com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.products.variations.selector.VariationListHandler;
import com.woocommerce.android.ui.products.variations.selector.VariationSelectorFragment;
import com.woocommerce.android.ui.products.variations.selector.VariationSelectorRepository;
import com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel;
import com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.refunds.IssueRefundFragment;
import com.woocommerce.android.ui.refunds.IssueRefundFragment_MembersInjector;
import com.woocommerce.android.ui.refunds.IssueRefundViewModel;
import com.woocommerce.android.ui.refunds.IssueRefundViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.refunds.PaymentChargeRepository;
import com.woocommerce.android.ui.refunds.RefundAmountDialog;
import com.woocommerce.android.ui.refunds.RefundAmountDialog_MembersInjector;
import com.woocommerce.android.ui.refunds.RefundByAmountFragment;
import com.woocommerce.android.ui.refunds.RefundByAmountFragment_MembersInjector;
import com.woocommerce.android.ui.refunds.RefundByItemsFragment;
import com.woocommerce.android.ui.refunds.RefundByItemsFragment_MembersInjector;
import com.woocommerce.android.ui.refunds.RefundConfirmationDialog;
import com.woocommerce.android.ui.refunds.RefundDetailFragment;
import com.woocommerce.android.ui.refunds.RefundDetailFragment_MembersInjector;
import com.woocommerce.android.ui.refunds.RefundDetailViewModel;
import com.woocommerce.android.ui.refunds.RefundDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.refunds.RefundItemsPickerDialog;
import com.woocommerce.android.ui.refunds.RefundSummaryFragment;
import com.woocommerce.android.ui.refunds.RefundSummaryFragment_MembersInjector;
import com.woocommerce.android.ui.reviews.ReviewDetailFragment;
import com.woocommerce.android.ui.reviews.ReviewDetailFragment_MembersInjector;
import com.woocommerce.android.ui.reviews.ReviewDetailRepository;
import com.woocommerce.android.ui.reviews.ReviewDetailViewModel;
import com.woocommerce.android.ui.reviews.ReviewDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.reviews.ReviewListFragment;
import com.woocommerce.android.ui.reviews.ReviewListFragment_MembersInjector;
import com.woocommerce.android.ui.reviews.ReviewListRepository;
import com.woocommerce.android.ui.reviews.ReviewListViewModel;
import com.woocommerce.android.ui.reviews.ReviewListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.reviews.ReviewModerationHandler;
import com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen;
import com.woocommerce.android.ui.reviews.domain.MarkReviewAsSeen;
import com.woocommerce.android.ui.searchfilter.SearchFilterFragment;
import com.woocommerce.android.ui.searchfilter.SearchFilterViewModel;
import com.woocommerce.android.ui.searchfilter.SearchFilterViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.shipping.InstallWcShippingFlowFragment;
import com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel;
import com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.sitepicker.SitePickerFragment;
import com.woocommerce.android.ui.sitepicker.SitePickerRepository;
import com.woocommerce.android.ui.sitepicker.SitePickerViewModel;
import com.woocommerce.android.ui.sitepicker.SitePickerViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.ui.whatsnew.FeatureAnnouncementDialogFragment;
import com.woocommerce.android.ui.whatsnew.FeatureAnnouncementRepository;
import com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel;
import com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel_HiltModules_KeyModule_ProvideFactory;
import com.woocommerce.android.util.Base64Decoder;
import com.woocommerce.android.util.BuildConfigWrapper;
import com.woocommerce.android.util.CapturePaymentResponseMapper;
import com.woocommerce.android.util.CouponUtils;
import com.woocommerce.android.util.CurrencyFormatter;
import com.woocommerce.android.util.DateUtils;
import com.woocommerce.android.util.FileDownloader;
import com.woocommerce.android.util.LocationUtils;
import com.woocommerce.android.util.NotificationsParser;
import com.woocommerce.android.util.PrintHtmlHelper;
import com.woocommerce.android.util.UrlUtils;
import com.woocommerce.android.util.WooLogWrapper;
import com.woocommerce.android.util.crashlogging.CrashLoggingModule_Companion_ProvideCrashLoggingFactory;
import com.woocommerce.android.util.crashlogging.CrashLoggingModule_Companion_ProvideEncryptedLoggingKeyFactory;
import com.woocommerce.android.util.crashlogging.CrashLoggingModule_Companion_ProvideFluxCCrashLoggerFactory;
import com.woocommerce.android.util.crashlogging.EnqueueSendingEncryptedLogs;
import com.woocommerce.android.util.crashlogging.UploadEncryptedLogs;
import com.woocommerce.android.util.crashlogging.UuidGenerator;
import com.woocommerce.android.util.crashlogging.WCCrashLoggingDataProvider;
import com.woocommerce.android.util.crashlogging.WooLogFileProvider;
import com.woocommerce.android.util.encryptedlogging.ObserveEncryptedLogsUploadResult;
import com.woocommerce.android.util.locale.ContextBasedLocaleProvider;
import com.woocommerce.android.viewmodel.ResourceProvider;
import com.woocommerce.android.widgets.WCMaterialOutlinedCurrencyEditTextView;
import com.woocommerce.android.widgets.WCMaterialOutlinedCurrencyEditTextView_MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import java.net.CookieManager;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.wordpress.android.fluxc.Dispatcher;
import org.wordpress.android.fluxc.di.WCDatabaseModule_Companion_ProvideAddonsDao$woocommerce_releaseFactory;
import org.wordpress.android.fluxc.di.WCDatabaseModule_Companion_ProvideCouponsDaoFactory;
import org.wordpress.android.fluxc.di.WCDatabaseModule_Companion_ProvideDatabaseFactory;
import org.wordpress.android.fluxc.di.WCDatabaseModule_Companion_ProvideInboxNotesDaoFactory;
import org.wordpress.android.fluxc.di.WCDatabaseModule_Companion_ProvideOrderNotesDaoFactory;
import org.wordpress.android.fluxc.di.WCDatabaseModule_Companion_ProvideOrdersDaoFactory;
import org.wordpress.android.fluxc.logging.FluxCCrashLogger;
import org.wordpress.android.fluxc.model.SiteModel;
import org.wordpress.android.fluxc.model.attribute.WCGlobalAttributeMapper;
import org.wordpress.android.fluxc.model.data.WCCountryMapper;
import org.wordpress.android.fluxc.model.encryptedlogging.LogEncrypter;
import org.wordpress.android.fluxc.model.gateways.GatewayMapper;
import org.wordpress.android.fluxc.model.leaderboards.WCProductLeaderboardsMapper;
import org.wordpress.android.fluxc.model.refunds.RefundMapper;
import org.wordpress.android.fluxc.model.settings.WCSettingsMapper;
import org.wordpress.android.fluxc.model.shippinglabels.WCShippingLabelMapper;
import org.wordpress.android.fluxc.model.taxes.WCTaxClassMapper;
import org.wordpress.android.fluxc.model.user.WCUserMapper;
import org.wordpress.android.fluxc.module.OkHttpClientModule_ProvideMediaOkHttpClientInstanceCustomSSLFactory;
import org.wordpress.android.fluxc.module.OkHttpClientModule_ProvideMediaOkHttpClientInstanceFactory;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule_ProvideCookieJarFactory;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule_ProvideCookieManagerFactory;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule_ProvideCoroutineContextFactory;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule_ProvideGsonFactory;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule_ProvideMemorizingTrustManagerFactory;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule_ProvideRequestQueueCustomSSLFactory;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule_ProvideRequestQueueFactory;
import org.wordpress.android.fluxc.network.HTTPAuthManager;
import org.wordpress.android.fluxc.network.MemorizingTrustManager;
import org.wordpress.android.fluxc.network.UserAgent;
import org.wordpress.android.fluxc.network.discovery.DiscoveryWPAPIRestClient;
import org.wordpress.android.fluxc.network.discovery.DiscoveryXMLRPCClient;
import org.wordpress.android.fluxc.network.discovery.SelfHostedEndpointFinder;
import org.wordpress.android.fluxc.network.rest.wpapi.NonceRestClient;
import org.wordpress.android.fluxc.network.rest.wpapi.WPAPIEncodedBodyRequestBuilder;
import org.wordpress.android.fluxc.network.rest.wpapi.WPAPIGsonRequestBuilder;
import org.wordpress.android.fluxc.network.rest.wpapi.plugin.PluginWPAPIRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.WPComGsonRequestBuilder;
import org.wordpress.android.fluxc.network.rest.wpcom.account.AccountRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.auth.AccessToken;
import org.wordpress.android.fluxc.network.rest.wpcom.auth.Authenticator;
import org.wordpress.android.fluxc.network.rest.wpcom.encryptedlog.EncryptedLogRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.jetpacktunnel.JetpackTunnelGsonRequestBuilder;
import org.wordpress.android.fluxc.network.rest.wpcom.media.MediaResponseUtils;
import org.wordpress.android.fluxc.network.rest.wpcom.media.MediaRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.media.wpv2.WPV2MediaRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.notifications.NotificationRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.plugin.PluginJetpackTunnelRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.plugin.PluginRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.site.PrivateAtomicCookie;
import org.wordpress.android.fluxc.network.rest.wpcom.site.SiteRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.WooCommerceRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.addons.AddOnsRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.addons.mappers.RemoteGlobalAddonGroupMapper;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.coupons.CouponRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.data.WCDataRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.gateways.GatewayRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.inbox.InboxRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.leaderboards.LeaderboardsRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.order.OrderDtoMapper;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.order.OrderRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.order.StripOrder;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.orderstats.OrderStatsRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.payments.inperson.InPersonPaymentsRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.product.ProductRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.product.attributes.ProductAttributeRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.refunds.RefundRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.shippinglabels.ShippingLabelRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.system.WooSystemRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.taxes.WCTaxRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.tracker.TrackerRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.tracker.TrackerStore;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.user.WCUserRestClient;
import org.wordpress.android.fluxc.network.rest.wpcom.whatsnew.WhatsNewRestClient;
import org.wordpress.android.fluxc.network.wporg.plugin.PluginWPOrgClient;
import org.wordpress.android.fluxc.network.xmlrpc.XMLRPCRequestBuilder;
import org.wordpress.android.fluxc.network.xmlrpc.media.MediaXMLRPCClient;
import org.wordpress.android.fluxc.network.xmlrpc.site.SiteXMLRPCClient;
import org.wordpress.android.fluxc.persistence.EncryptedLogSqlUtils;
import org.wordpress.android.fluxc.persistence.ListItemSqlUtils;
import org.wordpress.android.fluxc.persistence.ListSqlUtils;
import org.wordpress.android.fluxc.persistence.NotificationSqlUtils;
import org.wordpress.android.fluxc.persistence.PluginSqlUtilsWrapper;
import org.wordpress.android.fluxc.persistence.PostSqlUtils;
import org.wordpress.android.fluxc.persistence.SiteSqlUtils;
import org.wordpress.android.fluxc.persistence.WCAndroidDatabase;
import org.wordpress.android.fluxc.persistence.WhatsNewSqlUtils;
import org.wordpress.android.fluxc.persistence.dao.AddonsDao;
import org.wordpress.android.fluxc.persistence.dao.CouponsDao;
import org.wordpress.android.fluxc.persistence.dao.InboxNotesDao;
import org.wordpress.android.fluxc.persistence.dao.OrderNotesDao;
import org.wordpress.android.fluxc.persistence.dao.OrdersDao;
import org.wordpress.android.fluxc.persistence.mappers.FromDatabaseAddonGroupMapper;
import org.wordpress.android.fluxc.store.AccountStore;
import org.wordpress.android.fluxc.store.CouponStore;
import org.wordpress.android.fluxc.store.EncryptedLogStore;
import org.wordpress.android.fluxc.store.GetDeviceRegistrationStatus;
import org.wordpress.android.fluxc.store.InvalidateDeviceRegistration;
import org.wordpress.android.fluxc.store.ListStore;
import org.wordpress.android.fluxc.store.MediaStore;
import org.wordpress.android.fluxc.store.MediaStore_Factory;
import org.wordpress.android.fluxc.store.MediaStore_MembersInjector;
import org.wordpress.android.fluxc.store.NotificationStore;
import org.wordpress.android.fluxc.store.OrderUpdateStore;
import org.wordpress.android.fluxc.store.PluginCoroutineStore;
import org.wordpress.android.fluxc.store.PluginStore;
import org.wordpress.android.fluxc.store.SiteStore;
import org.wordpress.android.fluxc.store.UploadStore;
import org.wordpress.android.fluxc.store.WCAddonsStore;
import org.wordpress.android.fluxc.store.WCDataStore;
import org.wordpress.android.fluxc.store.WCGatewayStore;
import org.wordpress.android.fluxc.store.WCGlobalAttributeStore;
import org.wordpress.android.fluxc.store.WCInPersonPaymentsStore;
import org.wordpress.android.fluxc.store.WCInboxStore;
import org.wordpress.android.fluxc.store.WCLeaderboardsStore;
import org.wordpress.android.fluxc.store.WCOrderFetcher;
import org.wordpress.android.fluxc.store.WCOrderStore;
import org.wordpress.android.fluxc.store.WCProductStore;
import org.wordpress.android.fluxc.store.WCRefundStore;
import org.wordpress.android.fluxc.store.WCShippingLabelStore;
import org.wordpress.android.fluxc.store.WCStatsStore;
import org.wordpress.android.fluxc.store.WCTaxStore;
import org.wordpress.android.fluxc.store.WCUserStore;
import org.wordpress.android.fluxc.store.WhatsNewStore;
import org.wordpress.android.fluxc.store.WooCommerceStore;
import org.wordpress.android.fluxc.tools.CoroutineEngine;
import org.wordpress.android.fluxc.tools.FormattableContentMapper;
import org.wordpress.android.fluxc.utils.AppLogWrapper;
import org.wordpress.android.fluxc.utils.CurrentTimeProvider;
import org.wordpress.android.fluxc.utils.PreferenceUtils;
import org.wordpress.android.login.GoogleFragment_MembersInjector;
import org.wordpress.android.login.Login2FaFragment;
import org.wordpress.android.login.LoginAnalyticsListener;
import org.wordpress.android.login.LoginBaseFormFragment_MembersInjector;
import org.wordpress.android.login.LoginEmailFragment;
import org.wordpress.android.login.LoginEmailPasswordFragment;
import org.wordpress.android.login.LoginGoogleFragment;
import org.wordpress.android.login.LoginMagicLinkRequestFragment;
import org.wordpress.android.login.LoginMagicLinkRequestFragment_MembersInjector;
import org.wordpress.android.login.LoginMagicLinkSentFragment;
import org.wordpress.android.login.LoginMagicLinkSentFragment_MembersInjector;
import org.wordpress.android.login.LoginSiteAddressFragment;
import org.wordpress.android.login.LoginSiteAddressFragment_MembersInjector;
import org.wordpress.android.login.LoginSiteAddressHelpDialogFragment;
import org.wordpress.android.login.LoginSiteAddressHelpDialogFragment_MembersInjector;
import org.wordpress.android.login.LoginUsernamePasswordFragment;
import org.wordpress.android.login.LoginWpcomService;
import org.wordpress.android.login.LoginWpcomService_MembersInjector;
import org.wordpress.android.login.SignupConfirmationFragment;
import org.wordpress.android.login.SignupConfirmationFragment_MembersInjector;
import org.wordpress.android.login.SignupGoogleFragment;
import org.wordpress.android.login.SignupMagicLinkFragment;
import org.wordpress.android.login.SignupMagicLinkFragment_MembersInjector;
import org.wordpress.android.login.di.LoginFragmentModule_Login2FaFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginEmailFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginEmailPasswordFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginGoogleFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginMagicLinkRequestFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginMagicLinkSentFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginSiteAddressFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginSiteAddressHelpDialogFragment;
import org.wordpress.android.login.di.LoginFragmentModule_LoginUsernamePasswordFragment;
import org.wordpress.android.login.di.LoginFragmentModule_SignupConfirmationScreen;
import org.wordpress.android.login.di.LoginFragmentModule_SignupGoogleFragment;
import org.wordpress.android.login.di.LoginFragmentModule_SignupMagicLinkFragment;
import org.wordpress.android.login.di.LoginServiceModule_LoginWpcomService;
import org.wordpress.android.mediapicker.MediaManager;
import org.wordpress.android.mediapicker.MediaPickerTracker;
import org.wordpress.android.mediapicker.MediaPickerUtils;
import org.wordpress.android.mediapicker.Permissions;
import org.wordpress.android.mediapicker.source.device.DeviceMediaLoader;
import org.wordpress.android.mediapicker.source.device.DeviceMediaSource;
import org.wordpress.android.mediapicker.source.wordpress.MediaLibrarySource;
import org.wordpress.android.mediapicker.source.wordpress.util.DateTimeUtilsWrapper;
import org.wordpress.android.mediapicker.source.wordpress.util.LocaleManagerWrapper;
import org.wordpress.android.mediapicker.source.wordpress.util.NetworkUtilsWrapper;
import org.wordpress.android.mediapicker.ui.MediaPickerActivity;
import org.wordpress.android.mediapicker.ui.MediaPickerActivity_MembersInjector;
import org.wordpress.android.mediapicker.ui.MediaPickerFragment;
import org.wordpress.android.mediapicker.ui.MediaPickerFragment_MembersInjector;
import org.wordpress.android.mediapicker.ui.MediaViewerFragment;
import org.wordpress.android.mediapicker.util.MediaPickerPermissionUtils;
import org.wordpress.android.mediapicker.viewmodel.MediaPickerViewModel;
import org.wordpress.android.mediapicker.viewmodel.MediaPickerViewModel_HiltModules_KeyModule_ProvideFactory;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerDefault_HiltComponents_SingletonC extends Default_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final ReleaseNetworkModule releaseNetworkModule;

  private final InterceptorModuleTest interceptorModuleTest;

  private final DummyInterceptorModule dummyInterceptorModule;

  private final AppConfigModule appConfigModule;

  private final SelectedSiteModule selectedSiteModule;

  private final NetworkStatusModule networkStatusModule;

  private final SupportModule supportModule;

  private final NotificationModule notificationModule;

  private final ThreadModule threadModule;

  private final DataStoreModule dataStoreModule;

  private final LoginAnalyticsModule loginAnalyticsModule;

  private final CardReaderModule cardReaderModule;

  private final DaggerDefault_HiltComponents_SingletonC singletonC = this;

  private Provider<ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector.MagicLinkInterceptActivitySubcomponent.Factory> magicLinkInterceptActivitySubcomponentFactoryProvider;

  private Provider<LoginServiceModule_LoginWpcomService.LoginWpcomServiceSubcomponent.Factory> loginWpcomServiceSubcomponentFactoryProvider;

  private Provider<Dispatcher> dispatcherProvider;

  private Provider<CookieManager> provideCookieManagerProvider;

  private Provider<CookieJar> provideCookieJarProvider;

  private Provider<OkHttpClient> provideMediaOkHttpClientInstanceProvider;

  private Provider<RequestQueue> provideRequestQueueProvider;

  private Provider<AccessToken> accessTokenProvider;

  private Provider<AccountRestClient> accountRestClientProvider;

  private Provider<MemorizingTrustManager> provideMemorizingTrustManagerProvider;

  private Provider<OkHttpClient> provideMediaOkHttpClientInstanceCustomSSLProvider;

  private Provider<RequestQueue> provideRequestQueueCustomSSLProvider;

  private Provider<DiscoveryXMLRPCClient> discoveryXMLRPCClientProvider;

  private Provider<DiscoveryWPAPIRestClient> discoveryWPAPIRestClientProvider;

  private Provider<AccountStore> accountStoreProvider;

  private Provider<PostSqlUtils> postSqlUtilsProvider;

  private Provider<WPComGsonRequestBuilder> wPComGsonRequestBuilderProvider;

  private Provider<SiteRestClient> siteRestClientProvider;

  private Provider<XMLRPCRequestBuilder> xMLRPCRequestBuilderProvider;

  private Provider<SiteXMLRPCClient> siteXMLRPCClientProvider;

  private Provider<PrivateAtomicCookie> privateAtomicCookieProvider;

  private Provider<SiteSqlUtils> siteSqlUtilsProvider;

  private Provider<CoroutineContext> provideCoroutineContextProvider;

  private Provider<SiteStore> siteStoreProvider;

  private Provider<SelectedSite> provideSelectedSiteProvider;

  private Provider<AppPrefs> providesAppPrefsProvider;

  private Provider<NetworkStatus> provideNetworkStatusProvider;

  private Provider<BuildConfigWrapper> buildConfigWrapperProvider;

  private Provider<CrashLogging> provideCrashLoggingProvider;

  private Provider<JetpackTunnelGsonRequestBuilder> jetpackTunnelGsonRequestBuilderProvider;

  private Provider<WooSystemRestClient> wooSystemRestClientProvider;

  private Provider<WooCommerceRestClient> wooCommerceRestClientProvider;

  private Provider<WooCommerceStore> wooCommerceStoreProvider;

  private Provider<SupportHelper> provideSupportHelperProvider;

  private Provider<ZendeskHelper> provideZendeskHelperProvider;

  private Provider<WooNotificationBuilder> provideWooNotificationBuilderProvider;

  private Provider<WCUserRestClient> wCUserRestClientProvider;

  private Provider<WCUserStore> wCUserStoreProvider;

  private Provider<UserEligibilityFetcher> userEligibilityFetcherProvider;

  private Provider<EncryptedLogRestClient> encryptedLogRestClientProvider;

  private Provider<EncryptedLogSqlUtils> encryptedLogSqlUtilsProvider;

  private Provider<LogEncrypter> logEncrypterProvider;

  private Provider<EncryptedLogStore> encryptedLogStoreProvider;

  private Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider;

  private Provider<ObserveEncryptedLogsUploadResult> observeEncryptedLogsUploadResultProvider;

  private Provider<TrackerRestClient> trackerRestClientProvider;

  private Provider<TrackerStore> trackerStoreProvider;

  private Provider<CoroutineScope> provideAppCoroutineScopeProvider;

  private Provider<DataStore<Preferences>> provideTrackerDataStoreProvider;

  private Provider<NotificationRestClient> notificationRestClientProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<NotificationSqlUtils> notificationSqlUtilsProvider;

  private Provider<NotificationStore> notificationStoreProvider;

  private Provider<ConnectionChangeReceiver> connectionChangeReceiverProvider;

  private Provider<AppInitializer> appInitializerProvider;

  private Provider<UnifiedLoginTracker> unifiedLoginTrackerProvider;

  private Provider<ProductRestClient> productRestClientProvider;

  private Provider<WCAndroidDatabase> provideDatabaseProvider;

  private Provider<WCProductStore> wCProductStoreProvider;

  private Provider<ProductImageMap> productImageMapProvider;

  private Provider<OrderRestClient> orderRestClientProvider;

  private Provider<WCOrderFetcher> wCOrderFetcherProvider;

  private Provider<WCOrderStore> wCOrderStoreProvider;

  private Provider<InPersonPaymentsRestClient> inPersonPaymentsRestClientProvider;

  private Provider<WCInPersonPaymentsStore> wCInPersonPaymentsStoreProvider;

  private Provider<CardReaderManager> provideCardReaderManagerProvider;

  private Provider<NotificationAnalyticsTracker> notificationAnalyticsTrackerProvider;

  private Provider<NotificationMessageHandler> notificationMessageHandlerProvider;

  private Provider<CurrencyFormatter> currencyFormatterProvider;

  private Provider<MyStoreStatsUsageTracksEventEmitter> myStoreStatsUsageTracksEventEmitterProvider;

  private Provider<OrderNavigator> orderNavigatorProvider;

  private Provider<WhatsNewRestClient> whatsNewRestClientProvider;

  private Provider<WhatsNewSqlUtils> whatsNewSqlUtilsProvider;

  private Provider<WhatsNewStore> whatsNewStoreProvider;

  private Provider<ProductNavigator> productNavigatorProvider;

  private Provider<MediaPickerUtils> mediaPickerUtilsProvider;

  private Provider<VariationNavigator> variationNavigatorProvider;

  private Provider<Permissions> permissionsProvider;

  private Provider<MediaPickerPermissionUtils> mediaPickerPermissionUtilsProvider;

  private Provider<RefundRestClient> refundRestClientProvider;

  private Provider<WCRefundStore> wCRefundStoreProvider;

  private Provider<ShippingLabelRestClient> shippingLabelRestClientProvider;

  private Provider<WCShippingLabelStore> wCShippingLabelStoreProvider;

  private Provider<WCDataRestClient> wCDataRestClientProvider;

  private Provider<WCDataStore> wCDataStoreProvider;

  private Provider<CardReaderTrackingInfoImpl> cardReaderTrackingInfoImplProvider;

  private Provider<CouponRestClient> couponRestClientProvider;

  private Provider<CouponStore> couponStoreProvider;

  private Provider<ShippingLabelRepository> shippingLabelRepositoryProvider;

  private Provider<ProductAttributeRestClient> productAttributeRestClientProvider;

  private Provider<WCGlobalAttributeStore> wCGlobalAttributeStoreProvider;

  private Provider<WCTaxRestClient> wCTaxRestClientProvider;

  private Provider<WCTaxStore> wCTaxStoreProvider;

  private Provider<InboxRestClient> inboxRestClientProvider;

  private Provider<WCInboxStore> wCInboxStoreProvider;

  private Provider<GatewayRestClient> gatewayRestClientProvider;

  private Provider<WCGatewayStore> wCGatewayStoreProvider;

  private Provider<PluginRestClient> pluginRestClientProvider;

  private Provider<PluginWPOrgClient> pluginWPOrgClientProvider;

  private Provider<PluginWPAPIRestClient> pluginWPAPIRestClientProvider;

  private Provider<NonceRestClient> nonceRestClientProvider;

  private Provider<PluginJetpackTunnelRestClient> pluginJetpackTunnelRestClientProvider;

  private Provider<PluginStore> pluginStoreProvider;

  private Provider<UnseenReviewsCountHandler> unseenReviewsCountHandlerProvider;

  private Provider<MediaRestClient> mediaRestClientProvider;

  private Provider<MediaXMLRPCClient> mediaXMLRPCClientProvider;

  private Provider<WPV2MediaRestClient> wPV2MediaRestClientProvider;

  private Provider<UploadStore> uploadStoreProvider;

  private Provider<MediaStore> mediaStoreProvider;

  private Provider<ProductImagesNotificationHandler> productImagesNotificationHandlerProvider;

  private Provider<ProductImagesServiceWrapper> productImagesServiceWrapperProvider;

  private Provider<ProductImagesUploadWorker> productImagesUploadWorkerProvider;

  private Provider<MediaFileUploadHandler> mediaFileUploadHandlerProvider;

  private Provider<OrderStatsRestClient> orderStatsRestClientProvider;

  private Provider<WCStatsStore> wCStatsStoreProvider;

  private Provider<LeaderboardsRestClient> leaderboardsRestClientProvider;

  private Provider<WCLeaderboardsStore> wCLeaderboardsStoreProvider;

  private Provider<OrderUpdateStore> orderUpdateStoreProvider;

  private Provider<AddOnsRestClient> addOnsRestClientProvider;

  private Provider<WCAddonsStore> wCAddonsStoreProvider;

  private Provider<OrderFiltersRepository> orderFiltersRepositoryProvider;

  private Provider<ListSqlUtils> listSqlUtilsProvider;

  private Provider<ListItemSqlUtils> listItemSqlUtilsProvider;

  private Provider<ListStore> listStoreProvider;

  private Provider<ReviewModerationHandler> reviewModerationHandlerProvider;

  private DaggerDefault_HiltComponents_SingletonC(AppConfigModule appConfigModuleParam,
      ApplicationContextModule applicationContextModuleParam,
      CardReaderModule cardReaderModuleParam, DataStoreModule dataStoreModuleParam,
      DummyInterceptorModule dummyInterceptorModuleParam,
      ReleaseNetworkModule releaseNetworkModuleParam,
      InterceptorModuleTest interceptorModuleTestParam,
      LoginAnalyticsModule loginAnalyticsModuleParam, NetworkStatusModule networkStatusModuleParam,
      NotificationModule notificationModuleParam, SelectedSiteModule selectedSiteModuleParam,
      SupportModule supportModuleParam, ThreadModule threadModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.releaseNetworkModule = releaseNetworkModuleParam;
    this.interceptorModuleTest = interceptorModuleTestParam;
    this.dummyInterceptorModule = dummyInterceptorModuleParam;
    this.appConfigModule = appConfigModuleParam;
    this.selectedSiteModule = selectedSiteModuleParam;
    this.networkStatusModule = networkStatusModuleParam;
    this.supportModule = supportModuleParam;
    this.notificationModule = notificationModuleParam;
    this.threadModule = threadModuleParam;
    this.dataStoreModule = dataStoreModuleParam;
    this.loginAnalyticsModule = loginAnalyticsModuleParam;
    this.cardReaderModule = cardReaderModuleParam;
    initialize(appConfigModuleParam, applicationContextModuleParam, cardReaderModuleParam, dataStoreModuleParam, dummyInterceptorModuleParam, releaseNetworkModuleParam, interceptorModuleTestParam, loginAnalyticsModuleParam, networkStatusModuleParam, notificationModuleParam, selectedSiteModuleParam, supportModuleParam, threadModuleParam);
    initialize2(appConfigModuleParam, applicationContextModuleParam, cardReaderModuleParam, dataStoreModuleParam, dummyInterceptorModuleParam, releaseNetworkModuleParam, interceptorModuleTestParam, loginAnalyticsModuleParam, networkStatusModuleParam, notificationModuleParam, selectedSiteModuleParam, supportModuleParam, threadModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return ImmutableMap.<Class<?>, Provider<AndroidInjector.Factory<?>>>of(MagicLinkInterceptActivity.class, ((Provider) magicLinkInterceptActivitySubcomponentFactoryProvider), LoginWpcomService.class, ((Provider) loginWpcomServiceSubcomponentFactoryProvider));
  }

  private ContextBasedLocaleProvider contextBasedLocaleProvider() {
    return new ContextBasedLocaleProvider(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private Set<Interceptor> namedSetOfInterceptor() {
    return ImmutableSet.<Interceptor>of(InterceptorModuleTest_ProvideMockingInterceptorFactory.provideMockingInterceptor(interceptorModuleTest));
  }

  private Set<Interceptor> namedSetOfInterceptor2() {
    return ImmutableSet.<Interceptor>of(DummyInterceptorModule_ProvideNetworkInterceptorFactory.provideNetworkInterceptor(dummyInterceptorModule));
  }

  private UserAgent userAgent() {
    return AppConfigModule_ProvideUserAgentFactory.provideUserAgent(appConfigModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private SelfHostedEndpointFinder selfHostedEndpointFinder() {
    return new SelfHostedEndpointFinder(dispatcherProvider.get(), discoveryXMLRPCClientProvider.get(), discoveryWPAPIRestClientProvider.get());
  }

  private Authenticator authenticator() {
    return new Authenticator(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), dispatcherProvider.get(), provideRequestQueueProvider.get(), AppConfigModule_ProvideAppSecretsFactory.provideAppSecrets(appConfigModule));
  }

  private PreferenceUtils.PreferenceUtilsWrapper preferenceUtilsWrapper() {
    return new PreferenceUtils.PreferenceUtilsWrapper(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private CoroutineEngine coroutineEngine() {
    return new CoroutineEngine(provideCoroutineContextProvider.get(), new AppLogWrapper());
  }

  private WooLogFileProvider wooLogFileProvider() {
    return new WooLogFileProvider(new WooLogWrapper());
  }

  private EnqueueSendingEncryptedLogs enqueueSendingEncryptedLogs() {
    return new EnqueueSendingEncryptedLogs(dispatcherProvider.get(), wooLogFileProvider(), provideNetworkStatusProvider.get());
  }

  private WCCrashLoggingDataProvider wCCrashLoggingDataProvider() {
    return new WCCrashLoggingDataProvider(contextBasedLocaleProvider(), accountStoreProvider.get(), provideSelectedSiteProvider.get(), providesAppPrefsProvider.get(), enqueueSendingEncryptedLogs(), new UuidGenerator(), buildConfigWrapperProvider.get());
  }

  private FluxCCrashLogger fluxCCrashLogger() {
    return CrashLoggingModule_Companion_ProvideFluxCCrashLoggerFactory.provideFluxCCrashLogger(provideCrashLoggingProvider.get());
  }

  private UploadEncryptedLogs uploadEncryptedLogs() {
    return new UploadEncryptedLogs(ThreadModule_ProvideDispatchersFactory.provideDispatchers(threadModule), encryptedLogStoreProvider.get());
  }

  private DataStoreTrackerRepository dataStoreTrackerRepository() {
    return new DataStoreTrackerRepository(provideTrackerDataStoreProvider.get());
  }

  private SendTelemetry sendTelemetry() {
    return new SendTelemetry(trackerStoreProvider.get(), dataStoreTrackerRepository(), new CurrentTimeProvider(), provideSelectedSiteProvider.get());
  }

  private SiteObserver siteObserver() {
    return new SiteObserver(provideSelectedSiteProvider.get(), wooCommerceStoreProvider.get());
  }

  private FormattableContentMapper formattableContentMapper() {
    return new FormattableContentMapper(provideGsonProvider.get());
  }

  private NotificationRepository notificationRepository() {
    return new NotificationRepository(notificationStoreProvider.get());
  }

  private GetDeviceRegistrationStatus getDeviceRegistrationStatus() {
    return new GetDeviceRegistrationStatus(preferenceUtilsWrapper());
  }

  private RegisterDevice registerDevice() {
    return new RegisterDevice(new AppPrefsWrapper(), accountStoreProvider.get(), notificationRepository(), getDeviceRegistrationStatus());
  }

  private LoginAnalyticsListener loginAnalyticsListener() {
    return LoginAnalyticsModule_ProvideAnalyticsListenerFactory.provideAnalyticsListener(loginAnalyticsModule, accountStoreProvider.get(), siteStoreProvider.get(), unifiedLoginTrackerProvider.get());
  }

  private AddonsDao addonsDao() {
    return WCDatabaseModule_Companion_ProvideAddonsDao$woocommerce_releaseFactory.provideAddonsDao$woocommerce_release(provideDatabaseProvider.get());
  }

  private StripOrder stripOrder() {
    return new StripOrder(provideGsonProvider.get());
  }

  private OrderDtoMapper orderDtoMapper() {
    return new OrderDtoMapper(stripOrder());
  }

  private OrdersDao ordersDao() {
    return WCDatabaseModule_Companion_ProvideOrdersDaoFactory.provideOrdersDao(provideDatabaseProvider.get());
  }

  private OrderNotesDao orderNotesDao() {
    return WCDatabaseModule_Companion_ProvideOrderNotesDaoFactory.provideOrderNotesDao(provideDatabaseProvider.get());
  }

  private CardReaderStore cardReaderStore() {
    return CardReaderModule_ProvideInPersonPaymentsStoreFactory.provideInPersonPaymentsStore(cardReaderModule, provideSelectedSiteProvider.get(), wCInPersonPaymentsStoreProvider.get(), new CapturePaymentResponseMapper(), providesAppPrefsProvider.get());
  }

  private ResourceProvider resourceProvider() {
    return new ResourceProvider(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private NotificationsParser notificationsParser() {
    return new NotificationsParser(new Base64Decoder());
  }

  private CouponsDao couponsDao() {
    return WCDatabaseModule_Companion_ProvideCouponsDaoFactory.provideCouponsDao(provideDatabaseProvider.get());
  }

  private GetLocations getLocations() {
    return new GetLocations(wCDataStoreProvider.get());
  }

  private ShippingLabelAddressMapper shippingLabelAddressMapper() {
    return new ShippingLabelAddressMapper(getLocations());
  }

  private ShippingLabelMapper shippingLabelMapper() {
    return new ShippingLabelMapper(shippingLabelAddressMapper());
  }

  private InboxNotesDao inboxNotesDao() {
    return WCDatabaseModule_Companion_ProvideInboxNotesDaoFactory.provideInboxNotesDao(provideDatabaseProvider.get());
  }

  private PluginCoroutineStore pluginCoroutineStore() {
    return new PluginCoroutineStore(coroutineEngine(), dispatcherProvider.get(), pluginWPAPIRestClientProvider.get(), discoveryWPAPIRestClientProvider.get(), siteSqlUtilsProvider.get(), nonceRestClientProvider.get(), new CurrentTimeProvider(), new PluginSqlUtilsWrapper());
  }

  private DeviceMediaLoader deviceMediaLoader() {
    return new DeviceMediaLoader(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private DeviceMediaSource.Factory deviceMediaSourceFactory() {
    return new DeviceMediaSource.Factory(deviceMediaLoader(), ApplicationModule_Companion_ProvideBackgroundDispatcherFactory.provideBackgroundDispatcher(), new MediaPickerMimeTypeProvider());
  }

  private DateTimeUtilsWrapper dateTimeUtilsWrapper() {
    return new DateTimeUtilsWrapper(new LocaleManagerWrapper(), ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private NetworkUtilsWrapper networkUtilsWrapper() {
    return new NetworkUtilsWrapper(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private SiteModel siteModel() {
    return MediaPickerModule_Companion_ProvideSelectedSiteFactory.provideSelectedSite(provideSelectedSiteProvider.get());
  }

  private MediaLibrarySource.Factory mediaLibrarySourceFactory() {
    return new MediaLibrarySource.Factory(mediaStoreProvider.get(), dispatcherProvider.get(), ApplicationModule_Companion_ProvideBackgroundDispatcherFactory.provideBackgroundDispatcher(), dateTimeUtilsWrapper(), networkUtilsWrapper(), siteModel());
  }

  private MediaPickerLoaderFactory mediaPickerLoaderFactory() {
    return new MediaPickerLoaderFactory(deviceMediaSourceFactory(), mediaLibrarySourceFactory());
  }

  private MediaFilesRepository mediaFilesRepository() {
    return new MediaFilesRepository(dispatcherProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule), provideSelectedSiteProvider.get(), mediaStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(threadModule), resourceProvider(), mediaPickerUtilsProvider.get());
  }

  private ProductDetailRepository productDetailRepository() {
    return new ProductDetailRepository(dispatcherProvider.get(), wCProductStoreProvider.get(), wCGlobalAttributeStoreProvider.get(), provideSelectedSiteProvider.get(), wCTaxStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(threadModule));
  }

  private RemoteGlobalAddonGroupMapper remoteGlobalAddonGroupMapper() {
    return new RemoteGlobalAddonGroupMapper(new AppLogWrapper());
  }

  private FromDatabaseAddonGroupMapper fromDatabaseAddonGroupMapper() {
    return new FromDatabaseAddonGroupMapper(new AppLogWrapper());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppConfigModule appConfigModuleParam,
      final ApplicationContextModule applicationContextModuleParam,
      final CardReaderModule cardReaderModuleParam, final DataStoreModule dataStoreModuleParam,
      final DummyInterceptorModule dummyInterceptorModuleParam,
      final ReleaseNetworkModule releaseNetworkModuleParam,
      final InterceptorModuleTest interceptorModuleTestParam,
      final LoginAnalyticsModule loginAnalyticsModuleParam,
      final NetworkStatusModule networkStatusModuleParam,
      final NotificationModule notificationModuleParam,
      final SelectedSiteModule selectedSiteModuleParam, final SupportModule supportModuleParam,
      final ThreadModule threadModuleParam) {
    this.magicLinkInterceptActivitySubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, 0);
    this.loginWpcomServiceSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, 1);
    this.dispatcherProvider = DoubleCheck.provider(new SwitchingProvider<Dispatcher>(singletonC, 5));
    this.provideCookieManagerProvider = DoubleCheck.provider(new SwitchingProvider<CookieManager>(singletonC, 10));
    this.provideCookieJarProvider = DoubleCheck.provider(new SwitchingProvider<CookieJar>(singletonC, 9));
    this.provideMediaOkHttpClientInstanceProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 8));
    this.provideRequestQueueProvider = DoubleCheck.provider(new SwitchingProvider<RequestQueue>(singletonC, 7));
    this.accessTokenProvider = DoubleCheck.provider(new SwitchingProvider<AccessToken>(singletonC, 11));
    this.accountRestClientProvider = DoubleCheck.provider(new SwitchingProvider<AccountRestClient>(singletonC, 6));
    this.provideMemorizingTrustManagerProvider = DoubleCheck.provider(new SwitchingProvider<MemorizingTrustManager>(singletonC, 15));
    this.provideMediaOkHttpClientInstanceCustomSSLProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 14));
    this.provideRequestQueueCustomSSLProvider = DoubleCheck.provider(new SwitchingProvider<RequestQueue>(singletonC, 13));
    this.discoveryXMLRPCClientProvider = DoubleCheck.provider(new SwitchingProvider<DiscoveryXMLRPCClient>(singletonC, 12));
    this.discoveryWPAPIRestClientProvider = DoubleCheck.provider(new SwitchingProvider<DiscoveryWPAPIRestClient>(singletonC, 16));
    this.accountStoreProvider = DoubleCheck.provider(new SwitchingProvider<AccountStore>(singletonC, 4));
    this.postSqlUtilsProvider = SingleCheck.provider(new SwitchingProvider<PostSqlUtils>(singletonC, 19));
    this.wPComGsonRequestBuilderProvider = DoubleCheck.provider(new SwitchingProvider<WPComGsonRequestBuilder>(singletonC, 21));
    this.siteRestClientProvider = DoubleCheck.provider(new SwitchingProvider<SiteRestClient>(singletonC, 20));
    this.xMLRPCRequestBuilderProvider = DoubleCheck.provider(new SwitchingProvider<XMLRPCRequestBuilder>(singletonC, 23));
    this.siteXMLRPCClientProvider = DoubleCheck.provider(new SwitchingProvider<SiteXMLRPCClient>(singletonC, 22));
    this.privateAtomicCookieProvider = DoubleCheck.provider(new SwitchingProvider<PrivateAtomicCookie>(singletonC, 24));
    this.siteSqlUtilsProvider = DoubleCheck.provider(new SwitchingProvider<SiteSqlUtils>(singletonC, 25));
    this.provideCoroutineContextProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineContext>(singletonC, 26));
    this.siteStoreProvider = DoubleCheck.provider(new SwitchingProvider<SiteStore>(singletonC, 18));
    this.provideSelectedSiteProvider = DoubleCheck.provider(new SwitchingProvider<SelectedSite>(singletonC, 17));
    this.providesAppPrefsProvider = DoubleCheck.provider(new SwitchingProvider<AppPrefs>(singletonC, 27));
    this.provideNetworkStatusProvider = DoubleCheck.provider(new SwitchingProvider<NetworkStatus>(singletonC, 28));
    this.buildConfigWrapperProvider = SingleCheck.provider(new SwitchingProvider<BuildConfigWrapper>(singletonC, 29));
    this.provideCrashLoggingProvider = DoubleCheck.provider(new SwitchingProvider<CrashLogging>(singletonC, 3));
    this.jetpackTunnelGsonRequestBuilderProvider = DoubleCheck.provider(new SwitchingProvider<JetpackTunnelGsonRequestBuilder>(singletonC, 32));
    this.wooSystemRestClientProvider = DoubleCheck.provider(new SwitchingProvider<WooSystemRestClient>(singletonC, 31));
    this.wooCommerceRestClientProvider = DoubleCheck.provider(new SwitchingProvider<WooCommerceRestClient>(singletonC, 33));
    this.wooCommerceStoreProvider = DoubleCheck.provider(new SwitchingProvider<WooCommerceStore>(singletonC, 30));
    this.provideSupportHelperProvider = DoubleCheck.provider(new SwitchingProvider<SupportHelper>(singletonC, 35));
    this.provideZendeskHelperProvider = DoubleCheck.provider(new SwitchingProvider<ZendeskHelper>(singletonC, 34));
    this.provideWooNotificationBuilderProvider = DoubleCheck.provider(new SwitchingProvider<WooNotificationBuilder>(singletonC, 36));
    this.wCUserRestClientProvider = DoubleCheck.provider(new SwitchingProvider<WCUserRestClient>(singletonC, 39));
    this.wCUserStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCUserStore>(singletonC, 38));
    this.userEligibilityFetcherProvider = DoubleCheck.provider(new SwitchingProvider<UserEligibilityFetcher>(singletonC, 37));
    this.encryptedLogRestClientProvider = DoubleCheck.provider(new SwitchingProvider<EncryptedLogRestClient>(singletonC, 41));
    this.encryptedLogSqlUtilsProvider = DoubleCheck.provider(new SwitchingProvider<EncryptedLogSqlUtils>(singletonC, 42));
    this.logEncrypterProvider = SingleCheck.provider(new SwitchingProvider<LogEncrypter>(singletonC, 43));
    this.encryptedLogStoreProvider = DoubleCheck.provider(new SwitchingProvider<EncryptedLogStore>(singletonC, 40));
    this.analyticsTrackerWrapperProvider = SingleCheck.provider(new SwitchingProvider<AnalyticsTrackerWrapper>(singletonC, 45));
    this.observeEncryptedLogsUploadResultProvider = DoubleCheck.provider(new SwitchingProvider<ObserveEncryptedLogsUploadResult>(singletonC, 44));
    this.trackerRestClientProvider = DoubleCheck.provider(new SwitchingProvider<TrackerRestClient>(singletonC, 47));
    this.trackerStoreProvider = DoubleCheck.provider(new SwitchingProvider<TrackerStore>(singletonC, 46));
    this.provideAppCoroutineScopeProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineScope>(singletonC, 49));
    this.provideTrackerDataStoreProvider = DoubleCheck.provider(new SwitchingProvider<DataStore<Preferences>>(singletonC, 48));
    this.notificationRestClientProvider = DoubleCheck.provider(new SwitchingProvider<NotificationRestClient>(singletonC, 51));
    this.provideGsonProvider = DoubleCheck.provider(new SwitchingProvider<Gson>(singletonC, 53));
    this.notificationSqlUtilsProvider = DoubleCheck.provider(new SwitchingProvider<NotificationSqlUtils>(singletonC, 52));
    this.notificationStoreProvider = DoubleCheck.provider(new SwitchingProvider<NotificationStore>(singletonC, 50));
    this.connectionChangeReceiverProvider = DoubleCheck.provider(new SwitchingProvider<ConnectionChangeReceiver>(singletonC, 54));
    this.appInitializerProvider = DoubleCheck.provider(new SwitchingProvider<AppInitializer>(singletonC, 2));
    this.unifiedLoginTrackerProvider = DoubleCheck.provider(new SwitchingProvider<UnifiedLoginTracker>(singletonC, 55));
    this.productRestClientProvider = DoubleCheck.provider(new SwitchingProvider<ProductRestClient>(singletonC, 58));
    this.provideDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<WCAndroidDatabase>(singletonC, 59));
    this.wCProductStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCProductStore>(singletonC, 57));
    this.productImageMapProvider = DoubleCheck.provider(new SwitchingProvider<ProductImageMap>(singletonC, 56));
    this.orderRestClientProvider = DoubleCheck.provider(new SwitchingProvider<OrderRestClient>(singletonC, 61));
    this.wCOrderFetcherProvider = DoubleCheck.provider(new SwitchingProvider<WCOrderFetcher>(singletonC, 62));
    this.wCOrderStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCOrderStore>(singletonC, 60));
    this.inPersonPaymentsRestClientProvider = DoubleCheck.provider(new SwitchingProvider<InPersonPaymentsRestClient>(singletonC, 65));
    this.wCInPersonPaymentsStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCInPersonPaymentsStore>(singletonC, 64));
    this.provideCardReaderManagerProvider = DoubleCheck.provider(new SwitchingProvider<CardReaderManager>(singletonC, 63));
    this.notificationAnalyticsTrackerProvider = DoubleCheck.provider(new SwitchingProvider<NotificationAnalyticsTracker>(singletonC, 67));
    this.notificationMessageHandlerProvider = DoubleCheck.provider(new SwitchingProvider<NotificationMessageHandler>(singletonC, 66));
    this.currencyFormatterProvider = DoubleCheck.provider(new SwitchingProvider<CurrencyFormatter>(singletonC, 68));
    this.myStoreStatsUsageTracksEventEmitterProvider = DoubleCheck.provider(new SwitchingProvider<MyStoreStatsUsageTracksEventEmitter>(singletonC, 69));
    this.orderNavigatorProvider = DoubleCheck.provider(new SwitchingProvider<OrderNavigator>(singletonC, 70));
    this.whatsNewRestClientProvider = DoubleCheck.provider(new SwitchingProvider<WhatsNewRestClient>(singletonC, 72));
    this.whatsNewSqlUtilsProvider = DoubleCheck.provider(new SwitchingProvider<WhatsNewSqlUtils>(singletonC, 73));
    this.whatsNewStoreProvider = DoubleCheck.provider(new SwitchingProvider<WhatsNewStore>(singletonC, 71));
    this.productNavigatorProvider = DoubleCheck.provider(new SwitchingProvider<ProductNavigator>(singletonC, 74));
    this.mediaPickerUtilsProvider = DoubleCheck.provider(new SwitchingProvider<MediaPickerUtils>(singletonC, 75));
    this.variationNavigatorProvider = DoubleCheck.provider(new SwitchingProvider<VariationNavigator>(singletonC, 76));
    this.permissionsProvider = DoubleCheck.provider(new SwitchingProvider<Permissions>(singletonC, 78));
    this.mediaPickerPermissionUtilsProvider = DoubleCheck.provider(new SwitchingProvider<MediaPickerPermissionUtils>(singletonC, 77));
    this.refundRestClientProvider = DoubleCheck.provider(new SwitchingProvider<RefundRestClient>(singletonC, 80));
    this.wCRefundStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCRefundStore>(singletonC, 79));
    this.shippingLabelRestClientProvider = DoubleCheck.provider(new SwitchingProvider<ShippingLabelRestClient>(singletonC, 82));
    this.wCShippingLabelStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCShippingLabelStore>(singletonC, 81));
    this.wCDataRestClientProvider = DoubleCheck.provider(new SwitchingProvider<WCDataRestClient>(singletonC, 84));
    this.wCDataStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCDataStore>(singletonC, 83));
    this.cardReaderTrackingInfoImplProvider = DoubleCheck.provider(new SwitchingProvider<CardReaderTrackingInfoImpl>(singletonC, 85));
    this.couponRestClientProvider = DoubleCheck.provider(new SwitchingProvider<CouponRestClient>(singletonC, 87));
    this.couponStoreProvider = DoubleCheck.provider(new SwitchingProvider<CouponStore>(singletonC, 86));
    this.shippingLabelRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<ShippingLabelRepository>(singletonC, 88));
    this.productAttributeRestClientProvider = DoubleCheck.provider(new SwitchingProvider<ProductAttributeRestClient>(singletonC, 90));
    this.wCGlobalAttributeStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCGlobalAttributeStore>(singletonC, 89));
    this.wCTaxRestClientProvider = DoubleCheck.provider(new SwitchingProvider<WCTaxRestClient>(singletonC, 92));
    this.wCTaxStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCTaxStore>(singletonC, 91));
    this.inboxRestClientProvider = DoubleCheck.provider(new SwitchingProvider<InboxRestClient>(singletonC, 94));
    this.wCInboxStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCInboxStore>(singletonC, 93));
    this.gatewayRestClientProvider = DoubleCheck.provider(new SwitchingProvider<GatewayRestClient>(singletonC, 96));
    this.wCGatewayStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCGatewayStore>(singletonC, 95));
    this.pluginRestClientProvider = DoubleCheck.provider(new SwitchingProvider<PluginRestClient>(singletonC, 98));
    this.pluginWPOrgClientProvider = DoubleCheck.provider(new SwitchingProvider<PluginWPOrgClient>(singletonC, 99));
    this.pluginWPAPIRestClientProvider = DoubleCheck.provider(new SwitchingProvider<PluginWPAPIRestClient>(singletonC, 100));
  }

  @SuppressWarnings("unchecked")
  private void initialize2(final AppConfigModule appConfigModuleParam,
      final ApplicationContextModule applicationContextModuleParam,
      final CardReaderModule cardReaderModuleParam, final DataStoreModule dataStoreModuleParam,
      final DummyInterceptorModule dummyInterceptorModuleParam,
      final ReleaseNetworkModule releaseNetworkModuleParam,
      final InterceptorModuleTest interceptorModuleTestParam,
      final LoginAnalyticsModule loginAnalyticsModuleParam,
      final NetworkStatusModule networkStatusModuleParam,
      final NotificationModule notificationModuleParam,
      final SelectedSiteModule selectedSiteModuleParam, final SupportModule supportModuleParam,
      final ThreadModule threadModuleParam) {
    this.nonceRestClientProvider = DoubleCheck.provider(new SwitchingProvider<NonceRestClient>(singletonC, 101));
    this.pluginJetpackTunnelRestClientProvider = DoubleCheck.provider(new SwitchingProvider<PluginJetpackTunnelRestClient>(singletonC, 102));
    this.pluginStoreProvider = DoubleCheck.provider(new SwitchingProvider<PluginStore>(singletonC, 97));
    this.unseenReviewsCountHandlerProvider = DoubleCheck.provider(new SwitchingProvider<UnseenReviewsCountHandler>(singletonC, 103));
    this.mediaRestClientProvider = DoubleCheck.provider(new SwitchingProvider<MediaRestClient>(singletonC, 105));
    this.mediaXMLRPCClientProvider = DoubleCheck.provider(new SwitchingProvider<MediaXMLRPCClient>(singletonC, 106));
    this.wPV2MediaRestClientProvider = DoubleCheck.provider(new SwitchingProvider<WPV2MediaRestClient>(singletonC, 107));
    this.uploadStoreProvider = DoubleCheck.provider(new SwitchingProvider<UploadStore>(singletonC, 108));
    this.mediaStoreProvider = DoubleCheck.provider(new SwitchingProvider<MediaStore>(singletonC, 104));
    this.productImagesNotificationHandlerProvider = DoubleCheck.provider(new SwitchingProvider<ProductImagesNotificationHandler>(singletonC, 110));
    this.productImagesServiceWrapperProvider = DoubleCheck.provider(new SwitchingProvider<ProductImagesServiceWrapper>(singletonC, 112));
    this.productImagesUploadWorkerProvider = DoubleCheck.provider(new SwitchingProvider<ProductImagesUploadWorker>(singletonC, 111));
    this.mediaFileUploadHandlerProvider = DoubleCheck.provider(new SwitchingProvider<MediaFileUploadHandler>(singletonC, 109));
    this.orderStatsRestClientProvider = DoubleCheck.provider(new SwitchingProvider<OrderStatsRestClient>(singletonC, 114));
    this.wCStatsStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCStatsStore>(singletonC, 113));
    this.leaderboardsRestClientProvider = DoubleCheck.provider(new SwitchingProvider<LeaderboardsRestClient>(singletonC, 116));
    this.wCLeaderboardsStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCLeaderboardsStore>(singletonC, 115));
    this.orderUpdateStoreProvider = DoubleCheck.provider(new SwitchingProvider<OrderUpdateStore>(singletonC, 117));
    this.addOnsRestClientProvider = DoubleCheck.provider(new SwitchingProvider<AddOnsRestClient>(singletonC, 119));
    this.wCAddonsStoreProvider = DoubleCheck.provider(new SwitchingProvider<WCAddonsStore>(singletonC, 118));
    this.orderFiltersRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<OrderFiltersRepository>(singletonC, 120));
    this.listSqlUtilsProvider = DoubleCheck.provider(new SwitchingProvider<ListSqlUtils>(singletonC, 122));
    this.listItemSqlUtilsProvider = DoubleCheck.provider(new SwitchingProvider<ListItemSqlUtils>(singletonC, 123));
    this.listStoreProvider = DoubleCheck.provider(new SwitchingProvider<ListStore>(singletonC, 121));
    this.reviewModerationHandlerProvider = DoubleCheck.provider(new SwitchingProvider<ReviewModerationHandler>(singletonC, 124));
  }

  @Override
  public DispatchingAndroidInjector<Object> injector() {
    return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), ImmutableMap.<String, Provider<AndroidInjector.Factory<?>>>of());
  }

  @Override
  public void injectWooCommerceDebug(WooCommerceDebug arg0) {
    injectWooCommerceDebug2(arg0);
  }

  @Override
  public RequestQueue requestQueue() {
    return provideRequestQueueCustomSSLProvider.get();
  }

  @Override
  public AppInitializer initializer() {
    return appInitializerProvider.get();
  }

  @Override
  public CoroutineScope appCoroutineScope() {
    return provideAppCoroutineScopeProvider.get();
  }

  @Override
  public void injectTest(ScreenshotTest arg0) {
  }

  @Override
  public void injectTest(OrdersUITest arg0) {
  }

  @Override
  public void injectTest(ProductsUITest arg0) {
  }

  @Override
  public void injectTest(ReviewsUITest arg0) {
  }

  @Override
  public Set<Boolean> getDisableFragmentGetContextFix() {
    return ImmutableSet.<Boolean>of();
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  @CanIgnoreReturnValue
  private AppInitializer injectAppInitializer(AppInitializer instance) {
    AppInitializer_MembersInjector.injectCrashLogging(instance, provideCrashLoggingProvider.get());
    AppInitializer_MembersInjector.injectFluxCCrashLogger(instance, fluxCCrashLogger());
    AppInitializer_MembersInjector.injectAndroidInjector(instance, injector());
    AppInitializer_MembersInjector.injectDispatcher(instance, dispatcherProvider.get());
    AppInitializer_MembersInjector.injectAccountStore(instance, accountStoreProvider.get());
    AppInitializer_MembersInjector.injectSiteStore(instance, siteStoreProvider.get());
    AppInitializer_MembersInjector.injectWooCommerceStore(instance, wooCommerceStoreProvider.get());
    AppInitializer_MembersInjector.injectSelectedSite(instance, provideSelectedSiteProvider.get());
    AppInitializer_MembersInjector.injectNetworkStatus(instance, provideNetworkStatusProvider.get());
    AppInitializer_MembersInjector.injectZendeskHelper(instance, provideZendeskHelperProvider.get());
    AppInitializer_MembersInjector.injectWooNotificationBuilder(instance, provideWooNotificationBuilderProvider.get());
    AppInitializer_MembersInjector.injectUserEligibilityFetcher(instance, userEligibilityFetcherProvider.get());
    AppInitializer_MembersInjector.injectUploadEncryptedLogs(instance, uploadEncryptedLogs());
    AppInitializer_MembersInjector.injectObserveEncryptedLogsUploadResults(instance, observeEncryptedLogsUploadResultProvider.get());
    AppInitializer_MembersInjector.injectSendTelemetry(instance, sendTelemetry());
    AppInitializer_MembersInjector.injectSiteObserver(instance, siteObserver());
    AppInitializer_MembersInjector.injectWooLog(instance, new WooLogWrapper());
    AppInitializer_MembersInjector.injectRegisterDevice(instance, registerDevice());
    AppInitializer_MembersInjector.injectConnectionReceiver(instance, connectionChangeReceiverProvider.get());
    AppInitializer_MembersInjector.injectPrefs(instance, providesAppPrefsProvider.get());
    AppInitializer_MembersInjector.injectAppCoroutineScope(instance, provideAppCoroutineScopeProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private WooCommerceDebug injectWooCommerceDebug2(WooCommerceDebug instance) {
    WooCommerce_MembersInjector.injectAndroidInjector(instance, injector());
    WooCommerce_MembersInjector.injectAppInitializer(instance, DoubleCheck.lazy(appInitializerProvider));
    return instance;
  }

  @CanIgnoreReturnValue
  private MediaStore injectMediaStore(MediaStore instance) {
    MediaStore_MembersInjector.injectMUploadStore(instance, uploadStoreProvider.get());
    return instance;
  }

  public static final class Builder {
    private AppConfigModule appConfigModule;

    private ApplicationContextModule applicationContextModule;

    private CardReaderModule cardReaderModule;

    private DataStoreModule dataStoreModule;

    private DummyInterceptorModule dummyInterceptorModule;

    private ReleaseNetworkModule releaseNetworkModule;

    private InterceptorModuleTest interceptorModuleTest;

    private LoginAnalyticsModule loginAnalyticsModule;

    private NetworkStatusModule networkStatusModule;

    private NotificationModule notificationModule;

    private SelectedSiteModule selectedSiteModule;

    private SupportModule supportModule;

    private ThreadModule threadModule;

    private Builder() {
    }

    public Builder appConfigModule(AppConfigModule appConfigModule) {
      this.appConfigModule = Preconditions.checkNotNull(appConfigModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder cardReaderModule(CardReaderModule cardReaderModule) {
      this.cardReaderModule = Preconditions.checkNotNull(cardReaderModule);
      return this;
    }

    public Builder dataStoreModule(DataStoreModule dataStoreModule) {
      this.dataStoreModule = Preconditions.checkNotNull(dataStoreModule);
      return this;
    }

    public Builder dummyInterceptorModule(DummyInterceptorModule dummyInterceptorModule) {
      this.dummyInterceptorModule = Preconditions.checkNotNull(dummyInterceptorModule);
      return this;
    }

    public Builder releaseNetworkModule(ReleaseNetworkModule releaseNetworkModule) {
      this.releaseNetworkModule = Preconditions.checkNotNull(releaseNetworkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    public Builder interceptorModuleTest(InterceptorModuleTest interceptorModuleTest) {
      this.interceptorModuleTest = Preconditions.checkNotNull(interceptorModuleTest);
      return this;
    }

    public Builder loginAnalyticsModule(LoginAnalyticsModule loginAnalyticsModule) {
      this.loginAnalyticsModule = Preconditions.checkNotNull(loginAnalyticsModule);
      return this;
    }

    public Builder networkStatusModule(NetworkStatusModule networkStatusModule) {
      this.networkStatusModule = Preconditions.checkNotNull(networkStatusModule);
      return this;
    }

    public Builder notificationModule(NotificationModule notificationModule) {
      this.notificationModule = Preconditions.checkNotNull(notificationModule);
      return this;
    }

    public Builder selectedSiteModule(SelectedSiteModule selectedSiteModule) {
      this.selectedSiteModule = Preconditions.checkNotNull(selectedSiteModule);
      return this;
    }

    public Builder supportModule(SupportModule supportModule) {
      this.supportModule = Preconditions.checkNotNull(supportModule);
      return this;
    }

    public Builder threadModule(ThreadModule threadModule) {
      this.threadModule = Preconditions.checkNotNull(threadModule);
      return this;
    }

    public Default_HiltComponents.SingletonC build() {
      if (appConfigModule == null) {
        this.appConfigModule = new AppConfigModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (cardReaderModule == null) {
        this.cardReaderModule = new CardReaderModule();
      }
      if (dataStoreModule == null) {
        this.dataStoreModule = new DataStoreModule();
      }
      if (dummyInterceptorModule == null) {
        this.dummyInterceptorModule = new DummyInterceptorModule();
      }
      if (releaseNetworkModule == null) {
        this.releaseNetworkModule = new ReleaseNetworkModule();
      }
      if (interceptorModuleTest == null) {
        this.interceptorModuleTest = new InterceptorModuleTest();
      }
      if (loginAnalyticsModule == null) {
        this.loginAnalyticsModule = new LoginAnalyticsModule();
      }
      if (networkStatusModule == null) {
        this.networkStatusModule = new NetworkStatusModule();
      }
      if (notificationModule == null) {
        this.notificationModule = new NotificationModule();
      }
      if (selectedSiteModule == null) {
        this.selectedSiteModule = new SelectedSiteModule();
      }
      if (supportModule == null) {
        this.supportModule = new SupportModule();
      }
      if (threadModule == null) {
        this.threadModule = new ThreadModule();
      }
      return new DaggerDefault_HiltComponents_SingletonC(appConfigModule, applicationContextModule, cardReaderModule, dataStoreModule, dummyInterceptorModule, releaseNetworkModule, interceptorModuleTest, loginAnalyticsModule, networkStatusModule, notificationModule, selectedSiteModule, supportModule, threadModule);
    }
  }

  private static final class MagicLinkInterceptActivitySubcomponentFactory implements ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector.MagicLinkInterceptActivitySubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private MagicLinkInterceptActivitySubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector.MagicLinkInterceptActivitySubcomponent create(
        MagicLinkInterceptActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MagicLinkInterceptActivitySubcomponentImpl(singletonC, arg0);
    }
  }

  private static final class LoginWpcomServiceSubcomponentFactory implements LoginServiceModule_LoginWpcomService.LoginWpcomServiceSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private LoginWpcomServiceSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public LoginServiceModule_LoginWpcomService.LoginWpcomServiceSubcomponent create(
        LoginWpcomService arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginWpcomServiceSubcomponentImpl(singletonC, arg0);
    }
  }

  private static final class ActivityRetainedCBuilder implements Default_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerDefault_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public Default_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements Default_HiltComponents.ActivityC.Builder {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public Default_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class Login2FaFragmentSubcomponentFactory implements LoginFragmentModule_Login2FaFragment.Login2FaFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Login2FaFragmentSubcomponentFactory(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_Login2FaFragment.Login2FaFragmentSubcomponent create(
        Login2FaFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new Login2FaFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginEmailFragmentSubcomponentFactory implements LoginFragmentModule_LoginEmailFragment.LoginEmailFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginEmailFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginEmailFragment.LoginEmailFragmentSubcomponent create(
        LoginEmailFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginEmailFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginEmailPasswordFragmentSubcomponentFactory implements LoginFragmentModule_LoginEmailPasswordFragment.LoginEmailPasswordFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginEmailPasswordFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginEmailPasswordFragment.LoginEmailPasswordFragmentSubcomponent create(
        LoginEmailPasswordFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginEmailPasswordFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginGoogleFragmentSubcomponentFactory implements LoginFragmentModule_LoginGoogleFragment.LoginGoogleFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginGoogleFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginGoogleFragment.LoginGoogleFragmentSubcomponent create(
        LoginGoogleFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginGoogleFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginMagicLinkRequestFragmentSubcomponentFactory implements LoginFragmentModule_LoginMagicLinkRequestFragment.LoginMagicLinkRequestFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginMagicLinkRequestFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginMagicLinkRequestFragment.LoginMagicLinkRequestFragmentSubcomponent create(
        LoginMagicLinkRequestFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginMagicLinkRequestFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginMagicLinkSentFragmentSubcomponentFactory implements LoginFragmentModule_LoginMagicLinkSentFragment.LoginMagicLinkSentFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginMagicLinkSentFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginMagicLinkSentFragment.LoginMagicLinkSentFragmentSubcomponent create(
        LoginMagicLinkSentFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginMagicLinkSentFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginSiteAddressFragmentSubcomponentFactory implements LoginFragmentModule_LoginSiteAddressFragment.LoginSiteAddressFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginSiteAddressFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginSiteAddressFragment.LoginSiteAddressFragmentSubcomponent create(
        LoginSiteAddressFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginSiteAddressFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginSiteAddressHelpDialogFragmentSubcomponentFactory implements LoginFragmentModule_LoginSiteAddressHelpDialogFragment.LoginSiteAddressHelpDialogFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginSiteAddressHelpDialogFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginSiteAddressHelpDialogFragment.LoginSiteAddressHelpDialogFragmentSubcomponent create(
        LoginSiteAddressHelpDialogFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginSiteAddressHelpDialogFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class LoginUsernamePasswordFragmentSubcomponentFactory implements LoginFragmentModule_LoginUsernamePasswordFragment.LoginUsernamePasswordFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private LoginUsernamePasswordFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_LoginUsernamePasswordFragment.LoginUsernamePasswordFragmentSubcomponent create(
        LoginUsernamePasswordFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginUsernamePasswordFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class SignupGoogleFragmentSubcomponentFactory implements LoginFragmentModule_SignupGoogleFragment.SignupGoogleFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private SignupGoogleFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_SignupGoogleFragment.SignupGoogleFragmentSubcomponent create(
        SignupGoogleFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new SignupGoogleFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class SignupMagicLinkFragmentSubcomponentFactory implements LoginFragmentModule_SignupMagicLinkFragment.SignupMagicLinkFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private SignupMagicLinkFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_SignupMagicLinkFragment.SignupMagicLinkFragmentSubcomponent create(
        SignupMagicLinkFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new SignupMagicLinkFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class SignupConfirmationFragmentSubcomponentFactory implements LoginFragmentModule_SignupConfirmationScreen.SignupConfirmationFragmentSubcomponent.Factory {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private SignupConfirmationFragmentSubcomponentFactory(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public LoginFragmentModule_SignupConfirmationScreen.SignupConfirmationFragmentSubcomponent create(
        SignupConfirmationFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new SignupConfirmationFragmentSubcomponentImpl(singletonC, activityRetainedCImpl, activityCImpl, arg0);
    }
  }

  private static final class FragmentCBuilder implements Default_HiltComponents.FragmentC.Builder {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public Default_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements Default_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Default_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements Default_HiltComponents.ViewC.Builder {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Default_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements Default_HiltComponents.ViewModelC.Builder {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public Default_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements Default_HiltComponents.ServiceC.Builder {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerDefault_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public Default_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class MagicLinkInterceptActivitySubcomponentImpl implements ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector.MagicLinkInterceptActivitySubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final MagicLinkInterceptActivitySubcomponentImpl magicLinkInterceptActivitySubcomponentImpl = this;

    private MagicLinkInterceptActivitySubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC, MagicLinkInterceptActivity arg0Param) {
      this.singletonC = singletonC;


    }

    @Override
    public void inject(MagicLinkInterceptActivity arg0) {
      injectMagicLinkInterceptActivity(arg0);
    }

    @CanIgnoreReturnValue
    private MagicLinkInterceptActivity injectMagicLinkInterceptActivity(
        MagicLinkInterceptActivity instance) {
      MagicLinkInterceptActivity_MembersInjector.injectLoginAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginWpcomServiceSubcomponentImpl implements LoginServiceModule_LoginWpcomService.LoginWpcomServiceSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final LoginWpcomServiceSubcomponentImpl loginWpcomServiceSubcomponentImpl = this;

    private LoginWpcomServiceSubcomponentImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        LoginWpcomService arg0Param) {
      this.singletonC = singletonC;


    }

    @Override
    public void inject(LoginWpcomService arg0) {
      injectLoginWpcomService(arg0);
    }

    @CanIgnoreReturnValue
    private LoginWpcomService injectLoginWpcomService(LoginWpcomService instance) {
      LoginWpcomService_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginWpcomService_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class Login2FaFragmentSubcomponentImpl implements LoginFragmentModule_Login2FaFragment.Login2FaFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final Login2FaFragmentSubcomponentImpl login2FaFragmentSubcomponentImpl = this;

    private Login2FaFragmentSubcomponentImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Login2FaFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(Login2FaFragment arg0) {
      injectLogin2FaFragment(arg0);
    }

    @CanIgnoreReturnValue
    private Login2FaFragment injectLogin2FaFragment(Login2FaFragment instance) {
      LoginBaseFormFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAccountStore(instance, singletonC.accountStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginEmailFragmentSubcomponentImpl implements LoginFragmentModule_LoginEmailFragment.LoginEmailFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginEmailFragmentSubcomponentImpl loginEmailFragmentSubcomponentImpl = this;

    private LoginEmailFragmentSubcomponentImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginEmailFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginEmailFragment arg0) {
      injectLoginEmailFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginEmailFragment injectLoginEmailFragment(LoginEmailFragment instance) {
      LoginBaseFormFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAccountStore(instance, singletonC.accountStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginEmailPasswordFragmentSubcomponentImpl implements LoginFragmentModule_LoginEmailPasswordFragment.LoginEmailPasswordFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginEmailPasswordFragmentSubcomponentImpl loginEmailPasswordFragmentSubcomponentImpl = this;

    private LoginEmailPasswordFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginEmailPasswordFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginEmailPasswordFragment arg0) {
      injectLoginEmailPasswordFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginEmailPasswordFragment injectLoginEmailPasswordFragment(
        LoginEmailPasswordFragment instance) {
      LoginBaseFormFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAccountStore(instance, singletonC.accountStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginGoogleFragmentSubcomponentImpl implements LoginFragmentModule_LoginGoogleFragment.LoginGoogleFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginGoogleFragmentSubcomponentImpl loginGoogleFragmentSubcomponentImpl = this;

    private LoginGoogleFragmentSubcomponentImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginGoogleFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginGoogleFragment arg0) {
      injectLoginGoogleFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginGoogleFragment injectLoginGoogleFragment(LoginGoogleFragment instance) {
      GoogleFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      GoogleFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      GoogleFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginMagicLinkRequestFragmentSubcomponentImpl implements LoginFragmentModule_LoginMagicLinkRequestFragment.LoginMagicLinkRequestFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginMagicLinkRequestFragmentSubcomponentImpl loginMagicLinkRequestFragmentSubcomponentImpl = this;

    private LoginMagicLinkRequestFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginMagicLinkRequestFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginMagicLinkRequestFragment arg0) {
      injectLoginMagicLinkRequestFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginMagicLinkRequestFragment injectLoginMagicLinkRequestFragment(
        LoginMagicLinkRequestFragment instance) {
      LoginMagicLinkRequestFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginMagicLinkRequestFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginMagicLinkSentFragmentSubcomponentImpl implements LoginFragmentModule_LoginMagicLinkSentFragment.LoginMagicLinkSentFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginMagicLinkSentFragmentSubcomponentImpl loginMagicLinkSentFragmentSubcomponentImpl = this;

    private LoginMagicLinkSentFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginMagicLinkSentFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginMagicLinkSentFragment arg0) {
      injectLoginMagicLinkSentFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginMagicLinkSentFragment injectLoginMagicLinkSentFragment(
        LoginMagicLinkSentFragment instance) {
      LoginMagicLinkSentFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginSiteAddressFragmentSubcomponentImpl implements LoginFragmentModule_LoginSiteAddressFragment.LoginSiteAddressFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginSiteAddressFragmentSubcomponentImpl loginSiteAddressFragmentSubcomponentImpl = this;

    private LoginSiteAddressFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginSiteAddressFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginSiteAddressFragment arg0) {
      injectLoginSiteAddressFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginSiteAddressFragment injectLoginSiteAddressFragment(
        LoginSiteAddressFragment instance) {
      LoginBaseFormFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAccountStore(instance, singletonC.accountStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      LoginSiteAddressFragment_MembersInjector.injectMAccountStore(instance, singletonC.accountStoreProvider.get());
      LoginSiteAddressFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginSiteAddressFragment_MembersInjector.injectMHTTPAuthManager(instance, new HTTPAuthManager());
      LoginSiteAddressFragment_MembersInjector.injectMMemorizingTrustManager(instance, singletonC.provideMemorizingTrustManagerProvider.get());
      return instance;
    }
  }

  private static final class LoginSiteAddressHelpDialogFragmentSubcomponentImpl implements LoginFragmentModule_LoginSiteAddressHelpDialogFragment.LoginSiteAddressHelpDialogFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginSiteAddressHelpDialogFragmentSubcomponentImpl loginSiteAddressHelpDialogFragmentSubcomponentImpl = this;

    private LoginSiteAddressHelpDialogFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginSiteAddressHelpDialogFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginSiteAddressHelpDialogFragment arg0) {
      injectLoginSiteAddressHelpDialogFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginSiteAddressHelpDialogFragment injectLoginSiteAddressHelpDialogFragment(
        LoginSiteAddressHelpDialogFragment instance) {
      LoginSiteAddressHelpDialogFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      LoginSiteAddressHelpDialogFragment_MembersInjector.injectMAccountStore(instance, singletonC.accountStoreProvider.get());
      LoginSiteAddressHelpDialogFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class LoginUsernamePasswordFragmentSubcomponentImpl implements LoginFragmentModule_LoginUsernamePasswordFragment.LoginUsernamePasswordFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final LoginUsernamePasswordFragmentSubcomponentImpl loginUsernamePasswordFragmentSubcomponentImpl = this;

    private LoginUsernamePasswordFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        LoginUsernamePasswordFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(LoginUsernamePasswordFragment arg0) {
      injectLoginUsernamePasswordFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LoginUsernamePasswordFragment injectLoginUsernamePasswordFragment(
        LoginUsernamePasswordFragment instance) {
      LoginBaseFormFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAccountStore(instance, singletonC.accountStoreProvider.get());
      LoginBaseFormFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class SignupGoogleFragmentSubcomponentImpl implements LoginFragmentModule_SignupGoogleFragment.SignupGoogleFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final SignupGoogleFragmentSubcomponentImpl signupGoogleFragmentSubcomponentImpl = this;

    private SignupGoogleFragmentSubcomponentImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        SignupGoogleFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(SignupGoogleFragment arg0) {
      injectSignupGoogleFragment(arg0);
    }

    @CanIgnoreReturnValue
    private SignupGoogleFragment injectSignupGoogleFragment(SignupGoogleFragment instance) {
      GoogleFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      GoogleFragment_MembersInjector.injectMSiteStore(instance, singletonC.siteStoreProvider.get());
      GoogleFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class SignupMagicLinkFragmentSubcomponentImpl implements LoginFragmentModule_SignupMagicLinkFragment.SignupMagicLinkFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final SignupMagicLinkFragmentSubcomponentImpl signupMagicLinkFragmentSubcomponentImpl = this;

    private SignupMagicLinkFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        SignupMagicLinkFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(SignupMagicLinkFragment arg0) {
      injectSignupMagicLinkFragment(arg0);
    }

    @CanIgnoreReturnValue
    private SignupMagicLinkFragment injectSignupMagicLinkFragment(
        SignupMagicLinkFragment instance) {
      SignupMagicLinkFragment_MembersInjector.injectMDispatcher(instance, singletonC.dispatcherProvider.get());
      SignupMagicLinkFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class SignupConfirmationFragmentSubcomponentImpl implements LoginFragmentModule_SignupConfirmationScreen.SignupConfirmationFragmentSubcomponent {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final SignupConfirmationFragmentSubcomponentImpl signupConfirmationFragmentSubcomponentImpl = this;

    private SignupConfirmationFragmentSubcomponentImpl(
        DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        SignupConfirmationFragment arg0Param) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void inject(SignupConfirmationFragment arg0) {
      injectSignupConfirmationFragment(arg0);
    }

    @CanIgnoreReturnValue
    private SignupConfirmationFragment injectSignupConfirmationFragment(
        SignupConfirmationFragment instance) {
      SignupConfirmationFragment_MembersInjector.injectMAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }
  }

  private static final class ViewWithFragmentCImpl extends Default_HiltComponents.ViewWithFragmentC {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends Default_HiltComponents.FragmentC {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private Provider<MainSettingsPresenter> mainSettingsPresenterProvider;

    private Provider<MainSettingsContract.Presenter> provideMainSettingsPresenterProvider;

    private Provider<PrivacySettingsPresenter> privacySettingsPresenterProvider;

    private Provider<PrivacySettingsContract.Presenter> providePrivacySettingsPresenterProvider;

    private FragmentCImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;

      initialize(fragmentParam);

    }

    private LocationUtils locationUtils() {
      return new LocationUtils(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));
    }

    private DateUtils dateUtils() {
      return new DateUtils(AppConfigModule_ProvideDefaultLocaleFactory.provideDefaultLocale(singletonC.appConfigModule), singletonC.provideCrashLoggingProvider.get());
    }

    private FeatureAnnouncementRepository featureAnnouncementRepository() {
      return new FeatureAnnouncementRepository(singletonC.whatsNewStoreProvider.get(), singletonC.buildConfigWrapperProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final Fragment fragmentParam) {
      this.mainSettingsPresenterProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, 0);
      this.provideMainSettingsPresenterProvider = DoubleCheck.provider((Provider) mainSettingsPresenterProvider);
      this.privacySettingsPresenterProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, 1);
      this.providePrivacySettingsPresenterProvider = DoubleCheck.provider((Provider) privacySettingsPresenterProvider);
    }

    @Override
    public void injectAnalyticsFragment(AnalyticsFragment arg0) {
    }

    @Override
    public void injectAztecEditorFragment(AztecEditorFragment arg0) {
    }

    @Override
    public void injectCardReaderConnectDialogFragment(CardReaderConnectDialogFragment arg0) {
      injectCardReaderConnectDialogFragment2(arg0);
    }

    @Override
    public void injectCardReaderDetailFragment(CardReaderDetailFragment arg0) {
    }

    @Override
    public void injectCardReaderHubFragment(CardReaderHubFragment arg0) {
    }

    @Override
    public void injectCardReaderManualsFragment(CardReaderManualsFragment arg0) {
    }

    @Override
    public void injectCardReaderOnboardingFragment(CardReaderOnboardingFragment arg0) {
    }

    @Override
    public void injectCardReaderWelcomeDialogFragment(CardReaderWelcomeDialogFragment arg0) {
    }

    @Override
    public void injectCardReaderPaymentDialogFragment(CardReaderPaymentDialogFragment arg0) {
      injectCardReaderPaymentDialogFragment2(arg0);
    }

    @Override
    public void injectReceiptPreviewFragment(ReceiptPreviewFragment arg0) {
      injectReceiptPreviewFragment2(arg0);
    }

    @Override
    public void injectCardReaderStatusCheckerDialogFragment(
        CardReaderStatusCheckerDialogFragment arg0) {
    }

    @Override
    public void injectCardReaderTutorialDialogFragment(CardReaderTutorialDialogFragment arg0) {
      injectCardReaderTutorialDialogFragment2(arg0);
    }

    @Override
    public void injectCardReaderUpdateDialogFragment(CardReaderUpdateDialogFragment arg0) {
    }

    @Override
    public void injectUserEligibilityErrorFragment(UserEligibilityErrorFragment arg0) {
      injectUserEligibilityErrorFragment2(arg0);
    }

    @Override
    public void injectSimpleTextEditorFragment(SimpleTextEditorFragment arg0) {
    }

    @Override
    public void injectWPComWebViewFragment(WPComWebViewFragment arg0) {
      injectWPComWebViewFragment2(arg0);
    }

    @Override
    public void injectCouponListFragment(CouponListFragment arg0) {
      injectCouponListFragment2(arg0);
    }

    @Override
    public void injectCouponDetailsFragment(CouponDetailsFragment arg0) {
      injectCouponDetailsFragment2(arg0);
    }

    @Override
    public void injectCouponRestrictionsFragment(CouponRestrictionsFragment arg0) {
    }

    @Override
    public void injectEditCouponFragment(EditCouponFragment arg0) {
      injectEditCouponFragment2(arg0);
    }

    @Override
    public void injectEmailRestrictionFragment(EmailRestrictionFragment arg0) {
    }

    @Override
    public void injectInboxFragment(InboxFragment arg0) {
      injectInboxFragment2(arg0);
    }

    @Override
    public void injectJetpackBenefitsDialog(JetpackBenefitsDialog arg0) {
    }

    @Override
    public void injectJetpackInstallProgressDialog(JetpackInstallProgressDialog arg0) {
      injectJetpackInstallProgressDialog2(arg0);
    }

    @Override
    public void injectJetpackInstallStartDialog(JetpackInstallStartDialog arg0) {
      injectJetpackInstallStartDialog2(arg0);
    }

    @Override
    public void injectLoginDiscoveryErrorFragment(LoginDiscoveryErrorFragment arg0) {
      injectLoginDiscoveryErrorFragment2(arg0);
    }

    @Override
    public void injectLoginEmailHelpDialogFragment(LoginEmailHelpDialogFragment arg0) {
      injectLoginEmailHelpDialogFragment2(arg0);
    }

    @Override
    public void injectLoginNoJetpackFragment(LoginNoJetpackFragment arg0) {
    }

    @Override
    public void injectLoginNoWPcomAccountFoundFragment(LoginNoWPcomAccountFoundFragment arg0) {
      injectLoginNoWPcomAccountFoundFragment2(arg0);
    }

    @Override
    public void injectLoginPrologueFragment(LoginPrologueFragment arg0) {
      injectLoginPrologueFragment2(arg0);
    }

    @Override
    public void injectLoginSiteCheckErrorFragment(LoginSiteCheckErrorFragment arg0) {
      injectLoginSiteCheckErrorFragment2(arg0);
    }

    @Override
    public void injectMagicLinkInterceptFragment(MagicLinkInterceptFragment arg0) {
    }

    @Override
    public void injectMediaUploadErrorListFragment(MediaUploadErrorListFragment arg0) {
    }

    @Override
    public void injectMoreMenuFragment(MoreMenuFragment arg0) {
      injectMoreMenuFragment2(arg0);
    }

    @Override
    public void injectMyStoreFragment(MyStoreFragment arg0) {
      injectMyStoreFragment2(arg0);
    }

    @Override
    public void injectOrderCreationCustomerAddFragment(OrderCreationCustomerAddFragment arg0) {
      injectOrderCreationCustomerAddFragment2(arg0);
    }

    @Override
    public void injectOrderCreationFormFragment(OrderCreationFormFragment arg0) {
      injectOrderCreationFormFragment2(arg0);
    }

    @Override
    public void injectOrderCreationFeeFragment(OrderCreationFeeFragment arg0) {
      injectOrderCreationFeeFragment2(arg0);
    }

    @Override
    public void injectOrderCreationProductDetailsFragment(
        OrderCreationProductDetailsFragment arg0) {
      injectOrderCreationProductDetailsFragment2(arg0);
    }

    @Override
    public void injectOrderCreationProductSelectionFragment(
        OrderCreationProductSelectionFragment arg0) {
      injectOrderCreationProductSelectionFragment2(arg0);
    }

    @Override
    public void injectOrderCreationShippingFragment(OrderCreationShippingFragment arg0) {
      injectOrderCreationShippingFragment2(arg0);
    }

    @Override
    public void injectOrderCreationVariationSelectionFragment(
        OrderCreationVariationSelectionFragment arg0) {
    }

    @Override
    public void injectOrderDetailFragment(OrderDetailFragment arg0) {
      injectOrderDetailFragment2(arg0);
    }

    @Override
    public void injectPrintingInstructionsFragment(PrintingInstructionsFragment arg0) {
    }

    @Override
    public void injectCustomerOrderNoteEditingFragment(CustomerOrderNoteEditingFragment arg0) {
      injectCustomerOrderNoteEditingFragment2(arg0);
    }

    @Override
    public void injectBaseAddressEditingFragment(BaseAddressEditingFragment arg0) {
      injectBaseAddressEditingFragment2(arg0);
    }

    @Override
    public void injectOrderFilterCategoriesFragment(OrderFilterCategoriesFragment arg0) {
    }

    @Override
    public void injectOrderFilterOptionsFragment(OrderFilterOptionsFragment arg0) {
    }

    @Override
    public void injectOrderFulfillFragment(OrderFulfillFragment arg0) {
      injectOrderFulfillFragment2(arg0);
    }

    @Override
    public void injectOrderListFragment(OrderListFragment arg0) {
      injectOrderListFragment2(arg0);
    }

    @Override
    public void injectAddOrderNoteFragment(AddOrderNoteFragment arg0) {
      injectAddOrderNoteFragment2(arg0);
    }

    @Override
    public void injectPrintShippingLabelCustomsFormFragment(
        PrintShippingLabelCustomsFormFragment arg0) {
      injectPrintShippingLabelCustomsFormFragment2(arg0);
    }

    @Override
    public void injectPrintShippingLabelFragment(PrintShippingLabelFragment arg0) {
      injectPrintShippingLabelFragment2(arg0);
    }

    @Override
    public void injectShippingLabelRefundFragment(ShippingLabelRefundFragment arg0) {
      injectShippingLabelRefundFragment2(arg0);
    }

    @Override
    public void injectCreateShippingLabelFragment(CreateShippingLabelFragment arg0) {
      injectCreateShippingLabelFragment2(arg0);
    }

    @Override
    public void injectEditShippingLabelAddressFragment(EditShippingLabelAddressFragment arg0) {
      injectEditShippingLabelAddressFragment2(arg0);
    }

    @Override
    public void injectEditShippingLabelPackagesFragment(EditShippingLabelPackagesFragment arg0) {
      injectEditShippingLabelPackagesFragment2(arg0);
    }

    @Override
    public void injectEditShippingLabelPaymentFragment(EditShippingLabelPaymentFragment arg0) {
      injectEditShippingLabelPaymentFragment2(arg0);
    }

    @Override
    public void injectMoveShippingItemDialog(MoveShippingItemDialog arg0) {
    }

    @Override
    public void injectShippingCarrierRatesFragment(ShippingCarrierRatesFragment arg0) {
      injectShippingCarrierRatesFragment2(arg0);
    }

    @Override
    public void injectShippingCustomsFragment(ShippingCustomsFragment arg0) {
      injectShippingCustomsFragment2(arg0);
    }

    @Override
    public void injectShippingLabelAddressSuggestionFragment(
        ShippingLabelAddressSuggestionFragment arg0) {
      injectShippingLabelAddressSuggestionFragment2(arg0);
    }

    @Override
    public void injectShippingLabelCreateCustomPackageFragment(
        ShippingLabelCreateCustomPackageFragment arg0) {
      injectShippingLabelCreateCustomPackageFragment2(arg0);
    }

    @Override
    public void injectShippingLabelCreatePackageFragment(ShippingLabelCreatePackageFragment arg0) {
      injectShippingLabelCreatePackageFragment2(arg0);
    }

    @Override
    public void injectShippingLabelCreateServicePackageFragment(
        ShippingLabelCreateServicePackageFragment arg0) {
      injectShippingLabelCreateServicePackageFragment2(arg0);
    }

    @Override
    public void injectShippingPackageSelectorFragment(ShippingPackageSelectorFragment arg0) {
      injectShippingPackageSelectorFragment2(arg0);
    }

    @Override
    public void injectSimplePaymentsDialog(SimplePaymentsDialog arg0) {
      injectSimplePaymentsDialog2(arg0);
    }

    @Override
    public void injectSimplePaymentsFragment(SimplePaymentsFragment arg0) {
      injectSimplePaymentsFragment2(arg0);
    }

    @Override
    public void injectTakePaymentFragment(TakePaymentFragment arg0) {
      injectTakePaymentFragment2(arg0);
    }

    @Override
    public void injectAddOrderShipmentTrackingFragment(AddOrderShipmentTrackingFragment arg0) {
      injectAddOrderShipmentTrackingFragment2(arg0);
    }

    @Override
    public void injectAddOrderTrackingProviderListFragment(
        AddOrderTrackingProviderListFragment arg0) {
      injectAddOrderTrackingProviderListFragment2(arg0);
    }

    @Override
    public void injectMainSettingsFragment(MainSettingsFragment arg0) {
      injectMainSettingsFragment2(arg0);
    }

    @Override
    public void injectPrivacySettingsFragment(PrivacySettingsFragment arg0) {
      injectPrivacySettingsFragment2(arg0);
    }

    @Override
    public void injectGroupedProductListFragment(GroupedProductListFragment arg0) {
      injectGroupedProductListFragment2(arg0);
    }

    @Override
    public void injectLinkedProductsFragment(LinkedProductsFragment arg0) {
      injectLinkedProductsFragment2(arg0);
    }

    @Override
    public void injectProductDetailBottomSheetFragment(ProductDetailBottomSheetFragment arg0) {
    }

    @Override
    public void injectProductDetailFragment(ProductDetailFragment arg0) {
      injectProductDetailFragment2(arg0);
    }

    @Override
    public void injectProductExternalLinkFragment(ProductExternalLinkFragment arg0) {
      injectProductExternalLinkFragment2(arg0);
    }

    @Override
    public void injectProductFilterListFragment(ProductFilterListFragment arg0) {
    }

    @Override
    public void injectProductFilterOptionListFragment(ProductFilterOptionListFragment arg0) {
    }

    @Override
    public void injectProductImageViewerFragment(ProductImageViewerFragment arg0) {
      injectProductImageViewerFragment2(arg0);
    }

    @Override
    public void injectProductImagesFragment(ProductImagesFragment arg0) {
      injectProductImagesFragment2(arg0);
    }

    @Override
    public void injectProductInventoryFragment(ProductInventoryFragment arg0) {
      injectProductInventoryFragment2(arg0);
    }

    @Override
    public void injectProductListFragment(ProductListFragment arg0) {
      injectProductListFragment2(arg0);
    }

    @Override
    public void injectProductPricingFragment(ProductPricingFragment arg0) {
      injectProductPricingFragment2(arg0);
    }

    @Override
    public void injectProductSelectionListFragment(ProductSelectionListFragment arg0) {
      injectProductSelectionListFragment2(arg0);
    }

    @Override
    public void injectProductShippingClassFragment(ProductShippingClassFragment arg0) {
    }

    @Override
    public void injectProductShippingFragment(ProductShippingFragment arg0) {
      injectProductShippingFragment2(arg0);
    }

    @Override
    public void injectProductSortingFragment(ProductSortingFragment arg0) {
      injectProductSortingFragment2(arg0);
    }

    @Override
    public void injectProductTypesBottomSheetFragment(ProductTypesBottomSheetFragment arg0) {
      injectProductTypesBottomSheetFragment2(arg0);
    }

    @Override
    public void injectOrderedAddonFragment(OrderedAddonFragment arg0) {
      injectOrderedAddonFragment2(arg0);
    }

    @Override
    public void injectProductAddonsFragment(ProductAddonsFragment arg0) {
      injectProductAddonsFragment2(arg0);
    }

    @Override
    public void injectAddProductCategoryFragment(AddProductCategoryFragment arg0) {
      injectAddProductCategoryFragment2(arg0);
    }

    @Override
    public void injectParentCategoryListFragment(ParentCategoryListFragment arg0) {
      injectParentCategoryListFragment2(arg0);
    }

    @Override
    public void injectProductCategoriesFragment(ProductCategoriesFragment arg0) {
      injectProductCategoriesFragment2(arg0);
    }

    @Override
    public void injectProductCategorySelectorFragment(ProductCategorySelectorFragment arg0) {
      injectProductCategorySelectorFragment2(arg0);
    }

    @Override
    public void injectAddProductDownloadBottomSheetFragment(
        AddProductDownloadBottomSheetFragment arg0) {
      injectAddProductDownloadBottomSheetFragment2(arg0);
    }

    @Override
    public void injectProductDownloadDetailsFragment(ProductDownloadDetailsFragment arg0) {
      injectProductDownloadDetailsFragment2(arg0);
    }

    @Override
    public void injectProductDownloadsFragment(ProductDownloadsFragment arg0) {
      injectProductDownloadsFragment2(arg0);
    }

    @Override
    public void injectProductDownloadsSettingsFragment(ProductDownloadsSettingsFragment arg0) {
      injectProductDownloadsSettingsFragment2(arg0);
    }

    @Override
    public void injectProductReviewsFragment(ProductReviewsFragment arg0) {
      injectProductReviewsFragment2(arg0);
    }

    @Override
    public void injectProductSelectorFragment(ProductSelectorFragment arg0) {
      injectProductSelectorFragment2(arg0);
    }

    @Override
    public void injectProductSettingsFragment(ProductSettingsFragment arg0) {
      injectProductSettingsFragment2(arg0);
    }

    @Override
    public void injectProductTagsFragment(ProductTagsFragment arg0) {
      injectProductTagsFragment2(arg0);
    }

    @Override
    public void injectVariationDetailFragment(VariationDetailFragment arg0) {
      injectVariationDetailFragment2(arg0);
    }

    @Override
    public void injectVariationListFragment(VariationListFragment arg0) {
      injectVariationListFragment2(arg0);
    }

    @Override
    public void injectVariationsBulkUpdateAttrPickerDialog(
        VariationsBulkUpdateAttrPickerDialog arg0) {
      injectVariationsBulkUpdateAttrPickerDialog2(arg0);
    }

    @Override
    public void injectVariationsBulkUpdatePriceFragment(VariationsBulkUpdatePriceFragment arg0) {
      injectVariationsBulkUpdatePriceFragment2(arg0);
    }

    @Override
    public void injectAddAttributeFragment(AddAttributeFragment arg0) {
      injectAddAttributeFragment2(arg0);
    }

    @Override
    public void injectAddAttributeTermsFragment(AddAttributeTermsFragment arg0) {
      injectAddAttributeTermsFragment2(arg0);
    }

    @Override
    public void injectAttributeListFragment(AttributeListFragment arg0) {
      injectAttributeListFragment2(arg0);
    }

    @Override
    public void injectAttributesAddedFragment(AttributesAddedFragment arg0) {
      injectAttributesAddedFragment2(arg0);
    }

    @Override
    public void injectEditVariationAttributesFragment(EditVariationAttributesFragment arg0) {
    }

    @Override
    public void injectVariationSelectorFragment(VariationSelectorFragment arg0) {
    }

    @Override
    public void injectIssueRefundFragment(IssueRefundFragment arg0) {
      injectIssueRefundFragment2(arg0);
    }

    @Override
    public void injectRefundAmountDialog(RefundAmountDialog arg0) {
      injectRefundAmountDialog2(arg0);
    }

    @Override
    public void injectRefundByAmountFragment(RefundByAmountFragment arg0) {
      injectRefundByAmountFragment2(arg0);
    }

    @Override
    public void injectRefundByItemsFragment(RefundByItemsFragment arg0) {
      injectRefundByItemsFragment2(arg0);
    }

    @Override
    public void injectRefundConfirmationDialog(RefundConfirmationDialog arg0) {
    }

    @Override
    public void injectRefundDetailFragment(RefundDetailFragment arg0) {
      injectRefundDetailFragment2(arg0);
    }

    @Override
    public void injectRefundItemsPickerDialog(RefundItemsPickerDialog arg0) {
    }

    @Override
    public void injectRefundSummaryFragment(RefundSummaryFragment arg0) {
      injectRefundSummaryFragment2(arg0);
    }

    @Override
    public void injectReviewDetailFragment(ReviewDetailFragment arg0) {
      injectReviewDetailFragment2(arg0);
    }

    @Override
    public void injectReviewListFragment(ReviewListFragment arg0) {
      injectReviewListFragment2(arg0);
    }

    @Override
    public void injectSearchFilterFragment(SearchFilterFragment arg0) {
    }

    @Override
    public void injectInstallWcShippingFlowFragment(InstallWcShippingFlowFragment arg0) {
    }

    @Override
    public void injectSitePickerFragment(SitePickerFragment arg0) {
    }

    @Override
    public void injectFeatureAnnouncementDialogFragment(FeatureAnnouncementDialogFragment arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @Override
    public void injectMediaPickerFragment(MediaPickerFragment arg0) {
      injectMediaPickerFragment2(arg0);
    }

    @Override
    public void injectMediaViewerFragment(MediaViewerFragment arg0) {
    }

    @CanIgnoreReturnValue
    private CardReaderConnectDialogFragment injectCardReaderConnectDialogFragment2(
        CardReaderConnectDialogFragment instance) {
      CardReaderConnectDialogFragment_MembersInjector.injectLocationUtils(instance, locationUtils());
      return instance;
    }

    @CanIgnoreReturnValue
    private CardReaderPaymentDialogFragment injectCardReaderPaymentDialogFragment2(
        CardReaderPaymentDialogFragment instance) {
      CardReaderPaymentDialogFragment_MembersInjector.injectPrintHtmlHelper(instance, new PrintHtmlHelper());
      CardReaderPaymentDialogFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ReceiptPreviewFragment injectReceiptPreviewFragment2(ReceiptPreviewFragment instance) {
      ReceiptPreviewFragment_MembersInjector.injectPrintHtmlHelper(instance, new PrintHtmlHelper());
      ReceiptPreviewFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private CardReaderTutorialDialogFragment injectCardReaderTutorialDialogFragment2(
        CardReaderTutorialDialogFragment instance) {
      CardReaderTutorialDialogFragment_MembersInjector.injectAppPrefs(instance, singletonC.providesAppPrefsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private UserEligibilityErrorFragment injectUserEligibilityErrorFragment2(
        UserEligibilityErrorFragment instance) {
      UserEligibilityErrorFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private WPComWebViewFragment injectWPComWebViewFragment2(WPComWebViewFragment instance) {
      WPComWebViewFragment_MembersInjector.injectAccountStore(instance, singletonC.accountStoreProvider.get());
      WPComWebViewFragment_MembersInjector.injectUserAgent(instance, singletonC.userAgent());
      return instance;
    }

    @CanIgnoreReturnValue
    private CouponListFragment injectCouponListFragment2(CouponListFragment instance) {
      CouponListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private CouponDetailsFragment injectCouponDetailsFragment2(CouponDetailsFragment instance) {
      CouponDetailsFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private EditCouponFragment injectEditCouponFragment2(EditCouponFragment instance) {
      EditCouponFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private InboxFragment injectInboxFragment2(InboxFragment instance) {
      InboxFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private JetpackInstallProgressDialog injectJetpackInstallProgressDialog2(
        JetpackInstallProgressDialog instance) {
      JetpackInstallProgressDialog_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private JetpackInstallStartDialog injectJetpackInstallStartDialog2(
        JetpackInstallStartDialog instance) {
      JetpackInstallStartDialog_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginDiscoveryErrorFragment injectLoginDiscoveryErrorFragment2(
        LoginDiscoveryErrorFragment instance) {
      LoginDiscoveryErrorFragment_MembersInjector.injectUnifiedLoginTracker(instance, singletonC.unifiedLoginTrackerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginEmailHelpDialogFragment injectLoginEmailHelpDialogFragment2(
        LoginEmailHelpDialogFragment instance) {
      LoginEmailHelpDialogFragment_MembersInjector.injectAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginNoWPcomAccountFoundFragment injectLoginNoWPcomAccountFoundFragment2(
        LoginNoWPcomAccountFoundFragment instance) {
      LoginNoWPcomAccountFoundFragment_MembersInjector.injectUnifiedLoginTracker(instance, singletonC.unifiedLoginTrackerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginPrologueFragment injectLoginPrologueFragment2(LoginPrologueFragment instance) {
      LoginPrologueFragment_MembersInjector.injectUnifiedLoginTracker(instance, singletonC.unifiedLoginTrackerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginSiteCheckErrorFragment injectLoginSiteCheckErrorFragment2(
        LoginSiteCheckErrorFragment instance) {
      LoginSiteCheckErrorFragment_MembersInjector.injectUnifiedLoginTracker(instance, singletonC.unifiedLoginTrackerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MoreMenuFragment injectMoreMenuFragment2(MoreMenuFragment instance) {
      MoreMenuFragment_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MyStoreFragment injectMyStoreFragment2(MyStoreFragment instance) {
      MyStoreFragment_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      MyStoreFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      MyStoreFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      MyStoreFragment_MembersInjector.injectDateUtils(instance, dateUtils());
      MyStoreFragment_MembersInjector.injectUsageTracksEventEmitter(instance, singletonC.myStoreStatsUsageTracksEventEmitterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderCreationCustomerAddFragment injectOrderCreationCustomerAddFragment2(
        OrderCreationCustomerAddFragment instance) {
      OrderCreationCustomerAddFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderCreationFormFragment injectOrderCreationFormFragment2(
        OrderCreationFormFragment instance) {
      OrderCreationFormFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      OrderCreationFormFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderCreationFeeFragment injectOrderCreationFeeFragment2(
        OrderCreationFeeFragment instance) {
      OrderCreationFeeFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderCreationProductDetailsFragment injectOrderCreationProductDetailsFragment2(
        OrderCreationProductDetailsFragment instance) {
      OrderCreationProductDetailsFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      OrderCreationProductDetailsFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderCreationProductSelectionFragment injectOrderCreationProductSelectionFragment2(
        OrderCreationProductSelectionFragment instance) {
      OrderCreationProductSelectionFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderCreationShippingFragment injectOrderCreationShippingFragment2(
        OrderCreationShippingFragment instance) {
      OrderCreationShippingFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderDetailFragment injectOrderDetailFragment2(OrderDetailFragment instance) {
      OrderDetailFragment_MembersInjector.injectNavigator(instance, singletonC.orderNavigatorProvider.get());
      OrderDetailFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      OrderDetailFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      OrderDetailFragment_MembersInjector.injectProductImageMap(instance, singletonC.productImageMapProvider.get());
      OrderDetailFragment_MembersInjector.injectDateUtils(instance, dateUtils());
      OrderDetailFragment_MembersInjector.injectCardReaderManager(instance, singletonC.provideCardReaderManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private CustomerOrderNoteEditingFragment injectCustomerOrderNoteEditingFragment2(
        CustomerOrderNoteEditingFragment instance) {
      BaseOrderEditingFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private BaseAddressEditingFragment injectBaseAddressEditingFragment2(
        BaseAddressEditingFragment instance) {
      BaseOrderEditingFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderFulfillFragment injectOrderFulfillFragment2(OrderFulfillFragment instance) {
      OrderFulfillFragment_MembersInjector.injectNavigator(instance, singletonC.orderNavigatorProvider.get());
      OrderFulfillFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      OrderFulfillFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      OrderFulfillFragment_MembersInjector.injectProductImageMap(instance, singletonC.productImageMapProvider.get());
      OrderFulfillFragment_MembersInjector.injectDateUtils(instance, dateUtils());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderListFragment injectOrderListFragment2(OrderListFragment instance) {
      OrderListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      OrderListFragment_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      OrderListFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddOrderNoteFragment injectAddOrderNoteFragment2(AddOrderNoteFragment instance) {
      AddOrderNoteFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PrintShippingLabelCustomsFormFragment injectPrintShippingLabelCustomsFormFragment2(
        PrintShippingLabelCustomsFormFragment instance) {
      PrintShippingLabelCustomsFormFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PrintShippingLabelFragment injectPrintShippingLabelFragment2(
        PrintShippingLabelFragment instance) {
      PrintShippingLabelFragment_MembersInjector.injectNavigator(instance, singletonC.orderNavigatorProvider.get());
      PrintShippingLabelFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingLabelRefundFragment injectShippingLabelRefundFragment2(
        ShippingLabelRefundFragment instance) {
      ShippingLabelRefundFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ShippingLabelRefundFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private CreateShippingLabelFragment injectCreateShippingLabelFragment2(
        CreateShippingLabelFragment instance) {
      CreateShippingLabelFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      CreateShippingLabelFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private EditShippingLabelAddressFragment injectEditShippingLabelAddressFragment2(
        EditShippingLabelAddressFragment instance) {
      EditShippingLabelAddressFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private EditShippingLabelPackagesFragment injectEditShippingLabelPackagesFragment2(
        EditShippingLabelPackagesFragment instance) {
      EditShippingLabelPackagesFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private EditShippingLabelPaymentFragment injectEditShippingLabelPaymentFragment2(
        EditShippingLabelPaymentFragment instance) {
      EditShippingLabelPaymentFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingCarrierRatesFragment injectShippingCarrierRatesFragment2(
        ShippingCarrierRatesFragment instance) {
      ShippingCarrierRatesFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ShippingCarrierRatesFragment_MembersInjector.injectResourceProvider(instance, singletonC.resourceProvider());
      ShippingCarrierRatesFragment_MembersInjector.injectDateUtils(instance, dateUtils());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingCustomsFragment injectShippingCustomsFragment2(
        ShippingCustomsFragment instance) {
      ShippingCustomsFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingLabelAddressSuggestionFragment injectShippingLabelAddressSuggestionFragment2(
        ShippingLabelAddressSuggestionFragment instance) {
      ShippingLabelAddressSuggestionFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingLabelCreateCustomPackageFragment injectShippingLabelCreateCustomPackageFragment2(
        ShippingLabelCreateCustomPackageFragment instance) {
      ShippingLabelCreateCustomPackageFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingLabelCreatePackageFragment injectShippingLabelCreatePackageFragment2(
        ShippingLabelCreatePackageFragment instance) {
      ShippingLabelCreatePackageFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingLabelCreateServicePackageFragment injectShippingLabelCreateServicePackageFragment2(
        ShippingLabelCreateServicePackageFragment instance) {
      ShippingLabelCreateServicePackageFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ShippingPackageSelectorFragment injectShippingPackageSelectorFragment2(
        ShippingPackageSelectorFragment instance) {
      ShippingPackageSelectorFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private SimplePaymentsDialog injectSimplePaymentsDialog2(SimplePaymentsDialog instance) {
      SimplePaymentsDialog_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      SimplePaymentsDialog_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private SimplePaymentsFragment injectSimplePaymentsFragment2(SimplePaymentsFragment instance) {
      SimplePaymentsFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      SimplePaymentsFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private TakePaymentFragment injectTakePaymentFragment2(TakePaymentFragment instance) {
      TakePaymentFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddOrderShipmentTrackingFragment injectAddOrderShipmentTrackingFragment2(
        AddOrderShipmentTrackingFragment instance) {
      AddOrderShipmentTrackingFragment_MembersInjector.injectNetworkStatus(instance, singletonC.provideNetworkStatusProvider.get());
      AddOrderShipmentTrackingFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      AddOrderShipmentTrackingFragment_MembersInjector.injectNavigator(instance, singletonC.orderNavigatorProvider.get());
      AddOrderShipmentTrackingFragment_MembersInjector.injectDateUtils(instance, dateUtils());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddOrderTrackingProviderListFragment injectAddOrderTrackingProviderListFragment2(
        AddOrderTrackingProviderListFragment instance) {
      AddOrderTrackingProviderListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainSettingsFragment injectMainSettingsFragment2(MainSettingsFragment instance) {
      MainSettingsFragment_MembersInjector.injectPresenter(instance, provideMainSettingsPresenterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PrivacySettingsFragment injectPrivacySettingsFragment2(
        PrivacySettingsFragment instance) {
      PrivacySettingsFragment_MembersInjector.injectPresenter(instance, providePrivacySettingsPresenterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private GroupedProductListFragment injectGroupedProductListFragment2(
        GroupedProductListFragment instance) {
      GroupedProductListFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      GroupedProductListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      GroupedProductListFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private LinkedProductsFragment injectLinkedProductsFragment2(LinkedProductsFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductDetailFragment injectProductDetailFragment2(ProductDetailFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ProductDetailFragment_MembersInjector.injectCrashLogging(instance, singletonC.provideCrashLoggingProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductExternalLinkFragment injectProductExternalLinkFragment2(
        ProductExternalLinkFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductImageViewerFragment injectProductImageViewerFragment2(
        ProductImageViewerFragment instance) {
      ProductImageViewerFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductImagesFragment injectProductImagesFragment2(ProductImagesFragment instance) {
      BaseProductEditorFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      BaseProductEditorFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ProductImagesFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      ProductImagesFragment_MembersInjector.injectMediaPickerUtils(instance, singletonC.mediaPickerUtilsProvider.get());
      ProductImagesFragment_MembersInjector.injectMediaPickerSetupFactory(instance, new MediaPickerSetupFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductInventoryFragment injectProductInventoryFragment2(
        ProductInventoryFragment instance) {
      BaseProductEditorFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      BaseProductEditorFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductListFragment injectProductListFragment2(ProductListFragment instance) {
      ProductListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ProductListFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductPricingFragment injectProductPricingFragment2(ProductPricingFragment instance) {
      BaseProductEditorFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      BaseProductEditorFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ProductPricingFragment_MembersInjector.injectDateUtils(instance, dateUtils());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductSelectionListFragment injectProductSelectionListFragment2(
        ProductSelectionListFragment instance) {
      ProductSelectionListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ProductSelectionListFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductShippingFragment injectProductShippingFragment2(
        ProductShippingFragment instance) {
      BaseProductEditorFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      BaseProductEditorFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductSortingFragment injectProductSortingFragment2(ProductSortingFragment instance) {
      ProductSortingFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductTypesBottomSheetFragment injectProductTypesBottomSheetFragment2(
        ProductTypesBottomSheetFragment instance) {
      ProductTypesBottomSheetFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OrderedAddonFragment injectOrderedAddonFragment2(OrderedAddonFragment instance) {
      OrderedAddonFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductAddonsFragment injectProductAddonsFragment2(ProductAddonsFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ProductAddonsFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddProductCategoryFragment injectAddProductCategoryFragment2(
        AddProductCategoryFragment instance) {
      AddProductCategoryFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ParentCategoryListFragment injectParentCategoryListFragment2(
        ParentCategoryListFragment instance) {
      ParentCategoryListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductCategoriesFragment injectProductCategoriesFragment2(
        ProductCategoriesFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductCategorySelectorFragment injectProductCategorySelectorFragment2(
        ProductCategorySelectorFragment instance) {
      ProductCategorySelectorFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddProductDownloadBottomSheetFragment injectAddProductDownloadBottomSheetFragment2(
        AddProductDownloadBottomSheetFragment instance) {
      AddProductDownloadBottomSheetFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      AddProductDownloadBottomSheetFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      AddProductDownloadBottomSheetFragment_MembersInjector.injectMediaPickerSetupFactory(instance, new MediaPickerSetupFactory());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductDownloadDetailsFragment injectProductDownloadDetailsFragment2(
        ProductDownloadDetailsFragment instance) {
      ProductDownloadDetailsFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductDownloadsFragment injectProductDownloadsFragment2(
        ProductDownloadsFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductDownloadsSettingsFragment injectProductDownloadsSettingsFragment2(
        ProductDownloadsSettingsFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductReviewsFragment injectProductReviewsFragment2(ProductReviewsFragment instance) {
      ProductReviewsFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductSelectorFragment injectProductSelectorFragment2(
        ProductSelectorFragment instance) {
      ProductSelectorFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductSettingsFragment injectProductSettingsFragment2(
        ProductSettingsFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ProductTagsFragment injectProductTagsFragment2(ProductTagsFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private VariationDetailFragment injectVariationDetailFragment2(
        VariationDetailFragment instance) {
      VariationDetailFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      VariationDetailFragment_MembersInjector.injectNavigator(instance, singletonC.variationNavigatorProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private VariationListFragment injectVariationListFragment2(VariationListFragment instance) {
      VariationListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private VariationsBulkUpdateAttrPickerDialog injectVariationsBulkUpdateAttrPickerDialog2(
        VariationsBulkUpdateAttrPickerDialog instance) {
      VariationsBulkUpdateAttrPickerDialog_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private VariationsBulkUpdatePriceFragment injectVariationsBulkUpdatePriceFragment2(
        VariationsBulkUpdatePriceFragment instance) {
      VariationsBulkUpdatePriceFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      VariationsBulkUpdatePriceFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddAttributeFragment injectAddAttributeFragment2(AddAttributeFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AddAttributeTermsFragment injectAddAttributeTermsFragment2(
        AddAttributeTermsFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AttributeListFragment injectAttributeListFragment2(AttributeListFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AttributesAddedFragment injectAttributesAddedFragment2(
        AttributesAddedFragment instance) {
      BaseProductFragment_MembersInjector.injectNavigator(instance, singletonC.productNavigatorProvider.get());
      BaseProductFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private IssueRefundFragment injectIssueRefundFragment2(IssueRefundFragment instance) {
      IssueRefundFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RefundAmountDialog injectRefundAmountDialog2(RefundAmountDialog instance) {
      RefundAmountDialog_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RefundByAmountFragment injectRefundByAmountFragment2(RefundByAmountFragment instance) {
      RefundByAmountFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RefundByItemsFragment injectRefundByItemsFragment2(RefundByItemsFragment instance) {
      RefundByItemsFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      RefundByItemsFragment_MembersInjector.injectImageMap(instance, singletonC.productImageMapProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RefundDetailFragment injectRefundDetailFragment2(RefundDetailFragment instance) {
      RefundDetailFragment_MembersInjector.injectCurrencyFormatter(instance, singletonC.currencyFormatterProvider.get());
      RefundDetailFragment_MembersInjector.injectImageMap(instance, singletonC.productImageMapProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RefundSummaryFragment injectRefundSummaryFragment2(RefundSummaryFragment instance) {
      RefundSummaryFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ReviewDetailFragment injectReviewDetailFragment2(ReviewDetailFragment instance) {
      ReviewDetailFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ReviewDetailFragment_MembersInjector.injectProductImageMap(instance, singletonC.productImageMapProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private ReviewListFragment injectReviewListFragment2(ReviewListFragment instance) {
      ReviewListFragment_MembersInjector.injectUiMessageResolver(instance, activityCImpl.mainUIMessageResolverProvider.get());
      ReviewListFragment_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MediaPickerFragment injectMediaPickerFragment2(MediaPickerFragment instance) {
      MediaPickerFragment_MembersInjector.injectLog(instance, new MediaPickerLogger());
      MediaPickerFragment_MembersInjector.injectMediaPickerUtils(instance, singletonC.mediaPickerUtilsProvider.get());
      MediaPickerFragment_MembersInjector.injectPermissionUtils(instance, singletonC.mediaPickerPermissionUtilsProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerDefault_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl;

      private final FragmentCImpl fragmentCImpl;

      private final int id;

      SwitchingProvider(DaggerDefault_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
          FragmentCImpl fragmentCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.activityCImpl = activityCImpl;
        this.fragmentCImpl = fragmentCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.woocommerce.android.ui.prefs.MainSettingsPresenter 
          return (T) new MainSettingsPresenter(singletonC.provideSelectedSiteProvider.get(), singletonC.accountStoreProvider.get(), singletonC.wooCommerceStoreProvider.get(), fragmentCImpl.featureAnnouncementRepository(), singletonC.buildConfigWrapperProvider.get());

          case 1: // com.woocommerce.android.ui.prefs.PrivacySettingsPresenter 
          return (T) new PrivacySettingsPresenter(singletonC.dispatcherProvider.get(), singletonC.accountStoreProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ViewCImpl extends Default_HiltComponents.ViewC {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    private ParameterRepository parameterRepository() {
      return new ParameterRepository(singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    @Override
    public void injectAnalyticsDateRangeCardView(AnalyticsDateRangeCardView arg0) {
    }

    @Override
    public void injectWCMaterialOutlinedCurrencyEditTextView(
        WCMaterialOutlinedCurrencyEditTextView arg0) {
      injectWCMaterialOutlinedCurrencyEditTextView2(arg0);
    }

    @CanIgnoreReturnValue
    private WCMaterialOutlinedCurrencyEditTextView injectWCMaterialOutlinedCurrencyEditTextView2(
        WCMaterialOutlinedCurrencyEditTextView instance) {
      WCMaterialOutlinedCurrencyEditTextView_MembersInjector.injectParameterRepository(instance, parameterRepository());
      return instance;
    }
  }

  private static final class ActivityCImpl extends Default_HiltComponents.ActivityC {
    private final Activity activity;

    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private Provider<LoginFragmentModule_Login2FaFragment.Login2FaFragmentSubcomponent.Factory> login2FaFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginEmailFragment.LoginEmailFragmentSubcomponent.Factory> loginEmailFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginEmailPasswordFragment.LoginEmailPasswordFragmentSubcomponent.Factory> loginEmailPasswordFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginGoogleFragment.LoginGoogleFragmentSubcomponent.Factory> loginGoogleFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginMagicLinkRequestFragment.LoginMagicLinkRequestFragmentSubcomponent.Factory> loginMagicLinkRequestFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginMagicLinkSentFragment.LoginMagicLinkSentFragmentSubcomponent.Factory> loginMagicLinkSentFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginSiteAddressFragment.LoginSiteAddressFragmentSubcomponent.Factory> loginSiteAddressFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginSiteAddressHelpDialogFragment.LoginSiteAddressHelpDialogFragmentSubcomponent.Factory> loginSiteAddressHelpDialogFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_LoginUsernamePasswordFragment.LoginUsernamePasswordFragmentSubcomponent.Factory> loginUsernamePasswordFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_SignupGoogleFragment.SignupGoogleFragmentSubcomponent.Factory> signupGoogleFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_SignupMagicLinkFragment.SignupMagicLinkFragmentSubcomponent.Factory> signupMagicLinkFragmentSubcomponentFactoryProvider;

    private Provider<LoginFragmentModule_SignupConfirmationScreen.SignupConfirmationFragmentSubcomponent.Factory> signupConfirmationFragmentSubcomponentFactoryProvider;

    private Provider<UrlUtils> urlUtilsProvider;

    private Provider<MainPresenter> mainPresenterProvider;

    private Provider<MainContract.Presenter> provideMainPresenterProvider;

    private Provider<MainUIMessageResolver> mainUIMessageResolverProvider;

    private Provider<AppSettingsPresenter> appSettingsPresenterProvider;

    private Provider<AppSettingsContract.Presenter> provideAppSettingsPresenterProvider;

    private ActivityCImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activity = activityParam;
      initialize(activityParam);

    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return ImmutableMap.<Class<?>, Provider<AndroidInjector.Factory<?>>>builderWithExpectedSize(14).put(MagicLinkInterceptActivity.class, ((Provider) singletonC.magicLinkInterceptActivitySubcomponentFactoryProvider)).put(LoginWpcomService.class, ((Provider) singletonC.loginWpcomServiceSubcomponentFactoryProvider)).put(Login2FaFragment.class, ((Provider) login2FaFragmentSubcomponentFactoryProvider)).put(LoginEmailFragment.class, ((Provider) loginEmailFragmentSubcomponentFactoryProvider)).put(LoginEmailPasswordFragment.class, ((Provider) loginEmailPasswordFragmentSubcomponentFactoryProvider)).put(LoginGoogleFragment.class, ((Provider) loginGoogleFragmentSubcomponentFactoryProvider)).put(LoginMagicLinkRequestFragment.class, ((Provider) loginMagicLinkRequestFragmentSubcomponentFactoryProvider)).put(LoginMagicLinkSentFragment.class, ((Provider) loginMagicLinkSentFragmentSubcomponentFactoryProvider)).put(LoginSiteAddressFragment.class, ((Provider) loginSiteAddressFragmentSubcomponentFactoryProvider)).put(LoginSiteAddressHelpDialogFragment.class, ((Provider) loginSiteAddressHelpDialogFragmentSubcomponentFactoryProvider)).put(LoginUsernamePasswordFragment.class, ((Provider) loginUsernamePasswordFragmentSubcomponentFactoryProvider)).put(SignupGoogleFragment.class, ((Provider) signupGoogleFragmentSubcomponentFactoryProvider)).put(SignupMagicLinkFragment.class, ((Provider) signupMagicLinkFragmentSubcomponentFactoryProvider)).put(SignupConfirmationFragment.class, ((Provider) signupConfirmationFragmentSubcomponentFactoryProvider)).build();
    }

    private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), ImmutableMap.<String, Provider<AndroidInjector.Factory<?>>>of());
    }

    private ClearCardReaderDataAction clearCardReaderDataAction() {
      return new ClearCardReaderDataAction(singletonC.provideCardReaderManagerProvider.get(), new AppPrefsWrapper());
    }

    private MainActivity mainActivity() {
      return MainModule_Companion_ProvideMainActivityFactory.provideMainActivity(activity);
    }

    private AboutConfigBuilder aboutConfigBuilder() {
      return new AboutConfigBuilder(singletonC.analyticsTrackerWrapperProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final Activity activityParam) {
      this.login2FaFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 0);
      this.loginEmailFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 1);
      this.loginEmailPasswordFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 2);
      this.loginGoogleFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 3);
      this.loginMagicLinkRequestFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 4);
      this.loginMagicLinkSentFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 5);
      this.loginSiteAddressFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 6);
      this.loginSiteAddressHelpDialogFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 7);
      this.loginUsernamePasswordFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 8);
      this.signupGoogleFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 9);
      this.signupMagicLinkFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 10);
      this.signupConfirmationFragmentSubcomponentFactoryProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 11);
      this.urlUtilsProvider = SingleCheck.provider(new SwitchingProvider<UrlUtils>(singletonC, activityRetainedCImpl, activityCImpl, 12));
      this.mainPresenterProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 13);
      this.provideMainPresenterProvider = DoubleCheck.provider((Provider) mainPresenterProvider);
      this.mainUIMessageResolverProvider = DoubleCheck.provider(new SwitchingProvider<MainUIMessageResolver>(singletonC, activityRetainedCImpl, activityCImpl, 14));
      this.appSettingsPresenterProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, activityCImpl, 15);
      this.provideAppSettingsPresenterProvider = DoubleCheck.provider((Provider) appSettingsPresenterProvider);
    }

    @Override
    public void injectHelpActivity(HelpActivity arg0) {
      injectHelpActivity2(arg0);
    }

    @Override
    public void injectSSRActivity(SSRActivity arg0) {
    }

    @Override
    public void injectLoginActivity(LoginActivity arg0) {
      injectLoginActivity2(arg0);
    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
      injectMainActivity2(arg0);
    }

    @Override
    public void injectAppSettingsActivity(AppSettingsActivity arg0) {
      injectAppSettingsActivity2(arg0);
    }

    @Override
    public void injectUnifiedAboutScreenActivity(UnifiedAboutScreenActivity arg0) {
      injectUnifiedAboutScreenActivity2(arg0);
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(AddOrderNoteViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddOrderShipmentTrackingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddOrderTrackingProviderListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddProductCategoryViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddProductDownloadViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AddressViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AnalyticsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderConnectViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderHubViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderManualsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderOnboardingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderPaymentViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderStatusCheckerViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderUpdateViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CardReaderWelcomeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CouponDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CouponListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CouponRestrictionsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CreateShippingLabelViewModel_HiltModules_KeyModule_ProvideFactory.provide(), EditCouponViewModel_HiltModules_KeyModule_ProvideFactory.provide(), EditShippingLabelAddressViewModel_HiltModules_KeyModule_ProvideFactory.provide(), EditShippingLabelPackagesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), EditShippingLabelPaymentViewModel_HiltModules_KeyModule_ProvideFactory.provide(), EditVariationAttributesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), EmailRestrictionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), FeatureAnnouncementViewModel_HiltModules_KeyModule_ProvideFactory.provide(), GroupedProductListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), InboxViewModel_HiltModules_KeyModule_ProvideFactory.provide(), InstallWcShippingFlowViewModel_HiltModules_KeyModule_ProvideFactory.provide(), IssueRefundViewModel_HiltModules_KeyModule_ProvideFactory.provide(), JetpackInstallViewModel_HiltModules_KeyModule_ProvideFactory.provide(), LoginNoJetpackViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MagicLinkInterceptViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MainActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MediaPickerViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MediaUploadErrorListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MoreMenuViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MoveShippingItemViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MyStoreViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderCreationFeeViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderCreationProductSelectionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderCreationShippingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderCreationVariationSelectionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderCreationViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderEditingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderFilterCategoriesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderFilterOptionsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderFulfillViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderedAddonViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PrintShippingLabelCustomsFormViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PrintShippingLabelViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductCategorySelectorViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductDownloadDetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductFilterListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductImagesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductInventoryViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductPricingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductReviewsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductSelectionListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductSelectorViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductShippingClassViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductShippingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductSortingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProductTypesBottomSheetViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ReceiptPreviewViewModel_HiltModules_KeyModule_ProvideFactory.provide(), RefundDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ReviewDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ReviewListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SSRActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SearchFilterViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingCarrierRatesViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingCustomsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingLabelAddressSuggestionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingLabelCreateCustomPackageViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingLabelCreatePackageViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingLabelCreateServicePackageViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingLabelRefundViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ShippingPackageSelectorViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SimplePaymentsDialogViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SimplePaymentsFragmentViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SimplePaymentsSharedViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SimpleTextEditorViewModel_HiltModules_KeyModule_ProvideFactory.provide(), SitePickerViewModel_HiltModules_KeyModule_ProvideFactory.provide(), TakePaymentViewModel_HiltModules_KeyModule_ProvideFactory.provide(), UserEligibilityErrorViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VariationDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VariationListViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VariationSelectorViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VariationsBulkUpdateAttrPickerViewModel_HiltModules_KeyModule_ProvideFactory.provide(), VariationsBulkUpdatePriceViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public void injectMediaPickerActivity(MediaPickerActivity arg0) {
      injectMediaPickerActivity2(arg0);
    }

    @CanIgnoreReturnValue
    private HelpActivity injectHelpActivity2(HelpActivity instance) {
      HelpActivity_MembersInjector.injectAccountStore(instance, singletonC.accountStoreProvider.get());
      HelpActivity_MembersInjector.injectSiteStore(instance, singletonC.siteStoreProvider.get());
      HelpActivity_MembersInjector.injectSupportHelper(instance, singletonC.provideSupportHelperProvider.get());
      HelpActivity_MembersInjector.injectZendeskHelper(instance, singletonC.provideZendeskHelperProvider.get());
      HelpActivity_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity2(LoginActivity instance) {
      LoginActivity_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
      LoginActivity_MembersInjector.injectLoginAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      LoginActivity_MembersInjector.injectUnifiedLoginTracker(instance, singletonC.unifiedLoginTrackerProvider.get());
      LoginActivity_MembersInjector.injectZendeskHelper(instance, singletonC.provideZendeskHelperProvider.get());
      LoginActivity_MembersInjector.injectUrlUtils(instance, urlUtilsProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainActivity injectMainActivity2(MainActivity instance) {
      MainActivity_MembersInjector.injectPresenter(instance, provideMainPresenterProvider.get());
      MainActivity_MembersInjector.injectLoginAnalyticsListener(instance, singletonC.loginAnalyticsListener());
      MainActivity_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      MainActivity_MembersInjector.injectUiMessageResolver(instance, mainUIMessageResolverProvider.get());
      MainActivity_MembersInjector.injectCrashLogging(instance, singletonC.provideCrashLoggingProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AppSettingsActivity injectAppSettingsActivity2(AppSettingsActivity instance) {
      AppSettingsActivity_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
      AppSettingsActivity_MembersInjector.injectPresenter(instance, provideAppSettingsPresenterProvider.get());
      AppSettingsActivity_MembersInjector.injectSelectedSite(instance, singletonC.provideSelectedSiteProvider.get());
      AppSettingsActivity_MembersInjector.injectPrefs(instance, singletonC.providesAppPrefsProvider.get());
      AppSettingsActivity_MembersInjector.injectNotificationMessageHandler(instance, singletonC.notificationMessageHandlerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private UnifiedAboutScreenActivity injectUnifiedAboutScreenActivity2(
        UnifiedAboutScreenActivity instance) {
      UnifiedAboutScreenActivity_MembersInjector.injectConfigBuilder(instance, aboutConfigBuilder());
      return instance;
    }

    @CanIgnoreReturnValue
    private MediaPickerActivity injectMediaPickerActivity2(MediaPickerActivity instance) {
      MediaPickerActivity_MembersInjector.injectLog(instance, new MediaPickerLogger());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerDefault_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ActivityCImpl activityCImpl;

      private final int id;

      SwitchingProvider(DaggerDefault_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.activityCImpl = activityCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // org.wordpress.android.login.di.LoginFragmentModule_Login2FaFragment.Login2FaFragmentSubcomponent.Factory 
          return (T) new Login2FaFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 1: // org.wordpress.android.login.di.LoginFragmentModule_LoginEmailFragment.LoginEmailFragmentSubcomponent.Factory 
          return (T) new LoginEmailFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 2: // org.wordpress.android.login.di.LoginFragmentModule_LoginEmailPasswordFragment.LoginEmailPasswordFragmentSubcomponent.Factory 
          return (T) new LoginEmailPasswordFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 3: // org.wordpress.android.login.di.LoginFragmentModule_LoginGoogleFragment.LoginGoogleFragmentSubcomponent.Factory 
          return (T) new LoginGoogleFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 4: // org.wordpress.android.login.di.LoginFragmentModule_LoginMagicLinkRequestFragment.LoginMagicLinkRequestFragmentSubcomponent.Factory 
          return (T) new LoginMagicLinkRequestFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 5: // org.wordpress.android.login.di.LoginFragmentModule_LoginMagicLinkSentFragment.LoginMagicLinkSentFragmentSubcomponent.Factory 
          return (T) new LoginMagicLinkSentFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 6: // org.wordpress.android.login.di.LoginFragmentModule_LoginSiteAddressFragment.LoginSiteAddressFragmentSubcomponent.Factory 
          return (T) new LoginSiteAddressFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 7: // org.wordpress.android.login.di.LoginFragmentModule_LoginSiteAddressHelpDialogFragment.LoginSiteAddressHelpDialogFragmentSubcomponent.Factory 
          return (T) new LoginSiteAddressHelpDialogFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 8: // org.wordpress.android.login.di.LoginFragmentModule_LoginUsernamePasswordFragment.LoginUsernamePasswordFragmentSubcomponent.Factory 
          return (T) new LoginUsernamePasswordFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 9: // org.wordpress.android.login.di.LoginFragmentModule_SignupGoogleFragment.SignupGoogleFragmentSubcomponent.Factory 
          return (T) new SignupGoogleFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 10: // org.wordpress.android.login.di.LoginFragmentModule_SignupMagicLinkFragment.SignupMagicLinkFragmentSubcomponent.Factory 
          return (T) new SignupMagicLinkFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 11: // org.wordpress.android.login.di.LoginFragmentModule_SignupConfirmationScreen.SignupConfirmationFragmentSubcomponent.Factory 
          return (T) new SignupConfirmationFragmentSubcomponentFactory(singletonC, activityRetainedCImpl, activityCImpl);

          case 12: // com.woocommerce.android.util.UrlUtils 
          return (T) new UrlUtils(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

          case 13: // com.woocommerce.android.ui.main.MainPresenter 
          return (T) new MainPresenter(singletonC.dispatcherProvider.get(), singletonC.accountStoreProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.productImageMapProvider.get(), new AppPrefsWrapper(), singletonC.wCOrderStoreProvider.get(), activityCImpl.clearCardReaderDataAction());

          case 14: // com.woocommerce.android.ui.main.MainUIMessageResolver 
          return (T) new MainUIMessageResolver(activityCImpl.mainActivity());

          case 15: // com.woocommerce.android.ui.prefs.AppSettingsPresenter 
          return (T) new AppSettingsPresenter(singletonC.dispatcherProvider.get(), singletonC.accountStoreProvider.get(), singletonC.notificationStoreProvider.get(), activityCImpl.clearCardReaderDataAction());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ViewModelCImpl extends Default_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AddOrderNoteViewModel> addOrderNoteViewModelProvider;

    private Provider<AddOrderShipmentTrackingViewModel> addOrderShipmentTrackingViewModelProvider;

    private Provider<AddOrderTrackingProviderListViewModel> addOrderTrackingProviderListViewModelProvider;

    private Provider<AddProductCategoryViewModel> addProductCategoryViewModelProvider;

    private Provider<AddProductDownloadViewModel> addProductDownloadViewModelProvider;

    private Provider<AddressViewModel> addressViewModelProvider;

    private Provider<AnalyticsViewModel> analyticsViewModelProvider;

    private Provider<CardReaderConnectViewModel> cardReaderConnectViewModelProvider;

    private Provider<CardReaderDetailViewModel> cardReaderDetailViewModelProvider;

    private Provider<CardReaderHubViewModel> cardReaderHubViewModelProvider;

    private Provider<CardReaderManualsViewModel> cardReaderManualsViewModelProvider;

    private Provider<CardReaderConfigFactory> provideCardReaderConfigFactoryProvider;

    private Provider<CardReaderOnboardingViewModel> cardReaderOnboardingViewModelProvider;

    private Provider<CardReaderPaymentViewModel> cardReaderPaymentViewModelProvider;

    private Provider<CardReaderStatusCheckerViewModel> cardReaderStatusCheckerViewModelProvider;

    private Provider<CardReaderUpdateViewModel> cardReaderUpdateViewModelProvider;

    private Provider<CardReaderWelcomeViewModel> cardReaderWelcomeViewModelProvider;

    private Provider<CouponDetailsViewModel> couponDetailsViewModelProvider;

    private Provider<CouponListViewModel> couponListViewModelProvider;

    private Provider<CouponRestrictionsViewModel> couponRestrictionsViewModelProvider;

    private Provider<CreateShippingLabelViewModel> createShippingLabelViewModelProvider;

    private Provider<EditCouponViewModel> editCouponViewModelProvider;

    private Provider<EditShippingLabelAddressViewModel> editShippingLabelAddressViewModelProvider;

    private Provider<EditShippingLabelPackagesViewModel> editShippingLabelPackagesViewModelProvider;

    private Provider<EditShippingLabelPaymentViewModel> editShippingLabelPaymentViewModelProvider;

    private Provider<EditVariationAttributesViewModel> editVariationAttributesViewModelProvider;

    private Provider<EmailRestrictionViewModel> emailRestrictionViewModelProvider;

    private Provider<FeatureAnnouncementViewModel> featureAnnouncementViewModelProvider;

    private Provider<GroupedProductListViewModel> groupedProductListViewModelProvider;

    private Provider<InboxViewModel> inboxViewModelProvider;

    private Provider<InstallWcShippingFlowViewModel> installWcShippingFlowViewModelProvider;

    private Provider<IssueRefundViewModel> issueRefundViewModelProvider;

    private Provider<JetpackInstallViewModel> jetpackInstallViewModelProvider;

    private Provider<LoginNoJetpackViewModel> loginNoJetpackViewModelProvider;

    private Provider<MagicLinkInterceptViewModel> magicLinkInterceptViewModelProvider;

    private Provider<MainActivityViewModel> mainActivityViewModelProvider;

    private Provider<MediaPickerViewModel> mediaPickerViewModelProvider;

    private Provider<MediaUploadErrorListViewModel> mediaUploadErrorListViewModelProvider;

    private Provider<MoreMenuViewModel> moreMenuViewModelProvider;

    private Provider<MoveShippingItemViewModel> moveShippingItemViewModelProvider;

    private Provider<MyStoreViewModel> myStoreViewModelProvider;

    private Provider<OrderCreationFeeViewModel> orderCreationFeeViewModelProvider;

    private Provider<OrderCreationProductSelectionViewModel> orderCreationProductSelectionViewModelProvider;

    private Provider<OrderCreationShippingViewModel> orderCreationShippingViewModelProvider;

    private Provider<OrderCreationVariationSelectionViewModel> orderCreationVariationSelectionViewModelProvider;

    private Provider<OrderCreationViewModel> orderCreationViewModelProvider;

    private Provider<OrderDetailViewModel> orderDetailViewModelProvider;

    private Provider<OrderEditingRepository> orderEditingRepositoryProvider;

    private Provider<OrderEditingViewModel> orderEditingViewModelProvider;

    private Provider<OrderFilterCategoriesViewModel> orderFilterCategoriesViewModelProvider;

    private Provider<OrderFilterOptionsViewModel> orderFilterOptionsViewModelProvider;

    private Provider<OrderFulfillViewModel> orderFulfillViewModelProvider;

    private Provider<OrderListViewModel> orderListViewModelProvider;

    private Provider<OrderedAddonViewModel> orderedAddonViewModelProvider;

    private Provider<PrintShippingLabelCustomsFormViewModel> printShippingLabelCustomsFormViewModelProvider;

    private Provider<PrintShippingLabelViewModel> printShippingLabelViewModelProvider;

    private Provider<ProductCategorySelectorViewModel> productCategorySelectorViewModelProvider;

    private Provider<ProductDetailViewModel> productDetailViewModelProvider;

    private Provider<ProductDownloadDetailsViewModel> productDownloadDetailsViewModelProvider;

    private Provider<ProductFilterListViewModel> productFilterListViewModelProvider;

    private Provider<ProductImagesViewModel> productImagesViewModelProvider;

    private Provider<ProductInventoryViewModel> productInventoryViewModelProvider;

    private Provider<ProductListViewModel> productListViewModelProvider;

    private Provider<ProductPricingViewModel> productPricingViewModelProvider;

    private Provider<ProductReviewsViewModel> productReviewsViewModelProvider;

    private Provider<ProductSelectionListViewModel> productSelectionListViewModelProvider;

    private Provider<ProductSelectorViewModel> productSelectorViewModelProvider;

    private Provider<ProductShippingClassViewModel> productShippingClassViewModelProvider;

    private Provider<ProductShippingViewModel> productShippingViewModelProvider;

    private Provider<ProductSortingViewModel> productSortingViewModelProvider;

    private Provider<ProductTypesBottomSheetViewModel> productTypesBottomSheetViewModelProvider;

    private Provider<ReceiptPreviewViewModel> receiptPreviewViewModelProvider;

    private Provider<RefundDetailViewModel> refundDetailViewModelProvider;

    private Provider<ReviewDetailViewModel> reviewDetailViewModelProvider;

    private Provider<ReviewListViewModel> reviewListViewModelProvider;

    private Provider<SSRActivityViewModel> sSRActivityViewModelProvider;

    private Provider<SearchFilterViewModel> searchFilterViewModelProvider;

    private Provider<ShippingCarrierRatesViewModel> shippingCarrierRatesViewModelProvider;

    private Provider<ShippingCustomsViewModel> shippingCustomsViewModelProvider;

    private Provider<ShippingLabelAddressSuggestionViewModel> shippingLabelAddressSuggestionViewModelProvider;

    private Provider<ShippingLabelCreateCustomPackageViewModel> shippingLabelCreateCustomPackageViewModelProvider;

    private Provider<ShippingLabelCreatePackageViewModel> shippingLabelCreatePackageViewModelProvider;

    private Provider<ShippingLabelCreateServicePackageViewModel> shippingLabelCreateServicePackageViewModelProvider;

    private Provider<ShippingLabelRefundViewModel> shippingLabelRefundViewModelProvider;

    private Provider<ShippingPackageSelectorViewModel> shippingPackageSelectorViewModelProvider;

    private Provider<SimplePaymentsDialogViewModel> simplePaymentsDialogViewModelProvider;

    private Provider<SimplePaymentsRepository> simplePaymentsRepositoryProvider;

    private Provider<SimplePaymentsFragmentViewModel> simplePaymentsFragmentViewModelProvider;

    private Provider<SimplePaymentsSharedViewModel> simplePaymentsSharedViewModelProvider;

    private Provider<SimpleTextEditorViewModel> simpleTextEditorViewModelProvider;

    private Provider<SitePickerViewModel> sitePickerViewModelProvider;

    private Provider<TakePaymentViewModel> takePaymentViewModelProvider;

    private Provider<UserEligibilityErrorViewModel> userEligibilityErrorViewModelProvider;

    private Provider<VariationDetailViewModel> variationDetailViewModelProvider;

    private Provider<VariationListViewModel> variationListViewModelProvider;

    private Provider<VariationSelectorViewModel> variationSelectorViewModelProvider;

    private Provider<VariationsBulkUpdateAttrPickerViewModel> variationsBulkUpdateAttrPickerViewModelProvider;

    private Provider<VariationsBulkUpdatePriceViewModel> variationsBulkUpdatePriceViewModelProvider;

    private ViewModelCImpl(DaggerDefault_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam);

    }

    private GetLocations getLocations() {
      return new GetLocations(singletonC.wCDataStoreProvider.get());
    }

    private OrderMapper orderMapper() {
      return new OrderMapper(getLocations());
    }

    private ShippingLabelAddressMapper shippingLabelAddressMapper() {
      return new ShippingLabelAddressMapper(getLocations());
    }

    private ShippingLabelMapper shippingLabelMapper() {
      return new ShippingLabelMapper(shippingLabelAddressMapper());
    }

    private OrderDetailRepository orderDetailRepository() {
      return new OrderDetailRepository(singletonC.wCOrderStoreProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.wCRefundStoreProvider.get(), singletonC.wCShippingLabelStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.wooCommerceStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), orderMapper(), shippingLabelMapper());
    }

    private OrderShipmentProvidersRepository orderShipmentProvidersRepository() {
      return new OrderShipmentProvidersRepository(singletonC.provideSelectedSiteProvider.get(), singletonC.wCOrderStoreProvider.get());
    }

    private ProductCategoriesRepository productCategoriesRepository() {
      return new ProductCategoriesRepository(singletonC.dispatcherProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private DateUtils dateUtils() {
      return new DateUtils(AppConfigModule_ProvideDefaultLocaleFactory.provideDefaultLocale(singletonC.appConfigModule), singletonC.provideCrashLoggingProvider.get());
    }

    private AnalyticsDateRangeCalculator analyticsDateRangeCalculator() {
      return new AnalyticsDateRangeCalculator(dateUtils());
    }

    private CardReaderTracker cardReaderTracker() {
      return new CardReaderTracker(singletonC.analyticsTrackerWrapperProvider.get(), new AppPrefsWrapper(), singletonC.provideSelectedSiteProvider.get(), singletonC.cardReaderTrackingInfoImplProvider.get());
    }

    private CardReaderLocationRepository cardReaderLocationRepository() {
      return new CardReaderLocationRepository(singletonC.wCInPersonPaymentsStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private CardReaderCountryConfigProvider cardReaderCountryConfigProvider() {
      return new CardReaderCountryConfigProvider(new InPersonPaymentsCanadaFeatureFlag(), provideCardReaderConfigFactoryProvider.get());
    }

    private CardReaderOnboardingChecker cardReaderOnboardingChecker() {
      return new CardReaderOnboardingChecker(singletonC.provideSelectedSiteProvider.get(), new AppPrefsWrapper(), singletonC.wooCommerceStoreProvider.get(), singletonC.wCInPersonPaymentsStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.provideNetworkStatusProvider.get(), singletonC.cardReaderTrackingInfoImplProvider.get(), cardReaderCountryConfigProvider());
    }

    private CardReaderPaymentCurrencySupportedChecker cardReaderPaymentCurrencySupportedChecker() {
      return new CardReaderPaymentCurrencySupportedChecker(ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), cardReaderCountryConfigProvider());
    }

    private CardReaderPaymentCollectibilityChecker cardReaderPaymentCollectibilityChecker() {
      return new CardReaderPaymentCollectibilityChecker(orderDetailRepository(), cardReaderPaymentCurrencySupportedChecker());
    }

    private CardReaderInteracRefundableChecker cardReaderInteracRefundableChecker() {
      return new CardReaderInteracRefundableChecker(orderDetailRepository(), cardReaderPaymentCurrencySupportedChecker());
    }

    private CouponRepository couponRepository() {
      return new CouponRepository(singletonC.couponStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), dateUtils());
    }

    private CouponUtils couponUtils() {
      return new CouponUtils(singletonC.currencyFormatterProvider.get(), singletonC.resourceProvider());
    }

    private CouponListHandler couponListHandler() {
      return new CouponListHandler(couponRepository());
    }

    private ParameterRepository parameterRepository() {
      return new ParameterRepository(singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private ShippingLabelAddressValidator shippingLabelAddressValidator() {
      return new ShippingLabelAddressValidator(singletonC.wCShippingLabelStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), shippingLabelAddressMapper());
    }

    private ProductDetailRepository productDetailRepository() {
      return new ProductDetailRepository(singletonC.dispatcherProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.wCGlobalAttributeStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.wCTaxStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));
    }

    private VariationDetailRepository variationDetailRepository() {
      return new VariationDetailRepository(singletonC.wCProductStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));
    }

    private GroupedProductListRepository groupedProductListRepository() {
      return new GroupedProductListRepository(singletonC.dispatcherProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.wCProductStoreProvider.get());
    }

    private InboxRepository inboxRepository() {
      return new InboxRepository(singletonC.wCInboxStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private PaymentChargeRepository paymentChargeRepository() {
      return new PaymentChargeRepository(singletonC.wCInPersonPaymentsStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.providesAppPrefsProvider.get(), cardReaderOnboardingChecker());
    }

    private PluginRepository pluginRepository() {
      return new PluginRepository(singletonC.dispatcherProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.pluginStoreProvider.get());
    }

    private LoginNoJetpackRepository loginNoJetpackRepository() {
      return new LoginNoJetpackRepository(singletonC.dispatcherProvider.get());
    }

    private MagicLinkInterceptRepository magicLinkInterceptRepository() {
      return new MagicLinkInterceptRepository(singletonC.dispatcherProvider.get(), singletonC.accountStoreProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.loginAnalyticsListener());
    }

    private FeatureAnnouncementRepository featureAnnouncementRepository() {
      return new FeatureAnnouncementRepository(singletonC.whatsNewStoreProvider.get(), singletonC.buildConfigWrapperProvider.get());
    }

    private MediaPickerTracker mediaPickerTracker() {
      return new MediaPickerTracker(ApplicationModule_Companion_ProvideBackgroundDispatcherFactory.provideBackgroundDispatcher(), new com.woocommerce.android.mediapicker.MediaPickerTracker());
    }

    private org.wordpress.android.mediapicker.viewmodel.ResourceProvider resourceProvider() {
      return new org.wordpress.android.mediapicker.viewmodel.ResourceProvider(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));
    }

    private MediaManager mediaManager() {
      return new MediaManager(new MediaPickerLogger(), singletonC.mediaPickerUtilsProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));
    }

    private MoreMenuRepository moreMenuRepository() {
      return new MoreMenuRepository(singletonC.provideSelectedSiteProvider.get(), singletonC.wooCommerceStoreProvider.get(), new AppPrefsWrapper());
    }

    private StatsRepository statsRepository() {
      return new StatsRepository(singletonC.provideSelectedSiteProvider.get(), singletonC.wCStatsStoreProvider.get(), singletonC.wCOrderStoreProvider.get(), singletonC.wCLeaderboardsStoreProvider.get());
    }

    private GetStats getStats() {
      return new GetStats(singletonC.provideSelectedSiteProvider.get(), statsRepository(), new AppPrefsWrapper(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));
    }

    private GetTopPerformers getTopPerformers() {
      return new GetTopPerformers(statsRepository(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));
    }

    private ProductListRepository productListRepository() {
      return new ProductListRepository(new AppPrefsWrapper(), singletonC.dispatcherProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private VariationRepository variationRepository() {
      return new VariationRepository(singletonC.wCProductStoreProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private OrderCreationRepository orderCreationRepository() {
      return new OrderCreationRepository(singletonC.provideSelectedSiteProvider.get(), singletonC.wCOrderStoreProvider.get(), singletonC.orderUpdateStoreProvider.get(), orderMapper(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.wooCommerceStoreProvider.get(), singletonC.analyticsTrackerWrapperProvider.get());
    }

    private MapItemToProductUiModel mapItemToProductUiModel() {
      return new MapItemToProductUiModel(ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), variationDetailRepository(), productDetailRepository());
    }

    private CreateOrUpdateOrderDraft createOrUpdateOrderDraft() {
      return new CreateOrUpdateOrderDraft(ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), orderCreationRepository());
    }

    private CreateOrderItem createOrderItem() {
      return new CreateOrderItem(ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), variationDetailRepository(), productDetailRepository());
    }

    private AddonRepository addonRepository() {
      return new AddonRepository(singletonC.wCOrderStoreProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.wCAddonsStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private ShippingLabelOnboardingRepository shippingLabelOnboardingRepository() {
      return new ShippingLabelOnboardingRepository(orderDetailRepository(), new AppPrefsWrapper(), singletonC.provideSelectedSiteProvider.get());
    }

    private OrderListRepository orderListRepository() {
      return new OrderListRepository(singletonC.dispatcherProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.wCOrderStoreProvider.get(), singletonC.wCGatewayStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private GetOrderStatusFilterOptions getOrderStatusFilterOptions() {
      return new GetOrderStatusFilterOptions(orderListRepository(), singletonC.orderFiltersRepositoryProvider.get());
    }

    private GetDateRangeFilterOptions getDateRangeFilterOptions() {
      return new GetDateRangeFilterOptions(singletonC.orderFiltersRepositoryProvider.get());
    }

    private GetTrackingForFilterSelection getTrackingForFilterSelection() {
      return new GetTrackingForFilterSelection(singletonC.orderFiltersRepositoryProvider.get());
    }

    private GetWCOrderListDescriptorWithFilters getWCOrderListDescriptorWithFilters() {
      return new GetWCOrderListDescriptorWithFilters(singletonC.orderFiltersRepositoryProvider.get(), singletonC.provideSelectedSiteProvider.get(), dateUtils());
    }

    private GetSelectedOrderFiltersCount getSelectedOrderFiltersCount() {
      return new GetSelectedOrderFiltersCount(singletonC.orderFiltersRepositoryProvider.get());
    }

    private FileDownloader fileDownloader() {
      return new FileDownloader(ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));
    }

    private ProductCategorySelectorRepository productCategorySelectorRepository() {
      return new ProductCategorySelectorRepository(singletonC.provideSelectedSiteProvider.get(), singletonC.wCProductStoreProvider.get());
    }

    private ProductCategoryListHandler productCategoryListHandler() {
      return new ProductCategoryListHandler(productCategorySelectorRepository());
    }

    private ProductTagsRepository productTagsRepository() {
      return new ProductTagsRepository(singletonC.dispatcherProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private ProductReviewsRepository productReviewsRepository() {
      return new ProductReviewsRepository(singletonC.provideSelectedSiteProvider.get(), singletonC.wCProductStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));
    }

    private ProductSelectorRepository productSelectorRepository() {
      return new ProductSelectorRepository(singletonC.wCProductStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private ProductListHandler productListHandler() {
      return new ProductListHandler(productSelectorRepository());
    }

    private VariationSelectorRepository variationSelectorRepository() {
      return new VariationSelectorRepository(singletonC.wCProductStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private ProductShippingClassRepository productShippingClassRepository() {
      return new ProductShippingClassRepository(singletonC.dispatcherProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private ReviewDetailRepository reviewDetailRepository() {
      return new ReviewDetailRepository(singletonC.wCProductStoreProvider.get(), singletonC.notificationStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private MarkReviewAsSeen markReviewAsSeen() {
      return new MarkReviewAsSeen(reviewDetailRepository(), singletonC.notificationMessageHandlerProvider.get());
    }

    private ReviewListRepository reviewListRepository() {
      return new ReviewListRepository(singletonC.dispatcherProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.notificationStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());
    }

    private MarkAllReviewsAsSeen markAllReviewsAsSeen() {
      return new MarkAllReviewsAsSeen(singletonC.provideSelectedSiteProvider.get(), reviewListRepository(), singletonC.notificationMessageHandlerProvider.get());
    }

    private SitePickerRepository sitePickerRepository() {
      return new SitePickerRepository(singletonC.siteStoreProvider.get(), singletonC.dispatcherProvider.get(), singletonC.accountStoreProvider.get(), singletonC.wooCommerceStoreProvider.get());
    }

    private VariationListHandler variationListHandler() {
      return new VariationListHandler(variationSelectorRepository());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.addOrderNoteViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.addOrderShipmentTrackingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.addOrderTrackingProviderListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
      this.addProductCategoryViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 3);
      this.addProductDownloadViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 4);
      this.addressViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 5);
      this.analyticsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 6);
      this.cardReaderConnectViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 7);
      this.cardReaderDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 8);
      this.cardReaderHubViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 9);
      this.cardReaderManualsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 10);
      this.provideCardReaderConfigFactoryProvider = SingleCheck.provider(new SwitchingProvider<CardReaderConfigFactory>(singletonC, activityRetainedCImpl, viewModelCImpl, 12));
      this.cardReaderOnboardingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 11);
      this.cardReaderPaymentViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 13);
      this.cardReaderStatusCheckerViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 14);
      this.cardReaderUpdateViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 15);
      this.cardReaderWelcomeViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 16);
      this.couponDetailsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 17);
      this.couponListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 18);
      this.couponRestrictionsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 19);
      this.createShippingLabelViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 20);
      this.editCouponViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 21);
      this.editShippingLabelAddressViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 22);
      this.editShippingLabelPackagesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 23);
      this.editShippingLabelPaymentViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 24);
      this.editVariationAttributesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 25);
      this.emailRestrictionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 26);
      this.featureAnnouncementViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 27);
      this.groupedProductListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 28);
      this.inboxViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 29);
      this.installWcShippingFlowViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 30);
      this.issueRefundViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 31);
      this.jetpackInstallViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 32);
      this.loginNoJetpackViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 33);
      this.magicLinkInterceptViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 34);
      this.mainActivityViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 35);
      this.mediaPickerViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 36);
      this.mediaUploadErrorListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 37);
      this.moreMenuViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 38);
      this.moveShippingItemViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 39);
      this.myStoreViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 40);
      this.orderCreationFeeViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 41);
      this.orderCreationProductSelectionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 42);
      this.orderCreationShippingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 43);
      this.orderCreationVariationSelectionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 44);
      this.orderCreationViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 45);
      this.orderDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 46);
      this.orderEditingRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<OrderEditingRepository>(singletonC, activityRetainedCImpl, viewModelCImpl, 48));
      this.orderEditingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 47);
      this.orderFilterCategoriesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 49);
      this.orderFilterOptionsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 50);
      this.orderFulfillViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 51);
      this.orderListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 52);
      this.orderedAddonViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 53);
      this.printShippingLabelCustomsFormViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 54);
      this.printShippingLabelViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 55);
      this.productCategorySelectorViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 56);
      this.productDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 57);
      this.productDownloadDetailsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 58);
      this.productFilterListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 59);
      this.productImagesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 60);
      this.productInventoryViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 61);
      this.productListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 62);
      this.productPricingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 63);
      this.productReviewsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 64);
      this.productSelectionListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 65);
      this.productSelectorViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 66);
      this.productShippingClassViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 67);
      this.productShippingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 68);
      this.productSortingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 69);
      this.productTypesBottomSheetViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 70);
      this.receiptPreviewViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 71);
      this.refundDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 72);
      this.reviewDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 73);
      this.reviewListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 74);
      this.sSRActivityViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 75);
      this.searchFilterViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 76);
      this.shippingCarrierRatesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 77);
      this.shippingCustomsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 78);
      this.shippingLabelAddressSuggestionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 79);
      this.shippingLabelCreateCustomPackageViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 80);
      this.shippingLabelCreatePackageViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 81);
      this.shippingLabelCreateServicePackageViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 82);
      this.shippingLabelRefundViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 83);
      this.shippingPackageSelectorViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 84);
      this.simplePaymentsDialogViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 85);
      this.simplePaymentsRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<SimplePaymentsRepository>(singletonC, activityRetainedCImpl, viewModelCImpl, 87));
      this.simplePaymentsFragmentViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 86);
      this.simplePaymentsSharedViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 88);
      this.simpleTextEditorViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 89);
      this.sitePickerViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 90);
      this.takePaymentViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 91);
      this.userEligibilityErrorViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 92);
      this.variationDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 93);
      this.variationListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 94);
      this.variationSelectorViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 95);
      this.variationsBulkUpdateAttrPickerViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 96);
      this.variationsBulkUpdatePriceViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 97);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(95).put("com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel", ((Provider) addOrderNoteViewModelProvider)).put("com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel", ((Provider) addOrderShipmentTrackingViewModelProvider)).put("com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel", ((Provider) addOrderTrackingProviderListViewModelProvider)).put("com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel", ((Provider) addProductCategoryViewModelProvider)).put("com.woocommerce.android.ui.products.downloads.AddProductDownloadViewModel", ((Provider) addProductDownloadViewModelProvider)).put("com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel", ((Provider) addressViewModelProvider)).put("com.woocommerce.android.ui.analytics.AnalyticsViewModel", ((Provider) analyticsViewModelProvider)).put("com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel", ((Provider) cardReaderConnectViewModelProvider)).put("com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel", ((Provider) cardReaderDetailViewModelProvider)).put("com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel", ((Provider) cardReaderHubViewModelProvider)).put("com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel", ((Provider) cardReaderManualsViewModelProvider)).put("com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel", ((Provider) cardReaderOnboardingViewModelProvider)).put("com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel", ((Provider) cardReaderPaymentViewModelProvider)).put("com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel", ((Provider) cardReaderStatusCheckerViewModelProvider)).put("com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel", ((Provider) cardReaderUpdateViewModelProvider)).put("com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel", ((Provider) cardReaderWelcomeViewModelProvider)).put("com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel", ((Provider) couponDetailsViewModelProvider)).put("com.woocommerce.android.ui.coupons.CouponListViewModel", ((Provider) couponListViewModelProvider)).put("com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel", ((Provider) couponRestrictionsViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel", ((Provider) createShippingLabelViewModelProvider)).put("com.woocommerce.android.ui.coupons.edit.EditCouponViewModel", ((Provider) editCouponViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel", ((Provider) editShippingLabelAddressViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel", ((Provider) editShippingLabelPackagesViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel", ((Provider) editShippingLabelPaymentViewModelProvider)).put("com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel", ((Provider) editVariationAttributesViewModelProvider)).put("com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel", ((Provider) emailRestrictionViewModelProvider)).put("com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel", ((Provider) featureAnnouncementViewModelProvider)).put("com.woocommerce.android.ui.products.GroupedProductListViewModel", ((Provider) groupedProductListViewModelProvider)).put("com.woocommerce.android.ui.inbox.InboxViewModel", ((Provider) inboxViewModelProvider)).put("com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel", ((Provider) installWcShippingFlowViewModelProvider)).put("com.woocommerce.android.ui.refunds.IssueRefundViewModel", ((Provider) issueRefundViewModelProvider)).put("com.woocommerce.android.ui.jetpack.JetpackInstallViewModel", ((Provider) jetpackInstallViewModelProvider)).put("com.woocommerce.android.ui.login.LoginNoJetpackViewModel", ((Provider) loginNoJetpackViewModelProvider)).put("com.woocommerce.android.ui.login.MagicLinkInterceptViewModel", ((Provider) magicLinkInterceptViewModelProvider)).put("com.woocommerce.android.ui.main.MainActivityViewModel", ((Provider) mainActivityViewModelProvider)).put("org.wordpress.android.mediapicker.viewmodel.MediaPickerViewModel", ((Provider) mediaPickerViewModelProvider)).put("com.woocommerce.android.ui.media.MediaUploadErrorListViewModel", ((Provider) mediaUploadErrorListViewModelProvider)).put("com.woocommerce.android.ui.moremenu.MoreMenuViewModel", ((Provider) moreMenuViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel", ((Provider) moveShippingItemViewModelProvider)).put("com.woocommerce.android.ui.mystore.MyStoreViewModel", ((Provider) myStoreViewModelProvider)).put("com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel", ((Provider) orderCreationFeeViewModelProvider)).put("com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel", ((Provider) orderCreationProductSelectionViewModelProvider)).put("com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel", ((Provider) orderCreationShippingViewModelProvider)).put("com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel", ((Provider) orderCreationVariationSelectionViewModelProvider)).put("com.woocommerce.android.ui.orders.creation.OrderCreationViewModel", ((Provider) orderCreationViewModelProvider)).put("com.woocommerce.android.ui.orders.details.OrderDetailViewModel", ((Provider) orderDetailViewModelProvider)).put("com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel", ((Provider) orderEditingViewModelProvider)).put("com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel", ((Provider) orderFilterCategoriesViewModelProvider)).put("com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel", ((Provider) orderFilterOptionsViewModelProvider)).put("com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel", ((Provider) orderFulfillViewModelProvider)).put("com.woocommerce.android.ui.orders.list.OrderListViewModel", ((Provider) orderListViewModelProvider)).put("com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel", ((Provider) orderedAddonViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel", ((Provider) printShippingLabelCustomsFormViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel", ((Provider) printShippingLabelViewModelProvider)).put("com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel", ((Provider) productCategorySelectorViewModelProvider)).put("com.woocommerce.android.ui.products.ProductDetailViewModel", ((Provider) productDetailViewModelProvider)).put("com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel", ((Provider) productDownloadDetailsViewModelProvider)).put("com.woocommerce.android.ui.products.ProductFilterListViewModel", ((Provider) productFilterListViewModelProvider)).put("com.woocommerce.android.ui.products.ProductImagesViewModel", ((Provider) productImagesViewModelProvider)).put("com.woocommerce.android.ui.products.ProductInventoryViewModel", ((Provider) productInventoryViewModelProvider)).put("com.woocommerce.android.ui.products.ProductListViewModel", ((Provider) productListViewModelProvider)).put("com.woocommerce.android.ui.products.ProductPricingViewModel", ((Provider) productPricingViewModelProvider)).put("com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel", ((Provider) productReviewsViewModelProvider)).put("com.woocommerce.android.ui.products.ProductSelectionListViewModel", ((Provider) productSelectionListViewModelProvider)).put("com.woocommerce.android.ui.products.selector.ProductSelectorViewModel", ((Provider) productSelectorViewModelProvider)).put("com.woocommerce.android.ui.products.ProductShippingClassViewModel", ((Provider) productShippingClassViewModelProvider)).put("com.woocommerce.android.ui.products.ProductShippingViewModel", ((Provider) productShippingViewModelProvider)).put("com.woocommerce.android.ui.products.ProductSortingViewModel", ((Provider) productSortingViewModelProvider)).put("com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel", ((Provider) productTypesBottomSheetViewModelProvider)).put("com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel", ((Provider) receiptPreviewViewModelProvider)).put("com.woocommerce.android.ui.refunds.RefundDetailViewModel", ((Provider) refundDetailViewModelProvider)).put("com.woocommerce.android.ui.reviews.ReviewDetailViewModel", ((Provider) reviewDetailViewModelProvider)).put("com.woocommerce.android.ui.reviews.ReviewListViewModel", ((Provider) reviewListViewModelProvider)).put("com.woocommerce.android.support.SSRActivityViewModel", ((Provider) sSRActivityViewModelProvider)).put("com.woocommerce.android.ui.searchfilter.SearchFilterViewModel", ((Provider) searchFilterViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel", ((Provider) shippingCarrierRatesViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel", ((Provider) shippingCustomsViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel", ((Provider) shippingLabelAddressSuggestionViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel", ((Provider) shippingLabelCreateCustomPackageViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageViewModel", ((Provider) shippingLabelCreatePackageViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel", ((Provider) shippingLabelCreateServicePackageViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel", ((Provider) shippingLabelRefundViewModelProvider)).put("com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel", ((Provider) shippingPackageSelectorViewModelProvider)).put("com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel", ((Provider) simplePaymentsDialogViewModelProvider)).put("com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel", ((Provider) simplePaymentsFragmentViewModelProvider)).put("com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel", ((Provider) simplePaymentsSharedViewModelProvider)).put("com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel", ((Provider) simpleTextEditorViewModelProvider)).put("com.woocommerce.android.ui.sitepicker.SitePickerViewModel", ((Provider) sitePickerViewModelProvider)).put("com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel", ((Provider) takePaymentViewModelProvider)).put("com.woocommerce.android.ui.common.UserEligibilityErrorViewModel", ((Provider) userEligibilityErrorViewModelProvider)).put("com.woocommerce.android.ui.products.variations.VariationDetailViewModel", ((Provider) variationDetailViewModelProvider)).put("com.woocommerce.android.ui.products.variations.VariationListViewModel", ((Provider) variationListViewModelProvider)).put("com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel", ((Provider) variationSelectorViewModelProvider)).put("com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel", ((Provider) variationsBulkUpdateAttrPickerViewModelProvider)).put("com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel", ((Provider) variationsBulkUpdatePriceViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerDefault_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerDefault_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel 
          return (T) new AddOrderNoteViewModel(viewModelCImpl.savedStateHandle, singletonC.resourceProvider(), singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.orderDetailRepository());

          case 1: // com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel 
          return (T) new AddOrderShipmentTrackingViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.orderDetailRepository());

          case 2: // com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel 
          return (T) new AddOrderTrackingProviderListViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.orderShipmentProvidersRepository(), viewModelCImpl.orderDetailRepository(), singletonC.resourceProvider());

          case 3: // com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel 
          return (T) new AddProductCategoryViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productCategoriesRepository(), singletonC.provideNetworkStatusProvider.get(), singletonC.resourceProvider());

          case 4: // com.woocommerce.android.ui.products.downloads.AddProductDownloadViewModel 
          return (T) new AddProductDownloadViewModel(viewModelCImpl.savedStateHandle);

          case 5: // com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel 
          return (T) new AddressViewModel(viewModelCImpl.savedStateHandle, singletonC.provideSelectedSiteProvider.get(), singletonC.wCDataStoreProvider.get(), viewModelCImpl.getLocations());

          case 6: // com.woocommerce.android.ui.analytics.AnalyticsViewModel 
          return (T) new AnalyticsViewModel(singletonC.resourceProvider(), viewModelCImpl.dateUtils(), viewModelCImpl.analyticsDateRangeCalculator(), viewModelCImpl.savedStateHandle);

          case 7: // com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel 
          return (T) new CardReaderConnectViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.cardReaderTracker(), new AppPrefsWrapper(), viewModelCImpl.cardReaderLocationRepository(), singletonC.provideSelectedSiteProvider.get(), singletonC.provideCardReaderManagerProvider.get(), singletonC.cardReaderTrackingInfoImplProvider.get());

          case 8: // com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel 
          return (T) new CardReaderDetailViewModel(singletonC.provideCardReaderManagerProvider.get(), viewModelCImpl.cardReaderTracker(), new AppPrefsWrapper(), singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.savedStateHandle);

          case 9: // com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel 
          return (T) new CardReaderHubViewModel(viewModelCImpl.savedStateHandle, new InPersonPaymentsCanadaFeatureFlag(), new AppPrefsWrapper(), singletonC.provideSelectedSiteProvider.get());

          case 10: // com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel 
          return (T) new CardReaderManualsViewModel(viewModelCImpl.savedStateHandle, new InPersonPaymentsCanadaFeatureFlag());

          case 11: // com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel 
          return (T) new CardReaderOnboardingViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.cardReaderOnboardingChecker(), viewModelCImpl.cardReaderTracker(), singletonC.userEligibilityFetcherProvider.get(), singletonC.provideSelectedSiteProvider.get(), new AppPrefsWrapper());

          case 12: // com.woocommerce.android.cardreader.internal.config.CardReaderConfigFactory 
          return (T) CardReaderModule_ProvideCardReaderConfigFactoryFactory.provideCardReaderConfigFactory(singletonC.cardReaderModule);

          case 13: // com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel 
          return (T) new CardReaderPaymentViewModel(viewModelCImpl.savedStateHandle, singletonC.provideCardReaderManagerProvider.get(), viewModelCImpl.orderDetailRepository(), singletonC.resourceProvider(), singletonC.provideSelectedSiteProvider.get(), new AppPrefsWrapper(), viewModelCImpl.cardReaderPaymentCollectibilityChecker(), viewModelCImpl.cardReaderInteracRefundableChecker(), viewModelCImpl.cardReaderTracker(), singletonC.currencyFormatterProvider.get(), new CardReaderPaymentErrorMapper(), new CardReaderInteracRefundErrorMapper(), singletonC.wooCommerceStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.cardReaderTrackingInfoImplProvider.get());

          case 14: // com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel 
          return (T) new CardReaderStatusCheckerViewModel(viewModelCImpl.savedStateHandle, singletonC.provideCardReaderManagerProvider.get(), viewModelCImpl.cardReaderOnboardingChecker(), viewModelCImpl.cardReaderTracker(), new AppPrefsWrapper());

          case 15: // com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel 
          return (T) new CardReaderUpdateViewModel(singletonC.provideCardReaderManagerProvider.get(), viewModelCImpl.cardReaderTracker(), viewModelCImpl.savedStateHandle);

          case 16: // com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel 
          return (T) new CardReaderWelcomeViewModel(viewModelCImpl.savedStateHandle, new AppPrefsWrapper());

          case 17: // com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel 
          return (T) new CouponDetailsViewModel(viewModelCImpl.savedStateHandle, singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.couponRepository(), viewModelCImpl.couponUtils());

          case 18: // com.woocommerce.android.ui.coupons.CouponListViewModel 
          return (T) new CouponListViewModel(viewModelCImpl.savedStateHandle, singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.couponListHandler(), viewModelCImpl.couponUtils(), singletonC.analyticsTrackerWrapperProvider.get());

          case 19: // com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel 
          return (T) new CouponRestrictionsViewModel(viewModelCImpl.savedStateHandle);

          case 20: // com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel 
          return (T) new CreateShippingLabelViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.parameterRepository(), viewModelCImpl.orderDetailRepository(), singletonC.shippingLabelRepositoryProvider.get(), new ShippingLabelsStateMachine(), viewModelCImpl.shippingLabelAddressValidator(), singletonC.provideSelectedSiteProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.accountStoreProvider.get(), singletonC.resourceProvider(), singletonC.currencyFormatterProvider.get(), viewModelCImpl.getLocations());

          case 21: // com.woocommerce.android.ui.coupons.edit.EditCouponViewModel 
          return (T) new EditCouponViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.couponRepository(), viewModelCImpl.couponUtils(), viewModelCImpl.parameterRepository());

          case 22: // com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel 
          return (T) new EditShippingLabelAddressViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.shippingLabelAddressValidator(), singletonC.resourceProvider(), singletonC.wCDataStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());

          case 23: // com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel 
          return (T) new EditShippingLabelPackagesViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.parameterRepository(), viewModelCImpl.orderDetailRepository(), viewModelCImpl.productDetailRepository(), viewModelCImpl.variationDetailRepository(), singletonC.shippingLabelRepositoryProvider.get());

          case 24: // com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel 
          return (T) new EditShippingLabelPaymentViewModel(viewModelCImpl.savedStateHandle, singletonC.shippingLabelRepositoryProvider.get());

          case 25: // com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel 
          return (T) new EditVariationAttributesViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.productDetailRepository(), viewModelCImpl.variationDetailRepository());

          case 26: // com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel 
          return (T) new EmailRestrictionViewModel(viewModelCImpl.savedStateHandle);

          case 27: // com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel 
          return (T) new FeatureAnnouncementViewModel(viewModelCImpl.savedStateHandle, singletonC.providesAppPrefsProvider.get(), singletonC.buildConfigWrapperProvider.get());

          case 28: // com.woocommerce.android.ui.products.GroupedProductListViewModel 
          return (T) new GroupedProductListViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.groupedProductListRepository());

          case 29: // com.woocommerce.android.ui.inbox.InboxViewModel 
          return (T) new InboxViewModel(singletonC.resourceProvider(), viewModelCImpl.dateUtils(), viewModelCImpl.inboxRepository(), viewModelCImpl.savedStateHandle);

          case 30: // com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel 
          return (T) new InstallWcShippingFlowViewModel(viewModelCImpl.savedStateHandle);

          case 31: // com.woocommerce.android.ui.refunds.IssueRefundViewModel 
          return (T) new IssueRefundViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.currencyFormatterProvider.get(), singletonC.wCOrderStoreProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.provideNetworkStatusProvider.get(), singletonC.resourceProvider(), viewModelCImpl.orderDetailRepository(), singletonC.wCGatewayStoreProvider.get(), singletonC.wCRefundStoreProvider.get(), viewModelCImpl.paymentChargeRepository(), viewModelCImpl.orderMapper(), new InPersonPaymentsCanadaFeatureFlag(), singletonC.analyticsTrackerWrapperProvider.get());

          case 32: // com.woocommerce.android.ui.jetpack.JetpackInstallViewModel 
          return (T) new JetpackInstallViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.pluginRepository(), singletonC.provideSelectedSiteProvider.get(), singletonC.wooCommerceStoreProvider.get());

          case 33: // com.woocommerce.android.ui.login.LoginNoJetpackViewModel 
          return (T) new LoginNoJetpackViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.loginNoJetpackRepository());

          case 34: // com.woocommerce.android.ui.login.MagicLinkInterceptViewModel 
          return (T) new MagicLinkInterceptViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.magicLinkInterceptRepository());

          case 35: // com.woocommerce.android.ui.main.MainActivityViewModel 
          return (T) new MainActivityViewModel(viewModelCImpl.savedStateHandle, singletonC.siteStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.notificationMessageHandlerProvider.get(), viewModelCImpl.featureAnnouncementRepository(), singletonC.buildConfigWrapperProvider.get(), singletonC.providesAppPrefsProvider.get(), singletonC.unseenReviewsCountHandlerProvider.get());

          case 36: // org.wordpress.android.mediapicker.viewmodel.MediaPickerViewModel 
          return (T) new MediaPickerViewModel(viewModelCImpl.savedStateHandle, singletonC.mediaPickerLoaderFactory(), viewModelCImpl.mediaPickerTracker(), singletonC.mediaPickerPermissionUtilsProvider.get(), viewModelCImpl.resourceProvider(), new MediaPickerMimeTypeProvider(), singletonC.mediaPickerUtilsProvider.get(), viewModelCImpl.mediaManager(), new MediaPickerSetupFactory());

          case 37: // com.woocommerce.android.ui.media.MediaUploadErrorListViewModel 
          return (T) new MediaUploadErrorListViewModel(singletonC.resourceProvider(), singletonC.mediaFileUploadHandlerProvider.get(), viewModelCImpl.savedStateHandle);

          case 38: // com.woocommerce.android.ui.moremenu.MoreMenuViewModel 
          return (T) new MoreMenuViewModel(viewModelCImpl.savedStateHandle, singletonC.accountStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.moreMenuRepository(), singletonC.unseenReviewsCountHandlerProvider.get());

          case 39: // com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel 
          return (T) new MoveShippingItemViewModel(viewModelCImpl.savedStateHandle);

          case 40: // com.woocommerce.android.ui.mystore.MyStoreViewModel 
          return (T) new MyStoreViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), singletonC.resourceProvider(), singletonC.wooCommerceStoreProvider.get(), viewModelCImpl.getStats(), viewModelCImpl.getTopPerformers(), singletonC.currencyFormatterProvider.get(), singletonC.provideSelectedSiteProvider.get(), new AppPrefsWrapper(), singletonC.myStoreStatsUsageTracksEventEmitterProvider.get());

          case 41: // com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel 
          return (T) new OrderCreationFeeViewModel(viewModelCImpl.savedStateHandle);

          case 42: // com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel 
          return (T) new OrderCreationProductSelectionViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productListRepository());

          case 43: // com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel 
          return (T) new OrderCreationShippingViewModel(viewModelCImpl.savedStateHandle);

          case 44: // com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel 
          return (T) new OrderCreationVariationSelectionViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.variationRepository(), viewModelCImpl.productDetailRepository(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));

          case 45: // com.woocommerce.android.ui.orders.creation.OrderCreationViewModel 
          return (T) new OrderCreationViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.orderDetailRepository(), viewModelCImpl.orderCreationRepository(), viewModelCImpl.mapItemToProductUiModel(), viewModelCImpl.createOrUpdateOrderDraft(), viewModelCImpl.createOrderItem(), viewModelCImpl.parameterRepository());

          case 46: // com.woocommerce.android.ui.orders.details.OrderDetailViewModel 
          return (T) new OrderDetailViewModel(ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.savedStateHandle, singletonC.providesAppPrefsProvider.get(), singletonC.provideNetworkStatusProvider.get(), singletonC.resourceProvider(), viewModelCImpl.orderDetailRepository(), viewModelCImpl.addonRepository(), singletonC.provideSelectedSiteProvider.get(), singletonC.productImageMapProvider.get(), viewModelCImpl.cardReaderPaymentCollectibilityChecker(), viewModelCImpl.cardReaderTracker(), singletonC.analyticsTrackerWrapperProvider.get(), viewModelCImpl.shippingLabelOnboardingRepository());

          case 47: // com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel 
          return (T) new OrderEditingViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.orderDetailRepository(), viewModelCImpl.orderEditingRepositoryProvider.get(), singletonC.provideNetworkStatusProvider.get());

          case 48: // com.woocommerce.android.ui.orders.details.editing.OrderEditingRepository 
          return (T) new OrderEditingRepository(singletonC.orderUpdateStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());

          case 49: // com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel 
          return (T) new OrderFilterCategoriesViewModel(viewModelCImpl.savedStateHandle, singletonC.resourceProvider(), viewModelCImpl.getOrderStatusFilterOptions(), viewModelCImpl.getDateRangeFilterOptions(), singletonC.orderFiltersRepositoryProvider.get(), viewModelCImpl.getTrackingForFilterSelection(), viewModelCImpl.dateUtils());

          case 50: // com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel 
          return (T) new OrderFilterOptionsViewModel(viewModelCImpl.savedStateHandle, singletonC.resourceProvider(), singletonC.orderFiltersRepositoryProvider.get(), viewModelCImpl.getTrackingForFilterSelection(), viewModelCImpl.dateUtils());

          case 51: // com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel 
          return (T) new OrderFulfillViewModel(viewModelCImpl.savedStateHandle, singletonC.providesAppPrefsProvider.get(), singletonC.provideNetworkStatusProvider.get(), singletonC.resourceProvider(), viewModelCImpl.orderDetailRepository(), singletonC.analyticsTrackerWrapperProvider.get());

          case 52: // com.woocommerce.android.ui.orders.list.OrderListViewModel 
          return (T) new OrderListViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.orderListRepository(), singletonC.wCOrderStoreProvider.get(), singletonC.listStoreProvider.get(), singletonC.provideNetworkStatusProvider.get(), singletonC.dispatcherProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.wCOrderFetcherProvider.get(), singletonC.resourceProvider(), new AppPrefsWrapper(), viewModelCImpl.getWCOrderListDescriptorWithFilters(), viewModelCImpl.getSelectedOrderFiltersCount());

          case 53: // com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel 
          return (T) new OrderedAddonViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.addonRepository(), viewModelCImpl.parameterRepository());

          case 54: // com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel 
          return (T) new PrintShippingLabelCustomsFormViewModel(viewModelCImpl.savedStateHandle, new FileUtils(), viewModelCImpl.fileDownloader());

          case 55: // com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel 
          return (T) new PrintShippingLabelViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.shippingLabelRepositoryProvider.get(), singletonC.provideNetworkStatusProvider.get(), new FileUtils(), new Base64Decoder());

          case 56: // com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel 
          return (T) new ProductCategorySelectorViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productCategoryListHandler());

          case 57: // com.woocommerce.android.ui.products.ProductDetailViewModel 
          return (T) new ProductDetailViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), viewModelCImpl.parameterRepository(), viewModelCImpl.productDetailRepository(), singletonC.provideNetworkStatusProvider.get(), singletonC.currencyFormatterProvider.get(), singletonC.resourceProvider(), viewModelCImpl.productCategoriesRepository(), viewModelCImpl.productTagsRepository(), singletonC.mediaFilesRepository(), viewModelCImpl.variationRepository(), singletonC.mediaFileUploadHandlerProvider.get(), singletonC.providesAppPrefsProvider.get(), viewModelCImpl.addonRepository());

          case 58: // com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel 
          return (T) new ProductDownloadDetailsViewModel(viewModelCImpl.savedStateHandle, singletonC.resourceProvider());

          case 59: // com.woocommerce.android.ui.products.ProductFilterListViewModel 
          return (T) new ProductFilterListViewModel(viewModelCImpl.savedStateHandle, singletonC.resourceProvider(), viewModelCImpl.productCategoriesRepository(), singletonC.provideNetworkStatusProvider.get());

          case 60: // com.woocommerce.android.ui.products.ProductImagesViewModel 
          return (T) new ProductImagesViewModel(singletonC.provideNetworkStatusProvider.get(), singletonC.mediaFileUploadHandlerProvider.get(), singletonC.resourceProvider(), viewModelCImpl.savedStateHandle);

          case 61: // com.woocommerce.android.ui.products.ProductInventoryViewModel 
          return (T) new ProductInventoryViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productDetailRepository());

          case 62: // com.woocommerce.android.ui.products.ProductListViewModel 
          return (T) new ProductListViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productListRepository(), singletonC.provideNetworkStatusProvider.get(), singletonC.mediaFileUploadHandlerProvider.get());

          case 63: // com.woocommerce.android.ui.products.ProductPricingViewModel 
          return (T) new ProductPricingViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productDetailRepository(), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.parameterRepository());

          case 64: // com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel 
          return (T) new ProductReviewsViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.productReviewsRepository(), singletonC.reviewModerationHandlerProvider.get());

          case 65: // com.woocommerce.android.ui.products.ProductSelectionListViewModel 
          return (T) new ProductSelectionListViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.productListRepository());

          case 66: // com.woocommerce.android.ui.products.selector.ProductSelectorViewModel 
          return (T) new ProductSelectorViewModel(viewModelCImpl.savedStateHandle, singletonC.currencyFormatterProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.productListHandler(), viewModelCImpl.variationSelectorRepository(), singletonC.resourceProvider());

          case 67: // com.woocommerce.android.ui.products.ProductShippingClassViewModel 
          return (T) new ProductShippingClassViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productShippingClassRepository(), singletonC.resourceProvider());

          case 68: // com.woocommerce.android.ui.products.ProductShippingViewModel 
          return (T) new ProductShippingViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.parameterRepository(), viewModelCImpl.productDetailRepository());

          case 69: // com.woocommerce.android.ui.products.ProductSortingViewModel 
          return (T) new ProductSortingViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.productListRepository());

          case 70: // com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel 
          return (T) new ProductTypesBottomSheetViewModel(viewModelCImpl.savedStateHandle, singletonC.providesAppPrefsProvider.get(), new ProductTypeBottomSheetBuilder());

          case 71: // com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel 
          return (T) new ReceiptPreviewViewModel(viewModelCImpl.savedStateHandle, singletonC.analyticsTrackerWrapperProvider.get(), singletonC.provideSelectedSiteProvider.get());

          case 72: // com.woocommerce.android.ui.refunds.RefundDetailViewModel 
          return (T) new RefundDetailViewModel(viewModelCImpl.savedStateHandle, singletonC.wCOrderStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.provideSelectedSiteProvider.get(), singletonC.currencyFormatterProvider.get(), singletonC.resourceProvider(), viewModelCImpl.addonRepository(), singletonC.wCRefundStoreProvider.get(), viewModelCImpl.orderMapper());

          case 73: // com.woocommerce.android.ui.reviews.ReviewDetailViewModel 
          return (T) new ReviewDetailViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.reviewDetailRepository(), viewModelCImpl.markReviewAsSeen(), singletonC.reviewModerationHandlerProvider.get());

          case 74: // com.woocommerce.android.ui.reviews.ReviewListViewModel 
          return (T) new ReviewListViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), singletonC.dispatcherProvider.get(), viewModelCImpl.reviewListRepository(), viewModelCImpl.markAllReviewsAsSeen(), singletonC.unseenReviewsCountHandlerProvider.get(), singletonC.reviewModerationHandlerProvider.get());

          case 75: // com.woocommerce.android.support.SSRActivityViewModel 
          return (T) new SSRActivityViewModel(viewModelCImpl.savedStateHandle, ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.provideNetworkStatusProvider.get());

          case 76: // com.woocommerce.android.ui.searchfilter.SearchFilterViewModel 
          return (T) new SearchFilterViewModel();

          case 77: // com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel 
          return (T) new ShippingCarrierRatesViewModel(viewModelCImpl.savedStateHandle, singletonC.shippingLabelRepositoryProvider.get(), singletonC.resourceProvider(), singletonC.currencyFormatterProvider.get());

          case 78: // com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel 
          return (T) new ShippingCustomsViewModel(viewModelCImpl.savedStateHandle, singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.parameterRepository(), singletonC.wCDataStoreProvider.get(), singletonC.resourceProvider());

          case 79: // com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel 
          return (T) new ShippingLabelAddressSuggestionViewModel(viewModelCImpl.savedStateHandle);

          case 80: // com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel 
          return (T) new ShippingLabelCreateCustomPackageViewModel(viewModelCImpl.savedStateHandle, singletonC.resourceProvider(), singletonC.shippingLabelRepositoryProvider.get(), viewModelCImpl.parameterRepository());

          case 81: // com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageViewModel 
          return (T) new ShippingLabelCreatePackageViewModel(viewModelCImpl.savedStateHandle);

          case 82: // com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel 
          return (T) new ShippingLabelCreateServicePackageViewModel(viewModelCImpl.savedStateHandle, singletonC.resourceProvider(), singletonC.shippingLabelRepositoryProvider.get(), viewModelCImpl.parameterRepository());

          case 83: // com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel 
          return (T) new ShippingLabelRefundViewModel(viewModelCImpl.savedStateHandle, singletonC.shippingLabelRepositoryProvider.get(), singletonC.provideNetworkStatusProvider.get());

          case 84: // com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel 
          return (T) new ShippingPackageSelectorViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.parameterRepository(), singletonC.shippingLabelRepositoryProvider.get());

          case 85: // com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel 
          return (T) new SimplePaymentsDialogViewModel(viewModelCImpl.savedStateHandle, singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.orderCreationRepository());

          case 86: // com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel 
          return (T) new SimplePaymentsFragmentViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.simplePaymentsRepositoryProvider.get(), singletonC.provideNetworkStatusProvider.get(), viewModelCImpl.orderCreationRepository());

          case 87: // com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsRepository 
          return (T) new SimplePaymentsRepository(singletonC.orderUpdateStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());

          case 88: // com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel 
          return (T) new SimplePaymentsSharedViewModel(viewModelCImpl.savedStateHandle, singletonC.provideSelectedSiteProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.currencyFormatterProvider.get());

          case 89: // com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel 
          return (T) new SimpleTextEditorViewModel(viewModelCImpl.savedStateHandle);

          case 90: // com.woocommerce.android.ui.sitepicker.SitePickerViewModel 
          return (T) new SitePickerViewModel(viewModelCImpl.savedStateHandle, singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.sitePickerRepository(), singletonC.resourceProvider(), new AppPrefsWrapper(), singletonC.unifiedLoginTrackerProvider.get(), singletonC.analyticsTrackerWrapperProvider.get(), singletonC.userEligibilityFetcherProvider.get());

          case 91: // com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel 
          return (T) new TakePaymentViewModel(viewModelCImpl.savedStateHandle, singletonC.provideSelectedSiteProvider.get(), singletonC.wCOrderStoreProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule), singletonC.provideNetworkStatusProvider.get());

          case 92: // com.woocommerce.android.ui.common.UserEligibilityErrorViewModel 
          return (T) new UserEligibilityErrorViewModel(viewModelCImpl.savedStateHandle, singletonC.providesAppPrefsProvider.get(), singletonC.dispatcherProvider.get(), singletonC.accountStoreProvider.get(), singletonC.userEligibilityFetcherProvider.get());

          case 93: // com.woocommerce.android.ui.products.variations.VariationDetailViewModel 
          return (T) new VariationDetailViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.variationDetailRepository(), viewModelCImpl.productDetailRepository(), singletonC.provideNetworkStatusProvider.get(), singletonC.currencyFormatterProvider.get(), viewModelCImpl.parameterRepository(), singletonC.mediaFileUploadHandlerProvider.get(), singletonC.resourceProvider());

          case 94: // com.woocommerce.android.ui.products.variations.VariationListViewModel 
          return (T) new VariationListViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.variationRepository(), viewModelCImpl.productDetailRepository(), singletonC.provideNetworkStatusProvider.get(), singletonC.currencyFormatterProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));

          case 95: // com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel 
          return (T) new VariationSelectorViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.variationSelectorRepository(), singletonC.currencyFormatterProvider.get(), singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), viewModelCImpl.variationListHandler(), singletonC.resourceProvider());

          case 96: // com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel 
          return (T) new VariationsBulkUpdateAttrPickerViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.parameterRepository());

          case 97: // com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel 
          return (T) new VariationsBulkUpdatePriceViewModel(viewModelCImpl.savedStateHandle, viewModelCImpl.parameterRepository(), viewModelCImpl.variationRepository(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends Default_HiltComponents.ActivityRetainedC {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerDefault_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerDefault_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerDefault_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends Default_HiltComponents.ServiceC {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerDefault_HiltComponents_SingletonC singletonC, Service serviceParam) {
      this.singletonC = singletonC;


    }

    private InvalidateDeviceRegistration invalidateDeviceRegistration() {
      return new InvalidateDeviceRegistration(singletonC.preferenceUtilsWrapper());
    }

    @Override
    public void injectProductImagesService(ProductImagesService arg0) {
      injectProductImagesService2(arg0);
    }

    @Override
    public void injectFCMMessageService(FCMMessageService arg0) {
      injectFCMMessageService2(arg0);
    }

    @Override
    public void injectNotificationsProcessingService(NotificationsProcessingService arg0) {
      injectNotificationsProcessingService2(arg0);
    }

    @CanIgnoreReturnValue
    private ProductImagesService injectProductImagesService2(ProductImagesService instance) {
      ProductImagesService_MembersInjector.injectNotifHandler(instance, singletonC.productImagesNotificationHandlerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private FCMMessageService injectFCMMessageService2(FCMMessageService instance) {
      FCMMessageService_MembersInjector.injectNotificationMessageHandler(instance, singletonC.notificationMessageHandlerProvider.get());
      FCMMessageService_MembersInjector.injectAppPrefsWrapper(instance, new AppPrefsWrapper());
      FCMMessageService_MembersInjector.injectRegisterDevice(instance, singletonC.registerDevice());
      FCMMessageService_MembersInjector.injectInvalidateDeviceRegistration(instance, invalidateDeviceRegistration());
      return instance;
    }

    @CanIgnoreReturnValue
    private NotificationsProcessingService injectNotificationsProcessingService2(
        NotificationsProcessingService instance) {
      NotificationsProcessingService_MembersInjector.injectNotificationMessageHandler(instance, singletonC.notificationMessageHandlerProvider.get());
      return instance;
    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerDefault_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerDefault_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    private T get0() {
      switch (id) {
        case 0: // com.woocommerce.android.di.ActivityBindingModule_ProvideMagicLinkInterceptActivityInjector.MagicLinkInterceptActivitySubcomponent.Factory 
        return (T) new MagicLinkInterceptActivitySubcomponentFactory(singletonC);

        case 1: // org.wordpress.android.login.di.LoginServiceModule_LoginWpcomService.LoginWpcomServiceSubcomponent.Factory 
        return (T) new LoginWpcomServiceSubcomponentFactory(singletonC);

        case 2: // com.woocommerce.android.AppInitializer 
        return (T) singletonC.injectAppInitializer(AppInitializer_Factory.newInstance());

        case 3: // com.automattic.android.tracks.crashlogging.CrashLogging 
        return (T) CrashLoggingModule_Companion_ProvideCrashLoggingFactory.provideCrashLogging(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.wCCrashLoggingDataProvider());

        case 4: // org.wordpress.android.fluxc.store.AccountStore 
        return (T) new AccountStore(singletonC.dispatcherProvider.get(), singletonC.accountRestClientProvider.get(), singletonC.selfHostedEndpointFinder(), singletonC.authenticator(), singletonC.accessTokenProvider.get());

        case 5: // org.wordpress.android.fluxc.Dispatcher 
        return (T) new Dispatcher();

        case 6: // org.wordpress.android.fluxc.network.rest.wpcom.account.AccountRestClient 
        return (T) new AccountRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), AppConfigModule_ProvideAppSecretsFactory.provideAppSecrets(singletonC.appConfigModule), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 7: // @javax.inject.Named("regular") com.android.volley.RequestQueue 
        return (T) ReleaseNetworkModule_ProvideRequestQueueFactory.provideRequestQueue(singletonC.releaseNetworkModule, singletonC.provideMediaOkHttpClientInstanceProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 8: // @javax.inject.Named("regular") okhttp3.OkHttpClient 
        return (T) OkHttpClientModule_ProvideMediaOkHttpClientInstanceFactory.provideMediaOkHttpClientInstance(singletonC.provideCookieJarProvider.get(), singletonC.namedSetOfInterceptor(), singletonC.namedSetOfInterceptor2());

        case 9: // okhttp3.CookieJar 
        return (T) ReleaseNetworkModule_ProvideCookieJarFactory.provideCookieJar(singletonC.releaseNetworkModule, singletonC.provideCookieManagerProvider.get());

        case 10: // java.net.CookieManager 
        return (T) ReleaseNetworkModule_ProvideCookieManagerFactory.provideCookieManager(singletonC.releaseNetworkModule);

        case 11: // org.wordpress.android.fluxc.network.rest.wpcom.auth.AccessToken 
        return (T) new AccessToken(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 12: // org.wordpress.android.fluxc.network.discovery.DiscoveryXMLRPCClient 
        return (T) new DiscoveryXMLRPCClient(singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueCustomSSLProvider.get(), singletonC.userAgent(), new HTTPAuthManager());

        case 13: // @javax.inject.Named("custom-ssl") com.android.volley.RequestQueue 
        return (T) ReleaseNetworkModule_ProvideRequestQueueCustomSSLFactory.provideRequestQueueCustomSSL(singletonC.releaseNetworkModule, singletonC.provideMediaOkHttpClientInstanceCustomSSLProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 14: // @javax.inject.Named("custom-ssl") okhttp3.OkHttpClient 
        return (T) OkHttpClientModule_ProvideMediaOkHttpClientInstanceCustomSSLFactory.provideMediaOkHttpClientInstanceCustomSSL(singletonC.provideMediaOkHttpClientInstanceProvider.get(), singletonC.provideMemorizingTrustManagerProvider.get());

        case 15: // org.wordpress.android.fluxc.network.MemorizingTrustManager 
        return (T) ReleaseNetworkModule_ProvideMemorizingTrustManagerFactory.provideMemorizingTrustManager(singletonC.releaseNetworkModule);

        case 16: // org.wordpress.android.fluxc.network.discovery.DiscoveryWPAPIRestClient 
        return (T) new DiscoveryWPAPIRestClient(singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueCustomSSLProvider.get(), singletonC.userAgent());

        case 17: // com.woocommerce.android.tools.SelectedSite 
        return (T) SelectedSiteModule_ProvideSelectedSiteFactory.provideSelectedSite(singletonC.selectedSiteModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.siteStoreProvider.get());

        case 18: // org.wordpress.android.fluxc.store.SiteStore 
        return (T) new SiteStore(singletonC.dispatcherProvider.get(), singletonC.postSqlUtilsProvider.get(), singletonC.siteRestClientProvider.get(), singletonC.siteXMLRPCClientProvider.get(), singletonC.privateAtomicCookieProvider.get(), singletonC.siteSqlUtilsProvider.get(), singletonC.coroutineEngine());

        case 19: // org.wordpress.android.fluxc.persistence.PostSqlUtils 
        return (T) new PostSqlUtils();

        case 20: // org.wordpress.android.fluxc.network.rest.wpcom.site.SiteRestClient 
        return (T) new SiteRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), AppConfigModule_ProvideAppSecretsFactory.provideAppSecrets(singletonC.appConfigModule), singletonC.wPComGsonRequestBuilderProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 21: // org.wordpress.android.fluxc.network.rest.wpcom.WPComGsonRequestBuilder 
        return (T) new WPComGsonRequestBuilder();

        case 22: // org.wordpress.android.fluxc.network.xmlrpc.site.SiteXMLRPCClient 
        return (T) new SiteXMLRPCClient(singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueCustomSSLProvider.get(), singletonC.userAgent(), new HTTPAuthManager(), singletonC.xMLRPCRequestBuilderProvider.get());

        case 23: // org.wordpress.android.fluxc.network.xmlrpc.XMLRPCRequestBuilder 
        return (T) new XMLRPCRequestBuilder();

        case 24: // org.wordpress.android.fluxc.network.rest.wpcom.site.PrivateAtomicCookie 
        return (T) new PrivateAtomicCookie(singletonC.preferenceUtilsWrapper());

        case 25: // org.wordpress.android.fluxc.persistence.SiteSqlUtils 
        return (T) new SiteSqlUtils();

        case 26: // kotlin.coroutines.CoroutineContext 
        return (T) ReleaseNetworkModule_ProvideCoroutineContextFactory.provideCoroutineContext(singletonC.releaseNetworkModule);

        case 27: // com.woocommerce.android.AppPrefs 
        return (T) AppConfigModule_ProvidesAppPrefsFactory.providesAppPrefs(singletonC.appConfigModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 28: // com.woocommerce.android.tools.NetworkStatus 
        return (T) NetworkStatusModule_ProvideNetworkStatusFactory.provideNetworkStatus(singletonC.networkStatusModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 29: // com.woocommerce.android.util.BuildConfigWrapper 
        return (T) new BuildConfigWrapper();

        case 30: // org.wordpress.android.fluxc.store.WooCommerceStore 
        return (T) new WooCommerceStore(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.coroutineEngine(), singletonC.siteStoreProvider.get(), singletonC.wooSystemRestClientProvider.get(), singletonC.wooCommerceRestClientProvider.get(), new WCSettingsMapper(), singletonC.siteSqlUtilsProvider.get());

        case 31: // org.wordpress.android.fluxc.network.rest.wpcom.wc.system.WooSystemRestClient 
        return (T) new WooSystemRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 32: // org.wordpress.android.fluxc.network.rest.wpcom.jetpacktunnel.JetpackTunnelGsonRequestBuilder 
        return (T) new JetpackTunnelGsonRequestBuilder();

        case 33: // org.wordpress.android.fluxc.network.rest.wpcom.wc.WooCommerceRestClient 
        return (T) new WooCommerceRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 34: // com.woocommerce.android.support.ZendeskHelper 
        return (T) SupportModule_ProvideZendeskHelperFactory.provideZendeskHelper(singletonC.supportModule, singletonC.accountStoreProvider.get(), singletonC.siteStoreProvider.get(), singletonC.provideSupportHelperProvider.get());

        case 35: // com.woocommerce.android.support.SupportHelper 
        return (T) SupportModule_ProvideSupportHelperFactory.provideSupportHelper(singletonC.supportModule);

        case 36: // com.woocommerce.android.push.WooNotificationBuilder 
        return (T) NotificationModule_ProvideWooNotificationBuilderFactory.provideWooNotificationBuilder(singletonC.notificationModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 37: // com.woocommerce.android.ui.common.UserEligibilityFetcher 
        return (T) new UserEligibilityFetcher(singletonC.providesAppPrefsProvider.get(), singletonC.wCUserStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());

        case 38: // org.wordpress.android.fluxc.store.WCUserStore 
        return (T) new WCUserStore(singletonC.wCUserRestClientProvider.get(), singletonC.coroutineEngine(), new WCUserMapper());

        case 39: // org.wordpress.android.fluxc.network.rest.wpcom.wc.user.WCUserRestClient 
        return (T) new WCUserRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 40: // org.wordpress.android.fluxc.store.EncryptedLogStore 
        return (T) new EncryptedLogStore(singletonC.encryptedLogRestClientProvider.get(), singletonC.encryptedLogSqlUtilsProvider.get(), singletonC.coroutineEngine(), singletonC.logEncrypterProvider.get(), singletonC.preferenceUtilsWrapper(), singletonC.dispatcherProvider.get());

        case 41: // org.wordpress.android.fluxc.network.rest.wpcom.encryptedlog.EncryptedLogRestClient 
        return (T) new EncryptedLogRestClient(singletonC.provideRequestQueueProvider.get(), AppConfigModule_ProvideAppSecretsFactory.provideAppSecrets(singletonC.appConfigModule));

        case 42: // org.wordpress.android.fluxc.persistence.EncryptedLogSqlUtils 
        return (T) new EncryptedLogSqlUtils();

        case 43: // org.wordpress.android.fluxc.model.encryptedlogging.LogEncrypter 
        return (T) new LogEncrypter(CrashLoggingModule_Companion_ProvideEncryptedLoggingKeyFactory.provideEncryptedLoggingKey());

        case 44: // com.woocommerce.android.util.encryptedlogging.ObserveEncryptedLogsUploadResult 
        return (T) new ObserveEncryptedLogsUploadResult(singletonC.dispatcherProvider.get(), singletonC.analyticsTrackerWrapperProvider.get(), new AppLogWrapper());

        case 45: // com.woocommerce.android.analytics.AnalyticsTrackerWrapper 
        return (T) new AnalyticsTrackerWrapper();

        case 46: // org.wordpress.android.fluxc.network.rest.wpcom.wc.tracker.TrackerStore 
        return (T) new TrackerStore(singletonC.trackerRestClientProvider.get());

        case 47: // org.wordpress.android.fluxc.network.rest.wpcom.wc.tracker.TrackerRestClient 
        return (T) new TrackerRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get());

        case 48: // @com.woocommerce.android.datastore.DataStoreQualifier(TRACKER) androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> 
        return (T) DataStoreModule_ProvideTrackerDataStoreFactory.provideTrackerDataStore(singletonC.dataStoreModule, ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideAppCoroutineScopeProvider.get());

        case 49: // @com.woocommerce.android.di.AppCoroutineScope kotlinx.coroutines.CoroutineScope 
        return (T) ApplicationModule_Companion_ProvideAppCoroutineScopeFactory.provideAppCoroutineScope(ApplicationModule_Companion_ProvideBackgroundDispatcherFactory.provideBackgroundDispatcher());

        case 50: // org.wordpress.android.fluxc.store.NotificationStore 
        return (T) new NotificationStore(singletonC.dispatcherProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.notificationRestClientProvider.get(), singletonC.notificationSqlUtilsProvider.get(), singletonC.coroutineEngine());

        case 51: // org.wordpress.android.fluxc.network.rest.wpcom.notifications.NotificationRestClient 
        return (T) new NotificationRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent(), singletonC.wPComGsonRequestBuilderProvider.get());

        case 52: // org.wordpress.android.fluxc.persistence.NotificationSqlUtils 
        return (T) new NotificationSqlUtils(singletonC.formattableContentMapper());

        case 53: // com.google.gson.Gson 
        return (T) ReleaseNetworkModule_ProvideGsonFactory.provideGson(singletonC.releaseNetworkModule);

        case 54: // com.woocommerce.android.network.ConnectionChangeReceiver 
        return (T) new ConnectionChangeReceiver();

        case 55: // com.woocommerce.android.ui.login.UnifiedLoginTracker 
        return (T) new UnifiedLoginTracker(singletonC.analyticsTrackerWrapperProvider.get());

        case 56: // com.woocommerce.android.tools.ProductImageMap 
        return (T) new ProductImageMap(singletonC.provideSelectedSiteProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.provideAppCoroutineScopeProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));

        case 57: // org.wordpress.android.fluxc.store.WCProductStore 
        return (T) new WCProductStore(singletonC.dispatcherProvider.get(), singletonC.productRestClientProvider.get(), singletonC.coroutineEngine(), singletonC.addonsDao(), new AppLogWrapper());

        case 58: // org.wordpress.android.fluxc.network.rest.wpcom.wc.product.ProductRestClient 
        return (T) new ProductRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get());

        case 59: // org.wordpress.android.fluxc.persistence.WCAndroidDatabase 
        return (T) WCDatabaseModule_Companion_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 60: // org.wordpress.android.fluxc.store.WCOrderStore 
        return (T) new WCOrderStore(singletonC.dispatcherProvider.get(), singletonC.orderRestClientProvider.get(), singletonC.wCOrderFetcherProvider.get(), singletonC.coroutineEngine(), singletonC.ordersDao(), singletonC.orderNotesDao());

        case 61: // org.wordpress.android.fluxc.network.rest.wpcom.wc.order.OrderRestClient 
        return (T) new OrderRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), singletonC.orderDtoMapper(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 62: // org.wordpress.android.fluxc.store.WCOrderFetcher 
        return (T) new WCOrderFetcher(singletonC.dispatcherProvider.get());

        case 63: // com.woocommerce.android.cardreader.CardReaderManager 
        return (T) CardReaderModule_ProvideCardReaderManagerFactory.provideCardReaderManager(singletonC.cardReaderModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.cardReaderStore(), CardReaderModule_ProvideLogWrapperFactory.provideLogWrapper(singletonC.cardReaderModule));

        case 64: // org.wordpress.android.fluxc.store.WCInPersonPaymentsStore 
        return (T) new WCInPersonPaymentsStore(singletonC.coroutineEngine(), singletonC.inPersonPaymentsRestClientProvider.get());

        case 65: // org.wordpress.android.fluxc.network.rest.wpcom.wc.payments.inperson.InPersonPaymentsRestClient 
        return (T) new InPersonPaymentsRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 66: // com.woocommerce.android.push.NotificationMessageHandler 
        return (T) new NotificationMessageHandler(singletonC.accountStoreProvider.get(), new WooLogWrapper(), singletonC.dispatcherProvider.get(), singletonC.siteStoreProvider.get(), new AppPrefsWrapper(), singletonC.resourceProvider(), singletonC.provideWooNotificationBuilderProvider.get(), singletonC.notificationAnalyticsTrackerProvider.get(), singletonC.provideZendeskHelperProvider.get(), singletonC.notificationsParser());

        case 67: // com.woocommerce.android.push.NotificationAnalyticsTracker 
        return (T) new NotificationAnalyticsTracker(singletonC.provideSelectedSiteProvider.get(), new AppPrefsWrapper(), singletonC.analyticsTrackerWrapperProvider.get());

        case 68: // com.woocommerce.android.util.CurrencyFormatter 
        return (T) new CurrencyFormatter(singletonC.wooCommerceStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.contextBasedLocaleProvider(), singletonC.provideAppCoroutineScopeProvider.get(), ThreadModule_ProvideDispatchersFactory.provideDispatchers(singletonC.threadModule));

        case 69: // com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter 
        return (T) new MyStoreStatsUsageTracksEventEmitter(singletonC.analyticsTrackerWrapperProvider.get(), singletonC.provideAppCoroutineScopeProvider.get(), singletonC.provideSelectedSiteProvider.get());

        case 70: // com.woocommerce.android.ui.orders.OrderNavigator 
        return (T) new OrderNavigator();

        case 71: // org.wordpress.android.fluxc.store.WhatsNewStore 
        return (T) new WhatsNewStore(singletonC.whatsNewRestClientProvider.get(), singletonC.whatsNewSqlUtilsProvider.get(), singletonC.provideCoroutineContextProvider.get(), singletonC.coroutineEngine(), singletonC.dispatcherProvider.get());

        case 72: // org.wordpress.android.fluxc.network.rest.wpcom.whatsnew.WhatsNewRestClient 
        return (T) new WhatsNewRestClient(singletonC.dispatcherProvider.get(), singletonC.wPComGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 73: // org.wordpress.android.fluxc.persistence.WhatsNewSqlUtils 
        return (T) new WhatsNewSqlUtils();

        case 74: // com.woocommerce.android.ui.products.ProductNavigator 
        return (T) new ProductNavigator();

        case 75: // org.wordpress.android.mediapicker.MediaPickerUtils 
        return (T) new MediaPickerUtils(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), new MediaPickerLogger());

        case 76: // com.woocommerce.android.ui.products.variations.VariationNavigator 
        return (T) new VariationNavigator();

        case 77: // org.wordpress.android.mediapicker.util.MediaPickerPermissionUtils 
        return (T) new MediaPickerPermissionUtils(singletonC.permissionsProvider.get(), new MediaPickerLogger(), new com.woocommerce.android.mediapicker.MediaPickerTracker(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 78: // org.wordpress.android.mediapicker.Permissions 
        return (T) new Permissions(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideAppCoroutineScopeProvider.get());

        case 79: // org.wordpress.android.fluxc.store.WCRefundStore 
        return (T) new WCRefundStore(singletonC.refundRestClientProvider.get(), singletonC.coroutineEngine(), new RefundMapper());

        case 80: // org.wordpress.android.fluxc.network.rest.wpcom.wc.refunds.RefundRestClient 
        return (T) new RefundRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 81: // org.wordpress.android.fluxc.store.WCShippingLabelStore 
        return (T) new WCShippingLabelStore(singletonC.shippingLabelRestClientProvider.get(), singletonC.coroutineEngine(), new WCShippingLabelMapper());

        case 82: // org.wordpress.android.fluxc.network.rest.wpcom.wc.shippinglabels.ShippingLabelRestClient 
        return (T) new ShippingLabelRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 83: // org.wordpress.android.fluxc.store.WCDataStore 
        return (T) new WCDataStore(singletonC.wCDataRestClientProvider.get(), singletonC.coroutineEngine(), new WCCountryMapper());

        case 84: // org.wordpress.android.fluxc.network.rest.wpcom.wc.data.WCDataRestClient 
        return (T) new WCDataRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 85: // com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoImpl 
        return (T) new CardReaderTrackingInfoImpl();

        case 86: // org.wordpress.android.fluxc.store.CouponStore 
        return (T) new CouponStore(singletonC.couponRestClientProvider.get(), singletonC.couponsDao(), singletonC.coroutineEngine(), singletonC.provideDatabaseProvider.get());

        case 87: // org.wordpress.android.fluxc.network.rest.wpcom.wc.coupons.CouponRestClient 
        return (T) new CouponRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 88: // com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository 
        return (T) new ShippingLabelRepository(singletonC.wCShippingLabelStoreProvider.get(), singletonC.provideSelectedSiteProvider.get(), singletonC.shippingLabelMapper());

        case 89: // org.wordpress.android.fluxc.store.WCGlobalAttributeStore 
        return (T) new WCGlobalAttributeStore(singletonC.productAttributeRestClientProvider.get(), new WCGlobalAttributeMapper(), singletonC.coroutineEngine());

        case 90: // org.wordpress.android.fluxc.network.rest.wpcom.wc.product.attributes.ProductAttributeRestClient 
        return (T) new ProductAttributeRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get());

        case 91: // org.wordpress.android.fluxc.store.WCTaxStore 
        return (T) new WCTaxStore(singletonC.wCTaxRestClientProvider.get(), singletonC.coroutineEngine(), new WCTaxClassMapper());

        case 92: // org.wordpress.android.fluxc.network.rest.wpcom.wc.taxes.WCTaxRestClient 
        return (T) new WCTaxRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 93: // org.wordpress.android.fluxc.store.WCInboxStore 
        return (T) new WCInboxStore(singletonC.inboxRestClientProvider.get(), singletonC.coroutineEngine(), singletonC.inboxNotesDao());

        case 94: // org.wordpress.android.fluxc.network.rest.wpcom.wc.inbox.InboxRestClient 
        return (T) new InboxRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 95: // org.wordpress.android.fluxc.store.WCGatewayStore 
        return (T) new WCGatewayStore(singletonC.gatewayRestClientProvider.get(), singletonC.coroutineEngine(), new GatewayMapper());

        case 96: // org.wordpress.android.fluxc.network.rest.wpcom.wc.gateways.GatewayRestClient 
        return (T) new GatewayRestClient(singletonC.dispatcherProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 97: // org.wordpress.android.fluxc.store.PluginStore 
        return (T) new PluginStore(singletonC.dispatcherProvider.get(), singletonC.pluginRestClientProvider.get(), singletonC.pluginWPOrgClientProvider.get(), singletonC.pluginCoroutineStore(), singletonC.pluginJetpackTunnelRestClientProvider.get());

        case 98: // org.wordpress.android.fluxc.network.rest.wpcom.plugin.PluginRestClient 
        return (T) new PluginRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 99: // org.wordpress.android.fluxc.network.wporg.plugin.PluginWPOrgClient 
        return (T) new PluginWPOrgClient(singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.userAgent());

        default: throw new AssertionError(id);
      }
    }

    @SuppressWarnings("unchecked")
    private T get1() {
      switch (id) {
        case 100: // org.wordpress.android.fluxc.network.rest.wpapi.plugin.PluginWPAPIRestClient 
        return (T) new PluginWPAPIRestClient(new WPAPIGsonRequestBuilder(), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueCustomSSLProvider.get(), singletonC.userAgent());

        case 101: // org.wordpress.android.fluxc.network.rest.wpapi.NonceRestClient 
        return (T) new NonceRestClient(new WPAPIEncodedBodyRequestBuilder(), new CurrentTimeProvider(), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueCustomSSLProvider.get(), singletonC.userAgent());

        case 102: // org.wordpress.android.fluxc.network.rest.wpcom.plugin.PluginJetpackTunnelRestClient 
        return (T) new PluginJetpackTunnelRestClient(singletonC.dispatcherProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 103: // com.woocommerce.android.push.UnseenReviewsCountHandler 
        return (T) new UnseenReviewsCountHandler(singletonC.provideAppCoroutineScopeProvider.get(), singletonC.notificationStoreProvider.get(), singletonC.provideSelectedSiteProvider.get());

        case 104: // org.wordpress.android.fluxc.store.MediaStore 
        return (T) singletonC.injectMediaStore(MediaStore_Factory.newInstance(singletonC.dispatcherProvider.get(), singletonC.mediaRestClientProvider.get(), singletonC.mediaXMLRPCClientProvider.get(), singletonC.wPV2MediaRestClientProvider.get()));

        case 105: // org.wordpress.android.fluxc.network.rest.wpcom.media.MediaRestClient 
        return (T) new MediaRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.provideMediaOkHttpClientInstanceProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent(), new MediaResponseUtils());

        case 106: // org.wordpress.android.fluxc.network.xmlrpc.media.MediaXMLRPCClient 
        return (T) new MediaXMLRPCClient(singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueCustomSSLProvider.get(), singletonC.provideMediaOkHttpClientInstanceCustomSSLProvider.get(), singletonC.userAgent(), new HTTPAuthManager());

        case 107: // org.wordpress.android.fluxc.network.rest.wpcom.media.wpv2.WPV2MediaRestClient 
        return (T) new WPV2MediaRestClient(singletonC.dispatcherProvider.get(), singletonC.coroutineEngine(), singletonC.provideMediaOkHttpClientInstanceProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 108: // org.wordpress.android.fluxc.store.UploadStore 
        return (T) new UploadStore(singletonC.dispatcherProvider.get());

        case 109: // com.woocommerce.android.ui.media.MediaFileUploadHandler 
        return (T) new MediaFileUploadHandler(singletonC.productImagesNotificationHandlerProvider.get(), singletonC.productImagesUploadWorkerProvider.get(), singletonC.resourceProvider(), singletonC.productDetailRepository(), singletonC.provideAppCoroutineScopeProvider.get());

        case 110: // com.woocommerce.android.media.ProductImagesNotificationHandler 
        return (T) new ProductImagesNotificationHandler(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 111: // com.woocommerce.android.media.ProductImagesUploadWorker 
        return (T) new ProductImagesUploadWorker(singletonC.mediaFilesRepository(), singletonC.productDetailRepository(), singletonC.productImagesServiceWrapperProvider.get(), singletonC.productImagesNotificationHandlerProvider.get(), singletonC.provideAppCoroutineScopeProvider.get());

        case 112: // com.woocommerce.android.media.ProductImagesServiceWrapper 
        return (T) new ProductImagesServiceWrapper(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 113: // org.wordpress.android.fluxc.store.WCStatsStore 
        return (T) new WCStatsStore(singletonC.dispatcherProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.orderStatsRestClientProvider.get(), singletonC.coroutineEngine());

        case 114: // org.wordpress.android.fluxc.network.rest.wpcom.wc.orderstats.OrderStatsRestClient 
        return (T) new OrderStatsRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.wPComGsonRequestBuilderProvider.get(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent());

        case 115: // org.wordpress.android.fluxc.store.WCLeaderboardsStore 
        return (T) new WCLeaderboardsStore(singletonC.leaderboardsRestClientProvider.get(), singletonC.wCProductStoreProvider.get(), new WCProductLeaderboardsMapper(), singletonC.coroutineEngine());

        case 116: // org.wordpress.android.fluxc.network.rest.wpcom.wc.leaderboards.LeaderboardsRestClient 
        return (T) new LeaderboardsRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get());

        case 117: // org.wordpress.android.fluxc.store.OrderUpdateStore 
        return (T) new OrderUpdateStore(singletonC.dispatcherProvider.get(), singletonC.coroutineEngine(), singletonC.orderRestClientProvider.get(), singletonC.ordersDao(), singletonC.siteSqlUtilsProvider.get());

        case 118: // org.wordpress.android.fluxc.store.WCAddonsStore 
        return (T) new WCAddonsStore(singletonC.addOnsRestClientProvider.get(), singletonC.coroutineEngine(), singletonC.addonsDao(), singletonC.remoteGlobalAddonGroupMapper(), singletonC.fromDatabaseAddonGroupMapper(), new AppLogWrapper());

        case 119: // org.wordpress.android.fluxc.network.rest.wpcom.wc.addons.AddOnsRestClient 
        return (T) new AddOnsRestClient(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule), singletonC.dispatcherProvider.get(), singletonC.provideRequestQueueProvider.get(), singletonC.accessTokenProvider.get(), singletonC.userAgent(), singletonC.jetpackTunnelGsonRequestBuilderProvider.get());

        case 120: // com.woocommerce.android.ui.orders.filters.data.OrderFiltersRepository 
        return (T) new OrderFiltersRepository(new AppPrefsWrapper(), singletonC.provideSelectedSiteProvider.get());

        case 121: // org.wordpress.android.fluxc.store.ListStore 
        return (T) new ListStore(singletonC.listSqlUtilsProvider.get(), singletonC.listItemSqlUtilsProvider.get(), singletonC.provideCoroutineContextProvider.get(), singletonC.coroutineEngine(), singletonC.dispatcherProvider.get());

        case 122: // org.wordpress.android.fluxc.persistence.ListSqlUtils 
        return (T) new ListSqlUtils();

        case 123: // org.wordpress.android.fluxc.persistence.ListItemSqlUtils 
        return (T) new ListItemSqlUtils();

        case 124: // com.woocommerce.android.ui.reviews.ReviewModerationHandler 
        return (T) new ReviewModerationHandler(singletonC.provideSelectedSiteProvider.get(), singletonC.wCProductStoreProvider.get(), singletonC.provideAppCoroutineScopeProvider.get());

        default: throw new AssertionError(id);
      }
    }

    @Override
    public T get() {
      switch (id / 100) {
        case 0: return get0();
        case 1: return get1();
        default: throw new AssertionError(id);
      }
    }
  }
}
