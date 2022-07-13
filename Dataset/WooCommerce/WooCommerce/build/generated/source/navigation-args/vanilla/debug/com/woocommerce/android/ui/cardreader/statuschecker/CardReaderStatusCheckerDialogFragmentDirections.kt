package com.woocommerce.android.ui.cardreader.statuschecker

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingParams
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CardReaderStatusCheckerDialogFragmentDirections private constructor() {
  private data class ActionCardReaderStatusCheckerDialogFragmentToCardReaderWelcomeDialogFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderStatusCheckerDialogFragment_to_cardReaderWelcomeDialogFragment

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

  private data class ActionCardReaderStatusCheckerDialogFragmentToCardReaderOnboardingFragment(
    public val cardReaderOnboardingParam: CardReaderOnboardingParams
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderStatusCheckerDialogFragment_to_cardReaderOnboardingFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
          result.putParcelable("cardReaderOnboardingParam", this.cardReaderOnboardingParam as
              Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
          result.putSerializable("cardReaderOnboardingParam", this.cardReaderOnboardingParam as
              Serializable)
        } else {
          throw UnsupportedOperationException(CardReaderOnboardingParams::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ActionCardReaderStatusCheckerDialogFragmentToCardReaderTutorialDialogFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderStatusCheckerDialogFragment_to_cardReaderTutorialDialogFragment

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

  private data class ActionCardReaderStatusCheckerDialogFragmentToCardReaderConnectDialogFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderStatusCheckerDialogFragment_to_cardReaderConnectDialogFragment

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
        fun actionCardReaderStatusCheckerDialogFragmentToCardReaderWelcomeDialogFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections =
        ActionCardReaderStatusCheckerDialogFragmentToCardReaderWelcomeDialogFragment(cardReaderFlowParam)

    public
        fun actionCardReaderStatusCheckerDialogFragmentToCardReaderOnboardingFragment(cardReaderOnboardingParam: CardReaderOnboardingParams):
        NavDirections =
        ActionCardReaderStatusCheckerDialogFragmentToCardReaderOnboardingFragment(cardReaderOnboardingParam)

    public
        fun actionCardReaderStatusCheckerDialogFragmentToCardReaderTutorialDialogFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections =
        ActionCardReaderStatusCheckerDialogFragmentToCardReaderTutorialDialogFragment(cardReaderFlowParam)

    public
        fun actionCardReaderStatusCheckerDialogFragmentToCardReaderConnectDialogFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections =
        ActionCardReaderStatusCheckerDialogFragmentToCardReaderConnectDialogFragment(cardReaderFlowParam)
  }
}
