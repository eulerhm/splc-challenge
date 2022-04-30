package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLabTestShareKeysBindingImpl extends ItemLabTestShareKeysBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.circle_counter, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLabTestShareKeysBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemLabTestShareKeysBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[1]
            , (android.widget.ProgressBar) bindings[4]
            );
        this.errorMessage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.retryButton.setTag(null);
        this.shareKeysButton.setTag(null);
        this.spinner.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 2);
        mCallback9 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewState == variableId) {
            setViewState((nl.rijksoverheid.en.labtest.items.LabTestShareKeysItem.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.labtest.items.LabTestShareKeysItem.ViewState ViewState) {
        this.mViewState = ViewState;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewState);
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
        boolean viewStateUploadKeysEnabled = false;
        nl.rijksoverheid.en.labtest.items.LabTestShareKeysItem.ViewState viewState = mViewState;
        boolean viewStateShowProgress = false;
        int viewStateUploadButtonText = 0;
        boolean viewStateShowError = false;
        boolean viewStateShowButton = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.uploadKeysEnabled
                    viewStateUploadKeysEnabled = viewState.getUploadKeysEnabled();
                    // read viewState.showProgress
                    viewStateShowProgress = viewState.getShowProgress();
                    // read viewState.uploadButtonText
                    viewStateUploadButtonText = viewState.getUploadButtonText();
                    // read viewState.showError
                    viewStateShowError = viewState.getShowError();
                    // read viewState.showButton
                    viewStateShowButton = viewState.getShowButton();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.errorMessage, viewStateShowError, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView5, viewStateShowProgress, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.retryButton, viewStateShowError, (boolean)false, (java.lang.Boolean)null);
            this.shareKeysButton.setText(viewStateUploadButtonText);
            this.shareKeysButton.setEnabled(viewStateUploadKeysEnabled);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.shareKeysButton, viewStateShowButton, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.spinner, viewStateShowProgress, (boolean)false, (java.lang.Boolean)null);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.retryButton.setOnClickListener(mCallback10);
            this.shareKeysButton.setOnClickListener(mCallback9);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewState
                nl.rijksoverheid.en.labtest.items.LabTestShareKeysItem.ViewState viewState = mViewState;
                // viewState.retry
                kotlin.jvm.functions.Function0<kotlin.Unit> viewStateRetry = null;
                // viewState.retry.invoke()
                kotlin.Unit viewStateRetryInvoke = null;
                // viewState != null
                boolean viewStateJavaLangObjectNull = false;
                // viewState.retry != null
                boolean viewStateRetryJavaLangObjectNull = false;



                viewStateJavaLangObjectNull = (viewState) != (null);
                if (viewStateJavaLangObjectNull) {


                    viewStateRetry = viewState.getRetry();

                    viewStateRetryJavaLangObjectNull = (viewStateRetry) != (null);
                    if (viewStateRetryJavaLangObjectNull) {


                        viewStateRetryInvoke = viewStateRetry.invoke();
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewState
                nl.rijksoverheid.en.labtest.items.LabTestShareKeysItem.ViewState viewState = mViewState;
                // viewState.uploadKeys.invoke()
                kotlin.Unit viewStateUploadKeysInvoke = null;
                // viewState != null
                boolean viewStateJavaLangObjectNull = false;
                // viewState.uploadKeys != null
                boolean viewStateUploadKeysJavaLangObjectNull = false;
                // viewState.uploadKeys
                kotlin.jvm.functions.Function0<kotlin.Unit> viewStateUploadKeys = null;



                viewStateJavaLangObjectNull = (viewState) != (null);
                if (viewStateJavaLangObjectNull) {


                    viewStateUploadKeys = viewState.getUploadKeys();

                    viewStateUploadKeysJavaLangObjectNull = (viewStateUploadKeys) != (null);
                    if (viewStateUploadKeysJavaLangObjectNull) {


                        viewStateUploadKeysInvoke = viewStateUploadKeys.invoke();
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewState
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}