package com.woocommerce.android.ui.orders.simplepayments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SimplePaymentsCustomerNoteFragmentArgs(
  public val customerNote: String = "\"\""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("customerNote", this.customerNote)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("customerNote", this.customerNote)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SimplePaymentsCustomerNoteFragmentArgs {
      bundle.setClassLoader(SimplePaymentsCustomerNoteFragmentArgs::class.java.classLoader)
      val __customerNote : String?
      if (bundle.containsKey("customerNote")) {
        __customerNote = bundle.getString("customerNote")
        if (__customerNote == null) {
          throw IllegalArgumentException("Argument \"customerNote\" is marked as non-null but was passed a null value.")
        }
      } else {
        __customerNote = "\"\""
      }
      return SimplePaymentsCustomerNoteFragmentArgs(__customerNote)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        SimplePaymentsCustomerNoteFragmentArgs {
      val __customerNote : String?
      if (savedStateHandle.contains("customerNote")) {
        __customerNote = savedStateHandle["customerNote"]
        if (__customerNote == null) {
          throw IllegalArgumentException("Argument \"customerNote\" is marked as non-null but was passed a null value")
        }
      } else {
        __customerNote = "\"\""
      }
      return SimplePaymentsCustomerNoteFragmentArgs(__customerNote)
    }
  }
}
