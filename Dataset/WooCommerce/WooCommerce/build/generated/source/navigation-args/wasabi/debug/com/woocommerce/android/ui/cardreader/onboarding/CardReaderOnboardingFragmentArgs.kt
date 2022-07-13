package com.woocommerce.android.ui.cardreader.onboarding

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CardReaderOnboardingFragmentArgs(
  public val cardReaderOnboardingParam: CardReaderOnboardingParams
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
      result.putParcelable("cardReaderOnboardingParam", this.cardReaderOnboardingParam as
          Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
      result.putSerializable("cardReaderOnboardingParam", this.cardReaderOnboardingParam as
          Serializable)
    } else {
      throw UnsupportedOperationException(CardReaderOnboardingParams::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
      result.set("cardReaderOnboardingParam", this.cardReaderOnboardingParam as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
      result.set("cardReaderOnboardingParam", this.cardReaderOnboardingParam as Serializable)
    } else {
      throw UnsupportedOperationException(CardReaderOnboardingParams::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CardReaderOnboardingFragmentArgs {
      bundle.setClassLoader(CardReaderOnboardingFragmentArgs::class.java.classLoader)
      val __cardReaderOnboardingParam : CardReaderOnboardingParams?
      if (bundle.containsKey("cardReaderOnboardingParam")) {
        if (Parcelable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java) ||
            Serializable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
          __cardReaderOnboardingParam =
              bundle.get("cardReaderOnboardingParam") as CardReaderOnboardingParams?
        } else {
          throw UnsupportedOperationException(CardReaderOnboardingParams::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__cardReaderOnboardingParam == null) {
          throw IllegalArgumentException("Argument \"cardReaderOnboardingParam\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"cardReaderOnboardingParam\" is missing and does not have an android:defaultValue")
      }
      return CardReaderOnboardingFragmentArgs(__cardReaderOnboardingParam)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        CardReaderOnboardingFragmentArgs {
      val __cardReaderOnboardingParam : CardReaderOnboardingParams?
      if (savedStateHandle.contains("cardReaderOnboardingParam")) {
        if (Parcelable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java) ||
            Serializable::class.java.isAssignableFrom(CardReaderOnboardingParams::class.java)) {
          __cardReaderOnboardingParam =
              savedStateHandle.get<CardReaderOnboardingParams?>("cardReaderOnboardingParam")
        } else {
          throw UnsupportedOperationException(CardReaderOnboardingParams::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__cardReaderOnboardingParam == null) {
          throw IllegalArgumentException("Argument \"cardReaderOnboardingParam\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"cardReaderOnboardingParam\" is missing and does not have an android:defaultValue")
      }
      return CardReaderOnboardingFragmentArgs(__cardReaderOnboardingParam)
    }
  }
}
