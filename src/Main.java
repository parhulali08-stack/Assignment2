public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Alice", "DL12345");
        Driver driver2 = new Driver("Bob", "DL67890");

        Car car = new Car("Toyota", 2020, 4, "Petrol");
        Motorcycle bike = new Motorcycle("Harley", 2019, false);
        Truck truck = new Truck("Volvo", 2018, 10.5, 6);

        car.setDriver(driver1);
        bike.setDriver(driver2);
        truck.setDriver(driver1);

        Vehicle[] vehicles = { car, bike, truck };

        for (Vehicle v : vehicles) {
            System.out.println("---");
            v.startEngine();
            v.displayInfo();

            if (v instanceof Car) {
                ((Car) v).displayDriverInfo();
            } else if (v instanceof Motorcycle) {
                ((Motorcycle) v).displayDriverInfo();
            } else if (v instanceof Truck) {
                ((Truck) v).displayDriverInfo();
            }

            v.stopEngine();
            System.out.println();
        }
    }
}