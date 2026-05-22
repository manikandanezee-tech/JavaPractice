package SimpleBusBooking;

import java.util.ArrayList;

public class Booking {
    int userId;
    int busId;
    String name;
    String busName;
    String fromTo;
static ArrayList<Booking>booking=new ArrayList<>();
    public Booking(int userId, int busId, String name, String busName, String fromTo) {
        this.userId = userId;
        this.busId = busId;
        this.name = name;
        this.busName = busName;
        this.fromTo = fromTo;
        booking.add(this);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userId=" + userId +
                ", busId=" + busId +
                ", name='" + name + '\'' +
                ", busName='" + busName + '\'' +
                ", fromTo='" + fromTo + '\'' +
                '}';
    }
}
