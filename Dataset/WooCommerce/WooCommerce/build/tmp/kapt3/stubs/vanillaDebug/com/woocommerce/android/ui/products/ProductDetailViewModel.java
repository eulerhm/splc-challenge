package com.woocommerce.android.ui.products;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00de\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 \u00ab\u00032\u00020\u0001:\u0018\u00aa\u0003\u00ab\u0003\u00ac\u0003\u00ad\u0003\u00ae\u0003\u00af\u0003\u00b0\u0003\u00b1\u0003\u00b2\u0003\u00b3\u0003\u00b4\u0003\u00b5\u0003Bw\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ$\u0010\u00bb\u0001\u001a\u00030\u00bc\u00012\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020Q2\u0007\u0010\u00c0\u0001\u001a\u00020QJ\u0012\u0010\u00c1\u0001\u001a\u00030\u00bc\u00012\b\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001J\u001a\u0010\u00c4\u0001\u001a\u00030\u00bc\u00012\u0007\u0010\u00bf\u0001\u001a\u00020Q2\u0007\u0010\u00c5\u0001\u001a\u00020,J*\u0010\u00c6\u0001\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030\u00be\u00010\u00c7\u00012\u0007\u0010\u00c8\u0001\u001a\u00020VH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c9\u0001J%\u0010\u00ca\u0001\u001a\u00030\u00bc\u00012\u001b\u0010\u00cb\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00cd\u00010\u00cc\u0001j\n\u0012\u0005\u0012\u00030\u00cd\u0001`\u00ce\u0001J\u0012\u0010\u00cf\u0001\u001a\u00030\u00bc\u00012\b\u0010\u00d0\u0001\u001a\u00030\u00cd\u0001J\u0007\u0010\u00d1\u0001\u001a\u00020,J\b\u0010\u00d2\u0001\u001a\u00030\u00bc\u0001J\u0012\u0010\u00d3\u0001\u001a\u00020,2\u0007\u0010\u00bf\u0001\u001a\u00020QH\u0002J\t\u0010\u00d4\u0001\u001a\u00020VH\u0002J\u0015\u0010\u00d5\u0001\u001a\u0004\u0018\u00010VH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00d6\u0001J\u0012\u0010\u00d7\u0001\u001a\u00030\u00bc\u00012\b\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001J\u001b\u0010\u00d8\u0001\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010!2\b\u0010\u00bd\u0001\u001a\u00030\u00be\u0001H\u0002J\n\u0010\u00d9\u0001\u001a\u00030\u00bc\u0001H\u0002J\u0012\u0010\u00da\u0001\u001a\u00030\u00bc\u00012\b\u0010\u00db\u0001\u001a\u00030\u00be\u0001J\b\u0010\u00dc\u0001\u001a\u00030\u00bc\u0001J\u001e\u0010\u00dd\u0001\u001a\u00030\u00bc\u00012\b\u0010\u00de\u0001\u001a\u00030\u00be\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00df\u0001J\b\u0010\u00e0\u0001\u001a\u00030\u00bc\u0001J\u001f\u0010\u00e0\u0001\u001a\u00030\u00bc\u00012\t\b\u0002\u0010\u00e1\u0001\u001a\u00020,H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00e2\u0001J\u001e\u0010\u00e3\u0001\u001a\u00030\u00bc\u00012\b\u0010\u00de\u0001\u001a\u00030\u00be\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00df\u0001J,\u0010\u00e4\u0001\u001a\u00030\u00bc\u00012\t\b\u0002\u0010\u00e1\u0001\u001a\u00020,2\u000b\b\u0002\u0010\u00e5\u0001\u001a\u0004\u0018\u00010QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00e6\u0001J\u0019\u0010\u00e7\u0001\u001a\u00030\u00bc\u00012\r\u0010\u00a9\u0001\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0002J\u001e\u0010\u00e8\u0001\u001a\u0004\u0018\u00010%2\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020QH\u0002J\b\u0010\u00e9\u0001\u001a\u00030\u0099\u0001J \u0010\u00ea\u0001\u001a\b\u0012\u0004\u0012\u00020Q0$2\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020QJ\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u0001J\b\u0010\u00ed\u0001\u001a\u00030\u00be\u0001J\u0011\u0010\u00ee\u0001\u001a\u00020Q2\b\u0010\u00ef\u0001\u001a\u00030\u00be\u0001J\u0007\u0010\u00f0\u0001\u001a\u00020,J\u0007\u0010\u00f1\u0001\u001a\u00020,J\u0007\u0010\u00f2\u0001\u001a\u00020,J\u0007\u0010\u00f3\u0001\u001a\u00020,J\u0007\u0010\u00f4\u0001\u001a\u00020,J\u0007\u0010\u00f5\u0001\u001a\u00020,J\u0007\u0010\u00f6\u0001\u001a\u00020,J\u0007\u0010\u00f7\u0001\u001a\u00020,J\n\u0010\u00f8\u0001\u001a\u00030\u00bc\u0001H\u0002J\n\u0010\u00f9\u0001\u001a\u00030\u00bc\u0001H\u0002J\u0007\u0010\u00fa\u0001\u001a\u00020,J\r\u0010\u00fb\u0001\u001a\b\u0012\u0004\u0012\u00020)0$J\u0015\u0010\u00fc\u0001\u001a\u00030\u00bc\u00012\t\b\u0002\u0010\u00e1\u0001\u001a\u00020,H\u0002J\b\u0010\u00fd\u0001\u001a\u00030\u00bc\u0001J\u0013\u0010\u00fe\u0001\u001a\u00030\u00bc\u00012\t\b\u0002\u0010\u00e1\u0001\u001a\u00020,J\u0013\u0010\u00ff\u0001\u001a\u00030\u00bc\u00012\u0007\u0010\u00c8\u0001\u001a\u00020VH\u0002J\u0014\u0010\u0080\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00de\u0001\u001a\u00030\u00be\u0001H\u0002J\n\u0010\u0081\u0002\u001a\u00030\u00bc\u0001H\u0002J\u001f\u0010\u0082\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00020$0\u0083\u00022\b\u0010\u0085\u0002\u001a\u00030\u00be\u0001J\b\u0010\u0086\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u0087\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u0088\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u0089\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u008a\u0002\u001a\u00030\u00bc\u0001J$\u0010\u008b\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020Q2\u0007\u0010\u00c5\u0001\u001a\u00020,J\u0012\u0010\u008c\u0002\u001a\u00030\u00bc\u00012\b\u0010\u008d\u0002\u001a\u00030\u008e\u0002J\u0007\u0010\u008f\u0002\u001a\u00020,J\n\u0010\u0090\u0002\u001a\u00030\u00bc\u0001H\u0014J\u0012\u0010\u0091\u0002\u001a\u00030\u00bc\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u0002J\u0012\u0010\u0094\u0002\u001a\u00030\u00bc\u00012\b\u0010\u0092\u0002\u001a\u00030\u00be\u0001J\b\u0010\u0095\u0002\u001a\u00030\u00bc\u0001J \u0010\u0096\u0002\u001a\u00030\u00bc\u00012\b\u0010\u0097\u0002\u001a\u00030\u0098\u00022\f\b\u0002\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u009a\u0002J\b\u0010\u009b\u0002\u001a\u00030\u00bc\u0001J\u0012\u0010\u009c\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00d0\u0001\u001a\u00030\u00cd\u0001J\b\u0010\u009d\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u009e\u0002\u001a\u00030\u00bc\u0001J\u0011\u0010\u009f\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00a0\u0002\u001a\u00020.J\u0011\u0010\u00a1\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00a2\u0002\u001a\u000200J\u0012\u0010\u00a3\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001J\u0011\u0010\u00a4\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00a5\u0002\u001a\u00020QJ\u0011\u0010\u00a6\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00a7\u0002\u001a\u00020\"J\u0011\u0010\u00a8\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00a7\u0002\u001a\u00020\"J\b\u0010\u00a9\u0002\u001a\u00030\u00bc\u0001J\u0011\u0010\u00aa\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00ab\u0002\u001a\u00020QJ\b\u0010\u00ac\u0002\u001a\u00030\u00bc\u0001J\u0011\u0010\u00ad\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00bf\u0001\u001a\u00020QJ\b\u0010\u00ae\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00af\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b0\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b1\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b2\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b3\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b4\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b5\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b6\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00b7\u0002\u001a\u00030\u00bc\u0001J\u0012\u0010\u00b8\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00b9\u0002\u001a\u00030\u0093\u0002J\b\u0010\u00ba\u0002\u001a\u00030\u00bc\u0001J\u001d\u0010\u00bb\u0002\u001a\u00030\u0093\u00022\u0007\u0010\u00bc\u0002\u001a\u00020,2\b\u0010\u00bd\u0002\u001a\u00030\u00be\u0002H\u0002J\u0013\u0010\u00bf\u0002\u001a\u00030\u0093\u00022\u0007\u0010\u00c0\u0002\u001a\u00020,H\u0002J#\u0010\u00c1\u0002\u001a\u00020,2\t\u0010\u00c2\u0002\u001a\u0004\u0018\u00010,2\u0007\u0010\u00c8\u0001\u001a\u00020VH\u0002\u00a2\u0006\u0003\u0010\u00c3\u0002J\b\u0010\u00c4\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00c5\u0002\u001a\u00030\u00bc\u0001J\b\u0010\u00c6\u0002\u001a\u00030\u00bc\u0001J\u001b\u0010\u00c7\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020QJ$\u0010\u00c8\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020Q2\u0007\u0010\u00c0\u0001\u001a\u00020QJ#\u0010\u00c9\u0002\u001a\u00020,2\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00ca\u0002\u001a\u00020Q2\u0007\u0010\u00cb\u0002\u001a\u00020QJ\b\u0010\u00cc\u0002\u001a\u00030\u00bc\u0001J\u0007\u0010\u00cd\u0002\u001a\u00020nJ\b\u0010\u00ce\u0002\u001a\u00030\u00bc\u0001J\u0011\u0010\u00cf\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00d0\u0002\u001a\u00020QJ\u0011\u0010\u00d1\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00d2\u0002\u001a\u00020QJ&\u0010\u00d3\u0002\u001a\t\u0012\u0005\u0012\u00030\u00d4\u00020$2\u0007\u0010\u00c8\u0001\u001a\u00020V2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020.0$J\b\u0010\u00d5\u0002\u001a\u00030\u00bc\u0001J\n\u0010\u00d6\u0002\u001a\u00030\u00bc\u0001H\u0002J\u001f\u0010\u00d7\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00d8\u0002\u001a\u00030\u00be\u00022\t\b\u0002\u0010\u00d9\u0002\u001a\u00020,H\u0002J\u0013\u0010\u00da\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00db\u0002\u001a\u00020,H\u0002J\u001c\u0010\u00dc\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00dd\u0002\u001a\u00030\u0093\u00022\b\u0010\u00de\u0002\u001a\u00030\u0093\u0002J-\u0010\u00df\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020Q2\u0007\u0010\u00e0\u0002\u001a\u00020Q2\u0007\u0010\u00e1\u0002\u001a\u00020QJ\u0013\u0010\u00e2\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00e3\u0002\u001a\u00020VH\u0002J\u0014\u0010\u00e4\u0002\u001a\u00030\u00bc\u00012\b\u0010\u008d\u0002\u001a\u00030\u009a\u0002H\u0002J\u0011\u0010\u00e5\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00e6\u0002\u001a\u00020%J\u0013\u0010\u00e7\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00c8\u0001\u001a\u00020VH\u0002J\u0012\u0010\u00e8\u0002\u001a\u00030\u00bc\u00012\b\u0010\u00e9\u0002\u001a\u00030\u00c3\u0001J&\u0010\u00ea\u0002\u001a\u00030\u00bc\u00012\u0007\u0010\u00db\u0002\u001a\u00020,2\u0007\u0010\u00c8\u0001\u001a\u00020VH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00eb\u0002J\u00ac\u0005\u0010\u00ec\u0002\u001a\u00030\u00bc\u00012\u000b\b\u0002\u0010\u00ed\u0002\u001a\u0004\u0018\u00010Q2\u000b\b\u0002\u0010\u00ee\u0002\u001a\u0004\u0018\u00010Q2\u000b\b\u0002\u0010\u00ab\u0002\u001a\u0004\u0018\u00010Q2\u000b\b\u0002\u0010\u00ef\u0002\u001a\u0004\u0018\u00010Q2\u000b\b\u0002\u0010\u00f0\u0002\u001a\u0004\u0018\u00010Q2\u000b\b\u0002\u0010\u00f1\u0002\u001a\u0004\u0018\u00010,2\f\b\u0002\u0010\u00f2\u0002\u001a\u0005\u0018\u00010\u00f3\u00022\u000b\b\u0002\u0010\u00f4\u0002\u001a\u0004\u0018\u00010,2\f\b\u0002\u0010\u00f5\u0002\u001a\u0005\u0018\u00010\u00f6\u00022\f\b\u0002\u0010\u00f7\u0002\u001a\u0005\u0018\u00010\u00f8\u00022\f\b\u0002\u0010\u00f9\u0002\u001a\u0005\u0018\u00010\u00fa\u00022\f\b\u0002\u0010\u00fb\u0002\u001a\u0005\u0018\u00010\u00fa\u00022\u000b\b\u0002\u0010\u00fc\u0002\u001a\u0004\u0018\u00010,2\u000b\b\u0002\u0010\u00fd\u0002\u001a\u0004\u0018\u00010,2\u000b\b\u0002\u0010\u00c2\u0002\u001a\u0004\u0018\u00010,2\f\b\u0002\u0010\u00fe\u0002\u001a\u0005\u0018\u00010\u00ff\u00022\f\b\u0002\u0010\u0080\u0003\u001a\u0005\u0018\u00010\u00ff\u00022\f\b\u0002\u0010\u0081\u0003\u001a\u0005\u0018\u00010\u0082\u00032\u000b\b\u0002\u0010\u0083\u0003\u001a\u0004\u0018\u00010Q2\f\b\u0002\u0010\u0084\u0003\u001a\u0005\u0018\u00010\u0085\u00032\f\b\u0002\u0010\u0086\u0003\u001a\u0005\u0018\u00010\u0085\u00032\f\b\u0002\u0010\u0087\u0003\u001a\u0005\u0018\u00010\u0085\u00032\f\b\u0002\u0010\u0088\u0003\u001a\u0005\u0018\u00010\u0085\u00032\u000b\b\u0002\u0010\u0089\u0003\u001a\u0004\u0018\u00010Q2\u0012\b\u0002\u0010\u008a\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u00cd\u0001\u0018\u00010$2\f\b\u0002\u0010\u008b\u0003\u001a\u0005\u0018\u00010\u00be\u00012\f\b\u0002\u0010\u00d8\u0002\u001a\u0005\u0018\u00010\u00be\u00022\f\b\u0002\u0010\u008c\u0003\u001a\u0005\u0018\u00010\u008d\u00032\u000b\b\u0002\u0010\u008e\u0003\u001a\u0004\u0018\u00010,2\u000b\b\u0002\u0010\u008f\u0003\u001a\u0004\u0018\u00010,2\u000b\b\u0002\u0010\u0090\u0003\u001a\u0004\u0018\u00010Q2\u000b\b\u0002\u0010\u0091\u0003\u001a\u0004\u0018\u00010Q2\u000b\b\u0002\u0010\u0092\u0003\u001a\u0004\u0018\u00010Q2\f\b\u0002\u0010\u0093\u0003\u001a\u0005\u0018\u00010\u0093\u00022\u0011\b\u0002\u0010\u0094\u0003\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010$2\u0011\b\u0002\u0010\u0095\u0003\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$2\u000b\b\u0002\u0010\u0096\u0003\u001a\u0004\u0018\u00010Q2\u0012\b\u0002\u0010\u0097\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u00be\u0001\u0018\u00010$2\u0012\b\u0002\u0010\u0098\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u00be\u0001\u0018\u00010$2\u0012\b\u0002\u0010\u0099\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u00be\u0001\u0018\u00010$2\u0012\b\u0002\u0010\u009a\u0003\u001a\u000b\u0012\u0005\u0012\u00030\u00c3\u0001\u0018\u00010$2\f\b\u0002\u0010\u009b\u0003\u001a\u0005\u0018\u00010\u00be\u00012\f\b\u0002\u0010\u009c\u0003\u001a\u0005\u0018\u00010\u0093\u00022\u000b\b\u0002\u0010\u009d\u0003\u001a\u0004\u0018\u00010,2\u0011\b\u0002\u0010\u009e\u0003\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\f\b\u0002\u0010\u009f\u0003\u001a\u0005\u0018\u00010\u0093\u0002\u00a2\u0006\u0003\u0010\u00a0\u0003J\u0013\u0010\u00a1\u0003\u001a\u00030\u00bc\u00012\u0007\u0010\u00a2\u0003\u001a\u00020VH\u0002J\u001d\u0010\u00a3\u0003\u001a\u00030\u00bc\u00012\b\u0010\u00a4\u0003\u001a\u00030\u00ec\u00012\t\u0010\u00a5\u0003\u001a\u0004\u0018\u00010QJ,\u0010\u00a6\u0003\u001a\u00030\u00bc\u00012\b\u0010\u00bd\u0001\u001a\u00030\u00be\u00012\u0007\u0010\u00bf\u0001\u001a\u00020Q2\r\u0010\u00a7\u0003\u001a\b\u0012\u0004\u0012\u00020Q0$H\u0002J\u0011\u0010\u00a8\u0003\u001a\u00030\u00bc\u00012\u0007\u0010\u00a9\u0003\u001a\u00020QR\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0$0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0$0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0$0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000$0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020$0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0$0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$08\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R+\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020<8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020<0E\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0$08\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020Q8F\u00a2\u0006\u0006\u001a\u0004\bR\u0010SR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0UX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0$08\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010:R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0E\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010GR\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0E\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010GR+\u0010_\u001a\u00020Z2\u0006\u0010;\u001a\u00020Z8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bd\u0010C\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR+\u0010e\u001a\u00020]2\u0006\u0010;\u001a\u00020]8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bj\u0010C\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020,08\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010:R\u0010\u0010m\u001a\u0004\u0018\u00010nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010o\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020,8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bq\u0010pR\u0011\u0010r\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\br\u0010pR\u0011\u0010s\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\bs\u0010pR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010t\u001a\b\u0012\u0004\u0012\u00020u08\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010:R\u000e\u0010w\u001a\u00020xX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010y\u001a\u00020z8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b{\u0010|R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u007f\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u0083\u0001\u0010O\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0$08\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010:R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010;\u001a\u00030\u0086\u00018B@BX\u0082\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u008c\u0001\u0010C\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010E\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010GR \u0010\u008f\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u0093\u0001\u0010O\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0094\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000$08\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010:R\u001f\u0010\u0096\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020$08\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010:R\u001a\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010E\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010GR3\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010;\u001a\u00030\u009b\u00018B@BX\u0082\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u00a1\u0001\u0010C\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010\u00a0\u0001R\u001a\u0010\u00a2\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010E\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a3\u0001\u0010GR\u001a\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020%0$8F\u00a2\u0006\b\u001a\u0006\b\u00a5\u0001\u0010\u00a6\u0001R\u001a\u0010\u00a7\u0001\u001a\b\u0012\u0004\u0012\u00020%0$8F\u00a2\u0006\b\u001a\u0006\b\u00a8\u0001\u0010\u00a6\u0001R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00a9\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0$08\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00aa\u0001\u0010:R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u00ac\u0001\u001a\u00030\u00ab\u00012\u0007\u0010;\u001a\u00030\u00ab\u00018B@BX\u0082\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u00b1\u0001\u0010C\u001a\u0006\b\u00ad\u0001\u0010\u00ae\u0001\"\u0006\b\u00af\u0001\u0010\u00b0\u0001R\u001a\u0010\u00b2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ab\u00010E\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b3\u0001\u0010GR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u00b4\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0UX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R3\u0010\u00b5\u0001\u001a\u00030\u0099\u00012\u0007\u0010;\u001a\u00030\u0099\u00018B@BX\u0082\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u00ba\u0001\u0010C\u001a\u0006\b\u00b6\u0001\u0010\u00b7\u0001\"\u0006\b\u00b8\u0001\u0010\u00b9\u0001\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00b6\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "productRepository", "Lcom/woocommerce/android/ui/products/ProductDetailRepository;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "resources", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "productCategoriesRepository", "Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository;", "productTagsRepository", "Lcom/woocommerce/android/ui/products/tags/ProductTagsRepository;", "mediaFilesRepository", "Lcom/woocommerce/android/media/MediaFilesRepository;", "variationRepository", "Lcom/woocommerce/android/ui/products/variations/VariationRepository;", "mediaFileUploadHandler", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;", "prefs", "Lcom/woocommerce/android/AppPrefs;", "addonRepository", "Lcom/woocommerce/android/ui/products/addons/AddonRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/ui/products/ParameterRepository;Lcom/woocommerce/android/ui/products/ProductDetailRepository;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository;Lcom/woocommerce/android/ui/products/tags/ProductTagsRepository;Lcom/woocommerce/android/media/MediaFilesRepository;Lcom/woocommerce/android/ui/products/variations/VariationRepository;Lcom/woocommerce/android/ui/media/MediaFileUploadHandler;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/ui/products/addons/AddonRepository;)V", "_addedProductTags", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/ProductTag;", "_attributeList", "", "Lcom/woocommerce/android/model/ProductAttribute;", "_attributeTermsList", "Lcom/woocommerce/android/model/ProductAttributeTerm;", "_globalAttributeList", "Lcom/woocommerce/android/model/ProductGlobalAttribute;", "_hasChanges", "Lkotlinx/coroutines/flow/StateFlow;", "", "_productCategories", "Lcom/woocommerce/android/model/ProductCategory;", "_productDetailBottomSheetList", "Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder$ProductDetailBottomSheetUiItem;", "_productDetailCards", "Lcom/woocommerce/android/ui/products/models/ProductPropertyCard;", "_productTags", "addedProductTags", "getAddedProductTags", "()Landroidx/lifecycle/MutableLiveData;", "attributeList", "Landroidx/lifecycle/LiveData;", "getAttributeList", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$AttributeListViewState;", "attributeListViewState", "getAttributeListViewState", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel$AttributeListViewState;", "setAttributeListViewState", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel$AttributeListViewState;)V", "attributeListViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "attributeListViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getAttributeListViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "attributeTermsList", "getAttributeTermsList", "cardBuilder", "Lcom/woocommerce/android/ui/products/ProductDetailCardBuilder;", "getCardBuilder", "()Lcom/woocommerce/android/ui/products/ProductDetailCardBuilder;", "cardBuilder$delegate", "Lkotlin/Lazy;", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "draftChanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/model/Product;", "globalAttributeList", "getGlobalAttributeList", "globalAttributeTermsViewStateData", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesTermsViewState;", "getGlobalAttributeTermsViewStateData", "globalAttributeViewStateData", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesViewState;", "getGlobalAttributeViewStateData", "globalAttributesTermsViewState", "getGlobalAttributesTermsViewState", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesTermsViewState;", "setGlobalAttributesTermsViewState", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesTermsViewState;)V", "globalAttributesTermsViewState$delegate", "globalAttributesViewState", "getGlobalAttributesViewState", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesViewState;", "setGlobalAttributesViewState", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesViewState;)V", "globalAttributesViewState$delegate", "hasChanges", "getHasChanges", "imageUploadsJob", "Lkotlinx/coroutines/Job;", "isAddFlowEntryPoint", "()Z", "isProductStoredAtSite", "isProductUnderCreation", "isTrashEnabled", "menuButtonsState", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$MenuButtonsState;", "getMenuButtonsState", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "navArgs", "Lcom/woocommerce/android/ui/products/ProductDetailFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductDetailFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "getParameters", "()Lcom/woocommerce/android/ui/products/models/SiteParameters;", "parameters$delegate", "productCategories", "getProductCategories", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductCategoriesViewState;", "productCategoriesViewState", "getProductCategoriesViewState", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductCategoriesViewState;", "setProductCategoriesViewState", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductCategoriesViewState;)V", "productCategoriesViewState$delegate", "productCategoriesViewStateData", "getProductCategoriesViewStateData", "productDetailBottomSheetBuilder", "Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder;", "getProductDetailBottomSheetBuilder", "()Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder;", "productDetailBottomSheetBuilder$delegate", "productDetailBottomSheetList", "getProductDetailBottomSheetList", "productDetailCards", "getProductDetailCards", "productDetailViewStateData", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDetailViewState;", "getProductDetailViewStateData", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDownloadsViewState;", "productDownloadsViewState", "getProductDownloadsViewState", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDownloadsViewState;", "setProductDownloadsViewState", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDownloadsViewState;)V", "productDownloadsViewState$delegate", "productDownloadsViewStateData", "getProductDownloadsViewStateData", "productDraftAttributes", "getProductDraftAttributes", "()Ljava/util/List;", "productDraftVariationAttributes", "getProductDraftVariationAttributes", "productTags", "getProductTags", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductTagsViewState;", "productTagsViewState", "getProductTagsViewState", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductTagsViewState;", "setProductTagsViewState", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductTagsViewState;)V", "productTagsViewState$delegate", "productTagsViewStateData", "getProductTagsViewStateData", "storedProduct", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDetailViewState;", "setViewState", "(Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDetailViewState;)V", "viewState$delegate", "addAttributeTermToDraft", "", "attributeId", "", "attributeName", "termName", "addDownloadableFileToDraft", "file", "Lcom/woocommerce/android/model/ProductFile;", "addLocalAttribute", "isVariationCreation", "addProduct", "Lkotlin/Pair;", "product", "(Lcom/woocommerce/android/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addProductImageListToDraft", "imageList", "Ljava/util/ArrayList;", "Lcom/woocommerce/android/model/Product$Image;", "Lkotlin/collections/ArrayList;", "addProductImageToDraft", "image", "checkConnection", "clearProductTagsState", "containsAttributeName", "createDefaultProductForAddFlow", "createEmptyVariation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDownloadableFile", "enableLocalAttributeForVariations", "fetchBottomSheetList", "fetchGlobalAttributeTerms", "remoteAttributeId", "fetchGlobalAttributes", "fetchProduct", "remoteProductId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductCategories", "loadMore", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductPassword", "fetchProductTags", "searchQuery", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterProductTagList", "getDraftAttribute", "getProduct", "getProductDraftAttributeTerms", "getProductVisibility", "Lcom/woocommerce/android/ui/products/settings/ProductVisibility;", "getRemoteProductId", "getShippingClassByRemoteShippingClassId", "remoteShippingClassId", "hasAttributeChanges", "hasCategoryChanges", "hasDownloadsChanges", "hasDownloadsSettingsChanges", "hasExternalLinkChanges", "hasLinkedProductChanges", "hasSettingsChanges", "hasTagChanges", "initializeStoredProductAfterRestoration", "initializeViewState", "isUploadingImages", "loadGlobalAttributes", "loadProductCategories", "loadProductDraftAttributes", "loadProductTags", "loadProductTaxAndShippingClassDependencies", "loadRemoteProduct", "observeImageUploadEvents", "observeProductSpecificAddons", "Lkotlinx/coroutines/flow/Flow;", "Lorg/wordpress/android/fluxc/domain/Addon;", "productRemoteId", "onAddAttributeButtonClick", "onAddCategoryButtonClicked", "onAddDownloadableFileClicked", "onAddFirstVariationClicked", "onAddImageButtonClicked", "onAttributeListItemClick", "onBackButtonClicked", "event", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "onBackButtonClickedProductDetail", "onCleared", "onDownloadExpiryChanged", "value", "", "onDownloadLimitChanged", "onDownloadsSettingsClicked", "onEditProductCardClicked", "target", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "onGenerateVariationClicked", "onImageClicked", "onLoadMoreCategoriesRequested", "onLoadMoreTagsRequested", "onProductCategoryAdded", "category", "onProductDetailBottomSheetItemSelected", "uiItem", "onProductDownloadClicked", "onProductTagAdded", "tagName", "onProductTagSelected", "tag", "onProductTagSelectionRemoved", "onProductTagsBackButtonClicked", "onProductTitleChanged", "title", "onPublishButtonClicked", "onRenameAttributeButtonClick", "onSaveAsDraftButtonClicked", "onSaveButtonClicked", "onSettingsButtonClicked", "onSettingsCatalogVisibilityButtonClicked", "onSettingsMenuOrderButtonClicked", "onSettingsSlugButtonClicked", "onSettingsStatusButtonClicked", "onSettingsVisibilityButtonClicked", "onShareButtonClicked", "onTrashButtonClicked", "onVariationAmountReceived", "variationAmount", "onViewProductOnStoreLinkClicked", "pickAddProductRequestSnackbarText", "productWasAdded", "requestedProductStatus", "Lcom/woocommerce/android/ui/products/ProductStatus;", "pickProductUpdateSuccessText", "isProductPublishedOrSaved", "productHasSale", "isSaleScheduled", "(Ljava/lang/Boolean;Lcom/woocommerce/android/model/Product;)Z", "refreshProduct", "refreshProductCategories", "refreshProductTags", "removeAttributeFromDraft", "removeAttributeTermFromDraft", "renameAttributeInDraft", "oldAttributeName", "newAttributeName", "resetGlobalAttributeTerms", "saveAsDraftIfNewVariableProduct", "saveAttributeChanges", "setProductTagsFilter", "filter", "showAddProductDownload", "url", "sortAndStyleProductCategories", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "start", "startAddNewProduct", "startPublishProduct", "productStatus", "exitWhenDone", "startUpdateProduct", "isPublish", "swapDownloadableFiles", "from", "to", "swapProductDraftAttributeTerms", "fromTerm", "toTerm", "trackPublishing", "it", "trackWithProductId", "updateAttributeInDraft", "attributeToUpdate", "updateCards", "updateDownloadableFileInDraft", "updatedFile", "updateProduct", "(ZLcom/woocommerce/android/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProductDraft", "description", "shortDescription", "sku", "slug", "manageStock", "stockStatus", "Lcom/woocommerce/android/ui/products/ProductStockStatus;", "soldIndividually", "stockQuantity", "", "backorderStatus", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "regularPrice", "Ljava/math/BigDecimal;", "salePrice", "isOnSale", "isVirtual", "saleStartDate", "Ljava/util/Date;", "saleEndDate", "taxStatus", "Lcom/woocommerce/android/ui/products/ProductTaxStatus;", "taxClass", "length", "", "width", "height", "weight", "shippingClass", "images", "shippingClassId", "catalogVisibility", "Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;", "isFeatured", "reviewsAllowed", "purchaseNote", "externalUrl", "buttonText", "menuOrder", "categories", "tags", "type", "groupedProductIds", "upsellProductIds", "crossSellProductIds", "downloads", "downloadLimit", "downloadExpiry", "isDownloadable", "attributes", "numVariation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/woocommerce/android/ui/products/ProductStockStatus;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;Lcom/woocommerce/android/ui/products/ProductTaxStatus;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lcom/woocommerce/android/ui/products/ProductStatus;Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;)V", "updateProductState", "productToUpdateFrom", "updateProductVisibility", "visibility", "password", "updateTermsForAttribute", "updatedTerms", "uploadDownloadableFile", "uri", "AttributeListViewState", "Companion", "GlobalAttributesTermsViewState", "GlobalAttributesViewState", "HideImageUploadErrorSnackbar", "MenuButtonsState", "ProductCategoriesViewState", "ProductDetailViewState", "ProductDownloadsViewState", "ProductExitEvent", "ProductTagsViewState", "RefreshMenu", "WooCommerce_vanillaDebug"})
public final class ProductDetailViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.ui.products.ProductDetailRepository productRepository = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resources = null;
    private final com.woocommerce.android.ui.products.categories.ProductCategoriesRepository productCategoriesRepository = null;
    private final com.woocommerce.android.ui.products.tags.ProductTagsRepository productTagsRepository = null;
    private final com.woocommerce.android.media.MediaFilesRepository mediaFilesRepository = null;
    private final com.woocommerce.android.ui.products.variations.VariationRepository variationRepository = null;
    private final com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler = null;
    private final com.woocommerce.android.AppPrefs prefs = null;
    private final com.woocommerce.android.ui.products.addons.AddonRepository addonRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductDetailViewModel.Companion Companion = null;
    private static final java.lang.String KEY_PRODUCT_PARAMETERS = "key_product_parameters";
    public static final long DEFAULT_ADD_NEW_PRODUCT_ID = 0L;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    
    /**
     * Fetch product related properties (currency, product dimensions) for the site since we use this
     * variable in many different places in the product detail view such as pricing, shipping.
     */
    private final kotlin.Lazy parameters$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState> productDetailViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    /**
     * The goal of this is to allow composition of reactive streams using the product draft changes,
     * we need a separate stream because [LiveDataDelegate] supports a single observer.
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.model.Product> draftChanges = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.model.Product> storedProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState> productCategoriesViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productCategoriesViewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState> productTagsViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productTagsViewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState> productDownloadsViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productDownloadsViewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductCategory>> _productCategories = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductCategory>> productCategories = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductTag>> _productTags = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductTag>> productTags = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductTag>> _addedProductTags = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductTag>> addedProductTags = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductAttribute>> _attributeList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductAttribute>> attributeList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState> globalAttributeTermsViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate globalAttributesTermsViewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductAttributeTerm>> _attributeTermsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductAttributeTerm>> attributeTermsList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState> globalAttributeViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate globalAttributesViewState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState> attributeListViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate attributeListViewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductGlobalAttribute>> _globalAttributeList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductGlobalAttribute>> globalAttributeList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard>> _productDetailCards = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard>> productDetailCards = null;
    private final kotlin.Lazy cardBuilder$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem>> _productDetailBottomSheetList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem>> productDetailBottomSheetList = null;
    private final kotlin.Lazy productDetailBottomSheetBuilder$delegate = null;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> _hasChanges = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> hasChanges = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.ProductDetailViewModel.MenuButtonsState> menuButtonsState = null;
    private kotlinx.coroutines.Job imageUploadsJob;
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    
    @javax.inject.Inject()
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resources, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.ProductCategoriesRepository productCategoriesRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.tags.ProductTagsRepository productTagsRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.media.MediaFilesRepository mediaFilesRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.variations.VariationRepository variationRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.media.MediaFileUploadHandler mediaFileUploadHandler, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs prefs, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.addons.AddonRepository addonRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailFragmentArgs getNavArgs() {
        return null;
    }
    
    /**
     * Fetch product related properties (currency, product dimensions) for the site since we use this
     * variable in many different places in the product detail view such as pricing, shipping.
     */
    private final com.woocommerce.android.ui.products.models.SiteParameters getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState> getProductDetailViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState> getProductCategoriesViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState getProductCategoriesViewState() {
        return null;
    }
    
    private final void setProductCategoriesViewState(com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState> getProductTagsViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState getProductTagsViewState() {
        return null;
    }
    
    private final void setProductTagsViewState(com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState> getProductDownloadsViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState getProductDownloadsViewState() {
        return null;
    }
    
    private final void setProductDownloadsViewState(com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductCategory>> getProductCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductTag>> getProductTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductTag>> getAddedProductTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductAttribute>> getAttributeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState> getGlobalAttributeTermsViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState getGlobalAttributesTermsViewState() {
        return null;
    }
    
    private final void setGlobalAttributesTermsViewState(com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductAttributeTerm>> getAttributeTermsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState> getGlobalAttributeViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState getGlobalAttributesViewState() {
        return null;
    }
    
    private final void setGlobalAttributesViewState(com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState> getAttributeListViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState getAttributeListViewState() {
        return null;
    }
    
    private final void setAttributeListViewState(com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductGlobalAttribute>> getGlobalAttributeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.models.ProductPropertyCard>> getProductDetailCards() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailCardBuilder getCardBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem>> getProductDetailBottomSheetList() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder getProductDetailBottomSheetBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasChanges() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.ProductAttribute> getProductDraftVariationAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.ProductAttribute> getProductDraftAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.products.ProductDetailViewModel.MenuButtonsState> getMenuButtonsState() {
        return null;
    }
    
    private final boolean isProductStoredAtSite() {
        return false;
    }
    
    public final boolean isAddFlowEntryPoint() {
        return false;
    }
    
    public final boolean isProductUnderCreation() {
        return false;
    }
    
    public final boolean isTrashEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    public final void start() {
    }
    
    private final void initializeViewState() {
    }
    
    private final void startAddNewProduct() {
    }
    
    private final com.woocommerce.android.model.Product createDefaultProductForAddFlow() {
        return null;
    }
    
    private final void initializeStoredProductAfterRestoration() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState getProduct() {
        return null;
    }
    
    public final long getRemoteProductId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<org.wordpress.android.fluxc.domain.Addon>> observeProductSpecificAddons(long productRemoteId) {
        return null;
    }
    
    /**
     * Called when the Share menu button is clicked in Product detail screen
     */
    public final void onShareButtonClicked() {
    }
    
    /**
     * Called when the Trash menu item is clicked in Product detail screen
     */
    public final void onTrashButtonClicked() {
    }
    
    /**
     * Called when an existing image is selected in Product detail screen
     */
    public final void onImageClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product.Image image) {
    }
    
    /**
     * Called when the add image icon is clicked in Product detail screen
     */
    public final void onAddImageButtonClicked() {
    }
    
    public final void onAddFirstVariationClicked() {
    }
    
    /**
     * Called when the any of the editable sections (such as pricing, shipping, inventory)
     * is selected in Product detail screen
     */
    public final void onEditProductCardClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductNavigationTarget target, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.analytics.AnalyticsEvent stat) {
    }
    
    /**
     * Called during the Add _first_ Variation flow. Uploads the pending attribute changes and generates the first
     * variation for the variable product.
     */
    public final void onGenerateVariationClicked() {
    }
    
    private final java.lang.Object createEmptyVariation(kotlin.coroutines.Continuation<? super com.woocommerce.android.model.Product> continuation) {
        return null;
    }
    
    public final boolean hasCategoryChanges() {
        return false;
    }
    
    public final boolean hasTagChanges() {
        return false;
    }
    
    public final boolean hasSettingsChanges() {
        return false;
    }
    
    public final void onProductDownloadClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductFile file) {
    }
    
    public final void updateDownloadableFileInDraft(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductFile updatedFile) {
    }
    
    public final void addDownloadableFileToDraft(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductFile file) {
    }
    
    public final void swapDownloadableFiles(int from, int to) {
    }
    
    public final void deleteDownloadableFile(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductFile file) {
    }
    
    public final void onDownloadExpiryChanged(int value) {
    }
    
    public final void onDownloadLimitChanged(long value) {
    }
    
    public final void onDownloadsSettingsClicked() {
    }
    
    public final void onAddDownloadableFileClicked() {
    }
    
    public final void onVariationAmountReceived(int variationAmount) {
    }
    
    public final void uploadDownloadableFile(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public final void showAddProductDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final boolean hasExternalLinkChanges() {
        return false;
    }
    
    public final boolean hasLinkedProductChanges() {
        return false;
    }
    
    public final boolean hasDownloadsChanges() {
        return false;
    }
    
    public final boolean hasDownloadsSettingsChanges() {
        return false;
    }
    
    /**
     * Called when the back= button is clicked in a product sub detail screen
     */
    public final void onBackButtonClicked(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent event) {
    }
    
    /**
     * Method called when the back button in product detail is clicked. We show a discard dialog if any
     * changes have been made to the [Product] model locally that still need to be saved to the backend.
     */
    public final boolean onBackButtonClickedProductDetail() {
        return false;
    }
    
    public final void onSaveButtonClicked() {
    }
    
    public final void onPublishButtonClicked() {
    }
    
    /**
     * Called when the "Save as draft" button is clicked in Product detail screen
     */
    public final void onSaveAsDraftButtonClicked() {
    }
    
    /**
     * When creating a new Variable Product, if we're about to do changes
     * at the Attributes and Variations section, we need the Product to be
     * represented at the Site too since attributes/variations operations
     * requires operations with a product remote ID.
     *
     * To be able to achieve that, this method silently pushes the new product
     * to the site without the user noticing given that:
     *
     * 1. it doesn't have a valid remote ID yet
     * 2. is of Variable type
     * 3. is a Draft
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveAsDraftIfNewVariableProduct() {
        return null;
    }
    
    private final void startUpdateProduct(boolean isPublish) {
    }
    
    private final void startPublishProduct(com.woocommerce.android.ui.products.ProductStatus productStatus, boolean exitWhenDone) {
    }
    
    /**
     * during a product creation flow flagged by [isAddFlowEntryPoint],
     * we may have to POST the product before hand in order to operate
     * some remotes properties of the Product.
     * (e.g. Variable Product when editing the Attributes and Variations)
     *
     * To avoid user confusion around the product creation flow, when a product is posted before hand,
     * the `PUBLISH` menu button will execute a update instead of repost the same product to the site
     * so we also should handle the Snackbar text prompt to follow this rule
     */
    private final int pickProductUpdateSuccessText(boolean isProductPublishedOrSaved) {
        return 0;
    }
    
    private final int pickAddProductRequestSnackbarText(boolean productWasAdded, com.woocommerce.android.ui.products.ProductStatus requestedProductStatus) {
        return 0;
    }
    
    private final void trackPublishing(com.woocommerce.android.model.Product it) {
    }
    
    private final void trackWithProductId(com.woocommerce.android.analytics.AnalyticsEvent event) {
    }
    
    /**
     * Called when the user taps the Product settings menu item
     */
    public final void onSettingsButtonClicked() {
    }
    
    /**
     * Called when the user taps the status in product settings
     */
    public final void onSettingsStatusButtonClicked() {
    }
    
    /**
     * Called when the user taps the product catalog visibility in product settings
     */
    public final void onSettingsCatalogVisibilityButtonClicked() {
    }
    
    /**
     * Called when the user taps the product visibility in product settings
     */
    public final void onSettingsVisibilityButtonClicked() {
    }
    
    /**
     * Called when the user taps the product slug in product settings
     */
    public final void onSettingsSlugButtonClicked() {
    }
    
    /**
     * Called when the user taps the product menu order in product settings
     */
    public final void onSettingsMenuOrderButtonClicked() {
    }
    
    public final void onViewProductOnStoreLinkClicked() {
    }
    
    public final void onProductTitleChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    /**
     * Update all product fields that are edited by the user
     */
    @kotlin.Suppress(names = {"LongMethod", "ComplexMethod"})
    public final void updateProductDraft(@org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String shortDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean manageStock, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean soldIndividually, @org.jetbrains.annotations.Nullable()
    java.lang.Double stockQuantity, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal salePrice, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isOnSale, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isVirtual, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSaleScheduled, @org.jetbrains.annotations.Nullable()
    java.util.Date saleStartDate, @org.jetbrains.annotations.Nullable()
    java.util.Date saleEndDate, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.ProductTaxStatus taxStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String taxClass, @org.jetbrains.annotations.Nullable()
    java.lang.Float length, @org.jetbrains.annotations.Nullable()
    java.lang.Float width, @org.jetbrains.annotations.Nullable()
    java.lang.Float height, @org.jetbrains.annotations.Nullable()
    java.lang.Float weight, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingClass, @org.jetbrains.annotations.Nullable()
    java.util.List<com.woocommerce.android.model.Product.Image> images, @org.jetbrains.annotations.Nullable()
    java.lang.Long shippingClassId, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.ProductStatus productStatus, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.settings.ProductCatalogVisibility catalogVisibility, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFeatured, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean reviewsAllowed, @org.jetbrains.annotations.Nullable()
    java.lang.String purchaseNote, @org.jetbrains.annotations.Nullable()
    java.lang.String externalUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer menuOrder, @org.jetbrains.annotations.Nullable()
    java.util.List<com.woocommerce.android.model.ProductCategory> categories, @org.jetbrains.annotations.Nullable()
    java.util.List<com.woocommerce.android.model.ProductTag> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> groupedProductIds, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> upsellProductIds, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> crossSellProductIds, @org.jetbrains.annotations.Nullable()
    java.util.List<com.woocommerce.android.model.ProductFile> downloads, @org.jetbrains.annotations.Nullable()
    java.lang.Long downloadLimit, @org.jetbrains.annotations.Nullable()
    java.lang.Integer downloadExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isDownloadable, @org.jetbrains.annotations.Nullable()
    java.util.List<com.woocommerce.android.model.ProductAttribute> attributes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer numVariation) {
    }
    
    private final boolean productHasSale(java.lang.Boolean isSaleScheduled, com.woocommerce.android.model.Product product) {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void updateCards(com.woocommerce.android.model.Product product) {
    }
    
    private final void fetchBottomSheetList() {
    }
    
    public final void onProductDetailBottomSheetItemSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem uiItem) {
    }
    
    public final boolean checkConnection() {
        return false;
    }
    
    public final void refreshProduct() {
    }
    
    private final void loadRemoteProduct(long remoteProductId) {
    }
    
    /**
     * Called from the product visibility settings fragment when the user updates
     * the product's visibility and/or password
     */
    public final void updateProductVisibility(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.settings.ProductVisibility visibility, @org.jetbrains.annotations.Nullable()
    java.lang.String password) {
    }
    
    /**
     * Returns the draft visibility if a draft exists otherwise it returns the stored visibility.
     * The visibility is determined by the status and the password. If the password isn't empty, then
     * visibility is `PASSWORD_PROTECTED`. If there's no password and the product status is `PRIVATE`
     * then the visibility is `PRIVATE`, otherwise it's `PUBLIC`.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.settings.ProductVisibility getProductVisibility() {
        return null;
    }
    
    /**
     * Sends a request to fetch the product's password
     */
    private final java.lang.Object fetchProductPassword(long remoteProductId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchProduct(long remoteProductId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final boolean isUploadingImages() {
        return false;
    }
    
    /**
     * Loads the attributes assigned to the draft product, used by the attribute list fragment
     */
    public final void loadProductDraftAttributes() {
    }
    
    /**
     * Returns the list of term names for a specific attribute assigned to the product
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getProductDraftAttributeTerms(long attributeId, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName) {
        return null;
    }
    
    /**
     * Swaps two terms for a draft attribute
     */
    public final void swapProductDraftAttributeTerms(long attributeId, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName, @org.jetbrains.annotations.NotNull()
    java.lang.String fromTerm, @org.jetbrains.annotations.NotNull()
    java.lang.String toTerm) {
    }
    
    /**
     * Updates (replaces) the terms for a single attribute in the product draft
     */
    private final void updateTermsForAttribute(long attributeId, java.lang.String attributeName, java.util.List<java.lang.String> updatedTerms) {
    }
    
    /**
     * Fetches terms for a global product attribute
     */
    public final void fetchGlobalAttributeTerms(long remoteAttributeId) {
    }
    
    /**
     * Returns the draft attribute matching the passed id and name
     */
    private final com.woocommerce.android.model.ProductAttribute getDraftAttribute(long attributeId, java.lang.String attributeName) {
        return null;
    }
    
    public final void removeAttributeFromDraft(long attributeId, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName) {
    }
    
    /**
     * Updates (replaces) a single attribute in the product draft
     */
    public final void updateAttributeInDraft(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductAttribute attributeToUpdate) {
    }
    
    /**
     * Renames a single attribute in the product draft
     */
    public final boolean renameAttributeInDraft(long attributeId, @org.jetbrains.annotations.NotNull()
    java.lang.String oldAttributeName, @org.jetbrains.annotations.NotNull()
    java.lang.String newAttributeName) {
        return false;
    }
    
    /**
     * Adds a new term to a the product draft attributes
     */
    public final void addAttributeTermToDraft(long attributeId, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName, @org.jetbrains.annotations.NotNull()
    java.lang.String termName) {
    }
    
    /**
     * Removes a term from the product draft attributes
     */
    public final void removeAttributeTermFromDraft(long attributeId, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName, @org.jetbrains.annotations.NotNull()
    java.lang.String termName) {
    }
    
    /**
     * Saves any attribute changes to the backend
     */
    public final void saveAttributeChanges() {
    }
    
    /**
     * Clears the global attribute terms
     */
    public final void resetGlobalAttributeTerms() {
    }
    
    /**
     * User clicked an attribute in the attribute list fragment or the add attribute fragment
     */
    public final void onAttributeListItemClick(long attributeId, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName, boolean isVariationCreation) {
    }
    
    /**
     * User tapped "Add attribute" on the attribute list fragment
     */
    public final void onAddAttributeButtonClick() {
    }
    
    /**
     * User tapped "Rename" on the attribute terms fragment
     */
    public final void onRenameAttributeButtonClick(@org.jetbrains.annotations.NotNull()
    java.lang.String attributeName) {
    }
    
    public final boolean hasAttributeChanges() {
        return false;
    }
    
    /**
     * Used by the add attribute screen to fetch the list of store-wide product attributes
     */
    public final void fetchGlobalAttributes() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.ProductGlobalAttribute> loadGlobalAttributes() {
        return null;
    }
    
    /**
     * Returns true if an attribute with this id & name is assigned to the product draft
     */
    private final boolean containsAttributeName(java.lang.String attributeName) {
        return false;
    }
    
    /**
     * Called from the attribute list when the user enters a new attribute
     */
    public final void addLocalAttribute(@org.jetbrains.annotations.NotNull()
    java.lang.String attributeName, boolean isVariationCreation) {
    }
    
    /**
     * Converts a given Local Attribute to a Variation enabled one
     */
    private final java.util.List<com.woocommerce.android.model.ProductAttribute> enableLocalAttributeForVariations(long attributeId) {
        return null;
    }
    
    /**
     * Updates the product to the backend only if network is connected.
     * Otherwise, an offline snackbar is displayed.
     */
    private final java.lang.Object updateProduct(boolean isPublish, com.woocommerce.android.model.Product product, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Add a new product to the backend only if network is connected.
     * Otherwise, an offline snackbar is displayed. Returns true only
     * if product successfully added
     */
    private final java.lang.Object addProduct(com.woocommerce.android.model.Product product, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.Long>> continuation) {
        return null;
    }
    
    /**
     * Fetch the shipping class name of a product based on the remote shipping class id
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShippingClassByRemoteShippingClassId(long remoteShippingClassId) {
        return null;
    }
    
    private final void updateProductState(com.woocommerce.android.model.Product productToUpdateFrom) {
    }
    
    private final void loadProductTaxAndShippingClassDependencies(com.woocommerce.android.model.Product product) {
    }
    
    private final void observeImageUploadEvents() {
    }
    
    /**
     * Adds a single image to the list of product draft's images
     */
    public final void addProductImageToDraft(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product.Image image) {
    }
    
    /**
     * Adds multiple images to the list of product draft's images
     */
    public final void addProductImageListToDraft(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocommerce.android.model.Product.Image> imageList) {
    }
    
    public final void fetchProductCategories() {
    }
    
    public final void onAddCategoryButtonClicked() {
    }
    
    public final void onProductCategoryAdded(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductCategory category) {
    }
    
    /**
     * Refreshes the list of categories by calling the [loadProductCategories] method
     * which eventually checks, if there is anything new to fetch from the server
     */
    public final void refreshProductCategories() {
    }
    
    /**
     * Loads the list of categories from the database or from the server.
     * This depends on whether categories are stored in the database, and if any new ones are
     * required to be fetched.
     *
     * @param loadMore Whether to load more categories after the ones loaded
     */
    private final void loadProductCategories(boolean loadMore) {
    }
    
    /**
     * Triggered when the user scrolls past the point of loaded categories
     * already displayed on the screen or on record.
     */
    public final void onLoadMoreCategoriesRequested() {
    }
    
    /**
     * This method is used to fetch the categories from the backend. It does not
     * check the database.
     *
     * @param loadMore Whether this is another page or the first one
     */
    private final java.lang.Object fetchProductCategories(boolean loadMore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * The method takes in a list of product categories and calculates the order and grouping of categories
     * by their parent ids. This creates a stable sorted list of categories by name. The returned list also
     * has margin data, which can be used to visually represent categories in a hierarchy under their
     * parent ids.
     *
     * @param product the product for which the categories are being styled
     * @param productCategories the list of product categories to sort and style
     * @return [List<ProductCategoryItemUiModel>] the sorted styled list of categories
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> sortAndStyleProductCategories(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product product, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.ProductCategory> productCategories) {
        return null;
    }
    
    public final void onProductTagsBackButtonClicked() {
    }
    
    /**
     * Method called when a tag is entered
     */
    public final void onProductTagAdded(@org.jetbrains.annotations.NotNull()
    java.lang.String tagName) {
    }
    
    /**
     * Method called when a tag is selected from the list of product tags
     */
    public final void onProductTagSelected(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductTag tag) {
    }
    
    /**
     * Method called when a tag is removed from the product
     */
    public final void onProductTagSelectionRemoved(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductTag tag) {
    }
    
    /**
     * Sets the product tag list to the passed list with the current filter applied and already added tags removed
     * Returns a list of product tags with the passed filter applied
     */
    private final void filterProductTagList(java.util.List<com.woocommerce.android.model.ProductTag> productTags) {
    }
    
    /**
     * Called when user types into product tag screen so we can provide live filtering
     */
    public final void setProductTagsFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
    }
    
    /**
     * Called when user exits the product tag fragment to clear the stored filter
     * (otherwise it will be retained when the user returns to the tag fragment)
     */
    public final void clearProductTagsState() {
    }
    
    /**
     * Refreshes the list of tags by calling the [loadProductTags] method
     * which eventually checks, if there is anything new to fetch from the server
     */
    public final void refreshProductTags() {
    }
    
    /**
     * Loads the list of tags from the database or from the server.
     * This depends on whether tags are stored in the database, and if any new ones are
     * required to be fetched.
     *
     * @param loadMore Whether to load more tags after the ones loaded
     */
    public final void loadProductTags(boolean loadMore) {
    }
    
    /**
     * Triggered when the user scrolls past the point of loaded tags
     * already displayed on the screen or on record.
     */
    public final void onLoadMoreTagsRequested() {
    }
    
    /**
     * This method is used to fetch the tags from the backend. It does not
     * check the database.
     *
     * @param loadMore Whether this is another page or the first one
     * @param searchQuery optional search query to fetch only matching tags
     */
    private final java.lang.Object fetchProductTags(boolean loadMore, java.lang.String searchQuery, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Sealed class that handles the back navigation for the product detail screens while providing a common
     * interface for managing them as a single type. Currently used in all the product sub detail screens when
     * back is clicked or DONE is clicked.
     *
     * Add a new class here for each new product sub detail screen to handle back navigation.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "shouldShowDiscardDialog", "", "(Z)V", "getShouldShowDiscardDialog", "()Z", "ExitAttributesAdded", "ExitExternalLink", "ExitLinkedProducts", "ExitProductAddAttribute", "ExitProductAddAttributeTerms", "ExitProductAddons", "ExitProductAttributeList", "ExitProductCategories", "ExitProductDownloads", "ExitProductDownloadsSettings", "ExitProductRenameAttribute", "ExitProductTags", "ExitSettings", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitExternalLink;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitSettings;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductCategories;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductTags;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitLinkedProducts;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductDownloads;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductDownloadsSettings;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAttributeList;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAddAttribute;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAddAttributeTerms;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductRenameAttribute;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitAttributesAdded;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAddons;", "WooCommerce_vanillaDebug"})
    public static abstract class ProductExitEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final boolean shouldShowDiscardDialog = false;
        
        private ProductExitEvent(boolean shouldShowDiscardDialog) {
            super(false);
        }
        
        public final boolean getShouldShowDiscardDialog() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitExternalLink;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitExternalLink extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitExternalLink() {
                super(false);
            }
            
            public ExitExternalLink(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitSettings;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitSettings extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitSettings() {
                super(false);
            }
            
            public ExitSettings(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductCategories;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductCategories extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitProductCategories() {
                super(false);
            }
            
            public ExitProductCategories(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductTags;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductTags extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitProductTags() {
                super(false);
            }
            
            public ExitProductTags(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitLinkedProducts;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitLinkedProducts extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitLinkedProducts() {
                super(false);
            }
            
            public ExitLinkedProducts(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductDownloads;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductDownloads extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitProductDownloads() {
                super(false);
            }
            
            public ExitProductDownloads(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductDownloadsSettings;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductDownloadsSettings extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitProductDownloadsSettings() {
                super(false);
            }
            
            public ExitProductDownloadsSettings(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAttributeList;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "variationCreated", "(ZZ)V", "getVariationCreated", "()Z", "WooCommerce_vanillaDebug"})
        public static final class ExitProductAttributeList extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            private final boolean variationCreated = false;
            
            public ExitProductAttributeList() {
                super(false);
            }
            
            public ExitProductAttributeList(boolean shouldShowDiscardDialog, boolean variationCreated) {
                super(false);
            }
            
            public final boolean getVariationCreated() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAddAttribute;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductAddAttribute extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitProductAddAttribute() {
                super(false);
            }
            
            public ExitProductAddAttribute(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAddAttributeTerms;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductAddAttributeTerms extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitProductAddAttributeTerms() {
                super(false);
            }
            
            public ExitProductAddAttributeTerms(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductRenameAttribute;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "shouldShowDiscardDialog", "", "(Z)V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductRenameAttribute extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            
            public ExitProductRenameAttribute() {
                super(false);
            }
            
            public ExitProductRenameAttribute(boolean shouldShowDiscardDialog) {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitAttributesAdded;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ExitAttributesAdded extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent.ExitAttributesAdded INSTANCE = null;
            
            private ExitAttributesAdded() {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent$ExitProductAddons;", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductExitEvent;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ExitProductAddons extends com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductExitEvent.ExitProductAddons INSTANCE = null;
            
            private ExitProductAddons() {
                super(false);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$RefreshMenu;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class RefreshMenu extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductDetailViewModel.RefreshMenu INSTANCE = null;
        
        private RefreshMenu() {
            super(false);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$HideImageUploadErrorSnackbar;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
    public static final class HideImageUploadErrorSnackbar extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductDetailViewModel.HideImageUploadErrorSnackbar INSTANCE = null;
        
        private HideImageUploadErrorSnackbar() {
            super(false);
        }
    }
    
    /**
     * [productDraft] is used for the UI. Any updates to the fields in the UI would update this model.
     * [storedProduct.value] is the [Product] model that is fetched from the API and available in the local db.
     * This is read only and is not updated in any way. It is used in the product detail screen, to check
     * if we need to display the UPDATE menu button (which is only displayed if there are changes made to
     * any of the product fields).
     *
     * When the user first enters the product detail screen, the [productDraft] and [storedProduct.value] are the same.
     * When a change is made to the product in the UI, the [productDraft] model is updated with whatever change
     * has been made in the UI.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u008a\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010)J\t\u0010*\u001a\u00020+H\u00d6\u0001J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020+H\u00d6\u0001J\t\u00100\u001a\u00020\u000bH\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+H\u00d6\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\t\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0004\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u000f\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0010\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00066"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDetailViewState;", "Landroid/os/Parcelable;", "productDraft", "Lcom/woocommerce/android/model/Product;", "isSkeletonShown", "", "uploadingImageUris", "", "Landroid/net/Uri;", "isProgressDialogShown", "storedPassword", "", "draftPassword", "showBottomSheetButton", "isConfirmingTrash", "isUploadingDownloadableFile", "isVariationListEmpty", "(Lcom/woocommerce/android/model/Product;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "getDraftPassword", "()Ljava/lang/String;", "()Z", "isPasswordChanged", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductDraft", "()Lcom/woocommerce/android/model/Product;", "getShowBottomSheetButton", "getStoredPassword", "getUploadingImageUris", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/woocommerce/android/model/Product;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDetailViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductDetailViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.model.Product productDraft = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<android.net.Uri> uploadingImageUris = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isProgressDialogShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String storedPassword = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String draftPassword = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean showBottomSheetButton = null;
        private final boolean isConfirmingTrash = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isUploadingDownloadableFile = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isVariationListEmpty = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState> CREATOR = null;
        
        /**
         * [productDraft] is used for the UI. Any updates to the fields in the UI would update this model.
         * [storedProduct.value] is the [Product] model that is fetched from the API and available in the local db.
         * This is read only and is not updated in any way. It is used in the product detail screen, to check
         * if we need to display the UPDATE menu button (which is only displayed if there are changes made to
         * any of the product fields).
         *
         * When the user first enters the product detail screen, the [productDraft] and [storedProduct.value] are the same.
         * When a change is made to the product in the UI, the [productDraft] model is updated with whatever change
         * has been made in the UI.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState copy(@org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Product productDraft, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends android.net.Uri> uploadingImageUris, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable()
        java.lang.String storedPassword, @org.jetbrains.annotations.Nullable()
        java.lang.String draftPassword, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean showBottomSheetButton, boolean isConfirmingTrash, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isUploadingDownloadableFile, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isVariationListEmpty) {
            return null;
        }
        
        /**
         * [productDraft] is used for the UI. Any updates to the fields in the UI would update this model.
         * [storedProduct.value] is the [Product] model that is fetched from the API and available in the local db.
         * This is read only and is not updated in any way. It is used in the product detail screen, to check
         * if we need to display the UPDATE menu button (which is only displayed if there are changes made to
         * any of the product fields).
         *
         * When the user first enters the product detail screen, the [productDraft] and [storedProduct.value] are the same.
         * When a change is made to the product in the UI, the [productDraft] model is updated with whatever change
         * has been made in the UI.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * [productDraft] is used for the UI. Any updates to the fields in the UI would update this model.
         * [storedProduct.value] is the [Product] model that is fetched from the API and available in the local db.
         * This is read only and is not updated in any way. It is used in the product detail screen, to check
         * if we need to display the UPDATE menu button (which is only displayed if there are changes made to
         * any of the product fields).
         *
         * When the user first enters the product detail screen, the [productDraft] and [storedProduct.value] are the same.
         * When a change is made to the product in the UI, the [productDraft] model is updated with whatever change
         * has been made in the UI.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * [productDraft] is used for the UI. Any updates to the fields in the UI would update this model.
         * [storedProduct.value] is the [Product] model that is fetched from the API and available in the local db.
         * This is read only and is not updated in any way. It is used in the product detail screen, to check
         * if we need to display the UPDATE menu button (which is only displayed if there are changes made to
         * any of the product fields).
         *
         * When the user first enters the product detail screen, the [productDraft] and [storedProduct.value] are the same.
         * When a change is made to the product in the UI, the [productDraft] model is updated with whatever change
         * has been made in the UI.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductDetailViewState() {
            super();
        }
        
        public ProductDetailViewState(@org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Product productDraft, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends android.net.Uri> uploadingImageUris, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.Nullable()
        java.lang.String storedPassword, @org.jetbrains.annotations.Nullable()
        java.lang.String draftPassword, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean showBottomSheetButton, boolean isConfirmingTrash, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isUploadingDownloadableFile, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isVariationListEmpty) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Product component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Product getProductDraft() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<android.net.Uri> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<android.net.Uri> getUploadingImageUris() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isProgressDialogShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStoredPassword() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDraftPassword() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getShowBottomSheetButton() {
            return null;
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final boolean isConfirmingTrash() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isUploadingDownloadableFile() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isVariationListEmpty() {
            return null;
        }
        
        public final boolean isPasswordChanged() {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDetailViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJV\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\b\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0007\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000b\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductCategoriesViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoading", "isLoadingMore", "canLoadMore", "isRefreshing", "isEmptyViewVisible", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCanLoadMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isAddCategoryButtonVisible", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductCategoriesViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductCategoriesViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoading = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoadingMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean canLoadMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isEmptyViewVisible = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductCategoriesViewState() {
            super();
        }
        
        public ProductCategoriesViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoading() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoadingMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCanLoadMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isEmptyViewVisible() {
            return null;
        }
        
        public final boolean isAddCategoryButtonVisible() {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductCategoriesViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u000bH\u00c6\u0003Jl\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\"\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001dH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\b\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0005\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\t\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0007\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductTagsViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoading", "isLoadingMore", "canLoadMore", "isRefreshing", "isEmptyViewVisible", "isProgressDialogShown", "currentFilter", "", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCanLoadMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentFilter", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductTagsViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductTagsViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoading = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoadingMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean canLoadMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isEmptyViewVisible = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isProgressDialogShown = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currentFilter = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.NotNull()
        java.lang.String currentFilter) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductTagsViewState() {
            super();
        }
        
        public ProductTagsViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoading, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean canLoadMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isEmptyViewVisible, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isProgressDialogShown, @org.jetbrains.annotations.NotNull()
        java.lang.String currentFilter) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoading() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoadingMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCanLoadMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isEmptyViewVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isProgressDialogShown() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrentFilter() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductTagsViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDownloadsViewState;", "Landroid/os/Parcelable;", "isUploadingDownloadableFile", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductDetailViewModel$ProductDownloadsViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductDownloadsViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isUploadingDownloadableFile = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isUploadingDownloadableFile) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductDownloadsViewState() {
            super();
        }
        
        public ProductDownloadsViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isUploadingDownloadableFile) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isUploadingDownloadableFile() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.ProductDownloadsViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class GlobalAttributesViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public GlobalAttributesViewState() {
            super();
        }
        
        public GlobalAttributesViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesTermsViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductDetailViewModel$GlobalAttributesTermsViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class GlobalAttributesTermsViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public GlobalAttributesTermsViewState() {
            super();
        }
        
        public GlobalAttributesTermsViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.GlobalAttributesTermsViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$AttributeListViewState;", "Landroid/os/Parcelable;", "isCreatingVariationDialogShown", "", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/ProductDetailViewModel$AttributeListViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class AttributeListViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isCreatingVariationDialogShown = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isCreatingVariationDialogShown) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public AttributeListViewState() {
            super();
        }
        
        public AttributeListViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isCreatingVariationDialogShown) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isCreatingVariationDialogShown() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductDetailViewModel.AttributeListViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$MenuButtonsState;", "", "saveOption", "", "saveAsDraftOption", "publishOption", "viewProductOption", "shareOption", "trashOption", "(ZZZZZZ)V", "getPublishOption", "()Z", "getSaveAsDraftOption", "getSaveOption", "getShareOption", "getTrashOption", "getViewProductOption", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class MenuButtonsState {
        private final boolean saveOption = false;
        private final boolean saveAsDraftOption = false;
        private final boolean publishOption = false;
        private final boolean viewProductOption = false;
        private final boolean shareOption = false;
        private final boolean trashOption = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductDetailViewModel.MenuButtonsState copy(boolean saveOption, boolean saveAsDraftOption, boolean publishOption, boolean viewProductOption, boolean shareOption, boolean trashOption) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public MenuButtonsState(boolean saveOption, boolean saveAsDraftOption, boolean publishOption, boolean viewProductOption, boolean shareOption, boolean trashOption) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getSaveOption() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getSaveAsDraftOption() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getPublishOption() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getViewProductOption() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean getShareOption() {
            return false;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getTrashOption() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailViewModel$Companion;", "", "()V", "DEFAULT_ADD_NEW_PRODUCT_ID", "", "KEY_PRODUCT_PARAMETERS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}