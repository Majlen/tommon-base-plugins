package os;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "jvm", value = "java.lang:type=OperatingSystem")
public class JVM {
    @JMXMonitor("ProcessCpuLoad")
    String cpuLoad;
    @JMXMonitor("OpenFileDescriptorCount")
    String openFd;
    @JMXMonitor("MaxFileDescriptorCount")
    String maxFd;
}
