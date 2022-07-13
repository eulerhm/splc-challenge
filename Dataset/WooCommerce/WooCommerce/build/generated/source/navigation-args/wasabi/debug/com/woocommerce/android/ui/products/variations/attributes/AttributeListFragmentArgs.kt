package com.woocommerce.android.ui.products.variations.attributes

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class AttributeListFragmentArgs(
  public val isVariationCreation: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("isVariationCreation", this.isVariationCreation)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("isVariationCreation", this.isVariationCreation)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AttributeListFragmentArgs {
      bundle.setClassLoader(AttributeListFragmentArgs::class.java.classLoader)
      val __isVariationCreation : Boolean
      if (bundle.containsKey("isVariationCreation")) {
        __isVariationCreation = bundle.getBoolean("isVariationCreation")
      } else {
        __isVariationCreation = false
      }
      return AttributeListFragmentArgs(__isVariationCreation)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AttributeListFragmentArgs {
      val __isVariationCreation : Boolean?
      if (savedStateHandle.contains("isVariationCreation")) {
        __isVariationCreation = savedStateHandle["isVariationCreation"]
        if (__isVariationCreation == null) {
          throw IllegalArgumentException("Argument \"isVariationCreation\" of type boolean does not support null values")
        }
      } else {
        __isVariationCreation = false
      }
      return AttributeListFragmentArgs(__isVariationCreation)
    }
  }
}
