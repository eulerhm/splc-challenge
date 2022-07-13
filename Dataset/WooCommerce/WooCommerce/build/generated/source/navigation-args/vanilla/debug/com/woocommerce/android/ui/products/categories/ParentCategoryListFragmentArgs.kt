package com.woocommerce.android.ui.products.categories

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ParentCategoryListFragmentArgs(
  public val selectedParentId: Long = 0L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("selectedParentId", this.selectedParentId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("selectedParentId", this.selectedParentId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ParentCategoryListFragmentArgs {
      bundle.setClassLoader(ParentCategoryListFragmentArgs::class.java.classLoader)
      val __selectedParentId : Long
      if (bundle.containsKey("selectedParentId")) {
        __selectedParentId = bundle.getLong("selectedParentId")
      } else {
        __selectedParentId = 0L
      }
      return ParentCategoryListFragmentArgs(__selectedParentId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ParentCategoryListFragmentArgs {
      val __selectedParentId : Long?
      if (savedStateHandle.contains("selectedParentId")) {
        __selectedParentId = savedStateHandle["selectedParentId"]
        if (__selectedParentId == null) {
          throw IllegalArgumentException("Argument \"selectedParentId\" of type long does not support null values")
        }
      } else {
        __selectedParentId = 0L
      }
      return ParentCategoryListFragmentArgs(__selectedParentId)
    }
  }
}
