package com.woocommerce.android.ui.cardreader.payment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CardReaderPaymentDialogFragmentArgs(
  public val paymentOrRefund: CardReaderFlowParam.PaymentOrRefund
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)) {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)) {
      result.set("paymentOrRefund", this.paymentOrRefund as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)) {
      result.set("paymentOrRefund", this.paymentOrRefund as Serializable)
    } else {
      throw UnsupportedOperationException(CardReaderFlowParam.PaymentOrRefund::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CardReaderPaymentDialogFragmentArgs {
      bundle.setClassLoader(CardReaderPaymentDialogFragmentArgs::class.java.classLoader)
      val __paymentOrRefund : CardReaderFlowParam.PaymentOrRefund?
      if (bundle.containsKey("paymentOrRefund")) {
        if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)
            ||
            Serializable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)) {
          __paymentOrRefund = bundle.get("paymentOrRefund") as CardReaderFlowParam.PaymentOrRefund?
        } else {
          throw UnsupportedOperationException(CardReaderFlowParam.PaymentOrRefund::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__paymentOrRefund == null) {
          throw IllegalArgumentException("Argument \"paymentOrRefund\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"paymentOrRefund\" is missing and does not have an android:defaultValue")
      }
      return CardReaderPaymentDialogFragmentArgs(__paymentOrRefund)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        CardReaderPaymentDialogFragmentArgs {
      val __paymentOrRefund : CardReaderFlowParam.PaymentOrRefund?
      if (savedStateHandle.contains("paymentOrRefund")) {
        if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)
            ||
            Serializable::class.java.isAssignableFrom(CardReaderFlowParam.PaymentOrRefund::class.java)) {
          __paymentOrRefund =
              savedStateHandle.get<CardReaderFlowParam.PaymentOrRefund?>("paymentOrRefund")
        } else {
          throw UnsupportedOperationException(CardReaderFlowParam.PaymentOrRefund::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__paymentOrRefund == null) {
          throw IllegalArgumentException("Argument \"paymentOrRefund\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"paymentOrRefund\" is missing and does not have an android:defaultValue")
      }
      return CardReaderPaymentDialogFragmentArgs(__paymentOrRefund)
    }
  }
}
