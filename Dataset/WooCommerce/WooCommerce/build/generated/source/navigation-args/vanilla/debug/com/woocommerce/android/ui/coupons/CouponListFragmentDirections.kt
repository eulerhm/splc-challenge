package com.woocommerce.android.ui.coupons

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Int
import kotlin.Long

public class CouponListFragmentDirections private constructor() {
  private data class ActionCouponListFragmentToCouponDetailsFragment(
    public val couponId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_couponListFragment_to_couponDetailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("couponId", this.couponId)
        return result
      }
  }

  public companion object {
    public fun actionCouponListFragmentToCouponDetailsFragment(couponId: Long): NavDirections =
        ActionCouponListFragmentToCouponDetailsFragment(couponId)
  }
}
