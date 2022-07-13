package com.woocommerce.android

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

public class NavGraphOrdersDirections private constructor() {
  private data class ActionGlobalAddOrderShipmentTrackingFragment(
    public val orderId: Long,
    public val orderTrackingProvider: String? = "null",
    public val isCustomProvider: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_addOrderShipmentTrackingFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putString("orderTrackingProvider", this.orderTrackingProvider)
        result.putBoolean("isCustomProvider", this.isCustomProvider)
        return result
      }
  }

  private data class ActionGlobalItemSelectorDialog(
    public val selectedItem: String?,
    public val keys: Array<String>,
    public val values: Array<String>,
    public val requestKey: String,
    public val title: String? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_item_selector_dialog

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("selectedItem", this.selectedItem)
        result.putStringArray("keys", this.keys)
        result.putStringArray("values", this.values)
        result.putString("requestKey", this.requestKey)
        result.putString("title", this.title)
        return result
      }
  }

  private data class ActionSearchFilterFragment(
    public val items: Array<SearchFilterItem>,
    public val requestKey: String,
    public val title: String = "\"\"",
    public val hint: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_search_filter_fragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("title", this.title)
        result.putString("hint", this.hint)
        result.putParcelableArray("items", this.items)
        result.putString("requestKey", this.requestKey)
        return result
      }
  }

  public companion object {
    public fun actionGlobalAddOrderShipmentTrackingFragment(
      orderId: Long,
      orderTrackingProvider: String? = "null",
      isCustomProvider: Boolean = false
    ): NavDirections = ActionGlobalAddOrderShipmentTrackingFragment(orderId, orderTrackingProvider,
        isCustomProvider)

    public fun actionGlobalItemSelectorDialog(
      selectedItem: String?,
      keys: Array<String>,
      values: Array<String>,
      requestKey: String,
      title: String? = null
    ): NavDirections = ActionGlobalItemSelectorDialog(selectedItem, keys, values, requestKey, title)

    public fun actionSearchFilterFragment(
      items: Array<SearchFilterItem>,
      requestKey: String,
      title: String = "\"\"",
      hint: String = "\"\""
    ): NavDirections = ActionSearchFilterFragment(items, requestKey, title, hint)
  }
}
