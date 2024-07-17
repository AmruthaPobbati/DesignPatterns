package withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        // same capability as SportVehicle
        System.out.println("Drive with Special Capability");
    }
}
