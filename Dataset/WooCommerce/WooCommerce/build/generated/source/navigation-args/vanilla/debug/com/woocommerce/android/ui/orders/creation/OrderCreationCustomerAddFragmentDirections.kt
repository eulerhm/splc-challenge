package com.woocommerce.android.ui.orders.creation

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import kotlin.Array
import kotlin.Int
import kotlin.String

public class OrderCreationCustomerAddFragmentDirections private constructor() {
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
    public fun actionSearchFilterFragment(
      items: Array<SearchFilterItem>,
      requestKey: String,
      title: String = "\"\"",
      hint: String = "\"\""
    ): NavDirections = ActionSearchFilterFragment(items, requestKey, title, hint)
  }
}
