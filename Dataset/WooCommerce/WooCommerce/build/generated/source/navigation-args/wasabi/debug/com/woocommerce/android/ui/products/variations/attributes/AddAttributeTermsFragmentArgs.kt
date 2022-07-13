package com.woocommerce.android.ui.products.variations.attributes

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddAttributeTermsFragmentArgs(
  public val attributeId: Long,
  public val attributeName: String,
  public val isNewAttribute: Boolean,
  public val isVariationCreation: Boolean = false
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("attributeId", this.attributeId)
    result.putString("attributeName", this.attributeName)
    result.putBoolean("isNewAttribute", this.isNewAttribute)
    result.putBoolean("isVariationCreation", this.isVariationCreation)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("attributeId", this.attributeId)
    result.set("attributeName", this.attributeName)
    result.set("isNewAttribute", this.isNewAttribute)
    result.set("isVariationCreation", this.isVariationCreation)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddAttributeTermsFragmentArgs {
      bundle.setClassLoader(AddAttributeTermsFragmentArgs::class.java.classLoader)
      val __attributeId : Long
      if (bundle.containsKey("attributeId")) {
        __attributeId = bundle.getLong("attributeId")
      } else {
        throw IllegalArgumentException("Required argument \"attributeId\" is missing and does not have an android:defaultValue")
      }
      val __attributeName : String?
      if (bundle.containsKey("attributeName")) {
        __attributeName = bundle.getString("attributeName")
        if (__attributeName == null) {
          throw IllegalArgumentException("Argument \"attributeName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"attributeName\" is missing and does not have an android:defaultValue")
      }
      val __isNewAttribute : Boolean
      if (bundle.containsKey("isNewAttribute")) {
        __isNewAttribute = bundle.getBoolean("isNewAttribute")
      } else {
        throw IllegalArgumentException("Required argument \"isNewAttribute\" is missing and does not have an android:defaultValue")
      }
      val __isVariationCreation : Boolean
      if (bundle.containsKey("isVariationCreation")) {
        __isVariationCreation = bundle.getBoolean("isVariationCreation")
      } else {
        __isVariationCreation = false
      }
      return AddAttributeTermsFragmentArgs(__attributeId, __attributeName, __isNewAttribute,
          __isVariationCreation)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        AddAttributeTermsFragmentArgs {
      val __attributeId : Long?
      if (savedStateHandle.contains("attributeId")) {
        __attributeId = savedStateHandle["attributeId"]
        if (__attributeId == null) {
          throw IllegalArgumentException("Argument \"attributeId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"attributeId\" is missing and does not have an android:defaultValue")
      }
      val __attributeName : String?
      if (savedStateHandle.contains("attributeName")) {
        __attributeName = savedStateHandle["attributeName"]
        if (__attributeName == null) {
          throw IllegalArgumentException("Argument \"attributeName\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"attributeName\" is missing and does not have an android:defaultValue")
      }
      val __isNewAttribute : Boolean?
      if (savedStateHandle.contains("isNewAttribute")) {
        __isNewAttribute = savedStateHandle["isNewAttribute"]
        if (__isNewAttribute == null) {
          throw IllegalArgumentException("Argument \"isNewAttribute\" of type boolean does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"isNewAttribute\" is missing and does not have an android:defaultValue")
      }
      val __isVariationCreation : Boolean?
      if (savedStateHandle.contains("isVariationCreation")) {
        __isVariationCreation = savedStateHandle["isVariationCreation"]
        if (__isVariationCreation == null) {
          throw IllegalArgumentException("Argument \"isVariationCreation\" of type boolean does not support null values")
        }
      } else {
        __isVariationCreation = false
      }
      return AddAttributeTermsFragmentArgs(__attributeId, __attributeName, __isNewAttribute,
          __isVariationCreation)
    }
  }
}
