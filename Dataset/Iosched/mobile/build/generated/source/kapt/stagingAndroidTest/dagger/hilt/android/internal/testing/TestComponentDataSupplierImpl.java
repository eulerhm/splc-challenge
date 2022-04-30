package dagger.hilt.android.internal.testing;

import com.google.samples.apps.iosched.tests.ui.AgendaTest;
import com.google.samples.apps.iosched.tests.ui.AgendaTest_ComponentDataHolder;
import com.google.samples.apps.iosched.tests.ui.CodelabTest;
import com.google.samples.apps.iosched.tests.ui.CodelabTest_ComponentDataHolder;
import com.google.samples.apps.iosched.tests.ui.HomeTest;
import com.google.samples.apps.iosched.tests.ui.HomeTest_ComponentDataHolder;
import com.google.samples.apps.iosched.tests.ui.InfoTest;
import com.google.samples.apps.iosched.tests.ui.InfoTest_ComponentDataHolder;
import com.google.samples.apps.iosched.tests.ui.MapTest;
import com.google.samples.apps.iosched.tests.ui.MapTest_ComponentDataHolder;
import com.google.samples.apps.iosched.tests.ui.ScheduleTestSensorConditionsTest;
import com.google.samples.apps.iosched.tests.ui.ScheduleTestSensorConditionsTest_ComponentDataHolder;
import com.google.samples.apps.iosched.tests.ui.SessionDetailTest;
import com.google.samples.apps.iosched.tests.ui.SessionDetailTest_ComponentDataHolder;
import com.google.samples.apps.iosched.tests.ui.SettingsTest;
import com.google.samples.apps.iosched.tests.ui.SettingsTest_ComponentDataHolder;
import java.lang.Class;
import java.lang.Override;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class TestComponentDataSupplierImpl extends TestComponentDataSupplier {
  private final Map<Class<?>, TestComponentData> testComponentDataMap = new HashMap<>(8);

  TestComponentDataSupplierImpl() {
    testComponentDataMap.put(AgendaTest.class, AgendaTest_ComponentDataHolder.get());
    testComponentDataMap.put(CodelabTest.class, CodelabTest_ComponentDataHolder.get());
    testComponentDataMap.put(HomeTest.class, HomeTest_ComponentDataHolder.get());
    testComponentDataMap.put(InfoTest.class, InfoTest_ComponentDataHolder.get());
    testComponentDataMap.put(MapTest.class, MapTest_ComponentDataHolder.get());
    testComponentDataMap.put(ScheduleTestSensorConditionsTest.class, ScheduleTestSensorConditionsTest_ComponentDataHolder.get());
    testComponentDataMap.put(SessionDetailTest.class, SessionDetailTest_ComponentDataHolder.get());
    testComponentDataMap.put(SettingsTest.class, SettingsTest_ComponentDataHolder.get());
  }

  @Override
  protected Map<Class<?>, TestComponentData> get() {
    return testComponentDataMap;
  }
}
