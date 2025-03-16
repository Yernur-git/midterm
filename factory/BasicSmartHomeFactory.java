package factory;

import composite.Light;
import composite.SmartDevice;
import composite.Thermostat;

public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight(String name) {
        return new Light(name);
    }

    public SmartDevice createThermostat(String name) {
        return new Thermostat(name);
    }
}
