package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStatusExposureOver14DaysAgoBindingImpl extends ItemStatusExposureOver14DaysAgoBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.icon, 4);
        sViewsWithIds.put(R.id.title, 5);
        sViewsWithIds.put(R.id.header_barrier, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStatusExposureOver14DaysAgoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemStatusExposureOver14DaysAgoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.message.setTag(null);
        this.primaryButton.setTag(null);
        this.secondaryButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 2);
        mCallback11 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
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
            setViewState((nl.rijksoverheid.en.status.StatusExposureOver14DaysAgoItem.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.status.StatusExposureOver14DaysAgoItem.ViewState ViewState) {
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
        nl.rijksoverheid.en.status.StatusExposureOver14DaysAgoItem.ViewState viewState = mViewState;
        java.lang.String viewStateGetMessageContext = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.getMessage(context)
                    viewStateGetMessageContext = viewState.getMessage(getRoot().getContext());
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.message, viewStateGetMessageContext);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.primaryButton.setOnClickListener(mCallback12);
            this.secondaryButton.setOnClickListener(mCallback11);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewState
                nl.rijksoverheid.en.status.StatusExposureOver14DaysAgoItem.ViewState viewState = mViewState;
                // viewState.primaryAction.invoke()
                kotlin.Unit viewStatePrimaryActionInvoke = null;
                // viewState.primaryAction
                kotlin.jvm.functions.Function0<kotlin.Unit> viewStatePrimaryAction = null;
                // viewState != null
                boolean viewStateJavaLangObjectNull = false;
                // viewState.primaryAction != null
                boolean viewStatePrimaryActionJavaLangObjectNull = false;



                viewStateJavaLangObjectNull = (viewState) != (null);
                if (viewStateJavaLangObjectNull) {


                    viewStatePrimaryAction = viewState.getPrimaryAction();

                    viewStatePrimaryActionJavaLangObjectNull = (viewStatePrimaryAction) != (null);
                    if (viewStatePrimaryActionJavaLangObjectNull) {


                        viewStatePrimaryActionInvoke = viewStatePrimaryAction.invoke();
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewState
                nl.rijksoverheid.en.status.StatusExposureOver14DaysAgoItem.ViewState viewState = mViewState;
                // viewState.secondaryAction.invoke()
                kotlin.Unit viewStateSecondaryActionInvoke = null;
                // viewState != null
                boolean viewStateJavaLangObjectNull = false;
                // viewState.secondaryAction != null
                boolean viewStateSecondaryActionJavaLangObjectNull = false;
                // viewState.secondaryAction
                kotlin.jvm.functions.Function0<kotlin.Unit> viewStateSecondaryAction = null;



                viewStateJavaLangObjectNull = (viewState) != (null);
                if (viewStateJavaLangObjectNull) {


                    viewStateSecondaryAction = viewState.getSecondaryAction();

                    viewStateSecondaryActionJavaLangObjectNull = (viewStateSecondaryAction) != (null);
                    if (viewStateSecondaryActionJavaLangObjectNull) {


                        viewStateSecondaryActionInvoke = viewStateSecondaryAction.invoke();
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