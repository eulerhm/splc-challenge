package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentFiltersBindingImpl extends FragmentFiltersBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guide_header_height, 5);
        sViewsWithIds.put(R.id.filters_header_shadow, 6);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFiltersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentFiltersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.view.View) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.Button) bindings[3]
            );
        this.collapseArrow.setTag(null);
        this.filterSheet.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.recyclerviewFilters.setTag(null);
        this.reset.setTag(null);
        setRootTag(root);
        // listeners
        mCallback26 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.contentAlpha == variableId) {
            setContentAlpha((androidx.databinding.ObservableFloat) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContentAlpha(@Nullable androidx.databinding.ObservableFloat ContentAlpha) {
        updateRegistration(0, ContentAlpha);
        this.mContentAlpha = ContentAlpha;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.contentAlpha);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeContentAlpha((androidx.databinding.ObservableFloat) object, fieldId);
            case 1 :
                return onChangeViewModelHasAnyFilters((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelResultCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewModelShowResultCount((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeContentAlpha(androidx.databinding.ObservableFloat ContentAlpha, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHasAnyFilters(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelHasAnyFilters, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelResultCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelResultCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowResultCount(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelShowResultCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.Integer viewModelResultCountGetValue = null;
        boolean contentAlphaFloat0f = false;
        androidx.databinding.ObservableFloat contentAlpha = mContentAlpha;
        java.lang.Boolean viewModelShowResultCountGetValue = null;
        float contentAlphaGet = 0f;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelHasAnyFilters = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelResultCount = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelShowResultCount = null;
        com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModel = mViewModel;
        java.lang.Boolean viewModelHasAnyFiltersGetValue = null;

        if ((dirtyFlags & 0x21L) != 0) {



                if (contentAlpha != null) {
                    // read contentAlpha.get()
                    contentAlphaGet = contentAlpha.get();
                }


                // read contentAlpha.get() > 0f
                contentAlphaFloat0f = (contentAlphaGet) > (0f);
        }
        if ((dirtyFlags & 0x3eL) != 0) {


            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasAnyFilters
                        viewModelHasAnyFilters = viewModel.getHasAnyFilters();
                    }
                    updateLiveDataRegistration(1, viewModelHasAnyFilters);


                    if (viewModelHasAnyFilters != null) {
                        // read viewModel.hasAnyFilters.getValue()
                        viewModelHasAnyFiltersGetValue = viewModelHasAnyFilters.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasAnyFilters.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHasAnyFiltersGetValue);
            }
            if ((dirtyFlags & 0x3cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.resultCount
                        viewModelResultCount = viewModel.getResultCount();
                        // read viewModel.showResultCount
                        viewModelShowResultCount = viewModel.getShowResultCount();
                    }
                    updateLiveDataRegistration(2, viewModelResultCount);
                    updateLiveDataRegistration(3, viewModelShowResultCount);


                    if (viewModelResultCount != null) {
                        // read viewModel.resultCount.getValue()
                        viewModelResultCountGetValue = viewModelResultCount.getValue();
                    }
                    if (viewModelShowResultCount != null) {
                        // read viewModel.showResultCount.getValue()
                        viewModelShowResultCountGetValue = viewModelShowResultCount.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.collapseArrow.setAlpha(contentAlphaGet);
                this.mboundView2.setAlpha(contentAlphaGet);
                this.recyclerviewFilters.setAlpha(contentAlphaGet);
                this.reset.setAlpha(contentAlphaGet);
            }
            // api target 1

            this.collapseArrow.setClickable(contentAlphaFloat0f);
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.reset, mCallback26, contentAlphaFloat0f);
        }
        if ((dirtyFlags & 0x3cL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.filters.FiltersViewBindingAdaptersKt.filterHeader(this.mboundView2, viewModelShowResultCountGetValue, viewModelResultCountGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.reset, androidxDatabindingViewDataBindingSafeUnboxViewModelHasAnyFiltersGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.google.samples.apps.iosched.ui.filters.FiltersViewModelDelegate viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.clearFilters();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): contentAlpha
        flag 1 (0x2L): viewModel.hasAnyFilters
        flag 2 (0x3L): viewModel.resultCount
        flag 3 (0x4L): viewModel.showResultCount
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}