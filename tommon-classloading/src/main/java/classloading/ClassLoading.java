package classloading;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

@JMXObject(table = "classloader", value = "java.lang:type=ClassLoading")
public class ClassLoading {
	@JMXMonitor("LoadedClassCount")
	String loaded;
}
