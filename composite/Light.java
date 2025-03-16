package composite;

public class Light implements SmartDevice{
    private final String name;
    private boolean isOn;

    public Light(String name) {this.name = name;}

    public void turnOn(){
        System.out.println(name + " light is on");
    }

    public void turnOff(){
        System.out.println(name + " light is off");
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

    public String getDeviceType() {
        return "Light";
    }
}
