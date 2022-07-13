package com.woocommerce.android.ui.cardreader.tutorial

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CardReaderTutorialDialogFragmentDirections private constructor() {
  private data class ActionCardReaderTutorialDialogFragmentToCardReaderPaymentDialogFragment(
    public val paymentOrRefund: CardReaderFlowParam.PaymentOrRefund
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderTutorialDialogFragment_to_cardReaderPaymentDialogFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if
            (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)) {
          result.putParcelable("paymentOrRefund", this.paymentOrRefund as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)) {
          result.putSerializable("paymentOrRefund", this.paymentOrRefund as Serializable)
        } else {
          throw UnsupportedOperationException(CardReaderFlowParam.PaymentOrRefund::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public
        fun actionCardReaderTutorialDialogFragmentToCardReaderPaymentDialogFragment(paymentOrRefund: CardReaderFlowParam.PaymentOrRefund):
        NavDirections =
        ActionCardReaderTutorialDialogFragmentToCardReaderPaymentDialogFragment(paymentOrRefund)
  }
}
