package com.woocommerce.android.ui.products

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Int

public class ProductFilterListFragmentDirections private constructor() {
  private data class ActionProductFilterListFragmentToProductFilterOptionListFragment(
    public val selectedFilterItemPosition: Int
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productFilterListFragment_to_productFilterOptionListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("selectedFilterItemPosition", this.selectedFilterItemPosition)
        return result
      }
  }

  public companion object {
    public
        fun actionProductFilterListFragmentToProductFilterOptionListFragment(selectedFilterItemPosition: Int):
        NavDirections =
        ActionProductFilterListFragmentToProductFilterOptionListFragment(selectedFilterItemPosition)
  }
}
