package com.woocommerce.android.ui.orders.shippinglabels

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PrintShippingLabelCustomsFormFragmentArgs(
  public val invoices: Array<String>,
  public val isReprint: Boolean
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putStringArray("invoices", this.invoices)
    result.putBoolean("isReprint", this.isReprint)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("invoices", this.invoices)
    result.set("isReprint", this.isReprint)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PrintShippingLabelCustomsFormFragmentArgs {
      bundle.setClassLoader(PrintShippingLabelCustomsFormFragmentArgs::class.java.classLoader)
      val __invoices : Array<String>?
      if (bundle.containsKey("invoices")) {
        __invoices = bundle.getStringArray("invoices")
        if (__invoices == null) {
          throw IllegalArgumentException("Argument \"invoices\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"invoices\" is missing and does not have an android:defaultValue")
      }
      val __isReprint : Boolean
      if (bundle.containsKey("isReprint")) {
        __isReprint = bundle.getBoolean("isReprint")
      } else {
        throw IllegalArgumentException("Required argument \"isReprint\" is missing and does not have an android:defaultValue")
      }
      return PrintShippingLabelCustomsFormFragmentArgs(__invoices, __isReprint)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        PrintShippingLabelCustomsFormFragmentArgs {
      val __invoices : Array<String>?
      if (savedStateHandle.contains("invoices")) {
        __invoices = savedStateHandle["invoices"]
        if (__invoices == null) {
          throw IllegalArgumentException("Argument \"invoices\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"invoices\" is missing and does not have an android:defaultValue")
      }
      val __isReprint : Boolean?
      if (savedStateHandle.contains("isReprint")) {
        __isReprint = savedStateHandle["isReprint"]
        if (__isReprint == null) {
          throw IllegalArgumentException("Argument \"isReprint\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"isReprint\" is missing and does not have an android:defaultValue")
      }
      return PrintShippingLabelCustomsFormFragmentArgs(__invoices, __isReprint)
    }
  }
}
