package com.woocommerce.android.ui.refunds

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RefundItemsPickerDialogArgs(
  public val title: String,
  public val uniqueId: Long,
  public val maxValue: Int,
  public val currentValue: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("title", this.title)
    result.putLong("uniqueId", this.uniqueId)
    result.putInt("maxValue", this.maxValue)
    result.putInt("currentValue", this.currentValue)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("title", this.title)
    result.set("uniqueId", this.uniqueId)
    result.set("maxValue", this.maxValue)
    result.set("currentValue", this.currentValue)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RefundItemsPickerDialogArgs {
      bundle.setClassLoader(RefundItemsPickerDialogArgs::class.java.classLoader)
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __uniqueId : Long
      if (bundle.containsKey("uniqueId")) {
        __uniqueId = bundle.getLong("uniqueId")
      } else {
        throw IllegalArgumentException("Required argument \"uniqueId\" is missing and does not have an android:defaultValue")
      }
      val __maxValue : Int
      if (bundle.containsKey("maxValue")) {
        __maxValue = bundle.getInt("maxValue")
      } else {
        throw IllegalArgumentException("Required argument \"maxValue\" is missing and does not have an android:defaultValue")
      }
      val __currentValue : Int
      if (bundle.containsKey("currentValue")) {
        __currentValue = bundle.getInt("currentValue")
      } else {
        throw IllegalArgumentException("Required argument \"currentValue\" is missing and does not have an android:defaultValue")
      }
      return RefundItemsPickerDialogArgs(__title, __uniqueId, __maxValue, __currentValue)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        RefundItemsPickerDialogArgs {
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __uniqueId : Long?
      if (savedStateHandle.contains("uniqueId")) {
        __uniqueId = savedStateHandle["uniqueId"]
        if (__uniqueId == null) {
          throw IllegalArgumentException("Argument \"uniqueId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"uniqueId\" is missing and does not have an android:defaultValue")
      }
      val __maxValue : Int?
      if (savedStateHandle.contains("maxValue")) {
        __maxValue = savedStateHandle["maxValue"]
        if (__maxValue == null) {
          throw IllegalArgumentException("Argument \"maxValue\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"maxValue\" is missing and does not have an android:defaultValue")
      }
      val __currentValue : Int?
      if (savedStateHandle.contains("currentValue")) {
        __currentValue = savedStateHandle["currentValue"]
        if (__currentValue == null) {
          throw IllegalArgumentException("Argument \"currentValue\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentValue\" is missing and does not have an android:defaultValue")
      }
      return RefundItemsPickerDialogArgs(__title, __uniqueId, __maxValue, __currentValue)
    }
  }
}
