package com.woocommerce.android.ui.products.variations.attributes.edit;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001AB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020-H\u0002J\u0016\u0010/\u001a\u00020-2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201J\u0014\u00103\u001a\u00020-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0019\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u001b\u00108\u001a\u00020-*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J$\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;0\rH\u0002J-\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;0\r*\b\u0012\u0004\u0012\u00020<0\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J2\u0010?\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;\u0018\u00010@*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;0\rH\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b&\u0010\'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020 0)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006B"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/edit/EditVariationAttributesViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "variationRepository", "Lcom/woocommerce/android/ui/products/variations/VariationDetailRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lcom/woocommerce/android/ui/products/variations/VariationDetailRepository;)V", "_editableVariationAttributeList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/products/variations/attributes/edit/VariationAttributeSelectionGroup;", "editableVariationAttributeList", "getEditableVariationAttributeList", "()Landroidx/lifecycle/MutableLiveData;", "hasChanges", "", "getHasChanges", "()Z", "parentProduct", "Lcom/woocommerce/android/model/Product;", "getParentProduct", "()Lcom/woocommerce/android/model/Product;", "parentProduct$delegate", "Lkotlin/Lazy;", "selectedVariationDeferred", "Lkotlinx/coroutines/Deferred;", "Lcom/woocommerce/android/model/ProductVariation;", "<set-?>", "Lcom/woocommerce/android/ui/products/variations/attributes/edit/EditVariationAttributesViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/variations/attributes/edit/EditVariationAttributesViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/variations/attributes/edit/EditVariationAttributesViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "exit", "", "loadProductAttributes", "start", "productId", "", "variationId", "updateData", "attributeSelection", "updateSkeletonVisibility", "visible", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchListResult", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapToAttributeSelectionGroupList", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/ProductAttribute;", "Lcom/woocommerce/android/model/VariantOption;", "pairAttributeWithSelectedOption", "pairAttributeWithUnselectedOption", "", "ViewState", "WooCommerce_vanillaDebug"})
public final class EditVariationAttributesViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    private final com.woocommerce.android.ui.products.variations.VariationDetailRepository variationRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup>> _editableVariationAttributeList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup>> editableVariationAttributeList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState> viewStateLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final kotlinx.coroutines.Deferred<com.woocommerce.android.model.ProductVariation> selectedVariationDeferred = null;
    private final kotlin.Lazy parentProduct$delegate = null;
    
    @javax.inject.Inject()
    public EditVariationAttributesViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.VariationDetailRepository variationRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup>> getEditableVariationAttributeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState> getViewStateLiveData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState p0) {
    }
    
    private final com.woocommerce.android.model.Product getParentProduct() {
        return null;
    }
    
    private final boolean getHasChanges() {
        return false;
    }
    
    public final void start(long productId, long variationId) {
    }
    
    public final void exit() {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> attributeSelection) {
    }
    
    private final void loadProductAttributes() {
    }
    
    private final java.lang.Object pairAttributeWithSelectedOption(java.util.List<com.woocommerce.android.model.ProductAttribute> $this$pairAttributeWithSelectedOption, kotlin.coroutines.Continuation<? super java.util.List<kotlin.Pair<com.woocommerce.android.model.ProductAttribute, com.woocommerce.android.model.VariantOption>>> p1) {
        return null;
    }
    
    private final java.util.List<kotlin.Pair<com.woocommerce.android.model.ProductAttribute, com.woocommerce.android.model.VariantOption>> pairAttributeWithUnselectedOption(java.util.List<kotlin.Pair<com.woocommerce.android.model.ProductAttribute, com.woocommerce.android.model.VariantOption>> $this$pairAttributeWithUnselectedOption) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> mapToAttributeSelectionGroupList(java.util.List<kotlin.Pair<com.woocommerce.android.model.ProductAttribute, com.woocommerce.android.model.VariantOption>> $this$mapToAttributeSelectionGroupList) {
        return null;
    }
    
    private final java.lang.Object dispatchListResult(java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> $this$dispatchListResult, kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private final java.lang.Object updateSkeletonVisibility(boolean visible, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/edit/EditVariationAttributesViewModel$ViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "parentProductID", "", "editableVariationID", "updatedAttributeSelection", "", "Lcom/woocommerce/android/ui/products/variations/attributes/edit/VariationAttributeSelectionGroup;", "(Ljava/lang/Boolean;JJLjava/util/List;)V", "getEditableVariationID", "()J", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getParentProductID", "getUpdatedAttributeSelection", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;JJLjava/util/List;)Lcom/woocommerce/android/ui/products/variations/attributes/edit/EditVariationAttributesViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        private final long parentProductID = 0L;
        private final long editableVariationID = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> updatedAttributeSelection = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, long parentProductID, long editableVariationID, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> updatedAttributeSelection) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, long parentProductID, long editableVariationID, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> updatedAttributeSelection) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getParentProductID() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getEditableVariationID() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> getUpdatedAttributeSelection() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.attributes.edit.EditVariationAttributesViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
}