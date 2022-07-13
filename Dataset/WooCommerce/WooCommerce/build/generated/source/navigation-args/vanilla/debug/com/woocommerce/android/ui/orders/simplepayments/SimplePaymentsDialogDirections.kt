package com.woocommerce.android.ui.orders.simplepayments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Order
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SimplePaymentsDialogDirections private constructor() {
  private data class ActionSimplePaymentDialogToSimplePaymentFragment(
    public val order: Order
  ) : NavDirections {
    public override val actionId: Int = R.id.action_simplePaymentDialog_to_simplePaymentFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Order::class.java)) {
          result.putParcelable("order", this.order as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Order::class.java)) {
          result.putSerializable("order", this.order as Serializable)
        } else {
          throw UnsupportedOperationException(Order::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionSimplePaymentDialogToSimplePaymentFragment(order: Order): NavDirections =
        ActionSimplePaymentDialogToSimplePaymentFragment(order)
  }
}
