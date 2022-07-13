package com.woocommerce.android.ui.cardreader.hub

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CardReaderHubFragmentDirections private constructor() {
  private data class ActionCardReaderHubFragmentToCardReaderDetailFragment(
    public val cardReaderFlowParam: CardReaderFlowParam
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_cardReaderHubFragment_to_cardReaderDetailFragment

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
        fun actionCardReaderHubFragmentToCardReaderDetailFragment(cardReaderFlowParam: CardReaderFlowParam):
        NavDirections = ActionCardReaderHubFragmentToCardReaderDetailFragment(cardReaderFlowParam)

    public fun actionCardReaderHubFragmentToCardReaderManualsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_cardReaderHubFragment_to_cardReaderManualsFragment)
  }
}
