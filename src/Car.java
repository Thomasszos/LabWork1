public class Car extends Vehicle{

    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    private void honk(){
        System.out.println("Honk, honk!");
    }

    private void displayInfo(){
        System.out.println(
                "Number of Wheels " + getNumberOfWheels()
                + " Brand: " + brand + "Color" + getColor()
                + " Engine Size " + getEngineSize()
                + " Fuel Type " + getFuelType()
        );
    }
}
