package com.woocommerce.android.ui.refunds

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RefundConfirmationDialogArgs(
  public val title: String,
  public val message: String,
  public val positiveButtonTitle: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("title", this.title)
    result.putString("message", this.message)
    result.putString("positiveButtonTitle", this.positiveButtonTitle)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("title", this.title)
    result.set("message", this.message)
    result.set("positiveButtonTitle", this.positiveButtonTitle)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RefundConfirmationDialogArgs {
      bundle.setClassLoader(RefundConfirmationDialogArgs::class.java.classLoader)
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __message : String?
      if (bundle.containsKey("message")) {
        __message = bundle.getString("message")
        if (__message == null) {
          throw IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue")
      }
      val __positiveButtonTitle : String?
      if (bundle.containsKey("positiveButtonTitle")) {
        __positiveButtonTitle = bundle.getString("positiveButtonTitle")
        if (__positiveButtonTitle == null) {
          throw IllegalArgumentException("Argument \"positiveButtonTitle\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"positiveButtonTitle\" is missing and does not have an android:defaultValue")
      }
      return RefundConfirmationDialogArgs(__title, __message, __positiveButtonTitle)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        RefundConfirmationDialogArgs {
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      val __message : String?
      if (savedStateHandle.contains("message")) {
        __message = savedStateHandle["message"]
        if (__message == null) {
          throw IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue")
      }
      val __positiveButtonTitle : String?
      if (savedStateHandle.contains("positiveButtonTitle")) {
        __positiveButtonTitle = savedStateHandle["positiveButtonTitle"]
        if (__positiveButtonTitle == null) {
          throw IllegalArgumentException("Argument \"positiveButtonTitle\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"positiveButtonTitle\" is missing and does not have an android:defaultValue")
      }
      return RefundConfirmationDialogArgs(__title, __message, __positiveButtonTitle)
    }
  }
}
