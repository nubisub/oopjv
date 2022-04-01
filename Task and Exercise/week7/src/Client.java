import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.PublicTransport;
import Vehicle.Walk;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps(1, 2);
        System.out.println("Public Transport :");
        googleMaps.setVehicle(new PublicTransport());
        System.out.println(googleMaps.getVehicle().bestRoute());
        System.out.println("Car :");
        googleMaps.setVehicle(new Car());
        System.out.println(googleMaps.getVehicle().bestRoute());
        System.out.println("Motorcycle :");
        googleMaps.setVehicle(new Motorcycle());
        System.out.println(googleMaps.getVehicle().bestRoute());
        System.out.println("Walk :");
        googleMaps.setVehicle(new Walk());
        System.out.println(googleMaps.getVehicle().bestRoute());
    }
}
