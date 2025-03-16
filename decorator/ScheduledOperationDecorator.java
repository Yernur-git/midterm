package decorator;

import composite.SmartDevice;

public class ScheduledOperationDecorator extends SmartDeviceDecorator {
    private boolean isOn;

    public ScheduledOperationDecorator(SmartDevice smartDevice) {
        super(smartDevice);
    }

    public void turnOn(){
        System.out.println("Scheduled turn on for " + decoratedDevice.getDeviceType());
        super.turnOn();
    }
    public void turnOff(){
        System.out.println("Scheduled turn off for " + decoratedDevice.getDeviceType());
        super.turnOff();
    }

    public boolean isOn() {
        return isOn;
    }
}
