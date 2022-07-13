package com.woocommerce.android.ui.media

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class MediaUploadErrorListFragmentArgs(
  public val remoteId: Long = 0L,
  public val errorList: Array<MediaFileUploadHandler.ProductImageUploadData>? = null
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteId", this.remoteId)
    result.putParcelableArray("errorList", this.errorList)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteId", this.remoteId)
    result.set("errorList", this.errorList)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): MediaUploadErrorListFragmentArgs {
      bundle.setClassLoader(MediaUploadErrorListFragmentArgs::class.java.classLoader)
      val __remoteId : Long
      if (bundle.containsKey("remoteId")) {
        __remoteId = bundle.getLong("remoteId")
      } else {
        __remoteId = 0L
      }
      val __errorList : Array<MediaFileUploadHandler.ProductImageUploadData>?
      if (bundle.containsKey("errorList")) {
        __errorList = bundle.getParcelableArray("errorList")?.map { it as
            MediaFileUploadHandler.ProductImageUploadData }?.toTypedArray()
      } else {
        __errorList = null
      }
      return MediaUploadErrorListFragmentArgs(__remoteId, __errorList)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        MediaUploadErrorListFragmentArgs {
      val __remoteId : Long?
      if (savedStateHandle.contains("remoteId")) {
        __remoteId = savedStateHandle["remoteId"]
        if (__remoteId == null) {
          throw IllegalArgumentException("Argument \"remoteId\" of type long does not support null values")
        }
      } else {
        __remoteId = 0L
      }
      val __errorList : Array<MediaFileUploadHandler.ProductImageUploadData>?
      if (savedStateHandle.contains("errorList")) {
        __errorList = savedStateHandle.get<Array<Parcelable>>("errorList")?.map { it as
            MediaFileUploadHandler.ProductImageUploadData }?.toTypedArray()
      } else {
        __errorList = null
      }
      return MediaUploadErrorListFragmentArgs(__remoteId, __errorList)
    }
  }
}
