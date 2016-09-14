package tomcat;

import tommon.annotations.JMXMonitor;
import tommon.annotations.JMXObject;

/**
 * Created by majlen on 17.6.15.
 */
@JMXObject(table = "tconnector", value = "Catalina:type=ThreadPool,name=\"ajp-nio-127.0.0.3-8009\"")
public class TomcatConnector {
    @JMXMonitor("currentThreadCount")
    String threadcount;
    @JMXMonitor("currentThreadsBusy")
    String threadsbusy;
    @JMXMonitor("maxThreads")
    String maxthreads;
}
