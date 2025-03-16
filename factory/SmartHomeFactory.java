package factory;
import composite.SmartDevice;

public interface SmartHomeFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name);
}
