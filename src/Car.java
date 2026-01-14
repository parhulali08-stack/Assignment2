public class Car extends Vehicle {
    private int doors;
    private String fuelType;
    private Driver driver; 

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started (sound: vroom vroom)");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void displayDriverInfo() {
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("No driver assigned to this car.");
        }
    }
}
