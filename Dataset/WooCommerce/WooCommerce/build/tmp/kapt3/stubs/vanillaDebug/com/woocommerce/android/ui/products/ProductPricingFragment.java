package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020%H\u0016J\b\u0010.\u001a\u00020%H\u0016J\b\u0010/\u001a\u00020%H\u0016J\u001a\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\'2\b\u00102\u001a\u0004\u0018\u00010,H\u0016J\u001a\u00103\u001a\u00020%2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020,2\u0006\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020=H\u0002J \u0010>\u001a\u00020%2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@2\u0006\u0010<\u001a\u00020=H\u0002J\u0012\u0010B\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010DH\u0002J\u001c\u0010E\u001a\u00020%2\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010G\u001a\u0004\u0018\u00010DH\u0002J\u000e\u0010H\u001a\u00020,*\u0004\u0018\u00010DH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006I"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductPricingFragment;", "Lcom/woocommerce/android/ui/products/BaseProductEditorFragment;", "Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog$ProductItemSelectorDialogListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductPricingBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductPricingBinding;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "getDateUtils", "()Lcom/woocommerce/android/util/DateUtils;", "setDateUtils", "(Lcom/woocommerce/android/util/DateUtils;)V", "endDatePickerDialog", "Landroid/app/DatePickerDialog;", "lastEvent", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "getLastEvent", "()Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "productTaxClassSelectorDialog", "Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog;", "productTaxStatusSelectorDialog", "startDatePickerDialog", "viewModel", "Lcom/woocommerce/android/ui/products/ProductPricingViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductPricingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayDatePickerDialog", "spinnerEditText", "Lcom/woocommerce/android/widgets/WCMaterialOutlinedSpinnerView;", "dateSetListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "displaySalePriceError", "", "messageId", "", "enableScheduleSale", "scheduleSale", "", "getFragmentTitle", "", "onDestroyView", "onExit", "onPause", "onProductItemSelected", "resultCode", "selectedItem", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupViews", "currency", "isCurrencyPrefix", "pricingData", "Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "updateProductTaxClassList", "taxClassList", "", "Lcom/woocommerce/android/model/TaxClass;", "updateSaleEndDate", "selectedDate", "Ljava/util/Date;", "updateSaleStartDate", "selectedStartDate", "endDate", "formatForDisplay", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductPricingFragment extends com.woocommerce.android.ui.products.BaseProductEditorFragment implements com.woocommerce.android.ui.products.ProductItemSelectorDialog.ProductItemSelectorDialogListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.ui.products.ProductItemSelectorDialog productTaxStatusSelectorDialog;
    private com.woocommerce.android.ui.products.ProductItemSelectorDialog productTaxClassSelectorDialog;
    private android.app.DatePickerDialog startDatePickerDialog;
    private android.app.DatePickerDialog endDatePickerDialog;
    private com.woocommerce.android.databinding.FragmentProductPricingBinding _binding;
    @javax.inject.Inject()
    public com.woocommerce.android.util.DateUtils dateUtils;
    
    public ProductPricingFragment() {
        super(0);
    }
    
    private final com.woocommerce.android.ui.products.ProductPricingViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.woocommerce.android.viewmodel.MultiLiveEvent.Event getLastEvent() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductPricingBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.DateUtils getDateUtils() {
        return null;
    }
    
    public final void setDateUtils(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils p0) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductPricingViewModel viewModel) {
    }
    
    private final void setupViews(java.lang.String currency, boolean isCurrencyPrefix, com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData) {
    }
    
    @java.lang.Override()
    public void onExit() {
    }
    
    /**
     * Method to update the start date of a sale
     *
     * If the [selectedStartDate] is empty or null, then the default is set to the current date,
     * only if the [endDate] > the current date.
     *
     * The [viewModel] is only updated if the [selectedStartDate] is not null. This is to prevent
     * the discard dialog from being displayed when there have been no user initiated changes made
     * to the screen.
     */
    private final void updateSaleStartDate(java.util.Date selectedStartDate, java.util.Date endDate) {
    }
    
    private final void updateSaleEndDate(java.util.Date selectedDate) {
    }
    
    private final void updateProductTaxClassList(java.util.List<com.woocommerce.android.model.TaxClass> taxClassList, com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData) {
    }
    
    private final void displaySalePriceError(int messageId) {
    }
    
    private final void enableScheduleSale(boolean scheduleSale) {
    }
    
    private final android.app.DatePickerDialog displayDatePickerDialog(com.woocommerce.android.widgets.WCMaterialOutlinedSpinnerView spinnerEditText, android.app.DatePickerDialog.OnDateSetListener dateSetListener) {
        return null;
    }
    
    /**
     * Formats the given [date] or the current date if it's null to `'MMM dd, YYYY'`
     */
    private final java.lang.String formatForDisplay(java.util.Date $this$formatForDisplay) {
        return null;
    }
    
    @java.lang.Override()
    public void onProductItemSelected(int resultCode, @org.jetbrains.annotations.Nullable()
    java.lang.String selectedItem) {
    }
}