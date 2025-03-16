package decorator;

import composite.SmartDevice;

public class ScheduledOperationDecorator extends SmartDeviceDecorator {
    public ScheduledOperationDecorator(SmartDevice smartDevice) {
        super(smartDevice);
    }

    public void turnOn(){
        System.out.println("Scheduled acivation...");
        super.turnOn();
    }
    public void turnOff(){
        System.out.println("Scheduled deacivation...");
        super.turnOff();
    }
}
