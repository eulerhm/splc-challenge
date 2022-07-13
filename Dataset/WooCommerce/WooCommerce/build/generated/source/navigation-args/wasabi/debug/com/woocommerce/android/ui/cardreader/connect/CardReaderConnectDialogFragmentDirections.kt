package com.woocommerce.android.ui.cardreader.connect

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

public class CardReaderConnectDialogFragmentDirections private constructor() {
  private data class ActionCardReaderConnectDialogFragmentToCardReaderTutorialDialogFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderConnectDialogFragment_to_cardReaderTutorialDialogFragment

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

  private data class ActionCardReaderConnectDialogFragmentToCardReaderUpdateDialogFragment(
    public val requiredUpdate: Boolean = false
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderConnectDialogFragment_to_cardReaderUpdateDialogFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("requiredUpdate", this.requiredUpdate)
        return result
      }
  }

  public companion object {
    public
        fun actionCardReaderConnectDialogFragmentToCardReaderTutorialDialogFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections =
        ActionCardReaderConnectDialogFragmentToCardReaderTutorialDialogFragment(cardReaderFlowParam)

    public
        fun actionCardReaderConnectDialogFragmentToCardReaderUpdateDialogFragment(requiredUpdate: Boolean
        = false): NavDirections =
        ActionCardReaderConnectDialogFragmentToCardReaderUpdateDialogFragment(requiredUpdate)
  }
}
