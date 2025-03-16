package factory;
import composite.SmartDevice;

interface SmartHomeFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name);
}
