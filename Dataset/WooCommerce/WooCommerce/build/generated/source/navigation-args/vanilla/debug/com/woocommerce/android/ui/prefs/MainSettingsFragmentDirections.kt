package com.woocommerce.android.ui.prefs

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphSettingsDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.FeatureAnnouncement
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import com.woocommerce.android.ui.feedback.SurveyType
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class MainSettingsFragmentDirections private constructor() {
  private data class ActionMainSettingsFragmentToCardReaderFlow(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mainSettingsFragment_to_cardReaderFlow

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

  private data class ActionMainSettingsFragmentFeedbackSurveyFragment(
    public val surveyType: SurveyType = SurveyType.MAIN
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mainSettingsFragment_feedbackSurveyFragment

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

  private data class ActionMainSettingsFragmentToFeatureAnnouncementDialogFragment(
    public val announcement: FeatureAnnouncement
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_mainSettingsFragment_to_featureAnnouncementDialogFragment

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

  public companion object {
    public fun actionMainSettingsFragmentToCardReaderFlow(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections = ActionMainSettingsFragmentToCardReaderFlow(cardReaderFlowParam)

    public fun actionMainSettingsFragmentToPrivacySettingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_privacySettingsFragment)

    public fun actionMainSettingsFragmentToLicensesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_licensesFragment)

    public fun actionMainSettingsFragmentToAboutActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_aboutActivity)

    public fun actionMainSettingsFragmentToBetaFeaturesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_betaFeaturesFragment)

    public fun actionMainSettingsFragmentFeedbackSurveyFragment(surveyType: SurveyType =
        SurveyType.MAIN): NavDirections =
        ActionMainSettingsFragmentFeedbackSurveyFragment(surveyType)

    public
        fun actionMainSettingsFragmentToFeatureAnnouncementDialogFragment(announcement: FeatureAnnouncement):
        NavDirections = ActionMainSettingsFragmentToFeatureAnnouncementDialogFragment(announcement)

    public fun actionMainSettingsFragmentToNavGraphJetpackInstall(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainSettingsFragment_to_nav_graph_jetpack_install)

    public fun actionGlobalWPComWebViewFragment(urlToLoad: String, urlToTriggerExit: String? =
        null): NavDirections =
        NavGraphSettingsDirections.actionGlobalWPComWebViewFragment(urlToLoad, urlToTriggerExit)
  }
}
