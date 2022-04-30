package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLabTestKeyBindingImpl extends ItemLabTestKeyBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.circle_counter, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.Button mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLabTestKeyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemLabTestKeyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            );
        this.errorText.setTag(null);
        this.keyContainer.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.spinner.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
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
            setViewState((nl.rijksoverheid.en.labtest.items.LabTestKeyItem.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.labtest.items.LabTestKeyItem.ViewState ViewState) {
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
        boolean viewStateShowCode = false;
        java.lang.String viewStateKeyContentDescription = null;
        nl.rijksoverheid.en.labtest.items.LabTestKeyItem.ViewState viewState = mViewState;
        boolean viewStateShowProgress = false;
        boolean viewStateEnabled = false;
        boolean viewStateShowError = false;
        boolean ViewStateEnabled1 = false;
        java.lang.String viewStateDisplayKey = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.showCode
                    viewStateShowCode = viewState.getShowCode();
                    // read viewState.keyContentDescription
                    viewStateKeyContentDescription = viewState.getKeyContentDescription();
                    // read viewState.showProgress
                    viewStateShowProgress = viewState.getShowProgress();
                    // read viewState.enabled
                    viewStateEnabled = viewState.getEnabled();
                    // read viewState.showError
                    viewStateShowError = viewState.getShowError();
                    // read viewState.displayKey
                    viewStateDisplayKey = viewState.getDisplayKey();
                }


                // read !viewState.enabled
                ViewStateEnabled1 = !viewStateEnabled;
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.errorText, viewStateShowError, (boolean)false, (java.lang.Boolean)null);
            this.keyContainer.setClickable(viewStateShowCode);
            this.keyContainer.setFocusable(viewStateShowCode);
            this.keyContainer.setEnabled(viewStateEnabled);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView3, viewStateShowProgress, (boolean)false, (java.lang.Boolean)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewStateDisplayKey);
            this.mboundView4.setEnabled(viewStateEnabled);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView4, viewStateShowCode, (boolean)false, (java.lang.Boolean)null);
            this.mboundView5.setEnabled(viewStateEnabled);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView5, ViewStateEnabled1, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView7, viewStateShowError, (boolean)false, (java.lang.Boolean)null);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.spinner, viewStateShowProgress, (boolean)false, (java.lang.Boolean)null);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.mboundView4.setContentDescription(viewStateKeyContentDescription);
                this.mboundView5.setContentDescription(viewStateKeyContentDescription);
            }
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.markAsButtonForAccessibility(this.keyContainer, true);
            this.mboundView7.setOnClickListener(mCallback17);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewState
        nl.rijksoverheid.en.labtest.items.LabTestKeyItem.ViewState viewState = mViewState;
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
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewState
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}