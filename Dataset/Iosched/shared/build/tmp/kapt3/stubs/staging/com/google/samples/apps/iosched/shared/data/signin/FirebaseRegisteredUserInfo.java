package com.google.samples.apps.iosched.shared.data.signin;

import java.lang.System;

/**
 * Delegates [AuthenticatedUserInfo] calls to a [FirebaseUser] to be used in production.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\nJ\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u0013H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0002\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u001c"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/FirebaseRegisteredUserInfo;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "basicUserInfo", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;", "isRegistered", "", "(Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCreationTimestamp", "", "()Ljava/lang/Long;", "getDisplayName", "", "getEmail", "getLastSignInTimestamp", "getPhoneNumber", "getPhotoUrl", "Landroid/net/Uri;", "getProviderData", "", "Lcom/google/firebase/auth/UserInfo;", "getProviderId", "getUid", "isAnonymous", "()Ljava/lang/Boolean;", "isEmailVerified", "isRegistrationDataReady", "isSignedIn", "shared_staging"})
public final class FirebaseRegisteredUserInfo implements com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo {
    private final com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic basicUserInfo = null;
    private final java.lang.Boolean isRegistered = null;
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<? extends com.google.firebase.auth.UserInfo> getProviderData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean isAnonymous() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean isEmailVerified() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.net.Uri getPhotoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getProviderId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getLastSignInTimestamp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getCreationTimestamp() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRegistrationDataReady() {
        return false;
    }
    
    public FirebaseRegisteredUserInfo(@org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic basicUserInfo, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isRegistered) {
        super();
    }
}