public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;
    private Driver driver;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started (sound: RUMBLE RUMBLE)");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void displayDriverInfo() {
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("No driver assigned to this truck.");
        }
    }
}