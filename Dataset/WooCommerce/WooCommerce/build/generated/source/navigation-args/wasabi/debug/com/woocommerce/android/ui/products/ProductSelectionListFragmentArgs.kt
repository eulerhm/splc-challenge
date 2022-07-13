package com.woocommerce.android.ui.products

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Long
import kotlin.LongArray
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductSelectionListFragmentArgs(
  public val groupedProductListType: GroupedProductListType,
  public val excludedProductIds: LongArray,
  public val remoteProductId: Long = 0L
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteProductId", this.remoteProductId)
    if (Parcelable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
      result.putParcelable("groupedProductListType", this.groupedProductListType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
      result.putSerializable("groupedProductListType", this.groupedProductListType as Serializable)
    } else {
      throw UnsupportedOperationException(GroupedProductListType::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putLongArray("excludedProductIds", this.excludedProductIds)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteProductId", this.remoteProductId)
    if (Parcelable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
      result.set("groupedProductListType", this.groupedProductListType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
      result.set("groupedProductListType", this.groupedProductListType as Serializable)
    } else {
      throw UnsupportedOperationException(GroupedProductListType::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("excludedProductIds", this.excludedProductIds)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductSelectionListFragmentArgs {
      bundle.setClassLoader(ProductSelectionListFragmentArgs::class.java.classLoader)
      val __remoteProductId : Long
      if (bundle.containsKey("remoteProductId")) {
        __remoteProductId = bundle.getLong("remoteProductId")
      } else {
        __remoteProductId = 0L
      }
      val __groupedProductListType : GroupedProductListType?
      if (bundle.containsKey("groupedProductListType")) {
        if (Parcelable::class.java.isAssignableFrom(GroupedProductListType::class.java) ||
            Serializable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
          __groupedProductListType = bundle.get("groupedProductListType") as GroupedProductListType?
        } else {
          throw UnsupportedOperationException(GroupedProductListType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__groupedProductListType == null) {
          throw IllegalArgumentException("Argument \"groupedProductListType\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"groupedProductListType\" is missing and does not have an android:defaultValue")
      }
      val __excludedProductIds : LongArray?
      if (bundle.containsKey("excludedProductIds")) {
        __excludedProductIds = bundle.getLongArray("excludedProductIds")
        if (__excludedProductIds == null) {
          throw IllegalArgumentException("Argument \"excludedProductIds\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"excludedProductIds\" is missing and does not have an android:defaultValue")
      }
      return ProductSelectionListFragmentArgs(__groupedProductListType, __excludedProductIds,
          __remoteProductId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ProductSelectionListFragmentArgs {
      val __remoteProductId : Long?
      if (savedStateHandle.contains("remoteProductId")) {
        __remoteProductId = savedStateHandle["remoteProductId"]
        if (__remoteProductId == null) {
          throw IllegalArgumentException("Argument \"remoteProductId\" of type long does not support null values")
        }
      } else {
        __remoteProductId = 0L
      }
      val __groupedProductListType : GroupedProductListType?
      if (savedStateHandle.contains("groupedProductListType")) {
        if (Parcelable::class.java.isAssignableFrom(GroupedProductListType::class.java) ||
            Serializable::class.java.isAssignableFrom(GroupedProductListType::class.java)) {
          __groupedProductListType =
              savedStateHandle.get<GroupedProductListType?>("groupedProductListType")
        } else {
          throw UnsupportedOperationException(GroupedProductListType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__groupedProductListType == null) {
          throw IllegalArgumentException("Argument \"groupedProductListType\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"groupedProductListType\" is missing and does not have an android:defaultValue")
      }
      val __excludedProductIds : LongArray?
      if (savedStateHandle.contains("excludedProductIds")) {
        __excludedProductIds = savedStateHandle["excludedProductIds"]
        if (__excludedProductIds == null) {
          throw IllegalArgumentException("Argument \"excludedProductIds\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"excludedProductIds\" is missing and does not have an android:defaultValue")
      }
      return ProductSelectionListFragmentArgs(__groupedProductListType, __excludedProductIds,
          __remoteProductId)
    }
  }
}
