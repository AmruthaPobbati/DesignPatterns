package withStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportMode());
    }
}
