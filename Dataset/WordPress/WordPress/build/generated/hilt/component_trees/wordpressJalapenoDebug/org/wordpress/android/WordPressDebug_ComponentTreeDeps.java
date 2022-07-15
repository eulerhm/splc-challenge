package org.wordpress.android;

import dagger.hilt.internal.aggregatedroot.codegen._org_wordpress_android_WordPressDebug;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;
import hilt_aggregated_deps._org_wordpress_android_WordPressDebug_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_modules_AppComponent;
import hilt_aggregated_deps._org_wordpress_android_modules_AppConfigModule;
import hilt_aggregated_deps._org_wordpress_android_modules_ApplicationModule;
import hilt_aggregated_deps._org_wordpress_android_modules_CrashLoggingModule;
import hilt_aggregated_deps._org_wordpress_android_modules_ExperimentModule;
import hilt_aggregated_deps._org_wordpress_android_modules_FluxCModule;
import hilt_aggregated_deps._org_wordpress_android_modules_HiltWrapper_ViewModelModule;
import hilt_aggregated_deps._org_wordpress_android_modules_InterceptorModule;
import hilt_aggregated_deps._org_wordpress_android_modules_LegacyModule;
import hilt_aggregated_deps._org_wordpress_android_modules_LoginAnalyticsModule;
import hilt_aggregated_deps._org_wordpress_android_modules_LoginModule;
import hilt_aggregated_deps._org_wordpress_android_modules_SupportModule;
import hilt_aggregated_deps._org_wordpress_android_modules_ThreadModule;
import hilt_aggregated_deps._org_wordpress_android_modules_TrackerModule;
import hilt_aggregated_deps._org_wordpress_android_ui_main_WPMainActivity_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_prefs_accountsettings_module_AccountSettingsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_qrcodeauth_QRCodeAuthActivity_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_qrcodeauth_QRCodeAuthFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_qrcodeauth_QRCodeAuthViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_qrcodeauth_QRCodeAuthViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_SiteCreationActivity_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_SiteCreationMainVM_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_SiteCreationMainVM_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_domains_SiteCreationDomainsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_domains_SiteCreationDomainsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_domains_SiteCreationDomainsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_previews_SiteCreationPreviewFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_previews_SitePreviewViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_previews_SitePreviewViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_sitename_SiteCreationSiteNameFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_sitename_SiteCreationSiteNameViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_sitename_SiteCreationSiteNameViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_theme_HomePagePickerFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_theme_HomePagePickerViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_theme_HomePagePickerViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_verticals_SiteCreationIntentsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_verticals_SiteCreationIntentsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_sitecreation_verticals_SiteCreationIntentsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_intro_StatsNewFeatureIntroViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_intro_StatsNewFeatureIntroViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_intro_StatsNewFeaturesIntroDialogFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_LineChartMarkerView_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_StatsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_StatsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_StatsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_StatsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_StatsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_lists_detail_InsightsDetailFragment_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_lists_detail_InsightsDetailViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_lists_detail_InsightsDetailViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_wordpress_android_ui_stats_refresh_lists_detail_StatsDetailActivity_GeneratedInjector;
import hilt_aggregated_deps._org_wordpress_android_ui_suggestion_SuggestionSourceSubcomponent_SuggestionSourceModule;

@ComponentTreeDeps(
    rootDeps = _org_wordpress_android_WordPressDebug.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint.class,
        _dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class,
        _org_wordpress_android_WordPressDebug_GeneratedInjector.class,
        _org_wordpress_android_modules_AppComponent.class,
        _org_wordpress_android_modules_AppConfigModule.class,
        _org_wordpress_android_modules_ApplicationModule.class,
        _org_wordpress_android_modules_CrashLoggingModule.class,
        _org_wordpress_android_modules_ExperimentModule.class,
        _org_wordpress_android_modules_FluxCModule.class,
        _org_wordpress_android_modules_HiltWrapper_ViewModelModule.class,
        _org_wordpress_android_modules_InterceptorModule.class,
        _org_wordpress_android_modules_LegacyModule.class,
        _org_wordpress_android_modules_LoginAnalyticsModule.class,
        _org_wordpress_android_modules_LoginModule.class,
        _org_wordpress_android_modules_SupportModule.class,
        _org_wordpress_android_modules_ThreadModule.class,
        _org_wordpress_android_modules_TrackerModule.class,
        _org_wordpress_android_ui_main_WPMainActivity_GeneratedInjector.class,
        _org_wordpress_android_ui_prefs_accountsettings_module_AccountSettingsModule.class,
        _org_wordpress_android_ui_qrcodeauth_QRCodeAuthActivity_GeneratedInjector.class,
        _org_wordpress_android_ui_qrcodeauth_QRCodeAuthFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_qrcodeauth_QRCodeAuthViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_qrcodeauth_QRCodeAuthViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_sitecreation_SiteCreationActivity_GeneratedInjector.class,
        _org_wordpress_android_ui_sitecreation_SiteCreationMainVM_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_sitecreation_SiteCreationMainVM_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_sitecreation_domains_SiteCreationDomainsFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_sitecreation_domains_SiteCreationDomainsViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_sitecreation_domains_SiteCreationDomainsViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_sitecreation_previews_SiteCreationPreviewFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_sitecreation_previews_SitePreviewViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_sitecreation_previews_SitePreviewViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_sitecreation_sitename_SiteCreationSiteNameFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_sitecreation_sitename_SiteCreationSiteNameViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_sitecreation_sitename_SiteCreationSiteNameViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_sitecreation_theme_HomePagePickerFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_sitecreation_theme_HomePagePickerViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_sitecreation_theme_HomePagePickerViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_sitecreation_verticals_SiteCreationIntentsFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_sitecreation_verticals_SiteCreationIntentsViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_sitecreation_verticals_SiteCreationIntentsViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_stats_intro_StatsNewFeatureIntroViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_stats_intro_StatsNewFeatureIntroViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_stats_intro_StatsNewFeaturesIntroDialogFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_stats_refresh_LineChartMarkerView_GeneratedInjector.class,
        _org_wordpress_android_ui_stats_refresh_StatsActivity_GeneratedInjector.class,
        _org_wordpress_android_ui_stats_refresh_StatsFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_stats_refresh_StatsModule.class,
        _org_wordpress_android_ui_stats_refresh_StatsViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_stats_refresh_StatsViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_stats_refresh_lists_detail_InsightsDetailFragment_GeneratedInjector.class,
        _org_wordpress_android_ui_stats_refresh_lists_detail_InsightsDetailViewModel_HiltModules_BindsModule.class,
        _org_wordpress_android_ui_stats_refresh_lists_detail_InsightsDetailViewModel_HiltModules_KeyModule.class,
        _org_wordpress_android_ui_stats_refresh_lists_detail_StatsDetailActivity_GeneratedInjector.class,
        _org_wordpress_android_ui_suggestion_SuggestionSourceSubcomponent_SuggestionSourceModule.class
    }
)
public final class WordPressDebug_ComponentTreeDeps {
}