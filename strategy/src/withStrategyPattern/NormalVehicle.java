package withStrategyPattern;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalMode());
    }
}