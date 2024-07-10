import carcomponents.Engine;
import cars.Car;
import cars.CarManual;
import director.Director;

public class Main {
    public static void main(String[] args) {

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        CarManual.CarManualBuilder carManualBuilder = new CarManual.CarManualBuilder();
        Director director = new Director();

        Car sportsCar = director.constructAutoSportsCar(carBuilder).build();
        System.out.println("Car built:\n" + sportsCar.getCarType());

        CarManual sportsCarManual = director.constructAutoSportsCarManual(carManualBuilder).build();
        System.out.println("Sports CarManual:\n" + sportsCarManual.print());



    }

}