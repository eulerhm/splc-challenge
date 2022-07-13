package com.woocommerce.android.ui.cardreader.update

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class CardReaderUpdateDialogFragmentArgs(
  public val requiredUpdate: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("requiredUpdate", this.requiredUpdate)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("requiredUpdate", this.requiredUpdate)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CardReaderUpdateDialogFragmentArgs {
      bundle.setClassLoader(CardReaderUpdateDialogFragmentArgs::class.java.classLoader)
      val __requiredUpdate : Boolean
      if (bundle.containsKey("requiredUpdate")) {
        __requiredUpdate = bundle.getBoolean("requiredUpdate")
      } else {
        __requiredUpdate = false
      }
      return CardReaderUpdateDialogFragmentArgs(__requiredUpdate)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        CardReaderUpdateDialogFragmentArgs {
      val __requiredUpdate : Boolean?
      if (savedStateHandle.contains("requiredUpdate")) {
        __requiredUpdate = savedStateHandle["requiredUpdate"]
        if (__requiredUpdate == null) {
          throw IllegalArgumentException("Argument \"requiredUpdate\" of type boolean does not support null values")
        }
      } else {
        __requiredUpdate = false
      }
      return CardReaderUpdateDialogFragmentArgs(__requiredUpdate)
    }
  }
}
