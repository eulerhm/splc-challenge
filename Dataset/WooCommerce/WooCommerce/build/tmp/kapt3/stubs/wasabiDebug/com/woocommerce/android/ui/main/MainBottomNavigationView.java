package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0016\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020%J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020%H\u0002J\u000e\u0010*\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020%J\b\u0010+\u001a\u00020\u0018H\u0002J\u0016\u0010,\u001a\u00020\u001b*\u00020-2\b\b\u0001\u0010.\u001a\u00020%H\u0002R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/main/MainBottomNavigationView;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "Lcom/google/android/material/navigation/NavigationBarView$OnItemSelectedListener;", "Lcom/google/android/material/navigation/NavigationBarView$OnItemReselectedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lcom/woocommerce/android/ui/main/BottomNavigationPosition;", "currentPosition", "getCurrentPosition", "()Lcom/woocommerce/android/ui/main/BottomNavigationPosition;", "setCurrentPosition", "(Lcom/woocommerce/android/ui/main/BottomNavigationPosition;)V", "listener", "Lcom/woocommerce/android/ui/main/MainBottomNavigationView$MainNavigationListener;", "moreMenuBadge", "Lcom/google/android/material/badge/BadgeDrawable;", "navController", "Landroidx/navigation/NavController;", "ordersBadge", "addTopDivider", "", "assignNavigationListeners", "assign", "", "clearOrderBadgeCount", "createBadges", "init", "onNavigationItemReselected", "item", "Landroid/view/MenuItem;", "onNavigationItemSelected", "restoreSelectedItemState", "itemId", "", "setOrderBadgeCount", "count", "showBadge", "badgeDrawable", "showMoreMenuBadge", "updateVisibilities", "matchDestination", "Landroidx/navigation/NavDestination;", "destId", "MainNavigationListener", "WooCommerce_wasabiDebug"})
public final class MainBottomNavigationView extends com.google.android.material.bottomnavigation.BottomNavigationView implements com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener, com.google.android.material.navigation.NavigationBarView.OnItemReselectedListener {
    private androidx.navigation.NavController navController;
    private com.woocommerce.android.ui.main.MainBottomNavigationView.MainNavigationListener listener;
    private com.google.android.material.badge.BadgeDrawable ordersBadge;
    private com.google.android.material.badge.BadgeDrawable moreMenuBadge;
    
    @kotlin.jvm.JvmOverloads
    public MainBottomNavigationView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MainBottomNavigationView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.main.BottomNavigationPosition getCurrentPosition() {
        return null;
    }
    
    public final void setCurrentPosition(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.main.BottomNavigationPosition value) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.main.MainBottomNavigationView.MainNavigationListener listener) {
    }
    
    private final void createBadges() {
    }
    
    /**
     * When we changed the background to white, the top shadow provided by BottomNavigationView wasn't
     * dark enough to provide enough separation between the bar and the content above it. For this
     * reason we add a darker top divider here.
     */
    private final void addTopDivider() {
    }
    
    /**
     * For use when restoring the navigation bar after the host activity
     * state has been restored.
     */
    public final void restoreSelectedItemState(int itemId) {
    }
    
    public final void showMoreMenuBadge(int count) {
    }
    
    public final void setOrderBadgeCount(int count) {
    }
    
    private final void showBadge(com.google.android.material.badge.BadgeDrawable badgeDrawable, int count) {
    }
    
    public final void clearOrderBadgeCount() {
    }
    
    @java.lang.Override
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onNavigationItemReselected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
    }
    
    private final void assignNavigationListeners(boolean assign) {
    }
    
    private final void updateVisibilities() {
    }
    
    private final boolean matchDestination(androidx.navigation.NavDestination $this$matchDestination, @androidx.annotation.IdRes
    int destId) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/main/MainBottomNavigationView$MainNavigationListener;", "", "onNavItemReselected", "", "navPos", "Lcom/woocommerce/android/ui/main/BottomNavigationPosition;", "onNavItemSelected", "WooCommerce_wasabiDebug"})
    public static abstract interface MainNavigationListener {
        
        public abstract void onNavItemSelected(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.main.BottomNavigationPosition navPos);
        
        public abstract void onNavItemReselected(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.main.BottomNavigationPosition navPos);
    }
}