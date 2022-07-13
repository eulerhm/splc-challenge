package com.woocommerce.android.ui.orders.shippinglabels.creation

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

public class ShippingPackageSelectorFragmentDirections private constructor() {
  private data class ActionShippingPackageSelectorFragmentToShippingLabelCreatePackageFragment(
    public val position: Int
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_shippingPackageSelectorFragment_to_shippingLabelCreatePackageFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("position", this.position)
        return result
      }
  }

  public companion object {
    public
        fun actionShippingPackageSelectorFragmentToShippingLabelCreatePackageFragment(position: Int):
        NavDirections =
        ActionShippingPackageSelectorFragmentToShippingLabelCreatePackageFragment(position)

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
