package com.woocommerce.android.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u000fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u000fJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u0007J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020\u000fJ\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/helpers/WCMatchers;", "", "()V", "matchesError", "Lorg/hamcrest/Matcher;", "Landroid/view/View;", "error", "", "matchesHasNoErrorText", "matchesRating", "rating", "", "matchesWithIndex", "matcher", "index", "", "scrollTo", "Landroidx/test/espresso/ViewAction;", "withDrawable", "resourceId", "withItemCount", "itemsCount", "withRecyclerView", "Lcom/woocommerce/android/helpers/RecyclerViewMatcher;", "recyclerViewId", "withSectionCount", "withTagBackgroundColor", "context", "Landroid/content/Context;", "color", "withTagText", "string", "withTagTextColor", "withTextColor", "expectedId", "withToolbarTitle", "textMatcher", "WooCommerce_vanillaDebug"})
public final class WCMatchers {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.helpers.WCMatchers INSTANCE = null;
    
    private WCMatchers() {
        super();
    }
    
    /**
     * Matcher for matching the support toolbar title text.
     * Found on SO: https://stackoverflow.com/a/45928732
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withToolbarTitle(@org.jetbrains.annotations.NotNull()
    org.hamcrest.Matcher<java.lang.String> textMatcher) {
        return null;
    }
    
    /**
     * Custom matcher to check if the [FlowLayout] has a child view
     * which is a [TextView] and matches the [TextView] text color
     * with the incoming color value
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withTagTextColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int color) {
        return null;
    }
    
    /**
     * Custom matcher to check if the [FlowLayout] has a child view
     * which is a [TextView] and matches the [TextView] background color
     * with the incoming color value
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withTagBackgroundColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int color) {
        return null;
    }
    
    /**
     * Custom matcher to check if the [FlowLayout] has a child view
     * which is a [TextView] and matches the [TextView] text
     * with the incoming String value
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withTagText(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    /**
     * Custom matcher to scroll to the bottom of the
     * view specified before performing an action on the view
     * Since the view might not be visible, scrollTo()
     * is used to this ensures that the view is displayed before
     * proceeding to the click() action
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.test.espresso.ViewAction scrollTo() {
        return null;
    }
    
    /**
     * Matcher to check if the listView count matches
     * the incoming count value
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withItemCount(int itemsCount) {
        return null;
    }
    
    /**
     * Custom matcher to check if the [SectionedRecyclerViewAdapter] section count matches
     * the incoming count value
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withSectionCount(int itemsCount) {
        return null;
    }
    
    /**
     * Returns a custom recyclerview matcher class for RecyclerView to
     * perform actions and matches on list items by position.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.helpers.RecyclerViewMatcher withRecyclerView(int recyclerViewId) {
        return null;
    }
    
    /**
     * Matcher to check if the textView text color matches
     * the incoming color
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withTextColor(int expectedId) {
        return null;
    }
    
    /**
     * Matcher to check if the ImageView drawable matches
     * the incoming drawable resource Id
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> withDrawable(int resourceId) {
        return null;
    }
    
    /**
     * Matcher to check if the Textview/EditText/Button
     * have error text that matches the incoming string
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> matchesError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
        return null;
    }
    
    /**
     * Matcher to check if the Textview/EditText/Button
     * have no error text and it is set to null
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> matchesHasNoErrorText() {
        return null;
    }
    
    /**
     * Matcher to get the particular view for a given id and get the view at a particular index provided.
     * For instance, in Product Detail page, we have multiple dynamic views for the same view ID.
     * Using this method, we can choose which view we want without causing an AmbiguousViewMatcherException
     * Reference: https://stackoverflow.com/a/39756832/9862062
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> matchesWithIndex(@org.jetbrains.annotations.NotNull()
    org.hamcrest.Matcher<android.view.View> matcher, int index) {
        return null;
    }
    
    /**
     * Matcher to check if the RatingBar have rating text that matches the incoming value
     */
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> matchesRating(float rating) {
        return null;
    }
}