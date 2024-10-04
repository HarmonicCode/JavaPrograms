import java.util.HashMap;
import java.util.Map;

class Car {
    private String licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

class ParkingLot {
    private int totalSlots;
    private Map<Integer, Car> parkingSlots;

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.parkingSlots = new HashMap<>();
    }

    public boolean parkCar(int slotNumber, Car car) {
        // Check if slot is within valid range and not already occupied
        if (slotNumber < 1 || slotNumber > totalSlots || parkingSlots.containsKey(slotNumber)) {
            System.out.println("Parking not available at slot " + slotNumber);
            return false;
        }
        parkingSlots.put(slotNumber, car);
        System.out.println("Car parked in slot " + slotNumber);
        return true;
    }

    public boolean removeCar(int slotNumber) {
        // Check if the slot is valid and contains a car
        if (!parkingSlots.containsKey(slotNumber)) {
            System.out.println("Slot " + slotNumber + " is already empty or invalid.");
            return false;
        }
        parkingSlots.remove(slotNumber);
        System.out.println("Car removed from slot " + slotNumber);
        return true;
    }

    public void displayStatus() {
        System.out.println("Parking Lot Status:");
        for (int i = 1; i <= totalSlots; i++) {
            if (parkingSlots.containsKey(i)) {
                System.out.println("Slot " + i + " occupied by car with license " + parkingSlots.get(i).getLicensePlate());
            } else {
                System.out.println("Slot " + i + " is available");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);

        Car car1 = new Car("ABUC123");
        Car car2 = new Car("XYZ123");
        Car car3 = new Car("LMN234");

        parkingLot.parkCar(1, car1);
        parkingLot.parkCar(2, car2);
        parkingLot.parkCar(3, car3);

        parkingLot.displayStatus();

        parkingLot.removeCar(2);
        parkingLot.displayStatus();
    }
}
