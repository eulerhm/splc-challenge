package com.woocommerce.android.ui.cardreader.tutorial;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/tutorial/CardReaderTutorialAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "detailIds", "", "", "[Ljava/lang/Integer;", "drawableIds", "labelIds", "createFragment", "position", "getItemCount", "Companion", "WooCommerce_wasabiDebug"})
public final class CardReaderTutorialAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.cardreader.tutorial.CardReaderTutorialAdapter.Companion Companion = null;
    public static final int NUM_PAGES = 3;
    private final java.lang.Integer[] drawableIds = {com.woocommerce.android.R.drawable.img_wc_ship_payment, com.woocommerce.android.R.drawable.img_wc_ship_card_insert, com.woocommerce.android.R.drawable.img_wc_ship_card_charge};
    private final java.lang.Integer[] labelIds = {com.woocommerce.android.R.string.card_reader_tutorial_connected_label, com.woocommerce.android.R.string.card_reader_tutorial_collect_label, com.woocommerce.android.R.string.card_reader_tutorial_charged_label};
    private final java.lang.Integer[] detailIds = {com.woocommerce.android.R.string.card_reader_tutorial_connected_detail, com.woocommerce.android.R.string.card_reader_tutorial_collect_detail, com.woocommerce.android.R.string.card_reader_tutorial_charged_detail};
    
    public CardReaderTutorialAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/tutorial/CardReaderTutorialAdapter$Companion;", "", "()V", "NUM_PAGES", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}