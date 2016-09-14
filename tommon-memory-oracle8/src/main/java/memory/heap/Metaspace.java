package memory.heap;

import tommon.annotations.JMXCompositeMonitor;
import tommon.annotations.JMXObject;

/**
 * Created by majlen on 28.6.16.
 */
@JMXObject(table = "metaspace", value = "java.lang:type=MemoryPool,name=Metaspace")
public class Metaspace {
    @JMXCompositeMonitor(value = "Usage", part = "used")
    String used;
    @JMXCompositeMonitor(value = "Usage", part = "committed")
    String committed;
    @JMXCompositeMonitor(value = "Usage", part = "max")
    String max;
}
