package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0007\u0018\u0000 \u0086\u00012\u00020\u0001:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010@\u001a\u00020AH\u0002J!\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020EJ\u0018\u0010K\u001a\u00020C2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020EH\u0002J\u0006\u0010O\u001a\u00020MJ\u0018\u0010P\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0002J\b\u0010Q\u001a\u00020CH\u0002J\u0006\u0010R\u001a\u00020CJ\b\u0010S\u001a\u00020CH\u0014J\u0006\u0010T\u001a\u00020CJ\u001a\u0010U\u001a\u00020C2\u0006\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010YJ\u0006\u0010Z\u001a\u00020CJ\u000e\u0010[\u001a\u00020C2\u0006\u0010\\\u001a\u00020]J\u0006\u0010^\u001a\u00020CJ\u00c3\u0002\u0010_\u001a\u00020C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010I2\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010a2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010c2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010c2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010f2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010f2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010j2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010l2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010n2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010u\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010v\u001a\u0004\u0018\u00010E2\u0010\b\u0002\u0010w\u001a\n\u0012\u0004\u0012\u00020y\u0018\u00010x2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010{2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010{2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010{2\n\b\u0002\u0010~\u001a\u0004\u0018\u00010{\u00a2\u0006\u0002\u0010\u007fJ\u000f\u0010\u0080\u0001\u001a\u00020C2\u0006\u0010s\u001a\u00020MJ\u0012\u0010\u0081\u0001\u001a\u00020C2\u0007\u0010\u0082\u0001\u001a\u00020$H\u0002J\u0012\u0010\u0083\u0001\u001a\u00020C2\u0007\u0010\u0082\u0001\u001a\u00020$H\u0002J\u001c\u0010\u0084\u0001\u001a\u00020C2\u0007\u0010\u0082\u0001\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010%\u001a\u0004\u0018\u00010$2\b\u0010#\u001a\u0004\u0018\u00010$8B@BX\u0082\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b,\u0010-R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001500\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020504\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R+\u00109\u001a\u0002052\u0006\u00108\u001a\u0002058B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "variationRepository", "Lcom/woocommerce/android/ui/products/variations/VariationDetailRepository;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "mediaFileUploadHandler", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;", "resources", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/variations/VariationDetailRepository;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/ui/products/ParameterRepository;Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "_variationDetailCards", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/products/models/ProductPropertyCard;", "cardBuilder", "Lcom/woocommerce/android/ui/products/variations/VariationDetailCardBuilder;", "getCardBuilder", "()Lcom/woocommerce/android/ui/products/variations/VariationDetailCardBuilder;", "cardBuilder$delegate", "Lkotlin/Lazy;", "navArgs", "Lcom/woocommerce/android/ui/products/variations/VariationDetailFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/variations/VariationDetailFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "value", "Lcom/woocommerce/android/model/ProductVariation;", "originalVariation", "getOriginalVariation", "()Lcom/woocommerce/android/model/ProductVariation;", "setOriginalVariation", "(Lcom/woocommerce/android/model/ProductVariation;)V", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "variationDetailCards", "Landroidx/lifecycle/LiveData;", "getVariationDetailCards", "()Landroidx/lifecycle/LiveData;", "variationViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$VariationViewState;", "getVariationViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "<set-?>", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$VariationViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$VariationViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "deleteVariation", "Lkotlinx/coroutines/Job;", "fetchVariation", "", "remoteProductId", "", "remoteVariationId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShippingClassByRemoteShippingClassId", "", "remoteShippingClassId", "handleVariationDeletion", "deleted", "", "productID", "isUploadingImages", "loadVariation", "observeImageUploadEvents", "onAddImageButtonClicked", "onCleared", "onDeleteVariationClicked", "onEditVariationCardClicked", "target", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "onExit", "onImageClicked", "image", "Lcom/woocommerce/android/model/Product$Image;", "onUpdateButtonClicked", "onVariationChanged", "sku", "Lcom/woocommerce/android/util/Optional;", "regularPrice", "Ljava/math/BigDecimal;", "salePrice", "saleEndDate", "Ljava/util/Date;", "saleStartDate", "isSaleScheduled", "stockStatus", "Lcom/woocommerce/android/ui/products/ProductStockStatus;", "backorderStatus", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "stockQuantity", "", "isPurchasable", "isVirtual", "isDownloadable", "description", "isVisible", "isStockManaged", "shippingClass", "shippingClassId", "attributes", "", "Lcom/woocommerce/android/model/VariantOption;", "length", "", "width", "height", "weight", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/woocommerce/android/util/Optional;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/products/ProductStockStatus;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;[Lcom/woocommerce/android/model/VariantOption;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "onVariationVisibilitySwitchChanged", "showVariation", "variation", "updateCards", "updateVariation", "(Lcom/woocommerce/android/model/ProductVariation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "DeletedVariationData", "HideImageUploadErrorSnackbar", "VariationViewState", "WooCommerce_wasabiDebug"})
public final class VariationDetailViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.products.variations.VariationDetailRepository variationRepository = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.ui.products.ParameterRepository parameterRepository = null;
    private final com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resources = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.Companion Companion = null;
    private static final java.lang.String KEY_VARIATION_PARAMETERS = "key_variation_parameters";
    private static final java.lang.String KEY_ORIGINAL_VARIATION = "key_original_variation";
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.model.ProductVariation originalVariation;
    private final kotlin.Lazy parameters$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState> variationViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard>> _variationDetailCards = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard>> variationDetailCards = null;
    private final kotlin.Lazy cardBuilder$delegate = null;
    
    @javax.inject.Inject
    public VariationDetailViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.VariationDetailRepository variationRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resources) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationDetailFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.model.ProductVariation getOriginalVariation() {
        return null;
    }
    
    private final void setOriginalVariation(com.woocommerce.android.model.ProductVariation value) {
    }
    
    private final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState> getVariationViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard>> getVariationDetailCards() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationDetailCardBuilder getCardBuilder() {
        return null;
    }
    
    /**
     * Called when the any of the editable sections (such as pricing, shipping, inventory)
     * is selected in Product variation screen
     */
    public final void onEditVariationCardClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.VariationNavigationTarget target, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.analytics.AnalyticsEvent stat) {
    }
    
    public final void onDeleteVariationClicked() {
    }
    
    public final void onExit() {
    }
    
    public final void onImageClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Product.Image image) {
    }
    
    public final void onAddImageButtonClicked() {
    }
    
    public final boolean isUploadingImages() {
        return false;
    }
    
    public final void onVariationVisibilitySwitchChanged(boolean isVisible) {
    }
    
    @kotlin.Suppress(names = {"ComplexMethod"})
    public final void onVariationChanged(@org.jetbrains.annotations.Nullable
    java.lang.Long remoteProductId, @org.jetbrains.annotations.Nullable
    java.lang.Long remoteVariationId, @org.jetbrains.annotations.Nullable
    java.lang.String sku, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.util.Optional<com.woocommerce.android.model.Product.Image> image, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal salePrice, @org.jetbrains.annotations.Nullable
    java.util.Date saleEndDate, @org.jetbrains.annotations.Nullable
    java.util.Date saleStartDate, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isSaleScheduled, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus, @org.jetbrains.annotations.Nullable
    java.lang.Double stockQuantity, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isPurchasable, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isVirtual, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isDownloadable, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isVisible, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isStockManaged, @org.jetbrains.annotations.Nullable
    java.lang.String shippingClass, @org.jetbrains.annotations.Nullable
    java.lang.Long shippingClassId, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.VariantOption[] attributes, @org.jetbrains.annotations.Nullable
    java.lang.Float length, @org.jetbrains.annotations.Nullable
    java.lang.Float width, @org.jetbrains.annotations.Nullable
    java.lang.Float height, @org.jetbrains.annotations.Nullable
    java.lang.Float weight) {
    }
    
    public final void onUpdateButtonClicked() {
    }
    
    private final java.lang.Object updateVariation(com.woocommerce.android.model.ProductVariation variation, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final kotlinx.coroutines.Job deleteVariation() {
        return null;
    }
    
    private final void handleVariationDeletion(boolean deleted, long productID) {
    }
    
    private final void loadVariation(long remoteProductId, long remoteVariationId) {
    }
    
    private final java.lang.Object fetchVariation(long remoteProductId, long remoteVariationId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final void updateCards(com.woocommerce.android.model.ProductVariation variation) {
    }
    
    private final void showVariation(com.woocommerce.android.model.ProductVariation variation) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShippingClassByRemoteShippingClassId(long remoteShippingClassId) {
        return null;
    }
    
    private final void observeImageUploadEvents() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$HideImageUploadErrorSnackbar;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_wasabiDebug"})
    public static final class HideImageUploadErrorSnackbar extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.HideImageUploadErrorSnackbar INSTANCE = null;
        
        private HideImageUploadErrorSnackbar() {
            super(false);
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u00107\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u00cc\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010;J\t\u0010<\u001a\u00020=H\u00d6\u0001J\u0013\u0010>\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u00010@H\u00d6\u0003J\t\u0010A\u001a\u00020=H\u00d6\u0001J\t\u0010B\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020=H\u00d6\u0001R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0017\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\t\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0006\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0004\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\b\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 \u00a8\u0006H"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$VariationViewState;", "Landroid/os/Parcelable;", "variation", "Lcom/woocommerce/android/model/ProductVariation;", "isDoneButtonVisible", "", "isDoneButtonEnabled", "isSkeletonShown", "isProgressDialogShown", "isDeleteDialogShown", "weightWithUnits", "", "sizeWithUnits", "priceWithCurrency", "salePriceWithCurrency", "regularPriceWithCurrency", "gmtOffset", "", "shippingClass", "parentProduct", "Lcom/woocommerce/android/model/Product;", "uploadingImageUri", "Landroid/net/Uri;", "isConfirmingDeletion", "(Lcom/woocommerce/android/model/ProductVariation;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lcom/woocommerce/android/model/Product;Landroid/net/Uri;Ljava/lang/Boolean;)V", "getGmtOffset", "()F", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getParentProduct", "()Lcom/woocommerce/android/model/Product;", "getPriceWithCurrency", "()Ljava/lang/String;", "getRegularPriceWithCurrency", "getSalePriceWithCurrency", "getShippingClass", "getSizeWithUnits", "getUploadingImageUri", "()Landroid/net/Uri;", "getVariation", "()Lcom/woocommerce/android/model/ProductVariation;", "getWeightWithUnits", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/woocommerce/android/model/ProductVariation;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lcom/woocommerce/android/model/Product;Landroid/net/Uri;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$VariationViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class VariationViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.ProductVariation variation = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isDoneButtonVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isDoneButtonEnabled = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isProgressDialogShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isDeleteDialogShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String weightWithUnits = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String sizeWithUnits = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String priceWithCurrency = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String salePriceWithCurrency = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String regularPriceWithCurrency = null;
        private final float gmtOffset = 0.0F;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String shippingClass = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Product parentProduct = null;
        @org.jetbrains.annotations.Nullable
        private final android.net.Uri uploadingImageUri = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isConfirmingDeletion = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ProductVariation variation, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isDoneButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isDoneButtonEnabled, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isDeleteDialogShown, @org.jetbrains.annotations.Nullable
        java.lang.String weightWithUnits, @org.jetbrains.annotations.Nullable
        java.lang.String sizeWithUnits, @org.jetbrains.annotations.Nullable
        java.lang.String priceWithCurrency, @org.jetbrains.annotations.Nullable
        java.lang.String salePriceWithCurrency, @org.jetbrains.annotations.Nullable
        java.lang.String regularPriceWithCurrency, float gmtOffset, @org.jetbrains.annotations.Nullable
        java.lang.String shippingClass, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Product parentProduct, @org.jetbrains.annotations.Nullable
        android.net.Uri uploadingImageUri, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isConfirmingDeletion) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public VariationViewState() {
            super();
        }
        
        public VariationViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ProductVariation variation, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isDoneButtonVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isDoneButtonEnabled, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isDeleteDialogShown, @org.jetbrains.annotations.Nullable
        java.lang.String weightWithUnits, @org.jetbrains.annotations.Nullable
        java.lang.String sizeWithUnits, @org.jetbrains.annotations.Nullable
        java.lang.String priceWithCurrency, @org.jetbrains.annotations.Nullable
        java.lang.String salePriceWithCurrency, @org.jetbrains.annotations.Nullable
        java.lang.String regularPriceWithCurrency, float gmtOffset, @org.jetbrains.annotations.Nullable
        java.lang.String shippingClass, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Product parentProduct, @org.jetbrains.annotations.Nullable
        android.net.Uri uploadingImageUri, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isConfirmingDeletion) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ProductVariation component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ProductVariation getVariation() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isDoneButtonVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isDoneButtonEnabled() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isProgressDialogShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isDeleteDialogShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getWeightWithUnits() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSizeWithUnits() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPriceWithCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSalePriceWithCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRegularPriceWithCurrency() {
            return null;
        }
        
        public final float component12() {
            return 0.0F;
        }
        
        public final float getGmtOffset() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getShippingClass() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Product component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Product getParentProduct() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.net.Uri getUploadingImageUri() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isConfirmingDeletion() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.VariationViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$DeletedVariationData;", "Landroid/os/Parcelable;", "productID", "", "variationID", "(JJ)V", "getProductID", "()J", "getVariationID", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class DeletedVariationData implements android.os.Parcelable {
        private final long productID = 0L;
        private final long variationID = 0L;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationDetailViewModel.DeletedVariationData> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.DeletedVariationData copy(long productID, long variationID) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DeletedVariationData(long productID, long variationID) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getProductID() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getVariationID() {
            return 0L;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.VariationDetailViewModel.DeletedVariationData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.DeletedVariationData createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.variations.VariationDetailViewModel.DeletedVariationData[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationDetailViewModel$Companion;", "", "()V", "KEY_ORIGINAL_VARIATION", "", "KEY_VARIATION_PARAMETERS", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}