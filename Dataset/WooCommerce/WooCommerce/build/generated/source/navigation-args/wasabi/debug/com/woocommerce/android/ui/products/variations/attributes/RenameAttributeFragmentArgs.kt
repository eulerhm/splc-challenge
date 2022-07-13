package com.woocommerce.android.ui.products.variations.attributes

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RenameAttributeFragmentArgs(
  public val attributeName: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("attributeName", this.attributeName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("attributeName", this.attributeName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RenameAttributeFragmentArgs {
      bundle.setClassLoader(RenameAttributeFragmentArgs::class.java.classLoader)
      val __attributeName : String?
      if (bundle.containsKey("attributeName")) {
        __attributeName = bundle.getString("attributeName")
        if (__attributeName == null) {
          throw IllegalArgumentException("Argument \"attributeName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"attributeName\" is missing and does not have an android:defaultValue")
      }
      return RenameAttributeFragmentArgs(__attributeName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        RenameAttributeFragmentArgs {
      val __attributeName : String?
      if (savedStateHandle.contains("attributeName")) {
        __attributeName = savedStateHandle["attributeName"]
        if (__attributeName == null) {
          throw IllegalArgumentException("Argument \"attributeName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"attributeName\" is missing and does not have an android:defaultValue")
      }
      return RenameAttributeFragmentArgs(__attributeName)
    }
  }
}
