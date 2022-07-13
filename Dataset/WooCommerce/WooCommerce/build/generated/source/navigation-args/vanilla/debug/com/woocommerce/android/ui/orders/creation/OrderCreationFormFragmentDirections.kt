package com.woocommerce.android.ui.orders.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Order
import java.io.Serializable
import java.lang.UnsupportedOperationException
import java.math.BigDecimal
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

public class OrderCreationFormFragmentDirections private constructor() {
  private data class ActionOrderCreationFragmentToOrderStatusSelectorDialog(
    public val currentStatus: String,
    public val orderStatusList: Array<Order.OrderStatus>
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderCreationFragment_to_orderStatusSelectorDialog

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("currentStatus", this.currentStatus)
        result.putParcelableArray("orderStatusList", this.orderStatusList)
        return result
      }
  }

  private data class ActionOrderCreationFragmentToOrderCreationProductDetailsFragment(
    public val item: Order.Item
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderCreationFragment_to_orderCreationProductDetailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Order.Item::class.java)) {
          result.putParcelable("item", this.item as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Order.Item::class.java)) {
          result.putSerializable("item", this.item as Serializable)
        } else {
          throw UnsupportedOperationException(Order.Item::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionOrderCreationFragmentToOrderDetailFragment(
    public val orderId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderCreationFragment_to_orderDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        return result
      }
  }

  private data class ActionOrderCreationFragmentToOrderCreationShippingFragment(
    public val currentShippingLine: Order.ShippingLine?
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderCreationFragment_to_orderCreationShippingFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
          result.putParcelable("currentShippingLine", this.currentShippingLine as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Order.ShippingLine::class.java)) {
          result.putSerializable("currentShippingLine", this.currentShippingLine as Serializable?)
        } else {
          throw UnsupportedOperationException(Order.ShippingLine::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionOrderCreationFragmentToOrderCreationEditFeeFragment(
    public val orderSubTotal: BigDecimal,
    public val currentFeeValue: BigDecimal? = null
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderCreationFragment_to_orderCreationEditFeeFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putParcelable("orderSubTotal", this.orderSubTotal as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putSerializable("orderSubTotal", this.orderSubTotal as Serializable)
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putParcelable("currentFeeValue", this.currentFeeValue as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putSerializable("currentFeeValue", this.currentFeeValue as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionOrderCreationFragmentToOrderStatusSelectorDialog(currentStatus: String,
        orderStatusList: Array<Order.OrderStatus>): NavDirections =
        ActionOrderCreationFragmentToOrderStatusSelectorDialog(currentStatus, orderStatusList)

    public fun actionOrderCreationFragmentToOrderCreationCustomerNoteFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderCreationFragment_to_orderCreationCustomerNoteFragment)

    public fun actionOrderCreationFragmentToOrderCreationProductSelectionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderCreationFragment_to_orderCreationProductSelectionFragment)

    public fun actionOrderCreationFragmentToOrderCreationCustomerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderCreationFragment_to_orderCreationCustomerFragment)

    public fun actionOrderCreationFragmentToOrderCreationProductDetailsFragment(item: Order.Item):
        NavDirections = ActionOrderCreationFragmentToOrderCreationProductDetailsFragment(item)

    public fun actionOrderCreationFragmentToOrderDetailFragment(orderId: Long): NavDirections =
        ActionOrderCreationFragmentToOrderDetailFragment(orderId)

    public
        fun actionOrderCreationFragmentToOrderCreationShippingFragment(currentShippingLine: Order.ShippingLine?):
        NavDirections =
        ActionOrderCreationFragmentToOrderCreationShippingFragment(currentShippingLine)

    public fun actionOrderCreationFragmentToOrderCreationEditFeeFragment(orderSubTotal: BigDecimal,
        currentFeeValue: BigDecimal? = null): NavDirections =
        ActionOrderCreationFragmentToOrderCreationEditFeeFragment(orderSubTotal, currentFeeValue)
  }
}
