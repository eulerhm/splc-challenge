package com.woocommerce.android.ui.orders.details

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.Order
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class OrderStatusSelectorDialogArgs(
  public val currentStatus: String,
  public val orderStatusList: Array<Order.OrderStatus>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("currentStatus", this.currentStatus)
    result.putParcelableArray("orderStatusList", this.orderStatusList)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("currentStatus", this.currentStatus)
    result.set("orderStatusList", this.orderStatusList)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): OrderStatusSelectorDialogArgs {
      bundle.setClassLoader(OrderStatusSelectorDialogArgs::class.java.classLoader)
      val __currentStatus : String?
      if (bundle.containsKey("currentStatus")) {
        __currentStatus = bundle.getString("currentStatus")
        if (__currentStatus == null) {
          throw IllegalArgumentException("Argument \"currentStatus\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentStatus\" is missing and does not have an android:defaultValue")
      }
      val __orderStatusList : Array<Order.OrderStatus>?
      if (bundle.containsKey("orderStatusList")) {
        __orderStatusList = bundle.getParcelableArray("orderStatusList")?.map { it as
            Order.OrderStatus }?.toTypedArray()
        if (__orderStatusList == null) {
          throw IllegalArgumentException("Argument \"orderStatusList\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderStatusList\" is missing and does not have an android:defaultValue")
      }
      return OrderStatusSelectorDialogArgs(__currentStatus, __orderStatusList)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        OrderStatusSelectorDialogArgs {
      val __currentStatus : String?
      if (savedStateHandle.contains("currentStatus")) {
        __currentStatus = savedStateHandle["currentStatus"]
        if (__currentStatus == null) {
          throw IllegalArgumentException("Argument \"currentStatus\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentStatus\" is missing and does not have an android:defaultValue")
      }
      val __orderStatusList : Array<Order.OrderStatus>?
      if (savedStateHandle.contains("orderStatusList")) {
        __orderStatusList = savedStateHandle.get<Array<Parcelable>>("orderStatusList")?.map { it as
            Order.OrderStatus }?.toTypedArray()
        if (__orderStatusList == null) {
          throw IllegalArgumentException("Argument \"orderStatusList\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderStatusList\" is missing and does not have an android:defaultValue")
      }
      return OrderStatusSelectorDialogArgs(__currentStatus, __orderStatusList)
    }
  }
}
