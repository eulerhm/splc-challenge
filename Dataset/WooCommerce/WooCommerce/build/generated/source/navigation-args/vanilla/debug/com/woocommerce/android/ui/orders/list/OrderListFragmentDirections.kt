package com.woocommerce.android.ui.orders.list

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphMainDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.FeatureAnnouncement
import com.woocommerce.android.ui.common.InfoScreenFragment
import com.woocommerce.android.ui.feedback.SurveyType
import com.woocommerce.android.ui.orders.creation.OrderCreationViewModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

public class OrderListFragmentDirections private constructor() {
  private data class ActionOrderListFragmentToOrderDetailFragment(
    public val orderId: Long,
    public val remoteNoteId: Long = 0L
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderListFragment_to_orderDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putLong("remoteNoteId", this.remoteNoteId)
        return result
      }
  }

  private data class ActionOrderListFragmentToOrderCreationFragment(
    public val mode: OrderCreationViewModel.Mode
  ) : NavDirections {
    public override val actionId: Int = R.id.action_orderListFragment_to_orderCreationFragment

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
    public fun actionOrderListFragmentToOrderDetailFragment(orderId: Long, remoteNoteId: Long = 0L):
        NavDirections = ActionOrderListFragmentToOrderDetailFragment(orderId, remoteNoteId)

    public fun actionOrderListFragmentToOrderFilterListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderListFragment_to_orderFilterListFragment)

    public fun actionOrderListFragmentToSimplePayments(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderListFragment_to_simplePayments)

    public fun actionOrderListFragmentToOrderCreationBottomSheet(): NavDirections =
        ActionOnlyNavDirections(R.id.action_orderListFragment_to_orderCreationBottomSheet)

    public fun actionOrderListFragmentToOrderCreationFragment(mode: OrderCreationViewModel.Mode):
        NavDirections = ActionOrderListFragmentToOrderCreationFragment(mode)

    public fun actionGlobalItemSelectorDialog(): NavDirections =
        NavGraphMainDirections.actionGlobalItemSelectorDialog()

    public fun actionGlobalFeedbackSurveyFragment(surveyType: SurveyType = SurveyType.MAIN):
        NavDirections = NavGraphMainDirections.actionGlobalFeedbackSurveyFragment(surveyType)

    public fun actionGlobalProductDetailFragment(
      remoteProductId: Long = 0L,
      isAddProduct: Boolean = false,
      isTrashEnabled: Boolean = false
    ): NavDirections = NavGraphMainDirections.actionGlobalProductDetailFragment(remoteProductId,
        isAddProduct, isTrashEnabled)

    public fun actionGlobalReviewDetailFragment(
      launchedFromNotification: Boolean,
      remoteReviewId: Long = 0L,
      tempStatus: String? = "null"
    ): NavDirections =
        NavGraphMainDirections.actionGlobalReviewDetailFragment(launchedFromNotification,
        remoteReviewId, tempStatus)

    public fun actionGlobalWPComWebViewFragment(urlToLoad: String, urlToTriggerExit: String? =
        null): NavDirections = NavGraphMainDirections.actionGlobalWPComWebViewFragment(urlToLoad,
        urlToTriggerExit)

    public fun actionGlobalUserEligibilityErrorFragment(): NavDirections =
        NavGraphMainDirections.actionGlobalUserEligibilityErrorFragment()

    public fun actionGlobalInfoScreenFragment(
      screenTitle: Int = 0,
      heading: Int = 0,
      message: Int = 0,
      linkTitle: Int = 0,
      imageResource: Int = 0,
      linkAction: InfoScreenFragment.InfoScreenLinkAction? = null
    ): NavDirections = NavGraphMainDirections.actionGlobalInfoScreenFragment(screenTitle, heading,
        message, linkTitle, imageResource, linkAction)

    public fun actionGlobalLoginToSitePickerFragment(openedFromLogin: Boolean = true): NavDirections
        = NavGraphMainDirections.actionGlobalLoginToSitePickerFragment(openedFromLogin)

    public fun actionOpenWhatsnewFromMain(announcement: FeatureAnnouncement): NavDirections =
        NavGraphMainDirections.actionOpenWhatsnewFromMain(announcement)

    public fun actionGlobalSimpleTextEditorFragment(
      currentText: String?,
      screenTitle: String,
      hint: String,
      requestCode: Int = -1
    ): NavDirections = NavGraphMainDirections.actionGlobalSimpleTextEditorFragment(currentText,
        screenTitle, hint, requestCode)
  }
}
