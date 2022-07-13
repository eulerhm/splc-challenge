package com.woocommerce.android.ui.orders.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem;", "", "viewType", "Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$ViewType;", "(Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$ViewType;)V", "longId", "", "getLongId", "()J", "getViewType", "()Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$ViewType;", "Header", "Note", "ViewType", "Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$Header;", "Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$Note;", "WooCommerce_vanillaDebug"})
public abstract class OrderNoteListItem {
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.ui.orders.notes.OrderNoteListItem.ViewType viewType = null;
    
    private OrderNoteListItem(com.woocommerce.android.ui.orders.notes.OrderNoteListItem.ViewType viewType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.orders.notes.OrderNoteListItem.ViewType getViewType() {
        return null;
    }
    
    public long getLongId() {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$Header;", "Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "WooCommerce_vanillaDebug"})
    public static final class Header extends com.woocommerce.android.ui.orders.notes.OrderNoteListItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        
        public Header(@org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$Note;", "Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem;", "note", "Lcom/woocommerce/android/model/OrderNote;", "longId", "", "(Lcom/woocommerce/android/model/OrderNote;J)V", "getLongId", "()J", "getNote", "()Lcom/woocommerce/android/model/OrderNote;", "WooCommerce_vanillaDebug"})
    public static final class Note extends com.woocommerce.android.ui.orders.notes.OrderNoteListItem {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.OrderNote note = null;
        private final long longId = 0L;
        
        public Note(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.OrderNote note, long longId) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.OrderNote getNote() {
            return null;
        }
        
        @java.lang.Override()
        public long getLongId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem$ViewType;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "HEADER", "NOTE", "WooCommerce_vanillaDebug"})
    public static enum ViewType {
        /*public static final*/ HEADER /* = new HEADER(0) */,
        /*public static final*/ NOTE /* = new NOTE(0) */;
        private final int id = 0;
        
        ViewType(int id) {
        }
        
        public final int getId() {
            return 0;
        }
    }
}