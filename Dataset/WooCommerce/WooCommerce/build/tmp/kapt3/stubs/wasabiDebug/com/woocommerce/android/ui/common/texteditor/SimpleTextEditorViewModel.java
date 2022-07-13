package com.woocommerce.android.ui.common.texteditor;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "navArgs", "Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "textLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "viewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorViewModel$ViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "onBackPressed", "", "onTextChanged", "text", "Companion", "SimpleTextEditorResult", "ViewState", "WooCommerce_wasabiDebug"})
public final class SimpleTextEditorViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel.Companion Companion = null;
    private static final java.lang.String TEXT_KEY = "text";
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> textLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject
    public SimpleTextEditorViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.common.texteditor.SimpleTextEditorFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel.ViewState> getViewState() {
        return null;
    }
    
    public final void onTextChanged(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    public final void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorViewModel$ViewState;", "", "text", "", "hint", "hasChanges", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getHasChanges", "()Z", "getHint", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String text = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String hint = null;
        private final boolean hasChanges = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        java.lang.String text, @org.jetbrains.annotations.NotNull
        java.lang.String hint, boolean hasChanges) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ViewState(@org.jetbrains.annotations.NotNull
        java.lang.String text, @org.jetbrains.annotations.NotNull
        java.lang.String hint, boolean hasChanges) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHint() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getHasChanges() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorViewModel$SimpleTextEditorResult;", "", "text", "", "requestCode", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getRequestCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorViewModel$SimpleTextEditorResult;", "equals", "", "other", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    public static final class SimpleTextEditorResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String text = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer requestCode = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.common.texteditor.SimpleTextEditorViewModel.SimpleTextEditorResult copy(@org.jetbrains.annotations.NotNull
        java.lang.String text, @org.jetbrains.annotations.Nullable
        java.lang.Integer requestCode) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SimpleTextEditorResult(@org.jetbrains.annotations.NotNull
        java.lang.String text, @org.jetbrains.annotations.Nullable
        java.lang.Integer requestCode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getRequestCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/common/texteditor/SimpleTextEditorViewModel$Companion;", "", "()V", "TEXT_KEY", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}