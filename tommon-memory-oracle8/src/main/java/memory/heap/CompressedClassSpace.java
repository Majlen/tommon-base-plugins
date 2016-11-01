package memory.heap;

import tommon.annotations.JMXCompositeMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "compressed", value = "java.lang:type=MemoryPool,name=Compressed Class Space")
public class CompressedClassSpace {
	@JMXCompositeMonitor(value = "Usage", part = "used")
	String used;
	@JMXCompositeMonitor(value = "Usage", part = "committed")
	String committed;
	@JMXCompositeMonitor(value = "Usage", part = "max")
	String max;
}
