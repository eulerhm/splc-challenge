package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemFeedSessionBindingImpl extends ItemFeedSessionBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.keyline_left, 8);
        sViewsWithIds.put(R.id.keyline_right, 9);
        sViewsWithIds.put(R.id.footer_buttons, 10);
        sViewsWithIds.put(R.id.keyline_bottom, 11);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFeedSessionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemFeedSessionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.detailsButton.setTag(null);
        this.location.setTag(null);
        this.mapButton.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.reservedIcon.setTag(null);
        this.starredIcon.setTag(null);
        this.time.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 2);
        mCallback10 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.userSession == variableId) {
            setUserSession((com.google.samples.apps.iosched.model.userdata.UserSession) variable);
        }
        else if (BR.eventListener == variableId) {
            setEventListener((com.google.samples.apps.iosched.ui.feed.FeedEventListener) variable);
        }
        else if (BR.timeZoneId == variableId) {
            setTimeZoneId((org.threeten.bp.ZoneId) variable);
        }
        else if (BR.isMapFeatureEnabled == variableId) {
            setIsMapFeatureEnabled((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserSession(@Nullable com.google.samples.apps.iosched.model.userdata.UserSession UserSession) {
        this.mUserSession = UserSession;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userSession);
        super.requestRebind();
    }
    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.feed.FeedEventListener EventListener) {
        this.mEventListener = EventListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventListener);
        super.requestRebind();
    }
    public void setTimeZoneId(@Nullable org.threeten.bp.ZoneId TimeZoneId) {
        this.mTimeZoneId = TimeZoneId;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.timeZoneId);
        super.requestRebind();
    }
    public void setIsMapFeatureEnabled(@Nullable java.lang.Boolean IsMapFeatureEnabled) {
        this.mIsMapFeatureEnabled = IsMapFeatureEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isMapFeatureEnabled);
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
        com.google.samples.apps.iosched.model.userdata.UserSession userSession = mUserSession;
        com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = mEventListener;
        com.google.samples.apps.iosched.model.Room userSessionSessionRoom = null;
        java.lang.String userSessionSessionRoomName = null;
        boolean userSessionUserEventIsStarredUserSessionUserEventIsReservedBooleanFalse = false;
        boolean userSessionUserEventIsStarred = false;
        boolean userSessionUserEventIsReserved = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsMapFeatureEnabled = false;
        org.threeten.bp.ZonedDateTime userSessionSessionEndTime = null;
        org.threeten.bp.ZoneId timeZoneId = mTimeZoneId;
        com.google.samples.apps.iosched.model.Session userSessionSession = null;
        boolean UserSessionUserEventIsReserved1 = false;
        java.lang.Boolean isMapFeatureEnabled = mIsMapFeatureEnabled;
        org.threeten.bp.ZonedDateTime userSessionSessionStartTime = null;
        com.google.samples.apps.iosched.model.userdata.UserEvent userSessionUserEvent = null;
        java.lang.String userSessionSessionTitle = null;

        if ((dirtyFlags & 0x15L) != 0) {



                if (userSession != null) {
                    // read userSession.session
                    userSessionSession = userSession.getSession();
                }

            if ((dirtyFlags & 0x11L) != 0) {

                    if (userSessionSession != null) {
                        // read userSession.session.room
                        userSessionSessionRoom = userSessionSession.getRoom();
                        // read userSession.session.title
                        userSessionSessionTitle = userSessionSession.getTitle();
                    }


                    if (userSessionSessionRoom != null) {
                        // read userSession.session.room.name
                        userSessionSessionRoomName = userSessionSessionRoom.getName();
                    }
            }

                if (userSessionSession != null) {
                    // read userSession.session.endTime
                    userSessionSessionEndTime = userSessionSession.getEndTime();
                    // read userSession.session.startTime
                    userSessionSessionStartTime = userSessionSession.getStartTime();
                }
            if ((dirtyFlags & 0x11L) != 0) {

                    if (userSession != null) {
                        // read userSession.userEvent
                        userSessionUserEvent = userSession.getUserEvent();
                    }


                    if (userSessionUserEvent != null) {
                        // read userSession.userEvent.isStarred
                        userSessionUserEventIsStarred = userSessionUserEvent.isStarred();
                        // read userSession.userEvent.isReserved
                        UserSessionUserEventIsReserved1 = userSessionUserEvent.isReserved();
                    }
                if((dirtyFlags & 0x11L) != 0) {
                    if(userSessionUserEventIsStarred) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isMapFeatureEnabled)
                androidxDatabindingViewDataBindingSafeUnboxIsMapFeatureEnabled = androidx.databinding.ViewDataBinding.safeUnbox(isMapFeatureEnabled);
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                // read !userSession.userEvent.isReserved
                userSessionUserEventIsReserved = !UserSessionUserEventIsReserved1;
        }

        if ((dirtyFlags & 0x11L) != 0) {

                // read userSession.userEvent.isStarred ? !userSession.userEvent.isReserved : false
                userSessionUserEventIsStarredUserSessionUserEventIsReservedBooleanFalse = ((userSessionUserEventIsStarred) ? (userSessionUserEventIsReserved) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.detailsButton.setOnClickListener(mCallback11);
            this.mapButton.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.location, userSessionSessionRoomName);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.reservedIcon, UserSessionUserEventIsReserved1);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.starredIcon, userSessionUserEventIsStarredUserSessionUserEventIsReservedBooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, userSessionSessionTitle);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.mapButton, androidxDatabindingViewDataBindingSafeUnboxIsMapFeatureEnabled);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.feed.FeedSessionsViewBinderKt.sessionTime(this.time, userSessionSessionStartTime, userSessionSessionEndTime, timeZoneId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // userSession
                com.google.samples.apps.iosched.model.userdata.UserSession userSession = mUserSession;
                // userSession.session
                com.google.samples.apps.iosched.model.Session userSessionSession = null;
                // eventListener
                com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = mEventListener;
                // eventListener != null
                boolean eventListenerJavaLangObjectNull = false;
                // userSession.session.id
                java.lang.String userSessionSessionId = null;
                // userSession != null
                boolean userSessionJavaLangObjectNull = false;
                // userSession.session != null
                boolean userSessionSessionJavaLangObjectNull = false;



                eventListenerJavaLangObjectNull = (eventListener) != (null);
                if (eventListenerJavaLangObjectNull) {



                    userSessionJavaLangObjectNull = (userSession) != (null);
                    if (userSessionJavaLangObjectNull) {


                        userSessionSession = userSession.getSession();

                        userSessionSessionJavaLangObjectNull = (userSessionSession) != (null);
                        if (userSessionSessionJavaLangObjectNull) {


                            userSessionSessionId = userSessionSession.getId();

                            eventListener.openEventDetail(userSessionSessionId);
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // userSession
                com.google.samples.apps.iosched.model.userdata.UserSession userSession = mUserSession;
                // userSession.session
                com.google.samples.apps.iosched.model.Session userSessionSession = null;
                // eventListener
                com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = mEventListener;
                // eventListener != null
                boolean eventListenerJavaLangObjectNull = false;
                // userSession != null
                boolean userSessionJavaLangObjectNull = false;



                eventListenerJavaLangObjectNull = (eventListener) != (null);
                if (eventListenerJavaLangObjectNull) {



                    userSessionJavaLangObjectNull = (userSession) != (null);
                    if (userSessionJavaLangObjectNull) {


                        userSessionSession = userSession.getSession();

                        eventListener.openMapForSession(userSessionSession);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userSession
        flag 1 (0x2L): eventListener
        flag 2 (0x3L): timeZoneId
        flag 3 (0x4L): isMapFeatureEnabled
        flag 4 (0x5L): null
        flag 5 (0x6L): userSession.userEvent.isStarred ? !userSession.userEvent.isReserved : false
        flag 6 (0x7L): userSession.userEvent.isStarred ? !userSession.userEvent.isReserved : false
    flag mapping end*/
    //end
}