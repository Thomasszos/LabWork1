public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(8, "Red", 13, "Diesel");
        Car myCar = new Car(4, "Blue", 7, "Diesel", "Toyota");

        myVehicle.setColor("Blue");
        myVehicle.setNumberOfWheels(6);
        myVehicle.setEngineSize(20);
        myVehicle.setFuelType("Gasoline");

        myCar.setColor("Red");
        myCar.setNumberOfWheels(1024); //Why not
        myCar.setEngineSize(17);
        myCar.setFuelType("Gasoline");
        myCar.setBrand("Nissan");

        System.out.println(myVehicle.toString());

        myCar.honk();
        myCar.displayInfo();

    }
}