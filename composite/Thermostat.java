package composite;

public class Thermostat implements SmartDevice {
    private String name;
    private boolean isOn;
    private int temperature;
    private String mode;

    public Thermostat(String name) {this.name = name;}

    public void turnOn(){
        System.out.println(name + " thermostat is on");
    }

    public void turnOff(){
        System.out.println(name + " thermostat is off");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 0 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println("Thermostat " + name + " temperature set to " + temperature + "°C");
        } else {
            System.out.println("Invalid temperature. Must be between 0-30°C.");
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setMode(String mode) {
        if (mode.equals("Heat") || mode.equals("Cool") || mode.equals("Auto")) {
            this.mode = mode;
            System.out.println("Thermostat " + name + " mode set to " + mode);
        } else {
            System.out.println("Invalid mode. Must be Heat, Cool, or Auto.");
        }
    }

    public String getMode() {
        return mode;
    }

    public String getStatus() {
        String status;
        if (isOn) {
            status = "ON";
        } else {
            status = "OFF";
        }
        return name + " thermostat is " + status;
    }

    public String getDeviceType() {
        return "Thermostat";
    }
}
