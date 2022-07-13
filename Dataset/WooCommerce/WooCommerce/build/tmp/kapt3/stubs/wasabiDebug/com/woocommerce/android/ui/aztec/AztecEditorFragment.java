package com.woocommerce.android.ui.aztec;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\tH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\b\u0010\'\u001a\u00020\u0015H\u0016J\b\u0010(\u001a\u00020\tH\u0016J\b\u0010)\u001a\u00020\u0015H\u0016J\b\u0010*\u001a\u00020\u0015H\u0016J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/aztec/AztecEditorFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lorg/wordpress/aztec/toolbar/IAztecToolbarClickListener;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "Lorg/wordpress/aztec/IHistoryListener;", "()V", "aztec", "Lorg/wordpress/aztec/Aztec;", "isHtmlEditorEnabled", "", "navArgs", "Lcom/woocommerce/android/ui/aztec/AztecEditorFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/aztec/AztecEditorFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "editorHasChanges", "getEditorText", "", "getFragmentTitle", "navigateBackWithResult", "", "hasChanges", "onRedo", "onRedoEnabled", "onRequestAllowBackPress", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onStop", "onToolbarCollapseButtonClicked", "onToolbarExpandButtonClicked", "onToolbarFormatButtonClicked", "format", "Lorg/wordpress/aztec/ITextFormat;", "isKeyboardShortcut", "onToolbarHeadingButtonClicked", "onToolbarHtmlButtonClicked", "onToolbarListButtonClicked", "onToolbarMediaButtonClicked", "onUndo", "onUndoEnabled", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AztecEditorFragment extends com.woocommerce.android.ui.base.BaseFragment implements org.wordpress.aztec.toolbar.IAztecToolbarClickListener, com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener, org.wordpress.aztec.IHistoryListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.aztec.AztecEditorFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "AztecEditorFragment";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AZTEC_EDITOR_RESULT = "aztec_editor_result";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_AZTEC_REQUEST_CODE = "aztec-request-code";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_AZTEC_EDITOR_TEXT = "editor-text";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_AZTEC_HAS_CHANGES = "editor-has-changes";
    private static final java.lang.String FIELD_IS_HTML_EDITOR_ENABLED = "is_html_editor_enabled";
    private org.wordpress.aztec.Aztec aztec;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private boolean isHtmlEditorEnabled = false;
    
    public AztecEditorFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.aztec.AztecEditorFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @java.lang.Override
    public void onToolbarCollapseButtonClicked() {
    }
    
    @java.lang.Override
    public void onToolbarExpandButtonClicked() {
    }
    
    @java.lang.Override
    public void onToolbarFormatButtonClicked(@org.jetbrains.annotations.NotNull
    org.wordpress.aztec.ITextFormat format, boolean isKeyboardShortcut) {
    }
    
    @java.lang.Override
    public void onToolbarHeadingButtonClicked() {
    }
    
    @java.lang.Override
    public void onToolbarHtmlButtonClicked() {
    }
    
    @java.lang.Override
    public void onToolbarListButtonClicked() {
    }
    
    @java.lang.Override
    public boolean onToolbarMediaButtonClicked() {
        return false;
    }
    
    private final java.lang.String getEditorText() {
        return null;
    }
    
    private final boolean editorHasChanges() {
        return false;
    }
    
    private final void navigateBackWithResult(boolean hasChanges) {
    }
    
    @java.lang.Override
    public void onRedo() {
    }
    
    @java.lang.Override
    public void onRedoEnabled() {
    }
    
    @java.lang.Override
    public void onUndo() {
    }
    
    @java.lang.Override
    public void onUndoEnabled() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/aztec/AztecEditorFragment$Companion;", "", "()V", "ARG_AZTEC_EDITOR_TEXT", "", "ARG_AZTEC_HAS_CHANGES", "ARG_AZTEC_REQUEST_CODE", "AZTEC_EDITOR_RESULT", "FIELD_IS_HTML_EDITOR_ENABLED", "TAG", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}