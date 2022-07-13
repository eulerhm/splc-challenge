package com.woocommerce.android

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.Long

public class NavGraphImageGalleryDirections private constructor() {
  private data class ActionGlobalProductImageViewerFragment(
    public val mediaId: Long,
    public val isDeletingAllowed: Boolean = true
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_productImageViewerFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("isDeletingAllowed", this.isDeletingAllowed)
        result.putLong("mediaId", this.mediaId)
        return result
      }
  }

  public companion object {
    public fun actionGlobalProductImageViewerFragment(mediaId: Long, isDeletingAllowed: Boolean =
        true): NavDirections = ActionGlobalProductImageViewerFragment(mediaId, isDeletingAllowed)
  }
}
