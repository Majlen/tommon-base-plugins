package threads;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "threads", value = "java.lang:type=Threading")
public class Threads {
    @JMXMonitor("ThreadCount")
    String count;
    @JMXMonitor("DaemonThreadCount")
    String daemonCount;
}
