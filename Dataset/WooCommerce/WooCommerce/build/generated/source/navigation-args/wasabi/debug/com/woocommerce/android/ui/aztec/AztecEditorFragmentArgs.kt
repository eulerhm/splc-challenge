package com.woocommerce.android.ui.aztec

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AztecEditorFragmentArgs(
  public val aztecText: String = "\"\"",
  public val aztecTitle: String = "\"\"",
  public val aztecCaption: String? = null,
  public val requestCode: Int = 0,
  public val productTitle: String = "\"\""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("aztecText", this.aztecText)
    result.putString("aztecTitle", this.aztecTitle)
    result.putString("aztecCaption", this.aztecCaption)
    result.putInt("requestCode", this.requestCode)
    result.putString("productTitle", this.productTitle)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("aztecText", this.aztecText)
    result.set("aztecTitle", this.aztecTitle)
    result.set("aztecCaption", this.aztecCaption)
    result.set("requestCode", this.requestCode)
    result.set("productTitle", this.productTitle)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AztecEditorFragmentArgs {
      bundle.setClassLoader(AztecEditorFragmentArgs::class.java.classLoader)
      val __aztecText : String?
      if (bundle.containsKey("aztecText")) {
        __aztecText = bundle.getString("aztecText")
        if (__aztecText == null) {
          throw IllegalArgumentException("Argument \"aztecText\" is marked as non-null but was passed a null value.")
        }
      } else {
        __aztecText = "\"\""
      }
      val __aztecTitle : String?
      if (bundle.containsKey("aztecTitle")) {
        __aztecTitle = bundle.getString("aztecTitle")
        if (__aztecTitle == null) {
          throw IllegalArgumentException("Argument \"aztecTitle\" is marked as non-null but was passed a null value.")
        }
      } else {
        __aztecTitle = "\"\""
      }
      val __aztecCaption : String?
      if (bundle.containsKey("aztecCaption")) {
        __aztecCaption = bundle.getString("aztecCaption")
      } else {
        __aztecCaption = null
      }
      val __requestCode : Int
      if (bundle.containsKey("requestCode")) {
        __requestCode = bundle.getInt("requestCode")
      } else {
        __requestCode = 0
      }
      val __productTitle : String?
      if (bundle.containsKey("productTitle")) {
        __productTitle = bundle.getString("productTitle")
        if (__productTitle == null) {
          throw IllegalArgumentException("Argument \"productTitle\" is marked as non-null but was passed a null value.")
        }
      } else {
        __productTitle = "\"\""
      }
      return AztecEditorFragmentArgs(__aztecText, __aztecTitle, __aztecCaption, __requestCode,
          __productTitle)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AztecEditorFragmentArgs {
      val __aztecText : String?
      if (savedStateHandle.contains("aztecText")) {
        __aztecText = savedStateHandle["aztecText"]
        if (__aztecText == null) {
          throw IllegalArgumentException("Argument \"aztecText\" is marked as non-null but was passed a null value")
        }
      } else {
        __aztecText = "\"\""
      }
      val __aztecTitle : String?
      if (savedStateHandle.contains("aztecTitle")) {
        __aztecTitle = savedStateHandle["aztecTitle"]
        if (__aztecTitle == null) {
          throw IllegalArgumentException("Argument \"aztecTitle\" is marked as non-null but was passed a null value")
        }
      } else {
        __aztecTitle = "\"\""
      }
      val __aztecCaption : String?
      if (savedStateHandle.contains("aztecCaption")) {
        __aztecCaption = savedStateHandle["aztecCaption"]
      } else {
        __aztecCaption = null
      }
      val __requestCode : Int?
      if (savedStateHandle.contains("requestCode")) {
        __requestCode = savedStateHandle["requestCode"]
        if (__requestCode == null) {
          throw IllegalArgumentException("Argument \"requestCode\" of type integer does not support null values")
        }
      } else {
        __requestCode = 0
      }
      val __productTitle : String?
      if (savedStateHandle.contains("productTitle")) {
        __productTitle = savedStateHandle["productTitle"]
        if (__productTitle == null) {
          throw IllegalArgumentException("Argument \"productTitle\" is marked as non-null but was passed a null value")
        }
      } else {
        __productTitle = "\"\""
      }
      return AztecEditorFragmentArgs(__aztecText, __aztecTitle, __aztecCaption, __requestCode,
          __productTitle)
    }
  }
}
