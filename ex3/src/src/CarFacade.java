package src;

import src.FuelInjector;

public class CarFacade implements IMonitoringService{
    private static int DEFAULT_COOLING_TEMP = 90;
    private static int MAX_ALLOWED_TEMP = 50;
    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();
    private BreakSystem breakSystem = new BreakSystem();
    private WheelSystem wheelSystem = new WheelSystem();
    private GasController gasController = new GasController();
    private LocationController locationController = new LocationController();


    public void startEngine() {
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
        fuelInjector.on();
        breakSystem.on();
        wheelSystem.on();
        gasController.on();
        locationController.on();
    }

    public void stopEngine() {
        fuelInjector.off();
        fuelInjector.off();
        coolingController.cool(MAX_ALLOWED_TEMP);
        coolingController.stop();
        fuelInjector.off();
        breakSystem.off();
        wheelSystem.off();
        gasController.off();
        locationController.off();
    }

    public void speedUp() {
        fuelInjector.injectMore();
        breakSystem.free();
    }

    public void speedDown() {
        fuelInjector.injectLess();
        breakSystem.slow();
    }

    public void turnRight() {
        fuelInjector.injectLess();
        wheelSystem.turnRight();
    }

    public void turnLeft() {
        fuelInjector.injectLess();
        wheelSystem.turnLeft();
    }

    @Override
    public String getGasLeft() {
        return gasController.gasLeft();
    }

    @Override
    public String getLocation() {
        return locationController.getLocation();
    }
}