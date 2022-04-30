package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemFeedAnnouncementsHeaderBindingImpl extends ItemFeedAnnouncementsHeaderBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 2);
        sViewsWithIds.put(R.id.guideline_end, 3);
        sViewsWithIds.put(R.id.title, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFeedAnnouncementsHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemFeedAnnouncementsHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.actionButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback24 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
        else if (BR.announcementsHeaderState == variableId) {
            setAnnouncementsHeaderState((com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader) variable);
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
    public void setAnnouncementsHeaderState(@Nullable com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader AnnouncementsHeaderState) {
        this.mAnnouncementsHeaderState = AnnouncementsHeaderState;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.announcementsHeaderState);
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
        com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = mEventListener;
        boolean announcementsHeaderStateShowPastNotificationsButton = false;
        com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader announcementsHeaderState = mAnnouncementsHeaderState;

        if ((dirtyFlags & 0x6L) != 0) {



                if (announcementsHeaderState != null) {
                    // read announcementsHeaderState.showPastNotificationsButton
                    announcementsHeaderStateShowPastNotificationsButton = announcementsHeaderState.getShowPastNotificationsButton();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.actionButton.setOnClickListener(mCallback24);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.actionButton, announcementsHeaderStateShowPastNotificationsButton);
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


            eventListener.openPastAnnouncements();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventListener
        flag 1 (0x2L): announcementsHeaderState
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}