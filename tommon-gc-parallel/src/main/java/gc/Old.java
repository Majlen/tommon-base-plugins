package gc;

import tommon.annotations.JMXCompositeMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "gc_old", value = "java.lang:type=GarbageCollector,name=PS MarkSweep")
public class Old {
	@JMXCompositeMonitor(value = "LastGcInfo", part = "id")
	String count;
	@JMXCompositeMonitor(value = "LastGcInfo", part = "duration")
	String time;
}
