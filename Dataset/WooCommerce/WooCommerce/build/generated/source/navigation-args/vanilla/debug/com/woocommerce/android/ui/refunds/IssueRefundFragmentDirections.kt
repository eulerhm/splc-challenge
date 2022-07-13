package com.woocommerce.android.ui.refunds

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import java.math.BigDecimal
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

public class IssueRefundFragmentDirections private constructor() {
  private data class ActionIssueRefundFragmentToRefundItemsPickerDialog(
    public val title: String,
    public val uniqueId: Long,
    public val maxValue: Int,
    public val currentValue: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_issueRefundFragment_to_refundItemsPickerDialog

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("title", this.title)
        result.putLong("uniqueId", this.uniqueId)
        result.putInt("maxValue", this.maxValue)
        result.putInt("currentValue", this.currentValue)
        return result
      }
  }

  private data class ActionIssueRefundFragmentToRefundAmountDialog(
    public val title: String,
    public val maxValue: BigDecimal,
    public val currentValue: BigDecimal,
    public val minValue: BigDecimal,
    public val message: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_issueRefundFragment_to_refundAmountDialog

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putString("title", this.title)
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putParcelable("maxValue", this.maxValue as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putSerializable("maxValue", this.maxValue as Serializable)
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putParcelable("currentValue", this.currentValue as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putSerializable("currentValue", this.currentValue as Serializable)
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putParcelable("minValue", this.minValue as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(BigDecimal::class.java)) {
          result.putSerializable("minValue", this.minValue as Serializable)
        } else {
          throw UnsupportedOperationException(BigDecimal::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putString("message", this.message)
        return result
      }
  }

  public companion object {
    public fun actionIssueRefundFragmentToRefundSummaryFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_issueRefundFragment_to_refundSummaryFragment)

    public fun actionIssueRefundFragmentToRefundItemsPickerDialog(
      title: String,
      uniqueId: Long,
      maxValue: Int,
      currentValue: Int
    ): NavDirections = ActionIssueRefundFragmentToRefundItemsPickerDialog(title, uniqueId, maxValue,
        currentValue)

    public fun actionIssueRefundFragmentToRefundAmountDialog(
      title: String,
      maxValue: BigDecimal,
      currentValue: BigDecimal,
      minValue: BigDecimal,
      message: String
    ): NavDirections = ActionIssueRefundFragmentToRefundAmountDialog(title, maxValue, currentValue,
        minValue, message)
  }
}
