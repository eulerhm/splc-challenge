package com.woocommerce.android.ui.cardreader.onboarding

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class CardReaderOnboardingFragmentDirections private constructor() {
  private data class ActionCardReaderOnboardingFragmentToCardReaderHubFragment(
    public val cardReaderFlowParam: CardReaderFlowParam,
    public val storeCountryCode: String
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderOnboardingFragment_to_cardReaderHubFragment

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
        result.putString("storeCountryCode", this.storeCountryCode)
        return result
      }
  }

  private data class ActionCardReaderOnboardingFragmentToCardReaderConnectDialogFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderOnboardingFragment_to_cardReaderConnectDialogFragment

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

  public companion object {
    public
        fun actionCardReaderOnboardingFragmentToCardReaderHubFragment(cardReaderFlowParam: CardReaderFlowParam,
        storeCountryCode: String): NavDirections =
        ActionCardReaderOnboardingFragmentToCardReaderHubFragment(cardReaderFlowParam,
        storeCountryCode)

    public
        fun actionCardReaderOnboardingFragmentToCardReaderConnectDialogFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections =
        ActionCardReaderOnboardingFragmentToCardReaderConnectDialogFragment(cardReaderFlowParam)
  }
}
