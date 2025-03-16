package composite;

public class Thermostat implements SmartDevice {
    private String name;
    private boolean isOn;

    public Thermostat(String name) {this.name = name;}

    public void turnOn(){
        System.out.println(name + "thermostat is on");
    }

    public void turnOff(){
        System.out.println(name + "thermostat is off");
    }

    public String getStatus() {
        String status;
        if (isOn) {
            status = "ON";
        } else {
            status = "OFF";
        }
        return name + " light is " + status;
    }
}
