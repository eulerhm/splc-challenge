package dagger.hilt.android.internal.testing.root;

import com.woocommerce.android.BaseWooCommerce;
import com.woocommerce.android.WooCommerceDebug_GeneratedInjector;
import com.woocommerce.android.datastore.DataStoreModule;
import com.woocommerce.android.di.ActivityBindingModule;
import com.woocommerce.android.di.AppConfigModule;
import com.woocommerce.android.di.ApplicationModule;
import com.woocommerce.android.di.CardReaderModule;
import com.woocommerce.android.di.DummyInterceptorModule;
import com.woocommerce.android.di.FluxCModule;
import com.woocommerce.android.di.InterceptorModuleTest;
import com.woocommerce.android.di.NetworkStatusModule;
import com.woocommerce.android.di.NotificationModule;
import com.woocommerce.android.di.SelectedSiteModule;
import com.woocommerce.android.di.SupportModule;
import com.woocommerce.android.di.ThreadModule;
import com.woocommerce.android.di.WooCommerceGlideModule;
import com.woocommerce.android.helpers.InitializationRule;
import com.woocommerce.android.media.ProductImagesService_GeneratedInjector;
import com.woocommerce.android.mediapicker.MediaPickerModule;
import com.woocommerce.android.push.FCMMessageService_GeneratedInjector;
import com.woocommerce.android.push.NotificationsProcessingService_GeneratedInjector;
import com.woocommerce.android.screenshots.ScreenshotTest_GeneratedInjector;
import com.woocommerce.android.support.HelpActivity_GeneratedInjector;
import com.woocommerce.android.support.SSRActivityViewModel_HiltModules;
import com.woocommerce.android.support.SSRActivity_GeneratedInjector;
import com.woocommerce.android.ui.analytics.AnalyticsFragment_GeneratedInjector;
import com.woocommerce.android.ui.analytics.AnalyticsViewModel_HiltModules;
import com.woocommerce.android.ui.analytics.daterangeselector.AnalyticsDateRangeCardView_GeneratedInjector;
import com.woocommerce.android.ui.aztec.AztecEditorFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.CardReaderTrackingModule;
import com.woocommerce.android.ui.cardreader.connect.CardReaderConnectDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.detail.CardReaderDetailFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.detail.CardReaderDetailViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.hub.CardReaderHubFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.hub.CardReaderHubViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.manuals.CardReaderManualsViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderWelcomeViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.statuschecker.CardReaderStatusCheckerViewModel_HiltModules;
import com.woocommerce.android.ui.cardreader.tutorial.CardReaderTutorialDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.update.CardReaderUpdateDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.cardreader.update.CardReaderUpdateViewModel_HiltModules;
import com.woocommerce.android.ui.common.UserEligibilityErrorFragment_GeneratedInjector;
import com.woocommerce.android.ui.common.UserEligibilityErrorViewModel_HiltModules;
import com.woocommerce.android.ui.common.texteditor.SimpleTextEditorFragment_GeneratedInjector;
import com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel_HiltModules;
import com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewFragment_GeneratedInjector;
import com.woocommerce.android.ui.coupons.CouponListFragment_GeneratedInjector;
import com.woocommerce.android.ui.coupons.CouponListViewModel_HiltModules;
import com.woocommerce.android.ui.coupons.details.CouponDetailsFragment_GeneratedInjector;
import com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel_HiltModules;
import com.woocommerce.android.ui.coupons.edit.CouponRestrictionsFragment_GeneratedInjector;
import com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel_HiltModules;
import com.woocommerce.android.ui.coupons.edit.EditCouponFragment_GeneratedInjector;
import com.woocommerce.android.ui.coupons.edit.EditCouponViewModel_HiltModules;
import com.woocommerce.android.ui.coupons.edit.EmailRestrictionFragment_GeneratedInjector;
import com.woocommerce.android.ui.coupons.edit.EmailRestrictionViewModel_HiltModules;
import com.woocommerce.android.ui.inbox.InboxFragment_GeneratedInjector;
import com.woocommerce.android.ui.inbox.InboxViewModel_HiltModules;
import com.woocommerce.android.ui.jetpack.JetpackBenefitsDialog_GeneratedInjector;
import com.woocommerce.android.ui.jetpack.JetpackInstallProgressDialog_GeneratedInjector;
import com.woocommerce.android.ui.jetpack.JetpackInstallStartDialog_GeneratedInjector;
import com.woocommerce.android.ui.jetpack.JetpackInstallViewModel_HiltModules;
import com.woocommerce.android.ui.login.HiltWrapper_WooLoginFragmentModule;
import com.woocommerce.android.ui.login.LoginActivity_GeneratedInjector;
import com.woocommerce.android.ui.login.LoginAnalyticsModule;
import com.woocommerce.android.ui.login.LoginDiscoveryErrorFragment_GeneratedInjector;
import com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.login.LoginNoJetpackFragment_GeneratedInjector;
import com.woocommerce.android.ui.login.LoginNoJetpackViewModel_HiltModules;
import com.woocommerce.android.ui.login.LoginNoWPcomAccountFoundFragment_GeneratedInjector;
import com.woocommerce.android.ui.login.LoginPrologueFragment_GeneratedInjector;
import com.woocommerce.android.ui.login.LoginSiteCheckErrorFragment_GeneratedInjector;
import com.woocommerce.android.ui.login.MagicLinkInterceptFragment_GeneratedInjector;
import com.woocommerce.android.ui.login.MagicLinkInterceptViewModel_HiltModules;
import com.woocommerce.android.ui.main.HiltWrapper_MainModule;
import com.woocommerce.android.ui.main.MainActivityViewModel_HiltModules;
import com.woocommerce.android.ui.main.MainActivity_GeneratedInjector;
import com.woocommerce.android.ui.main.OrdersUITest_GeneratedInjector;
import com.woocommerce.android.ui.main.ProductsUITest_GeneratedInjector;
import com.woocommerce.android.ui.main.ReviewsUITest_GeneratedInjector;
import com.woocommerce.android.ui.media.MediaUploadErrorListFragment_GeneratedInjector;
import com.woocommerce.android.ui.media.MediaUploadErrorListViewModel_HiltModules;
import com.woocommerce.android.ui.moremenu.MoreMenuFragment_GeneratedInjector;
import com.woocommerce.android.ui.moremenu.MoreMenuViewModel_HiltModules;
import com.woocommerce.android.ui.mystore.MyStoreFragment_GeneratedInjector;
import com.woocommerce.android.ui.mystore.MyStoreViewModel_HiltModules;
import com.woocommerce.android.ui.orders.creation.OrderCreationCustomerAddFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.creation.OrderCreationFormFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.creation.OrderCreationViewModel_HiltModules;
import com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel_HiltModules;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductDetailsFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.creation.products.OrderCreationProductSelectionViewModel_HiltModules;
import com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.creation.shipping.OrderCreationShippingViewModel_HiltModules;
import com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel_HiltModules;
import com.woocommerce.android.ui.orders.details.OrderDetailFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.details.OrderDetailViewModel_HiltModules;
import com.woocommerce.android.ui.orders.details.PrintingInstructionsFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.details.editing.CustomerOrderNoteEditingFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.details.editing.OrderEditingViewModel_HiltModules;
import com.woocommerce.android.ui.orders.details.editing.address.AddressViewModel_HiltModules;
import com.woocommerce.android.ui.orders.details.editing.address.BaseAddressEditingFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.filters.OrderFilterCategoriesViewModel_HiltModules;
import com.woocommerce.android.ui.orders.filters.OrderFilterOptionsFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.filters.OrderFilterOptionsViewModel_HiltModules;
import com.woocommerce.android.ui.orders.fulfill.OrderFulfillFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel_HiltModules;
import com.woocommerce.android.ui.orders.list.OrderListFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.list.OrderListViewModel_HiltModules;
import com.woocommerce.android.ui.orders.notes.AddOrderNoteFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.notes.AddOrderNoteViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRefundViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelAddressViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemDialog_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressSuggestionViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel_HiltModules;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingPackageSelectorViewModel_HiltModules;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialogViewModel_HiltModules;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsDialog_GeneratedInjector;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel_HiltModules;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel_HiltModules;
import com.woocommerce.android.ui.orders.simplepayments.TakePaymentFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel_HiltModules;
import com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.tracking.AddOrderShipmentTrackingViewModel_HiltModules;
import com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListFragment_GeneratedInjector;
import com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListViewModel_HiltModules;
import com.woocommerce.android.ui.prefs.AppSettingsActivity_GeneratedInjector;
import com.woocommerce.android.ui.prefs.AppSettingsModule;
import com.woocommerce.android.ui.prefs.HiltWrapper_PrivacySettingsModule;
import com.woocommerce.android.ui.prefs.MainSettingsFragment_GeneratedInjector;
import com.woocommerce.android.ui.prefs.MainSettingsModule;
import com.woocommerce.android.ui.prefs.PrivacySettingsFragment_GeneratedInjector;
import com.woocommerce.android.ui.prefs.UnifiedAboutScreenActivity_GeneratedInjector;
import com.woocommerce.android.ui.products.GroupedProductListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.GroupedProductListViewModel_HiltModules;
import com.woocommerce.android.ui.products.LinkedProductsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductDetailBottomSheetFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductDetailFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductDetailViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductExternalLinkFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductFilterListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductFilterListViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductFilterOptionListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductImageViewerFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductImagesFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductImagesViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductInventoryFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductInventoryViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductListViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductPricingFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductPricingViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductSelectionListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductSelectionListViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductShippingClassFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductShippingClassViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductShippingFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductShippingViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductSortingFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductSortingViewModel_HiltModules;
import com.woocommerce.android.ui.products.ProductTypesBottomSheetFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel_HiltModules;
import com.woocommerce.android.ui.products.addons.order.OrderedAddonFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel_HiltModules;
import com.woocommerce.android.ui.products.addons.product.ProductAddonsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.categories.AddProductCategoryFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel_HiltModules;
import com.woocommerce.android.ui.products.categories.ParentCategoryListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.categories.ProductCategoriesFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorViewModel_HiltModules;
import com.woocommerce.android.ui.products.downloads.AddProductDownloadBottomSheetFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.downloads.AddProductDownloadViewModel_HiltModules;
import com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.downloads.ProductDownloadDetailsViewModel_HiltModules;
import com.woocommerce.android.ui.products.downloads.ProductDownloadsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.downloads.ProductDownloadsSettingsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.reviews.ProductReviewsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel_HiltModules;
import com.woocommerce.android.ui.products.selector.ProductSelectorFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.selector.ProductSelectorViewModel_HiltModules;
import com.woocommerce.android.ui.products.settings.ProductSettingsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.tags.ProductTagsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.VariationDetailFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.VariationDetailViewModel_HiltModules;
import com.woocommerce.android.ui.products.variations.VariationListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.VariationListViewModel_HiltModules;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerDialog_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdateAttrPickerViewModel_HiltModules;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel_HiltModules;
import com.woocommerce.android.ui.products.variations.attributes.AddAttributeFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.attributes.AddAttributeTermsFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.attributes.AttributeListFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.attributes.AttributesAddedFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel_HiltModules;
import com.woocommerce.android.ui.products.variations.selector.VariationSelectorFragment_GeneratedInjector;
import com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel_HiltModules;
import com.woocommerce.android.ui.refunds.IssueRefundFragment_GeneratedInjector;
import com.woocommerce.android.ui.refunds.IssueRefundViewModel_HiltModules;
import com.woocommerce.android.ui.refunds.RefundAmountDialog_GeneratedInjector;
import com.woocommerce.android.ui.refunds.RefundByAmountFragment_GeneratedInjector;
import com.woocommerce.android.ui.refunds.RefundByItemsFragment_GeneratedInjector;
import com.woocommerce.android.ui.refunds.RefundConfirmationDialog_GeneratedInjector;
import com.woocommerce.android.ui.refunds.RefundDetailFragment_GeneratedInjector;
import com.woocommerce.android.ui.refunds.RefundDetailViewModel_HiltModules;
import com.woocommerce.android.ui.refunds.RefundItemsPickerDialog_GeneratedInjector;
import com.woocommerce.android.ui.refunds.RefundSummaryFragment_GeneratedInjector;
import com.woocommerce.android.ui.reviews.ReviewDetailFragment_GeneratedInjector;
import com.woocommerce.android.ui.reviews.ReviewDetailViewModel_HiltModules;
import com.woocommerce.android.ui.reviews.ReviewListFragment_GeneratedInjector;
import com.woocommerce.android.ui.reviews.ReviewListViewModel_HiltModules;
import com.woocommerce.android.ui.searchfilter.SearchFilterFragment_GeneratedInjector;
import com.woocommerce.android.ui.searchfilter.SearchFilterViewModel_HiltModules;
import com.woocommerce.android.ui.shipping.InstallWcShippingFlowFragment_GeneratedInjector;
import com.woocommerce.android.ui.shipping.InstallWcShippingFlowViewModel_HiltModules;
import com.woocommerce.android.ui.sitepicker.SitePickerFragment_GeneratedInjector;
import com.woocommerce.android.ui.sitepicker.SitePickerViewModel_HiltModules;
import com.woocommerce.android.ui.whatsnew.FeatureAnnouncementDialogFragment_GeneratedInjector;
import com.woocommerce.android.ui.whatsnew.FeatureAnnouncementViewModel_HiltModules;
import com.woocommerce.android.util.crashlogging.CrashLoggingModule;
import com.woocommerce.android.widgets.WCMaterialOutlinedCurrencyEditTextView_GeneratedInjector;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.internal.TestSingletonComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.Generated;
import javax.inject.Singleton;
import org.wordpress.android.mediapicker.ui.MediaPickerActivity_GeneratedInjector;
import org.wordpress.android.mediapicker.ui.MediaPickerFragment_GeneratedInjector;
import org.wordpress.android.mediapicker.ui.MediaViewerFragment_GeneratedInjector;
import org.wordpress.android.mediapicker.viewmodel.MediaPickerViewModel_HiltModules;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class Default_HiltComponents {
  private Default_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ActivityBindingModule.class,
          AppConfigModule.class,
          ApplicationContextModule.class,
          ApplicationModule.class,
          CardReaderModule.class,
          CardReaderTrackingModule.class,
          CrashLoggingModule.class,
          DataStoreModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          DummyInterceptorModule.class,
          FluxCModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          InterceptorModuleTest.class,
          LoginAnalyticsModule.class,
          MediaPickerModule.class,
          NetworkStatusModule.class,
          NotificationModule.class,
          SelectedSiteModule.class,
          SupportModule.class,
          ThreadModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements BaseWooCommerce.AndroidInjectorEntryPoint,
      WooCommerceDebug_GeneratedInjector,
      WooCommerceGlideModule.WooCommerceGlideEntryPoint,
      InitializationRule.AppEntryPoint,
      ScreenshotTest_GeneratedInjector,
      OrdersUITest_GeneratedInjector,
      ProductsUITest_GeneratedInjector,
      ReviewsUITest_GeneratedInjector,
      FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      TestSingletonComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ProductImagesService_GeneratedInjector,
      FCMMessageService_GeneratedInjector,
      NotificationsProcessingService_GeneratedInjector,
      ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddOrderNoteViewModel_HiltModules.KeyModule.class,
          AddOrderShipmentTrackingViewModel_HiltModules.KeyModule.class,
          AddOrderTrackingProviderListViewModel_HiltModules.KeyModule.class,
          AddProductCategoryViewModel_HiltModules.KeyModule.class,
          AddProductDownloadViewModel_HiltModules.KeyModule.class,
          AddressViewModel_HiltModules.KeyModule.class,
          AnalyticsViewModel_HiltModules.KeyModule.class,
          CardReaderConnectViewModel_HiltModules.KeyModule.class,
          CardReaderDetailViewModel_HiltModules.KeyModule.class,
          CardReaderHubViewModel_HiltModules.KeyModule.class,
          CardReaderManualsViewModel_HiltModules.KeyModule.class,
          CardReaderOnboardingViewModel_HiltModules.KeyModule.class,
          CardReaderPaymentViewModel_HiltModules.KeyModule.class,
          CardReaderStatusCheckerViewModel_HiltModules.KeyModule.class,
          CardReaderUpdateViewModel_HiltModules.KeyModule.class,
          CardReaderWelcomeViewModel_HiltModules.KeyModule.class,
          CouponDetailsViewModel_HiltModules.KeyModule.class,
          CouponListViewModel_HiltModules.KeyModule.class,
          CouponRestrictionsViewModel_HiltModules.KeyModule.class,
          CreateShippingLabelViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          EditCouponViewModel_HiltModules.KeyModule.class,
          EditShippingLabelAddressViewModel_HiltModules.KeyModule.class,
          EditShippingLabelPackagesViewModel_HiltModules.KeyModule.class,
          EditShippingLabelPaymentViewModel_HiltModules.KeyModule.class,
          EditVariationAttributesViewModel_HiltModules.KeyModule.class,
          EmailRestrictionViewModel_HiltModules.KeyModule.class,
          FeatureAnnouncementViewModel_HiltModules.KeyModule.class,
          GroupedProductListViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          InboxViewModel_HiltModules.KeyModule.class,
          InstallWcShippingFlowViewModel_HiltModules.KeyModule.class,
          IssueRefundViewModel_HiltModules.KeyModule.class,
          JetpackInstallViewModel_HiltModules.KeyModule.class,
          LoginNoJetpackViewModel_HiltModules.KeyModule.class,
          MagicLinkInterceptViewModel_HiltModules.KeyModule.class,
          MainActivityViewModel_HiltModules.KeyModule.class,
          MediaPickerViewModel_HiltModules.KeyModule.class,
          MediaUploadErrorListViewModel_HiltModules.KeyModule.class,
          MoreMenuViewModel_HiltModules.KeyModule.class,
          MoveShippingItemViewModel_HiltModules.KeyModule.class,
          MyStoreViewModel_HiltModules.KeyModule.class,
          OrderCreationFeeViewModel_HiltModules.KeyModule.class,
          OrderCreationProductSelectionViewModel_HiltModules.KeyModule.class,
          OrderCreationShippingViewModel_HiltModules.KeyModule.class,
          OrderCreationVariationSelectionViewModel_HiltModules.KeyModule.class,
          OrderCreationViewModel_HiltModules.KeyModule.class,
          OrderDetailViewModel_HiltModules.KeyModule.class,
          OrderEditingViewModel_HiltModules.KeyModule.class,
          OrderFilterCategoriesViewModel_HiltModules.KeyModule.class,
          OrderFilterOptionsViewModel_HiltModules.KeyModule.class,
          OrderFulfillViewModel_HiltModules.KeyModule.class,
          OrderListViewModel_HiltModules.KeyModule.class,
          OrderedAddonViewModel_HiltModules.KeyModule.class,
          PrintShippingLabelCustomsFormViewModel_HiltModules.KeyModule.class,
          PrintShippingLabelViewModel_HiltModules.KeyModule.class,
          ProductCategorySelectorViewModel_HiltModules.KeyModule.class,
          ProductDetailViewModel_HiltModules.KeyModule.class,
          ProductDownloadDetailsViewModel_HiltModules.KeyModule.class,
          ProductFilterListViewModel_HiltModules.KeyModule.class,
          ProductImagesViewModel_HiltModules.KeyModule.class,
          ProductInventoryViewModel_HiltModules.KeyModule.class,
          ProductListViewModel_HiltModules.KeyModule.class,
          ProductPricingViewModel_HiltModules.KeyModule.class,
          ProductReviewsViewModel_HiltModules.KeyModule.class,
          ProductSelectionListViewModel_HiltModules.KeyModule.class,
          ProductSelectorViewModel_HiltModules.KeyModule.class,
          ProductShippingClassViewModel_HiltModules.KeyModule.class,
          ProductShippingViewModel_HiltModules.KeyModule.class,
          ProductSortingViewModel_HiltModules.KeyModule.class,
          ProductTypesBottomSheetViewModel_HiltModules.KeyModule.class,
          ReceiptPreviewViewModel_HiltModules.KeyModule.class,
          RefundDetailViewModel_HiltModules.KeyModule.class,
          ReviewDetailViewModel_HiltModules.KeyModule.class,
          ReviewListViewModel_HiltModules.KeyModule.class,
          SSRActivityViewModel_HiltModules.KeyModule.class,
          SearchFilterViewModel_HiltModules.KeyModule.class,
          ShippingCarrierRatesViewModel_HiltModules.KeyModule.class,
          ShippingCustomsViewModel_HiltModules.KeyModule.class,
          ShippingLabelAddressSuggestionViewModel_HiltModules.KeyModule.class,
          ShippingLabelCreateCustomPackageViewModel_HiltModules.KeyModule.class,
          ShippingLabelCreatePackageViewModel_HiltModules.KeyModule.class,
          ShippingLabelCreateServicePackageViewModel_HiltModules.KeyModule.class,
          ShippingLabelRefundViewModel_HiltModules.KeyModule.class,
          ShippingPackageSelectorViewModel_HiltModules.KeyModule.class,
          SimplePaymentsDialogViewModel_HiltModules.KeyModule.class,
          SimplePaymentsFragmentViewModel_HiltModules.KeyModule.class,
          SimplePaymentsSharedViewModel_HiltModules.KeyModule.class,
          SimpleTextEditorViewModel_HiltModules.KeyModule.class,
          SitePickerViewModel_HiltModules.KeyModule.class,
          TakePaymentViewModel_HiltModules.KeyModule.class,
          UserEligibilityErrorViewModel_HiltModules.KeyModule.class,
          VariationDetailViewModel_HiltModules.KeyModule.class,
          VariationListViewModel_HiltModules.KeyModule.class,
          VariationSelectorViewModel_HiltModules.KeyModule.class,
          VariationsBulkUpdateAttrPickerViewModel_HiltModules.KeyModule.class,
          VariationsBulkUpdatePriceViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AppSettingsModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          HiltWrapper_MainModule.class,
          HiltWrapper_WooLoginFragmentModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements HelpActivity_GeneratedInjector,
      SSRActivity_GeneratedInjector,
      LoginActivity_GeneratedInjector,
      MainActivity_GeneratedInjector,
      AppSettingsActivity_GeneratedInjector,
      UnifiedAboutScreenActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent,
      MediaPickerActivity_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddOrderNoteViewModel_HiltModules.BindsModule.class,
          AddOrderShipmentTrackingViewModel_HiltModules.BindsModule.class,
          AddOrderTrackingProviderListViewModel_HiltModules.BindsModule.class,
          AddProductCategoryViewModel_HiltModules.BindsModule.class,
          AddProductDownloadViewModel_HiltModules.BindsModule.class,
          AddressViewModel_HiltModules.BindsModule.class,
          AnalyticsViewModel_HiltModules.BindsModule.class,
          CardReaderConnectViewModel_HiltModules.BindsModule.class,
          CardReaderDetailViewModel_HiltModules.BindsModule.class,
          CardReaderHubViewModel_HiltModules.BindsModule.class,
          CardReaderManualsViewModel_HiltModules.BindsModule.class,
          CardReaderOnboardingViewModel_HiltModules.BindsModule.class,
          CardReaderPaymentViewModel_HiltModules.BindsModule.class,
          CardReaderStatusCheckerViewModel_HiltModules.BindsModule.class,
          CardReaderUpdateViewModel_HiltModules.BindsModule.class,
          CardReaderWelcomeViewModel_HiltModules.BindsModule.class,
          CouponDetailsViewModel_HiltModules.BindsModule.class,
          CouponListViewModel_HiltModules.BindsModule.class,
          CouponRestrictionsViewModel_HiltModules.BindsModule.class,
          CreateShippingLabelViewModel_HiltModules.BindsModule.class,
          EditCouponViewModel_HiltModules.BindsModule.class,
          EditShippingLabelAddressViewModel_HiltModules.BindsModule.class,
          EditShippingLabelPackagesViewModel_HiltModules.BindsModule.class,
          EditShippingLabelPaymentViewModel_HiltModules.BindsModule.class,
          EditVariationAttributesViewModel_HiltModules.BindsModule.class,
          EmailRestrictionViewModel_HiltModules.BindsModule.class,
          FeatureAnnouncementViewModel_HiltModules.BindsModule.class,
          GroupedProductListViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          InboxViewModel_HiltModules.BindsModule.class,
          InstallWcShippingFlowViewModel_HiltModules.BindsModule.class,
          IssueRefundViewModel_HiltModules.BindsModule.class,
          JetpackInstallViewModel_HiltModules.BindsModule.class,
          LoginNoJetpackViewModel_HiltModules.BindsModule.class,
          MagicLinkInterceptViewModel_HiltModules.BindsModule.class,
          MainActivityViewModel_HiltModules.BindsModule.class,
          MediaPickerViewModel_HiltModules.BindsModule.class,
          MediaUploadErrorListViewModel_HiltModules.BindsModule.class,
          MoreMenuViewModel_HiltModules.BindsModule.class,
          MoveShippingItemViewModel_HiltModules.BindsModule.class,
          MyStoreViewModel_HiltModules.BindsModule.class,
          OrderCreationFeeViewModel_HiltModules.BindsModule.class,
          OrderCreationProductSelectionViewModel_HiltModules.BindsModule.class,
          OrderCreationShippingViewModel_HiltModules.BindsModule.class,
          OrderCreationVariationSelectionViewModel_HiltModules.BindsModule.class,
          OrderCreationViewModel_HiltModules.BindsModule.class,
          OrderDetailViewModel_HiltModules.BindsModule.class,
          OrderEditingViewModel_HiltModules.BindsModule.class,
          OrderFilterCategoriesViewModel_HiltModules.BindsModule.class,
          OrderFilterOptionsViewModel_HiltModules.BindsModule.class,
          OrderFulfillViewModel_HiltModules.BindsModule.class,
          OrderListViewModel_HiltModules.BindsModule.class,
          OrderedAddonViewModel_HiltModules.BindsModule.class,
          PrintShippingLabelCustomsFormViewModel_HiltModules.BindsModule.class,
          PrintShippingLabelViewModel_HiltModules.BindsModule.class,
          ProductCategorySelectorViewModel_HiltModules.BindsModule.class,
          ProductDetailViewModel_HiltModules.BindsModule.class,
          ProductDownloadDetailsViewModel_HiltModules.BindsModule.class,
          ProductFilterListViewModel_HiltModules.BindsModule.class,
          ProductImagesViewModel_HiltModules.BindsModule.class,
          ProductInventoryViewModel_HiltModules.BindsModule.class,
          ProductListViewModel_HiltModules.BindsModule.class,
          ProductPricingViewModel_HiltModules.BindsModule.class,
          ProductReviewsViewModel_HiltModules.BindsModule.class,
          ProductSelectionListViewModel_HiltModules.BindsModule.class,
          ProductSelectorViewModel_HiltModules.BindsModule.class,
          ProductShippingClassViewModel_HiltModules.BindsModule.class,
          ProductShippingViewModel_HiltModules.BindsModule.class,
          ProductSortingViewModel_HiltModules.BindsModule.class,
          ProductTypesBottomSheetViewModel_HiltModules.BindsModule.class,
          ReceiptPreviewViewModel_HiltModules.BindsModule.class,
          RefundDetailViewModel_HiltModules.BindsModule.class,
          ReviewDetailViewModel_HiltModules.BindsModule.class,
          ReviewListViewModel_HiltModules.BindsModule.class,
          SSRActivityViewModel_HiltModules.BindsModule.class,
          SearchFilterViewModel_HiltModules.BindsModule.class,
          ShippingCarrierRatesViewModel_HiltModules.BindsModule.class,
          ShippingCustomsViewModel_HiltModules.BindsModule.class,
          ShippingLabelAddressSuggestionViewModel_HiltModules.BindsModule.class,
          ShippingLabelCreateCustomPackageViewModel_HiltModules.BindsModule.class,
          ShippingLabelCreatePackageViewModel_HiltModules.BindsModule.class,
          ShippingLabelCreateServicePackageViewModel_HiltModules.BindsModule.class,
          ShippingLabelRefundViewModel_HiltModules.BindsModule.class,
          ShippingPackageSelectorViewModel_HiltModules.BindsModule.class,
          SimplePaymentsDialogViewModel_HiltModules.BindsModule.class,
          SimplePaymentsFragmentViewModel_HiltModules.BindsModule.class,
          SimplePaymentsSharedViewModel_HiltModules.BindsModule.class,
          SimpleTextEditorViewModel_HiltModules.BindsModule.class,
          SitePickerViewModel_HiltModules.BindsModule.class,
          TakePaymentViewModel_HiltModules.BindsModule.class,
          UserEligibilityErrorViewModel_HiltModules.BindsModule.class,
          VariationDetailViewModel_HiltModules.BindsModule.class,
          VariationListViewModel_HiltModules.BindsModule.class,
          VariationSelectorViewModel_HiltModules.BindsModule.class,
          VariationsBulkUpdateAttrPickerViewModel_HiltModules.BindsModule.class,
          VariationsBulkUpdatePriceViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements AnalyticsDateRangeCardView_GeneratedInjector,
      WCMaterialOutlinedCurrencyEditTextView_GeneratedInjector,
      ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ViewWithFragmentCBuilderModule.class,
          HiltWrapper_PrivacySettingsModule.class,
          MainSettingsModule.class
      }
  )
  @FragmentScoped
  public abstract static class FragmentC implements AnalyticsFragment_GeneratedInjector,
      AztecEditorFragment_GeneratedInjector,
      CardReaderConnectDialogFragment_GeneratedInjector,
      CardReaderDetailFragment_GeneratedInjector,
      CardReaderHubFragment_GeneratedInjector,
      CardReaderManualsFragment_GeneratedInjector,
      CardReaderOnboardingFragment_GeneratedInjector,
      CardReaderWelcomeDialogFragment_GeneratedInjector,
      CardReaderPaymentDialogFragment_GeneratedInjector,
      ReceiptPreviewFragment_GeneratedInjector,
      CardReaderStatusCheckerDialogFragment_GeneratedInjector,
      CardReaderTutorialDialogFragment_GeneratedInjector,
      CardReaderUpdateDialogFragment_GeneratedInjector,
      UserEligibilityErrorFragment_GeneratedInjector,
      SimpleTextEditorFragment_GeneratedInjector,
      WPComWebViewFragment_GeneratedInjector,
      CouponListFragment_GeneratedInjector,
      CouponDetailsFragment_GeneratedInjector,
      CouponRestrictionsFragment_GeneratedInjector,
      EditCouponFragment_GeneratedInjector,
      EmailRestrictionFragment_GeneratedInjector,
      InboxFragment_GeneratedInjector,
      JetpackBenefitsDialog_GeneratedInjector,
      JetpackInstallProgressDialog_GeneratedInjector,
      JetpackInstallStartDialog_GeneratedInjector,
      LoginDiscoveryErrorFragment_GeneratedInjector,
      LoginEmailHelpDialogFragment_GeneratedInjector,
      LoginNoJetpackFragment_GeneratedInjector,
      LoginNoWPcomAccountFoundFragment_GeneratedInjector,
      LoginPrologueFragment_GeneratedInjector,
      LoginSiteCheckErrorFragment_GeneratedInjector,
      MagicLinkInterceptFragment_GeneratedInjector,
      MediaUploadErrorListFragment_GeneratedInjector,
      MoreMenuFragment_GeneratedInjector,
      MyStoreFragment_GeneratedInjector,
      OrderCreationCustomerAddFragment_GeneratedInjector,
      OrderCreationFormFragment_GeneratedInjector,
      OrderCreationFeeFragment_GeneratedInjector,
      OrderCreationProductDetailsFragment_GeneratedInjector,
      OrderCreationProductSelectionFragment_GeneratedInjector,
      OrderCreationShippingFragment_GeneratedInjector,
      OrderCreationVariationSelectionFragment_GeneratedInjector,
      OrderDetailFragment_GeneratedInjector,
      PrintingInstructionsFragment_GeneratedInjector,
      CustomerOrderNoteEditingFragment_GeneratedInjector,
      BaseAddressEditingFragment_GeneratedInjector,
      OrderFilterCategoriesFragment_GeneratedInjector,
      OrderFilterOptionsFragment_GeneratedInjector,
      OrderFulfillFragment_GeneratedInjector,
      OrderListFragment_GeneratedInjector,
      AddOrderNoteFragment_GeneratedInjector,
      PrintShippingLabelCustomsFormFragment_GeneratedInjector,
      PrintShippingLabelFragment_GeneratedInjector,
      ShippingLabelRefundFragment_GeneratedInjector,
      CreateShippingLabelFragment_GeneratedInjector,
      EditShippingLabelAddressFragment_GeneratedInjector,
      EditShippingLabelPackagesFragment_GeneratedInjector,
      EditShippingLabelPaymentFragment_GeneratedInjector,
      MoveShippingItemDialog_GeneratedInjector,
      ShippingCarrierRatesFragment_GeneratedInjector,
      ShippingCustomsFragment_GeneratedInjector,
      ShippingLabelAddressSuggestionFragment_GeneratedInjector,
      ShippingLabelCreateCustomPackageFragment_GeneratedInjector,
      ShippingLabelCreatePackageFragment_GeneratedInjector,
      ShippingLabelCreateServicePackageFragment_GeneratedInjector,
      ShippingPackageSelectorFragment_GeneratedInjector,
      SimplePaymentsDialog_GeneratedInjector,
      SimplePaymentsFragment_GeneratedInjector,
      TakePaymentFragment_GeneratedInjector,
      AddOrderShipmentTrackingFragment_GeneratedInjector,
      AddOrderTrackingProviderListFragment_GeneratedInjector,
      MainSettingsFragment_GeneratedInjector,
      PrivacySettingsFragment_GeneratedInjector,
      GroupedProductListFragment_GeneratedInjector,
      LinkedProductsFragment_GeneratedInjector,
      ProductDetailBottomSheetFragment_GeneratedInjector,
      ProductDetailFragment_GeneratedInjector,
      ProductExternalLinkFragment_GeneratedInjector,
      ProductFilterListFragment_GeneratedInjector,
      ProductFilterOptionListFragment_GeneratedInjector,
      ProductImageViewerFragment_GeneratedInjector,
      ProductImagesFragment_GeneratedInjector,
      ProductInventoryFragment_GeneratedInjector,
      ProductListFragment_GeneratedInjector,
      ProductPricingFragment_GeneratedInjector,
      ProductSelectionListFragment_GeneratedInjector,
      ProductShippingClassFragment_GeneratedInjector,
      ProductShippingFragment_GeneratedInjector,
      ProductSortingFragment_GeneratedInjector,
      ProductTypesBottomSheetFragment_GeneratedInjector,
      OrderedAddonFragment_GeneratedInjector,
      ProductAddonsFragment_GeneratedInjector,
      AddProductCategoryFragment_GeneratedInjector,
      ParentCategoryListFragment_GeneratedInjector,
      ProductCategoriesFragment_GeneratedInjector,
      ProductCategorySelectorFragment_GeneratedInjector,
      AddProductDownloadBottomSheetFragment_GeneratedInjector,
      ProductDownloadDetailsFragment_GeneratedInjector,
      ProductDownloadsFragment_GeneratedInjector,
      ProductDownloadsSettingsFragment_GeneratedInjector,
      ProductReviewsFragment_GeneratedInjector,
      ProductSelectorFragment_GeneratedInjector,
      ProductSettingsFragment_GeneratedInjector,
      ProductTagsFragment_GeneratedInjector,
      VariationDetailFragment_GeneratedInjector,
      VariationListFragment_GeneratedInjector,
      VariationsBulkUpdateAttrPickerDialog_GeneratedInjector,
      VariationsBulkUpdatePriceFragment_GeneratedInjector,
      AddAttributeFragment_GeneratedInjector,
      AddAttributeTermsFragment_GeneratedInjector,
      AttributeListFragment_GeneratedInjector,
      AttributesAddedFragment_GeneratedInjector,
      EditVariationAttributesFragment_GeneratedInjector,
      VariationSelectorFragment_GeneratedInjector,
      IssueRefundFragment_GeneratedInjector,
      RefundAmountDialog_GeneratedInjector,
      RefundByAmountFragment_GeneratedInjector,
      RefundByItemsFragment_GeneratedInjector,
      RefundConfirmationDialog_GeneratedInjector,
      RefundDetailFragment_GeneratedInjector,
      RefundItemsPickerDialog_GeneratedInjector,
      RefundSummaryFragment_GeneratedInjector,
      ReviewDetailFragment_GeneratedInjector,
      ReviewListFragment_GeneratedInjector,
      SearchFilterFragment_GeneratedInjector,
      InstallWcShippingFlowFragment_GeneratedInjector,
      SitePickerFragment_GeneratedInjector,
      FeatureAnnouncementDialogFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent,
      MediaPickerFragment_GeneratedInjector,
      MediaViewerFragment_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
