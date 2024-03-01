
package Inheritance;


public class Main {
    public static void main (String[]args){
        Car car = new Car();
        Bus bus = new Bus();
        Bike bike = new Bike();
        
        bike.BikeMods();
        bike.BikeWheel();
        car.CarMods();
        car.CarWheel();
        bus.BusTrip();
        bus.BusWheel();
        
    }
}
