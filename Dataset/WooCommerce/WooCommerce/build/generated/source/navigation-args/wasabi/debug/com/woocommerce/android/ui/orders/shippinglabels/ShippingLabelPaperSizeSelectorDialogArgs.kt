package com.woocommerce.android.ui.orders.shippinglabels

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ShippingLabelPaperSizeSelectorDialogArgs(
  public val currentPaperSize: ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if
        (Parcelable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
      result.putParcelable("currentPaperSize", this.currentPaperSize as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
      result.putSerializable("currentPaperSize", this.currentPaperSize as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if
        (Parcelable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
      result.set("currentPaperSize", this.currentPaperSize as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
      result.set("currentPaperSize", this.currentPaperSize as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ShippingLabelPaperSizeSelectorDialogArgs {
      bundle.setClassLoader(ShippingLabelPaperSizeSelectorDialogArgs::class.java.classLoader)
      val __currentPaperSize : ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize?
      if (bundle.containsKey("currentPaperSize")) {
        if
            (Parcelable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
          __currentPaperSize =
              bundle.get("currentPaperSize") as ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize?
        } else {
          throw UnsupportedOperationException(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__currentPaperSize == null) {
          throw IllegalArgumentException("Argument \"currentPaperSize\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentPaperSize\" is missing and does not have an android:defaultValue")
      }
      return ShippingLabelPaperSizeSelectorDialogArgs(__currentPaperSize)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ShippingLabelPaperSizeSelectorDialogArgs {
      val __currentPaperSize : ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize?
      if (savedStateHandle.contains("currentPaperSize")) {
        if
            (Parcelable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
          __currentPaperSize =
              savedStateHandle.get<ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize?>("currentPaperSize")
        } else {
          throw UnsupportedOperationException(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__currentPaperSize == null) {
          throw IllegalArgumentException("Argument \"currentPaperSize\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currentPaperSize\" is missing and does not have an android:defaultValue")
      }
      return ShippingLabelPaperSizeSelectorDialogArgs(__currentPaperSize)
    }
  }
}
