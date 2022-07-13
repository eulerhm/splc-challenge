package com.woocommerce.android.ui.products

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphProductsDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Product
import com.woocommerce.android.model.ProductFile
import com.woocommerce.android.ui.media.MediaFileUploadHandler
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlin.Suppress

public class ProductDetailFragmentDirections private constructor() {
  private data class ActionProductDetailFragmentToVariationListFragment(
    public val remoteProductId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productDetailFragment_to_variationListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        return result
      }
  }

  private data class ActionProductDetailFragmentToProductInventoryFragment(
    public val requestCode: Int,
    public val inventoryData: ProductInventoryViewModel.InventoryData,
    public val sku: String,
    public val productType: ProductType = ProductType.SIMPLE
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productDetailFragment_to_productInventoryFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putInt("requestCode", this.requestCode)
        if
            (Parcelable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
          result.putParcelable("inventoryData", this.inventoryData as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(ProductInventoryViewModel.InventoryData::class.java)) {
          result.putSerializable("inventoryData", this.inventoryData as Serializable)
        } else {
          throw UnsupportedOperationException(ProductInventoryViewModel.InventoryData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putString("sku", this.sku)
        if (Parcelable::class.java.isAssignableFrom(ProductType::class.java)) {
          result.putParcelable("productType", this.productType as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(ProductType::class.java)) {
          result.putSerializable("productType", this.productType as Serializable)
        }
        return result
      }
  }

  private data class ActionProductDetailFragmentToProductPricingFragment(
    public val requestCode: Int,
    public val pricingData: ProductPricingViewModel.PricingData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productDetailFragment_to_productPricingFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putInt("requestCode", this.requestCode)
        if
            (Parcelable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
          result.putParcelable("pricingData", this.pricingData as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(ProductPricingViewModel.PricingData::class.java)) {
          result.putSerializable("pricingData", this.pricingData as Serializable)
        } else {
          throw UnsupportedOperationException(ProductPricingViewModel.PricingData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionProductDetailFragmentToProductExternalLinkFragment(
    public val remoteMediaId: Long
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productDetailFragment_to_productExternalLinkFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteMediaId", this.remoteMediaId)
        return result
      }
  }

  private data class ActionProductDetailFragmentToProductReviewsFragment(
    public val remoteProductId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productDetailFragment_to_productReviewsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        return result
      }
  }

  private data class ActionProductDetailFragmentToAttributeListFragment(
    public val isVariationCreation: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productDetailFragment_to_attributeListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("isVariationCreation", this.isVariationCreation)
        return result
      }
  }

  private data class ActionProductDetailFragmentToProductTypesBottomSheetFragment(
    public val isAddProduct: Boolean = false,
    public val remoteProductId: Long = 0L,
    public val currentProductType: String? = "null",
    public val isCurrentProductVirtual: Boolean = false
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productDetailFragment_to_productTypesBottomSheetFragment

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

  private data class ActionProductDetailFragmentToNavGraphImageGallery(
    public val images: Array<Product.Image>,
    public val selectedImage: Product.Image?,
    public val showChooser: Boolean,
    public val requestCode: Int,
    public val remoteId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productDetailFragment_to_nav_graph_image_gallery

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putLong("remoteId", this.remoteId)
        result.putParcelableArray("images", this.images)
        if (Parcelable::class.java.isAssignableFrom(Product.Image::class.java)) {
          result.putParcelable("selectedImage", this.selectedImage as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Product.Image::class.java)) {
          result.putSerializable("selectedImage", this.selectedImage as Serializable?)
        } else {
          throw UnsupportedOperationException(Product.Image::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putBoolean("showChooser", this.showChooser)
        result.putInt("requestCode", this.requestCode)
        return result
      }
  }

  private data class ActionProductDetailFragmentToAddAttributeFragment(
    public val isVariationCreation: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productDetailFragment_to_addAttributeFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("isVariationCreation", this.isVariationCreation)
        return result
      }
  }

  public companion object {
    public fun actionProductDetailFragmentToVariationListFragment(remoteProductId: Long = 0L):
        NavDirections = ActionProductDetailFragmentToVariationListFragment(remoteProductId)

    public fun actionProductDetailFragmentToProductInventoryFragment(
      requestCode: Int,
      inventoryData: ProductInventoryViewModel.InventoryData,
      sku: String,
      productType: ProductType = ProductType.SIMPLE
    ): NavDirections = ActionProductDetailFragmentToProductInventoryFragment(requestCode,
        inventoryData, sku, productType)

    public fun actionProductDetailFragmentToProductPricingFragment(requestCode: Int,
        pricingData: ProductPricingViewModel.PricingData): NavDirections =
        ActionProductDetailFragmentToProductPricingFragment(requestCode, pricingData)

    public fun actionProductDetailFragmentToProductExternalLinkFragment(remoteMediaId: Long):
        NavDirections = ActionProductDetailFragmentToProductExternalLinkFragment(remoteMediaId)

    public fun actionProductDetailFragmentToProductReviewsFragment(remoteProductId: Long = 0L):
        NavDirections = ActionProductDetailFragmentToProductReviewsFragment(remoteProductId)

    public fun actionProductDetailFragmentToAttributeListFragment(isVariationCreation: Boolean =
        false): NavDirections =
        ActionProductDetailFragmentToAttributeListFragment(isVariationCreation)

    public fun actionProductDetailFragmentToProductTypesBottomSheetFragment(
      isAddProduct: Boolean = false,
      remoteProductId: Long = 0L,
      currentProductType: String? = "null",
      isCurrentProductVirtual: Boolean = false
    ): NavDirections = ActionProductDetailFragmentToProductTypesBottomSheetFragment(isAddProduct,
        remoteProductId, currentProductType, isCurrentProductVirtual)

    public fun actionProductDetailFragmentToNavGraphImageGallery(
      images: Array<Product.Image>,
      selectedImage: Product.Image?,
      showChooser: Boolean,
      requestCode: Int,
      remoteId: Long = 0L
    ): NavDirections = ActionProductDetailFragmentToNavGraphImageGallery(images, selectedImage,
        showChooser, requestCode, remoteId)

    public fun actionProductDetailFragmentToProductDownloadsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_productDetailFragment_to_productDownloadsFragment)

    public fun actionProductDetailFragmentToAddAttributeFragment(isVariationCreation: Boolean =
        false): NavDirections =
        ActionProductDetailFragmentToAddAttributeFragment(isVariationCreation)

    public fun actionProductDetailFragmentToProductAddonsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_productDetailFragment_to_productAddonsFragment)

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
