package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\\\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00ee\u00012\u00020\u00012\u00020\u0002:\u0004\u00ee\u0001\u00ef\u0001B\u0083\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010\'\u001a\u00020\u0010\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020\u0010\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/\u0012\u0006\u00101\u001a\u00020\u0004\u0012\u0006\u00102\u001a\u00020\u001c\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u00104\u001a\u00020\u001c\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002060/\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002080/\u0012\b\u00109\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010;\u001a\u00020\u0010\u0012\u0006\u0010<\u001a\u00020=\u0012\u0006\u0010>\u001a\u00020\u0010\u0012\u0006\u0010?\u001a\u00020\u0010\u0012\u0006\u0010@\u001a\u00020\u001c\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0/\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0/\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040/\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040/\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040/\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040/\u0012\u0006\u0010I\u001a\u00020\u001e\u0012\u0006\u0010J\u001a\u00020\u001e\u0012\u0006\u0010K\u001a\u00020\u001e\u0012\u0006\u0010L\u001a\u00020\u001e\u00a2\u0006\u0002\u0010MJ\n\u0010\u009a\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0014H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0016H\u00c6\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u001cH\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003J\f\u0010\u00a9\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003J\f\u0010\u00aa\u0001\u001a\u0004\u0018\u00010#H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020)H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\u0010H\u00c6\u0003J\u0010\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u0002000/H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u001cH\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u001cH\u00c6\u0003J\u0010\u0010\u00b8\u0001\u001a\b\u0012\u0004\u0012\u0002060/H\u00c6\u0003J\u0010\u0010\u00b9\u0001\u001a\b\u0012\u0004\u0012\u0002080/H\u00c6\u0003J\f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020=H\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u001cH\u00c6\u0003J\u0010\u0010\u00c2\u0001\u001a\b\u0012\u0004\u0012\u00020B0/H\u00c6\u0003J\u0010\u0010\u00c3\u0001\u001a\b\u0012\u0004\u0012\u00020D0/H\u00c6\u0003J\u0010\u0010\u00c4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040/H\u00c6\u0003J\u0010\u0010\u00c5\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040/H\u00c6\u0003J\n\u0010\u00c6\u0001\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u00c7\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040/H\u00c6\u0003J\u0010\u0010\u00c8\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040/H\u00c6\u0003J\n\u0010\u00c9\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00cb\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00cc\u0001\u001a\u00020\u001eH\u00c6\u0003J\n\u0010\u00cd\u0001\u001a\u00020\u0006H\u00c6\u0003J\f\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\n\u0010\u00d0\u0001\u001a\u00020\u0010H\u00c6\u0003J\u00f6\u0004\u0010\u00d1\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010\'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00102\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u001c2\b\b\u0002\u00103\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020\u001c2\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u0002060/2\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u0002080/2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010;\u001a\u00020\u00102\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020\u00102\b\b\u0002\u0010?\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020\u001c2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020B0/2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020D0/2\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040/2\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040/2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040/2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040/2\b\b\u0002\u0010I\u001a\u00020\u001e2\b\b\u0002\u0010J\u001a\u00020\u001e2\b\b\u0002\u0010K\u001a\u00020\u001e2\b\b\u0002\u0010L\u001a\u00020\u001eH\u00c6\u0001J\n\u0010\u00d2\u0001\u001a\u00020\u001cH\u00d6\u0001J\u0016\u0010\u00d3\u0001\u001a\u00020\u00102\n\u0010\u00d4\u0001\u001a\u0005\u0018\u00010\u00d5\u0001H\u00d6\u0003J\u0012\u0010\u00d6\u0001\u001a\u00020\u00102\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0000J\u0012\u0010\u00d8\u0001\u001a\u00020\u00102\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0000J\u0012\u0010\u00d9\u0001\u001a\u00020\u00102\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0000J\u0012\u0010\u00da\u0001\u001a\u00020\u00102\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0000J\u0012\u0010\u00db\u0001\u001a\u00020\u00102\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0000J\u0007\u0010\u00dc\u0001\u001a\u00020\u0010J\u0012\u0010\u00dd\u0001\u001a\u00020\u00102\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0000J\u0012\u0010\u00de\u0001\u001a\u00020\u00102\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0000J\n\u0010\u00df\u0001\u001a\u00020\u001cH\u00d6\u0001J\u0018\u0010\u00e0\u0001\u001a\u00020\u00102\r\u0010\u00e1\u0001\u001a\b\u0012\u0004\u0012\u00020B0/H\u0002J\u0010\u0010\u00e2\u0001\u001a\u00020\u00102\u0007\u0010\u00e3\u0001\u001a\u00020\u0000J\u0018\u0010\u00e4\u0001\u001a\u00020\u00102\r\u0010\u00e5\u0001\u001a\b\u0012\u0004\u0012\u00020D0/H\u0002J\u0012\u0010\u00e6\u0001\u001a\u00020\u00002\t\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0000J\n\u0010\u00e8\u0001\u001a\u00020\u0006H\u00d6\u0001J\u001e\u0010\u00e9\u0001\u001a\u00030\u00ea\u00012\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u00012\u0007\u0010\u00ed\u0001\u001a\u00020\u001cH\u00d6\u0001R\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002080/\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010!\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020B0/\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010OR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040/\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010OR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010UR\u0011\u00102\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u00101\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u0002000/\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010OR\u0011\u0010 \u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010UR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010UR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040/\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010OR\u0011\u0010e\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\bi\u0010gR\u0011\u0010j\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\bk\u0010gR\u0011\u0010l\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\bm\u0010gR\u0014\u0010K\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010QR\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060/\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010OR\u0011\u0010-\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010gR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010gR\u0011\u0010?\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010gR\u0011\u0010>\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010gR\u0011\u0010;\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010gR\u0011\u0010\'\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010gR\u0011\u0010\u001a\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010gR\u0014\u0010I\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010QR\u0011\u0010@\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010^R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010UR\u0011\u00104\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010^R\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010UR\u0013\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u0010w\u001a\u00020x8F\u00a2\u0006\u0006\u001a\u0004\by\u0010zR\u0011\u00103\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010UR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010^R\u0013\u0010%\u001a\u0004\u0018\u00010#\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010vR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010`R\u0011\u0010\u0019\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010gR\u0014\u00109\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010[R\u0014\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010vR\u0014\u0010:\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010[R\u0012\u0010+\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010UR\u0012\u0010,\u001a\u00020\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010`R\u0012\u0010\b\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010UR\u0012\u0010*\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010UR\u0012\u0010\t\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010UR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0013\u0010(\u001a\u00020)\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0013\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020D0/\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010OR\u0012\u0010&\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010UR\u0013\u0010<\u001a\u00020=\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0012\u0010\u0018\u001a\u00020\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010`R\u0012\u0010\n\u001a\u00020\u0006\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010UR\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040/\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010OR\u0019\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u0002080/8F\u00a2\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010OR\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040/\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010OR\u0015\u0010L\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010QR\u0015\u0010J\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010Q\u00a8\u0006\u00f0\u0001"}, d2 = {"Lcom/woocommerce/android/model/Product;", "Landroid/os/Parcelable;", "Lcom/woocommerce/android/model/IProduct;", "remoteId", "", "name", "", "description", "shortDescription", "slug", "type", "status", "Lcom/woocommerce/android/ui/products/ProductStatus;", "catalogVisibility", "Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;", "isFeatured", "", "stockStatus", "Lcom/woocommerce/android/ui/products/ProductStockStatus;", "backorderStatus", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "dateCreated", "Ljava/util/Date;", "firstImageUrl", "totalSales", "reviewsAllowed", "isVirtual", "ratingCount", "", "averageRating", "", "permalink", "externalUrl", "buttonText", "price", "Ljava/math/BigDecimal;", "salePrice", "regularPrice", "taxClass", "isStockManaged", "stockQuantity", "", "sku", "shippingClass", "shippingClassId", "isDownloadable", "downloads", "", "Lcom/woocommerce/android/model/ProductFile;", "downloadLimit", "downloadExpiry", "purchaseNote", "numVariations", "images", "Lcom/woocommerce/android/model/Product$Image;", "attributes", "Lcom/woocommerce/android/model/ProductAttribute;", "saleEndDateGmt", "saleStartDateGmt", "isSoldIndividually", "taxStatus", "Lcom/woocommerce/android/ui/products/ProductTaxStatus;", "isSaleScheduled", "isPurchasable", "menuOrder", "categories", "Lcom/woocommerce/android/model/ProductCategory;", "tags", "Lcom/woocommerce/android/model/ProductTag;", "groupedProductIds", "crossSellProductIds", "upsellProductIds", "variationIds", "length", "width", "height", "weight", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woocommerce/android/ui/products/ProductStatus;Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;ZLcom/woocommerce/android/ui/products/ProductStockStatus;Lcom/woocommerce/android/ui/products/ProductBackorderStatus;Ljava/util/Date;Ljava/lang/String;JZZIFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZDLjava/lang/String;Ljava/lang/String;JZLjava/util/List;JILjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZLcom/woocommerce/android/ui/products/ProductTaxStatus;ZZILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;FFFF)V", "getAttributes", "()Ljava/util/List;", "getAverageRating", "()F", "getBackorderStatus", "()Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "getButtonText", "()Ljava/lang/String;", "getCatalogVisibility", "()Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;", "getCategories", "getCrossSellProductIds", "getDateCreated", "()Ljava/util/Date;", "getDescription", "getDownloadExpiry", "()I", "getDownloadLimit", "()J", "getDownloads", "getExternalUrl", "getFirstImageUrl", "getGroupedProductIds", "hasCategories", "getHasCategories", "()Z", "hasShipping", "getHasShipping", "hasShortDescription", "getHasShortDescription", "hasTags", "getHasTags", "getHeight", "getImages", "getLength", "getMenuOrder", "getName", "getNumVariations", "getPermalink", "getPrice", "()Ljava/math/BigDecimal;", "productType", "Lcom/woocommerce/android/ui/products/ProductType;", "getProductType", "()Lcom/woocommerce/android/ui/products/ProductType;", "getPurchaseNote", "getRatingCount", "getRegularPrice", "getRemoteId", "getReviewsAllowed", "getSaleEndDateGmt", "getSalePrice", "getSaleStartDateGmt", "getShippingClass", "getShippingClassId", "getShortDescription", "getSku", "getSlug", "getStatus", "()Lcom/woocommerce/android/ui/products/ProductStatus;", "getStockQuantity", "()D", "getStockStatus", "()Lcom/woocommerce/android/ui/products/ProductStockStatus;", "getTags", "getTaxClass", "getTaxStatus", "()Lcom/woocommerce/android/ui/products/ProductTaxStatus;", "getTotalSales", "getType", "getUpsellProductIds", "variationEnabledAttributes", "getVariationEnabledAttributes", "getVariationIds", "getWeight", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hasAttributeChanges", "updatedProduct", "hasCategoryChanges", "hasDownloadChanges", "hasExternalLinkChanges", "hasLinkedProductChanges", "hasLinkedProducts", "hasSettingsChanges", "hasTagChanges", "hashCode", "isSameCategories", "updatedCategories", "isSameProduct", "product", "isSameTags", "updatedTags", "mergeProduct", "newProduct", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Image", "WooCommerce_wasabiDebug"})
public final class Product implements android.os.Parcelable, com.woocommerce.android.model.IProduct {
    private final long remoteId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shortDescription = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable
    private final com.woocommerce.android.ui.products.ProductStatus status = null;
    @org.jetbrains.annotations.Nullable
    private final com.woocommerce.android.ui.products.settings.ProductCatalogVisibility catalogVisibility = null;
    private final boolean isFeatured = false;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.products.ProductStockStatus stockStatus = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date dateCreated = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String firstImageUrl = null;
    private final long totalSales = 0L;
    private final boolean reviewsAllowed = false;
    private final boolean isVirtual = false;
    private final int ratingCount = 0;
    private final float averageRating = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String permalink = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String externalUrl = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String buttonText = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal price = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal salePrice = null;
    @org.jetbrains.annotations.Nullable
    private final java.math.BigDecimal regularPrice = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String taxClass = null;
    private final boolean isStockManaged = false;
    private final double stockQuantity = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sku = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shippingClass = null;
    private final long shippingClassId = 0L;
    private final boolean isDownloadable = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.ProductFile> downloads = null;
    private final long downloadLimit = 0L;
    private final int downloadExpiry = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String purchaseNote = null;
    private final int numVariations = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Product.Image> images = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.ProductAttribute> attributes = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date saleEndDateGmt = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date saleStartDateGmt = null;
    private final boolean isSoldIndividually = false;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.products.ProductTaxStatus taxStatus = null;
    private final boolean isSaleScheduled = false;
    private final boolean isPurchasable = false;
    private final int menuOrder = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.ProductCategory> categories = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.ProductTag> tags = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Long> groupedProductIds = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Long> crossSellProductIds = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Long> upsellProductIds = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Long> variationIds = null;
    private final float length = 0.0F;
    private final float width = 0.0F;
    private final float height = 0.0F;
    private final float weight = 0.0F;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.Product.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAX_CLASS_DEFAULT = "standard";
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Product> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Product copy(long remoteId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String shortDescription, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.products.ProductStatus status, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.products.settings.ProductCatalogVisibility catalogVisibility, boolean isFeatured, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.Nullable
    java.lang.String firstImageUrl, long totalSales, boolean reviewsAllowed, boolean isVirtual, int ratingCount, float averageRating, @org.jetbrains.annotations.NotNull
    java.lang.String permalink, @org.jetbrains.annotations.NotNull
    java.lang.String externalUrl, @org.jetbrains.annotations.NotNull
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal price, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal salePrice, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.NotNull
    java.lang.String taxClass, boolean isStockManaged, double stockQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String sku, @org.jetbrains.annotations.NotNull
    java.lang.String shippingClass, long shippingClassId, boolean isDownloadable, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductFile> downloads, long downloadLimit, int downloadExpiry, @org.jetbrains.annotations.NotNull
    java.lang.String purchaseNote, int numVariations, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Product.Image> images, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductAttribute> attributes, @org.jetbrains.annotations.Nullable
    java.util.Date saleEndDateGmt, @org.jetbrains.annotations.Nullable
    java.util.Date saleStartDateGmt, boolean isSoldIndividually, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductTaxStatus taxStatus, boolean isSaleScheduled, boolean isPurchasable, int menuOrder, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductCategory> categories, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductTag> tags, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> groupedProductIds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> crossSellProductIds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> upsellProductIds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> variationIds, float length, float width, float height, float weight) {
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
    
    public Product(long remoteId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String shortDescription, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.products.ProductStatus status, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.products.settings.ProductCatalogVisibility catalogVisibility, boolean isFeatured, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductStockStatus stockStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.Nullable
    java.lang.String firstImageUrl, long totalSales, boolean reviewsAllowed, boolean isVirtual, int ratingCount, float averageRating, @org.jetbrains.annotations.NotNull
    java.lang.String permalink, @org.jetbrains.annotations.NotNull
    java.lang.String externalUrl, @org.jetbrains.annotations.NotNull
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal price, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal salePrice, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.NotNull
    java.lang.String taxClass, boolean isStockManaged, double stockQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String sku, @org.jetbrains.annotations.NotNull
    java.lang.String shippingClass, long shippingClassId, boolean isDownloadable, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductFile> downloads, long downloadLimit, int downloadExpiry, @org.jetbrains.annotations.NotNull
    java.lang.String purchaseNote, int numVariations, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Product.Image> images, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductAttribute> attributes, @org.jetbrains.annotations.Nullable
    java.util.Date saleEndDateGmt, @org.jetbrains.annotations.Nullable
    java.util.Date saleStartDateGmt, boolean isSoldIndividually, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductTaxStatus taxStatus, boolean isSaleScheduled, boolean isPurchasable, int menuOrder, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductCategory> categories, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ProductTag> tags, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> groupedProductIds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> crossSellProductIds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> upsellProductIds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> variationIds, float length, float width, float height, float weight) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getRemoteId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShortDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.ui.products.ProductStatus component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.ui.products.ProductStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.ui.products.settings.ProductCatalogVisibility component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.ui.products.settings.ProductCatalogVisibility getCatalogVisibility() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean isFeatured() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductStockStatus component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductStockStatus getStockStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductBackorderStatus component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductBackorderStatus getBackorderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirstImageUrl() {
        return null;
    }
    
    public final long component14() {
        return 0L;
    }
    
    public final long getTotalSales() {
        return 0L;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getReviewsAllowed() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean isVirtual() {
        return false;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getRatingCount() {
        return 0;
    }
    
    public final float component18() {
        return 0.0F;
    }
    
    public final float getAverageRating() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPermalink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExternalUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getButtonText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getSalePrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.math.BigDecimal getRegularPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTaxClass() {
        return null;
    }
    
    public final boolean component26() {
        return false;
    }
    
    public final boolean isStockManaged() {
        return false;
    }
    
    public final double component27() {
        return 0.0;
    }
    
    public final double getStockQuantity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShippingClass() {
        return null;
    }
    
    public final long component30() {
        return 0L;
    }
    
    public final long getShippingClassId() {
        return 0L;
    }
    
    public final boolean component31() {
        return false;
    }
    
    public final boolean isDownloadable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductFile> component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductFile> getDownloads() {
        return null;
    }
    
    public final long component33() {
        return 0L;
    }
    
    public final long getDownloadLimit() {
        return 0L;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final int getDownloadExpiry() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPurchaseNote() {
        return null;
    }
    
    public final int component36() {
        return 0;
    }
    
    public final int getNumVariations() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Product.Image> component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Product.Image> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductAttribute> component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductAttribute> getAttributes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getSaleEndDateGmt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getSaleStartDateGmt() {
        return null;
    }
    
    public final boolean component41() {
        return false;
    }
    
    public final boolean isSoldIndividually() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductTaxStatus component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductTaxStatus getTaxStatus() {
        return null;
    }
    
    public final boolean component43() {
        return false;
    }
    
    public final boolean isSaleScheduled() {
        return false;
    }
    
    public final boolean component44() {
        return false;
    }
    
    public final boolean isPurchasable() {
        return false;
    }
    
    public final int component45() {
        return 0;
    }
    
    public final int getMenuOrder() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductCategory> component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductCategory> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductTag> component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductTag> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> getGroupedProductIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> getCrossSellProductIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> component50() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> getUpsellProductIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> component51() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> getVariationIds() {
        return null;
    }
    
    public final float component52() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getLength() {
        return 0.0F;
    }
    
    public final float component53() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getWidth() {
        return 0.0F;
    }
    
    public final float component54() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getHeight() {
        return 0.0F;
    }
    
    public final float component55() {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getWeight() {
        return 0.0F;
    }
    
    public final boolean isSameProduct(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Product product) {
        return false;
    }
    
    public final boolean getHasCategories() {
        return false;
    }
    
    public final boolean getHasTags() {
        return false;
    }
    
    public final boolean getHasShortDescription() {
        return false;
    }
    
    public final boolean getHasShipping() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductType getProductType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ProductAttribute> getVariationEnabledAttributes() {
        return null;
    }
    
    /**
     * Verifies if there are any changes made to the external link settings
     */
    public final boolean hasExternalLinkChanges(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product updatedProduct) {
        return false;
    }
    
    /**
     * Verifies if there are any changes to upsells or cross-sells
     */
    public final boolean hasLinkedProductChanges(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product updatedProduct) {
        return false;
    }
    
    /**
     * Verifies if there are any changes made to the product settings
     */
    public final boolean hasSettingsChanges(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product updatedProduct) {
        return false;
    }
    
    /**
     * Verifies if there are any changes made to the product categories
     * by comparing the updated product model ([updatedProduct]) with the product model stored
     * in the local db and returns a [Boolean] flag
     */
    public final boolean hasCategoryChanges(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product updatedProduct) {
        return false;
    }
    
    /**
     * Verifies if there are any changes made to the product tags
     * by comparing the updated product model ([updatedProduct]) with the product model stored
     * in the local db and returns a [Boolean] flag
     */
    public final boolean hasTagChanges(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product updatedProduct) {
        return false;
    }
    
    public final boolean hasDownloadChanges(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product updatedProduct) {
        return false;
    }
    
    public final boolean hasAttributeChanges(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product updatedProduct) {
        return false;
    }
    
    public final boolean hasLinkedProducts() {
        return false;
    }
    
    /**
     * Compares this product's categories with the passed list, returns true only if both lists contain
     * the same categories
     */
    private final boolean isSameCategories(java.util.List<com.woocommerce.android.model.ProductCategory> updatedCategories) {
        return false;
    }
    
    /**
     * Compares this product's tags with the passed list, returns true only if both lists contain
     * the same tags
     */
    private final boolean isSameTags(java.util.List<com.woocommerce.android.model.ProductTag> updatedTags) {
        return false;
    }
    
    /**
     * Method merges the updated product fields edited by the user with the locally cached
     * [Product] model and returns the updated [Product] model.
     *
     * [newProduct] includes the updated product fields edited by the user.
     * if [newProduct] is not null, a copy of the stored [Product] model is created
     * and product fields edited by the user and added to this model before returning it
     */
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Product mergeProduct(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product newProduct) {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    /**
     * Formats the [Product] size (length, width, height) with the given [dimensionUnit]
     * if all the dimensions are available.
     * Eg: 12 x 15 x 13 in
     */
    @org.jetbrains.annotations.NotNull
    public java.lang.String getSizeWithUnits(@org.jetbrains.annotations.Nullable
    java.lang.String dimensionUnit) {
        return null;
    }
    
    /**
     * Formats the [Product] weight with the given [weightUnit]
     * for display purposes.
     * Eg: 12oz
     */
    @org.jetbrains.annotations.NotNull
    public java.lang.String getWeightWithUnits(@org.jetbrains.annotations.Nullable
    java.lang.String weightUnit) {
        return null;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Product> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Product createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Product[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/model/Product$Image;", "Landroid/os/Parcelable;", "id", "", "name", "", "source", "dateCreated", "Ljava/util/Date;", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getDateCreated", "()Ljava/util/Date;", "getId", "()J", "getName", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class Image implements android.os.Parcelable {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String source = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.Date dateCreated = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Product.Image> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Product.Image copy(long id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String source, @org.jetbrains.annotations.NotNull
        java.util.Date dateCreated) {
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
        
        public Image(long id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String source, @org.jetbrains.annotations.NotNull
        java.util.Date dateCreated) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSource() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date getDateCreated() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Product.Image> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Product.Image createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Product.Image[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/model/Product$Companion;", "", "()V", "TAX_CLASS_DEFAULT", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}