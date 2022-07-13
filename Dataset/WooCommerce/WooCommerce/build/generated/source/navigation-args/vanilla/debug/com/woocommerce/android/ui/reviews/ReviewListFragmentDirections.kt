package com.woocommerce.android.ui.reviews

import android.os.Bundle
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphMainDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.FeatureAnnouncement
import com.woocommerce.android.ui.common.InfoScreenFragment
import com.woocommerce.android.ui.feedback.SurveyType
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String

public class ReviewListFragmentDirections private constructor() {
  private data class ActionReviewListFragmentToReviewDetailFragment(
    public val launchedFromNotification: Boolean,
    public val remoteReviewId: Long = 0L,
    public val tempStatus: String? = "null"
  ) : NavDirections {
    public override val actionId: Int = R.id.action_reviewListFragment_to_reviewDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteReviewId", this.remoteReviewId)
        result.putString("tempStatus", this.tempStatus)
        result.putBoolean("launchedFromNotification", this.launchedFromNotification)
        return result
      }
  }

  public companion object {
    public fun actionReviewListFragmentToReviewDetailFragment(
      launchedFromNotification: Boolean,
      remoteReviewId: Long = 0L,
      tempStatus: String? = "null"
    ): NavDirections = ActionReviewListFragmentToReviewDetailFragment(launchedFromNotification,
        remoteReviewId, tempStatus)

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
