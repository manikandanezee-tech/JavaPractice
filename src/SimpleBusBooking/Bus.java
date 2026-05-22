package SimpleBusBooking;

import java.util.ArrayList;

public class Bus {
    int id;
    String busName;
    String from;
    String to;
    int busId;
static ArrayList<Bus>bus=new ArrayList<>() ;
    public Bus(int id, String busName, String from, String to, int busId) {
        this.id = id;
        this.busName = busName;
        this.from = from;
        this.to = to;
        this.busId = busId;
        bus.add(this);
    }

    @Override
    public String toString() {
        return "Bus{"+
                "id="+id+
                ",  busName="+busName+
                ",  from="+from+
                ",  to="+to+
                ",  busId="+busId+
                "}";
    }
}
