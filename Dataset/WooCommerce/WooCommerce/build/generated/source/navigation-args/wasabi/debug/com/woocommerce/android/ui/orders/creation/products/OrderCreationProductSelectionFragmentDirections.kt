package com.woocommerce.android.ui.orders.creation.products

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Int
import kotlin.Long

public class OrderCreationProductSelectionFragmentDirections private constructor() {
  private data class
      ActionOrderCreationProductSelectionFragmentToOrderCreationVariationSelectionFragment(
    public val productId: Long
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderCreationProductSelectionFragment_to_orderCreationVariationSelectionFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("productId", this.productId)
        return result
      }
  }

  public companion object {
    public
        fun actionOrderCreationProductSelectionFragmentToOrderCreationVariationSelectionFragment(productId: Long):
        NavDirections =
        ActionOrderCreationProductSelectionFragmentToOrderCreationVariationSelectionFragment(productId)
  }
}
