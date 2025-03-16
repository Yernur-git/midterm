package composite;
import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevice{
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {this.name = name;}

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    public void turnOn(){
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnOff(){
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public boolean isOn() {
        for (SmartDevice device : devices) {
            if (device.isOn()) {
                return true;
            }
        }
        return false;
    }

    public String getStatus() {
        StringBuilder status = new StringBuilder(name + " contains:\n");
        for (SmartDevice device : devices) {
            status.append(" - ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }

    public String getDeviceType() {
        return "Room";
    }
}
