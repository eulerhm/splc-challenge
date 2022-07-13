package com.woocommerce.android.model;

import java.lang.System;

/**
 * Represents the various stages of an action. An action is defined as any request to modify store data.
 * And example of an action would be a user moderating a review or a marking a review as read. The options
 * in this enum are used to communicate the status of processing this action to the UI in a
 * meaningful way.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/model/ActionStatus;", "", "(Ljava/lang/String;I)V", "isComplete", "", "PENDING", "SUBMITTED", "SUCCESS", "ERROR", "WooCommerce_vanillaDebug"})
public enum ActionStatus {
    /*public static final*/ PENDING /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/model/ActionStatus$PENDING;", "Lcom/woocommerce/android/model/ActionStatus;", "isComplete", "", "WooCommerce_vanillaDebug"}) PENDING(){
    
    PENDING() {
        super();
    }
    
    @java.lang.Override()
    public boolean isComplete() {
        return false;
    }
} */,
    /*public static final*/ SUBMITTED /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/model/ActionStatus$SUBMITTED;", "Lcom/woocommerce/android/model/ActionStatus;", "isComplete", "", "WooCommerce_vanillaDebug"}) SUBMITTED(){
    
    SUBMITTED() {
        super();
    }
    
    @java.lang.Override()
    public boolean isComplete() {
        return false;
    }
} */,
    /*public static final*/ SUCCESS /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/model/ActionStatus$SUCCESS;", "Lcom/woocommerce/android/model/ActionStatus;", "isComplete", "", "WooCommerce_vanillaDebug"}) SUCCESS(){
    
    SUCCESS() {
        super();
    }
    
    @java.lang.Override()
    public boolean isComplete() {
        return false;
    }
} */,
    /*public static final*/ ERROR /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/model/ActionStatus$ERROR;", "Lcom/woocommerce/android/model/ActionStatus;", "isComplete", "", "WooCommerce_vanillaDebug"}) ERROR(){
    
    ERROR() {
        super();
    }
    
    @java.lang.Override()
    public boolean isComplete() {
        return false;
    }
} */;
    
    ActionStatus() {
    }
    
    /**
     * Helper method. Returns true if the associated status is considered "completed", all work
     * is finished and it either ended in success or error.
     */
    public abstract boolean isComplete();
}