package withStrategyPattern;

public class SportMode implements IDriveMode{
    @Override
    public void drive() {
        System.out.println("Drive with Sport Mode");
    }
}
