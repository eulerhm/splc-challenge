package com.woocommerce.android.ui.refunds

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import java.math.BigDecimal
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class RefundAmountDialogArgs(
  public val title: String,
  public val maxValue: BigDecimal,
  public val currentValue: BigDecimal,
  public val minValue: BigDecimal,
  public val message: String
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("title", this.title)
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putParcelable("maxValue", this.maxValue as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putSerializable("maxValue", this.maxValue as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putParcelable("currentValue", this.currentValue as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putSerializable("currentValue", this.currentValue as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putParcelable("minValue", this.minValue as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.putSerializable("minValue", this.minValue as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putString("message", this.message)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("title", this.title)
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("maxValue", this.maxValue as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("maxValue", this.maxValue as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("currentValue", this.currentValue as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("currentValue", this.currentValue as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("minValue", this.minValue as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
      result.set("minValue", this.minValue as Serializable)
    } else {
      throw UnsupportedOperationException(BigDecimal::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("message", this.message)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RefundAmountDialogArgs {
      bundle.setClassLoader(RefundAmountDialogArgs::class.java.classLoader)
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __maxValue : BigDecimal?
      if (bundle.containsKey("maxValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __maxValue = bundle.get("maxValue") as BigDecimal?
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__maxValue == null) {
          throw IllegalArgumentException("Argument \"maxValue\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"maxValue\" is missing and does not have an android:defaultValue")
      }
      val __currentValue : BigDecimal?
      if (bundle.containsKey("currentValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __currentValue = bundle.get("currentValue") as BigDecimal?
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__currentValue == null) {
          throw IllegalArgumentException("Argument \"currentValue\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentValue\" is missing and does not have an android:defaultValue")
      }
      val __minValue : BigDecimal?
      if (bundle.containsKey("minValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __minValue = bundle.get("minValue") as BigDecimal?
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__minValue == null) {
          throw IllegalArgumentException("Argument \"minValue\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"minValue\" is missing and does not have an android:defaultValue")
      }
      val __message : String?
      if (bundle.containsKey("message")) {
        __message = bundle.getString("message")
        if (__message == null) {
          throw IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue")
      }
      return RefundAmountDialogArgs(__title, __maxValue, __currentValue, __minValue, __message)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): RefundAmountDialogArgs {
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __maxValue : BigDecimal?
      if (savedStateHandle.contains("maxValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __maxValue = savedStateHandle.get<BigDecimal?>("maxValue")
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__maxValue == null) {
          throw IllegalArgumentException("Argument \"maxValue\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"maxValue\" is missing and does not have an android:defaultValue")
      }
      val __currentValue : BigDecimal?
      if (savedStateHandle.contains("currentValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __currentValue = savedStateHandle.get<BigDecimal?>("currentValue")
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__currentValue == null) {
          throw IllegalArgumentException("Argument \"currentValue\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentValue\" is missing and does not have an android:defaultValue")
      }
      val __minValue : BigDecimal?
      if (savedStateHandle.contains("minValue")) {
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java) ||
            Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          __minValue = savedStateHandle.get<BigDecimal?>("minValue")
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__minValue == null) {
          throw IllegalArgumentException("Argument \"minValue\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"minValue\" is missing and does not have an android:defaultValue")
      }
      val __message : String?
      if (savedStateHandle.contains("message")) {
        __message = savedStateHandle["message"]
        if (__message == null) {
          throw IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue")
      }
      return RefundAmountDialogArgs(__title, __maxValue, __currentValue, __minValue, __message)
    }
  }
}
