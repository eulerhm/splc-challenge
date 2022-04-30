package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/AnnouncementsHeaderViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/FeedItemViewBinder;", "Lcom/google/samples/apps/iosched/ui/feed/AnnouncementsHeader;", "Lcom/google/samples/apps/iosched/ui/feed/AnnouncementsPreviewViewHolder;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "eventListener", "Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;", "(Landroidx/lifecycle/LifecycleOwner;Lcom/google/samples/apps/iosched/ui/feed/FeedEventListener;)V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "bindViewHolder", "", "model", "viewHolder", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getFeedItemType", "", "mobile_staging"})
public final class AnnouncementsHeaderViewBinder extends com.google.samples.apps.iosched.ui.feed.FeedItemViewBinder<com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader, com.google.samples.apps.iosched.ui.feed.AnnouncementsPreviewViewHolder> {
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.feed.AnnouncementsPreviewViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void bindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader model, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsPreviewViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public int getFeedItemType() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.AnnouncementsHeader newItem) {
        return false;
    }
    
    public AnnouncementsHeaderViewBinder(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.feed.FeedEventListener eventListener) {
        super(null);
    }
}