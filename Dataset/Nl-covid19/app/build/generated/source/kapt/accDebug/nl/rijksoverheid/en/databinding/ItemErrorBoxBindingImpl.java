package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemErrorBoxBindingImpl extends ItemErrorBoxBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.error_box_image, 4);
        sViewsWithIds.put(R.id.header_barrier, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemErrorBoxBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemErrorBoxBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            );
        this.errorBoxText.setTag(null);
        this.errorBoxTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
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
            setViewState((nl.rijksoverheid.en.items.ErrorBoxItem.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.items.ErrorBoxItem.ViewState ViewState) {
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
        nl.rijksoverheid.en.items.ErrorBoxItem.ViewState viewState = mViewState;
        int viewStateText = 0;
        int viewStateActionLabel = 0;
        int viewStateTitle = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.text
                    viewStateText = viewState.getText();
                    // read viewState.actionLabel
                    viewStateActionLabel = viewState.getActionLabel();
                    // read viewState.title
                    viewStateTitle = viewState.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.errorBoxText.setText(viewStateText);
            this.errorBoxTitle.setText(viewStateTitle);
            nl.rijksoverheid.en.databinding.BindingAdapters.showIfLabelSet(this.mboundView3, viewStateActionLabel);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback15);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewState
        nl.rijksoverheid.en.items.ErrorBoxItem.ViewState viewState = mViewState;
        // viewState != null
        boolean viewStateJavaLangObjectNull = false;
        // viewState.action.invoke()
        kotlin.Unit viewStateActionInvoke = null;
        // viewState.action
        kotlin.jvm.functions.Function0<kotlin.Unit> viewStateAction = null;
        // viewState.action != null
        boolean viewStateActionJavaLangObjectNull = false;



        viewStateJavaLangObjectNull = (viewState) != (null);
        if (viewStateJavaLangObjectNull) {


            viewStateAction = viewState.getAction();

            viewStateActionJavaLangObjectNull = (viewStateAction) != (null);
            if (viewStateActionJavaLangObjectNull) {


                viewStateActionInvoke = viewStateAction.invoke();
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