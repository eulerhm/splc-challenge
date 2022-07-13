package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 T2\u00020\u0001:\u0001TB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\'\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010(\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010)\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010*\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010+\u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010,\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010-\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u001a\u0010.\u001a\u00020\u00142\b\b\u0002\u0010\'\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010/\u001a\u00020\u0016J\u0010\u00100\u001a\u0004\u0018\u00010\u00142\u0006\u00101\u001a\u00020\fJ\u0018\u00102\u001a\u0004\u0018\u00010\u00142\u0006\u00103\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0016J\u000e\u00107\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0016J\u0010\u00108\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\fJ\u001e\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u0018J\u0010\u0010=\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020\fJ\u0018\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u00103\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010@\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020\fJ\u0015\u0010A\u001a\u0004\u0018\u00010\u00182\u0006\u0010>\u001a\u00020\f\u00a2\u0006\u0002\u0010BJ\u0010\u0010C\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020\fJ\u0010\u0010D\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020\fJ\u0010\u0010E\u001a\u0004\u0018\u00010\f2\u0006\u0010>\u001a\u00020\fJ\u0010\u0010F\u001a\u0004\u0018\u00010\f2\u0006\u0010G\u001a\u00020\fJ\u0010\u0010H\u001a\u0004\u0018\u00010\f2\u0006\u0010I\u001a\u00020\fJ\u0010\u0010J\u001a\u0004\u0018\u00010\f2\u0006\u0010I\u001a\u00020\fJ\u000e\u0010K\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u0014J\u0010\u0010L\u001a\u0004\u0018\u00010\f2\u0006\u0010I\u001a\u00020\fJ\u0010\u0010M\u001a\u0004\u0018\u00010\f2\u0006\u00106\u001a\u00020\u0016J\u0010\u0010N\u001a\u0004\u0018\u00010\f2\u0006\u00106\u001a\u00020\u0016J\u0018\u0010O\u001a\u00020P*\u00020\f2\n\u0010Q\u001a\u00060Rj\u0002`SH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"Lcom/woocommerce/android/util/DateUtils;", "", "locale", "Ljava/util/Locale;", "crashLogger", "Lcom/automattic/android/tracks/crashlogging/CrashLogging;", "(Ljava/util/Locale;Lcom/automattic/android/tracks/crashlogging/CrashLogging;)V", "friendlyMonthDayFormat", "Ljava/text/SimpleDateFormat;", "friendlyMonthDayYearFormat", "shortMonths", "", "", "kotlin.jvm.PlatformType", "[Ljava/lang/String;", "weekOfYearStartingMondayFormat", "yyyyMMddFormat", "formatToYYYYmmDD", "dateString", "getCurrentDate", "Ljava/util/Date;", "getCurrentDateTimeMinusDays", "", "days", "", "getDateAtStartOfDay", "year", "month", "day", "getDateForFirstDayOfMonth", "calendar", "Ljava/util/Calendar;", "getDateForFirstDayOfPreviousMonth", "minusMonths", "getDateForFirstDayOfPreviousQuarter", "minusQuarter", "getDateForFirstDayOfPreviousWeek", "minusWeeks", "getDateForFirstDayOfPreviousYear", "minusYears", "getDateForFirstDayOfQuarter", "getDateForFirstDayOfWeek", "getDateForFirstDayOfYear", "getDateForLastDayOfPreviousMonth", "getDateForLastDayOfPreviousQuarter", "getDateForLastDayOfPreviousWeek", "getDateForLastDayOfPreviousYear", "getDateForTodayAtTheStartOfTheDay", "getDateFromIso8601String", "isoStringDate", "getDateFromLocalizedLongDateString", "context", "Landroid/content/Context;", "getDateInMillisAtTheEndOfTheDay", "dateMillis", "getDateInMillisAtTheStartOfTheDay", "getDateString", "getDateTimeAppliedOperation", "date", "operationOver", "number", "getDayMonthDateString", "iso8601Date", "getLocalizedLongDateString", "getMonthString", "getNumberOfDaysInMonth", "(Ljava/lang/String;)Ljava/lang/Integer;", "getShortHourString", "getShortMonthDayAndYearString", "getShortMonthDayString", "getShortMonthDayStringForWeek", "iso8601Week", "getShortMonthString", "iso8601Month", "getShortMonthYearString", "getYearMonthDayStringFromDate", "getYearString", "toDisplayMMMddYYYYDate", "toIso8601Format", "reportAsError", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "WooCommerce_vanillaDebug"})
public final class DateUtils {
    private final java.util.Locale locale = null;
    private final com.automattic.android.tracks.crashlogging.CrashLogging crashLogger = null;
    private final java.text.SimpleDateFormat friendlyMonthDayFormat = null;
    private final java.text.SimpleDateFormat friendlyMonthDayYearFormat = null;
    private final java.text.SimpleDateFormat weekOfYearStartingMondayFormat = null;
    private final java.lang.String[] shortMonths = null;
    private final java.text.SimpleDateFormat yyyyMMddFormat = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.DateUtils.Companion Companion = null;
    public static final int DAYS_IN_QUARTER = 90;
    public static final int DAYS_TAIL_IN_WEEK = 6;
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int THREE = 3;
    
