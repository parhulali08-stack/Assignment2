public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private Driver driver;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started (sound: brrrr)");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void displayDriverInfo() {
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("No driver assigned to this motorcycle.");
        }
    }
}