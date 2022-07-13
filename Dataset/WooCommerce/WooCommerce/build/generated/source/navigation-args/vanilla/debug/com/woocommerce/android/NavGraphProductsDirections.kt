package com.woocommerce.android

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.model.ProductFile
import com.woocommerce.android.ui.media.MediaFileUploadHandler
import com.woocommerce.android.ui.products.GroupedProductListType
import com.woocommerce.android.ui.products.ProductShippingViewModel
import com.woocommerce.android.ui.products.ProductType
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlin.Suppress

public class NavGraphProductsDirections private constructor() {
  private data class ActionGlobalAztecEditorFragment(
    public val aztecText: String = "\"\"",
    public val aztecTitle: String = "\"\"",
    public val aztecCaption: String? = null,
    public val requestCode: Int = 0,
    public val productTitle: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_aztecEditorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("aztecText", this.aztecText)
        result.putString("aztecTitle", this.aztecTitle)
        result.putString("aztecCaption", this.aztecCaption)
        result.putInt("requestCode", this.requestCode)
        result.putString("productTitle", this.productTitle)
        return result
      }
  }

  private data class ActionGlobalProductDetailBottomSheetFragment(
    public val productType: ProductType
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productDetailBottomSheetFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(ProductType::class.java)) {
          result.putParcelable("productType", this.productType as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
          result.putSerializable("productType", this.productType as Serializable)
        } else {
          throw UnsupportedOperationException(ProductType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionGlobalProductShippingFragment(
    public val requestCode: Int,
    public val shippingData: ProductShippingViewModel.ShippingData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productShippingFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putInt("requestCode", this.requestCode)
        if
            (Parcelable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
          result.putParcelable("shippingData", this.shippingData as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(ProductShippingViewModel.ShippingData::class.java)) {
          result.putSerializable("shippingData", this.shippingData as Serializable)
        } else {
          throw UnsupportedOperationException(ProductShippingViewModel.ShippingData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionGlobalProductCategoriesFragment(
    public val remoteProductId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productCategoriesFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        return result
      }
  }

  private data class ActionGlobalProductTagsFragment(
    public val remoteProductId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productTagsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        return result
      }
  }

  private data class ActionGlobalGroupedProductListFragment(
    public val productIds: LongArray,
    public val groupedProductListType: GroupedProductListType,
    public val remoteProductId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_groupedProductListFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        result.putLongArray("productIds", this.productIds)
        if (Parcelable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
          result.putParcelable("groupedProductListType", this.groupedProductListType as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
          result.putSerializable("groupedProductListType", this.groupedProductListType as
              Serializable)
        } else {
          throw UnsupportedOperationException(GroupedProductListType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionGlobalProductSelectionListFragment(
    public val groupedProductListType: GroupedProductListType,
    public val excludedProductIds: LongArray,
    public val remoteProductId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productSelectionListFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        if (Parcelable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
          result.putParcelable("groupedProductListType", this.groupedProductListType as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
          result.putSerializable("groupedProductListType", this.groupedProductListType as
              Serializable)
        } else {
          throw UnsupportedOperationException(GroupedProductListType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putLongArray("excludedProductIds", this.excludedProductIds)
        return result
      }
  }

  private data class ActionProductDetailFragmentToLinkedProductsFragment(
    public val remoteId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productDetailFragment_to_linkedProductsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteId", this.remoteId)
        return result
      }
  }

  private data class ActionGlobalMediaUploadErrorsFragment(
    public val remoteId: Long = 0L,
    public val errorList: Array<MediaFileUploadHandler.ProductImageUploadData>? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_mediaUploadErrorsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteId", this.remoteId)
        result.putParcelableArray("errorList", this.errorList)
        return result
      }
  }

  private data class ActionGlobalProductDownloadDetailsFragment(
    public val isEditing: Boolean,
    public val productFile: ProductFile
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productDownloadDetailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putBoolean("isEditing", this.isEditing)
        if (Parcelable::class.java.isAssignableFrom(ProductFile::class.java)) {
          result.putParcelable("productFile", this.productFile as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(ProductFile::class.java)) {
          result.putSerializable("productFile", this.productFile as Serializable)
        } else {
          throw UnsupportedOperationException(ProductFile::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionGlobalAddVariationAttributeTermsFragment(
    public val attributeId: Long,
    public val attributeName: String,
    public val isNewAttribute: Boolean,
    public val isVariationCreation: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_addVariationAttributeTermsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("attributeId", this.attributeId)
        result.putString("attributeName", this.attributeName)
        result.putBoolean("isNewAttribute", this.isNewAttribute)
        result.putBoolean("isVariationCreation", this.isVariationCreation)
        return result
      }
  }

  public companion object {
    public fun actionProductDetailFragmentToProductSettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_productDetailFragment_to_productSettingsFragment)

    public fun actionProductCategoriesFragmentToAddProductCategoryFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_productCategoriesFragment_to_addProductCategoryFragment)

    public fun actionGlobalAztecEditorFragment(
      aztecText: String = "\"\"",
      aztecTitle: String = "\"\"",
      aztecCaption: String? = null,
      requestCode: Int = 0,
      productTitle: String = "\"\""
    ): NavDirections = ActionGlobalAztecEditorFragment(aztecText, aztecTitle, aztecCaption,
        requestCode, productTitle)

    public fun actionGlobalProductDetailBottomSheetFragment(productType: ProductType): NavDirections
        = ActionGlobalProductDetailBottomSheetFragment(productType)

    public fun actionGlobalProductShippingFragment(requestCode: Int,
        shippingData: ProductShippingViewModel.ShippingData): NavDirections =
        ActionGlobalProductShippingFragment(requestCode, shippingData)

    public fun actionGlobalProductCategoriesFragment(remoteProductId: Long = 0L): NavDirections =
        ActionGlobalProductCategoriesFragment(remoteProductId)

    public fun actionGlobalProductTagsFragment(remoteProductId: Long = 0L): NavDirections =
        ActionGlobalProductTagsFragment(remoteProductId)

    public fun actionGlobalGroupedProductListFragment(
      productIds: LongArray,
      groupedProductListType: GroupedProductListType,
      remoteProductId: Long = 0L
    ): NavDirections = ActionGlobalGroupedProductListFragment(productIds, groupedProductListType,
        remoteProductId)

    public fun actionGlobalProductSelectionListFragment(
      groupedProductListType: GroupedProductListType,
      excludedProductIds: LongArray,
      remoteProductId: Long = 0L
    ): NavDirections = ActionGlobalProductSelectionListFragment(groupedProductListType,
        excludedProductIds, remoteProductId)

    public fun actionProductDetailFragmentToLinkedProductsFragment(remoteId: Long = 0L):
        NavDirections = ActionProductDetailFragmentToLinkedProductsFragment(remoteId)

    public fun actionGlobalAddProductDownloadBottomSheetFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_addProductDownloadBottomSheetFragment)

    public fun actionGlobalMediaUploadErrorsFragment(remoteId: Long = 0L,
        errorList: Array<MediaFileUploadHandler.ProductImageUploadData>? = null): NavDirections =
        ActionGlobalMediaUploadErrorsFragment(remoteId, errorList)

    public fun actionGlobalProductDownloadDetailsFragment(isEditing: Boolean,
        productFile: ProductFile): NavDirections =
        ActionGlobalProductDownloadDetailsFragment(isEditing, productFile)

    public fun actionGlobalAddVariationAttributeTermsFragment(
      attributeId: Long,
      attributeName: String,
      isNewAttribute: Boolean,
      isVariationCreation: Boolean = false
    ): NavDirections = ActionGlobalAddVariationAttributeTermsFragment(attributeId, attributeName,
        isNewAttribute, isVariationCreation)
  }
}
