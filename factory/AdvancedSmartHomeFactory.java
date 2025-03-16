package factory;
import composite.Light;
import composite.SmartDevice;
import composite.Thermostat;
import decorator.ScheduledOperationDecorator;

public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight(String name) {
        return new ScheduledOperationDecorator(new Light(name));
    }

    public SmartDevice createThermostat(String name) {
        return new ScheduledOperationDecorator(new Thermostat(name));
    }
}
