package classloading;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

/**
 * Created by majlen on 17.6.15.
 */
@JMXObject(table = "classloader", value = "java.lang:type=ClassLoading")
public class ClassLoading {
    @JMXMonitor("LoadedClassCount")
    String loaded;
}
