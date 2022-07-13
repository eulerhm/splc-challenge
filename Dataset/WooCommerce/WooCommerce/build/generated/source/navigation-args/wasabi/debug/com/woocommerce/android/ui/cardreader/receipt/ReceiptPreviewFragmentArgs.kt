package com.woocommerce.android.ui.cardreader.receipt

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ReceiptPreviewFragmentArgs(
  public val receiptUrl: String,
  public val billingEmail: String,
  public val orderId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("receiptUrl", this.receiptUrl)
    result.putString("billingEmail", this.billingEmail)
    result.putLong("orderId", this.orderId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("receiptUrl", this.receiptUrl)
    result.set("billingEmail", this.billingEmail)
    result.set("orderId", this.orderId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ReceiptPreviewFragmentArgs {
      bundle.setClassLoader(ReceiptPreviewFragmentArgs::class.java.classLoader)
      val __receiptUrl : String?
      if (bundle.containsKey("receiptUrl")) {
        __receiptUrl = bundle.getString("receiptUrl")
        if (__receiptUrl == null) {
          throw IllegalArgumentException("Argument \"receiptUrl\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"receiptUrl\" is missing and does not have an android:defaultValue")
      }
      val __billingEmail : String?
      if (bundle.containsKey("billingEmail")) {
        __billingEmail = bundle.getString("billingEmail")
        if (__billingEmail == null) {
          throw IllegalArgumentException("Argument \"billingEmail\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"billingEmail\" is missing and does not have an android:defaultValue")
      }
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      return ReceiptPreviewFragmentArgs(__receiptUrl, __billingEmail, __orderId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ReceiptPreviewFragmentArgs {
      val __receiptUrl : String?
      if (savedStateHandle.contains("receiptUrl")) {
        __receiptUrl = savedStateHandle["receiptUrl"]
        if (__receiptUrl == null) {
          throw IllegalArgumentException("Argument \"receiptUrl\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"receiptUrl\" is missing and does not have an android:defaultValue")
      }
      val __billingEmail : String?
      if (savedStateHandle.contains("billingEmail")) {
        __billingEmail = savedStateHandle["billingEmail"]
        if (__billingEmail == null) {
          throw IllegalArgumentException("Argument \"billingEmail\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"billingEmail\" is missing and does not have an android:defaultValue")
      }
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      return ReceiptPreviewFragmentArgs(__receiptUrl, __billingEmail, __orderId)
    }
  }
}
