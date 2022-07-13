package com.woocommerce.android.ui.orders.details

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class OrderDetailFragmentArgs(
  public val orderId: Long,
  public val remoteNoteId: Long = 0L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("orderId", this.orderId)
    result.putLong("remoteNoteId", this.remoteNoteId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("orderId", this.orderId)
    result.set("remoteNoteId", this.remoteNoteId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OrderDetailFragmentArgs {
      bundle.setClassLoader(OrderDetailFragmentArgs::class.java.classLoader)
      val __orderId : Long
      if (bundle.containsKey("orderId")) {
        __orderId = bundle.getLong("orderId")
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __remoteNoteId : Long
      if (bundle.containsKey("remoteNoteId")) {
        __remoteNoteId = bundle.getLong("remoteNoteId")
      } else {
        __remoteNoteId = 0L
      }
      return OrderDetailFragmentArgs(__orderId, __remoteNoteId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): OrderDetailFragmentArgs {
      val __orderId : Long?
      if (savedStateHandle.contains("orderId")) {
        __orderId = savedStateHandle["orderId"]
        if (__orderId == null) {
          throw IllegalArgumentException("Argument \"orderId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"orderId\" is missing and does not have an android:defaultValue")
      }
      val __remoteNoteId : Long?
      if (savedStateHandle.contains("remoteNoteId")) {
        __remoteNoteId = savedStateHandle["remoteNoteId"]
        if (__remoteNoteId == null) {
          throw IllegalArgumentException("Argument \"remoteNoteId\" of type long does not support null values")
        }
      } else {
        __remoteNoteId = 0L
      }
      return OrderDetailFragmentArgs(__orderId, __remoteNoteId)
    }
  }
}
