package com.woocommerce.android.ui.orders.filters

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class OrderFilterCategoriesFragmentDirections private constructor() {
  private data class ActionOrderFilterListFragmentToOrderFilterOptionListFragment(
    public val filterCategory: OrderFilterCategoryUiModel
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderFilterListFragment_to_orderFilterOptionListFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
          result.putParcelable("filterCategory", this.filterCategory as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
          result.putSerializable("filterCategory", this.filterCategory as Serializable)
        } else {
          throw UnsupportedOperationException(OrderFilterCategoryUiModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public
        fun actionOrderFilterListFragmentToOrderFilterOptionListFragment(filterCategory: OrderFilterCategoryUiModel):
        NavDirections = ActionOrderFilterListFragmentToOrderFilterOptionListFragment(filterCategory)
  }
}
