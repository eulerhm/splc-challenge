package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemFeedSocialChannelsBindingImpl extends ItemFeedSocialChannelsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.end_guideline, 7);
        sViewsWithIds.put(R.id.start_guideline, 8);
        sViewsWithIds.put(R.id.message, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemFeedSocialChannelsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemFeedSocialChannelsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.ImageButton) bindings[6]
            );
        this.facebookButton.setTag(null);
        this.googleDevsButton.setTag(null);
        this.instagramButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
        this.twitterButton.setTag(null);
        this.youtubeButton.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
        if ((dirtyFlags & 0x1L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.facebookButton, facebookButton.getResources().getString(R.string.feed_social_facebook_link), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.googleDevsButton, googleDevsButton.getResources().getString(R.string.feed_social_google_devs_link), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.instagramButton, instagramButton.getResources().getString(R.string.feed_social_instagram_link), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.title, title.getResources().getString(R.string.feed_social_twitter_hashtag_link), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.twitterButton, twitterButton.getResources().getString(R.string.feed_social_twitter_link), (boolean)false);
            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.websiteLink(this.youtubeButton, youtubeButton.getResources().getString(R.string.feed_social_youtube_link), (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}