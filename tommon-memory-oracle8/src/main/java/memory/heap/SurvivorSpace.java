package memory.heap;

import tommon.annotations.JMXCompositeMonitor;
import tommon.annotations.JMXObject;

/**
 * Created by majlen on 28.6.16.
 */
@JMXObject(table = "survivor", value = "java.lang:type=MemoryPool,name=* Survivor Space")
public class SurvivorSpace {
    @JMXCompositeMonitor(value = "Usage", part = "used")
    String used;
    @JMXCompositeMonitor(value = "Usage", part = "committed")
    String committed;
    @JMXCompositeMonitor(value = "Usage", part = "max")
    String max;
}
