package os;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "osmemory", value = "java.lang:type=OperatingSystem")
public class Memory {
    @JMXMonitor("TotalPhysicalMemorySize")
    String totalMem;
    @JMXMonitor("FreePhysicalMemorySize")
    String freeMem;
    @JMXMonitor("TotalSwapSpaceSize")
    String totalSwap;
    @JMXMonitor("FreeSwapSpaceSize")
    String freeSwap;
}
