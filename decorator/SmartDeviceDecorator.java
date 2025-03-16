package decorator;
import composite.SmartDevice;

abstract class SmartDeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public SmartDeviceDecorator(SmartDevice device) { this.decoratedDevice = device; }

    public void turnOn() {
        decoratedDevice.turnOn();
    }
    public void turnOff() {
        decoratedDevice.turnOff();
    }
    public String getStatus() {
        return decoratedDevice.getStatus();
    }

    public String getDeviceType() {
        return decoratedDevice.getDeviceType();
    }
}
