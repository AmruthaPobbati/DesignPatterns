package cars;

import carcomponents.Engine;
import carcomponents.GPSNavigator;
import carcomponents.Transmission;
import carcomponents.TripComputer;

public class CarManual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public CarManual(CarManualBuilder builder) {
        this.carType = builder.carType;
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.tripComputer = builder.tripComputer;
        this.gpsNavigator = builder.gpsNavigator;
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

    public String print() {
        String info = "CarManual{" +
                "Type of Car=" + carType +
                ", No of seats=" + seats +
                ", engine= Volume: " + engine.getVolume() + " Mileage: " + engine.getMileage();

        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }

        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }

    public static class CarManualBuilder {
        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;

        public CarManualBuilder setCarType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public CarManualBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarManualBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarManualBuilder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarManualBuilder setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        public CarManualBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public CarManualBuilder reset() {
            this.carType = null;
            this.seats = 0;
            this.engine = null;
            this.transmission = null;
            this.tripComputer = null;
            this.gpsNavigator = null;
            return this;
        }

        public CarManual build() {
            return new CarManual(this);
        }
    }
}
