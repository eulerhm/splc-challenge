package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010-\u001a\u00020\rH\u00c6\u0003J\t\u0010.\u001a\u00020\u000fH\u00c6\u0003Jg\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\u0013\u00101\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\u000e\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tJ\u0006\u00106\u001a\u00020\u0003J\t\u00107\u001a\u00020\u0003H\u00d6\u0001J\t\u00108\u001a\u00020\tH\u00d6\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u0016\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/model/Notification;", "Landroid/os/Parcelable;", "noteId", "", "uniqueId", "", "remoteNoteId", "remoteSiteId", "icon", "", "noteTitle", "noteMessage", "noteType", "Lcom/woocommerce/android/push/WooNotificationType;", "channelType", "Lcom/woocommerce/android/push/NotificationChannelType;", "(IJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woocommerce/android/push/WooNotificationType;Lcom/woocommerce/android/push/NotificationChannelType;)V", "getChannelType", "()Lcom/woocommerce/android/push/NotificationChannelType;", "getIcon", "()Ljava/lang/String;", "isOrderNotification", "", "isOrderNotification$annotations", "()V", "()Z", "isReviewNotification", "isReviewNotification$annotations", "getNoteId", "()I", "getNoteMessage", "getNoteTitle", "getNoteType", "()Lcom/woocommerce/android/push/WooNotificationType;", "getRemoteNoteId", "()J", "getRemoteSiteId", "getUniqueId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getGroup", "channelId", "getGroupPushId", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
public final class Notification implements android.os.Parcelable {
    private final int noteId = 0;
    private final long uniqueId = 0L;
    private final long remoteNoteId = 0L;
    private final long remoteSiteId = 0L;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String noteTitle = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String noteMessage = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.push.WooNotificationType noteType = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.push.NotificationChannelType channelType = null;
    private final boolean isOrderNotification = false;
    private final boolean isReviewNotification = false;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Notification> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Notification copy(int noteId, long uniqueId, long remoteNoteId, long remoteSiteId, @org.jetbrains.annotations.Nullable
    java.lang.String icon, @org.jetbrains.annotations.NotNull
    java.lang.String noteTitle, @org.jetbrains.annotations.Nullable
    java.lang.String noteMessage, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.WooNotificationType noteType, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.NotificationChannelType channelType) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Notification(int noteId, long uniqueId, long remoteNoteId, long remoteSiteId, @org.jetbrains.annotations.Nullable
    java.lang.String icon, @org.jetbrains.annotations.NotNull
    java.lang.String noteTitle, @org.jetbrains.annotations.Nullable
    java.lang.String noteMessage, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.WooNotificationType noteType, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.NotificationChannelType channelType) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getNoteId() {
        return 0;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getUniqueId() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getRemoteNoteId() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getRemoteSiteId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNoteTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNoteMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.push.WooNotificationType component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.push.WooNotificationType getNoteType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.push.NotificationChannelType component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.push.NotificationChannelType getChannelType() {
        return null;
    }
    
    public final boolean isOrderNotification() {
        return false;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel
    @java.lang.Deprecated
    public static void isOrderNotification$annotations() {
    }
    
    public final boolean isReviewNotification() {
        return false;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel
    @java.lang.Deprecated
    public static void isReviewNotification$annotations() {
    }
    
    /**
     * Notifications are grouped based on the notification type and the store the notification belongs to.
     * @param channelId - string resource of [getChannelId]
     * remoteSiteId - remoteSiteId for the store the notification is from
     *
     * For instance: a new order notification from Store 1 with remoteSiteId = 12345, would return:
     * wooandroid_notification_channel_order_id 12345
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGroup(@org.jetbrains.annotations.NotNull
    java.lang.String channelId) {
        return null;
    }
    
    /**
     * This method returns a group notification id based on the notification type
     * and the store the notification belongs to
     */
    public final int getGroupPushId() {
        return 0;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Notification> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Notification createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Notification[] newArray(int size) {
            return null;
        }
    }
}