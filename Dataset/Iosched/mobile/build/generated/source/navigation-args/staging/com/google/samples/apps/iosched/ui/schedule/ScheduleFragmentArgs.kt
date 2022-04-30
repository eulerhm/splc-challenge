package com.google.samples.apps.iosched.ui.schedule

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Boolean
import kotlin.jvm.JvmStatic

data class ScheduleFragmentArgs(
  val showMySchedule: Boolean = false,
  val showAllEvents: Boolean = false
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("showMySchedule", this.showMySchedule)
    result.putBoolean("showAllEvents", this.showAllEvents)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ScheduleFragmentArgs {
      bundle.setClassLoader(ScheduleFragmentArgs::class.java.classLoader)
      val __showMySchedule : Boolean
      if (bundle.containsKey("showMySchedule")) {
        __showMySchedule = bundle.getBoolean("showMySchedule")
      } else {
        __showMySchedule = false
      }
      val __showAllEvents : Boolean
      if (bundle.containsKey("showAllEvents")) {
        __showAllEvents = bundle.getBoolean("showAllEvents")
      } else {
        __showAllEvents = false
      }
      return ScheduleFragmentArgs(__showMySchedule, __showAllEvents)
    }
  }
}
