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

    public String getStatus() {
        String status = name + " contains:\n";
        for (SmartDevice device : devices) {
            status += " - " + device.getStatus() + "\n";
        }
        return status;
    }

}
