package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemInlineIllustrationBindingImpl extends ItemInlineIllustrationBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemInlineIllustrationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemInlineIllustrationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            );
        this.content.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
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
            setViewState((nl.rijksoverheid.en.items.InlineIllustrationItem.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.items.InlineIllustrationItem.ViewState ViewState) {
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
        nl.rijksoverheid.en.items.InlineIllustrationItem.ViewState viewState = mViewState;
        boolean viewStateCaptionJavaLangObjectNull = false;
        java.lang.String viewStateCaption = null;
        java.lang.String viewStateContentDescription = null;
        int viewStateImage = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.caption
                    viewStateCaption = viewState.getCaption();
                    // read viewState.contentDescription
                    viewStateContentDescription = viewState.getContentDescription();
                    // read viewState.image
                    viewStateImage = viewState.getImage();
                }


                // read viewState.caption != null
                viewStateCaptionJavaLangObjectNull = (viewStateCaption) != (null);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.content.setContentDescription(viewStateContentDescription);
            }
            // api target 1

            this.content.setImageResource(viewStateImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewStateCaption);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.mboundView1, viewStateCaptionJavaLangObjectNull, (boolean)false, (java.lang.Boolean)null);
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