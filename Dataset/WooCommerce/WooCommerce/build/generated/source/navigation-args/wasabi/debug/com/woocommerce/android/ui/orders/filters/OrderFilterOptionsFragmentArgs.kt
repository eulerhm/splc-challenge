package com.woocommerce.android.ui.orders.filters

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class OrderFilterOptionsFragmentArgs(
  public val filterCategory: OrderFilterCategoryUiModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
      result.putParcelable("filterCategory", this.filterCategory as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
      result.putSerializable("filterCategory", this.filterCategory as Serializable)
    } else {
      throw UnsupportedOperationException(OrderFilterCategoryUiModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
      result.set("filterCategory", this.filterCategory as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
      result.set("filterCategory", this.filterCategory as Serializable)
    } else {
      throw UnsupportedOperationException(OrderFilterCategoryUiModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrderFilterOptionsFragmentArgs {
      bundle.setClassLoader(OrderFilterOptionsFragmentArgs::class.java.classLoader)
      val __filterCategory : OrderFilterCategoryUiModel?
      if (bundle.containsKey("filterCategory")) {
        if (Parcelable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java) ||
            Serializable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
          __filterCategory = bundle.get("filterCategory") as OrderFilterCategoryUiModel?
        } else {
          throw UnsupportedOperationException(OrderFilterCategoryUiModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__filterCategory == null) {
          throw IllegalArgumentException("Argument \"filterCategory\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"filterCategory\" is missing and does not have an android:defaultValue")
      }
      return OrderFilterOptionsFragmentArgs(__filterCategory)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        OrderFilterOptionsFragmentArgs {
      val __filterCategory : OrderFilterCategoryUiModel?
      if (savedStateHandle.contains("filterCategory")) {
        if (Parcelable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java) ||
            Serializable::class.java.isAssignableFrom(OrderFilterCategoryUiModel::class.java)) {
          __filterCategory = savedStateHandle.get<OrderFilterCategoryUiModel?>("filterCategory")
        } else {
          throw UnsupportedOperationException(OrderFilterCategoryUiModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__filterCategory == null) {
          throw IllegalArgumentException("Argument \"filterCategory\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"filterCategory\" is missing and does not have an android:defaultValue")
      }
      return OrderFilterOptionsFragmentArgs(__filterCategory)
    }
  }
}
