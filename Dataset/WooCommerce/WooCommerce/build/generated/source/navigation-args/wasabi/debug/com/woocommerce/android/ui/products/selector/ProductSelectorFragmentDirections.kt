package com.woocommerce.android.ui.products.selector

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Int
import kotlin.Long
import kotlin.LongArray

public class ProductSelectorFragmentDirections private constructor() {
  private data class ActionProductSelectorFragmentToVariationSelectorFragment(
    public val productId: Long,
    public val variationIds: LongArray
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productSelectorFragment_to_variationSelectorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("productId", this.productId)
        result.putLongArray("variationIds", this.variationIds)
        return result
      }
  }

  public companion object {
    public fun actionProductSelectorFragmentToVariationSelectorFragment(productId: Long,
        variationIds: LongArray): NavDirections =
        ActionProductSelectorFragmentToVariationSelectorFragment(productId, variationIds)
  }
}
