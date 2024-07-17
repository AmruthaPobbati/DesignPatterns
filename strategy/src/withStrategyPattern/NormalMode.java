package withStrategyPattern;

public class NormalMode implements IDriveMode {
    @Override
    public void drive() {
        System.out.println("Drive in Normal Mode");
    }
}
