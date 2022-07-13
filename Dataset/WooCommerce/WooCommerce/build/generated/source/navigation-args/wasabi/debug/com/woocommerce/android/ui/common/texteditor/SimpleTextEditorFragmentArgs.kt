package com.woocommerce.android.ui.common.texteditor

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class SimpleTextEditorFragmentArgs(
  public val currentText: String?,
  public val screenTitle: String,
  public val hint: String,
  public val requestCode: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("currentText", this.currentText)
    result.putString("screenTitle", this.screenTitle)
    result.putString("hint", this.hint)
    result.putInt("requestCode", this.requestCode)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("currentText", this.currentText)
    result.set("screenTitle", this.screenTitle)
    result.set("hint", this.hint)
    result.set("requestCode", this.requestCode)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SimpleTextEditorFragmentArgs {
      bundle.setClassLoader(SimpleTextEditorFragmentArgs::class.java.classLoader)
      val __currentText : String?
      if (bundle.containsKey("currentText")) {
        __currentText = bundle.getString("currentText")
      } else {
        throw IllegalArgumentException("Required argument \"currentText\" is missing and does not have an android:defaultValue")
      }
      val __screenTitle : String?
      if (bundle.containsKey("screenTitle")) {
        __screenTitle = bundle.getString("screenTitle")
        if (__screenTitle == null) {
          throw IllegalArgumentException("Argument \"screenTitle\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"screenTitle\" is missing and does not have an android:defaultValue")
      }
      val __hint : String?
      if (bundle.containsKey("hint")) {
        __hint = bundle.getString("hint")
        if (__hint == null) {
          throw IllegalArgumentException("Argument \"hint\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"hint\" is missing and does not have an android:defaultValue")
      }
      val __requestCode : Int
      if (bundle.containsKey("requestCode")) {
        __requestCode = bundle.getInt("requestCode")
      } else {
        __requestCode = -1
      }
      return SimpleTextEditorFragmentArgs(__currentText, __screenTitle, __hint, __requestCode)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        SimpleTextEditorFragmentArgs {
      val __currentText : String?
      if (savedStateHandle.contains("currentText")) {
        __currentText = savedStateHandle["currentText"]
      } else {
        throw IllegalArgumentException("Required argument \"currentText\" is missing and does not have an android:defaultValue")
      }
      val __screenTitle : String?
      if (savedStateHandle.contains("screenTitle")) {
        __screenTitle = savedStateHandle["screenTitle"]
        if (__screenTitle == null) {
          throw IllegalArgumentException("Argument \"screenTitle\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"screenTitle\" is missing and does not have an android:defaultValue")
      }
      val __hint : String?
      if (savedStateHandle.contains("hint")) {
        __hint = savedStateHandle["hint"]
        if (__hint == null) {
          throw IllegalArgumentException("Argument \"hint\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"hint\" is missing and does not have an android:defaultValue")
      }
      val __requestCode : Int?
      if (savedStateHandle.contains("requestCode")) {
        __requestCode = savedStateHandle["requestCode"]
        if (__requestCode == null) {
          throw IllegalArgumentException("Argument \"requestCode\" of type integer does not support null values")
        }
      } else {
        __requestCode = -1
      }
      return SimpleTextEditorFragmentArgs(__currentText, __screenTitle, __hint, __requestCode)
    }
  }
}
