package com.woocommerce.android.ui.orders.details

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphOrdersDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Order
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import com.woocommerce.android.ui.orders.creation.OrderCreationViewModel
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlin.Suppress

public class OrderDetailFragmentDirections private constructor() {
  private data class ActionOrderDetailFragmentToAddOrderNoteFragment(
    public val orderId: Long,
    public val orderNumber: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_addOrderNoteFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putString("orderNumber", this.orderNumber)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToOrderFulfillFragment(
    public val orderId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_orderFulfillFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToOrderShippingLabelRefundFragment(
    public val orderId: Long = 0L,
    public val shippingLabelId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderDetailFragment_to_orderShippingLabelRefundFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putLong("shippingLabelId", this.shippingLabelId)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToPrintShippingLabelFragment(
    public val shippingLabelIds: LongArray,
    public val orderId: Long = 0L,
    public val isReprint: Boolean = true
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderDetailFragment_to_printShippingLabelFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putLongArray("shippingLabelIds", this.shippingLabelIds)
        result.putBoolean("isReprint", this.isReprint)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToIssueRefund(
    public val orderId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_issue_refund

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToRefundDetailFragment(
    public val orderId: Long = 0L,
    public val refundId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_refundDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putLong("refundId", this.refundId)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToOrderStatusSelectorDialog(
    public val currentStatus: String,
    public val orderStatusList: Array<Order.OrderStatus>
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_orderStatusSelectorDialog

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("currentStatus", this.currentStatus)
        result.putParcelableArray("orderStatusList", this.orderStatusList)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToCreateShippingLabelFragment(
    public val orderId: Long
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderDetailFragment_to_createShippingLabelFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToReceiptPreviewFragment(
    public val receiptUrl: String,
    public val billingEmail: String,
    public val orderId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_receiptPreviewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("receiptUrl", this.receiptUrl)
        result.putString("billingEmail", this.billingEmail)
        result.putLong("orderId", this.orderId)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment(
    public val invoices: Array<String>,
    public val isReprint: Boolean
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_orderDetailFragment_to_printShippingLabelCustomsFormFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putStringArray("invoices", this.invoices)
        result.putBoolean("isReprint", this.isReprint)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToOrderedAddonFragment(
    public val orderId: Long,
    public val orderItemId: Long,
    public val addonsProductId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_orderedAddonFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putLong("orderItemId", this.orderItemId)
        result.putLong("addonsProductId", this.addonsProductId)
        return result
      }
  }

  private data class ActionOrderDetailFragmentToCardReaderFlow(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_cardReaderFlow

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam::class.java)) {
          result.putParcelable("cardReaderFlowParam", this.cardReaderFlowParam as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(CardReaderFlowParam::class.java)) {
          result.putSerializable("cardReaderFlowParam", this.cardReaderFlowParam as Serializable)
        } else {
          throw UnsupportedOperationException(CardReaderFlowParam::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionOrderDetailFragmentToOrderCreationFragment(
    public val mode: OrderCreationViewModel.Mode
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderDetailFragment_to_orderCreationFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
          result.putParcelable("mode", this.mode as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(OrderCreationViewModel.Mode::class.java)) {
          result.putSerializable("mode", this.mode as Serializable)
        } else {
          throw UnsupportedOperationException(OrderCreationViewModel.Mode::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionOrderDetailFragmentToAddOrderNoteFragment(orderId: Long, orderNumber: String =
        "\"\""): NavDirections = ActionOrderDetailFragmentToAddOrderNoteFragment(orderId,
        orderNumber)

    public fun actionOrderDetailFragmentToOrderFulfillFragment(orderId: Long): NavDirections =
        ActionOrderDetailFragmentToOrderFulfillFragment(orderId)

    public fun actionOrderDetailFragmentToOrderShippingLabelRefundFragment(orderId: Long = 0L,
        shippingLabelId: Long = 0L): NavDirections =
        ActionOrderDetailFragmentToOrderShippingLabelRefundFragment(orderId, shippingLabelId)

    public fun actionOrderDetailFragmentToPrintShippingLabelFragment(
      shippingLabelIds: LongArray,
      orderId: Long = 0L,
      isReprint: Boolean = true
    ): NavDirections = ActionOrderDetailFragmentToPrintShippingLabelFragment(shippingLabelIds,
        orderId, isReprint)

    public fun actionOrderDetailFragmentToIssueRefund(orderId: Long = 0L): NavDirections =
        ActionOrderDetailFragmentToIssueRefund(orderId)

    public fun actionOrderDetailFragmentToRefundDetailFragment(orderId: Long = 0L, refundId: Long =
        0L): NavDirections = ActionOrderDetailFragmentToRefundDetailFragment(orderId, refundId)

    public fun actionOrderDetailFragmentToOrderStatusSelectorDialog(currentStatus: String,
        orderStatusList: Array<Order.OrderStatus>): NavDirections =
        ActionOrderDetailFragmentToOrderStatusSelectorDialog(currentStatus, orderStatusList)

    public fun actionOrderDetailFragmentToCreateShippingLabelFragment(orderId: Long): NavDirections
        = ActionOrderDetailFragmentToCreateShippingLabelFragment(orderId)

    public fun actionOrderDetailFragmentToReceiptPreviewFragment(
      receiptUrl: String,
      billingEmail: String,
      orderId: Long
    ): NavDirections = ActionOrderDetailFragmentToReceiptPreviewFragment(receiptUrl, billingEmail,
        orderId)

    public fun actionOrderDetailFragmentToPrintingInstructionsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderDetailFragment_to_printingInstructionsFragment)

    public
        fun actionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment(invoices: Array<String>,
        isReprint: Boolean): NavDirections =
        ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment(invoices, isReprint)

    public fun actionOrderDetailFragmentToOrderedAddonFragment(
      orderId: Long,
      orderItemId: Long,
      addonsProductId: Long
    ): NavDirections = ActionOrderDetailFragmentToOrderedAddonFragment(orderId, orderItemId,
        addonsProductId)

    public fun actionOrderDetailFragmentToEditCustomerOrderNoteFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderDetailFragment_to_editCustomerOrderNoteFragment)

    public fun actionOrderDetailFragmentToShippingAddressEditingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderDetailFragment_to_shippingAddressEditingFragment)

    public fun actionOrderDetailFragmentToBillingAddressEditingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderDetailFragment_to_billingAddressEditingFragment)

    public fun actionOrderDetailFragmentToCardReaderFlow(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections = ActionOrderDetailFragmentToCardReaderFlow(cardReaderFlowParam)

    public fun actionOrderDetailFragmentToOrderCreationFragment(mode: OrderCreationViewModel.Mode):
        NavDirections = ActionOrderDetailFragmentToOrderCreationFragment(mode)

    public fun actionOrderDetailFragmentToInstallWcShippingFlow(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderDetailFragment_to_installWcShippingFlow)

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
