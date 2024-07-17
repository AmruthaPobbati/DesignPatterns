package withStrategyPattern;

public class SportVehicle extends Vehicle{

    public SportVehicle() {
        super(new SportMode());
    }
}
