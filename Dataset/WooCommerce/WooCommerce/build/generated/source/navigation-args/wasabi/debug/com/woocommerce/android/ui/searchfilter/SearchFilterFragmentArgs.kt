package com.woocommerce.android.ui.searchfilter

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class SearchFilterFragmentArgs(
  public val items: Array<SearchFilterItem>,
  public val requestKey: String,
  public val title: String = "\"\"",
  public val hint: String = "\"\""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("title", this.title)
    result.putString("hint", this.hint)
    result.putParcelableArray("items", this.items)
    result.putString("requestKey", this.requestKey)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("title", this.title)
    result.set("hint", this.hint)
    result.set("items", this.items)
    result.set("requestKey", this.requestKey)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): SearchFilterFragmentArgs {
      bundle.setClassLoader(SearchFilterFragmentArgs::class.java.classLoader)
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        __title = "\"\""
      }
      val __hint : String?
      if (bundle.containsKey("hint")) {
        __hint = bundle.getString("hint")
        if (__hint == null) {
          throw IllegalArgumentException("Argument \"hint\" is marked as non-null but was passed a null value.")
        }
      } else {
        __hint = "\"\""
      }
      val __items : Array<SearchFilterItem>?
      if (bundle.containsKey("items")) {
        __items = bundle.getParcelableArray("items")?.map { it as SearchFilterItem }?.toTypedArray()
        if (__items == null) {
          throw IllegalArgumentException("Argument \"items\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"items\" is missing and does not have an android:defaultValue")
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
      return SearchFilterFragmentArgs(__items, __requestKey, __title, __hint)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SearchFilterFragmentArgs {
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        __title = "\"\""
      }
      val __hint : String?
      if (savedStateHandle.contains("hint")) {
        __hint = savedStateHandle["hint"]
        if (__hint == null) {
          throw IllegalArgumentException("Argument \"hint\" is marked as non-null but was passed a null value")
        }
      } else {
        __hint = "\"\""
      }
      val __items : Array<SearchFilterItem>?
      if (savedStateHandle.contains("items")) {
        __items = savedStateHandle.get<Array<Parcelable>>("items")?.map { it as SearchFilterItem
            }?.toTypedArray()
        if (__items == null) {
          throw IllegalArgumentException("Argument \"items\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"items\" is missing and does not have an android:defaultValue")
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
      return SearchFilterFragmentArgs(__items, __requestKey, __title, __hint)
    }
  }
}
