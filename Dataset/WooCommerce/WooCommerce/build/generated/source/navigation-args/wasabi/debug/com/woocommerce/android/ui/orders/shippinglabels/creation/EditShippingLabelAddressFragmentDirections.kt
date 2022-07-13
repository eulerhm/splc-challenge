package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphOrdersDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.Address
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

public class EditShippingLabelAddressFragmentDirections private constructor() {
  private data class ActionEditShippingLabelAddressFragmentToShippingLabelAddressSuggestionFragment(
    public val enteredAddress: Address,
    public val suggestedAddress: Address,
    public val addressType: ShippingLabelAddressValidator.AddressType
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_editShippingLabelAddressFragment_to_shippingLabelAddressSuggestionFragment

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

  public companion object {
    public fun actionEditShippingLabelAddressFragmentToShippingLabelAddressSuggestionFragment(
      enteredAddress: Address,
      suggestedAddress: Address,
      addressType: ShippingLabelAddressValidator.AddressType
    ): NavDirections =
        ActionEditShippingLabelAddressFragmentToShippingLabelAddressSuggestionFragment(enteredAddress,
        suggestedAddress, addressType)

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
