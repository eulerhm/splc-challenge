package com.woocommerce.android.ui.products.categories

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Int
import kotlin.Long

public class AddProductCategoryFragmentDirections private constructor() {
  private data class ActionAddProductCategoryFragmentToParentCategoryListFragment(
    public val selectedParentId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_addProductCategoryFragment_to_parentCategoryListFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("selectedParentId", this.selectedParentId)
        return result
      }
  }

  public companion object {
    public fun actionAddProductCategoryFragmentToParentCategoryListFragment(selectedParentId: Long =
        0L): NavDirections =
        ActionAddProductCategoryFragmentToParentCategoryListFragment(selectedParentId)
  }
}
