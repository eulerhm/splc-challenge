package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/util/FileDownloader;", "", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "downloadFile", "", "url", "", "destinationFile", "Ljava/io/File;", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_vanillaDebug"})
public final class FileDownloader {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    
    @javax.inject.Inject()
    public FileDownloader(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers) {
        super();
    }
    
    /**
     * Download the content of the specified url to the [destinationFile]
     *
     * @return true if the download succeeded and false otherwise
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
    public final java.lang.Object downloadFile(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.io.File destinationFile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}