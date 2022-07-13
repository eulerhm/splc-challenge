package com.woocommerce.android.ui.common

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class InfoScreenFragmentArgs(
  public val screenTitle: Int = 0,
  public val heading: Int = 0,
  public val message: Int = 0,
  public val linkTitle: Int = 0,
  public val imageResource: Int = 0,
  public val linkAction: InfoScreenFragment.InfoScreenLinkAction? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("screenTitle", this.screenTitle)
    result.putInt("heading", this.heading)
    result.putInt("message", this.message)
    result.putInt("linkTitle", this.linkTitle)
    result.putInt("imageResource", this.imageResource)
    if
        (Parcelable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
      result.putParcelable("linkAction", this.linkAction as Parcelable?)
    } else if
        (Serializable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
      result.putSerializable("linkAction", this.linkAction as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("screenTitle", this.screenTitle)
    result.set("heading", this.heading)
    result.set("message", this.message)
    result.set("linkTitle", this.linkTitle)
    result.set("imageResource", this.imageResource)
    if
        (Parcelable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
      result.set("linkAction", this.linkAction as Parcelable?)
    } else if
        (Serializable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
      result.set("linkAction", this.linkAction as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): InfoScreenFragmentArgs {
      bundle.setClassLoader(InfoScreenFragmentArgs::class.java.classLoader)
      val __screenTitle : Int
      if (bundle.containsKey("screenTitle")) {
        __screenTitle = bundle.getInt("screenTitle")
      } else {
        __screenTitle = 0
      }
      val __heading : Int
      if (bundle.containsKey("heading")) {
        __heading = bundle.getInt("heading")
      } else {
        __heading = 0
      }
      val __message : Int
      if (bundle.containsKey("message")) {
        __message = bundle.getInt("message")
      } else {
        __message = 0
      }
      val __linkTitle : Int
      if (bundle.containsKey("linkTitle")) {
        __linkTitle = bundle.getInt("linkTitle")
      } else {
        __linkTitle = 0
      }
      val __imageResource : Int
      if (bundle.containsKey("imageResource")) {
        __imageResource = bundle.getInt("imageResource")
      } else {
        __imageResource = 0
      }
      val __linkAction : InfoScreenFragment.InfoScreenLinkAction?
      if (bundle.containsKey("linkAction")) {
        if
            (Parcelable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)
            ||
            Serializable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
          __linkAction = bundle.get("linkAction") as InfoScreenFragment.InfoScreenLinkAction?
        } else {
          throw UnsupportedOperationException(InfoScreenFragment.InfoScreenLinkAction::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __linkAction = null
      }
      return InfoScreenFragmentArgs(__screenTitle, __heading, __message, __linkTitle,
          __imageResource, __linkAction)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): InfoScreenFragmentArgs {
      val __screenTitle : Int?
      if (savedStateHandle.contains("screenTitle")) {
        __screenTitle = savedStateHandle["screenTitle"]
        if (__screenTitle == null) {
          throw IllegalArgumentException("Argument \"screenTitle\" of type integer does not support null values")
        }
      } else {
        __screenTitle = 0
      }
      val __heading : Int?
      if (savedStateHandle.contains("heading")) {
        __heading = savedStateHandle["heading"]
        if (__heading == null) {
          throw IllegalArgumentException("Argument \"heading\" of type integer does not support null values")
        }
      } else {
        __heading = 0
      }
      val __message : Int?
      if (savedStateHandle.contains("message")) {
        __message = savedStateHandle["message"]
        if (__message == null) {
          throw IllegalArgumentException("Argument \"message\" of type integer does not support null values")
        }
      } else {
        __message = 0
      }
      val __linkTitle : Int?
      if (savedStateHandle.contains("linkTitle")) {
        __linkTitle = savedStateHandle["linkTitle"]
        if (__linkTitle == null) {
          throw IllegalArgumentException("Argument \"linkTitle\" of type integer does not support null values")
        }
      } else {
        __linkTitle = 0
      }
      val __imageResource : Int?
      if (savedStateHandle.contains("imageResource")) {
        __imageResource = savedStateHandle["imageResource"]
        if (__imageResource == null) {
          throw IllegalArgumentException("Argument \"imageResource\" of type integer does not support null values")
        }
      } else {
        __imageResource = 0
      }
      val __linkAction : InfoScreenFragment.InfoScreenLinkAction?
      if (savedStateHandle.contains("linkAction")) {
        if
            (Parcelable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)
            ||
            Serializable::class.java.isAssignableFrom(InfoScreenFragment.InfoScreenLinkAction::class.java)) {
          __linkAction =
              savedStateHandle.get<InfoScreenFragment.InfoScreenLinkAction?>("linkAction")
        } else {
          throw UnsupportedOperationException(InfoScreenFragment.InfoScreenLinkAction::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __linkAction = null
      }
      return InfoScreenFragmentArgs(__screenTitle, __heading, __message, __linkTitle,
          __imageResource, __linkAction)
    }
  }
}
