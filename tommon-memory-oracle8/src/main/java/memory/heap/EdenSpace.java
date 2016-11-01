package memory.heap;

import tommon.annotations.JMXCompositeMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "eden", value = "java.lang:type=MemoryPool,name=* Eden Space")
public class EdenSpace {
	@JMXCompositeMonitor(value = "Usage", part = "used")
	String used;
	@JMXCompositeMonitor(value = "Usage", part = "committed")
	String committed;
	@JMXCompositeMonitor(value = "Usage", part = "max")
	String max;
}
