package com.woocommerce.android.ui.products.settings

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ProductVisibilityFragmentArgs(
  public val visibility: String?,
  public val password: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("visibility", this.visibility)
    result.putString("password", this.password)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("visibility", this.visibility)
    result.set("password", this.password)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductVisibilityFragmentArgs {
      bundle.setClassLoader(ProductVisibilityFragmentArgs::class.java.classLoader)
      val __visibility : String?
      if (bundle.containsKey("visibility")) {
        __visibility = bundle.getString("visibility")
      } else {
        throw IllegalArgumentException("Required argument \"visibility\" is missing and does not have an android:defaultValue")
      }
      val __password : String?
      if (bundle.containsKey("password")) {
        __password = bundle.getString("password")
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return ProductVisibilityFragmentArgs(__visibility, __password)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductVisibilityFragmentArgs {
      val __visibility : String?
      if (savedStateHandle.contains("visibility")) {
        __visibility = savedStateHandle["visibility"]
      } else {
        throw IllegalArgumentException("Required argument \"visibility\" is missing and does not have an android:defaultValue")
      }
      val __password : String?
      if (savedStateHandle.contains("password")) {
        __password = savedStateHandle["password"]
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return ProductVisibilityFragmentArgs(__visibility, __password)
    }
  }
}
