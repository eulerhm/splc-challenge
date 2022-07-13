package com.woocommerce.android.ui.jetpack

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.woocommerce.android.R

public class JetpackBenefitsDialogDirections private constructor() {
  public companion object {
    public fun actionJetpackBenefitsDialogToJetpackInstallStartDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.action_jetpackBenefitsDialog_to_jetpackInstallStartDialog)
  }
}