    @javax.inject.Inject()
    public DateUtils(@org.jetbrains.annotations.NotNull()
    java.util.Locale locale, @org.jetbrains.annotations.NotNull()
    com.automattic.android.tracks.crashlogging.CrashLogging crashLogger) {
        super();
    }
    
    /**
     * Given an ISO8601 date of format YYYY-MM-DD, returns the number of days in the given month.
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumberOfDaysInMonth(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Date) {
        return null;
    }
    
    /**
     * Given an ISO8601 date of format YYYY-MM-DD hh, returns the String in short month ("EEEE, MMM d") format.
     *
     * For example, given 2019-08-05 11 returns "Monday, Aug 5"
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDayMonthDateString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Date) {
        return null;
    }
    
    /**
     * Given an ISO8601 date of format YYYY-MM-DD, returns the String in short month ("MMM d") format.
     *
     * For example, given 2018-07-03 returns "Jul 3", and given 2018-07-28 returns "Jul 28".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortMonthDayString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Date) {
        return null;
    }
    
    /**
     * Given an ISO8601 date of format YYYY-MM-DD, returns the String in short month ("MMM d, YYYY") format.
     *
     * For example, given 2018-07-03 returns "Jul 3, 2018", and given 2018-07-28 returns "Jul 28, 2018".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortMonthDayAndYearString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Date) {
        return null;
    }
    
    /**
     * Given a date of format YYYY-MM-DD, returns the string in a localized full long date format.
     *
     * return null if the argument is not a valid YYYY-MM-DD date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalizedLongDateString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String dateString) {
        return null;
    }
    
    /**
     * Given a date string in localized format, returns a date object.
     *
     * return null from the [DateFormat] class if [dateString] cannot be
     * properly parsed
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDateFromLocalizedLongDateString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String dateString) {
        return null;
    }
    
    /**
     * Given a date of format YYYY-'W'WW, returns the String in short month ("MMM d") format,
     * with the day being the first day of that week (a Monday, by ISO8601 convention).
     *
     * For example, given 2018-W11, returns "Mar 12".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortMonthDayStringForWeek(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Week) {
        return null;
    }
    
    /**
     * Given a date of format YYYY-MM, returns the corresponding short month format.
     *
     * For example, given 2018-07, returns "Jul".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortMonthString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Month) {
        return null;
    }
    
    /**
     * Given a date of format MMMM d, YYYY, returns date string in yyyy-MM-dd format
     *
     * return null if the argument is not a valid date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateString(@org.jetbrains.annotations.NotNull()
    java.lang.String dateString) {
        return null;
    }
    
    /**
     * Formats a date object and returns it in the format of yyyy-MM-dd
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYearMonthDayStringFromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    /**
     * Given an ISO8601 date of format YYYY-MM-DD hh, returns the hour String in ("hh") format.
     *
     * For example, given 2019-07-15 13 returns "1pm", and given 2019-07-28 01 returns "1am".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortHourString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Date) {
        return null;
    }
    
    /**
     * Given a date of format YYYY-MM, returns the corresponding short month format.
     *
     * For example, given 2018-07, returns "Jul 2018".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShortMonthYearString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Month) {
        return null;
    }
    
    /**
     * Given a date of format YYYY-MM-dd, returns the corresponding full month format.
     *
     * For example, given 2018-07-02, returns "July".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMonthString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Date) {
        return null;
    }
    
    /**
     * Given a date of format YYYY-MM, returns the corresponding year format.
     *
     * For example, given 2018-07, returns "2018".
     *
     * return null if the argument is not a valid iso8601 date string.
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_VARIABLE"})
    public final java.lang.String getYearString(@org.jetbrains.annotations.NotNull()
    java.lang.String iso8601Month) {
        return null;
    }
    
    /**
     * Converts the given [year], [month], [day] to a [Date] object at midnight
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateAtStartOfDay(int year, int month, int day) {
        return null;
    }
    
    /**
     * Method to convert date string from MMM dd, yyyy format to yyyy-MM-dd format
     * i.e. Dec 02, 2020 is formatted to 2020-12-02
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String formatToYYYYmmDD(@org.jetbrains.annotations.NotNull()
    java.lang.String dateString) {
        return null;
    }
    
    private final void reportAsError(java.lang.String $this$reportAsError, java.lang.Exception exception) {
    }
    
    /**
     * Returns the same date received as parameter in millis at the end of the day: 23:59:59
     */
    public final long getDateInMillisAtTheEndOfTheDay(long dateMillis) {
        return 0L;
    }
    
