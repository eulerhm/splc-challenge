package com.woocommerce.android.ui.coupons.details

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Int
import kotlin.Long

public class CouponDetailsFragmentDirections private constructor() {
  private data class ActionCouponDetailsFragmentToEditCouponFragment(
    public val couponId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_couponDetailsFragment_to_editCouponFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("couponId", this.couponId)
        return result
      }
  }

  public companion object {
    public fun actionCouponDetailsFragmentToEditCouponFragment(couponId: Long): NavDirections =
        ActionCouponDetailsFragmentToEditCouponFragment(couponId)
  }
}
