package com.woocommerce.android.ui.products.variations

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphProductsDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.ProductFile
import com.woocommerce.android.model.ProductVariation
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

public class VariationListFragmentDirections private constructor() {
  private data class ActionVariationListFragmentToVariationDetailFragment(
    public val remoteProductId: Long,
    public val remoteVariationId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_variationListFragment_to_variationDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        result.putLong("remoteVariationId", this.remoteVariationId)
        return result
      }
  }

  private data class ActionVariationListFragmentToAddAttributeFragment(
    public val isVariationCreation: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_variationListFragment_to_addAttributeFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("isVariationCreation", this.isVariationCreation)
        return result
      }
  }

  private data class ActionVariationListFragmentToVariationsBulkUpdateAttrPickerFragment(
    public val variationsToUpdate: Array<ProductVariation>
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_variationListFragment_to_variationsBulkUpdateAttrPickerFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putParcelableArray("variationsToUpdate", this.variationsToUpdate)
        return result
      }
  }

  public companion object {
    public fun actionVariationListFragmentToVariationDetailFragment(remoteProductId: Long,
        remoteVariationId: Long): NavDirections =
        ActionVariationListFragmentToVariationDetailFragment(remoteProductId, remoteVariationId)

    public fun actionVariationListFragmentToAddAttributeFragment(isVariationCreation: Boolean =
        false): NavDirections =
        ActionVariationListFragmentToAddAttributeFragment(isVariationCreation)

    public
        fun actionVariationListFragmentToVariationsBulkUpdateAttrPickerFragment(variationsToUpdate: Array<ProductVariation>):
        NavDirections =
        ActionVariationListFragmentToVariationsBulkUpdateAttrPickerFragment(variationsToUpdate)

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
