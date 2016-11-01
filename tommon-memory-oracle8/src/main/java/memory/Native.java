package memory;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

import java.lang.String;

@JMXObject(table = "native", value = "java.nio:type=BufferPool,name=direct")
public class Native {
	@JMXMonitor("Count")
	String count;
	@JMXMonitor("MemoryUsed")
	String memoryused;
}
