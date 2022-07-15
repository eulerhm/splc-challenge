package hilt_aggregated_deps;

import dagger.hilt.processor.internal.aggregateddeps.AggregatedDeps;

/**
 * This class should only be referenced by generated code! This class aggregates information across multiple compilations.
 */
@AggregatedDeps(
    components = "dagger.hilt.components.SingletonComponent",
    replaces = "org.wordpress.android.modules.TrackerModule",
    modules = "org.wordpress.android.modules.TrackerTestModule"
)
public class _org_wordpress_android_modules_TrackerTestModule {
}