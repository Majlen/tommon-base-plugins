package gc;

import tommon.annotations.JMXCompositeMonitor;
import tommon.annotations.JMXObject;

/**
 * Created by majlen on 30.6.16.
 */
@JMXObject(table = "gc_young", value = "java.lang:type=GarbageCollector,name=ParNew")
public class Young {
    @JMXCompositeMonitor(value = "LastGcInfo", part = "id")
    String count;
    @JMXCompositeMonitor(value = "LastGcInfo", part = "duration")
    String time;
}
