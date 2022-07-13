package com.woocommerce.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/SensorConditionsTest;", "", "()V", "mRuntimePermissionRule", "Landroidx/test/rule/GrantPermissionRule;", "kotlin.jvm.PlatformType", "getMRuntimePermissionRule", "()Landroidx/test/rule/GrantPermissionRule;", "setMRuntimePermissionRule", "(Landroidx/test/rule/GrantPermissionRule;)V", "Companion", "WooCommerce_vanillaDebug"})
public class SensorConditionsTest {
    private androidx.test.rule.GrantPermissionRule mRuntimePermissionRule;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.SensorConditionsTest.Companion Companion = null;
    private static final java.lang.String LOCATION = "Location";
    private static final java.lang.String WIFION = "ParcTE_v2";
    private static final java.lang.String WIFIOFF = "Wi-Fi";
    private static final java.lang.String MOBILEDATA = "Mobile data";
    private static final java.lang.String BLUETOOTH = "Bluetooth";
    private static final java.lang.String BATTERYSAVER = "Battery Saver";
    private static final java.lang.String AUTOROTATE = "Auto-rotate";
    private static final java.lang.String DONOTDISTURB = "Do Not Disturb";
    private static final java.lang.String CAMERAON = "Disable Camera";
    private static final java.lang.String CAMERAOFF = "Enable Camera";
    private static boolean lastAccelerometerStatus = false;
    private static boolean lastGyroscopeStatus = false;
    private static boolean lastLightStatus = false;
    private static boolean lastMagneticFieldStatus = false;
    private static boolean lastOrientationStatus = false;
    private static boolean lastProximityStatus = false;
    private static boolean lastCameraStatus = false;
    private static boolean lastLocationStatus = false;
    private static boolean lastWifiStatus = false;
    private static boolean lastMobileDataStatus = false;
    private static boolean lastBluetoothStatus = false;
    private static boolean lastBatterySaverStatus = false;
    private static boolean lastAutoRotateStatus = false;
    private static boolean lastDoNotDisturbStatus = false;
    
    public SensorConditionsTest() {
        super();
    }
    
    @org.junit.Rule()
    public final androidx.test.rule.GrantPermissionRule getMRuntimePermissionRule() {
        return null;
    }
    
    public final void setMRuntimePermissionRule(androidx.test.rule.GrantPermissionRule p0) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {androidx.test.uiautomator.UiObjectNotFoundException.class})
    @kotlin.jvm.JvmStatic()
    @org.junit.BeforeClass()
    public static final void setUpSensorConditions() throws androidx.test.uiautomator.UiObjectNotFoundException {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u0004H\u0002J \u0010(\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0004J \u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000fH\u0002J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0004H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0004H\u0002J\b\u00100\u001a\u00020!H\u0007J\u0018\u00101\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u000fH\u0002J\u0010\u00103\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u00104\u001a\u00020\u000fH\u0002J\b\u00105\u001a\u00020\u000fH\u0002J\b\u00106\u001a\u00020\u000fH\u0002J\u0010\u00107\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u00108\u001a\u00020\u000fH\u0002J\b\u00109\u001a\u00020\u000fH\u0002J\b\u0010:\u001a\u00020\u000fH\u0002J\b\u0010;\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/SensorConditionsTest$Companion;", "", "()V", "AUTOROTATE", "", "BATTERYSAVER", "BLUETOOTH", "CAMERAOFF", "CAMERAON", "DONOTDISTURB", "LOCATION", "MOBILEDATA", "WIFIOFF", "WIFION", "lastAccelerometerStatus", "", "lastAutoRotateStatus", "lastBatterySaverStatus", "lastBluetoothStatus", "lastCameraStatus", "lastDoNotDisturbStatus", "lastGyroscopeStatus", "lastLightStatus", "lastLocationStatus", "lastMagneticFieldStatus", "lastMobileDataStatus", "lastOrientationStatus", "lastProximityStatus", "lastWifiStatus", "launcherPackageName", "getLauncherPackageName", "()Ljava/lang/String;", "changeSpecificSensor", "", "mDevice", "Landroidx/test/uiautomator/UiDevice;", "UIObjectSensorDisAppMenu", "Landroidx/test/uiautomator/UiObject;", "sensorName", "changeOption", "checkSpecificSensor", "createTempScript", "Ljava/io/File;", "command", "enableDisableSensor", "sensorEnabled", "getLastSensorStatus", "runExternalCommand", "setUpSensorConditions", "updateLastSensorStatus", "status", "verifyAllSensors", "verifyAutoRotate", "verifyBatterySaver", "verifyBluetooth", "verifyCamera", "verifyDoNotDisturb", "verifyLocation", "verifyMobileData", "verifyWifi", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {androidx.test.uiautomator.UiObjectNotFoundException.class})
        @kotlin.jvm.JvmStatic()
        @org.junit.BeforeClass()
        public final void setUpSensorConditions() throws androidx.test.uiautomator.UiObjectNotFoundException {
        }
        
        private final void enableDisableSensor(androidx.test.uiautomator.UiDevice mDevice, java.lang.String sensorName, boolean sensorEnabled) {
        }
        
        private final void runExternalCommand(java.lang.String command) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        public final java.io.File createTempScript(@org.jetbrains.annotations.Nullable()
        java.lang.String command) throws java.io.IOException {
            return null;
        }
        
        private final void changeSpecificSensor(androidx.test.uiautomator.UiDevice mDevice, androidx.test.uiautomator.UiObject UIObjectSensorDisAppMenu, java.lang.String sensorName, java.lang.String changeOption) {
        }
        
        private final boolean getLastSensorStatus(java.lang.String sensorName) {
            return false;
        }
        
        private final void updateLastSensorStatus(java.lang.String sensorName, boolean status) {
        }
        
        private final java.lang.String getLauncherPackageName() {
            return null;
        }
        
        private final void verifyAllSensors(androidx.test.uiautomator.UiDevice mDevice) {
        }
        
        private final boolean checkSpecificSensor(androidx.test.uiautomator.UiDevice mDevice, androidx.test.uiautomator.UiObject UIObjectSensorDisAppMenu, java.lang.String sensorName) {
            return false;
        }
        
        private final boolean verifyCamera(androidx.test.uiautomator.UiDevice mDevice) {
            return false;
        }
        
        private final boolean verifyLocation() {
            return false;
        }
        
        private final boolean verifyWifi() {
            return false;
        }
        
        private final boolean verifyMobileData() {
            return false;
        }
        
        private final boolean verifyBluetooth() {
            return false;
        }
        
        private final boolean verifyBatterySaver() {
            return false;
        }
        
        private final boolean verifyAutoRotate() {
            return false;
        }
        
        private final boolean verifyDoNotDisturb() {
            return false;
        }
    }
}