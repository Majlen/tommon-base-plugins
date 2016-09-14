package apache;

import tommon.annotations.KeyValueMonitor;
import tommon.annotations.KeyValueObject;

/**
 * Created by majlen on 4.7.16.
 */
@KeyValueObject(table = "apache", url = "https://localhost:8080/statusek?auto", delimiter = ": ")
public class Apache {
    @KeyValueMonitor("BusyWorkers")
    String busy;
    @KeyValueMonitor("IdleWorkers")
    String idle;
}
