package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.Address
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ShippingLabelAddressSuggestionFragmentArgs(
  public val enteredAddress: Address,
  public val suggestedAddress: Address,
  public val addressType: ShippingLabelAddressValidator.AddressType
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.putParcelable("enteredAddress", this.enteredAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.putSerializable("enteredAddress", this.enteredAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.putParcelable("suggestedAddress", this.suggestedAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.putSerializable("suggestedAddress", this.suggestedAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if
        (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)) {
      result.putParcelable("addressType", this.addressType as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)) {
      result.putSerializable("addressType", this.addressType as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelAddressValidator.AddressType::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("enteredAddress", this.enteredAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("enteredAddress", this.enteredAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("suggestedAddress", this.suggestedAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("suggestedAddress", this.suggestedAddress as Serializable)
    } else {
      throw UnsupportedOperationException(Address::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if
        (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)) {
      result.set("addressType", this.addressType as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)) {
      result.set("addressType", this.addressType as Serializable)
    } else {
      throw UnsupportedOperationException(ShippingLabelAddressValidator.AddressType::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ShippingLabelAddressSuggestionFragmentArgs {
      bundle.setClassLoader(ShippingLabelAddressSuggestionFragmentArgs::class.java.classLoader)
      val __enteredAddress : Address?
      if (bundle.containsKey("enteredAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __enteredAddress = bundle.get("enteredAddress") as Address?
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__enteredAddress == null) {
          throw IllegalArgumentException("Argument \"enteredAddress\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"enteredAddress\" is missing and does not have an android:defaultValue")
      }
      val __suggestedAddress : Address?
      if (bundle.containsKey("suggestedAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __suggestedAddress = bundle.get("suggestedAddress") as Address?
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__suggestedAddress == null) {
          throw IllegalArgumentException("Argument \"suggestedAddress\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"suggestedAddress\" is missing and does not have an android:defaultValue")
      }
      val __addressType : ShippingLabelAddressValidator.AddressType?
      if (bundle.containsKey("addressType")) {
        if
            (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)) {
          __addressType = bundle.get("addressType") as ShippingLabelAddressValidator.AddressType?
        } else {
          throw UnsupportedOperationException(ShippingLabelAddressValidator.AddressType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__addressType == null) {
          throw IllegalArgumentException("Argument \"addressType\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"addressType\" is missing and does not have an android:defaultValue")
      }
      return ShippingLabelAddressSuggestionFragmentArgs(__enteredAddress, __suggestedAddress,
          __addressType)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ShippingLabelAddressSuggestionFragmentArgs {
      val __enteredAddress : Address?
      if (savedStateHandle.contains("enteredAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __enteredAddress = savedStateHandle.get<Address?>("enteredAddress")
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__enteredAddress == null) {
          throw IllegalArgumentException("Argument \"enteredAddress\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"enteredAddress\" is missing and does not have an android:defaultValue")
      }
      val __suggestedAddress : Address?
      if (savedStateHandle.contains("suggestedAddress")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __suggestedAddress = savedStateHandle.get<Address?>("suggestedAddress")
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__suggestedAddress == null) {
          throw IllegalArgumentException("Argument \"suggestedAddress\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"suggestedAddress\" is missing and does not have an android:defaultValue")
      }
      val __addressType : ShippingLabelAddressValidator.AddressType?
      if (savedStateHandle.contains("addressType")) {
        if
            (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.AddressType::class.java)) {
          __addressType =
              savedStateHandle.get<ShippingLabelAddressValidator.AddressType?>("addressType")
        } else {
          throw UnsupportedOperationException(ShippingLabelAddressValidator.AddressType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__addressType == null) {
          throw IllegalArgumentException("Argument \"addressType\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"addressType\" is missing and does not have an android:defaultValue")
      }
      return ShippingLabelAddressSuggestionFragmentArgs(__enteredAddress, __suggestedAddress,
          __addressType)
    }
  }
}
