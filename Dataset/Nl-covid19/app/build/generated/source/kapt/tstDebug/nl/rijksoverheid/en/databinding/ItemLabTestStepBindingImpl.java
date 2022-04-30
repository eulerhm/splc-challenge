package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLabTestStepBindingImpl extends ItemLabTestStepBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLabTestStepBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemLabTestStepBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.view.View) bindings[1]
            );
        this.bottomLine.setTag(null);
        this.circleCounter.setTag(null);
        this.content.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.topLine.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewState((nl.rijksoverheid.en.labtest.items.LabTestStepItem.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.labtest.items.LabTestStepItem.ViewState ViewState) {
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
        nl.rijksoverheid.en.labtest.items.LabTestStepItem.ViewState viewState = mViewState;
        boolean viewStateShowBottomLine = false;
        boolean viewStateEnabled = false;
        int viewStateText = 0;
        java.lang.String viewStateCounter = null;
        boolean viewStateShowTopLine = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.showBottomLine
                    viewStateShowBottomLine = viewState.getShowBottomLine();
                    // read viewState.enabled
                    viewStateEnabled = viewState.getEnabled();
                    // read viewState.text
                    viewStateText = viewState.getText();
                    // read viewState.counter
                    viewStateCounter = viewState.getCounter();
                    // read viewState.showTopLine
                    viewStateShowTopLine = viewState.getShowTopLine();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.bottomLine, viewStateShowBottomLine, (boolean)false, (java.lang.Boolean)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.circleCounter, viewStateCounter);
            this.circleCounter.setEnabled(viewStateEnabled);
            this.content.setText(viewStateText);
            this.content.setEnabled(viewStateEnabled);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.topLine, viewStateShowTopLine, (boolean)false, (java.lang.Boolean)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewState
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}