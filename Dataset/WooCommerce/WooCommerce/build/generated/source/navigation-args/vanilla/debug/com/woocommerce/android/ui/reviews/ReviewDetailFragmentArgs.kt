package com.woocommerce.android.ui.reviews

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class ReviewDetailFragmentArgs(
  public val launchedFromNotification: Boolean,
  public val remoteReviewId: Long = 0L,
  public val tempStatus: String? = "null"
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("remoteReviewId", this.remoteReviewId)
    result.putString("tempStatus", this.tempStatus)
    result.putBoolean("launchedFromNotification", this.launchedFromNotification)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("remoteReviewId", this.remoteReviewId)
    result.set("tempStatus", this.tempStatus)
    result.set("launchedFromNotification", this.launchedFromNotification)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ReviewDetailFragmentArgs {
      bundle.setClassLoader(ReviewDetailFragmentArgs::class.java.classLoader)
      val __remoteReviewId : Long
      if (bundle.containsKey("remoteReviewId")) {
        __remoteReviewId = bundle.getLong("remoteReviewId")
      } else {
        __remoteReviewId = 0L
      }
      val __tempStatus : String?
      if (bundle.containsKey("tempStatus")) {
        __tempStatus = bundle.getString("tempStatus")
      } else {
        __tempStatus = "null"
      }
      val __launchedFromNotification : Boolean
      if (bundle.containsKey("launchedFromNotification")) {
        __launchedFromNotification = bundle.getBoolean("launchedFromNotification")
      } else {
        throw IllegalArgumentException("Required argument \"launchedFromNotification\" is missing and does not have an android:defaultValue")
      }
      return ReviewDetailFragmentArgs(__launchedFromNotification, __remoteReviewId, __tempStatus)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ReviewDetailFragmentArgs {
      val __remoteReviewId : Long?
      if (savedStateHandle.contains("remoteReviewId")) {
        __remoteReviewId = savedStateHandle["remoteReviewId"]
        if (__remoteReviewId == null) {
          throw IllegalArgumentException("Argument \"remoteReviewId\" of type long does not support null values")
        }
      } else {
        __remoteReviewId = 0L
      }
      val __tempStatus : String?
      if (savedStateHandle.contains("tempStatus")) {
        __tempStatus = savedStateHandle["tempStatus"]
      } else {
        __tempStatus = "null"
      }
      val __launchedFromNotification : Boolean?
      if (savedStateHandle.contains("launchedFromNotification")) {
        __launchedFromNotification = savedStateHandle["launchedFromNotification"]
        if (__launchedFromNotification == null) {
          throw IllegalArgumentException("Argument \"launchedFromNotification\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"launchedFromNotification\" is missing and does not have an android:defaultValue")
      }
      return ReviewDetailFragmentArgs(__launchedFromNotification, __remoteReviewId, __tempStatus)
    }
  }
}
