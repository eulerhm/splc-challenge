package com.woocommerce.android.ui.products.variations

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.ProductVariation
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class VariationsBulkUpdateAttrPickerDialogArgs(
  public val variationsToUpdate: Array<ProductVariation>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putParcelableArray("variationsToUpdate", this.variationsToUpdate)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("variationsToUpdate", this.variationsToUpdate)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): VariationsBulkUpdateAttrPickerDialogArgs {
      bundle.setClassLoader(VariationsBulkUpdateAttrPickerDialogArgs::class.java.classLoader)
      val __variationsToUpdate : Array<ProductVariation>?
      if (bundle.containsKey("variationsToUpdate")) {
        __variationsToUpdate = bundle.getParcelableArray("variationsToUpdate")?.map { it as
            ProductVariation }?.toTypedArray()
        if (__variationsToUpdate == null) {
          throw IllegalArgumentException("Argument \"variationsToUpdate\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"variationsToUpdate\" is missing and does not have an android:defaultValue")
      }
      return VariationsBulkUpdateAttrPickerDialogArgs(__variationsToUpdate)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        VariationsBulkUpdateAttrPickerDialogArgs {
      val __variationsToUpdate : Array<ProductVariation>?
      if (savedStateHandle.contains("variationsToUpdate")) {
        __variationsToUpdate = savedStateHandle.get<Array<Parcelable>>("variationsToUpdate")?.map {
            it as ProductVariation }?.toTypedArray()
        if (__variationsToUpdate == null) {
          throw IllegalArgumentException("Argument \"variationsToUpdate\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"variationsToUpdate\" is missing and does not have an android:defaultValue")
      }
      return VariationsBulkUpdateAttrPickerDialogArgs(__variationsToUpdate)
    }
  }
}
