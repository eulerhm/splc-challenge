package com.woocommerce.android.ui.orders.details.editing

import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphOrdersDirections
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import kotlin.Array
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public class CustomerOrderNoteEditingFragmentDirections private constructor() {
  public companion object {
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