    /**
     * Returns the same date received as parameter in millis at the start of the day: 00:00:00
     */
    public final long getDateInMillisAtTheStartOfTheDay(long dateMillis) {
        return 0L;
    }
    
    /**
     * Returns a date time in millis with the date for current day at 00:00:00
     */
    public final long getDateForTodayAtTheStartOfTheDay() {
        return 0L;
    }
    
    /**
     * Returns a date object with the date for the first day of the current week
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfWeek(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the first day of the current month
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfMonth(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the first day of the current quarter
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfQuarter(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the first day of the current year
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfYear(@org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the first day of the previous N minusWeeks argument or 1 week
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfPreviousWeek(int minusWeeks, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the first day of the previous N minusMonths argument or 1 month
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfPreviousMonth(int minusMonths, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the first day of the previous N minusQuarter argument or 1 quarter
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfPreviousQuarter(int minusQuarter, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the first day of N minusQuarter argument years or the previous year
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForFirstDayOfPreviousYear(int minusYears, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the last day of the previous N minusWeeks argument or 1 week
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForLastDayOfPreviousWeek(int minusWeeks, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the last day of the previous N minusMonths argument or 1 month
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForLastDayOfPreviousMonth(int minusMonths, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    /**
     * Returns a date object with the date for the last day of the previous quarter
     * of calendar argument or current calendar
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForLastDayOfPreviousQuarter(int minusQuarter, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateForLastDayOfPreviousYear(int minusYears, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return null;
    }
    
    public final long getCurrentDateTimeMinusDays(int days) {
        return 0L;
    }
    
    /**
     * Returns current date
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCurrentDate() {
        return null;
    }
    
    /**
     * Returns a Calendar object with argument date applied argument operation
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateTimeAppliedOperation(@org.jetbrains.annotations.NotNull()
    java.util.Date date, int operationOver, int number) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String toIso8601Format(long dateMillis) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String toDisplayMMMddYYYYDate(long dateMillis) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDateFromIso8601String(@org.jetbrains.annotations.NotNull()
    java.lang.String isoStringDate) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/util/DateUtils$Companion;", "", "()V", "DAYS_IN_QUARTER", "", "DAYS_TAIL_IN_WEEK", "ONE", "THREE", "ZERO", "getDayOfWeekWithMonthAndDayFromDate", "", "date", "Ljava/util/Date;", "isAfterDate", "", "date1", "date2", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Compares two dates to determine if [date2] is after [date1]. Note that
         * this method strips the time information from the comparison and is only comparing
         * the dates.
         *
         * @param date1 the base date for comparison
         * @param date2 the date to determine if after [date1]
         */
        public final boolean isAfterDate(@org.jetbrains.annotations.NotNull()
        java.util.Date date1, @org.jetbrains.annotations.NotNull()
        java.util.Date date2) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDayOfWeekWithMonthAndDayFromDate(@org.jetbrains.annotations.NotNull()
        java.util.Date date) {
            return null;
        }
    }
}