package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 L2\u00020\u0001:\u0006LMNOPQB7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020/H\u0002J\u0019\u00103\u001a\u00020/2\u0006\u00104\u001a\u000205H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0006\u00107\u001a\u00020/J\u0006\u00108\u001a\u00020/J\u0016\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=J\u0016\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020,J\u0016\u0010B\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010C\u001a\u00020\u0017J\u000e\u0010D\u001a\u00020/2\u0006\u0010:\u001a\u00020;J\u0016\u0010E\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020GJ\u0012\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0016*\u000205H\u0002J\u0015\u0010J\u001a\u00020@*\u00020IH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010KR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001f0(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006R"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "productDetailRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "variationDetailRepository", "Lcom/woocommerce/android/ui/products/variations/VariationDetailRepository;", "shippingLabelRepository", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/products/ParameterRepository;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lcom/woocommerce/android/ui/products/variations/VariationDetailRepository;Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelRepository;)V", "arguments", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "availablePackages", "", "Lcom/woocommerce/android/model/ShippingPackage;", "siteParameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getSiteParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "siteParameters$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "createDefaultPackage", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleMoveItemResult", "", "result", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/MoveShippingItemViewModel$MoveItemResult;", "initState", "loadProductsWeightsIfNeeded", "order", "Lcom/woocommerce/android/model/Order;", "(Lcom/woocommerce/android/model/Order;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onBackButtonClicked", "onDoneButtonClicked", "onExpandedChanged", "position", "", "isExpanded", "", "onMoveButtonClicked", "item", "Lcom/woocommerce/android/model/ShippingLabelPackage$Item;", "shippingPackage", "onPackageSelected", "selectedPackage", "onPackageSpinnerClicked", "onWeightEdited", "weight", "", "getShippableItems", "Lcom/woocommerce/android/model/Order$Item;", "toShippingItem", "(Lcom/woocommerce/android/model/Order$Item;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "OpenPackageCreatorEvent", "OpenPackageSelectorEvent", "ShippingLabelPackageUiModel", "ShowMoveItemDialog", "ViewState", "WooCommerce_wasabiDebug"})
public final class EditShippingLabelPackagesViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productDetailRepository = null;
    private final com.woocommerce.android.ui.products.variations.VariationDetailRepository variationDetailRepository = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PARAMETERS = "key_parameters";
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy siteParameters$delegate = null;
    private java.util.List<com.woocommerce.android.model.ShippingPackage> availablePackages;
    
    @javax.inject.Inject
    public EditShippingLabelPackagesViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductDetailRepository productDetailRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.VariationDetailRepository variationDetailRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelRepository shippingLabelRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.models.SiteParameters getSiteParameters() {
        return null;
    }
    
    private final void initState() {
    }
    
    private final java.lang.Object createDefaultPackage(kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ShippingLabelPackage>> continuation) {
        return null;
    }
    
    private final java.lang.Object loadProductsWeightsIfNeeded(com.woocommerce.android.model.Order order, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onWeightEdited(int position, float weight) {
    }
    
    public final void onExpandedChanged(int position, boolean isExpanded) {
    }
    
    public final void onPackageSpinnerClicked(int position) {
    }
    
    public final void onPackageSelected(int position, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingPackage selectedPackage) {
    }
    
    public final void onMoveButtonClicked(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabelPackage.Item item, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabelPackage shippingPackage) {
    }
    
    @kotlin.Suppress(names = {"ComplexMethod"})
    public final void handleMoveItemResult(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.shippinglabels.creation.MoveShippingItemViewModel.MoveItemResult result) {
    }
    
    public final void onDoneButtonClicked() {
    }
    
    public final void onBackButtonClicked() {
    }
    
    private final java.util.List<com.woocommerce.android.model.Order.Item> getShippableItems(com.woocommerce.android.model.Order $this$getShippableItems) {
        return null;
    }
    
    private final java.lang.Object toShippingItem(com.woocommerce.android.model.Order.Item $this$toShippingItem, kotlin.coroutines.Continuation<? super com.woocommerce.android.model.ShippingLabelPackage.Item> p1) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J3\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u001cH\u00d6\u0001J\t\u0010!\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038F\u00a2\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$ViewState;", "Landroid/os/Parcelable;", "packagesUiModels", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$ShippingLabelPackageUiModel;", "showSkeletonView", "", "packagesWithEditedWeight", "", "", "(Ljava/util/List;ZLjava/util/Set;)V", "isDataValid", "()Z", "packages", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "getPackages$annotations", "()V", "getPackages", "()Ljava/util/List;", "getPackagesUiModels", "getPackagesWithEditedWeight", "()Ljava/util/Set;", "getShowSkeletonView", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel> packagesUiModels = null;
        private final boolean showSkeletonView = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.Set<java.lang.String> packagesWithEditedWeight = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel> packagesUiModels, boolean showSkeletonView, @org.jetbrains.annotations.NotNull
        java.util.Set<java.lang.String> packagesWithEditedWeight) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel> packagesUiModels, boolean showSkeletonView, @org.jetbrains.annotations.NotNull
        java.util.Set<java.lang.String> packagesWithEditedWeight) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel> getPackagesUiModels() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getShowSkeletonView() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.String> getPackagesWithEditedWeight() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getPackages$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getPackages() {
            return null;
        }
        
        public final boolean isDataValid() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\n\u001a\u00020\u00038F\u00a2\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$ShippingLabelPackageUiModel;", "Landroid/os/Parcelable;", "isExpanded", "", "data", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "(ZLcom/woocommerce/android/model/ShippingLabelPackage;)V", "getData", "()Lcom/woocommerce/android/model/ShippingLabelPackage;", "()Z", "isValid", "isValid$annotations", "()V", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ShippingLabelPackageUiModel implements android.os.Parcelable {
        private final boolean isExpanded = false;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.ShippingLabelPackage data = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel copy(boolean isExpanded, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingLabelPackage data) {
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
        
        public ShippingLabelPackageUiModel(boolean isExpanded, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingLabelPackage data) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isExpanded() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingLabelPackage component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingLabelPackage getData() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void isValid$annotations() {
        }
        
        public final boolean isValid() {
            return false;
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShippingLabelPackageUiModel[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$OpenPackageSelectorEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class OpenPackageSelectorEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final int position = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.OpenPackageSelectorEvent copy(int position) {
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
        
        public OpenPackageSelectorEvent(int position) {
            super(false);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getPosition() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$OpenPackageCreatorEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class OpenPackageCreatorEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final int position = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.OpenPackageCreatorEvent copy(int position) {
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
        
        public OpenPackageCreatorEvent(int position) {
            super(false);
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getPosition() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$ShowMoveItemDialog;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "item", "Lcom/woocommerce/android/model/ShippingLabelPackage$Item;", "currentPackage", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "packagesList", "", "(Lcom/woocommerce/android/model/ShippingLabelPackage$Item;Lcom/woocommerce/android/model/ShippingLabelPackage;Ljava/util/List;)V", "getCurrentPackage", "()Lcom/woocommerce/android/model/ShippingLabelPackage;", "getItem", "()Lcom/woocommerce/android/model/ShippingLabelPackage$Item;", "getPackagesList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ShowMoveItemDialog extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.ShippingLabelPackage.Item item = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.ShippingLabelPackage currentPackage = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> packagesList = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPackagesViewModel.ShowMoveItemDialog copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingLabelPackage.Item item, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingLabelPackage currentPackage, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> packagesList) {
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
        
        public ShowMoveItemDialog(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingLabelPackage.Item item, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingLabelPackage currentPackage, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.ShippingLabelPackage> packagesList) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingLabelPackage.Item component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingLabelPackage.Item getItem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingLabelPackage component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingLabelPackage getCurrentPackage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getPackagesList() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPackagesViewModel$Companion;", "", "()V", "KEY_PARAMETERS", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}