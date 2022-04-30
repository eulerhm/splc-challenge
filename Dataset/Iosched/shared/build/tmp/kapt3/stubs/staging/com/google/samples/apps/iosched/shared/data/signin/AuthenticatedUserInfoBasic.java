package com.google.samples.apps.iosched.shared.data.signin;

import java.lang.System;

/**
 * Basic user info.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\rH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0006H&J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0012H&\u00a8\u0006\u0016"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;", "", "getCreationTimestamp", "", "()Ljava/lang/Long;", "getDisplayName", "", "getEmail", "getLastSignInTimestamp", "getPhoneNumber", "getPhotoUrl", "Landroid/net/Uri;", "getProviderData", "", "Lcom/google/firebase/auth/UserInfo;", "getProviderId", "getUid", "isAnonymous", "", "()Ljava/lang/Boolean;", "isEmailVerified", "isSignedIn", "shared_staging"})
public abstract interface AuthenticatedUserInfoBasic {
    
    public abstract boolean isSignedIn();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getEmail();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<? extends com.google.firebase.auth.UserInfo> getProviderData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getLastSignInTimestamp();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getCreationTimestamp();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean isAnonymous();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getPhoneNumber();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUid();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean isEmailVerified();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getDisplayName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.net.Uri getPhotoUrl();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getProviderId();
}