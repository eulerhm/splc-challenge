package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingsBindingImpl extends FragmentSettingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(1, 
            new String[] {"include_settings_pause_state"},
            new int[] {5},
            new int[] {nl.rijksoverheid.en.R.layout.include_settings_pause_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 6);
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.pause_title, 8);
        sViewsWithIds.put(R.id.pause_description, 9);
        sViewsWithIds.put(R.id.pause_divider, 10);
        sViewsWithIds.put(R.id.wifi_only_summary, 11);
        sViewsWithIds.put(R.id.wifi_only_divider, 12);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener wifiOnlySwitchandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.wifiOnly.getValue()
            //         is viewModel.wifiOnly.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = wifiOnlySwitch.isChecked();
            // localize variables for thread safety
            // viewModel.wifiOnly != null
            boolean viewModelWifiOnlyJavaLangObjectNull = false;
            // viewModel.wifiOnly.getValue()
            java.lang.Boolean viewModelWifiOnlyGetValue = null;
            // viewModel
            nl.rijksoverheid.en.settings.SettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.wifiOnly
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWifiOnly = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelWifiOnly = viewModel.getWifiOnly();

                viewModelWifiOnlyJavaLangObjectNull = (viewModelWifiOnly) != (null);
                if (viewModelWifiOnlyJavaLangObjectNull) {




                    viewModelWifiOnly.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[10]
            , (nl.rijksoverheid.en.databinding.IncludeSettingsPauseStateBinding) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            , (androidx.appcompat.widget.SwitchCompat) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (androidx.appcompat.widget.SwitchCompat) bindings[2]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.pauseState);
        this.useAppInDutchSwitch.setTag(null);
        this.useAppInnDutchSummary.setTag(null);
        this.wifiOnlySwitch.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        pauseState.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (pauseState.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isSystemLanguageDutch == variableId) {
            setIsSystemLanguageDutch((java.lang.Boolean) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((nl.rijksoverheid.en.settings.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsSystemLanguageDutch(@Nullable java.lang.Boolean IsSystemLanguageDutch) {
        this.mIsSystemLanguageDutch = IsSystemLanguageDutch;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isSystemLanguageDutch);
        super.requestRebind();
    }
    public void setViewModel(@Nullable nl.rijksoverheid.en.settings.SettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        pauseState.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePauseState((nl.rijksoverheid.en.databinding.IncludeSettingsPauseStateBinding) object, fieldId);
            case 1 :
                return onChangeViewModelWifiOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePauseState(nl.rijksoverheid.en.databinding.IncludeSettingsPauseStateBinding PauseState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWifiOnly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWifiOnly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxIsSystemLanguageDutch = false;
        java.lang.Boolean viewModelWifiOnlyGetValue = null;
        java.lang.Boolean isSystemLanguageDutch = mIsSystemLanguageDutch;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWifiOnly = null;
        boolean IsSystemLanguageDutch1 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelWifiOnlyGetValue = false;
        nl.rijksoverheid.en.settings.SettingsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x14L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSystemLanguageDutch)
                androidxDatabindingViewDataBindingSafeUnboxIsSystemLanguageDutch = androidx.databinding.ViewDataBinding.safeUnbox(isSystemLanguageDutch);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(isSystemLanguageDutch)
                IsSystemLanguageDutch1 = !androidxDatabindingViewDataBindingSafeUnboxIsSystemLanguageDutch;
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                if (viewModel != null) {
                    // read viewModel.wifiOnly
                    viewModelWifiOnly = viewModel.getWifiOnly();
                }
                updateLiveDataRegistration(1, viewModelWifiOnly);


                if (viewModelWifiOnly != null) {
                    // read viewModel.wifiOnly.getValue()
                    viewModelWifiOnlyGetValue = viewModelWifiOnly.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.wifiOnly.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelWifiOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelWifiOnlyGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.pauseState.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.useAppInDutchSwitch, IsSystemLanguageDutch1, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.useAppInnDutchSummary, IsSystemLanguageDutch1, (boolean)false, (java.lang.Boolean)null);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.wifiOnlySwitch, androidxDatabindingViewDataBindingSafeUnboxViewModelWifiOnlyGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.wifiOnlySwitch, (android.widget.CompoundButton.OnCheckedChangeListener)null, wifiOnlySwitchandroidCheckedAttrChanged);
        }
        executeBindingsOn(pauseState);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pauseState
        flag 1 (0x2L): viewModel.wifiOnly
        flag 2 (0x3L): isSystemLanguageDutch
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}