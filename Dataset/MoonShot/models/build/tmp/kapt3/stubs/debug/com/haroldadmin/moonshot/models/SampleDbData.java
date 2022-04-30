package com.haroldadmin.moonshot.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/haroldadmin/moonshot/models/SampleDbData;", "", "()V", "parser", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "LaunchPads", "Launches", "Missions", "Rockets", "models_debug"})
public final class SampleDbData {
    private static final org.joda.time.format.DateTimeFormatter parser = null;
    public static final com.haroldadmin.moonshot.models.SampleDbData INSTANCE = null;
    
    private SampleDbData() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0090\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00072\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0007JB\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/haroldadmin/moonshot/models/SampleDbData$Launches;", "", "()V", "many", "Lkotlin/sequences/Sequence;", "Lcom/haroldadmin/moonshot/models/launch/Launch;", "flightIdGenerator", "Lkotlin/Function1;", "", "missionNameGenerator", "", "siteIdGenerator", "isUpcomingGenerator", "", "rocketIdGenerator", "launchDateGenerator", "Ljava/util/Date;", "one", "flightNumber", "missionName", "siteId", "isUpcoming", "rocketId", "launchDate", "models_debug"})
    public static final class Launches {
        public static final com.haroldadmin.moonshot.models.SampleDbData.Launches INSTANCE = null;
        
        /**
         * Returns a Launch with some sample data
         */
        @org.jetbrains.annotations.NotNull()
        public final com.haroldadmin.moonshot.models.launch.Launch one(int flightNumber, @org.jetbrains.annotations.NotNull()
        java.lang.String missionName, @org.jetbrains.annotations.NotNull()
        java.lang.String siteId, boolean isUpcoming, @org.jetbrains.annotations.NotNull()
        java.lang.String rocketId, @org.jetbrains.annotations.NotNull()
        java.util.Date launchDate) {
            return null;
        }
        
        /**
         * Returns a list of launches with sample data.
         *
         * The caller has control over how FlightIDs and SiteIDs are generated, because they can
         * supply producers for these values.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlin.sequences.Sequence<com.haroldadmin.moonshot.models.launch.Launch> many(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> flightIdGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> missionNameGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> siteIdGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> isUpcomingGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> rocketIdGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.util.Date> launchDateGenerator) {
            return null;
        }
        
        private Launches() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007J$\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/haroldadmin/moonshot/models/SampleDbData$Rockets;", "", "()V", "many", "Lkotlin/sequences/Sequence;", "Lcom/haroldadmin/moonshot/models/Rocket;", "idGenerator", "Lkotlin/Function1;", "", "", "rocketIdGenerator", "", "rocketNameGenerator", "one", "id", "rocketId", "rocketName", "models_debug"})
    public static final class Rockets {
        public static final com.haroldadmin.moonshot.models.SampleDbData.Rockets INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.haroldadmin.moonshot.models.Rocket one(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String rocketId, @org.jetbrains.annotations.NotNull()
        java.lang.String rocketName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.sequences.Sequence<com.haroldadmin.moonshot.models.Rocket> many(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Long> idGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> rocketIdGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> rocketNameGenerator) {
            return null;
        }
        
        private Rockets() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0007J$\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n\u00a8\u0006\u0010"}, d2 = {"Lcom/haroldadmin/moonshot/models/SampleDbData$LaunchPads;", "", "()V", "many", "Lkotlin/sequences/Sequence;", "Lcom/haroldadmin/moonshot/models/LaunchPad;", "idGenerator", "Lkotlin/Function1;", "", "siteIdGenerator", "", "siteNameGenerator", "one", "id", "siteId", "siteName", "models_debug"})
    public static final class LaunchPads {
        public static final com.haroldadmin.moonshot.models.SampleDbData.LaunchPads INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.haroldadmin.moonshot.models.LaunchPad one(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String siteId, @org.jetbrains.annotations.NotNull()
        java.lang.String siteName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.sequences.Sequence<com.haroldadmin.moonshot.models.LaunchPad> many(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> idGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> siteIdGenerator, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> siteNameGenerator) {
            return null;
        }
        
        private LaunchPads() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0010\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t\u00a8\u0006\f"}, d2 = {"Lcom/haroldadmin/moonshot/models/SampleDbData$Missions;", "", "()V", "many", "Lkotlin/sequences/Sequence;", "Lcom/haroldadmin/moonshot/models/Mission;", "idGenerator", "Lkotlin/Function1;", "", "", "one", "id", "models_debug"})
    public static final class Missions {
        public static final com.haroldadmin.moonshot.models.SampleDbData.Missions INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.haroldadmin.moonshot.models.Mission one(@org.jetbrains.annotations.NotNull()
        java.lang.String id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.sequences.Sequence<com.haroldadmin.moonshot.models.Mission> many(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> idGenerator) {
            return null;
        }
        
        private Missions() {
            super();
        }
    }
}