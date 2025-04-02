package inheritance;
    class Vehicle{
        void drive(){
            System.out.println("driving a vehicle");
        }
    }
    class Car extends Vehicle{
        void drive(){
            System.out.println("repairing a car");
        }
    }
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        myVehicle.drive();  
        myCar.drive();  
    }
}
