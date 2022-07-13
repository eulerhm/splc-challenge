package com.woocommerce.android.ui.cardreader.detail

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

public class CardReaderDetailFragmentDirections private constructor() {
  private data class ActionCardReaderDetailFragmentToCardReaderConnectFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderDetailFragment_to_cardReaderConnectFragment

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

  private data class ActionCardReaderDetailFragmentToCardReaderUpdateDialogFragment(
    public val requiredUpdate: Boolean = false
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderDetailFragment_to_cardReaderUpdateDialogFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("requiredUpdate", this.requiredUpdate)
        return result
      }
  }

  public companion object {
    public
        fun actionCardReaderDetailFragmentToCardReaderConnectFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections =
        ActionCardReaderDetailFragmentToCardReaderConnectFragment(cardReaderFlowParam)

    public
        fun actionCardReaderDetailFragmentToCardReaderUpdateDialogFragment(requiredUpdate: Boolean =
        false): NavDirections =
        ActionCardReaderDetailFragmentToCardReaderUpdateDialogFragment(requiredUpdate)
  }
}
