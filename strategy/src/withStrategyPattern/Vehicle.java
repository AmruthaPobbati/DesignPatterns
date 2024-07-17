package withStrategyPattern;

public class Vehicle {
    IDriveMode driveMode;

    public Vehicle(IDriveMode driveMode) {
        this.driveMode = driveMode;
    }

    public void drive() {
        driveMode.drive();
    }

    public void display() {
        System.out.println("Vehicle Display");
    }
}
