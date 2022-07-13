package com.woocommerce.android.ui.coupons.edit

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.Coupon
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CouponRestrictionsFragmentArgs(
  public val restrictions: Coupon.CouponRestrictions,
  public val currencyCode: String,
  public val showLimitUsageToXItems: Boolean
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
      result.putParcelable("restrictions", this.restrictions as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
      result.putSerializable("restrictions", this.restrictions as Serializable)
    } else {
      throw UnsupportedOperationException(Coupon.CouponRestrictions::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putString("currencyCode", this.currencyCode)
    result.putBoolean("showLimitUsageToXItems", this.showLimitUsageToXItems)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
      result.set("restrictions", this.restrictions as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
      result.set("restrictions", this.restrictions as Serializable)
    } else {
      throw UnsupportedOperationException(Coupon.CouponRestrictions::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("currencyCode", this.currencyCode)
    result.set("showLimitUsageToXItems", this.showLimitUsageToXItems)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CouponRestrictionsFragmentArgs {
      bundle.setClassLoader(CouponRestrictionsFragmentArgs::class.java.classLoader)
      val __restrictions : Coupon.CouponRestrictions?
      if (bundle.containsKey("restrictions")) {
        if (Parcelable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java) ||
            Serializable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
          __restrictions = bundle.get("restrictions") as Coupon.CouponRestrictions?
        } else {
          throw UnsupportedOperationException(Coupon.CouponRestrictions::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__restrictions == null) {
          throw IllegalArgumentException("Argument \"restrictions\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"restrictions\" is missing and does not have an android:defaultValue")
      }
      val __currencyCode : String?
      if (bundle.containsKey("currencyCode")) {
        __currencyCode = bundle.getString("currencyCode")
        if (__currencyCode == null) {
          throw IllegalArgumentException("Argument \"currencyCode\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currencyCode\" is missing and does not have an android:defaultValue")
      }
      val __showLimitUsageToXItems : Boolean
      if (bundle.containsKey("showLimitUsageToXItems")) {
        __showLimitUsageToXItems = bundle.getBoolean("showLimitUsageToXItems")
      } else {
        throw IllegalArgumentException("Required argument \"showLimitUsageToXItems\" is missing and does not have an android:defaultValue")
      }
      return CouponRestrictionsFragmentArgs(__restrictions, __currencyCode,
          __showLimitUsageToXItems)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        CouponRestrictionsFragmentArgs {
      val __restrictions : Coupon.CouponRestrictions?
      if (savedStateHandle.contains("restrictions")) {
        if (Parcelable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java) ||
            Serializable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
          __restrictions = savedStateHandle.get<Coupon.CouponRestrictions?>("restrictions")
        } else {
          throw UnsupportedOperationException(Coupon.CouponRestrictions::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__restrictions == null) {
          throw IllegalArgumentException("Argument \"restrictions\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"restrictions\" is missing and does not have an android:defaultValue")
      }
      val __currencyCode : String?
      if (savedStateHandle.contains("currencyCode")) {
        __currencyCode = savedStateHandle["currencyCode"]
        if (__currencyCode == null) {
          throw IllegalArgumentException("Argument \"currencyCode\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"currencyCode\" is missing and does not have an android:defaultValue")
      }
      val __showLimitUsageToXItems : Boolean?
      if (savedStateHandle.contains("showLimitUsageToXItems")) {
        __showLimitUsageToXItems = savedStateHandle["showLimitUsageToXItems"]
        if (__showLimitUsageToXItems == null) {
          throw IllegalArgumentException("Argument \"showLimitUsageToXItems\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"showLimitUsageToXItems\" is missing and does not have an android:defaultValue")
      }
      return CouponRestrictionsFragmentArgs(__restrictions, __currencyCode,
          __showLimitUsageToXItems)
    }
  }
}
