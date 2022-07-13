package com.woocommerce.android.ui.orders.shippinglabels.creation

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphOrdersDirections
import com.woocommerce.android.R
import com.woocommerce.android.model.ShippingLabelPackage
import com.woocommerce.android.ui.searchfilter.SearchFilterItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

public class EditShippingLabelPackagesFragmentDirections private constructor() {
  private data class ActionEditShippingLabelPackagesFragmentToShippingPackageSelectorFragment(
    public val position: Int
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_editShippingLabelPackagesFragment_to_shippingPackageSelectorFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("position", this.position)
        return result
      }
  }

  private data class ActionEditShippingLabelPackagesFragmentToMoveShippingItemDialog(
    public val item: ShippingLabelPackage.Item,
    public val currentPackage: ShippingLabelPackage,
    public val packagesList: Array<ShippingLabelPackage>
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_editShippingLabelPackagesFragment_to_moveShippingItemDialog

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
          result.putParcelable("item", this.item as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(ShippingLabelPackage.Item::class.java)) {
          result.putSerializable("item", this.item as Serializable)
        } else {
          throw UnsupportedOperationException(ShippingLabelPackage.Item::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
          result.putParcelable("currentPackage", this.currentPackage as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(ShippingLabelPackage::class.java)) {
          result.putSerializable("currentPackage", this.currentPackage as Serializable)
        } else {
          throw UnsupportedOperationException(ShippingLabelPackage::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putParcelableArray("packagesList", this.packagesList)
        return result
      }
  }

  private data class ActionEditShippingLabelPackagesFragmentToShippingLabelCreatePackageFragment(
    public val position: Int
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_editShippingLabelPackagesFragment_to_shippingLabelCreatePackageFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("position", this.position)
        return result
      }
  }

  public companion object {
    public
        fun actionEditShippingLabelPackagesFragmentToShippingPackageSelectorFragment(position: Int):
        NavDirections =
        ActionEditShippingLabelPackagesFragmentToShippingPackageSelectorFragment(position)

    public fun actionEditShippingLabelPackagesFragmentToMoveShippingItemDialog(
      item: ShippingLabelPackage.Item,
      currentPackage: ShippingLabelPackage,
      packagesList: Array<ShippingLabelPackage>
    ): NavDirections = ActionEditShippingLabelPackagesFragmentToMoveShippingItemDialog(item,
        currentPackage, packagesList)

    public
        fun actionEditShippingLabelPackagesFragmentToShippingLabelCreatePackageFragment(position: Int):
        NavDirections =
        ActionEditShippingLabelPackagesFragmentToShippingLabelCreatePackageFragment(position)

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
