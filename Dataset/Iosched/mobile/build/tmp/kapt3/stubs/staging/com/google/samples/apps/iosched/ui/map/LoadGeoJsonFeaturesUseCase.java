package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

/**
 * Use case that loads a GeoJsonLayer and its features.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J)\u0010\u0012\u001a\u00020\u00062\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/LoadGeoJsonFeaturesUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "Lkotlin/Pair;", "Lcom/google/android/gms/maps/GoogleMap;", "", "Lcom/google/samples/apps/iosched/ui/map/LoadGeoJsonParams;", "Lcom/google/samples/apps/iosched/ui/map/GeoJsonData;", "context", "Landroid/content/Context;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "buildFeatureMap", "", "", "Lcom/google/maps/android/data/geojson/GeoJsonFeature;", "layer", "Lcom/google/maps/android/data/geojson/GeoJsonLayer;", "execute", "parameters", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobile_staging"})
public final class LoadGeoJsonFeaturesUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<kotlin.Pair<? extends com.google.android.gms.maps.GoogleMap, ? extends java.lang.Integer>, com.google.samples.apps.iosched.ui.map.GeoJsonData> {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.google.android.gms.maps.GoogleMap, java.lang.Integer> parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.ui.map.GeoJsonData> p1) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, com.google.maps.android.data.geojson.GeoJsonFeature> buildFeatureMap(com.google.maps.android.data.geojson.GeoJsonLayer layer) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadGeoJsonFeaturesUseCase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}