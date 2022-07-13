package com.woocommerce.android.ui.feedback

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphSettingsDirections
import com.woocommerce.android.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class FeedbackSurveyFragmentDirections private constructor() {
  private data class ActionFeedbackSurveyFragmentToFeedbackCompletedFragment(
    public val surveyType: SurveyType
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_feedbackSurveyFragment_to_feedbackCompletedFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(SurveyType::class.java)) {
          result.putParcelable("surveyType", this.surveyType as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(SurveyType::class.java)) {
          result.putSerializable("surveyType", this.surveyType as Serializable)
        } else {
          throw UnsupportedOperationException(SurveyType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionFeedbackSurveyFragmentToFeedbackCompletedFragment(surveyType: SurveyType):
        NavDirections = ActionFeedbackSurveyFragmentToFeedbackCompletedFragment(surveyType)

    public fun actionGlobalWPComWebViewFragment(urlToLoad: String, urlToTriggerExit: String? =
        null): NavDirections =
        NavGraphSettingsDirections.actionGlobalWPComWebViewFragment(urlToLoad, urlToTriggerExit)
  }
}
