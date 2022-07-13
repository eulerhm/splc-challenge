package com.woocommerce.android.ui.compose.component;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.compose.ui.ExperimentalComposeUiApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aB\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003\u001as\u0010\u0013\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015\u00a2\u0006\u0002\b\u00172\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007\u001as\u0010\u0013\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u001c2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015\u00a2\u0006\u0002\b\u00172\b\b\u0002\u0010\r\u001a\u00020\u001c2\b\b\u0002\u0010\u000e\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007\u001a\b\u0010\u001d\u001a\u00020\u000bH\u0003\u001a>\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003\u001aq\u0010 \u001a\u00020\u000b*\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015\u00a2\u0006\u0002\b\u00172\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"(\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00018B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006%"}, d2 = {"DEFAULT_MAX_YEAR", "", "DEFAULT_MIN_YEAR", "value", "year", "Ljava/util/Calendar;", "getYear", "(Ljava/util/Calendar;)I", "setYear", "(Ljava/util/Calendar;I)V", "CalendarView", "", "currentDate", "minDate", "maxDate", "onDateSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "DatePickerDialog", "onDismissRequest", "Lkotlin/Function0;", "neutralButton", "Landroidx/compose/runtime/Composable;", "dateFormat", "Ljava/text/DateFormat;", "dialogProperties", "Landroidx/compose/ui/window/DialogProperties;", "Ljava/util/Date;", "InteractiveDatePickerPreview", "YearSelector", "onYearSelected", "DatePickerContent", "", "selectedDate", "onDateChanged", "onSubmitRequest", "WooCommerce_wasabiDebug"})
public final class DatePickerDialogKt {
    private static final int DEFAULT_MIN_YEAR = 1900;
    private static final int DEFAULT_MAX_YEAR = 2100;
    
    @androidx.compose.runtime.Composable
    public static final void DatePickerDialog(@org.jetbrains.annotations.Nullable
    java.util.Date currentDate, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.Date, kotlin.Unit> onDateSelected, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> neutralButton, @org.jetbrains.annotations.NotNull
    java.util.Date minDate, @org.jetbrains.annotations.NotNull
    java.util.Date maxDate, @org.jetbrains.annotations.NotNull
    java.text.DateFormat dateFormat, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.window.DialogProperties dialogProperties) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.Suppress(names = {"LongMethod"})
    public static final void DatePickerDialog(@org.jetbrains.annotations.Nullable
    java.util.Calendar currentDate, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.Calendar, kotlin.Unit> onDateSelected, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> neutralButton, @org.jetbrains.annotations.NotNull
    java.util.Calendar minDate, @org.jetbrains.annotations.NotNull
    java.util.Calendar maxDate, @org.jetbrains.annotations.NotNull
    java.text.DateFormat dateFormat, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.window.DialogProperties dialogProperties) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.Suppress(names = {"LongParameterList", "LongMethod"})
    private static final void DatePickerContent(java.lang.Object $this$DatePickerContent, java.util.Calendar selectedDate, kotlin.jvm.functions.Function1<? super java.util.Calendar, kotlin.Unit> onDateChanged, kotlin.jvm.functions.Function0<kotlin.Unit> onSubmitRequest, kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, kotlin.jvm.functions.Function0<kotlin.Unit> neutralButton, java.util.Calendar minDate, java.util.Calendar maxDate, java.text.DateFormat dateFormat) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CalendarView(java.util.Calendar currentDate, java.util.Calendar minDate, java.util.Calendar maxDate, kotlin.jvm.functions.Function1<? super java.util.Calendar, kotlin.Unit> onDateSelected, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void YearSelector(java.util.Calendar currentDate, java.util.Calendar minDate, java.util.Calendar maxDate, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onYearSelected, androidx.compose.ui.Modifier modifier) {
    }
    
    private static final int getYear(java.util.Calendar $this$year) {
        return 0;
    }
    
    private static final void setYear(java.util.Calendar $this$year, int value) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    private static final void InteractiveDatePickerPreview() {
    }
}