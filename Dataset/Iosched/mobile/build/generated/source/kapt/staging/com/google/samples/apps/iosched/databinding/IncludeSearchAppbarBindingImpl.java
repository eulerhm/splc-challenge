package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class IncludeSearchAppbarBindingImpl extends IncludeSearchAppbarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.searchView, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeSearchAppbarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private IncludeSearchAppbarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.google.android.material.appbar.AppBarLayout) bindings[0]
            , (android.widget.SearchView) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.activeFilters.setTag(null);
        this.appbar.setTag(null);
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelHasAnyFilters((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelSelectedFilterChips((androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelHasAnyFilters(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelHasAnyFilters, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedFilterChips(androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> ViewModelSelectedFilterChips, int fieldId) {
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
        java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip> viewModelSelectedFilterChipsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelHasAnyFilters = null;
        androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.filters.FilterChip>> viewModelSelectedFilterChips = null;
        com.google.samples.apps.iosched.ui.search.SearchViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelHasAnyFiltersGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasAnyFilters
                        viewModelHasAnyFilters = viewModel.getHasAnyFilters();
                    }
                    updateLiveDataRegistration(0, viewModelHasAnyFilters);


                    if (viewModelHasAnyFilters != null) {
                        // read viewModel.hasAnyFilters.getValue()
                        viewModelHasAnyFiltersGetValue = viewModelHasAnyFilters.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasAnyFilters.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHasAnyFiltersGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedFilterChips
                        viewModelSelectedFilterChips = viewModel.getSelectedFilterChips();
                    }
                    updateLiveDataRegistration(1, viewModelSelectedFilterChips);


                    if (viewModelSelectedFilterChips != null) {
                        // read viewModel.selectedFilterChips.getValue()
                        viewModelSelectedFilterChipsGetValue = viewModelSelectedFilterChips.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.activeFilters, androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.filters.FiltersViewBindingAdaptersKt.activeFilters(this.activeFilters, viewModelSelectedFilterChipsGetValue, viewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.hasAnyFilters
        flag 1 (0x2L): viewModel.selectedFilterChips
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}