package com.woocommerce.android.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/datastore/DataStoreQualifier;", "", "value", "Lcom/woocommerce/android/datastore/DataStoreType;", "()Lcom/woocommerce/android/datastore/DataStoreType;", "WooCommerce_wasabiDebug"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@javax.inject.Qualifier
public abstract @interface DataStoreQualifier {
    
    public abstract com.woocommerce.android.datastore.DataStoreType value();
}