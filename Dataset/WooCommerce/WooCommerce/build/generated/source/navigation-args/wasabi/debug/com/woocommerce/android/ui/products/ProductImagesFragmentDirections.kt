package com.woocommerce.android.ui.products

import androidx.navigation.NavDirections
import com.woocommerce.android.NavGraphImageGalleryDirections
import kotlin.Boolean
import kotlin.Long

public class ProductImagesFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalProductImageViewerFragment(mediaId: Long, isDeletingAllowed: Boolean =
        true): NavDirections =
        NavGraphImageGalleryDirections.actionGlobalProductImageViewerFragment(mediaId,
        isDeletingAllowed)
  }
}
