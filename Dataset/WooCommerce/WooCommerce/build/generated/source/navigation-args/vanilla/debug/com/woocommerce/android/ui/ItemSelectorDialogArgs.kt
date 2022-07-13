package com.woocommerce.android.ui

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ItemSelectorDialogArgs(
  public val selectedItem: String?,
  public val keys: Array<String>,
  public val values: Array<String>,
  public val requestKey: String,
  public val title: String? = null
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("selectedItem", this.selectedItem)
    result.putStringArray("keys", this.keys)
    result.putStringArray("values", this.values)
    result.putString("requestKey", this.requestKey)
    result.putString("title", this.title)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("selectedItem", this.selectedItem)
    result.set("keys", this.keys)
    result.set("values", this.values)
    result.set("requestKey", this.requestKey)
    result.set("title", this.title)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ItemSelectorDialogArgs {
      bundle.setClassLoader(ItemSelectorDialogArgs::class.java.classLoader)
      val __selectedItem : String?
      if (bundle.containsKey("selectedItem")) {
        __selectedItem = bundle.getString("selectedItem")
      } else {
        throw IllegalArgumentException("Required argument \"selectedItem\" is missing and does not have an android:defaultValue")
      }
      val __keys : Array<String>?
      if (bundle.containsKey("keys")) {
        __keys = bundle.getStringArray("keys")
        if (__keys == null) {
          throw IllegalArgumentException("Argument \"keys\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"keys\" is missing and does not have an android:defaultValue")
      }
      val __values : Array<String>?
      if (bundle.containsKey("values")) {
        __values = bundle.getStringArray("values")
        if (__values == null) {
          throw IllegalArgumentException("Argument \"values\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"values\" is missing and does not have an android:defaultValue")
      }
      val __requestKey : String?
      if (bundle.containsKey("requestKey")) {
        __requestKey = bundle.getString("requestKey")
        if (__requestKey == null) {
          throw IllegalArgumentException("Argument \"requestKey\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"requestKey\" is missing and does not have an android:defaultValue")
      }
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
      } else {
        __title = null
      }
      return ItemSelectorDialogArgs(__selectedItem, __keys, __values, __requestKey, __title)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ItemSelectorDialogArgs {
      val __selectedItem : String?
      if (savedStateHandle.contains("selectedItem")) {
        __selectedItem = savedStateHandle["selectedItem"]
      } else {
        throw IllegalArgumentException("Required argument \"selectedItem\" is missing and does not have an android:defaultValue")
      }
      val __keys : Array<String>?
      if (savedStateHandle.contains("keys")) {
        __keys = savedStateHandle["keys"]
        if (__keys == null) {
          throw IllegalArgumentException("Argument \"keys\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"keys\" is missing and does not have an android:defaultValue")
      }
      val __values : Array<String>?
      if (savedStateHandle.contains("values")) {
        __values = savedStateHandle["values"]
        if (__values == null) {
          throw IllegalArgumentException("Argument \"values\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"values\" is missing and does not have an android:defaultValue")
      }
      val __requestKey : String?
      if (savedStateHandle.contains("requestKey")) {
        __requestKey = savedStateHandle["requestKey"]
        if (__requestKey == null) {
          throw IllegalArgumentException("Argument \"requestKey\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"requestKey\" is missing and does not have an android:defaultValue")
      }
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
      } else {
        __title = null
      }
      return ItemSelectorDialogArgs(__selectedItem, __keys, __values, __requestKey, __title)
    }
  }
}
