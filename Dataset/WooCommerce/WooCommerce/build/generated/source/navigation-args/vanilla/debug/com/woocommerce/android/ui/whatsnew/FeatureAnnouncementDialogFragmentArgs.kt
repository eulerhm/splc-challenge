package com.woocommerce.android.ui.whatsnew

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.woocommerce.android.model.FeatureAnnouncement
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class FeatureAnnouncementDialogFragmentArgs(
  public val announcement: FeatureAnnouncement
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
      result.putParcelable("announcement", this.announcement as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
      result.putSerializable("announcement", this.announcement as Serializable)
    } else {
      throw UnsupportedOperationException(FeatureAnnouncement::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
      result.set("announcement", this.announcement as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
      result.set("announcement", this.announcement as Serializable)
    } else {
      throw UnsupportedOperationException(FeatureAnnouncement::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FeatureAnnouncementDialogFragmentArgs {
      bundle.setClassLoader(FeatureAnnouncementDialogFragmentArgs::class.java.classLoader)
      val __announcement : FeatureAnnouncement?
      if (bundle.containsKey("announcement")) {
        if (Parcelable::class.java.isAssignableFrom(FeatureAnnouncement::class.java) ||
            Serializable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
          __announcement = bundle.get("announcement") as FeatureAnnouncement?
        } else {
          throw UnsupportedOperationException(FeatureAnnouncement::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__announcement == null) {
          throw IllegalArgumentException("Argument \"announcement\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"announcement\" is missing and does not have an android:defaultValue")
      }
      return FeatureAnnouncementDialogFragmentArgs(__announcement)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        FeatureAnnouncementDialogFragmentArgs {
      val __announcement : FeatureAnnouncement?
      if (savedStateHandle.contains("announcement")) {
        if (Parcelable::class.java.isAssignableFrom(FeatureAnnouncement::class.java) ||
            Serializable::class.java.isAssignableFrom(FeatureAnnouncement::class.java)) {
          __announcement = savedStateHandle.get<FeatureAnnouncement?>("announcement")
        } else {
          throw UnsupportedOperationException(FeatureAnnouncement::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__announcement == null) {
          throw IllegalArgumentException("Argument \"announcement\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"announcement\" is missing and does not have an android:defaultValue")
      }
      return FeatureAnnouncementDialogFragmentArgs(__announcement)
    }
  }
}
