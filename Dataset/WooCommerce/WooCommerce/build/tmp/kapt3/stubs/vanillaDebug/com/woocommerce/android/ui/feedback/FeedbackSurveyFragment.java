package com.woocommerce.android.ui.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0003J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\u001a\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010*\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010$H\u0016J\b\u0010+\u001a\u00020\u001bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/feedback/FeedbackSurveyFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentFeedbackSurveyBinding;", "arguments", "Lcom/woocommerce/android/ui/feedback/FeedbackSurveyFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/feedback/FeedbackSurveyFragmentArgs;", "arguments$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentFeedbackSurveyBinding;", "feedbackContext", "", "getFeedbackContext", "()Ljava/lang/String;", "feedbackContext$delegate", "Lkotlin/Lazy;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "surveyCompleted", "", "surveyWebViewClient", "Lcom/woocommerce/android/ui/feedback/FeedbackSurveyFragment$SurveyWebViewClient;", "completeSurvey", "", "configureWebView", "Landroid/webkit/WebView;", "hideProgressDialog", "onDestroy", "onDestroyView", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "onViewStateRestored", "showProgressDialog", "Companion", "SurveyWebViewClient", "WooCommerce_vanillaDebug"})
public final class FeedbackSurveyFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.feedback.FeedbackSurveyFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "feedback_survey";
    private static final java.lang.String QUERY_PARAMETER_MESSAGE = "msg";
    private static final java.lang.String SURVEY_DONE_QUERY_MESSAGE = "done";
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private boolean surveyCompleted = false;
    private final com.woocommerce.android.ui.feedback.FeedbackSurveyFragment.SurveyWebViewClient surveyWebViewClient = null;
    private final androidx.navigation.NavArgsLazy arguments$delegate = null;
    private final kotlin.Lazy feedbackContext$delegate = null;
    private com.woocommerce.android.databinding.FragmentFeedbackSurveyBinding _binding;
    
    public FeedbackSurveyFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.feedback.FeedbackSurveyFragmentArgs getArguments() {
        return null;
    }
    
    private final java.lang.String getFeedbackContext() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentFeedbackSurveyBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void showProgressDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    private final android.webkit.WebView configureWebView() {
        return null;
    }
    
    /**
     * We use this dismissAllowingStateLoss for dialog dismissal to avoid any kind of commit operation
     * from the [FragmentManager] after the `onSaveInstanceState` is called
     */
    private final void hideProgressDialog() {
    }
    
    private final void completeSurvey() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/feedback/FeedbackSurveyFragment$SurveyWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/woocommerce/android/ui/feedback/FeedbackSurveyFragment;)V", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "shouldOverrideUrlLoading", "", "request", "Landroid/webkit/WebResourceRequest;", "WooCommerce_vanillaDebug"})
    final class SurveyWebViewClient extends android.webkit.WebViewClient {
        
        public SurveyWebViewClient() {
            super();
        }
        
        @java.lang.Override()
        public void onPageFinished(@org.jetbrains.annotations.Nullable()
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
        }
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable()
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
        android.webkit.WebResourceRequest request) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/feedback/FeedbackSurveyFragment$Companion;", "", "()V", "QUERY_PARAMETER_MESSAGE", "", "SURVEY_DONE_QUERY_MESSAGE", "TAG", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}