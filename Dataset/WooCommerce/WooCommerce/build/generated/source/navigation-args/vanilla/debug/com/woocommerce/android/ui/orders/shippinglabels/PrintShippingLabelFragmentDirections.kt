package com.woocommerce.android.ui.orders.shippinglabels

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphOrdersDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

public class PrintShippingLabelFragmentDirections private constructor() {
  private data class ActionPrintShippingLabelFragmentToShippingLabelPaperSizeSelectorDialog(
    public val currentPaperSize: ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_printShippingLabelFragment_to_shippingLabelPaperSizeSelectorDialog

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if
            (Parcelable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
          result.putParcelable("currentPaperSize", this.currentPaperSize as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java)) {
          result.putSerializable("currentPaperSize", this.currentPaperSize as Serializable)
        } else {
          throw UnsupportedOperationException(ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionPrintShippingLabelFragmentToPrintShippingLabelCustomsFormFragment(
    public val invoices: Array<String>,
    public val isReprint: Boolean
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_printShippingLabelFragment_to_printShippingLabelCustomsFormFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putStringArray("invoices", this.invoices)
        result.putBoolean("isReprint", this.isReprint)
        return result
      }
  }

  public companion object {
    public
        fun actionPrintShippingLabelFragmentToShippingLabelPaperSizeSelectorDialog(currentPaperSize: ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize):
        NavDirections =
        ActionPrintShippingLabelFragmentToShippingLabelPaperSizeSelectorDialog(currentPaperSize)

    public fun actionPrintShippingLabelFragmentToPrintShippingLabelInfoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_printShippingLabelFragment_to_printShippingLabelInfoFragment)

    public fun actionPrintShippingLabelFragmentToLabelFormatOptionsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_printShippingLabelFragment_to_labelFormatOptionsFragment)

    public
        fun actionPrintShippingLabelFragmentToPrintShippingLabelCustomsFormFragment(invoices: Array<String>,
        isReprint: Boolean): NavDirections =
        ActionPrintShippingLabelFragmentToPrintShippingLabelCustomsFormFragment(invoices, isReprint)

    public fun actionGlobalAddOrderShipmentTrackingFragment(
      orderId: Long,
      orderTrackingProvider: String? = "null",
      isCustomProvider: Boolean = false
    ): NavDirections =
        NavGraphOrdersDirections.actionGlobalAddOrderShipmentTrackingFragment(orderId,
        orderTrackingProvider, isCustomProvider)

    public fun actionGlobalItemSelectorDialog(
      selectedItem: String?,
      keys: Array<String>,
      values: Array<String>,
      requestKey: String,
      title: String? = null
    ): NavDirections = NavGraphOrdersDirections.actionGlobalItemSelectorDialog(selectedItem, keys,
        values, requestKey, title)

    public fun actionSearchFilterFragment(
      items: Array<SearchFilterItem>,
      requestKey: String,
      title: String = "\"\"",
      hint: String = "\"\""
    ): NavDirections = NavGraphOrdersDirections.actionSearchFilterFragment(items, requestKey, title,
        hint)
  }
}
