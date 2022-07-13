package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphMainDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.FeatureAnnouncement
import com.woocommerce.android.ui.common.InfoScreenFragment
import com.woocommerce.android.ui.feedback.SurveyType
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

public class ProductListFragmentDirections private constructor() {
  private data class ActionProductListFragmentToProductFilterListFragment(
    public val selectedStockStatus: String?,
    public val selectedProductStatus: String?,
    public val selectedProductType: String?,
    public val selectedProductCategoryId: String?,
    public val selectedProductCategoryName: String?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productListFragment_to_productFilterListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("selectedStockStatus", this.selectedStockStatus)
        result.putString("selectedProductStatus", this.selectedProductStatus)
        result.putString("selectedProductType", this.selectedProductType)
        result.putString("selectedProductCategoryId", this.selectedProductCategoryId)
        result.putString("selectedProductCategoryName", this.selectedProductCategoryName)
        return result
      }
  }

  private data class ActionProductListFragmentToProductTypesBottomSheet(
    public val isAddProduct: Boolean = false,
    public val remoteProductId: Long = 0L,
    public val currentProductType: String? = "null",
    public val isCurrentProductVirtual: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productListFragment_to_productTypesBottomSheet

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("isAddProduct", this.isAddProduct)
        result.putLong("remoteProductId", this.remoteProductId)
        result.putString("currentProductType", this.currentProductType)
        result.putBoolean("isCurrentProductVirtual", this.isCurrentProductVirtual)
        return result
      }
  }

  public companion object {
    public fun actionProductListFragmentToProductFilterListFragment(
      selectedStockStatus: String?,
      selectedProductStatus: String?,
      selectedProductType: String?,
      selectedProductCategoryId: String?,
      selectedProductCategoryName: String?
    ): NavDirections = ActionProductListFragmentToProductFilterListFragment(selectedStockStatus,
        selectedProductStatus, selectedProductType, selectedProductCategoryId,
        selectedProductCategoryName)

    public fun actionProductListFragmentToProductTypesBottomSheet(
      isAddProduct: Boolean = false,
      remoteProductId: Long = 0L,
      currentProductType: String? = "null",
      isCurrentProductVirtual: Boolean = false
    ): NavDirections = ActionProductListFragmentToProductTypesBottomSheet(isAddProduct,
        remoteProductId, currentProductType, isCurrentProductVirtual)

    public fun actionGlobalItemSelectorDialog(): NavDirections =
        NavGraphMainDirections.actionGlobalItemSelectorDialog()

    public fun actionGlobalFeedbackSurveyFragment(surveyType: SurveyType = SurveyType.MAIN):
        NavDirections = NavGraphMainDirections.actionGlobalFeedbackSurveyFragment(surveyType)

    public fun actionGlobalProductDetailFragment(
      remoteProductId: Long = 0L,
      isAddProduct: Boolean = false,
      isTrashEnabled: Boolean = false
    ): NavDirections = NavGraphMainDirections.actionGlobalProductDetailFragment(remoteProductId,
        isAddProduct, isTrashEnabled)

    public fun actionGlobalReviewDetailFragment(
      launchedFromNotification: Boolean,
      remoteReviewId: Long = 0L,
      tempStatus: String? = "null"
    ): NavDirections =
        NavGraphMainDirections.actionGlobalReviewDetailFragment(launchedFromNotification,
        remoteReviewId, tempStatus)

    public fun actionGlobalWPComWebViewFragment(urlToLoad: String, urlToTriggerExit: String? =
        null): NavDirections = NavGraphMainDirections.actionGlobalWPComWebViewFragment(urlToLoad,
        urlToTriggerExit)

    public fun actionGlobalUserEligibilityErrorFragment(): NavDirections =
        NavGraphMainDirections.actionGlobalUserEligibilityErrorFragment()

    public fun actionGlobalInfoScreenFragment(
      screenTitle: Int = 0,
      heading: Int = 0,
      message: Int = 0,
      linkTitle: Int = 0,
      imageResource: Int = 0,
      linkAction: InfoScreenFragment.InfoScreenLinkAction? = null
    ): NavDirections = NavGraphMainDirections.actionGlobalInfoScreenFragment(screenTitle, heading,
        message, linkTitle, imageResource, linkAction)

    public fun actionGlobalLoginToSitePickerFragment(openedFromLogin: Boolean = true): NavDirections
        = NavGraphMainDirections.actionGlobalLoginToSitePickerFragment(openedFromLogin)

    public fun actionOpenWhatsnewFromMain(announcement: FeatureAnnouncement): NavDirections =
        NavGraphMainDirections.actionOpenWhatsnewFromMain(announcement)

    public fun actionGlobalSimpleTextEditorFragment(
      currentText: String?,
      screenTitle: String,
      hint: String,
      requestCode: Int = -1
    ): NavDirections = NavGraphMainDirections.actionGlobalSimpleTextEditorFragment(currentText,
        screenTitle, hint, requestCode)
  }
}
