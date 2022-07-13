package com.woocommerce.android.ui.refunds;

import java.lang.System;

@kotlin.Suppress(names = {"LargeClass"})
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00dc\u00012\u00020\u0001:\u0014\u00db\u0001\u00dc\u0001\u00dd\u0001\u00de\u0001\u00df\u0001\u00e0\u0001\u00e1\u0001\u00e2\u0001\u00e3\u0001\u00e4\u0001B\u007f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0002\u0010 J\u001d\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020IH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008e\u0001J\u0018\u0010\u008f\u0001\u001a\u00020H2\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J\u0018\u0010\u0091\u0001\u001a\u00020H2\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J\u0018\u0010\u0092\u0001\u001a\u00020H2\r\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J\u0018\u0010\u0093\u0001\u001a\u00020H2\r\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J\u0018\u0010\u0095\u0001\u001a\u00020H2\r\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J\u0018\u0010\u0096\u0001\u001a\u00020H2\r\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J\u0013\u0010\u0097\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0098\u0001\u001a\u00020IH\u0002J\u000f\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J\u000f\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020*0#H\u0002J#\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020*2\b\u0010\u009e\u0001\u001a\u00030\u0086\u0001H\u0002J\n\u0010\u009f\u0001\u001a\u00030\u008c\u0001H\u0002J\n\u0010\u00a0\u0001\u001a\u00030\u008c\u0001H\u0002J\n\u0010\u00a1\u0001\u001a\u00030\u008c\u0001H\u0002J\u001b\u0010\u00a2\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a4\u00010\u00a3\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a5\u0001J\t\u0010\u00a6\u0001\u001a\u00020-H\u0002J\t\u0010\u00a7\u0001\u001a\u00020-H\u0002J\u001c\u0010\u00a8\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00a9\u0001\u001a\u00020I2\u0007\u0010\u0098\u0001\u001a\u00020IH\u0002J\u001c\u0010\u00aa\u0001\u001a\u00020R2\u0007\u0010\u00ab\u0001\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00ac\u0001J\t\u0010\u00ad\u0001\u001a\u00020KH\u0002J\u001a\u0010\u00ae\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00af\u0001\u001a\u00020-2\u0007\u0010\u00b0\u0001\u001a\u00020*J\u0011\u0010\u00b1\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00af\u0001\u001a\u00020-J\u0011\u0010\u00b2\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00b3\u0001\u001a\u00020HJ\b\u0010\u00b4\u0001\u001a\u00030\u008c\u0001J\b\u0010\u00b5\u0001\u001a\u00030\u008c\u0001J\b\u0010\u00b6\u0001\u001a\u00030\u008c\u0001J\b\u0010\u00b7\u0001\u001a\u00030\u008c\u0001J\u0011\u0010\u00b8\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00b9\u0001\u001a\u00020HJ\u0011\u0010\u00ba\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00bb\u0001\u001a\u00020-J\u0011\u0010\u00bc\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020IJ\u001b\u0010\u00bd\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009d\u0001\u001a\u00020*2\b\u0010\u009e\u0001\u001a\u00030\u0086\u0001J\u0011\u0010\u00be\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009d\u0001\u001a\u00020*J\u001c\u0010\u00bf\u0001\u001a\u00030\u008c\u00012\b\u0010\u00c0\u0001\u001a\u00030\u0086\u00012\b\u0010\u00c1\u0001\u001a\u00030\u0086\u0001J\u0012\u0010\u00c2\u0001\u001a\u00030\u008c\u00012\b\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001J\b\u0010\u00c5\u0001\u001a\u00030\u008c\u0001J\u001a\u0010\u00c6\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00af\u0001\u001a\u00020-2\u0007\u0010\u00b0\u0001\u001a\u00020*J\u0011\u0010\u00c7\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00af\u0001\u001a\u00020-J!\u0010\u00c8\u0001\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0006\u0012\u0004\u0018\u00010I0N2\b\u0010\u00c9\u0001\u001a\u00030\u00ca\u0001H\u0002J\b\u0010\u00cb\u0001\u001a\u00030\u008c\u0001J\n\u0010\u00cc\u0001\u001a\u00030\u008c\u0001H\u0002J\n\u0010\u00cd\u0001\u001a\u00030\u008c\u0001H\u0002J\u001b\u0010\u00ce\u0001\u001a\u00030\u008c\u00012\u000f\u0010\u00cf\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a4\u00010\u00a3\u0001H\u0002J\u001b\u0010\u00d0\u0001\u001a\u00030\u008c\u00012\u000f\u0010\u00cf\u0001\u001a\n\u0012\u0005\u0012\u00030\u00a4\u00010\u00a3\u0001H\u0002J\n\u0010\u00d1\u0001\u001a\u00030\u008c\u0001H\u0002J\n\u0010\u00d2\u0001\u001a\u00030\u008c\u0001H\u0002J\u0019\u0010\u00d3\u0001\u001a\u00030\u008c\u00012\r\u0010\u00d4\u0001\u001a\b\u0012\u0004\u0012\u00020&0#H\u0002J\u001c\u0010\u00d5\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0098\u0001\u001a\u00020I2\u0007\u0010\u00d6\u0001\u001a\u00020-H\u0002J\u0014\u0010\u00d7\u0001\u001a\u00030\u008c\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a5\u0001J\u0013\u0010\u00d8\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u00b3\u0001\u001a\u00020HH\u0002J\n\u0010\u00d9\u0001\u001a\u00030\u00da\u0001H\u0002R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020*0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020-8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u001f\u00100\u001a\u000601j\u0002`28BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104R\u000e\u00107\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020:8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020:0C\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010L\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\bL\u0010/R\u001a\u0010M\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020O0NX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020HX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020T0CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010U\u001a\u00020T2\u0006\u00109\u001a\u00020T8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bZ\u0010A\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010\\\u001a\u00020[2\u0006\u00109\u001a\u00020[8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\ba\u0010A\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020[0C\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010ER+\u0010e\u001a\u00020d2\u0006\u00109\u001a\u00020d8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bj\u0010A\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020d0C\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010ER\u001d\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0n\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u001d\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0#0n\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010pR\u0010\u0010s\u001a\u0004\u0018\u00010tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0#0n\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010pR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010x\u001a\u00020w2\u0006\u00109\u001a\u00020w8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b}\u0010A\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0017\u0010~\u001a\b\u0012\u0004\u0012\u00020w0C\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010ER\u0015\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020*0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020*0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00e5\u0001"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "wooStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "gatewayStore", "Lorg/wordpress/android/fluxc/store/WCGatewayStore;", "refundStore", "Lorg/wordpress/android/fluxc/store/WCRefundStore;", "paymentChargeRepository", "Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository;", "orderMapper", "Lcom/woocommerce/android/model/OrderMapper;", "inPersonPaymentsCanadaFeatureFlag", "Lcom/woocommerce/android/ui/cardreader/InPersonPaymentsCanadaFeatureFlag;", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/util/CurrencyFormatter;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lorg/wordpress/android/fluxc/store/WCGatewayStore;Lorg/wordpress/android/fluxc/store/WCRefundStore;Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository;Lcom/woocommerce/android/model/OrderMapper;Lcom/woocommerce/android/ui/cardreader/InPersonPaymentsCanadaFeatureFlag;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;)V", "_refundFeeLines", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$FeeRefundListItem;", "_refundItems", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "_refundShippingLines", "Lcom/woocommerce/android/ui/refunds/RefundShippingListAdapter$ShippingRefundListItem;", "allFeeLineIds", "", "allShippingLineIds", "areAllItemsSelected", "", "getAreAllItemsSelected", "()Z", "arguments", "Lcom/woocommerce/android/ui/refunds/IssueRefundFragmentArgs;", "Lcom/woocommerce/android/ui/refunds/RefundsArgs;", "getArguments", "()Lcom/woocommerce/android/ui/refunds/IssueRefundFragmentArgs;", "arguments$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "cardType", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$PaymentMethodType;", "<set-?>", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$CommonViewState;", "commonState", "getCommonState", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$CommonViewState;", "setCommonState", "(Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$CommonViewState;)V", "commonState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "commonStateLiveData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getCommonStateLiveData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "gateway", "Lcom/woocommerce/android/model/PaymentGateway;", "isRefundInProgress", "maxQuantities", "", "", "maxRefund", "order", "Lcom/woocommerce/android/model/Order;", "productsRefundLiveData", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$ProductsRefundViewState;", "productsRefundState", "getProductsRefundState", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$ProductsRefundViewState;", "setProductsRefundState", "(Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$ProductsRefundViewState;)V", "productsRefundState$delegate", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByAmountViewState;", "refundByAmountState", "getRefundByAmountState", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByAmountViewState;", "setRefundByAmountState", "(Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByAmountViewState;)V", "refundByAmountState$delegate", "refundByAmountStateLiveData", "getRefundByAmountStateLiveData", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByItemsViewState;", "refundByItemsState", "getRefundByItemsState", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByItemsViewState;", "setRefundByItemsState", "(Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByItemsViewState;)V", "refundByItemsState$delegate", "refundByItemsStateLiveData", "getRefundByItemsStateLiveData", "refundFeeLines", "Landroidx/lifecycle/LiveData;", "getRefundFeeLines", "()Landroidx/lifecycle/LiveData;", "refundItems", "getRefundItems", "refundJob", "Lkotlinx/coroutines/Job;", "refundShippingLines", "getRefundShippingLines", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundSummaryViewState;", "refundSummaryState", "getRefundSummaryState", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundSummaryViewState;", "setRefundSummaryState", "(Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundSummaryViewState;)V", "refundSummaryState$delegate", "refundSummaryStateLiveData", "getRefundSummaryStateLiveData", "refundableFeeLineIds", "refundableShippingLineIds", "refunds", "Lcom/woocommerce/android/model/Refund;", "selectedQuantities", "", "", "getSelectedQuantities", "()Ljava/util/Map;", "selectedQuantities$delegate", "Lkotlin/Lazy;", "addOrderNote", "", "reason", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculatePartialFeesSubtotal", "selectedFeeLinesId", "calculatePartialFeesTaxes", "calculatePartialFeesTotal", "calculatePartialShippingSubtotal", "selectedShippingLinesId", "calculatePartialShippingTaxes", "calculatePartialShippingTotal", "enrichRefundMethodWithCardDetails", "refundMethod", "getRefundableFeeLineIds", "getRefundableShippingLineIds", "getUpdatedItemList", "", "uniqueId", "newQuantity", "initRefundByAmountState", "initRefundByItemsState", "initRefundSummaryState", "initiateRefund", "Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/WooResult;", "Lorg/wordpress/android/fluxc/model/refunds/WCRefundModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInputValid", "isInteracRefund", "loadCardDetails", "chargeId", "loadOrder", "orderId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentGateway", "onFeeLineSwitchChanged", "isChecked", "itemId", "onFeesRefundMainSwitchChanged", "onManualRefundAmountChanged", "amount", "onNextButtonTappedFromAmounts", "onNextButtonTappedFromItems", "onOpenStoreAdminLinkClicked", "onProductRefundAmountTapped", "onProductsRefundAmountChanged", "newAmount", "onRefundConfirmed", "wasConfirmed", "onRefundIssued", "onRefundQuantityChanged", "onRefundQuantityTapped", "onRefundSummaryTextChanged", "maxLength", "currLength", "onRefundTabChanged", "type", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;", "onSelectButtonTapped", "onShippingLineSwitchChanged", "onShippingRefundMainSwitchChanged", "prepareTracksEventsDetails", "exception", "Lcom/woocommerce/android/WooException;", "refund", "showRefundSummary", "showValidationState", "trackRefundError", "result", "trackRefundSuccess", "triggerUIMessage", "triggerUIMessageIfRefundIsInterac", "updateRefundItems", "items", "updateRefundSummaryState", "isMethodDescriptionVisible", "updateRefundSummaryStateWithOrderNote", "updateRefundTotal", "validateInput", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$InputValidationState;", "CommonViewState", "Companion", "InputValidationState", "IssueRefundEvent", "PaymentMethodType", "ProductsRefundViewState", "RefundByAmountViewState", "RefundByItemsViewState", "RefundSummaryViewState", "RefundType", "WooCommerce_wasabiDebug"})
public final class IssueRefundViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final org.wordpress.android.fluxc.store.WCGatewayStore gatewayStore = null;
    private final org.wordpress.android.fluxc.store.WCRefundStore refundStore = null;
    private final com.woocommerce.android.ui.refunds.PaymentChargeRepository paymentChargeRepository = null;
    private final com.woocommerce.android.model.OrderMapper orderMapper = null;
    private final com.woocommerce.android.ui.cardreader.InPersonPaymentsCanadaFeatureFlag inPersonPaymentsCanadaFeatureFlag = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.refunds.IssueRefundViewModel.Companion Companion = null;
    private static final int DEFAULT_DECIMAL_PRECISION = 2;
    private static final java.lang.String REFUND_METHOD_MANUAL = "manual";
    private static final java.lang.String SELECTED_QUANTITIES_KEY = "selected_quantities_key";
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem>> _refundItems = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem>> refundItems = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundShippingListAdapter.ShippingRefundListItem>> _refundShippingLines = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundShippingListAdapter.ShippingRefundListItem>> refundShippingLines = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem>> _refundFeeLines = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem>> refundFeeLines = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState> commonStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState> refundSummaryStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState> refundByItemsStateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState> refundByAmountStateLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState> productsRefundLiveData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate commonState$delegate = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate refundByAmountState$delegate = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate refundByItemsState$delegate = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate refundSummaryState$delegate = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productsRefundState$delegate = null;
    private final com.woocommerce.android.model.Order order = null;
    private final java.util.List<com.woocommerce.android.model.Refund> refunds = null;
    private final java.util.List<java.lang.Long> allShippingLineIds = null;
    private final java.util.List<java.lang.Long> refundableShippingLineIds = null;
    private final java.util.List<java.lang.Long> allFeeLineIds = null;
    private final java.util.List<java.lang.Long> refundableFeeLineIds = null;
    private final java.math.BigDecimal maxRefund = null;
    private final java.util.Map<java.lang.Long, java.lang.Float> maxQuantities = null;
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrency = null;
    private final com.woocommerce.android.model.PaymentGateway gateway = null;
    private com.woocommerce.android.ui.refunds.IssueRefundViewModel.PaymentMethodType cardType = com.woocommerce.android.ui.refunds.IssueRefundViewModel.PaymentMethodType.CARD_PRESENT;
    private final com.woocommerce.android.viewmodel.NavArgsLazy arguments$delegate = null;
    private final kotlin.Lazy selectedQuantities$delegate = null;
    private kotlinx.coroutines.Job refundJob;
    
    @javax.inject.Inject
    public IssueRefundViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCGatewayStore gatewayStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCRefundStore refundStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.refunds.PaymentChargeRepository paymentChargeRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.OrderMapper orderMapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.InPersonPaymentsCanadaFeatureFlag inPersonPaymentsCanadaFeatureFlag, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem>> getRefundItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundShippingListAdapter.ShippingRefundListItem>> getRefundShippingLines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundFeeListAdapter.FeeRefundListItem>> getRefundFeeLines() {
        return null;
    }
    
    private final boolean getAreAllItemsSelected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState> getCommonStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState> getRefundSummaryStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState> getRefundByItemsStateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState> getRefundByAmountStateLiveData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState getCommonState() {
        return null;
    }
    
    private final void setCommonState(com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState p0) {
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState getRefundByAmountState() {
        return null;
    }
    
    private final void setRefundByAmountState(com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState p0) {
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState getRefundByItemsState() {
        return null;
    }
    
    private final void setRefundByItemsState(com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState p0) {
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState getRefundSummaryState() {
        return null;
    }
    
    private final void setRefundSummaryState(com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState p0) {
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState getProductsRefundState() {
        return null;
    }
    
    private final void setProductsRefundState(com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState p0) {
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundFragmentArgs getArguments() {
        return null;
    }
    
    private final java.util.Map<java.lang.Long, java.lang.Integer> getSelectedQuantities() {
        return null;
    }
    
    public final boolean isRefundInProgress() {
        return false;
    }
    
    private final java.lang.Object loadOrder(long orderId, kotlin.coroutines.Continuation<? super com.woocommerce.android.model.Order> continuation) {
        return null;
    }
    
    private final void updateRefundTotal(java.math.BigDecimal amount) {
    }
    
    private final void initRefundByAmountState() {
    }
    
    private final void initRefundByItemsState() {
    }
    
    private final void initRefundSummaryState() {
    }
    
    private final com.woocommerce.android.model.PaymentGateway loadPaymentGateway() {
        return null;
    }
    
    public final void onNextButtonTappedFromItems() {
    }
    
    public final void onNextButtonTappedFromAmounts() {
    }
    
    public final void onOpenStoreAdminLinkClicked() {
    }
    
    private final void showRefundSummary() {
    }
    
    public final void onManualRefundAmountChanged(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal amount) {
    }
    
    public final void onRefundConfirmed(boolean wasConfirmed) {
    }
    
    private final boolean isInteracRefund() {
        return false;
    }
    
    public final void refund() {
    }
    
    private final void triggerUIMessageIfRefundIsInterac() {
    }
    
    private final java.lang.Object initiateRefund(kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.model.refunds.WCRefundModel>> continuation) {
        return null;
    }
    
    private final void trackRefundError(org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.model.refunds.WCRefundModel> result) {
    }
    
    private final void triggerUIMessage() {
    }
    
    private final void trackRefundSuccess(org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.model.refunds.WCRefundModel> result) {
    }
    
    private final java.lang.Object updateRefundSummaryStateWithOrderNote(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object addOrderNote(java.lang.String reason, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onRefundIssued(@org.jetbrains.annotations.NotNull
    java.lang.String reason) {
    }
    
    public final void onRefundQuantityTapped(long uniqueId) {
    }
    
    /**
     * Checks if the refund summary button label should be enabled. If the max length for the text field is
     * surpassed, the button should be disabled until the text is brought within the maximum length.
     */
    public final void onRefundSummaryTextChanged(int maxLength, int currLength) {
    }
    
    public final void onProductRefundAmountTapped() {
    }
    
    public final void onProductsRefundAmountChanged(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal newAmount) {
    }
    
    public final void onRefundQuantityChanged(long uniqueId, int newQuantity) {
    }
    
    private final java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> getUpdatedItemList(long uniqueId, int newQuantity) {
        return null;
    }
    
    public final void onSelectButtonTapped() {
    }
    
    @kotlin.Suppress(names = {"unused"})
    public final void onRefundTabChanged(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType type) {
    }
    
    private final void updateRefundItems(java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> items) {
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.InputValidationState validateInput() {
        return null;
    }
    
    private final void showValidationState() {
    }
    
    private final boolean isInputValid() {
        return false;
    }
    
    public final void onShippingRefundMainSwitchChanged(boolean isChecked) {
    }
    
    public final void onFeesRefundMainSwitchChanged(boolean isChecked) {
    }
    
    public final void onShippingLineSwitchChanged(boolean isChecked, long itemId) {
    }
    
    public final void onFeeLineSwitchChanged(boolean isChecked, long itemId) {
    }
    
    private final void enrichRefundMethodWithCardDetails(java.lang.String refundMethod) {
    }
    
    private final void loadCardDetails(java.lang.String chargeId, java.lang.String refundMethod) {
    }
    
    private final void updateRefundSummaryState(java.lang.String refundMethod, boolean isMethodDescriptionVisible) {
    }
    
    private final java.util.List<java.lang.Long> getRefundableShippingLineIds() {
        return null;
    }
    
    private final java.util.List<java.lang.Long> getRefundableFeeLineIds() {
        return null;
    }
    
    private final java.math.BigDecimal calculatePartialShippingSubtotal(java.util.List<java.lang.Long> selectedShippingLinesId) {
        return null;
    }
    
    private final java.math.BigDecimal calculatePartialFeesSubtotal(java.util.List<java.lang.Long> selectedFeeLinesId) {
        return null;
    }
    
    private final java.math.BigDecimal calculatePartialShippingTaxes(java.util.List<java.lang.Long> selectedShippingLinesId) {
        return null;
    }
    
    private final java.math.BigDecimal calculatePartialFeesTaxes(java.util.List<java.lang.Long> selectedFeeLinesId) {
        return null;
    }
    
    private final java.math.BigDecimal calculatePartialShippingTotal(java.util.List<java.lang.Long> selectedShippingLinesId) {
        return null;
    }
    
    private final java.math.BigDecimal calculatePartialFeesTotal(java.util.List<java.lang.Long> selectedFeeLinesId) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> prepareTracksEventsDetails(com.woocommerce.android.WooException exception) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$InputValidationState;", "", "(Ljava/lang/String;I)V", "TOO_HIGH", "TOO_LOW", "VALID", "WooCommerce_wasabiDebug"})
    static enum InputValidationState {
        /*public static final*/ TOO_HIGH /* = new TOO_HIGH() */,
        /*public static final*/ TOO_LOW /* = new TOO_LOW() */,
        /*public static final*/ VALID /* = new VALID() */;
        
        InputValidationState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;", "", "(Ljava/lang/String;I)V", "ITEMS", "AMOUNT", "WooCommerce_wasabiDebug"})
    public static enum RefundType {
        /*public static final*/ ITEMS /* = new ITEMS() */,
        /*public static final*/ AMOUNT /* = new AMOUNT() */;
        
        RefundType() {
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003JF\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0007\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByAmountViewState;", "Landroid/os/Parcelable;", "currency", "", "decimals", "", "availableForRefund", "isNextButtonEnabled", "", "enteredAmount", "Ljava/math/BigDecimal;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;)V", "getAvailableForRefund", "()Ljava/lang/String;", "getCurrency", "getDecimals", "()I", "getEnteredAmount", "()Ljava/math/BigDecimal;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;Ljava/math/BigDecimal;)Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByAmountViewState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class RefundByAmountViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String currency = null;
        private final int decimals = 0;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String availableForRefund = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isNextButtonEnabled = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal enteredAmount = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.String currency, int decimals, @org.jetbrains.annotations.Nullable
        java.lang.String availableForRefund, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isNextButtonEnabled, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal enteredAmount) {
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
        
        public RefundByAmountViewState() {
            super();
        }
        
        public RefundByAmountViewState(@org.jetbrains.annotations.Nullable
        java.lang.String currency, int decimals, @org.jetbrains.annotations.Nullable
        java.lang.String availableForRefund, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isNextButtonEnabled, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal enteredAmount) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCurrency() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getDecimals() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAvailableForRefund() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isNextButtonEnabled() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getEnteredAmount() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByAmountViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$ProductsRefundViewState;", "Landroid/os/Parcelable;", "currency", "", "decimals", "", "(Ljava/lang/String;I)V", "getCurrency", "()Ljava/lang/String;", "getDecimals", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ProductsRefundViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String currency = null;
        private final int decimals = 0;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.String currency, int decimals) {
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
        
        public ProductsRefundViewState() {
            super();
        }
        
        public ProductsRefundViewState(@org.jetbrains.annotations.Nullable
        java.lang.String currency, int decimals) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCurrency() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getDecimals() {
            return 0;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.ProductsRefundViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010<\u001a\u00020\u000eH\u00c6\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010C\u001a\u00020\u000eH\u00c6\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0098\u0002\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\t\u0010R\u001a\u00020SH\u00d6\u0001J\u0013\u0010T\u001a\u00020\u000e2\b\u0010U\u001a\u0004\u0018\u00010VH\u00d6\u0003J\t\u0010W\u001a\u00020SH\u00d6\u0001J\t\u0010X\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020SH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\'\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b(\u0010!R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010)R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b\r\u0010*R\u0011\u0010,\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010)R\u0011\u0010-\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\u0018\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010)R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b\u0017\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001f\u00a8\u0006^"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByItemsViewState;", "Landroid/os/Parcelable;", "currency", "", "productsRefund", "Ljava/math/BigDecimal;", "formattedProductsRefund", "subtotal", "taxes", "feesSubtotal", "feesTaxes", "feesRefund", "formattedFeesRefundTotal", "isFeesRefundAvailable", "", "isFeesMainSwitchChecked", "selectedFeeLines", "", "", "shippingSubtotal", "shippingTaxes", "shippingRefund", "formattedShippingRefundTotal", "isShippingRefundAvailable", "isShippingMainSwitchChecked", "selectedShippingLines", "selectedItemsHeader", "selectButtonTitle", "refundNotice", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getFeesRefund", "()Ljava/math/BigDecimal;", "getFeesSubtotal", "getFeesTaxes", "getFormattedFeesRefundTotal", "getFormattedProductsRefund", "getFormattedShippingRefundTotal", "grandTotalRefund", "getGrandTotalRefund", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isNextButtonEnabled", "isRefundNoticeVisible", "getProductsRefund", "getRefundNotice", "getSelectButtonTitle", "getSelectedFeeLines", "()Ljava/util/List;", "getSelectedItemsHeader", "getSelectedShippingLines", "getShippingRefund", "getShippingSubtotal", "getShippingTaxes", "getSubtotal", "getTaxes", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundByItemsViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class RefundByItemsViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String currency = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal productsRefund = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String formattedProductsRefund = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String subtotal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String taxes = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String feesSubtotal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String feesTaxes = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal feesRefund = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String formattedFeesRefundTotal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isFeesRefundAvailable = null;
        private final boolean isFeesMainSwitchChecked = false;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.Long> selectedFeeLines = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String shippingSubtotal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String shippingTaxes = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal shippingRefund = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String formattedShippingRefundTotal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isShippingRefundAvailable = null;
        private final boolean isShippingMainSwitchChecked = false;
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.Long> selectedShippingLines = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String selectedItemsHeader = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String selectButtonTitle = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refundNotice = null;
        private final boolean isRefundNoticeVisible = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.String currency, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal productsRefund, @org.jetbrains.annotations.Nullable
        java.lang.String formattedProductsRefund, @org.jetbrains.annotations.Nullable
        java.lang.String subtotal, @org.jetbrains.annotations.Nullable
        java.lang.String taxes, @org.jetbrains.annotations.Nullable
        java.lang.String feesSubtotal, @org.jetbrains.annotations.Nullable
        java.lang.String feesTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal feesRefund, @org.jetbrains.annotations.Nullable
        java.lang.String formattedFeesRefundTotal, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isFeesRefundAvailable, boolean isFeesMainSwitchChecked, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Long> selectedFeeLines, @org.jetbrains.annotations.Nullable
        java.lang.String shippingSubtotal, @org.jetbrains.annotations.Nullable
        java.lang.String shippingTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal shippingRefund, @org.jetbrains.annotations.Nullable
        java.lang.String formattedShippingRefundTotal, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isShippingRefundAvailable, boolean isShippingMainSwitchChecked, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Long> selectedShippingLines, @org.jetbrains.annotations.Nullable
        java.lang.String selectedItemsHeader, @org.jetbrains.annotations.Nullable
        java.lang.String selectButtonTitle, @org.jetbrains.annotations.Nullable
        java.lang.String refundNotice) {
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
        
        public RefundByItemsViewState() {
            super();
        }
        
        public RefundByItemsViewState(@org.jetbrains.annotations.Nullable
        java.lang.String currency, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal productsRefund, @org.jetbrains.annotations.Nullable
        java.lang.String formattedProductsRefund, @org.jetbrains.annotations.Nullable
        java.lang.String subtotal, @org.jetbrains.annotations.Nullable
        java.lang.String taxes, @org.jetbrains.annotations.Nullable
        java.lang.String feesSubtotal, @org.jetbrains.annotations.Nullable
        java.lang.String feesTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal feesRefund, @org.jetbrains.annotations.Nullable
        java.lang.String formattedFeesRefundTotal, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isFeesRefundAvailable, boolean isFeesMainSwitchChecked, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Long> selectedFeeLines, @org.jetbrains.annotations.Nullable
        java.lang.String shippingSubtotal, @org.jetbrains.annotations.Nullable
        java.lang.String shippingTaxes, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal shippingRefund, @org.jetbrains.annotations.Nullable
        java.lang.String formattedShippingRefundTotal, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isShippingRefundAvailable, boolean isShippingMainSwitchChecked, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.Long> selectedShippingLines, @org.jetbrains.annotations.Nullable
        java.lang.String selectedItemsHeader, @org.jetbrains.annotations.Nullable
        java.lang.String selectButtonTitle, @org.jetbrains.annotations.Nullable
        java.lang.String refundNotice) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getProductsRefund() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFormattedProductsRefund() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSubtotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTaxes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFeesSubtotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFeesTaxes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getFeesRefund() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFormattedFeesRefundTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isFeesRefundAvailable() {
            return null;
        }
        
        public final boolean component11() {
            return false;
        }
        
        public final boolean isFeesMainSwitchChecked() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Long> component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Long> getSelectedFeeLines() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getShippingSubtotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getShippingTaxes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component15() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getShippingRefund() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFormattedShippingRefundTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isShippingRefundAvailable() {
            return null;
        }
        
        public final boolean component18() {
            return false;
        }
        
        public final boolean isShippingMainSwitchChecked() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Long> component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.Long> getSelectedShippingLines() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component20() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSelectedItemsHeader() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSelectButtonTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component22() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefundNotice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getGrandTotalRefund() {
            return null;
        }
        
        public final boolean isNextButtonEnabled() {
            return false;
        }
        
        public final boolean isRefundNoticeVisible() {
            return false;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundByItemsViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003Jj\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020!H\u00d6\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020!H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\t\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundSummaryViewState;", "Landroid/os/Parcelable;", "isFormEnabled", "", "previouslyRefunded", "", "refundAmount", "refundMethod", "refundReason", "isMethodDescriptionVisible", "isSummaryTextTooLong", "isFetchingCardData", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZ)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isSubmitButtonEnabled", "getPreviouslyRefunded", "()Ljava/lang/String;", "getRefundAmount", "getRefundMethod", "getRefundReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZ)Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundSummaryViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class RefundSummaryViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isFormEnabled = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String previouslyRefunded = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refundAmount = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refundMethod = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refundReason = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isMethodDescriptionVisible = null;
        private final boolean isSummaryTextTooLong = false;
        private final boolean isFetchingCardData = false;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isFormEnabled, @org.jetbrains.annotations.Nullable
        java.lang.String previouslyRefunded, @org.jetbrains.annotations.Nullable
        java.lang.String refundAmount, @org.jetbrains.annotations.Nullable
        java.lang.String refundMethod, @org.jetbrains.annotations.Nullable
        java.lang.String refundReason, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isMethodDescriptionVisible, boolean isSummaryTextTooLong, boolean isFetchingCardData) {
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
        
        public RefundSummaryViewState() {
            super();
        }
        
        public RefundSummaryViewState(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isFormEnabled, @org.jetbrains.annotations.Nullable
        java.lang.String previouslyRefunded, @org.jetbrains.annotations.Nullable
        java.lang.String refundAmount, @org.jetbrains.annotations.Nullable
        java.lang.String refundMethod, @org.jetbrains.annotations.Nullable
        java.lang.String refundReason, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isMethodDescriptionVisible, boolean isSummaryTextTooLong, boolean isFetchingCardData) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isFormEnabled() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPreviouslyRefunded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefundAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefundMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefundReason() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isMethodDescriptionVisible() {
            return null;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean isSummaryTextTooLong() {
            return false;
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final boolean isFetchingCardData() {
            return false;
        }
        
        public final boolean isSubmitButtonEnabled() {
            return false;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundSummaryViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$CommonViewState;", "Landroid/os/Parcelable;", "refundTotal", "Ljava/math/BigDecimal;", "screenTitle", "", "refundType", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;", "(Ljava/math/BigDecimal;Ljava/lang/String;Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;)V", "getRefundTotal", "()Ljava/math/BigDecimal;", "getRefundType", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;", "getScreenTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class CommonViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal refundTotal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String screenTitle = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType refundType = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState copy(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal refundTotal, @org.jetbrains.annotations.Nullable
        java.lang.String screenTitle, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType refundType) {
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
        
        public CommonViewState() {
            super();
        }
        
        public CommonViewState(@org.jetbrains.annotations.NotNull
        java.math.BigDecimal refundTotal, @org.jetbrains.annotations.Nullable
        java.lang.String screenTitle, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType refundType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getRefundTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getScreenTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType getRefundType() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.CommonViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "HideValidationError", "NavigateToCardReaderScreen", "OpenUrl", "ShowNumberPicker", "ShowRefundAmountDialog", "ShowRefundConfirmation", "ShowRefundSummary", "ShowValidationError", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowValidationError;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowNumberPicker;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowRefundConfirmation;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowRefundSummary;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowRefundAmountDialog;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$OpenUrl;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$HideValidationError;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$NavigateToCardReaderScreen;", "WooCommerce_wasabiDebug"})
    public static abstract class IssueRefundEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private IssueRefundEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowValidationError;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class ShowValidationError extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.ShowValidationError copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
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
            
            public ShowValidationError(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowNumberPicker;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "refundItem", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "(Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;)V", "getRefundItem", "()Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class ShowNumberPicker extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem refundItem = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.ShowNumberPicker copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem refundItem) {
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
            
            public ShowNumberPicker(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem refundItem) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem getRefundItem() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowRefundConfirmation;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "title", "", "message", "confirmButtonTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfirmButtonTitle", "()Ljava/lang/String;", "getMessage", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class ShowRefundConfirmation extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String title = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String confirmButtonTitle = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.ShowRefundConfirmation copy(@org.jetbrains.annotations.NotNull
            java.lang.String title, @org.jetbrains.annotations.NotNull
            java.lang.String message, @org.jetbrains.annotations.NotNull
            java.lang.String confirmButtonTitle) {
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
            
            public ShowRefundConfirmation(@org.jetbrains.annotations.NotNull
            java.lang.String title, @org.jetbrains.annotations.NotNull
            java.lang.String message, @org.jetbrains.annotations.NotNull
            java.lang.String confirmButtonTitle) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getConfirmButtonTitle() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowRefundSummary;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "refundType", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;", "(Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;)V", "getRefundType", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$RefundType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class ShowRefundSummary extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            @org.jetbrains.annotations.NotNull
            private final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType refundType = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.ShowRefundSummary copy(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType refundType) {
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
            
            public ShowRefundSummary(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType refundType) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.RefundType getRefundType() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$ShowRefundAmountDialog;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "refundAmount", "Ljava/math/BigDecimal;", "maxRefund", "message", "", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getMaxRefund", "()Ljava/math/BigDecimal;", "getMessage", "()Ljava/lang/String;", "getRefundAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class ShowRefundAmountDialog extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            @org.jetbrains.annotations.NotNull
            private final java.math.BigDecimal refundAmount = null;
            @org.jetbrains.annotations.NotNull
            private final java.math.BigDecimal maxRefund = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.ShowRefundAmountDialog copy(@org.jetbrains.annotations.NotNull
            java.math.BigDecimal refundAmount, @org.jetbrains.annotations.NotNull
            java.math.BigDecimal maxRefund, @org.jetbrains.annotations.NotNull
            java.lang.String message) {
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
            
            public ShowRefundAmountDialog(@org.jetbrains.annotations.NotNull
            java.math.BigDecimal refundAmount, @org.jetbrains.annotations.NotNull
            java.math.BigDecimal maxRefund, @org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal getRefundAmount() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal getMaxRefund() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$OpenUrl;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class OpenUrl extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.OpenUrl copy(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
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
            
            public OpenUrl(@org.jetbrains.annotations.NotNull
            java.lang.String url) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getUrl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$HideValidationError;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class HideValidationError extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.HideValidationError INSTANCE = null;
            
            private HideValidationError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent$NavigateToCardReaderScreen;", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$IssueRefundEvent;", "orderId", "", "refundAmount", "Ljava/math/BigDecimal;", "(JLjava/math/BigDecimal;)V", "getOrderId", "()J", "getRefundAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class NavigateToCardReaderScreen extends com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent {
            private final long orderId = 0L;
            @org.jetbrains.annotations.NotNull
            private final java.math.BigDecimal refundAmount = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.IssueRefundEvent.NavigateToCardReaderScreen copy(long orderId, @org.jetbrains.annotations.NotNull
            java.math.BigDecimal refundAmount) {
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
            
            public NavigateToCardReaderScreen(long orderId, @org.jetbrains.annotations.NotNull
            java.math.BigDecimal refundAmount) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getOrderId() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal getRefundAmount() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$PaymentMethodType;", "", "paymentMethodType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "CARD_PRESENT", "INTERAC_PRESENT", "Companion", "WooCommerce_wasabiDebug"})
    public static enum PaymentMethodType {
        /*public static final*/ CARD_PRESENT /* = new CARD_PRESENT(null) */,
        /*public static final*/ INTERAC_PRESENT /* = new INTERAC_PRESENT(null) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String paymentMethodType = null;
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.refunds.IssueRefundViewModel.PaymentMethodType.Companion Companion = null;
        
        PaymentMethodType(java.lang.String paymentMethodType) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPaymentMethodType() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$PaymentMethodType$Companion;", "", "()V", "fromValue", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$PaymentMethodType;", "paymentMethodType", "", "WooCommerce_wasabiDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.IssueRefundViewModel.PaymentMethodType fromValue(@org.jetbrains.annotations.Nullable
            java.lang.String paymentMethodType) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel$Companion;", "", "()V", "DEFAULT_DECIMAL_PRECISION", "", "REFUND_METHOD_MANUAL", "", "SELECTED_QUANTITIES_KEY", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}