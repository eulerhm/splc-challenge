package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPauseConfirmationBindingImpl extends FragmentPauseConfirmationBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 4);
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.pause_title, 6);
        sViewsWithIds.put(R.id.pause_description, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPauseConfirmationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentPauseConfirmationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.CheckBox) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            );
        this.acceptButton.setTag(null);
        this.declineButton.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.skipConfirmationCheckbox.setTag(null);
        setRootTag(root);
        // listeners
        mCallback18 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.declineButtonClickListener == variableId) {
            setDeclineButtonClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.acceptButtonClickListener == variableId) {
            setAcceptButtonClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((nl.rijksoverheid.en.settings.PauseConfirmationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDeclineButtonClickListener(@Nullable android.view.View.OnClickListener DeclineButtonClickListener) {
        this.mDeclineButtonClickListener = DeclineButtonClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.declineButtonClickListener);
        super.requestRebind();
    }
    public void setAcceptButtonClickListener(@Nullable android.view.View.OnClickListener AcceptButtonClickListener) {
        this.mAcceptButtonClickListener = AcceptButtonClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.acceptButtonClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable nl.rijksoverheid.en.settings.PauseConfirmationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSkipConfirmation((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSkipConfirmation(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelSkipConfirmation, int fieldId) {
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
        java.lang.Boolean viewModelSkipConfirmationGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSkipConfirmationGetValue = false;
        android.view.View.OnClickListener declineButtonClickListener = mDeclineButtonClickListener;
        android.view.View.OnClickListener acceptButtonClickListener = mAcceptButtonClickListener;
        nl.rijksoverheid.en.settings.PauseConfirmationViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelSkipConfirmation = null;

        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.skipConfirmation
                    viewModelSkipConfirmation = viewModel.getSkipConfirmation();
                }
                updateLiveDataRegistration(0, viewModelSkipConfirmation);


                if (viewModelSkipConfirmation != null) {
                    // read viewModel.skipConfirmation.getValue()
                    viewModelSkipConfirmationGetValue = viewModelSkipConfirmation.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.skipConfirmation.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelSkipConfirmationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSkipConfirmationGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.acceptButton.setOnClickListener(acceptButtonClickListener);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.declineButton.setOnClickListener(declineButtonClickListener);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.skipConfirmationCheckbox, androidxDatabindingViewDataBindingSafeUnboxViewModelSkipConfirmationGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.skipConfirmationCheckbox.setOnClickListener(mCallback18);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        nl.rijksoverheid.en.settings.PauseConfirmationViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.toggleDontAskForConfirmation();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.skipConfirmation
        flag 1 (0x2L): declineButtonClickListener
        flag 2 (0x3L): acceptButtonClickListener
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}