package com.woocommerce.android.ui.coupons.details

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class CouponDetailsFragmentArgs(
  public val couponId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("couponId", this.couponId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("couponId", this.couponId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CouponDetailsFragmentArgs {
      bundle.setClassLoader(CouponDetailsFragmentArgs::class.java.classLoader)
      val __couponId : Long
      if (bundle.containsKey("couponId")) {
        __couponId = bundle.getLong("couponId")
      } else {
        throw IllegalArgumentException("Required argument \"couponId\" is missing and does not have an android:defaultValue")
      }
      return CouponDetailsFragmentArgs(__couponId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CouponDetailsFragmentArgs {
      val __couponId : Long?
      if (savedStateHandle.contains("couponId")) {
        __couponId = savedStateHandle["couponId"]
        if (__couponId == null) {
          throw IllegalArgumentException("Argument \"couponId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"couponId\" is missing and does not have an android:defaultValue")
      }
      return CouponDetailsFragmentArgs(__couponId)
    }
  }
}
