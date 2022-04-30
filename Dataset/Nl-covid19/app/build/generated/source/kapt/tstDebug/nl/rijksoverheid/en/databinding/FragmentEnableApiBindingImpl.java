package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEnableApiBindingImpl extends FragmentEnableApiBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 6);
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.scroll_container, 8);
        sViewsWithIds.put(R.id.headline, 9);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEnableApiBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentEnableApiBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.Button) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (android.widget.Button) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            );
        this.description.setTag(null);
        this.explanation.setTag(null);
        this.illustration.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.request.setTag(null);
        this.skip.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
        mCallback20 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.onboardingViewModel == variableId) {
            setOnboardingViewModel((nl.rijksoverheid.en.onboarding.OnboardingViewModel) variable);
        }
        else if (BR.explanationClickListener == variableId) {
            setExplanationClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((nl.rijksoverheid.en.ExposureNotificationsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnboardingViewModel(@Nullable nl.rijksoverheid.en.onboarding.OnboardingViewModel OnboardingViewModel) {
        this.mOnboardingViewModel = OnboardingViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.onboardingViewModel);
        super.requestRebind();
    }
    public void setExplanationClickListener(@Nullable android.view.View.OnClickListener ExplanationClickListener) {
        this.mExplanationClickListener = ExplanationClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.explanationClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable nl.rijksoverheid.en.ExposureNotificationsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean viewModelLocationPreconditionSatisfied = false;
        java.lang.String viewModelLocationPreconditionSatisfiedDescriptionAndroidStringOnboardingEnableDescriptionDescriptionAndroidStringOnboardingEnableDescriptionLocation = null;
        nl.rijksoverheid.en.onboarding.OnboardingViewModel onboardingViewModel = mOnboardingViewModel;
        android.view.View.OnClickListener explanationClickListener = mExplanationClickListener;
        nl.rijksoverheid.en.ExposureNotificationsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (viewModel != null) {
                    // read viewModel.locationPreconditionSatisfied
                    viewModelLocationPreconditionSatisfied = viewModel.getLocationPreconditionSatisfied();
                }
            if((dirtyFlags & 0xcL) != 0) {
                if(viewModelLocationPreconditionSatisfied) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read viewModel.locationPreconditionSatisfied ? @android:string/onboarding_enable_description : @android:string/onboarding_enable_description_location
                viewModelLocationPreconditionSatisfiedDescriptionAndroidStringOnboardingEnableDescriptionDescriptionAndroidStringOnboardingEnableDescriptionLocation = ((viewModelLocationPreconditionSatisfied) ? (description.getResources().getString(R.string.onboarding_enable_description)) : (description.getResources().getString(R.string.onboarding_enable_description_location)));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.setHtmlText(this.description, viewModelLocationPreconditionSatisfiedDescriptionAndroidStringOnboardingEnableDescriptionDescriptionAndroidStringOnboardingEnableDescriptionLocation);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.explanation.setOnClickListener(explanationClickListener);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.illustration, (java.lang.Boolean)null, (boolean)false, true);
            this.request.setOnClickListener(mCallback20);
            this.skip.setOnClickListener(mCallback19);
        }
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


                    onboardingViewModel.skipConsent();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                nl.rijksoverheid.en.ExposureNotificationsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.requestEnableNotificationsForcingConsent();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): onboardingViewModel
        flag 1 (0x2L): explanationClickListener
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.locationPreconditionSatisfied ? @android:string/onboarding_enable_description : @android:string/onboarding_enable_description_location
        flag 5 (0x6L): viewModel.locationPreconditionSatisfied ? @android:string/onboarding_enable_description : @android:string/onboarding_enable_description_location
    flag mapping end*/
    //end
}