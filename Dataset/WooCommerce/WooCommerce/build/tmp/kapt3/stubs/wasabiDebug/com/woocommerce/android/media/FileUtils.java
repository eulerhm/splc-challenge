package com.woocommerce.android.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/media/FileUtils;", "", "()V", "createTempTimeStampedFile", "Ljava/io/File;", "storageDir", "prefix", "", "fileExtension", "writeContentToFile", "file", "content", "", "WooCommerce_wasabiDebug"})
public final class FileUtils {
    
    @javax.inject.Inject
    public FileUtils() {
        super();
    }
    
    /**
     * Creates a temp file with the filename having the format: "{[prefix]}_{yyyyMMdd_HHmmss}.{[fileExtension]}"
     * in the specified [storageDir]
     */
    @org.jetbrains.annotations.Nullable
    public final java.io.File createTempTimeStampedFile(@org.jetbrains.annotations.NotNull
    java.io.File storageDir, @org.jetbrains.annotations.NotNull
    java.lang.String prefix, @org.jetbrains.annotations.NotNull
    java.lang.String fileExtension) {
        return null;
    }
    
    /**
     * Writes content to the file.
     * If the file already exists, its content will be overwritten
     */
    @org.jetbrains.annotations.Nullable
    public final java.io.File writeContentToFile(@org.jetbrains.annotations.NotNull
    java.io.File file, @org.jetbrains.annotations.NotNull
    byte[] content) {
        return null;
    }
}