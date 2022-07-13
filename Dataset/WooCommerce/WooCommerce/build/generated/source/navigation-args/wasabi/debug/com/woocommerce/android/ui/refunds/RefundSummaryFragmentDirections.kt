package com.woocommerce.android.ui.refunds

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Int
import kotlin.String

public class RefundSummaryFragmentDirections private constructor() {
  private data class ActionRefundSummaryFragmentToRefundConfirmationDialog(
    public val title: String,
    public val message: String,
    public val positiveButtonTitle: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_refundSummaryFragment_to_refundConfirmationDialog

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("title", this.title)
        result.putString("message", this.message)
        result.putString("positiveButtonTitle", this.positiveButtonTitle)
        return result
      }
  }

  public companion object {
    public fun actionRefundSummaryFragmentToRefundConfirmationDialog(
      title: String,
      message: String,
      positiveButtonTitle: String
    ): NavDirections = ActionRefundSummaryFragmentToRefundConfirmationDialog(title, message,
        positiveButtonTitle)
  }
}
