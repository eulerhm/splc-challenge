package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentExplanationBindingImpl extends FragmentExplanationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 6);
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.scroll_container, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentExplanationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentExplanationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (com.airbnb.lottie.LottieAnimationView) bindings[1]
            , (android.widget.Button) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            );
        this.description.setTag(null);
        this.example.setTag(null);
        this.headline.setTag(null);
        this.illustration.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.next.setTag(null);
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
        if (BR.nextButtonClickListener == variableId) {
            setNextButtonClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewState == variableId) {
            setViewState((nl.rijksoverheid.en.onboarding.ExplanationFragment.ViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNextButtonClickListener(@Nullable android.view.View.OnClickListener NextButtonClickListener) {
        this.mNextButtonClickListener = NextButtonClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.nextButtonClickListener);
        super.requestRebind();
    }
    public void setViewState(@Nullable nl.rijksoverheid.en.onboarding.ExplanationFragment.ViewState ViewState) {
        this.mViewState = ViewState;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        int viewStateIllustration = 0;
        android.view.View.OnClickListener nextButtonClickListener = mNextButtonClickListener;
        nl.rijksoverheid.en.onboarding.ExplanationFragment.ViewState viewState = mViewState;
        int viewStateAnimation = 0;
        int viewStateHeadline = 0;
        int viewStateDescription = 0;
        boolean viewStateExample = false;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (viewState != null) {
                    // read viewState.illustration
                    viewStateIllustration = viewState.getIllustration();
                    // read viewState.animation
                    viewStateAnimation = viewState.getAnimation();
                    // read viewState.headline
                    viewStateHeadline = viewState.getHeadline();
                    // read viewState.description
                    viewStateDescription = viewState.getDescription();
                    // read viewState.example
                    viewStateExample = viewState.isExample();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.description.setText(viewStateDescription);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.example, viewStateExample, (boolean)false, (java.lang.Boolean)null);
            this.headline.setText(viewStateHeadline);
            this.illustration.setImageResource(viewStateIllustration);
            nl.rijksoverheid.en.databinding.BindingAdapters.setOptionalAnimation(this.illustration, viewStateAnimation);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.illustration, (java.lang.Boolean)null, (boolean)false, true);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.next.setOnClickListener(nextButtonClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): nextButtonClickListener
        flag 1 (0x2L): viewState
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}