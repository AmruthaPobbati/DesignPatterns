import withStrategyPattern.NormalVehicle;
import withStrategyPattern.SportVehicle;
import withStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle sportVehicle = new SportVehicle();
        Vehicle normalVehicle = new NormalVehicle();

        sportVehicle.drive();
        normalVehicle.drive();
    }
}