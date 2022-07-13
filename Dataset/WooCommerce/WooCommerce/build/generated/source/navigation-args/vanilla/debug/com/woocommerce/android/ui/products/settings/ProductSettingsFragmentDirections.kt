package com.woocommerce.android.ui.products.settings

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.R
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public class ProductSettingsFragmentDirections private constructor() {
  private data class ActionProductSettingsFragmentToProductStatusFragment(
    public val status: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productSettingsFragment_to_productStatusFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("status", this.status)
        return result
      }
  }

  private data class ActionProductSettingsFragmentToProductCatalogVisibilityFragment(
    public val catalogVisibility: String,
    public val featured: Boolean
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productSettingsFragment_to_productCatalogVisibilityFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("catalogVisibility", this.catalogVisibility)
        result.putBoolean("featured", this.featured)
        return result
      }
  }

  private data class ActionProductSettingsFragmentToProductVisibilityFragment(
    public val visibility: String?,
    public val password: String?
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productSettingsFragment_to_productVisibilityFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("visibility", this.visibility)
        result.putString("password", this.password)
        return result
      }
  }

  private data class ActionProductSettingsFragmentToProductSlugFragment(
    public val slug: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_productSettingsFragment_to_productSlugFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("slug", this.slug)
        return result
      }
  }

  private data class ActionProductSettingsFragmentToProductMenuOrderFragment(
    public val menuOrder: Int
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_productSettingsFragment_to_productMenuOrderFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("menuOrder", this.menuOrder)
        return result
      }
  }

  public companion object {
    public fun actionProductSettingsFragmentToProductStatusFragment(status: String): NavDirections =
        ActionProductSettingsFragmentToProductStatusFragment(status)

    public
        fun actionProductSettingsFragmentToProductCatalogVisibilityFragment(catalogVisibility: String,
        featured: Boolean): NavDirections =
        ActionProductSettingsFragmentToProductCatalogVisibilityFragment(catalogVisibility, featured)

    public fun actionProductSettingsFragmentToProductVisibilityFragment(visibility: String?,
        password: String?): NavDirections =
        ActionProductSettingsFragmentToProductVisibilityFragment(visibility, password)

    public fun actionProductSettingsFragmentToProductSlugFragment(slug: String): NavDirections =
        ActionProductSettingsFragmentToProductSlugFragment(slug)

    public fun actionProductSettingsFragmentToAztecEditorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_productSettingsFragment_to_aztecEditorFragment)

    public fun actionProductSettingsFragmentToProductMenuOrderFragment(menuOrder: Int):
        NavDirections = ActionProductSettingsFragmentToProductMenuOrderFragment(menuOrder)
  }
}
