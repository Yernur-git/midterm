package composite;

public interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
    String getDeviceType();
    boolean isOn();
}
