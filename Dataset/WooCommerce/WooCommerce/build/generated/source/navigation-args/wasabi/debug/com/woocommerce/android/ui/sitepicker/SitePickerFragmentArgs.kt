package com.woocommerce.android.ui.sitepicker

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class SitePickerFragmentArgs(
  public val openedFromLogin: Boolean = true
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("openedFromLogin", this.openedFromLogin)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("openedFromLogin", this.openedFromLogin)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SitePickerFragmentArgs {
      bundle.setClassLoader(SitePickerFragmentArgs::class.java.classLoader)
      val __openedFromLogin : Boolean
      if (bundle.containsKey("openedFromLogin")) {
        __openedFromLogin = bundle.getBoolean("openedFromLogin")
      } else {
        __openedFromLogin = true
      }
      return SitePickerFragmentArgs(__openedFromLogin)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SitePickerFragmentArgs {
      val __openedFromLogin : Boolean?
      if (savedStateHandle.contains("openedFromLogin")) {
        __openedFromLogin = savedStateHandle["openedFromLogin"]
        if (__openedFromLogin == null) {
          throw IllegalArgumentException("Argument \"openedFromLogin\" of type boolean does not support null values")
        }
      } else {
        __openedFromLogin = true
      }
      return SitePickerFragmentArgs(__openedFromLogin)
    }
  }
}
