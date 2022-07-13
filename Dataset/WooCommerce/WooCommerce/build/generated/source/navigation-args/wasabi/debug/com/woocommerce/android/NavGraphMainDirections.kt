package com.woocommerce.android

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.model.FeatureAnnouncement
import com.woocommerce.android.ui.common.InfoScreenFragment
import com.woocommerce.android.ui.feedback.SurveyType
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

public class NavGraphMainDirections private constructor() {
  private data class ActionGlobalFeedbackSurveyFragment(
    public val surveyType: SurveyType = SurveyType.MAIN
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_feedbackSurveyFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(SurveyType::class.java)) {
          result.putParcelable("surveyType", this.surveyType as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(SurveyType::class.java)) {
          result.putSerializable("surveyType", this.surveyType as Serializable)
        }
        return result
      }
  }

  private data class ActionGlobalProductDetailFragment(
    public val remoteProductId: Long = 0L,
    public val isAddProduct: Boolean = false,
    public val isTrashEnabled: Boolean = false
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteProductId", this.remoteProductId)
        result.putBoolean("isAddProduct", this.isAddProduct)
        result.putBoolean("isTrashEnabled", this.isTrashEnabled)
        return result
      }
  }

  private data class ActionGlobalReviewDetailFragment(
    public val launchedFromNotification: Boolean,
    public val remoteReviewId: Long = 0L,
    public val tempStatus: String? = "null"
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_reviewDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("remoteReviewId", this.remoteReviewId)
        result.putString("tempStatus", this.tempStatus)
        result.putBoolean("launchedFromNotification", this.launchedFromNotification)
        return result
      }
  }

  private data class ActionGlobalWPComWebViewFragment(
    public val urlToLoad: String,
    public val urlToTriggerExit: String? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_WPComWebViewFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("urlToLoad", this.urlToLoad)
        result.putString("urlToTriggerExit", this.urlToTriggerExit)
        return result
      }
  }

  private data class ActionGlobalInfoScreenFragment(
    public val screenTitle: Int = 0,
    public val heading: Int = 0,
    public val message: Int = 0,
    public val linkTitle: Int = 0,
    public val imageResource: Int = 0,
    public val linkAction: InfoScreenFragment.InfoScreenLinkAction? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_infoScreenFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putInt("screenTitle", this.screenTitle)
        result.putInt("heading", this.heading)
        result.putInt("message", this.message)
        result.putInt("linkTitle", this.linkTitle)
        result.putInt("imageResource", this.imageResource)
        if
            (Parcelable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
          result.putParcelable("linkAction", this.linkAction as Parcelable?)
        } else if
            (Serializable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
          result.putSerializable("linkAction", this.linkAction as Serializable?)
        }
        return result
      }
  }

  private data class ActionGlobalLoginToSitePickerFragment(
    public val openedFromLogin: Boolean = true
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_login_to_sitePickerFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("openedFromLogin", this.openedFromLogin)
        return result
      }
  }

  private data class ActionOpenWhatsnewFromMain(
    public val announcement: FeatureAnnouncement
  ) : NavDirections {
    public override val actionId: Int = R.id.action_open_Whatsnew_from_Main

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
          result.putParcelable("announcement", this.announcement as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
          result.putSerializable("announcement", this.announcement as Serializable)
        } else {
          throw UnsupportedOperationException(FeatureAnnouncement::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionGlobalSimpleTextEditorFragment(
    public val currentText: String?,
    public val screenTitle: String,
    public val hint: String,
    public val requestCode: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_simpleTextEditorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("currentText", this.currentText)
        result.putString("screenTitle", this.screenTitle)
        result.putString("hint", this.hint)
        result.putInt("requestCode", this.requestCode)
        return result
      }
  }

  public companion object {
    public fun actionGlobalItemSelectorDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_item_selector_dialog)

    public fun actionGlobalFeedbackSurveyFragment(surveyType: SurveyType = SurveyType.MAIN):
        NavDirections = ActionGlobalFeedbackSurveyFragment(surveyType)

    public fun actionGlobalProductDetailFragment(
      remoteProductId: Long = 0L,
      isAddProduct: Boolean = false,
      isTrashEnabled: Boolean = false
    ): NavDirections = ActionGlobalProductDetailFragment(remoteProductId, isAddProduct,
        isTrashEnabled)

    public fun actionGlobalReviewDetailFragment(
      launchedFromNotification: Boolean,
      remoteReviewId: Long = 0L,
      tempStatus: String? = "null"
    ): NavDirections = ActionGlobalReviewDetailFragment(launchedFromNotification, remoteReviewId,
        tempStatus)

    public fun actionGlobalWPComWebViewFragment(urlToLoad: String, urlToTriggerExit: String? =
        null): NavDirections = ActionGlobalWPComWebViewFragment(urlToLoad, urlToTriggerExit)

    public fun actionGlobalUserEligibilityErrorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_userEligibilityErrorFragment)

    public fun actionGlobalInfoScreenFragment(
      screenTitle: Int = 0,
      heading: Int = 0,
      message: Int = 0,
      linkTitle: Int = 0,
      imageResource: Int = 0,
      linkAction: InfoScreenFragment.InfoScreenLinkAction? = null
    ): NavDirections = ActionGlobalInfoScreenFragment(screenTitle, heading, message, linkTitle,
        imageResource, linkAction)

    public fun actionGlobalLoginToSitePickerFragment(openedFromLogin: Boolean = true): NavDirections
        = ActionGlobalLoginToSitePickerFragment(openedFromLogin)

    public fun actionOpenWhatsnewFromMain(announcement: FeatureAnnouncement): NavDirections =
        ActionOpenWhatsnewFromMain(announcement)

    public fun actionGlobalSimpleTextEditorFragment(
      currentText: String?,
      screenTitle: String,
      hint: String,
      requestCode: Int = -1
    ): NavDirections = ActionGlobalSimpleTextEditorFragment(currentText, screenTitle, hint,
        requestCode)
  }
}
