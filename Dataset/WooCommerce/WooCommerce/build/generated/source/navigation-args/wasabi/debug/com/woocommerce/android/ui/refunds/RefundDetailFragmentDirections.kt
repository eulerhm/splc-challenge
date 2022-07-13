package com.woocommerce.android.ui.refunds

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphOrdersDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

public class RefundDetailFragmentDirections private constructor() {
  private data class ActionRefundDetailFragmentToOrderedAddonFragment(
    public val orderId: Long,
    public val orderItemId: Long,
    public val addonsProductId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_refundDetailFragment_to_orderedAddonFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putLong("orderItemId", this.orderItemId)
        result.putLong("addonsProductId", this.addonsProductId)
        return result
      }
  }

  public companion object {
    public fun actionRefundDetailFragmentToOrderedAddonFragment(
      orderId: Long,
      orderItemId: Long,
      addonsProductId: Long
    ): NavDirections = ActionRefundDetailFragmentToOrderedAddonFragment(orderId, orderItemId,
        addonsProductId)

    public fun actionGlobalAddOrderShipmentTrackingFragment(
      orderId: Long,
      orderTrackingProvider: String? = "null",
      isCustomProvider: Boolean = false
    ): NavDirections =
        NavGraphOrdersDirections.actionGlobalAddOrderShipmentTrackingFragment(orderId,
        orderTrackingProvider, isCustomProvider)

    public fun actionGlobalItemSelectorDialog(
      selectedItem: String?,
      keys: Array<String>,
      values: Array<String>,
      requestKey: String,
      title: String? = null
    ): NavDirections = NavGraphOrdersDirections.actionGlobalItemSelectorDialog(selectedItem, keys,
        values, requestKey, title)

    public fun actionSearchFilterFragment(
      items: Array<SearchFilterItem>,
      requestKey: String,
      title: String = "\"\"",
      hint: String = "\"\""
    ): NavDirections = NavGraphOrdersDirections.actionSearchFilterFragment(items, requestKey, title,
        hint)
  }
}
