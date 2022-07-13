package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\n\u001e\u001f !\"#$%&\'B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0002J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine;", "", "()V", "_transitions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Transition;", "get_transitions$annotations", "stateMachine", "Lcom/tinder/StateMachine;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "transitions", "Lkotlinx/coroutines/flow/StateFlow;", "getTransitions$annotations", "getTransitions", "()Lkotlinx/coroutines/flow/StateFlow;", "createStateMachine", "initialState", "getTracksSideEffect", "step", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "handleEvent", "", "event", "initialize", "state", "start", "orderId", "", "Error", "Event", "InvalidStateException", "SideEffect", "State", "StateMachineData", "Step", "StepStatus", "StepsState", "Transition", "WooCommerce_vanillaDebug"})
public final class ShippingLabelsStateMachine {
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Transition> _transitions = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Transition> transitions = null;
    private com.tinder.StateMachine<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect> stateMachine;
    
    @javax.inject.Inject()
    public ShippingLabelsStateMachine() {
        super();
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Deprecated()
    private static void get_transitions$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Transition> getTransitions() {
        return null;
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Deprecated()
    public static void getTransitions$annotations() {
    }
    
    private final com.tinder.StateMachine<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect> createStateMachine(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State initialState) {
        return null;
    }
    
    /**
     * Starts the initial event sequence (see the diagram)
     */
    public final void start(long orderId) {
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State state) {
    }
    
    /**
     * Incoming external event that triggers a transition (such as user input)
     */
    public final void handleEvent(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event event) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect getTracksSideEffect(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<?> step) {
        return null;
    }
    
    /**
     * Data passed around between states
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "Landroid/os/Parcelable;", "order", "Lcom/woocommerce/android/model/Order;", "stepsState", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepsState;", "(Lcom/woocommerce/android/model/Order;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepsState;)V", "isCustomsFormRequired", "", "isCustomsFormRequired$annotations", "()V", "()Z", "getOrder", "()Lcom/woocommerce/android/model/Order;", "getStepsState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepsState;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class StateMachineData implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Order order = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState stepsState = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData> CREATOR = null;
        
        /**
         * Data passed around between states
         */
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState stepsState) {
            return null;
        }
        
        /**
         * Data passed around between states
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Data passed around between states
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Data passed around between states
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StateMachineData(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState stepsState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order getOrder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState getStepsState() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void isCustomsFormRequired$annotations() {
        }
        
        public final boolean isCustomsFormRequired() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * The main shipping label creation steps
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "T", "Landroid/os/Parcelable;", "()V", "data", "getData", "()Ljava/lang/Object;", "isVisible", "", "()Z", "status", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "getStatus", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "CarrierStep", "CustomsStep", "OriginAddressStep", "PackagingStep", "PaymentsStep", "ShippingAddressStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$OriginAddressStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$ShippingAddressStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PackagingStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CustomsStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CarrierStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PaymentsStep;", "WooCommerce_vanillaDebug"})
    public static abstract class Step<T extends java.lang.Object> implements android.os.Parcelable {
        private final boolean isVisible = true;
        
        private Step() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus getStatus();
        
        public abstract T getData();
        
        public boolean isVisible() {
            return false;
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$OriginAddressStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "Lcom/woocommerce/android/model/Address;", "status", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "data", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;Lcom/woocommerce/android/model/Address;)V", "getData", "()Lcom/woocommerce/android/model/Address;", "getStatus", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class OriginAddressStep extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<com.woocommerce.android.model.Address> {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address data) {
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
            
            public OriginAddressStep(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.model.Address getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$ShippingAddressStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "Lcom/woocommerce/android/model/Address;", "status", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "data", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;Lcom/woocommerce/android/model/Address;)V", "getData", "()Lcom/woocommerce/android/model/Address;", "getStatus", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class ShippingAddressStep extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<com.woocommerce.android.model.Address> {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address data) {
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
            
            public ShippingAddressStep(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.model.Address getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u00d6\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PackagingStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "status", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "data", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getStatus", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class PackagingStep extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<java.util.List<? extends com.woocommerce.android.model.ShippingLabelPackage>> {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> data) {
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
            
            public PackagingStep(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00c6\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CustomsStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "", "Lcom/woocommerce/android/model/CustomsPackage;", "status", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "isVisible", "", "data", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;ZLjava/util/List;)V", "getData", "()Ljava/util/List;", "()Z", "getStatus", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class CustomsStep extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<java.util.List<? extends com.woocommerce.android.model.CustomsPackage>> {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status = null;
            private final boolean isVisible = false;
            @org.jetbrains.annotations.Nullable()
            private final java.util.List<com.woocommerce.android.model.CustomsPackage> data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, boolean isVisible, @org.jetbrains.annotations.Nullable()
            java.util.List<com.woocommerce.android.model.CustomsPackage> data) {
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
            
            public CustomsStep(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, boolean isVisible, @org.jetbrains.annotations.Nullable()
            java.util.List<com.woocommerce.android.model.CustomsPackage> data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus getStatus() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @java.lang.Override()
            public boolean isVisible() {
                return false;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.woocommerce.android.model.CustomsPackage> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.util.List<com.woocommerce.android.model.CustomsPackage> getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u00d6\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CarrierStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "", "Lcom/woocommerce/android/model/ShippingRate;", "status", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "data", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getStatus", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class CarrierStep extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<java.util.List<? extends com.woocommerce.android.model.ShippingRate>> {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingRate> data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingRate> data) {
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
            
            public CarrierStep(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingRate> data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingRate> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<com.woocommerce.android.model.ShippingRate> getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PaymentsStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "Lcom/woocommerce/android/model/PaymentMethod;", "status", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "data", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;Lcom/woocommerce/android/model/PaymentMethod;)V", "getData", "()Lcom/woocommerce/android/model/PaymentMethod;", "getStatus", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class PaymentsStep extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<com.woocommerce.android.model.PaymentMethod> {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status = null;
            @org.jetbrains.annotations.Nullable()
            private final com.woocommerce.android.model.PaymentMethod data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.Nullable()
            com.woocommerce.android.model.PaymentMethod data) {
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
            
            public PaymentsStep(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus status, @org.jetbrains.annotations.Nullable()
            com.woocommerce.android.model.PaymentMethod data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.woocommerce.android.model.PaymentMethod component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public com.woocommerce.android.model.PaymentMethod getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 N2\u00020\u00012\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u00030\u0002:\u0001NB5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010(\u001a\u00020\u0000H\u0002J\u0006\u0010)\u001a\u00020\u0000J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\u000eH\u00c6\u0003J\t\u0010/\u001a\u00020\u0010H\u00c6\u0003JE\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001J\u0013\u00103\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u00010\u0004H\u00d6\u0003J\b\u00105\u001a\u00020\u0000H\u0002J\u001b\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u00107\u001a\u000202H\u0086\u0002J\t\u00108\u001a\u000202H\u00d6\u0001J\b\u00109\u001a\u00020\u0000H\u0002J\b\u0010:\u001a\u00020\u0000H\u0002J\u0019\u0010;\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u00030<H\u0096\u0002J\t\u0010=\u001a\u00020>H\u00d6\u0001J\b\u0010?\u001a\u00020\u0000H\u0002J\'\u0010@\u001a\u00020\u0000\"\u0004\b\u0000\u0010A2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002HA0\u00032\u0006\u0010C\u001a\u0002HA\u00a2\u0006\u0002\u0010DJ$\u0010E\u001a\u00020\u0000\"\u0004\b\u0000\u0010A2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HA0\u00032\u0006\u0010G\u001a\u00020HH\u0002J\u0019\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u000202H\u00d6\u0001R$\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u00030\u0013X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006O"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepsState;", "Landroid/os/Parcelable;", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "", "originAddressStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$OriginAddressStep;", "shippingAddressStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$ShippingAddressStep;", "packagingStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PackagingStep;", "customsStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CustomsStep;", "carrierStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CarrierStep;", "paymentsStep", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PaymentsStep;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$OriginAddressStep;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$ShippingAddressStep;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PackagingStep;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CustomsStep;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CarrierStep;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PaymentsStep;)V", "backingList", "", "getBackingList$annotations", "()V", "getCarrierStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CarrierStep;", "getCustomsStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$CustomsStep;", "isCustomsFormRequired", "", "isCustomsFormRequired$annotations", "()Z", "isCustomsFormRequired$delegate", "Lkotlin/Lazy;", "getOriginAddressStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$OriginAddressStep;", "getPackagingStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PackagingStep;", "getPaymentsStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$PaymentsStep;", "getShippingAddressStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step$ShippingAddressStep;", "calculateNextStep", "checkRequirementsAndUpdateState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "fixStates", "get", "index", "hashCode", "invalidateCarrierStep", "invalidateCustomsStep", "iterator", "", "toString", "", "updateForInternationalRequirements", "updateStep", "T", "currentStep", "newData", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;Ljava/lang/Object;)Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepsState;", "updateStepStatus", "step", "newStatus", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_vanillaDebug"})
    public static final class StepsState implements android.os.Parcelable, java.lang.Iterable<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<? extends java.lang.Object>>, kotlin.jvm.internal.markers.KMappedMarker {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep originAddressStep = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep shippingAddressStep = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep packagingStep = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep customsStep = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep carrierStep = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep paymentsStep = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState.Companion Companion = null;
        private static final java.lang.String[] US_MILITARY_STATES = {"AA", "AE", "AP"};
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy isCustomsFormRequired$delegate = null;
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<? extends java.lang.Object>> backingList = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep originAddressStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep shippingAddressStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep packagingStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep customsStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep carrierStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep paymentsStep) {
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
        
        public StepsState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep originAddressStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep shippingAddressStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep packagingStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep customsStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep carrierStep, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep paymentsStep) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.OriginAddressStep getOriginAddressStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.ShippingAddressStep getShippingAddressStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PackagingStep getPackagingStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CustomsStep getCustomsStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.CarrierStep getCarrierStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step.PaymentsStep getPaymentsStep() {
            return null;
        }
        
        public final boolean isCustomsFormRequired() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void isCustomsFormRequired$annotations() {
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        private static void getBackingList$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        public final <T extends java.lang.Object>com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState updateStep(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<T> currentStep, T newData) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState checkRequirementsAndUpdateState() {
            return null;
        }
        
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState updateForInternationalRequirements() {
            return null;
        }
        
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState invalidateCarrierStep() {
            return null;
        }
        
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState invalidateCustomsStep() {
            return null;
        }
        
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState calculateNextStep() {
            return null;
        }
        
        /**
         * Updates the steps so that only one step is READY at each time
         */
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState fixStates() {
            return null;
        }
        
        private final <T extends java.lang.Object>com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState updateStepStatus(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<T> step, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepStatus newStatus) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Iterator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<? extends java.lang.Object>> iterator() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<? extends java.lang.Object> get(int index) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StepsState[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepsState$Companion;", "", "()V", "US_MILITARY_STATES", "", "", "[Ljava/lang/String;", "WooCommerce_vanillaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StepStatus;", "", "(Ljava/lang/String;I)V", "NOT_READY", "READY", "DONE", "WooCommerce_vanillaDebug"})
    public static enum StepStatus {
        /*public static final*/ NOT_READY /* = new NOT_READY() */,
        /*public static final*/ READY /* = new READY() */,
        /*public static final*/ DONE /* = new DONE() */;
        
        StepStatus() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "", "()V", "AddressValidationError", "DataLoadingError", "PackagesLoadingError", "PurchaseError", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$DataLoadingError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$AddressValidationError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$PackagesLoadingError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$PurchaseError;", "WooCommerce_vanillaDebug"})
    public static abstract class Error {
        
        private Error() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$DataLoadingError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "()V", "WooCommerce_vanillaDebug"})
        public static final class DataLoadingError extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error.DataLoadingError INSTANCE = null;
            
            private DataLoadingError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$AddressValidationError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "()V", "WooCommerce_vanillaDebug"})
        public static final class AddressValidationError extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error.AddressValidationError INSTANCE = null;
            
            private AddressValidationError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$PackagesLoadingError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PackagesLoadingError extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error.PackagesLoadingError INSTANCE = null;
            
            private PackagesLoadingError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error$PurchaseError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PurchaseError extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error.PurchaseError INSTANCE = null;
            
            private PurchaseError() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "Landroid/os/Parcelable;", "()V", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "CustomsDeclaration", "DataLoading", "DataLoadingFailure", "Idle", "OriginAddressEditing", "OriginAddressSuggestion", "OriginAddressValidation", "PackageSelection", "PaymentSelection", "PurchaseLabels", "ShippingAddressEditing", "ShippingAddressSuggestion", "ShippingAddressValidation", "ShippingCarrierSelection", "WaitingForInput", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$Idle;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$DataLoadingFailure;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$DataLoading;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$WaitingForInput;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$OriginAddressValidation;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$OriginAddressSuggestion;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$OriginAddressEditing;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingAddressValidation;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingAddressSuggestion;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingAddressEditing;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$PackageSelection;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$CustomsDeclaration;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingCarrierSelection;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$PaymentSelection;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$PurchaseLabels;", "WooCommerce_vanillaDebug"})
    public static abstract class State implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
        
        private State() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$Idle;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class Idle extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.Idle INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.Idle> CREATOR = null;
            
            private Idle() {
                super();
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.Idle> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.Idle createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.Idle[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$DataLoadingFailure;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class DataLoadingFailure extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoadingFailure INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoadingFailure> CREATOR = null;
            
            private DataLoadingFailure() {
                super();
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoadingFailure> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoadingFailure createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoadingFailure[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$DataLoading;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class DataLoading extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            private final long orderId = 0L;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoading> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoading copy(long orderId) {
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
            
            public DataLoading(long orderId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getOrderId() {
                return 0L;
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoading> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoading createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.DataLoading[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$WaitingForInput;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class WaitingForInput extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.WaitingForInput> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.WaitingForInput copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public WaitingForInput(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.WaitingForInput> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.WaitingForInput createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.WaitingForInput[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$OriginAddressValidation;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class OriginAddressValidation extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressValidation> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressValidation copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public OriginAddressValidation(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressValidation> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressValidation createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressValidation[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$OriginAddressSuggestion;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class OriginAddressSuggestion extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressSuggestion> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressSuggestion copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public OriginAddressSuggestion(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressSuggestion> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressSuggestion createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressSuggestion[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$OriginAddressEditing;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class OriginAddressEditing extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressEditing> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressEditing copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public OriginAddressEditing(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressEditing> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressEditing createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.OriginAddressEditing[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingAddressValidation;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class ShippingAddressValidation extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressValidation> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressValidation copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public ShippingAddressValidation(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressValidation> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressValidation createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressValidation[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingAddressSuggestion;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class ShippingAddressSuggestion extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressSuggestion> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressSuggestion copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public ShippingAddressSuggestion(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressSuggestion> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressSuggestion createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressSuggestion[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingAddressEditing;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class ShippingAddressEditing extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressEditing> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressEditing copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public ShippingAddressEditing(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressEditing> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressEditing createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingAddressEditing[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$PackageSelection;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class PackageSelection extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PackageSelection> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PackageSelection copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public PackageSelection(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PackageSelection> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PackageSelection createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PackageSelection[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$CustomsDeclaration;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class CustomsDeclaration extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.CustomsDeclaration> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.CustomsDeclaration copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public CustomsDeclaration(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.CustomsDeclaration> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.CustomsDeclaration createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.CustomsDeclaration[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$ShippingCarrierSelection;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class ShippingCarrierSelection extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingCarrierSelection> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingCarrierSelection copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public ShippingCarrierSelection(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingCarrierSelection> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingCarrierSelection createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.ShippingCarrierSelection[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$PaymentSelection;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class PaymentSelection extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PaymentSelection> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PaymentSelection copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public PaymentSelection(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PaymentSelection> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PaymentSelection createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PaymentSelection[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State$PurchaseLabels;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "fulfillOrder", "", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;Z)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "getFulfillOrder", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class PurchaseLabels extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            private final boolean fulfillOrder = false;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PurchaseLabels> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PurchaseLabels copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data, boolean fulfillOrder) {
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
            
            public PurchaseLabels(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data, boolean fulfillOrder) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            public final boolean getFulfillOrder() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PurchaseLabels> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PurchaseLabels createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State.PurchaseLabels[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:#\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0016&\'()*+,-./0123456789:;\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "", "()V", "AddressChangeSuggested", "AddressEditCanceled", "AddressInvalid", "AddressValidated", "AddressValidationFailed", "CustomsDeclarationStarted", "CustomsFormFilledOut", "DataLoaded", "DataLoadingFailed", "EditAddressRequested", "EditCustomsCanceled", "EditCustomsRequested", "EditOriginAddressRequested", "EditPackagingCanceled", "EditPackagingRequested", "EditPaymentCanceled", "EditPaymentRequested", "EditShippingAddressRequested", "EditShippingCarrierRequested", "FlowStarted", "OriginAddressValidationStarted", "PackageSelectionStarted", "PackagesSelected", "PaymentSelected", "PaymentSelectionStarted", "PurchaseFailed", "PurchaseStarted", "PurchaseSuccess", "ShippingAddressValidationStarted", "ShippingCarrierSelected", "ShippingCarrierSelectionCanceled", "ShippingCarrierSelectionStarted", "SuggestedAddressAccepted", "SuggestedAddressDiscarded", "UserInput", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$FlowStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$DataLoaded;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$DataLoadingFailed;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressInvalid;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressValidated;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressChangeSuggested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$SuggestedAddressAccepted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditAddressRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressValidationFailed;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressEditCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$SuggestedAddressDiscarded;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditPackagingCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PackagesSelected;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditCustomsCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$CustomsFormFilledOut;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$ShippingCarrierSelected;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$ShippingCarrierSelectionCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditPaymentCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PaymentSelected;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PurchaseSuccess;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PurchaseFailed;", "WooCommerce_vanillaDebug"})
    public static abstract class Event {
        
        private Event() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static abstract class UserInput extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            
            public UserInput() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$FlowStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class FlowStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            private final long orderId = 0L;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.FlowStarted copy(long orderId) {
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
            
            public FlowStarted(long orderId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getOrderId() {
                return 0L;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$DataLoaded;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "order", "Lcom/woocommerce/android/model/Order;", "originAddress", "Lcom/woocommerce/android/model/Address;", "shippingAddress", "currentPaymentMethod", "Lcom/woocommerce/android/model/PaymentMethod;", "(Lcom/woocommerce/android/model/Order;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/PaymentMethod;)V", "getCurrentPaymentMethod", "()Lcom/woocommerce/android/model/PaymentMethod;", "getOrder", "()Lcom/woocommerce/android/model/Order;", "getOriginAddress", "()Lcom/woocommerce/android/model/Address;", "getShippingAddress", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class DataLoaded extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Order order = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address originAddress = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address shippingAddress = null;
            @org.jetbrains.annotations.Nullable()
            private final com.woocommerce.android.model.PaymentMethod currentPaymentMethod = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.DataLoaded copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address shippingAddress, @org.jetbrains.annotations.Nullable()
            com.woocommerce.android.model.PaymentMethod currentPaymentMethod) {
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
            
            public DataLoaded(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address shippingAddress, @org.jetbrains.annotations.Nullable()
            com.woocommerce.android.model.PaymentMethod currentPaymentMethod) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Order component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Order getOrder() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getOriginAddress() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getShippingAddress() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.woocommerce.android.model.PaymentMethod component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.woocommerce.android.model.PaymentMethod getCurrentPaymentMethod() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$DataLoadingFailed;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class DataLoadingFailed extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.DataLoadingFailed INSTANCE = null;
            
            private DataLoadingFailed() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressInvalid;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "address", "Lcom/woocommerce/android/model/Address;", "validationResult", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "getValidationResult", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class AddressInvalid extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address address = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.AddressInvalid copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult) {
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
            
            public AddressInvalid(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getAddress() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult getValidationResult() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressValidated;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "address", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class AddressValidated extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address address = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.AddressValidated copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address) {
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
            
            public AddressValidated(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getAddress() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressChangeSuggested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "suggested", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;)V", "getSuggested", "()Lcom/woocommerce/android/model/Address;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class AddressChangeSuggested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address suggested = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.AddressChangeSuggested copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address suggested) {
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
            
            public AddressChangeSuggested(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address suggested) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getSuggested() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$SuggestedAddressAccepted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "address", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class SuggestedAddressAccepted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address address = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.SuggestedAddressAccepted copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address) {
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
            
            public SuggestedAddressAccepted(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getAddress() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditAddressRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "address", "Lcom/woocommerce/android/model/Address;", "(Lcom/woocommerce/android/model/Address;)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class EditAddressRequested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address address = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditAddressRequested copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address) {
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
            
            public EditAddressRequested(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getAddress() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressValidationFailed;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class AddressValidationFailed extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.AddressValidationFailed INSTANCE = null;
            
            private AddressValidationFailed() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$AddressEditCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class AddressEditCanceled extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.AddressEditCanceled INSTANCE = null;
            
            private AddressEditCanceled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$SuggestedAddressDiscarded;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class SuggestedAddressDiscarded extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.SuggestedAddressDiscarded INSTANCE = null;
            
            private SuggestedAddressDiscarded() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$OriginAddressValidationStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class OriginAddressValidationStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.OriginAddressValidationStarted INSTANCE = null;
            
            private OriginAddressValidationStarted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditOriginAddressRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditOriginAddressRequested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditOriginAddressRequested INSTANCE = null;
            
            private EditOriginAddressRequested() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$ShippingAddressValidationStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ShippingAddressValidationStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.ShippingAddressValidationStarted INSTANCE = null;
            
            private ShippingAddressValidationStarted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditShippingAddressRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditShippingAddressRequested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditShippingAddressRequested INSTANCE = null;
            
            private EditShippingAddressRequested() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PackageSelectionStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PackageSelectionStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.PackageSelectionStarted INSTANCE = null;
            
            private PackageSelectionStarted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditPackagingRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditPackagingRequested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditPackagingRequested INSTANCE = null;
            
            private EditPackagingRequested() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditPackagingCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditPackagingCanceled extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditPackagingCanceled INSTANCE = null;
            
            private EditPackagingCanceled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PackagesSelected;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "shippingPackages", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "(Ljava/util/List;)V", "getShippingPackages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class PackagesSelected extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.PackagesSelected copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages) {
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
            
            public PackagesSelected(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getShippingPackages() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$CustomsDeclarationStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class CustomsDeclarationStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.CustomsDeclarationStarted INSTANCE = null;
            
            private CustomsDeclarationStarted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditCustomsRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditCustomsRequested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditCustomsRequested INSTANCE = null;
            
            private EditCustomsRequested() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditCustomsCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditCustomsCanceled extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditCustomsCanceled INSTANCE = null;
            
            private EditCustomsCanceled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$CustomsFormFilledOut;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "customsPackages", "", "Lcom/woocommerce/android/model/CustomsPackage;", "(Ljava/util/List;)V", "getCustomsPackages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class CustomsFormFilledOut extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.CustomsFormFilledOut copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
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
            
            public CustomsFormFilledOut(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.CustomsPackage> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.CustomsPackage> getCustomsPackages() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$ShippingCarrierSelectionStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ShippingCarrierSelectionStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.ShippingCarrierSelectionStarted INSTANCE = null;
            
            private ShippingCarrierSelectionStarted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditShippingCarrierRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditShippingCarrierRequested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditShippingCarrierRequested INSTANCE = null;
            
            private EditShippingCarrierRequested() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$ShippingCarrierSelected;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "rates", "", "Lcom/woocommerce/android/model/ShippingRate;", "(Ljava/util/List;)V", "getRates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class ShippingCarrierSelected extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingRate> rates = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.ShippingCarrierSelected copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingRate> rates) {
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
            
            public ShippingCarrierSelected(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingRate> rates) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingRate> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingRate> getRates() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$ShippingCarrierSelectionCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ShippingCarrierSelectionCanceled extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.ShippingCarrierSelectionCanceled INSTANCE = null;
            
            private ShippingCarrierSelectionCanceled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PaymentSelectionStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PaymentSelectionStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.PaymentSelectionStarted INSTANCE = null;
            
            private PaymentSelectionStarted() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditPaymentRequested;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditPaymentRequested extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditPaymentRequested INSTANCE = null;
            
            private EditPaymentRequested() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$EditPaymentCanceled;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class EditPaymentCanceled extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.EditPaymentCanceled INSTANCE = null;
            
            private EditPaymentCanceled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PaymentSelected;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "paymentMethod", "Lcom/woocommerce/android/model/PaymentMethod;", "(Lcom/woocommerce/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/woocommerce/android/model/PaymentMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class PaymentSelected extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.PaymentMethod paymentMethod = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.PaymentSelected copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.PaymentMethod paymentMethod) {
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
            
            public PaymentSelected(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.PaymentMethod paymentMethod) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.PaymentMethod component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.PaymentMethod getPaymentMethod() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PurchaseStarted;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$UserInput;", "fulfillOrder", "", "(Z)V", "getFulfillOrder", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class PurchaseStarted extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.UserInput {
            private final boolean fulfillOrder = false;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.PurchaseStarted copy(boolean fulfillOrder) {
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
            
            public PurchaseStarted(boolean fulfillOrder) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean getFulfillOrder() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PurchaseSuccess;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "labels", "", "Lcom/woocommerce/android/model/ShippingLabel;", "(Ljava/util/List;)V", "getLabels", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class PurchaseSuccess extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingLabel> labels = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.PurchaseSuccess copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabel> labels) {
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
            
            public PurchaseSuccess(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabel> labels) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabel> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabel> getLabels() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event$PurchaseFailed;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PurchaseFailed extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Event.PurchaseFailed INSTANCE = null;
            
            private PurchaseFailed() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "", "()V", "NoOp", "OpenAddressEditor", "ShowAddressSuggestion", "ShowCarrierOptions", "ShowCustomsForm", "ShowError", "ShowLabelsPrint", "ShowPackageOptions", "ShowPaymentOptions", "TrackCompletedStep", "TrackFlowStart", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$NoOp;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowAddressSuggestion;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$OpenAddressEditor;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowPackageOptions;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowCustomsForm;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowCarrierOptions;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowPaymentOptions;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowLabelsPrint;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$TrackFlowStart;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$TrackCompletedStep;", "WooCommerce_vanillaDebug"})
    public static abstract class SideEffect {
        
        private SideEffect() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$NoOp;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "()V", "WooCommerce_vanillaDebug"})
        public static final class NoOp extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.NoOp INSTANCE = null;
            
            private NoOp() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowError;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "error", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;)V", "getError", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Error;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class ShowError extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.ShowError copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error error) {
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
            
            public ShowError(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Error getError() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowAddressSuggestion;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "entered", "Lcom/woocommerce/android/model/Address;", "suggested", "type", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;)V", "getEntered", "()Lcom/woocommerce/android/model/Address;", "getSuggested", "getType", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class ShowAddressSuggestion extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address entered = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address suggested = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.ShowAddressSuggestion copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address entered, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address suggested, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type) {
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
            
            public ShowAddressSuggestion(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address entered, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address suggested, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getEntered() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getSuggested() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType getType() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$OpenAddressEditor;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "address", "Lcom/woocommerce/android/model/Address;", "type", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "validationResult", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;", "requiresPhoneNumber", "", "(Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;Z)V", "getAddress", "()Lcom/woocommerce/android/model/Address;", "getRequiresPhoneNumber", "()Z", "getType", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$AddressType;", "getValidationResult", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelAddressValidator$ValidationResult;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class OpenAddressEditor extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.Address address = null;
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type = null;
            @org.jetbrains.annotations.Nullable()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult = null;
            private final boolean requiresPhoneNumber = false;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.OpenAddressEditor copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type, @org.jetbrains.annotations.Nullable()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult, boolean requiresPhoneNumber) {
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
            
            public OpenAddressEditor(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.Address address, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType type, @org.jetbrains.annotations.Nullable()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult validationResult, boolean requiresPhoneNumber) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Address getAddress() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.AddressType getType() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelAddressValidator.ValidationResult getValidationResult() {
                return null;
            }
            
            public final boolean component4() {
                return false;
            }
            
            public final boolean getRequiresPhoneNumber() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowPackageOptions;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "shippingPackages", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "(Ljava/util/List;)V", "getShippingPackages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class ShowPackageOptions extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.ShowPackageOptions copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages) {
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
            
            public ShowPackageOptions(@org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getShippingPackages() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowCustomsForm;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "originCountryCode", "", "destinationCountryCode", "shippingPackages", "", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "customsPackages", "Lcom/woocommerce/android/model/CustomsPackage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCustomsPackages", "()Ljava/util/List;", "getDestinationCountryCode", "()Ljava/lang/String;", "getOriginCountryCode", "getShippingPackages", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class ShowCustomsForm extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String originCountryCode = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String destinationCountryCode = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.ShowCustomsForm copy(@org.jetbrains.annotations.NotNull()
            java.lang.String originCountryCode, @org.jetbrains.annotations.NotNull()
            java.lang.String destinationCountryCode, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
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
            
            public ShowCustomsForm(@org.jetbrains.annotations.NotNull()
            java.lang.String originCountryCode, @org.jetbrains.annotations.NotNull()
            java.lang.String destinationCountryCode, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabelPackage> shippingPackages, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.CustomsPackage> customsPackages) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getOriginCountryCode() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDestinationCountryCode() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage> getShippingPackages() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.CustomsPackage> component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.CustomsPackage> getCustomsPackages() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowCarrierOptions;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;)V", "getData", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$StateMachineData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class ShowCarrierOptions extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.ShowCarrierOptions copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
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
            
            public ShowCarrierOptions(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.StateMachineData getData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowPaymentOptions;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ShowPaymentOptions extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.ShowPaymentOptions INSTANCE = null;
            
            private ShowPaymentOptions() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$ShowLabelsPrint;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "orderId", "", "labels", "", "Lcom/woocommerce/android/model/ShippingLabel;", "(JLjava/util/List;)V", "getLabels", "()Ljava/util/List;", "getOrderId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class ShowLabelsPrint extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            private final long orderId = 0L;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.woocommerce.android.model.ShippingLabel> labels = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.ShowLabelsPrint copy(long orderId, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabel> labels) {
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
            
            public ShowLabelsPrint(long orderId, @org.jetbrains.annotations.NotNull()
            java.util.List<com.woocommerce.android.model.ShippingLabel> labels) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long getOrderId() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabel> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.woocommerce.android.model.ShippingLabel> getLabels() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$TrackFlowStart;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "()V", "WooCommerce_vanillaDebug"})
        public static final class TrackFlowStart extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.TrackFlowStart INSTANCE = null;
            
            private TrackFlowStart() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003H\u00c6\u0003J\u0017\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect$TrackCompletedStep;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "step", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;)V", "getStep", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Step;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class TrackCompletedStep extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<?> step = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect.TrackCompletedStep copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<?> step) {
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
            
            public TrackCompletedStep(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<?> step) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<?> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Step<?> getStep() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$InvalidStateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "WooCommerce_vanillaDebug"})
    public static final class InvalidStateException extends java.lang.Exception {
        
        public InvalidStateException(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$Transition;", "", "state", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "sideEffect", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;)V", "getSideEffect", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$SideEffect;", "getState", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelsStateMachine$State;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class Transition {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State state = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect sideEffect = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.Transition copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State state, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect sideEffect) {
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
        
        public Transition(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State state, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect sideEffect) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.State getState() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelsStateMachine.SideEffect getSideEffect() {
            return null;
        }
    }
}