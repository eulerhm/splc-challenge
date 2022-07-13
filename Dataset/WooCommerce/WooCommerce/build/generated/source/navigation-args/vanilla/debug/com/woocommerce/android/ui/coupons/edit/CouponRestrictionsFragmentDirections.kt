package com.woocommerce.android.ui.coupons.edit

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Array
import kotlin.Int
import kotlin.LongArray
import kotlin.String

public class CouponRestrictionsFragmentDirections private constructor() {
  private data class ActionCouponRestrictionsFragmentToEmailRestrictionFragment(
    public val allowedEmails: Array<String>
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_couponRestrictionsFragment_to_emailRestrictionFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putStringArray("allowedEmails", this.allowedEmails)
        return result
      }
  }

  private data class ActionCouponRestrictionsToProductCategorySelector(
    public val categoryIds: LongArray
  ) : NavDirections {
    public override val actionId: Int = R.id.action_couponRestrictions_to_productCategorySelector

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLongArray("categoryIds", this.categoryIds)
        return result
      }
  }

  private data class ActionCouponRestrictionsFragmentToProductSelectorFragment(
    public val productIds: LongArray
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_couponRestrictionsFragment_to_productSelectorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLongArray("productIds", this.productIds)
        return result
      }
  }

  public companion object {
    public
        fun actionCouponRestrictionsFragmentToEmailRestrictionFragment(allowedEmails: Array<String>):
        NavDirections = ActionCouponRestrictionsFragmentToEmailRestrictionFragment(allowedEmails)

    public fun actionCouponRestrictionsToProductCategorySelector(categoryIds: LongArray):
        NavDirections = ActionCouponRestrictionsToProductCategorySelector(categoryIds)

    public fun actionCouponRestrictionsFragmentToProductSelectorFragment(productIds: LongArray):
        NavDirections = ActionCouponRestrictionsFragmentToProductSelectorFragment(productIds)
  }
}
