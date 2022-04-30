package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemFeedSessionsContainerBindingImpl extends ItemFeedSessionsContainerBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 6);
        sViewsWithIds.put(R.id.guideline_end, 7);
        sViewsWithIds.put(R.id.recyclerView, 8);
        sViewsWithIds.put(R.id.noEventsMessage, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFeedSessionsContainerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemFeedSessionsContainerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (android.widget.ProgressBar) bindings[3]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[1]
            );
        this.actionButton.setTag(null);
        this.loading.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (com.google.android.material.card.MaterialCardView) bindings[4];
        this.mboundView4.setTag(null);
        this.noEventsAction.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
        if (BR.eventListener == variableId) {
            setEventListener((com.google.samples.apps.iosched.ui.feed.FeedEventListener) variable);
        }
        else if (BR.sessionContainerState == variableId) {
            setSessionContainerState((com.google.samples.apps.iosched.ui.feed.FeedSessions) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.feed.FeedEventListener EventListener) {
        this.mEventListener = EventListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.eventListener);
        super.requestRebind();
    }
    public void setSessionContainerState(@Nullable com.google.samples.apps.iosched.ui.feed.FeedSessions SessionContainerState) {
        this.mSessionContainerState = SessionContainerState;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sessionContainerState);
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
        boolean sessionContainerStateUserSessionsEmpty = false;
        com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = mEventListener;
        boolean sessionContainerStateLoading = false;
        com.google.samples.apps.iosched.ui.feed.FeedSessions sessionContainerState = mSessionContainerState;
        boolean SessionContainerStateLoading1 = false;
        int sessionContainerStateActionTextId = 0;
        boolean sessionContainerStateLoadingSessionContainerStateUserSessionsEmptyBooleanFalse = false;
        java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> sessionContainerStateUserSessions = null;
        boolean sessionContainerStateIsLoading = false;
        int sessionContainerStateTitleId = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                if (sessionContainerState != null) {
                    // read sessionContainerState.loading
                    sessionContainerStateLoading = sessionContainerState.isLoading();
                    // read sessionContainerState.actionTextId
                    sessionContainerStateActionTextId = sessionContainerState.getActionTextId();
                    // read sessionContainerState.isLoading
                    sessionContainerStateIsLoading = sessionContainerState.isLoading();
                    // read sessionContainerState.titleId
                    sessionContainerStateTitleId = sessionContainerState.getTitleId();
                }


                // read !sessionContainerState.loading
                SessionContainerStateLoading1 = !sessionContainerStateLoading;
            if((dirtyFlags & 0x6L) != 0) {
                if(SessionContainerStateLoading1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (sessionContainerState != null) {
                    // read sessionContainerState.userSessions
                    sessionContainerStateUserSessions = sessionContainerState.getUserSessions();
                }


                if (sessionContainerStateUserSessions != null) {
                    // read sessionContainerState.userSessions.empty
                    sessionContainerStateUserSessionsEmpty = sessionContainerStateUserSessions.isEmpty();
                }
        }

        if ((dirtyFlags & 0x6L) != 0) {

                // read !sessionContainerState.loading ? sessionContainerState.userSessions.empty : false
                sessionContainerStateLoadingSessionContainerStateUserSessionsEmptyBooleanFalse = ((SessionContainerStateLoading1) ? (sessionContainerStateUserSessionsEmpty) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.actionButton, sessionContainerStateActionTextId);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.loading, sessionContainerStateIsLoading);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.mboundView4, sessionContainerStateLoadingSessionContainerStateUserSessionsEmptyBooleanFalse);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.setText(this.title, sessionContainerStateTitleId);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.noEventsAction.setOnClickListener(mCallback25);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // eventListener
        com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = mEventListener;
        // eventListener != null
        boolean eventListenerJavaLangObjectNull = false;



        eventListenerJavaLangObjectNull = (eventListener) != (null);
        if (eventListenerJavaLangObjectNull) {



            eventListener.openSchedule(false);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventListener
        flag 1 (0x2L): sessionContainerState
        flag 2 (0x3L): null
        flag 3 (0x4L): !sessionContainerState.loading ? sessionContainerState.userSessions.empty : false
        flag 4 (0x5L): !sessionContainerState.loading ? sessionContainerState.userSessions.empty : false
    flag mapping end*/
    //end
}