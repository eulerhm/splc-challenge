package com.haroldadmin.moonshot.features.search;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyController;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.haroldadmin.moonshot.base.MoonShotAsyncTypedEpoxyController;
import com.haroldadmin.moonshot.base.MoonShotState;
import com.haroldadmin.moonshot.base.MoonShotViewModel;
import com.haroldadmin.moonshot.features.launchDetails.LaunchDetailsFragmentArgs;
import com.haroldadmin.moonshot.features.launchPad.LaunchPadFragmentArgs;
import com.haroldadmin.moonshot.features.rocketDetails.RocketDetailsFragmentArgs;
import com.haroldadmin.moonshot.features.search.R;
import com.haroldadmin.moonshot.features.search.databinding.FragmentSearchBinding;
import com.haroldadmin.moonshot.features.search.di.DaggerSearchComponent;
import com.haroldadmin.moonshot.features.search.views.searchResultView;
import com.haroldadmin.moonshot.features.search.views.searchUninitializedView;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000b2,\u0010\f\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u0011H\u0007\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\r\u00a2\u0006\u0002\b\u0013H\u0002\u001a\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u0017H\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0018"}, d2 = {"screenHeight", "", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "getScreenHeight", "(Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;)I", "asyncTypedEpoxyController", "Lcom/haroldadmin/moonshot/base/MoonShotAsyncTypedEpoxyController;", "S", "Lcom/haroldadmin/moonshot/base/MoonShotState;", "Landroidx/fragment/app/Fragment;", "viewModel", "Lcom/haroldadmin/moonshot/base/MoonShotViewModel;", "buildModels", "Lkotlin/Function2;", "Lcom/airbnb/epoxy/EpoxyController;", "Lkotlin/ParameterName;", "name", "state", "", "Lkotlin/ExtensionFunctionType;", "textChanges", "Lkotlinx/coroutines/flow/Flow;", "", "Landroid/widget/EditText;", "search_debug"})
public final class SearchFragmentKt {
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @kotlinx.coroutines.FlowPreview()
    private static final kotlinx.coroutines.flow.Flow<java.lang.String> textChanges(android.widget.EditText $this$textChanges) {
        return null;
    }
    
    private static final <S extends com.haroldadmin.moonshot.base.MoonShotState>com.haroldadmin.moonshot.base.MoonShotAsyncTypedEpoxyController<S> asyncTypedEpoxyController(androidx.fragment.app.Fragment $this$asyncTypedEpoxyController, com.haroldadmin.moonshot.base.MoonShotViewModel<S> viewModel, kotlin.jvm.functions.Function2<? super com.airbnb.epoxy.EpoxyController, ? super S, kotlin.Unit> buildModels) {
        return null;
    }
    
    private static final int getScreenHeight(com.google.android.material.bottomsheet.BottomSheetDialogFragment $this$screenHeight) {
        return 0;
    }
}