package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLocationServicesRequiredBindingImpl extends FragmentLocationServicesRequiredBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 4);
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.scroll_container, 6);
        sViewsWithIds.put(R.id.headline, 7);
        sViewsWithIds.put(R.id.description, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLocationServicesRequiredBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentLocationServicesRequiredBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Button) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            );
        this.explanation.setTag(null);
        this.illustration.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.request.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.explanationClickListener == variableId) {
            setExplanationClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.enableLocationServicesClickListener == variableId) {
            setEnableLocationServicesClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExplanationClickListener(@Nullable android.view.View.OnClickListener ExplanationClickListener) {
        this.mExplanationClickListener = ExplanationClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.explanationClickListener);
        super.requestRebind();
    }
    public void setEnableLocationServicesClickListener(@Nullable android.view.View.OnClickListener EnableLocationServicesClickListener) {
        this.mEnableLocationServicesClickListener = EnableLocationServicesClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.enableLocationServicesClickListener);
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
        android.view.View.OnClickListener explanationClickListener = mExplanationClickListener;
        android.view.View.OnClickListener enableLocationServicesClickListener = mEnableLocationServicesClickListener;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.explanation.setOnClickListener(explanationClickListener);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.illustration, (java.lang.Boolean)null, (boolean)false, true);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.request.setOnClickListener(enableLocationServicesClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): explanationClickListener
        flag 1 (0x2L): enableLocationServicesClickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}