import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystem {
    private List<Car> cars;

    public CarRentalSystem() {
        cars = new ArrayList<>();
    }

    public void addCar(String carId, String model) {
        cars.add(new Car(carId, model));
        System.out.println("Car added: " + carId + " - " + model);
    }

    public void rentCar(String carId) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId)) {
                if (car.isAvailable()) {
                    car.setAvailable(false);
                    System.out.println("Car " + carId + " has been rented successfully!");
                    return;
                } else {
                    System.out.println("Car " + carId + " is already rented.");
                    return;
                }
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }
    public void showAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
            }
        }
    }
    public void showRentedCars() {
        System.out.println("\nRented Cars:");
        for (Car car : cars) {
            if (!car.isAvailable()) {
                System.out.println(car);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRentalSystem rentalSystem = new CarRentalSystem();

        rentalSystem.addCar("C001", "Toyota Camry");
        rentalSystem.addCar("C001", "Honda Accord");
        rentalSystem.addCar("C001", "Tesla Model X");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n------Car Rental System------");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. View Available Car");
            System.out.println("4. View Rented Car");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter Car ID to rent: ");
                    String rentCarId = scanner.nextLine();
                    rentalSystem.rentCar(rentCarId);
                    break;
                case 2:
                    System.out.print("Enter Car ID to return: ");
                    String returnCarId = scanner.nextLine();
                    rentalSystem.rentCar(returnCarId);
                    break;
                case 3:
                    rentalSystem.showAvailableCars();
                    break;
                case 4:
                    rentalSystem.showRentedCars();
                    break;
                case 5:
                    System.out.println("Exiting the Car Rental System...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }
}
