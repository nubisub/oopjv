import Vehicle.Vehicle;
// import googlemaps.GoogleMaps;
// import com.google.android.gms.maps.*;

public class GoogleMaps {
    private int startlocation;
    private int Destination;
    private Vehicle vehicle;
    // private Drawline drawline;

    public GoogleMaps(int startlocation, int Destination) {
        this.startlocation = startlocation;
        this.Destination = Destination;
    }
    public void setStartlocation(int startlocation) {
        this.startlocation = startlocation;
    }
    public int getStartlocation() {
        return startlocation;
    }
    public void setDestination(int destination) {
        this.Destination = destination;
    }
    public int getDestination() {
        return Destination;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    // googlemaps latitutde and longitude
    // public void setLatitude(int latitude) {
    //     this.latitude = latitude;
    // }

}
