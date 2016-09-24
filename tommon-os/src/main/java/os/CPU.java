package os;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "system", value = "java.lang:type=OperatingSystem")
public class CPU {
    @JMXMonitor("SystemLoadAverage")
    String systemLoad;
    @JMXMonitor("SystemCpuLoad")
    String cpuLoad;
}
