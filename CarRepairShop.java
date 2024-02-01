import java.util.ArrayList;
import java.util.List;

public class CarRepairShop <Vehicle> {
    private final int maxCapacity;
    final List<Vehicle> vehicles;
    public CarRepairShop(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        vehicles = new ArrayList<>(maxCapacity);
    }

    public void leaveCar(Vehicle v) {
        if (vehicles.size() < maxCapacity) {
            vehicles.add(v);
        }
        else throw new IllegalArgumentException("Unfortunately we are full at the moment");
    }
    public void repairedCar (Vehicle v) {
        if (vehicles.contains(v)) {
            vehicles.remove(v);
        }
        else throw new IllegalArgumentException("This car is not in repair");
    }



















}
