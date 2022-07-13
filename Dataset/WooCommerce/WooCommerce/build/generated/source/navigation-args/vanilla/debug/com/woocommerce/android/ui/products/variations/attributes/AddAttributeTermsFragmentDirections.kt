package com.woocommerce.android.ui.products.variations.attributes

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphProductsDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.ProductFile
import com.woocommerce.android.ui.media.MediaFileUploadHandler
import com.woocommerce.android.ui.products.GroupedProductListType
import com.woocommerce.android.ui.products.ProductShippingViewModel
import com.woocommerce.android.ui.products.ProductType
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String

public class AddAttributeTermsFragmentDirections private constructor() {
  private data class ActionAttributeTermsFragmentToRenameAttributeFragment(
    public val attributeName: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_attributeTermsFragment_to_renameAttributeFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("attributeName", this.attributeName)
        return result
      }
  }

  private data class ActionAddAttributeTermsFragmentToAttributeListFragment(
    public val isVariationCreation: Boolean = false
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_addAttributeTermsFragment_to_attributeListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("isVariationCreation", this.isVariationCreation)
        return result
      }
  }

  public companion object {
    public fun actionAttributeTermsFragmentToRenameAttributeFragment(attributeName: String):
        NavDirections = ActionAttributeTermsFragmentToRenameAttributeFragment(attributeName)

    public fun actionAddAttributeTermsFragmentToAttributeListFragment(isVariationCreation: Boolean =
        false): NavDirections =
        ActionAddAttributeTermsFragmentToAttributeListFragment(isVariationCreation)

    public fun actionProductDetailFragmentToProductSettingsFragment(): NavDirections =
        NavGraphProductsDirections.actionProductDetailFragmentToProductSettingsFragment()

    public fun actionProductCategoriesFragmentToAddProductCategoryFragment(): NavDirections =
        NavGraphProductsDirections.actionProductCategoriesFragmentToAddProductCategoryFragment()

    public fun actionGlobalAztecEditorFragment(
      aztecText: String = "\"\"",
      aztecTitle: String = "\"\"",
      aztecCaption: String? = null,
      requestCode: Int = 0,
      productTitle: String = "\"\""
    ): NavDirections = NavGraphProductsDirections.actionGlobalAztecEditorFragment(aztecText,
        aztecTitle, aztecCaption, requestCode, productTitle)

    public fun actionGlobalProductDetailBottomSheetFragment(productType: ProductType): NavDirections
        = NavGraphProductsDirections.actionGlobalProductDetailBottomSheetFragment(productType)

    public fun actionGlobalProductShippingFragment(requestCode: Int,
        shippingData: ProductShippingViewModel.ShippingData): NavDirections =
        NavGraphProductsDirections.actionGlobalProductShippingFragment(requestCode, shippingData)

    public fun actionGlobalProductCategoriesFragment(remoteProductId: Long = 0L): NavDirections =
        NavGraphProductsDirections.actionGlobalProductCategoriesFragment(remoteProductId)

    public fun actionGlobalProductTagsFragment(remoteProductId: Long = 0L): NavDirections =
        NavGraphProductsDirections.actionGlobalProductTagsFragment(remoteProductId)

    public fun actionGlobalGroupedProductListFragment(
      productIds: LongArray,
      groupedProductListType: GroupedProductListType,
      remoteProductId: Long = 0L
    ): NavDirections = NavGraphProductsDirections.actionGlobalGroupedProductListFragment(productIds,
        groupedProductListType, remoteProductId)

    public fun actionGlobalProductSelectionListFragment(
      groupedProductListType: GroupedProductListType,
      excludedProductIds: LongArray,
      remoteProductId: Long = 0L
    ): NavDirections =
        NavGraphProductsDirections.actionGlobalProductSelectionListFragment(groupedProductListType,
        excludedProductIds, remoteProductId)

    public fun actionProductDetailFragmentToLinkedProductsFragment(remoteId: Long = 0L):
        NavDirections =
        NavGraphProductsDirections.actionProductDetailFragmentToLinkedProductsFragment(remoteId)

    public fun actionGlobalAddProductDownloadBottomSheetFragment(): NavDirections =
        NavGraphProductsDirections.actionGlobalAddProductDownloadBottomSheetFragment()

    public fun actionGlobalMediaUploadErrorsFragment(remoteId: Long = 0L,
        errorList: Array<MediaFileUploadHandler.ProductImageUploadData>? = null): NavDirections =
        NavGraphProductsDirections.actionGlobalMediaUploadErrorsFragment(remoteId, errorList)

    public fun actionGlobalProductDownloadDetailsFragment(isEditing: Boolean,
        productFile: ProductFile): NavDirections =
        NavGraphProductsDirections.actionGlobalProductDownloadDetailsFragment(isEditing,
        productFile)

    public fun actionGlobalAddVariationAttributeTermsFragment(
      attributeId: Long,
      attributeName: String,
      isNewAttribute: Boolean,
      isVariationCreation: Boolean = false
    ): NavDirections =
        NavGraphProductsDirections.actionGlobalAddVariationAttributeTermsFragment(attributeId,
        attributeName, isNewAttribute, isVariationCreation)
  }
}
