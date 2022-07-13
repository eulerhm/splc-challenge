package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"}, d2 = {"getCommentId", "", "Lorg/wordpress/android/fluxc/model/notification/NotificationModel;", "WooCommerce_vanillaDebug"})
public final class NotificationModelExtKt {
    
    /**
     * Returns the remote comment_id associated with this notification. Product reviews are comments under the
     * hood so only parse the comment_id if the notification is a product review. This id can be used to fetch
     * the [org.wordpress.android.fluxc.model.CommentModel] from the API which is required for moderating the
     * review.
     */
    public static final long getCommentId(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.notification.NotificationModel $this$getCommentId) {
        return 0L;
    }
}