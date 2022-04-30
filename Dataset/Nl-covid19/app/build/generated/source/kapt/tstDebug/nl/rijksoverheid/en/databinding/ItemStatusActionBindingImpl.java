package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStatusActionBindingImpl extends ItemStatusActionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStatusActionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemStatusActionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.container.setTag(null);
        this.statusIcon.setTag(null);
        this.statusSubtitle.setTag(null);
        this.statusTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.infoIcon == variableId) {
            setInfoIcon((java.lang.Integer) variable);
        }
        else if (BR.infoSubtitle == variableId) {
            setInfoSubtitle((java.lang.Integer) variable);
        }
        else if (BR.infoTitle == variableId) {
            setInfoTitle((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInfoIcon(@Nullable java.lang.Integer InfoIcon) {
        this.mInfoIcon = InfoIcon;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.infoIcon);
        super.requestRebind();
    }
    public void setInfoSubtitle(@Nullable java.lang.Integer InfoSubtitle) {
        this.mInfoSubtitle = InfoSubtitle;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.infoSubtitle);
        super.requestRebind();
    }
    public void setInfoTitle(@Nullable java.lang.Integer InfoTitle) {
        this.mInfoTitle = InfoTitle;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.infoTitle);
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
        int androidxDatabindingViewDataBindingSafeUnboxInfoSubtitle = 0;
        int androidxDatabindingViewDataBindingSafeUnboxInfoIcon = 0;
        java.lang.Integer infoIcon = mInfoIcon;
        java.lang.Integer infoSubtitle = mInfoSubtitle;
        int androidxDatabindingViewDataBindingSafeUnboxInfoTitle = 0;
        java.lang.Integer infoTitle = mInfoTitle;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(infoIcon)
                androidxDatabindingViewDataBindingSafeUnboxInfoIcon = androidx.databinding.ViewDataBinding.safeUnbox(infoIcon);
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(infoSubtitle)
                androidxDatabindingViewDataBindingSafeUnboxInfoSubtitle = androidx.databinding.ViewDataBinding.safeUnbox(infoSubtitle);
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(infoTitle)
                androidxDatabindingViewDataBindingSafeUnboxInfoTitle = androidx.databinding.ViewDataBinding.safeUnbox(infoTitle);
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.statusIcon.setImageResource(androidxDatabindingViewDataBindingSafeUnboxInfoIcon);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.statusSubtitle.setText(androidxDatabindingViewDataBindingSafeUnboxInfoSubtitle);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.statusTitle.setText(androidxDatabindingViewDataBindingSafeUnboxInfoTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): infoIcon
        flag 1 (0x2L): infoSubtitle
        flag 2 (0x3L): infoTitle
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}