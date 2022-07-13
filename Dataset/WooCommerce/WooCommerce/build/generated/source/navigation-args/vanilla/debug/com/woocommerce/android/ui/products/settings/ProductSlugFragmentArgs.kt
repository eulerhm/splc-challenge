package com.woocommerce.android.ui.products.settings

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ProductSlugFragmentArgs(
  public val slug: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("slug", this.slug)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("slug", this.slug)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductSlugFragmentArgs {
      bundle.setClassLoader(ProductSlugFragmentArgs::class.java.classLoader)
      val __slug : String?
      if (bundle.containsKey("slug")) {
        __slug = bundle.getString("slug")
        if (__slug == null) {
          throw IllegalArgumentException("Argument \"slug\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"slug\" is missing and does not have an android:defaultValue")
      }
      return ProductSlugFragmentArgs(__slug)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductSlugFragmentArgs {
      val __slug : String?
      if (savedStateHandle.contains("slug")) {
        __slug = savedStateHandle["slug"]
        if (__slug == null) {
          throw IllegalArgumentException("Argument \"slug\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"slug\" is missing and does not have an android:defaultValue")
      }
      return ProductSlugFragmentArgs(__slug)
    }
  }
}
