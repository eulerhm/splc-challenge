package nl.rijksoverheid.en;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nl.rijksoverheid.en.databinding.FragmentAppUpdateRequiredBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentBottomSheetListBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentEnableApiBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentEndOfLifeBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentExplanationBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentGooglePlayServicesUpgradeRequiredBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentInternetRequiredBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentListBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentListWithButtonBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentListWithTwoButtonsBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentLocationServicesRequiredBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentPauseConfirmationBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentPrivacyPolicyConsentBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentSettingsBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentShareBindingImpl;
import nl.rijksoverheid.en.databinding.FragmentStatusBindingImpl;
import nl.rijksoverheid.en.databinding.IncludeEnableApiStepBindingImpl;
import nl.rijksoverheid.en.databinding.IncludeSettingsPauseStateBindingImpl;
import nl.rijksoverheid.en.databinding.ItemBottomSheetBindingImpl;
import nl.rijksoverheid.en.databinding.ItemButtonBindingImpl;
import nl.rijksoverheid.en.databinding.ItemCenteredIllustrationBindingImpl;
import nl.rijksoverheid.en.databinding.ItemErrorBoxBindingImpl;
import nl.rijksoverheid.en.databinding.ItemFaqBindingImpl;
import nl.rijksoverheid.en.databinding.ItemFaqHeaderBindingImpl;
import nl.rijksoverheid.en.databinding.ItemFaqOnboardingBindingImpl;
import nl.rijksoverheid.en.databinding.ItemFaqOnboardingExplanationBindingImpl;
import nl.rijksoverheid.en.databinding.ItemHeaderBindingImpl;
import nl.rijksoverheid.en.databinding.ItemIllustratedBoxBindingImpl;
import nl.rijksoverheid.en.databinding.ItemIllustrationBindingImpl;
import nl.rijksoverheid.en.databinding.ItemInlineIllustrationBindingImpl;
import nl.rijksoverheid.en.databinding.ItemLabTestButtonBindingImpl;
import nl.rijksoverheid.en.databinding.ItemLabTestKeyBindingImpl;
import nl.rijksoverheid.en.databinding.ItemLabTestShareKeysBindingImpl;
import nl.rijksoverheid.en.databinding.ItemLabTestStepBindingImpl;
import nl.rijksoverheid.en.databinding.ItemLabTestStepDescriptionBindingImpl;
import nl.rijksoverheid.en.databinding.ItemLabTestUsedKeyBindingImpl;
import nl.rijksoverheid.en.databinding.ItemLoadingBindingImpl;
import nl.rijksoverheid.en.databinding.ItemMessageBoxBindingImpl;
import nl.rijksoverheid.en.databinding.ItemParagraphBindingImpl;
import nl.rijksoverheid.en.databinding.ItemSpacingBindingImpl;
import nl.rijksoverheid.en.databinding.ItemStatusActionBindingImpl;
import nl.rijksoverheid.en.databinding.ItemStatusBatteryOptimizationEnabledBindingImpl;
import nl.rijksoverheid.en.databinding.ItemStatusErrorBindingImpl;
import nl.rijksoverheid.en.databinding.ItemStatusExposureOver14DaysAgoBindingImpl;
import nl.rijksoverheid.en.databinding.ItemStatusFooterBindingImpl;
import nl.rijksoverheid.en.databinding.ItemStatusHeaderBindingImpl;
import nl.rijksoverheid.en.databinding.ItemStatusPausedBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTAPPUPDATEREQUIRED = 1;

  private static final int LAYOUT_FRAGMENTBOTTOMSHEETLIST = 2;

  private static final int LAYOUT_FRAGMENTENABLEAPI = 3;

  private static final int LAYOUT_FRAGMENTENDOFLIFE = 4;

  private static final int LAYOUT_FRAGMENTEXPLANATION = 5;

  private static final int LAYOUT_FRAGMENTGOOGLEPLAYSERVICESUPGRADEREQUIRED = 6;

  private static final int LAYOUT_FRAGMENTINTERNETREQUIRED = 7;

  private static final int LAYOUT_FRAGMENTLIST = 8;

  private static final int LAYOUT_FRAGMENTLISTWITHBUTTON = 9;

  private static final int LAYOUT_FRAGMENTLISTWITHTWOBUTTONS = 10;

  private static final int LAYOUT_FRAGMENTLOCATIONSERVICESREQUIRED = 11;

  private static final int LAYOUT_FRAGMENTPAUSECONFIRMATION = 12;

  private static final int LAYOUT_FRAGMENTPRIVACYPOLICYCONSENT = 13;

  private static final int LAYOUT_FRAGMENTSETTINGS = 14;

  private static final int LAYOUT_FRAGMENTSHARE = 15;

  private static final int LAYOUT_FRAGMENTSTATUS = 16;

  private static final int LAYOUT_INCLUDEENABLEAPISTEP = 17;

  private static final int LAYOUT_INCLUDESETTINGSPAUSESTATE = 18;

  private static final int LAYOUT_ITEMBOTTOMSHEET = 19;

  private static final int LAYOUT_ITEMBUTTON = 20;

  private static final int LAYOUT_ITEMCENTEREDILLUSTRATION = 21;

  private static final int LAYOUT_ITEMERRORBOX = 22;

  private static final int LAYOUT_ITEMFAQ = 23;

  private static final int LAYOUT_ITEMFAQHEADER = 24;

  private static final int LAYOUT_ITEMFAQONBOARDING = 25;

  private static final int LAYOUT_ITEMFAQONBOARDINGEXPLANATION = 26;

  private static final int LAYOUT_ITEMHEADER = 27;

  private static final int LAYOUT_ITEMILLUSTRATEDBOX = 28;

  private static final int LAYOUT_ITEMILLUSTRATION = 29;

  private static final int LAYOUT_ITEMINLINEILLUSTRATION = 30;

  private static final int LAYOUT_ITEMLABTESTBUTTON = 31;

  private static final int LAYOUT_ITEMLABTESTKEY = 32;

  private static final int LAYOUT_ITEMLABTESTSHAREKEYS = 33;

  private static final int LAYOUT_ITEMLABTESTSTEP = 34;

  private static final int LAYOUT_ITEMLABTESTSTEPDESCRIPTION = 35;

  private static final int LAYOUT_ITEMLABTESTUSEDKEY = 36;

  private static final int LAYOUT_ITEMLOADING = 37;

  private static final int LAYOUT_ITEMMESSAGEBOX = 38;

  private static final int LAYOUT_ITEMPARAGRAPH = 39;

  private static final int LAYOUT_ITEMSPACING = 40;

  private static final int LAYOUT_ITEMSTATUSACTION = 41;

  private static final int LAYOUT_ITEMSTATUSBATTERYOPTIMIZATIONENABLED = 42;

  private static final int LAYOUT_ITEMSTATUSERROR = 43;

  private static final int LAYOUT_ITEMSTATUSEXPOSUREOVER14DAYSAGO = 44;

  private static final int LAYOUT_ITEMSTATUSFOOTER = 45;

  private static final int LAYOUT_ITEMSTATUSHEADER = 46;

  private static final int LAYOUT_ITEMSTATUSPAUSED = 47;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(47);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_app_update_required, LAYOUT_FRAGMENTAPPUPDATEREQUIRED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_bottom_sheet_list, LAYOUT_FRAGMENTBOTTOMSHEETLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_enable_api, LAYOUT_FRAGMENTENABLEAPI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_end_of_life, LAYOUT_FRAGMENTENDOFLIFE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_explanation, LAYOUT_FRAGMENTEXPLANATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_google_play_services_upgrade_required, LAYOUT_FRAGMENTGOOGLEPLAYSERVICESUPGRADEREQUIRED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_internet_required, LAYOUT_FRAGMENTINTERNETREQUIRED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_list, LAYOUT_FRAGMENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_list_with_button, LAYOUT_FRAGMENTLISTWITHBUTTON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_list_with_two_buttons, LAYOUT_FRAGMENTLISTWITHTWOBUTTONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_location_services_required, LAYOUT_FRAGMENTLOCATIONSERVICESREQUIRED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_pause_confirmation, LAYOUT_FRAGMENTPAUSECONFIRMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_privacy_policy_consent, LAYOUT_FRAGMENTPRIVACYPOLICYCONSENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_settings, LAYOUT_FRAGMENTSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_share, LAYOUT_FRAGMENTSHARE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.fragment_status, LAYOUT_FRAGMENTSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.include_enable_api_step, LAYOUT_INCLUDEENABLEAPISTEP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.include_settings_pause_state, LAYOUT_INCLUDESETTINGSPAUSESTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_bottom_sheet, LAYOUT_ITEMBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_button, LAYOUT_ITEMBUTTON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_centered_illustration, LAYOUT_ITEMCENTEREDILLUSTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_error_box, LAYOUT_ITEMERRORBOX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_faq, LAYOUT_ITEMFAQ);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_faq_header, LAYOUT_ITEMFAQHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_faq_onboarding, LAYOUT_ITEMFAQONBOARDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_faq_onboarding_explanation, LAYOUT_ITEMFAQONBOARDINGEXPLANATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_header, LAYOUT_ITEMHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_illustrated_box, LAYOUT_ITEMILLUSTRATEDBOX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_illustration, LAYOUT_ITEMILLUSTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_inline_illustration, LAYOUT_ITEMINLINEILLUSTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_lab_test_button, LAYOUT_ITEMLABTESTBUTTON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_lab_test_key, LAYOUT_ITEMLABTESTKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_lab_test_share_keys, LAYOUT_ITEMLABTESTSHAREKEYS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_lab_test_step, LAYOUT_ITEMLABTESTSTEP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_lab_test_step_description, LAYOUT_ITEMLABTESTSTEPDESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_lab_test_used_key, LAYOUT_ITEMLABTESTUSEDKEY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_loading, LAYOUT_ITEMLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_message_box, LAYOUT_ITEMMESSAGEBOX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_paragraph, LAYOUT_ITEMPARAGRAPH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_spacing, LAYOUT_ITEMSPACING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_status_action, LAYOUT_ITEMSTATUSACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_status_battery_optimization_enabled, LAYOUT_ITEMSTATUSBATTERYOPTIMIZATIONENABLED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_status_error, LAYOUT_ITEMSTATUSERROR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_status_exposure_over_14_days_ago, LAYOUT_ITEMSTATUSEXPOSUREOVER14DAYSAGO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_status_footer, LAYOUT_ITEMSTATUSFOOTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_status_header, LAYOUT_ITEMSTATUSHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(nl.rijksoverheid.en.R.layout.item_status_paused, LAYOUT_ITEMSTATUSPAUSED);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTAPPUPDATEREQUIRED: {
          if ("layout/fragment_app_update_required_0".equals(tag)) {
            return new FragmentAppUpdateRequiredBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_app_update_required is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOTTOMSHEETLIST: {
          if ("layout/fragment_bottom_sheet_list_0".equals(tag)) {
            return new FragmentBottomSheetListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_bottom_sheet_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTENABLEAPI: {
          if ("layout/fragment_enable_api_0".equals(tag)) {
            return new FragmentEnableApiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_enable_api is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTENDOFLIFE: {
          if ("layout/fragment_end_of_life_0".equals(tag)) {
            return new FragmentEndOfLifeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_end_of_life is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXPLANATION: {
          if ("layout/fragment_explanation_0".equals(tag)) {
            return new FragmentExplanationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_explanation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGOOGLEPLAYSERVICESUPGRADEREQUIRED: {
          if ("layout/fragment_google_play_services_upgrade_required_0".equals(tag)) {
            return new FragmentGooglePlayServicesUpgradeRequiredBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_google_play_services_upgrade_required is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINTERNETREQUIRED: {
          if ("layout/fragment_internet_required_0".equals(tag)) {
            return new FragmentInternetRequiredBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_internet_required is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIST: {
          if ("layout/fragment_list_0".equals(tag)) {
            return new FragmentListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLISTWITHBUTTON: {
          if ("layout/fragment_list_with_button_0".equals(tag)) {
            return new FragmentListWithButtonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_with_button is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLISTWITHTWOBUTTONS: {
          if ("layout/fragment_list_with_two_buttons_0".equals(tag)) {
            return new FragmentListWithTwoButtonsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_with_two_buttons is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOCATIONSERVICESREQUIRED: {
          if ("layout/fragment_location_services_required_0".equals(tag)) {
            return new FragmentLocationServicesRequiredBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_location_services_required is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPAUSECONFIRMATION: {
          if ("layout/fragment_pause_confirmation_0".equals(tag)) {
            return new FragmentPauseConfirmationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pause_confirmation is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRIVACYPOLICYCONSENT: {
          if ("layout/fragment_privacy_policy_consent_0".equals(tag)) {
            return new FragmentPrivacyPolicyConsentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_privacy_policy_consent is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTINGS: {
          if ("layout/fragment_settings_0".equals(tag)) {
            return new FragmentSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHARE: {
          if ("layout/fragment_share_0".equals(tag)) {
            return new FragmentShareBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_share is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTATUS: {
          if ("layout/fragment_status_0".equals(tag)) {
            return new FragmentStatusBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_status is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDEENABLEAPISTEP: {
          if ("layout/include_enable_api_step_0".equals(tag)) {
            return new IncludeEnableApiStepBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_enable_api_step is invalid. Received: " + tag);
        }
        case  LAYOUT_INCLUDESETTINGSPAUSESTATE: {
          if ("layout/include_settings_pause_state_0".equals(tag)) {
            return new IncludeSettingsPauseStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for include_settings_pause_state is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBOTTOMSHEET: {
          if ("layout/item_bottom_sheet_0".equals(tag)) {
            return new ItemBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBUTTON: {
          if ("layout/item_button_0".equals(tag)) {
            return new ItemButtonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_button is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCENTEREDILLUSTRATION: {
          if ("layout/item_centered_illustration_0".equals(tag)) {
            return new ItemCenteredIllustrationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_centered_illustration is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMERRORBOX: {
          if ("layout/item_error_box_0".equals(tag)) {
            return new ItemErrorBoxBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_error_box is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAQ: {
          if ("layout/item_faq_0".equals(tag)) {
            return new ItemFaqBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_faq is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAQHEADER: {
          if ("layout/item_faq_header_0".equals(tag)) {
            return new ItemFaqHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_faq_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAQONBOARDING: {
          if ("layout/item_faq_onboarding_0".equals(tag)) {
            return new ItemFaqOnboardingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_faq_onboarding is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAQONBOARDINGEXPLANATION: {
          if ("layout/item_faq_onboarding_explanation_0".equals(tag)) {
            return new ItemFaqOnboardingExplanationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_faq_onboarding_explanation is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHEADER: {
          if ("layout/item_header_0".equals(tag)) {
            return new ItemHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMILLUSTRATEDBOX: {
          if ("layout/item_illustrated_box_0".equals(tag)) {
            return new ItemIllustratedBoxBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_illustrated_box is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMILLUSTRATION: {
          if ("layout/item_illustration_0".equals(tag)) {
            return new ItemIllustrationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_illustration is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMINLINEILLUSTRATION: {
          if ("layout/item_inline_illustration_0".equals(tag)) {
            return new ItemInlineIllustrationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_inline_illustration is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLABTESTBUTTON: {
          if ("layout/item_lab_test_button_0".equals(tag)) {
            return new ItemLabTestButtonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lab_test_button is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLABTESTKEY: {
          if ("layout/item_lab_test_key_0".equals(tag)) {
            return new ItemLabTestKeyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lab_test_key is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLABTESTSHAREKEYS: {
          if ("layout/item_lab_test_share_keys_0".equals(tag)) {
            return new ItemLabTestShareKeysBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lab_test_share_keys is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLABTESTSTEP: {
          if ("layout/item_lab_test_step_0".equals(tag)) {
            return new ItemLabTestStepBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lab_test_step is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLABTESTSTEPDESCRIPTION: {
          if ("layout/item_lab_test_step_description_0".equals(tag)) {
            return new ItemLabTestStepDescriptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lab_test_step_description is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLABTESTUSEDKEY: {
          if ("layout/item_lab_test_used_key_0".equals(tag)) {
            return new ItemLabTestUsedKeyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_lab_test_used_key is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLOADING: {
          if ("layout/item_loading_0".equals(tag)) {
            return new ItemLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMESSAGEBOX: {
          if ("layout/item_message_box_0".equals(tag)) {
            return new ItemMessageBoxBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_message_box is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPARAGRAPH: {
          if ("layout/item_paragraph_0".equals(tag)) {
            return new ItemParagraphBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_paragraph is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSPACING: {
          if ("layout/item_spacing_0".equals(tag)) {
            return new ItemSpacingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_spacing is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSACTION: {
          if ("layout/item_status_action_0".equals(tag)) {
            return new ItemStatusActionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_action is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSBATTERYOPTIMIZATIONENABLED: {
          if ("layout/item_status_battery_optimization_enabled_0".equals(tag)) {
            return new ItemStatusBatteryOptimizationEnabledBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_battery_optimization_enabled is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSERROR: {
          if ("layout/item_status_error_0".equals(tag)) {
            return new ItemStatusErrorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_error is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSEXPOSUREOVER14DAYSAGO: {
          if ("layout/item_status_exposure_over_14_days_ago_0".equals(tag)) {
            return new ItemStatusExposureOver14DaysAgoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_exposure_over_14_days_ago is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSFOOTER: {
          if ("layout/item_status_footer_0".equals(tag)) {
            return new ItemStatusFooterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_footer is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSHEADER: {
          if ("layout/item_status_header_0".equals(tag)) {
            return new ItemStatusHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSPAUSED: {
          if ("layout/item_status_paused_0".equals(tag)) {
            return new ItemStatusPausedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_paused is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(18);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "acceptButtonClickListener");
      sKeys.put(2, "declineButtonClickListener");
      sKeys.put(3, "enableLocationServicesClickListener");
      sKeys.put(4, "explanationClickListener");
      sKeys.put(5, "image");
      sKeys.put(6, "infoIcon");
      sKeys.put(7, "infoSubtitle");
      sKeys.put(8, "infoTitle");
      sKeys.put(9, "isSystemLanguageDutch");
      sKeys.put(10, "itemText");
      sKeys.put(11, "nextButtonClickListener");
      sKeys.put(12, "onboardingViewModel");
      sKeys.put(13, "openSettingsClickListener");
      sKeys.put(14, "shareButtonClickListener");
      sKeys.put(15, "text");
      sKeys.put(16, "viewModel");
      sKeys.put(17, "viewState");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(47);

    static {
      sKeys.put("layout/fragment_app_update_required_0", nl.rijksoverheid.en.R.layout.fragment_app_update_required);
      sKeys.put("layout/fragment_bottom_sheet_list_0", nl.rijksoverheid.en.R.layout.fragment_bottom_sheet_list);
      sKeys.put("layout/fragment_enable_api_0", nl.rijksoverheid.en.R.layout.fragment_enable_api);
      sKeys.put("layout/fragment_end_of_life_0", nl.rijksoverheid.en.R.layout.fragment_end_of_life);
      sKeys.put("layout/fragment_explanation_0", nl.rijksoverheid.en.R.layout.fragment_explanation);
      sKeys.put("layout/fragment_google_play_services_upgrade_required_0", nl.rijksoverheid.en.R.layout.fragment_google_play_services_upgrade_required);
      sKeys.put("layout/fragment_internet_required_0", nl.rijksoverheid.en.R.layout.fragment_internet_required);
      sKeys.put("layout/fragment_list_0", nl.rijksoverheid.en.R.layout.fragment_list);
      sKeys.put("layout/fragment_list_with_button_0", nl.rijksoverheid.en.R.layout.fragment_list_with_button);
      sKeys.put("layout/fragment_list_with_two_buttons_0", nl.rijksoverheid.en.R.layout.fragment_list_with_two_buttons);
      sKeys.put("layout/fragment_location_services_required_0", nl.rijksoverheid.en.R.layout.fragment_location_services_required);
      sKeys.put("layout/fragment_pause_confirmation_0", nl.rijksoverheid.en.R.layout.fragment_pause_confirmation);
      sKeys.put("layout/fragment_privacy_policy_consent_0", nl.rijksoverheid.en.R.layout.fragment_privacy_policy_consent);
      sKeys.put("layout/fragment_settings_0", nl.rijksoverheid.en.R.layout.fragment_settings);
      sKeys.put("layout/fragment_share_0", nl.rijksoverheid.en.R.layout.fragment_share);
      sKeys.put("layout/fragment_status_0", nl.rijksoverheid.en.R.layout.fragment_status);
      sKeys.put("layout/include_enable_api_step_0", nl.rijksoverheid.en.R.layout.include_enable_api_step);
      sKeys.put("layout/include_settings_pause_state_0", nl.rijksoverheid.en.R.layout.include_settings_pause_state);
      sKeys.put("layout/item_bottom_sheet_0", nl.rijksoverheid.en.R.layout.item_bottom_sheet);
      sKeys.put("layout/item_button_0", nl.rijksoverheid.en.R.layout.item_button);
      sKeys.put("layout/item_centered_illustration_0", nl.rijksoverheid.en.R.layout.item_centered_illustration);
      sKeys.put("layout/item_error_box_0", nl.rijksoverheid.en.R.layout.item_error_box);
      sKeys.put("layout/item_faq_0", nl.rijksoverheid.en.R.layout.item_faq);
      sKeys.put("layout/item_faq_header_0", nl.rijksoverheid.en.R.layout.item_faq_header);
      sKeys.put("layout/item_faq_onboarding_0", nl.rijksoverheid.en.R.layout.item_faq_onboarding);
      sKeys.put("layout/item_faq_onboarding_explanation_0", nl.rijksoverheid.en.R.layout.item_faq_onboarding_explanation);
      sKeys.put("layout/item_header_0", nl.rijksoverheid.en.R.layout.item_header);
      sKeys.put("layout/item_illustrated_box_0", nl.rijksoverheid.en.R.layout.item_illustrated_box);
      sKeys.put("layout/item_illustration_0", nl.rijksoverheid.en.R.layout.item_illustration);
      sKeys.put("layout/item_inline_illustration_0", nl.rijksoverheid.en.R.layout.item_inline_illustration);
      sKeys.put("layout/item_lab_test_button_0", nl.rijksoverheid.en.R.layout.item_lab_test_button);
      sKeys.put("layout/item_lab_test_key_0", nl.rijksoverheid.en.R.layout.item_lab_test_key);
      sKeys.put("layout/item_lab_test_share_keys_0", nl.rijksoverheid.en.R.layout.item_lab_test_share_keys);
      sKeys.put("layout/item_lab_test_step_0", nl.rijksoverheid.en.R.layout.item_lab_test_step);
      sKeys.put("layout/item_lab_test_step_description_0", nl.rijksoverheid.en.R.layout.item_lab_test_step_description);
      sKeys.put("layout/item_lab_test_used_key_0", nl.rijksoverheid.en.R.layout.item_lab_test_used_key);
      sKeys.put("layout/item_loading_0", nl.rijksoverheid.en.R.layout.item_loading);
      sKeys.put("layout/item_message_box_0", nl.rijksoverheid.en.R.layout.item_message_box);
      sKeys.put("layout/item_paragraph_0", nl.rijksoverheid.en.R.layout.item_paragraph);
      sKeys.put("layout/item_spacing_0", nl.rijksoverheid.en.R.layout.item_spacing);
      sKeys.put("layout/item_status_action_0", nl.rijksoverheid.en.R.layout.item_status_action);
      sKeys.put("layout/item_status_battery_optimization_enabled_0", nl.rijksoverheid.en.R.layout.item_status_battery_optimization_enabled);
      sKeys.put("layout/item_status_error_0", nl.rijksoverheid.en.R.layout.item_status_error);
      sKeys.put("layout/item_status_exposure_over_14_days_ago_0", nl.rijksoverheid.en.R.layout.item_status_exposure_over_14_days_ago);
      sKeys.put("layout/item_status_footer_0", nl.rijksoverheid.en.R.layout.item_status_footer);
      sKeys.put("layout/item_status_header_0", nl.rijksoverheid.en.R.layout.item_status_header);
      sKeys.put("layout/item_status_paused_0", nl.rijksoverheid.en.R.layout.item_status_paused);
    }
  }
}
