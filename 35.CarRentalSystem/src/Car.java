public class Car {
    private String carId;
    private String model;
    private boolean isAvailable;

    Car(String carId, String model) {
        this.carId = carId;
        this.model = model;
        this.isAvailable = true;
    }

    public String getCarId() {
        return this.carId;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Model: " + model + ", Available: " + (this.isAvailable ? "Yes" : "No");
    }
}
