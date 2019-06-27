import java.util.ArrayList;
import java.util.List;

abstract class CarComponentBase{}

class CarSeats extends CarComponentBase{}

class CarWheels extends CarComponentBase{}

class CarChassis extends CarComponentBase{}

class CarEngineBase extends CarComponentBase{}

class CarCoolingSystemBase extends CarComponentBase{}

class CarLightSystemBase extends CarComponentBase{}

class CarBatterySystemBase extends CarComponentBase{}

class CarEngineHybrid extends CarEngineBase{}

class CarCoolingSystemHybrid extends CarCoolingSystemBase{}

class CarLightSystemHybrid extends CarLightSystemBase{}

class CarBatterySystemHybrid extends CarBatterySystemBase{}

class CarEngineRegular extends CarEngineBase{}

class CarCoolingSystemRegular extends CarCoolingSystemBase{}

class CarLightSystemRegular extends CarLightSystemBase{}

class CarBatterySystemRegular extends CarBatterySystemBase{}

class Data{}

abstract class CarMakerFactoryBase {
    public CarSeats createCarSeats(Data data) {return new CarSeats();}
    public CarChassis CreateCarChassis(Data data) {return new CarChassis();}
    public CarWheels createCarWheels(Data data) {return new CarWheels();}
    public abstract CarEngineBase createCarEngine(Data data);
    public abstract CarCoolingSystemBase createCarCoolingSystem(Data data);
    public abstract CarLightSystemBase createCarLightSystem(Data data);
    public abstract CarBatterySystemBase createCarBatterySystem(Data data);
}

class HybridCarMakerFactory extends CarMakerFactoryBase {

    @Override
    public CarEngineBase createCarEngine(Data data) {
        return new CarEngineHybrid();
    }

    @Override
    public CarCoolingSystemBase createCarCoolingSystem(Data data) {
        return new CarCoolingSystemHybrid();
    }

    @Override
    public CarLightSystemBase createCarLightSystem(Data data) {
        return  new CarLightSystemHybrid();
    }

    @Override
    public CarBatterySystemBase createCarBatterySystem(Data data) {
        return new CarBatterySystemHybrid();
    }
}

class RegularCarMakerFactory extends CarMakerFactoryBase {

    @Override
    public CarEngineBase createCarEngine(Data data) {
        return new CarEngineRegular();
    }

    @Override
    public CarCoolingSystemBase createCarCoolingSystem(Data data) {
        return new CarCoolingSystemRegular();
    }

    @Override
    public CarLightSystemBase createCarLightSystem(Data data) {
        return  new CarLightSystemRegular();
    }

    @Override
    public CarBatterySystemBase createCarBatterySystem(Data data) {
        return new CarBatterySystemRegular();
    }
}

class Main {

    public static void main(String[] args) {

        Data data = new Data();

        List<CarComponentBase> regularCar = createCar(new RegularCarMakerFactory(), data);

        List<CarComponentBase> excelDocument = createCar(new HybridCarMakerFactory(), data);
    }

    private static List<CarComponentBase> createCar(CarMakerFactoryBase factory, Data data) {
        List<CarComponentBase> result = new ArrayList<>();

        result.add(factory.createCarLightSystem(data));
        result.add(factory.createCarCoolingSystem(data));
        result.add(factory.createCarBatterySystem(data));
        result.add(factory.createCarEngine(data));

        return result;
    }
}