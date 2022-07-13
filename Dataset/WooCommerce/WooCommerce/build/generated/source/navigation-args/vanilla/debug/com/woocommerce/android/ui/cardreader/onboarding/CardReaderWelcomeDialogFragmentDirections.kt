package com.woocommerce.android.ui.cardreader.onboarding

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CardReaderWelcomeDialogFragmentDirections private constructor() {
  private data class ActionCardReaderWelcomeDialogFragmentToCardReaderConnectDialogFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderWelcomeDialogFragment_to_cardReaderConnectDialogFragment

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
        fun actionCardReaderWelcomeDialogFragmentToCardReaderConnectDialogFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections =
        ActionCardReaderWelcomeDialogFragmentToCardReaderConnectDialogFragment(cardReaderFlowParam)
  }
}
