package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPrivacyPolicyConsentBindingImpl extends FragmentPrivacyPolicyConsentBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"include_enable_api_step", "include_enable_api_step", "include_enable_api_step", "include_enable_api_step", "include_enable_api_step", "include_enable_api_step", "include_enable_api_step"},
            new int[] {5, 6, 7, 8, 9, 10, 11},
            new int[] {nl.rijksoverheid.en.R.layout.include_enable_api_step,
                nl.rijksoverheid.en.R.layout.include_enable_api_step,
                nl.rijksoverheid.en.R.layout.include_enable_api_step,
                nl.rijksoverheid.en.R.layout.include_enable_api_step,
                nl.rijksoverheid.en.R.layout.include_enable_api_step,
                nl.rijksoverheid.en.R.layout.include_enable_api_step,
                nl.rijksoverheid.en.R.layout.include_enable_api_step});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 12);
        sViewsWithIds.put(R.id.toolbar, 13);
        sViewsWithIds.put(R.id.scroll_container, 14);
        sViewsWithIds.put(R.id.headline, 15);
        sViewsWithIds.put(R.id.description, 16);
        sViewsWithIds.put(R.id.consent_label, 17);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPrivacyPolicyConsentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentPrivacyPolicyConsentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (com.google.android.material.appbar.AppBarLayout) bindings[12]
            , (nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) bindings[6]
            , (nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) bindings[7]
            , (nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) bindings[8]
            , (nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) bindings[9]
            , (nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) bindings[10]
            , (nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) bindings[11]
            , (android.widget.CheckBox) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.Button) bindings[4]
            , (androidx.core.widget.NestedScrollView) bindings[14]
            , (androidx.appcompat.widget.Toolbar) bindings[13]
            , (nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) bindings[5]
            );
        setContainedBinding(this.check1);
        setContainedBinding(this.check2);
        setContainedBinding(this.check3);
        setContainedBinding(this.check4);
        setContainedBinding(this.check5);
        setContainedBinding(this.check6);
        this.consentCheckbox.setTag(null);
        this.consentContainer.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.next.setTag(null);
        setContainedBinding(this.voluntary);
        setRootTag(root);
        // listeners
        mCallback13 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
        mCallback14 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        voluntary.invalidateAll();
        check1.invalidateAll();
        check2.invalidateAll();
        check3.invalidateAll();
        check4.invalidateAll();
        check5.invalidateAll();
        check6.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (voluntary.hasPendingBindings()) {
            return true;
        }
        if (check1.hasPendingBindings()) {
            return true;
        }
        if (check2.hasPendingBindings()) {
            return true;
        }
        if (check3.hasPendingBindings()) {
            return true;
        }
        if (check4.hasPendingBindings()) {
            return true;
        }
        if (check5.hasPendingBindings()) {
            return true;
        }
        if (check6.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.onboardingViewModel == variableId) {
            setOnboardingViewModel((nl.rijksoverheid.en.onboarding.OnboardingViewModel) variable);
        }
        else if (BR.nextButtonClickListener == variableId) {
            setNextButtonClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnboardingViewModel(@Nullable nl.rijksoverheid.en.onboarding.OnboardingViewModel OnboardingViewModel) {
        this.mOnboardingViewModel = OnboardingViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.onboardingViewModel);
        super.requestRebind();
    }
    public void setNextButtonClickListener(@Nullable android.view.View.OnClickListener NextButtonClickListener) {
        this.mNextButtonClickListener = NextButtonClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.nextButtonClickListener);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        voluntary.setLifecycleOwner(lifecycleOwner);
        check1.setLifecycleOwner(lifecycleOwner);
        check2.setLifecycleOwner(lifecycleOwner);
        check3.setLifecycleOwner(lifecycleOwner);
        check4.setLifecycleOwner(lifecycleOwner);
        check5.setLifecycleOwner(lifecycleOwner);
        check6.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCheck1((nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) object, fieldId);
            case 1 :
                return onChangeCheck3((nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) object, fieldId);
            case 2 :
                return onChangeOnboardingViewModelPrivacyPolicyConsentGiven((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeCheck5((nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) object, fieldId);
            case 4 :
                return onChangeVoluntary((nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) object, fieldId);
            case 5 :
                return onChangeCheck2((nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) object, fieldId);
            case 6 :
                return onChangeCheck4((nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) object, fieldId);
            case 7 :
                return onChangeCheck6((nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCheck1(nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding Check1, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheck3(nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding Check3, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOnboardingViewModelPrivacyPolicyConsentGiven(androidx.lifecycle.LiveData<java.lang.Boolean> OnboardingViewModelPrivacyPolicyConsentGiven, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheck5(nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding Check5, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVoluntary(nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding Voluntary, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheck2(nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding Check2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheck4(nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding Check4, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCheck6(nl.rijksoverheid.en.databinding.IncludeEnableApiStepBinding Check6, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean androidxDatabindingViewDataBindingSafeUnboxOnboardingViewModelPrivacyPolicyConsentGivenGetValue = false;
        nl.rijksoverheid.en.onboarding.OnboardingViewModel onboardingViewModel = mOnboardingViewModel;
        java.lang.Boolean onboardingViewModelPrivacyPolicyConsentGivenGetValue = null;
        android.view.View.OnClickListener nextButtonClickListener = mNextButtonClickListener;
        androidx.lifecycle.LiveData<java.lang.Boolean> onboardingViewModelPrivacyPolicyConsentGiven = null;

        if ((dirtyFlags & 0x504L) != 0) {



                if (onboardingViewModel != null) {
                    // read onboardingViewModel.privacyPolicyConsentGiven
                    onboardingViewModelPrivacyPolicyConsentGiven = onboardingViewModel.getPrivacyPolicyConsentGiven();
                }
                updateLiveDataRegistration(2, onboardingViewModelPrivacyPolicyConsentGiven);


                if (onboardingViewModelPrivacyPolicyConsentGiven != null) {
                    // read onboardingViewModel.privacyPolicyConsentGiven.getValue()
                    onboardingViewModelPrivacyPolicyConsentGivenGetValue = onboardingViewModelPrivacyPolicyConsentGiven.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(onboardingViewModel.privacyPolicyConsentGiven.getValue())
                androidxDatabindingViewDataBindingSafeUnboxOnboardingViewModelPrivacyPolicyConsentGivenGetValue = androidx.databinding.ViewDataBinding.safeUnbox(onboardingViewModelPrivacyPolicyConsentGivenGetValue);
        }
        if ((dirtyFlags & 0x600L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.check1.setImage(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_shield_bluetooth));
            this.check1.setItemText(getRoot().getResources().getString(R.string.onboarding_privacy_policy_bt_keys));
            this.check2.setImage(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_shield_bluetooth));
            this.check2.setItemText(getRoot().getResources().getString(R.string.onboarding_privacy_policy_retention));
            this.check3.setImage(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_shield_bluetooth));
            this.check3.setItemText(getRoot().getResources().getString(R.string.onboarding_privacy_policy_data_removal));
            this.check4.setImage(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_shield_lock));
            this.check4.setItemText(getRoot().getResources().getString(R.string.onboarding_privacy_policy_identity));
            this.check5.setImage(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_shield_lock));
            this.check5.setItemText(getRoot().getResources().getString(R.string.onboarding_privacy_policy_location));
            this.check6.setImage(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_shield_bell));
            this.check6.setItemText(getRoot().getResources().getString(R.string.onboarding_privacy_policy_send_alert));
            this.consentCheckbox.setOnClickListener(mCallback14);
            this.consentContainer.setOnClickListener(mCallback13);
            this.voluntary.setImage(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_shield_privacy));
            this.voluntary.setItemText(getRoot().getResources().getString(R.string.onboarding_privacy_policy_voluntary));
        }
        if ((dirtyFlags & 0x504L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.consentCheckbox, androidxDatabindingViewDataBindingSafeUnboxOnboardingViewModelPrivacyPolicyConsentGivenGetValue);
            this.next.setEnabled(androidxDatabindingViewDataBindingSafeUnboxOnboardingViewModelPrivacyPolicyConsentGivenGetValue);
        }
        if ((dirtyFlags & 0x600L) != 0) {
            // api target 1

            this.next.setOnClickListener(nextButtonClickListener);
        }
        executeBindingsOn(voluntary);
        executeBindingsOn(check1);
        executeBindingsOn(check2);
        executeBindingsOn(check3);
        executeBindingsOn(check4);
        executeBindingsOn(check5);
        executeBindingsOn(check6);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // onboardingViewModel != null
                boolean onboardingViewModelJavaLangObjectNull = false;
                // onboardingViewModel
                nl.rijksoverheid.en.onboarding.OnboardingViewModel onboardingViewModel = mOnboardingViewModel;



                onboardingViewModelJavaLangObjectNull = (onboardingViewModel) != (null);
                if (onboardingViewModelJavaLangObjectNull) {


                    onboardingViewModel.togglePrivacyPolicyConsent();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // onboardingViewModel != null
                boolean onboardingViewModelJavaLangObjectNull = false;
                // onboardingViewModel
                nl.rijksoverheid.en.onboarding.OnboardingViewModel onboardingViewModel = mOnboardingViewModel;



                onboardingViewModelJavaLangObjectNull = (onboardingViewModel) != (null);
                if (onboardingViewModelJavaLangObjectNull) {


                    onboardingViewModel.togglePrivacyPolicyConsent();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): check1
        flag 1 (0x2L): check3
        flag 2 (0x3L): onboardingViewModel.privacyPolicyConsentGiven
        flag 3 (0x4L): check5
        flag 4 (0x5L): voluntary
        flag 5 (0x6L): check2
        flag 6 (0x7L): check4
        flag 7 (0x8L): check6
        flag 8 (0x9L): onboardingViewModel
        flag 9 (0xaL): nextButtonClickListener
        flag 10 (0xbL): null
    flag mapping end*/
    //end
}