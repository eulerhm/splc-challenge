package com.woocommerce.android.ui.cardreader.connect

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CardReaderConnectDialogFragmentArgs(
  public val cardReaderFlowParam: CardReaderFlowParam
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam::class.java)) {
      result.set("cardReaderFlowParam", this.cardReaderFlowParam as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(CardReaderFlowParam::class.java)) {
      result.set("cardReaderFlowParam", this.cardReaderFlowParam as Serializable)
    } else {
      throw UnsupportedOperationException(CardReaderFlowParam::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CardReaderConnectDialogFragmentArgs {
      bundle.setClassLoader(CardReaderConnectDialogFragmentArgs::class.java.classLoader)
      val __cardReaderFlowParam : CardReaderFlowParam?
      if (bundle.containsKey("cardReaderFlowParam")) {
        if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam::class.java) ||
            Serializable::class.java.isAssignableFrom(CardReaderFlowParam::class.java)) {
          __cardReaderFlowParam = bundle.get("cardReaderFlowParam") as CardReaderFlowParam?
        } else {
          throw UnsupportedOperationException(CardReaderFlowParam::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__cardReaderFlowParam == null) {
          throw IllegalArgumentException("Argument \"cardReaderFlowParam\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"cardReaderFlowParam\" is missing and does not have an android:defaultValue")
      }
      return CardReaderConnectDialogFragmentArgs(__cardReaderFlowParam)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        CardReaderConnectDialogFragmentArgs {
      val __cardReaderFlowParam : CardReaderFlowParam?
      if (savedStateHandle.contains("cardReaderFlowParam")) {
        if (Parcelable::class.java.isAssignableFrom(CardReaderFlowParam::class.java) ||
            Serializable::class.java.isAssignableFrom(CardReaderFlowParam::class.java)) {
          __cardReaderFlowParam = savedStateHandle.get<CardReaderFlowParam?>("cardReaderFlowParam")
        } else {
          throw UnsupportedOperationException(CardReaderFlowParam::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__cardReaderFlowParam == null) {
          throw IllegalArgumentException("Argument \"cardReaderFlowParam\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"cardReaderFlowParam\" is missing and does not have an android:defaultValue")
      }
      return CardReaderConnectDialogFragmentArgs(__cardReaderFlowParam)
    }
  }
}
