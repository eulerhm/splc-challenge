package com.woocommerce.android.ui.feedback

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class FeedbackCompletedFragmentArgs(
  public val surveyType: SurveyType
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(SurveyType::class.java)) {
      result.set("surveyType", this.surveyType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(SurveyType::class.java)) {
      result.set("surveyType", this.surveyType as Serializable)
    } else {
      throw UnsupportedOperationException(SurveyType::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FeedbackCompletedFragmentArgs {
      bundle.setClassLoader(FeedbackCompletedFragmentArgs::class.java.classLoader)
      val __surveyType : SurveyType?
      if (bundle.containsKey("surveyType")) {
        if (Parcelable::class.java.isAssignableFrom(SurveyType::class.java) ||
            Serializable::class.java.isAssignableFrom(SurveyType::class.java)) {
          __surveyType = bundle.get("surveyType") as SurveyType?
        } else {
          throw UnsupportedOperationException(SurveyType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__surveyType == null) {
          throw IllegalArgumentException("Argument \"surveyType\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"surveyType\" is missing and does not have an android:defaultValue")
      }
      return FeedbackCompletedFragmentArgs(__surveyType)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        FeedbackCompletedFragmentArgs {
      val __surveyType : SurveyType?
      if (savedStateHandle.contains("surveyType")) {
        if (Parcelable::class.java.isAssignableFrom(SurveyType::class.java) ||
            Serializable::class.java.isAssignableFrom(SurveyType::class.java)) {
          __surveyType = savedStateHandle.get<SurveyType?>("surveyType")
        } else {
          throw UnsupportedOperationException(SurveyType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__surveyType == null) {
          throw IllegalArgumentException("Argument \"surveyType\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"surveyType\" is missing and does not have an android:defaultValue")
      }
      return FeedbackCompletedFragmentArgs(__surveyType)
    }
  }
}
