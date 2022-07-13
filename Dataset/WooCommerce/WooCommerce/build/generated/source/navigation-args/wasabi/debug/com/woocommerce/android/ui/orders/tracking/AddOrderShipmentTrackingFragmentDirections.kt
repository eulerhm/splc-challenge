package com.woocommerce.android.ui.orders.tracking

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

public class AddOrderShipmentTrackingFragmentDirections private constructor() {
  private data class ActionAddOrderShipmentTrackingFragmentToAddOrderTrackingProviderListFragment(
    public val orderId: Long,
    public val selectedProvider: String = ""
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_addOrderShipmentTrackingFragment_to_addOrderTrackingProviderListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putString("selectedProvider", this.selectedProvider)
        return result
      }
  }

  public companion object {
    public
        fun actionAddOrderShipmentTrackingFragmentToAddOrderTrackingProviderListFragment(orderId: Long,
        selectedProvider: String = ""): NavDirections =
        ActionAddOrderShipmentTrackingFragmentToAddOrderTrackingProviderListFragment(orderId,
        selectedProvider)

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
