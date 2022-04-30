package com.google.samples.apps.iosched.ui.speaker;

import androidx.recyclerview.widget.RecyclerView;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SpeakerFragment_MembersInjector implements MembersInjector<SpeakerFragment> {
  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider;

  public SpeakerFragment_MembersInjector(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider) {
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.tagRecycledViewPoolProvider = tagRecycledViewPoolProvider;
  }

  public static MembersInjector<SpeakerFragment> create(
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<RecyclerView.RecycledViewPool> tagRecycledViewPoolProvider) {
    return new SpeakerFragment_MembersInjector(snackbarMessageManagerProvider, analyticsHelperProvider, tagRecycledViewPoolProvider);
  }

  @Override
  public void injectMembers(SpeakerFragment instance) {
    injectSnackbarMessageManager(instance, snackbarMessageManagerProvider.get());
    injectAnalyticsHelper(instance, analyticsHelperProvider.get());
    injectTagRecycledViewPool(instance, tagRecycledViewPoolProvider.get());
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.speaker.SpeakerFragment.snackbarMessageManager")
  public static void injectSnackbarMessageManager(SpeakerFragment instance,
      SnackbarMessageManager snackbarMessageManager) {
    instance.snackbarMessageManager = snackbarMessageManager;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.speaker.SpeakerFragment.analyticsHelper")
  public static void injectAnalyticsHelper(SpeakerFragment instance,
      AnalyticsHelper analyticsHelper) {
    instance.analyticsHelper = analyticsHelper;
  }

  @InjectedFieldSignature("com.google.samples.apps.iosched.ui.speaker.SpeakerFragment.tagRecycledViewPool")
  @Named("tagViewPool")
  public static void injectTagRecycledViewPool(SpeakerFragment instance,
      RecyclerView.RecycledViewPool tagRecycledViewPool) {
    instance.tagRecycledViewPool = tagRecycledViewPool;
  }
}
