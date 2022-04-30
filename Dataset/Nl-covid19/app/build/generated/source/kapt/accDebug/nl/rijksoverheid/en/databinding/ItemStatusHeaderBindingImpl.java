package nl.rijksoverheid.en.databinding;
import nl.rijksoverheid.en.R;
import nl.rijksoverheid.en.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStatusHeaderBindingImpl extends ItemStatusHeaderBinding implements nl.rijksoverheid.en.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.illustration_top, 10);
        sViewsWithIds.put(R.id.exposure_buttons, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStatusHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemStatusHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.airbnb.lottie.LottieAnimationView) bindings[2]
            , (android.widget.Button) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[8]
            , (android.widget.Space) bindings[10]
            , (android.widget.ImageView) bindings[6]
            , (com.airbnb.lottie.LottieAnimationView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.clouds.setTag(null);
        this.disabledEnable.setTag(null);
        this.exposureReset.setTag(null);
        this.exposureWhatNext.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.noExposureIllustration.setTag(null);
        this.statusAnimatedImage.setTag(null);
        this.statusDescription.setTag(null);
        this.statusHeadline.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 2);
        mCallback3 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 3);
        mCallback1 = new nl.rijksoverheid.en.generated.callback.OnClickListener(this, 1);
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
            setViewState((nl.rijksoverheid.en.status.StatusHeaderItem.HeaderViewState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewState(@Nullable nl.rijksoverheid.en.status.StatusHeaderItem.HeaderViewState ViewState) {
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
        java.lang.Integer viewStateResetActionLabel = null;
        nl.rijksoverheid.en.status.StatusHeaderItem.HeaderViewState viewState = mViewState;
        java.lang.Integer viewStateWhatsNextActionLabel = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewStateWhatsNextActionLabel = 0;
        int viewStateHeadline = 0;
        java.lang.Integer viewStateEnableActionLabel = null;
        java.lang.CharSequence viewStateGetDescriptionContext = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewStateResetActionLabel = 0;
        int viewStateIcon = 0;
        int androidxDatabindingViewDataBindingSafeUnboxViewStateEnableActionLabel = 0;
        boolean viewStateShowIllustration = false;
        int viewStateBackground = 0;
        int viewStateIconContentDescription = 0;
        int viewStateAnimatedIcon = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewState != null) {
                    // read viewState.resetActionLabel
                    viewStateResetActionLabel = viewState.getResetActionLabel();
                    // read viewState.whatsNextActionLabel
                    viewStateWhatsNextActionLabel = viewState.getWhatsNextActionLabel();
                    // read viewState.headline
                    viewStateHeadline = viewState.getHeadline();
                    // read viewState.enableActionLabel
                    viewStateEnableActionLabel = viewState.getEnableActionLabel();
                    // read viewState.getDescription(context)
                    viewStateGetDescriptionContext = viewState.getDescription(getRoot().getContext());
                    // read viewState.icon
                    viewStateIcon = viewState.getIcon();
                    // read viewState.showIllustration
                    viewStateShowIllustration = viewState.getShowIllustration();
                    // read viewState.background
                    viewStateBackground = viewState.getBackground();
                    // read viewState.iconContentDescription
                    viewStateIconContentDescription = viewState.getIconContentDescription();
                    // read viewState.animatedIcon
                    viewStateAnimatedIcon = viewState.getAnimatedIcon();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewState.resetActionLabel)
                androidxDatabindingViewDataBindingSafeUnboxViewStateResetActionLabel = androidx.databinding.ViewDataBinding.safeUnbox(viewStateResetActionLabel);
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewState.whatsNextActionLabel)
                androidxDatabindingViewDataBindingSafeUnboxViewStateWhatsNextActionLabel = androidx.databinding.ViewDataBinding.safeUnbox(viewStateWhatsNextActionLabel);
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewState.enableActionLabel)
                androidxDatabindingViewDataBindingSafeUnboxViewStateEnableActionLabel = androidx.databinding.ViewDataBinding.safeUnbox(viewStateEnableActionLabel);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.clouds, viewStateShowIllustration, true, true);
            nl.rijksoverheid.en.databinding.BindingAdapters.showIfLabelSet(this.disabledEnable, androidxDatabindingViewDataBindingSafeUnboxViewStateEnableActionLabel);
            nl.rijksoverheid.en.databinding.BindingAdapters.showIfLabelSet(this.exposureReset, androidxDatabindingViewDataBindingSafeUnboxViewStateResetActionLabel);
            nl.rijksoverheid.en.databinding.BindingAdapters.showIfLabelSet(this.exposureWhatNext, androidxDatabindingViewDataBindingSafeUnboxViewStateWhatsNextActionLabel);
            this.mboundView1.setImageResource(viewStateBackground);
            nl.rijksoverheid.en.databinding.BindingAdapters.show(this.noExposureIllustration, viewStateShowIllustration, (boolean)false, true);
            this.statusAnimatedImage.setImageResource(viewStateIcon);
            nl.rijksoverheid.en.databinding.BindingAdapters.setContentDescriptionRes(this.statusAnimatedImage, viewStateIconContentDescription);
            nl.rijksoverheid.en.databinding.BindingAdapters.setOptionalAnimation(this.statusAnimatedImage, viewStateAnimatedIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.statusDescription, viewStateGetDescriptionContext);
            this.statusHeadline.setText(viewStateHeadline);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.disabledEnable.setOnClickListener(mCallback1);
            this.exposureReset.setOnClickListener(mCallback3);
            this.exposureWhatNext.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewState
                nl.rijksoverheid.en.status.StatusHeaderItem.HeaderViewState viewState = mViewState;
                // viewState.whatsNextAction != null
                boolean viewStateWhatsNextActionJavaLangObjectNull = false;
                // viewState != null
                boolean viewStateJavaLangObjectNull = false;
                // viewState.whatsNextAction
                kotlin.jvm.functions.Function0<kotlin.Unit> viewStateWhatsNextAction = null;
                // viewState.whatsNextAction.invoke()
                kotlin.Unit viewStateWhatsNextActionInvoke = null;



                viewStateJavaLangObjectNull = (viewState) != (null);
                if (viewStateJavaLangObjectNull) {


                    viewStateWhatsNextAction = viewState.getWhatsNextAction();

                    viewStateWhatsNextActionJavaLangObjectNull = (viewStateWhatsNextAction) != (null);
                    if (viewStateWhatsNextActionJavaLangObjectNull) {


                        viewStateWhatsNextActionInvoke = viewStateWhatsNextAction.invoke();
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewState
                nl.rijksoverheid.en.status.StatusHeaderItem.HeaderViewState viewState = mViewState;
                // viewState.resetAction
                kotlin.jvm.functions.Function0<kotlin.Unit> viewStateResetAction = null;
                // viewState.resetAction != null
                boolean viewStateResetActionJavaLangObjectNull = false;
                // viewState != null
                boolean viewStateJavaLangObjectNull = false;
                // viewState.resetAction.invoke()
                kotlin.Unit viewStateResetActionInvoke = null;



                viewStateJavaLangObjectNull = (viewState) != (null);
                if (viewStateJavaLangObjectNull) {


                    viewStateResetAction = viewState.getResetAction();

                    viewStateResetActionJavaLangObjectNull = (viewStateResetAction) != (null);
                    if (viewStateResetActionJavaLangObjectNull) {


                        viewStateResetActionInvoke = viewStateResetAction.invoke();
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewState
                nl.rijksoverheid.en.status.StatusHeaderItem.HeaderViewState viewState = mViewState;
                // viewState.enableAction.invoke()
                kotlin.Unit viewStateEnableActionInvoke = null;
                // viewState != null
                boolean viewStateJavaLangObjectNull = false;
                // viewState.enableAction != null
                boolean viewStateEnableActionJavaLangObjectNull = false;
                // viewState.enableAction
                kotlin.jvm.functions.Function0<kotlin.Unit> viewStateEnableAction = null;



                viewStateJavaLangObjectNull = (viewState) != (null);
                if (viewStateJavaLangObjectNull) {


                    viewStateEnableAction = viewState.getEnableAction();

                    viewStateEnableActionJavaLangObjectNull = (viewStateEnableAction) != (null);
                    if (viewStateEnableActionJavaLangObjectNull) {


                        viewStateEnableActionInvoke = viewStateEnableAction.invoke();
                    }
                }
                break;
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