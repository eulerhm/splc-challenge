package com.woocommerce.android.ui.orders.simplepayments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Order
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class SimplePaymentsFragmentDirections private constructor() {
  private data class ActionSimplePaymentsFragmentToSimplePaymentsCustomerNoteFragment(
    public val customerNote: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_simplePaymentsFragment_to_simplePaymentsCustomerNoteFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("customerNote", this.customerNote)
        return result
      }
  }

  private data class ActionSimplePaymentsFragmentToTakePaymentFragment(
    public val order: Order
  ) : NavDirections {
    public override val actionId: Int = R.id.action_simplePaymentsFragment_to_takePaymentFragment

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
    public fun actionSimplePaymentsFragmentToSimplePaymentsCustomerNoteFragment(customerNote: String
        = "\"\""): NavDirections =
        ActionSimplePaymentsFragmentToSimplePaymentsCustomerNoteFragment(customerNote)

    public fun actionSimplePaymentsFragmentToTakePaymentFragment(order: Order): NavDirections =
        ActionSimplePaymentsFragmentToTakePaymentFragment(order)
  }
}
