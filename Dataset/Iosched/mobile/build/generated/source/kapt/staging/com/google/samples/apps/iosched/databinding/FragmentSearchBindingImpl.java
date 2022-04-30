package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"include_search_appbar"},
            new int[] {3},
            new int[] {com.google.samples.apps.iosched.R.layout.include_search_appbar});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[2]
            , (com.google.samples.apps.iosched.databinding.IncludeSearchAppbarBinding) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.empty.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        includeSearchAppbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeSearchAppbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.search.SearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeSearchAppbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeSearchAppbar((com.google.samples.apps.iosched.databinding.IncludeSearchAppbarBinding) object, fieldId);
            case 1 :
                return onChangeViewModelIsEmpty((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeSearchAppbar(com.google.samples.apps.iosched.databinding.IncludeSearchAppbarBinding IncludeSearchAppbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsEmpty(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue = false;
        com.google.samples.apps.iosched.ui.search.SearchViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelIsEmptyGetValue = null;
        boolean viewModelIsEmpty = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsEmpty1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmpty = false;

        if ((dirtyFlags & 0xeL) != 0) {



                if (viewModel != null) {
                    // read viewModel.isEmpty
                    ViewModelIsEmpty1 = viewModel.isEmpty();
                }
                updateLiveDataRegistration(1, ViewModelIsEmpty1);


                if (ViewModelIsEmpty1 != null) {
                    // read viewModel.isEmpty.getValue()
                    viewModelIsEmptyGetValue = ViewModelIsEmpty1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEmptyGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.getValue())
                viewModelIsEmpty = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.getValue()))
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmpty = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEmpty);
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.empty, androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGetValue);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.recyclerView, androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmpty);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.includeSearchAppbar.setViewModel(viewModel);
        }
        executeBindingsOn(includeSearchAppbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeSearchAppbar
        flag 1 (0x2L): viewModel.isEmpty
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}