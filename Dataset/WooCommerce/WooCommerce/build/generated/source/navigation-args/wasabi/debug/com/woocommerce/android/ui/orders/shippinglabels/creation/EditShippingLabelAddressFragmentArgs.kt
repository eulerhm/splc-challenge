package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.Address
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class EditShippingLabelAddressFragmentArgs(
  public val address: Address,
  public val addressType: ShippingLabelAddressValidator.AddressType,
  public val validationResult: ShippingLabelAddressValidator.ValidationResult?,
  public val requiresPhoneNumber: Boolean
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.putParcelable("address", this.address as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.putSerializable("address", this.address as Serializable)
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
    if
        (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)) {
      result.putParcelable("validationResult", this.validationResult as Parcelable?)
    } else if
        (Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)) {
      result.putSerializable("validationResult", this.validationResult as Serializable?)
    } else {
      throw UnsupportedOperationException(ShippingLabelAddressValidator.ValidationResult::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putBoolean("requiresPhoneNumber", this.requiresPhoneNumber)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("address", this.address as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
      result.set("address", this.address as Serializable)
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
    if
        (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)) {
      result.set("validationResult", this.validationResult as Parcelable?)
    } else if
        (Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)) {
      result.set("validationResult", this.validationResult as Serializable?)
    } else {
      throw UnsupportedOperationException(ShippingLabelAddressValidator.ValidationResult::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("requiresPhoneNumber", this.requiresPhoneNumber)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EditShippingLabelAddressFragmentArgs {
      bundle.setClassLoader(EditShippingLabelAddressFragmentArgs::class.java.classLoader)
      val __address : Address?
      if (bundle.containsKey("address")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __address = bundle.get("address") as Address?
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__address == null) {
          throw IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue")
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
      val __validationResult : ShippingLabelAddressValidator.ValidationResult?
      if (bundle.containsKey("validationResult")) {
        if
            (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)) {
          __validationResult =
              bundle.get("validationResult") as ShippingLabelAddressValidator.ValidationResult?
        } else {
          throw UnsupportedOperationException(ShippingLabelAddressValidator.ValidationResult::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"validationResult\" is missing and does not have an android:defaultValue")
      }
      val __requiresPhoneNumber : Boolean
      if (bundle.containsKey("requiresPhoneNumber")) {
        __requiresPhoneNumber = bundle.getBoolean("requiresPhoneNumber")
      } else {
        throw IllegalArgumentException("Required argument \"requiresPhoneNumber\" is missing and does not have an android:defaultValue")
      }
      return EditShippingLabelAddressFragmentArgs(__address, __addressType, __validationResult,
          __requiresPhoneNumber)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        EditShippingLabelAddressFragmentArgs {
      val __address : Address?
      if (savedStateHandle.contains("address")) {
        if (Parcelable::class.java.isAssignableFrom(Address::class.java) ||
            Serializable::class.java.isAssignableFrom(Address::class.java)) {
          __address = savedStateHandle.get<Address?>("address")
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__address == null) {
          throw IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue")
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
      val __validationResult : ShippingLabelAddressValidator.ValidationResult?
      if (savedStateHandle.contains("validationResult")) {
        if
            (Parcelable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)
            ||
            Serializable::class.java.isAssignableFrom(ShippingLabelAddressValidator.ValidationResult::class.java)) {
          __validationResult =
              savedStateHandle.get<ShippingLabelAddressValidator.ValidationResult?>("validationResult")
        } else {
          throw UnsupportedOperationException(ShippingLabelAddressValidator.ValidationResult::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"validationResult\" is missing and does not have an android:defaultValue")
      }
      val __requiresPhoneNumber : Boolean?
      if (savedStateHandle.contains("requiresPhoneNumber")) {
        __requiresPhoneNumber = savedStateHandle["requiresPhoneNumber"]
        if (__requiresPhoneNumber == null) {
          throw IllegalArgumentException("Argument \"requiresPhoneNumber\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"requiresPhoneNumber\" is missing and does not have an android:defaultValue")
      }
      return EditShippingLabelAddressFragmentArgs(__address, __addressType, __validationResult,
          __requiresPhoneNumber)
    }
  }
}
