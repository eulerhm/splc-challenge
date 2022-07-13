package com.woocommerce.android.ui.coupons.edit

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Coupon
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Int
import kotlin.LongArray
import kotlin.String
import kotlin.Suppress

public class EditCouponFragmentDirections private constructor() {
  private data class ActionEditCouponFragmentToProductSelectorFragment(
    public val productIds: LongArray
  ) : NavDirections {
    public override val actionId: Int = R.id.action_editCouponFragment_to_productSelectorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLongArray("productIds", this.productIds)
        return result
      }
  }

  private data class ActionEditCouponFragmentToCouponRestrictionsFragment(
    public val restrictions: Coupon.CouponRestrictions,
    public val currencyCode: String,
    public val showLimitUsageToXItems: Boolean
  ) : NavDirections {
    public override val actionId: Int = R.id.action_editCouponFragment_to_couponRestrictionsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
          result.putParcelable("restrictions", this.restrictions as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(Coupon.CouponRestrictions::class.java)) {
          result.putSerializable("restrictions", this.restrictions as Serializable)
        } else {
          throw UnsupportedOperationException(Coupon.CouponRestrictions::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putString("currencyCode", this.currencyCode)
        result.putBoolean("showLimitUsageToXItems", this.showLimitUsageToXItems)
        return result
      }
  }

  private data class ActionEditCouponFragmentToProductCategorySelectorFragment(
    public val categoryIds: LongArray
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_editCouponFragment_to_productCategorySelectorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLongArray("categoryIds", this.categoryIds)
        return result
      }
  }

  public companion object {
    public fun actionEditCouponFragmentToProductSelectorFragment(productIds: LongArray):
        NavDirections = ActionEditCouponFragmentToProductSelectorFragment(productIds)

    public fun actionEditCouponFragmentToCouponRestrictionsFragment(
      restrictions: Coupon.CouponRestrictions,
      currencyCode: String,
      showLimitUsageToXItems: Boolean
    ): NavDirections = ActionEditCouponFragmentToCouponRestrictionsFragment(restrictions,
        currencyCode, showLimitUsageToXItems)

    public fun actionEditCouponFragmentToProductCategorySelectorFragment(categoryIds: LongArray):
        NavDirections = ActionEditCouponFragmentToProductCategorySelectorFragment(categoryIds)
  }
}
