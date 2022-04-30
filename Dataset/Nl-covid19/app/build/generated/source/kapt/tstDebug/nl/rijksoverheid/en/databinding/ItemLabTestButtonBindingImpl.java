package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLabTestButtonBindingImpl extends ItemLabTestButtonBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.circle_counter, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLabTestButtonBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemLabTestButtonBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
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
            setViewState((nl.rijksoverheid.en.labtest.items.LabTestButtonItem.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.labtest.items.LabTestButtonItem.ViewState ViewState) {
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
        nl.rijksoverheid.en.labtest.items.LabTestButtonItem.ViewState viewState = mViewState;
        boolean viewStateEnabled = false;
        int viewStateText = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.enabled
                    viewStateEnabled = viewState.getEnabled();
                    // read viewState.text
                    viewStateText = viewState.getText();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.setEnabled(viewStateEnabled);
            this.mboundView1.setText(viewStateText);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewState
        nl.rijksoverheid.en.labtest.items.LabTestButtonItem.ViewState viewState = mViewState;
        // viewState.click
        kotlin.jvm.functions.Function0<kotlin.Unit> viewStateClick = null;
        // viewState.click != null
        boolean viewStateClickJavaLangObjectNull = false;
        // viewState != null
        boolean viewStateJavaLangObjectNull = false;
        // viewState.click.invoke()
        kotlin.Unit viewStateClickInvoke = null;



        viewStateJavaLangObjectNull = (viewState) != (null);
        if (viewStateJavaLangObjectNull) {


            viewStateClick = viewState.getClick();

            viewStateClickJavaLangObjectNull = (viewStateClick) != (null);
            if (viewStateClickJavaLangObjectNull) {


                viewStateClickInvoke = viewStateClick.invoke();
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