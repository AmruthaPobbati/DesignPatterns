package director;

import carcomponents.Engine;
import carcomponents.GPSNavigator;
import carcomponents.Transmission;
import carcomponents.TripComputer;
import cars.Car;
import cars.CarManual;
import cars.CarType;

public class Director {

    public Car.CarBuilder constructAutoSportsCar(Car.CarBuilder carBuilder) {

        return carBuilder.reset().setCarType(CarType.SPORTS)
                .setSeats(2)
                .setEngine(new Engine(100, 200000))
                .setFuel(100)
                .setTransmission(Transmission.AUTOMATIC)
                .setGpsNavigator(new GPSNavigator())
                .setTripComputer(new TripComputer());
    }

    public Car.CarBuilder constructManualSedanCar(Car.CarBuilder carBuilder) {
        return carBuilder.reset().setCarType(CarType.SEDAN)
                .setSeats(4)
                .setEngine(new Engine(100, 200000))
                .setFuel(100)
                .setTransmission(Transmission.MANUAL)
                .setGpsNavigator(new GPSNavigator())
                .setTripComputer(new TripComputer());
    }

    public CarManual.CarManualBuilder constructAutoSportsCarManual(CarManual.CarManualBuilder carManualBuilder) {
        return carManualBuilder.reset().setCarType(CarType.SPORTS)
                .setSeats(2)
                .setEngine(new Engine(100, 200000))
                .setTransmission(Transmission.AUTOMATIC)
                .setGpsNavigator(new GPSNavigator());
    }

    public CarManual.CarManualBuilder constructManualSedanCarManual(CarManual.CarManualBuilder carManualBuilder) {
        return carManualBuilder.reset().setCarType(CarType.SEDAN)
                .setSeats(4)
                .setEngine(new Engine(100, 200000))
                .setTransmission(Transmission.MANUAL)
                .setGpsNavigator(new GPSNavigator());
    }

}
