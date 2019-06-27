package src;

public class ProxyCarFacade implements IMonitoringService {
    @Override
    public String getGasLeft() {
        CarFacade realCarFacade = new CarFacade();
        return realCarFacade.getGasLeft();
    }

    @Override
    public String getLocation() {
        CarFacade realCarFacade = new CarFacade();
        return realCarFacade.getLocation();
    }
}
