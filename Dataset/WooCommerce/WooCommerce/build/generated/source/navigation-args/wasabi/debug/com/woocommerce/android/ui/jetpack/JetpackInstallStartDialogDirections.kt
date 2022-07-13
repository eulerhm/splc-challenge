package com.woocommerce.android.ui.jetpack

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.R

public class JetpackInstallStartDialogDirections private constructor() {
  public companion object {
    public fun actionJetpackInstallStartDialogToJetpackInstallProgressDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.action_jetpackInstallStartDialog_to_jetpackInstallProgressDialog)
  }
}
