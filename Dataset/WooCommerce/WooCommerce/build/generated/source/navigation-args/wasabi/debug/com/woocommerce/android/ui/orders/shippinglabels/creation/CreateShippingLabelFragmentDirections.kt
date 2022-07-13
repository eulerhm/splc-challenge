package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphOrdersDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Address
import com.woocommerce.android.model.CustomsPackage
import com.woocommerce.android.model.Order
import com.woocommerce.android.model.ShippingLabelPackage
import com.woocommerce.android.model.ShippingRate
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlin.Suppress

public class CreateShippingLabelFragmentDirections private constructor() {
  private data class ActionCreateShippingLabelFragmentToEditShippingLabelAddressFragment(
    public val address: Address,
    public val addressType: ShippingLabelAddressValidator.AddressType,
    public val validationResult: ShippingLabelAddressValidator.ValidationResult?,
    public val requiresPhoneNumber: Boolean
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_createShippingLabelFragment_to_editShippingLabelAddressFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ActionCreateShippingLabelFragmentToShippingLabelAddressSuggestionFragment(
    public val enteredAddress: Address,
    public val suggestedAddress: Address,
    public val addressType: ShippingLabelAddressValidator.AddressType
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_createShippingLabelFragment_to_shippingLabelAddressSuggestionFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ActionCreateShippingLabelFragmentToEditShippingLabelPackagesFragment(
    public val orderId: Long,
    public val shippingLabelPackages: Array<ShippingLabelPackage>
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_createShippingLabelFragment_to_editShippingLabelPackagesFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putParcelableArray("shippingLabelPackages", this.shippingLabelPackages)
        return result
      }
  }

  private data class ActionCreateShippingLabelFragmentToShippingCarrierRatesFragment(
    public val originAddress: Address,
    public val destinationAddress: Address,
    public val packages: Array<ShippingLabelPackage>,
    public val order: Order,
    public val customsPackages: Array<CustomsPackage>?,
    public val selectedRates: Array<ShippingRate>
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_createShippingLabelFragment_to_shippingCarrierRatesFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
          result.putParcelable("originAddress", this.originAddress as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
          result.putSerializable("originAddress", this.originAddress as Serializable)
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(Address::class.java)) {
          result.putParcelable("destinationAddress", this.destinationAddress as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Address::class.java)) {
          result.putSerializable("destinationAddress", this.destinationAddress as Serializable)
        } else {
          throw UnsupportedOperationException(Address::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putParcelableArray("packages", this.packages)
        if (Parcelable::class.java.isAssignableFrom(Order::class.java)) {
          result.putParcelable("order", this.order as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Order::class.java)) {
          result.putSerializable("order", this.order as Serializable)
        } else {
          throw UnsupportedOperationException(Order::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putParcelableArray("customsPackages", this.customsPackages)
        result.putParcelableArray("selectedRates", this.selectedRates)
        return result
      }
  }

  private data class ActionCreateShippingLabelFragmentToPrintShippingLabelFragment(
    public val shippingLabelIds: LongArray,
    public val orderId: Long = 0L,
    public val isReprint: Boolean = true
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_createShippingLabelFragment_to_printShippingLabelFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("orderId", this.orderId)
        result.putLongArray("shippingLabelIds", this.shippingLabelIds)
        result.putBoolean("isReprint", this.isReprint)
        return result
      }
  }

  private data class ActionCreateShippingLabelFragmentToShippingCustomsFragment(
    public val originCountryCode: String,
    public val destinationCountryCode: String,
    public val shippingPackages: Array<ShippingLabelPackage>,
    public val customsPackages: Array<CustomsPackage>
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_createShippingLabelFragment_to_shippingCustomsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("originCountryCode", this.originCountryCode)
        result.putString("destinationCountryCode", this.destinationCountryCode)
        result.putParcelableArray("shippingPackages", this.shippingPackages)
        result.putParcelableArray("customsPackages", this.customsPackages)
        return result
      }
  }

  public companion object {
    public fun actionCreateShippingLabelFragmentToEditShippingLabelAddressFragment(
      address: Address,
      addressType: ShippingLabelAddressValidator.AddressType,
      validationResult: ShippingLabelAddressValidator.ValidationResult?,
      requiresPhoneNumber: Boolean
    ): NavDirections = ActionCreateShippingLabelFragmentToEditShippingLabelAddressFragment(address,
        addressType, validationResult, requiresPhoneNumber)

    public fun actionCreateShippingLabelFragmentToShippingLabelAddressSuggestionFragment(
      enteredAddress: Address,
      suggestedAddress: Address,
      addressType: ShippingLabelAddressValidator.AddressType
    ): NavDirections =
        ActionCreateShippingLabelFragmentToShippingLabelAddressSuggestionFragment(enteredAddress,
        suggestedAddress, addressType)

    public fun actionCreateShippingLabelFragmentToEditShippingLabelPackagesFragment(orderId: Long,
        shippingLabelPackages: Array<ShippingLabelPackage>): NavDirections =
        ActionCreateShippingLabelFragmentToEditShippingLabelPackagesFragment(orderId,
        shippingLabelPackages)

    public fun actionCreateShippingLabelFragmentToEditShippingLabelPaymentFragment(): NavDirections
        =
        ActionOnlyNavDirections(R.id.action_createShippingLabelFragment_to_editShippingLabelPaymentFragment)

    public fun actionCreateShippingLabelFragmentToShippingCarrierRatesFragment(
      originAddress: Address,
      destinationAddress: Address,
      packages: Array<ShippingLabelPackage>,
      order: Order,
      customsPackages: Array<CustomsPackage>?,
      selectedRates: Array<ShippingRate>
    ): NavDirections =
        ActionCreateShippingLabelFragmentToShippingCarrierRatesFragment(originAddress,
        destinationAddress, packages, order, customsPackages, selectedRates)

    public fun actionCreateShippingLabelFragmentToPrintShippingLabelFragment(
      shippingLabelIds: LongArray,
      orderId: Long = 0L,
      isReprint: Boolean = true
    ): NavDirections =
        ActionCreateShippingLabelFragmentToPrintShippingLabelFragment(shippingLabelIds, orderId,
        isReprint)

    public fun actionCreateShippingLabelFragmentToShippingCustomsFragment(
      originCountryCode: String,
      destinationCountryCode: String,
      shippingPackages: Array<ShippingLabelPackage>,
      customsPackages: Array<CustomsPackage>
    ): NavDirections = ActionCreateShippingLabelFragmentToShippingCustomsFragment(originCountryCode,
        destinationCountryCode, shippingPackages, customsPackages)

    public fun actionGlobalAddOrderShipmentTrackingFragment(
      orderId: Long,
      orderTrackingProvider: String? = "null",
      isCustomProvider: Boolean = false
    ): NavDirections =
        NavGraphOrdersDirections.actionGlobalAddOrderShipmentTrackingFragment(orderId,
        orderTrackingProvider, isCustomProvider)

    public fun actionGlobalItemSelectorDialog(
      selectedItem: String?,
      keys: Array<String>,
      values: Array<String>,
      requestKey: String,
      title: String? = null
    ): NavDirections = NavGraphOrdersDirections.actionGlobalItemSelectorDialog(selectedItem, keys,
        values, requestKey, title)

    public fun actionSearchFilterFragment(
      items: Array<SearchFilterItem>,
      requestKey: String,
      title: String = "\"\"",
      hint: String = "\"\""
    ): NavDirections = NavGraphOrdersDirections.actionSearchFilterFragment(items, requestKey, title,
        hint)
  }
}
