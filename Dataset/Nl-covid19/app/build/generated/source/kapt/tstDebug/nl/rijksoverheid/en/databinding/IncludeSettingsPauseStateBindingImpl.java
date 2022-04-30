package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeSettingsPauseStateBindingImpl extends IncludeSettingsPauseStateBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.info_box_image, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeSettingsPauseStateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private IncludeSettingsPauseStateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.pauseStatus.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
        mCallback6 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((nl.rijksoverheid.en.settings.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable nl.rijksoverheid.en.settings.SettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPausedState((androidx.lifecycle.LiveData<nl.rijksoverheid.en.settings.Settings.PausedState.Paused>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPausedState(androidx.lifecycle.LiveData<nl.rijksoverheid.en.settings.Settings.PausedState.Paused> ViewModelPausedState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean viewModelPausedStateJavaLangObjectNull = false;
        boolean ViewModelPausedStateJavaLangObjectNull1 = false;
        androidx.lifecycle.LiveData<nl.rijksoverheid.en.settings.Settings.PausedState.Paused> viewModelPausedState = null;
        java.time.LocalDateTime viewModelPausedStatePausedUntil = null;
        nl.rijksoverheid.en.settings.Settings.PausedState.Paused viewModelPausedStateGetValue = null;
        nl.rijksoverheid.en.settings.SettingsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.pausedState
                    viewModelPausedState = viewModel.getPausedState();
                }
                updateLiveDataRegistration(0, viewModelPausedState);


                if (viewModelPausedState != null) {
                    // read viewModel.pausedState.getValue()
                    viewModelPausedStateGetValue = viewModelPausedState.getValue();
                }


                // read viewModel.pausedState.getValue() == null
                viewModelPausedStateJavaLangObjectNull = (viewModelPausedStateGetValue) == (null);
                // read viewModel.pausedState.getValue() != null
                ViewModelPausedStateJavaLangObjectNull1 = (viewModelPausedStateGetValue) != (null);
                if (viewModelPausedStateGetValue != null) {
                    // read viewModel.pausedState.getValue().pausedUntil
                    viewModelPausedStatePausedUntil = viewModelPausedStateGetValue.getPausedUntil();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback5);
            this.mboundView4.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView1, viewModelPausedStateJavaLangObjectNull, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.bindPausedState(this.mboundView3, viewModelPausedStatePausedUntil);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView4, ViewModelPausedStateJavaLangObjectNull1, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.pauseStatus, ViewModelPausedStateJavaLangObjectNull1, (boolean)false, (java.lang.Boolean)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                nl.rijksoverheid.en.settings.SettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.requestPauseExposureNotifications();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                nl.rijksoverheid.en.settings.SettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.enableExposureNotifications();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.pausedState
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}