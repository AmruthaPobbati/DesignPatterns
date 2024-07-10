package cars;

import carcomponents.Engine;
import carcomponents.GPSNavigator;
import carcomponents.Transmission;
import carcomponents.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    private Car(CarBuilder builder) {
        this.fuel = builder.fuel;
        this.gpsNavigator = builder.gpsNavigator;
        this.tripComputer = builder.tripComputer;
        this.transmission = builder.transmission;
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.carType = builder.carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public static class CarBuilder {
        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;
        private double fuel = 0;

        public CarBuilder() {
            this.carType = null;
            this.seats = 0;
            this.engine = null;
            this.transmission = null;
            this.tripComputer = null;
            this.gpsNavigator = null;
        }

        public CarBuilder setCarType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        public CarBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public CarBuilder setFuel(double fuel) {
            this.fuel = fuel;
            return this;
        }

        public CarBuilder reset() {
            this.carType = null;
            this.seats = 0;
            this.engine = null;
            this.transmission = null;
            this.tripComputer = null;
            this.gpsNavigator = null;
            this.fuel = 0;
            return this;
        }

        public Car build() {
            return new Car(this);
            //do validations for Car for required params and its constraints
            // before returning
        }
    }
}
