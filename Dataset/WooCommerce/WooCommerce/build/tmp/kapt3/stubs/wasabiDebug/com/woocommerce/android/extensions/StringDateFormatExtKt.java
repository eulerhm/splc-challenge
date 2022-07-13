package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u000f"}, d2 = {"formatDateToFriendlyDayHour", "", "locale", "Ljava/util/Locale;", "formatDateToFriendlyLongMonthDate", "formatDateToFriendlyLongMonthYear", "formatDateToWeeksInYear", "formatDateToYYYYMMDDFormat", "Ljava/util/Date;", "formatDateToYear", "formatDateToYearMonth", "formatToDateOnly", "formatToMonthDateOnly", "parseFromIso8601DateFormat", "parseGmtDateFromIso8601DateFormat", "WooCommerce_wasabiDebug"})
public final class StringDateFormatExtKt {
    
    /**
     * Method to convert date string from yyyy-MM-dd format to yyyy-MM format
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatDateToYearMonth(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatDateToYearMonth, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert date string from yyyy-MM-dd format to yyyy format
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatDateToYear(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatDateToYear, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert date string from yyyy'W'MM'W'dd format to yyyy-'W'MM
     * i.e. 2019W08W08 is formatted to 2019-W32
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatDateToWeeksInYear(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatDateToWeeksInYear, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd HH format to EEEE, MMM dd›hha
     * i.e. 2018-08-08 07 is formatted to Wednesday, Aug 08›7am
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatDateToFriendlyDayHour(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatDateToFriendlyDayHour, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd format to MMMM
     * i.e. 2019-08-08 is formatted to 2019›August
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatDateToFriendlyLongMonthYear(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatDateToFriendlyLongMonthYear, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd format to MMMM dd
     * i.e. 2019-08-08 is formatted to August 08
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatDateToFriendlyLongMonthDate(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatDateToFriendlyLongMonthDate, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd format to dd
     * i.e. 2019-08-08 is formatted to 8
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatToDateOnly(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatToDateOnly, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd format to MMM d
     * i.e. 2019-08-08 is formatted to Aug 8
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.lang.String formatToMonthDateOnly(@org.jetbrains.annotations.NotNull
    java.lang.String $this$formatToMonthDateOnly, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd'T'hh:mm:ss format to Date object
     */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.util.Date parseFromIso8601DateFormat(@org.jetbrains.annotations.Nullable
    java.lang.String $this$parseFromIso8601DateFormat, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd'T'hh:mm:ss format to Date object
     */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.util.Date parseGmtDateFromIso8601DateFormat(@org.jetbrains.annotations.Nullable
    java.lang.String $this$parseGmtDateFromIso8601DateFormat, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
    
    /**
     * Method to convert month string from yyyy-MM-dd format to MMM dd
     * i.e. 2018-08-08T08:12:03 is formatted to Aug 08
     */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public static final java.util.Date formatDateToYYYYMMDDFormat(@org.jetbrains.annotations.Nullable
    java.lang.String $this$formatDateToYYYYMMDDFormat, @org.jetbrains.annotations.NotNull
    java.util.Locale locale) throws java.lang.IllegalArgumentException {
        return null;
    }
}