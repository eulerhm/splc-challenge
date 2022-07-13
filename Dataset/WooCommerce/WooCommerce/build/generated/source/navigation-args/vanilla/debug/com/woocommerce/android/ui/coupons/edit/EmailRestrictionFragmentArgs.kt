package com.woocommerce.android.ui.coupons.edit

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.jvm.JvmStatic

public data class EmailRestrictionFragmentArgs(
  public val allowedEmails: Array<String>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putStringArray("allowedEmails", this.allowedEmails)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("allowedEmails", this.allowedEmails)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EmailRestrictionFragmentArgs {
      bundle.setClassLoader(EmailRestrictionFragmentArgs::class.java.classLoader)
      val __allowedEmails : Array<String>?
      if (bundle.containsKey("allowedEmails")) {
        __allowedEmails = bundle.getStringArray("allowedEmails")
        if (__allowedEmails == null) {
          throw IllegalArgumentException("Argument \"allowedEmails\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"allowedEmails\" is missing and does not have an android:defaultValue")
      }
      return EmailRestrictionFragmentArgs(__allowedEmails)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        EmailRestrictionFragmentArgs {
      val __allowedEmails : Array<String>?
      if (savedStateHandle.contains("allowedEmails")) {
        __allowedEmails = savedStateHandle["allowedEmails"]
        if (__allowedEmails == null) {
          throw IllegalArgumentException("Argument \"allowedEmails\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"allowedEmails\" is missing and does not have an android:defaultValue")
      }
      return EmailRestrictionFragmentArgs(__allowedEmails)
    }
  }
}
