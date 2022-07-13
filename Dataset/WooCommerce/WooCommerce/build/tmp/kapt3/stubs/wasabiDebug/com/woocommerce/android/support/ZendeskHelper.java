package com.woocommerce.android.support;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J@\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0010\b\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*H\u0007J\b\u0010+\u001a\u00020\u001fH\u0002J\u0006\u0010,\u001a\u00020\u001fJ\b\u0010-\u001a\u00020\u001fH\u0002J\u0018\u0010.\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u000eJ(\u00100\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f02H\u0002J\u0006\u00103\u001a\u00020\u001fJ\u0010\u00104\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u00010\u000eJ2\u00106\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\nH\u0007J@\u0010;\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u0010\b\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*J>\u0010<\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0010\b\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006="}, d2 = {"Lcom/woocommerce/android/support/ZendeskHelper;", "", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "supportHelper", "Lcom/woocommerce/android/support/SupportHelper;", "(Lorg/wordpress/android/fluxc/store/AccountStore;Lorg/wordpress/android/fluxc/store/SiteStore;Lcom/woocommerce/android/support/SupportHelper;)V", "isIdentitySet", "", "()Z", "isZendeskEnabled", "supportEmail", "", "supportName", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "timer$delegate", "Lkotlin/Lazy;", "zendeskInstance", "Lzendesk/core/Zendesk;", "getZendeskInstance", "()Lzendesk/core/Zendesk;", "zendeskPushRegistrationProvider", "Lzendesk/core/PushRegistrationProvider;", "getZendeskPushRegistrationProvider", "()Lzendesk/core/PushRegistrationProvider;", "clearIdentity", "", "createNewTicket", "context", "Landroid/content/Context;", "origin", "Lcom/woocommerce/android/support/HelpActivity$Origin;", "selectedSite", "Lorg/wordpress/android/fluxc/model/SiteModel;", "extraTags", "", "ticketType", "Lcom/woocommerce/android/support/TicketType;", "disablePushNotifications", "enablePushNotifications", "refreshIdentity", "refreshRequest", "requestId", "requireIdentity", "onIdentitySet", "Lkotlin/Function0;", "reset", "setSupportEmail", "email", "setupZendesk", "zendeskUrl", "applicationId", "oauthClientId", "enableLogs", "showAllTickets", "showZendeskHelpCenter", "WooCommerce_wasabiDebug"})
public final class ZendeskHelper {
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final org.wordpress.android.fluxc.store.SiteStore siteStore = null;
    private final com.woocommerce.android.support.SupportHelper supportHelper = null;
    private final kotlin.Lazy timer$delegate = null;
    
    /**
     * These two properties are used to keep track of the Zendesk identity set. Since we allow users' to change their
     * supportEmail and reset their identity on logout, we need to ensure that the correct identity is set all times.
     * Check [requireIdentity], [refreshIdentity] & [clearIdentity] for more details about how Zendesk identity works.
     */
    private java.lang.String supportEmail;
    private java.lang.String supportName;
    
    public ZendeskHelper(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.SiteStore siteStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.support.SupportHelper supportHelper) {
        super();
    }
    
    private final zendesk.core.Zendesk getZendeskInstance() {
        return null;
    }
    
    private final boolean isZendeskEnabled() {
        return false;
    }
    
    private final zendesk.core.PushRegistrationProvider getZendeskPushRegistrationProvider() {
        return null;
    }
    
    private final java.util.Timer getTimer() {
        return null;
    }
    
    private final boolean isIdentitySet() {
        return false;
    }
    
    /**
     * This function sets up the Zendesk singleton instance with the passed in credentials. This step is required
     * for the rest of Zendesk functions to work and it should only be called once, probably during the Application
     * setup. It'll also enable Zendesk logs for DEBUG builds.
     */
    @kotlin.jvm.JvmOverloads
    public final void setupZendesk(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String zendeskUrl, @org.jetbrains.annotations.NotNull
    java.lang.String applicationId, @org.jetbrains.annotations.NotNull
    java.lang.String oauthClientId) {
    }
    
    /**
     * This function sets up the Zendesk singleton instance with the passed in credentials. This step is required
     * for the rest of Zendesk functions to work and it should only be called once, probably during the Application
     * setup. It'll also enable Zendesk logs for DEBUG builds.
     */
    @kotlin.jvm.JvmOverloads
    public final void setupZendesk(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String zendeskUrl, @org.jetbrains.annotations.NotNull
    java.lang.String applicationId, @org.jetbrains.annotations.NotNull
    java.lang.String oauthClientId, boolean enableLogs) {
    }
    
    /**
     * This function shows the Zendesk Help Center. It doesn't require a valid identity. If the support identity is
     * available it'll be used and the "New Ticket" button will be available, if not, it'll work with an anonymous
     * identity. The configuration will only be passed in if the identity is available, as it's only required if
     * the user contacts us through it.
     */
    public final void showZendeskHelpCenter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.support.HelpActivity.Origin origin, @org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.SiteModel selectedSite, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> extraTags, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.support.TicketType ticketType) {
    }
    
    /**
     * This function creates a new ticket. It'll force a valid identity, so if the user doesn't have one set, a dialog
     * will be shown where the user will need to enter an email and a name. If they cancel the dialog, the ticket
     * creation will be canceled as well. A Zendesk configuration is passed in as it's required for ticket creation.
     */
    @kotlin.jvm.JvmOverloads
    public final void createNewTicket(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.support.HelpActivity.Origin origin, @org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.SiteModel selectedSite) {
    }
    
    /**
     * This function creates a new ticket. It'll force a valid identity, so if the user doesn't have one set, a dialog
     * will be shown where the user will need to enter an email and a name. If they cancel the dialog, the ticket
     * creation will be canceled as well. A Zendesk configuration is passed in as it's required for ticket creation.
     */
    @kotlin.jvm.JvmOverloads
    public final void createNewTicket(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.support.HelpActivity.Origin origin, @org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.SiteModel selectedSite, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> extraTags) {
    }
    
    /**
     * This function creates a new ticket. It'll force a valid identity, so if the user doesn't have one set, a dialog
     * will be shown where the user will need to enter an email and a name. If they cancel the dialog, the ticket
     * creation will be canceled as well. A Zendesk configuration is passed in as it's required for ticket creation.
     */
    @kotlin.jvm.JvmOverloads
    public final void createNewTicket(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.support.HelpActivity.Origin origin, @org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.SiteModel selectedSite, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> extraTags, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.support.TicketType ticketType) {
    }
    
    /**
     * This function shows the user's ticket list. It'll force a valid identity, so if the user doesn't have one set,
     * a dialog will be shown where the user will need to enter an email and a name. If they cancel the dialog,
     * ticket list will not be shown. A Zendesk configuration is passed in as it's required for ticket creation.
     */
    public final void showAllTickets(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.support.HelpActivity.Origin origin, @org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.SiteModel selectedSite, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> extraTags, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.support.TicketType ticketType) {
    }
    
    /**
     * This function refreshes the Zendesk's request activity if it's currently being displayed. It'll return true if
     * it's successful. We'll use the return value to decide whether to show a push notification or not.
     */
    public final boolean refreshRequest(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String requestId) {
        return false;
    }
    
    /**
     * This function should be called when the user logs out of WordPress.com. Push notifications are only available
     * for WordPress.com users, so they'll be disabled. We'll also clear the Zendesk identity of the user on logout
     * and it will need to be set again when the user wants to create a new ticket.
     */
    public final void reset() {
    }
    
    /**
     * This function will enable push notifications for Zendesk. Both a Zendesk identity and a valid push
     * notification device token is required. If either doesn't exist, the request will simply be ignored.
     */
    public final void enablePushNotifications() {
    }
    
    /**
     * This function will disable push notifications for Zendesk.
     */
    private final void disablePushNotifications() {
    }
    
    /**
     * This function provides a way to change the support email for the Zendesk identity. Due to the way Zendesk
     * anonymous identity works, this will reset the users' tickets.
     */
    public final void setSupportEmail(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    /**
     * This is a helper function which provides an easy way to make sure a Zendesk identity is set before running a
     * piece of code. It'll check the existence of the identity and call the callback if it's already available.
     * Otherwise, it'll show a dialog for the user to enter an email and name through a helper function which then
     * will be used to set the identity and call the callback. It'll also try to enable the push notifications.
     */
    private final void requireIdentity(android.content.Context context, org.wordpress.android.fluxc.model.SiteModel selectedSite, kotlin.jvm.functions.Function0<kotlin.Unit> onIdentitySet) {
    }
    
    /**
     * This is a helper function that'll ensure the Zendesk identity is set with the credentials from AppPrefs.
     */
    private final void refreshIdentity() {
    }
    
    /**
     * This is a helper function to clear the Zendesk identity. It'll remove the credentials from AppPrefs and update
     * the Zendesk identity with a new anonymous one without an email or name. Due to the way Zendesk anonymous identity
     * works, this will clear all the users' tickets.
     */
    private final void clearIdentity() {
    }
}