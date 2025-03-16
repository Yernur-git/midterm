package facade;

import composite.SmartDevice;
import composite.Light;
import composite.Thermostat;
import composite.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SmartHomeController {
    private List<SmartDevice> allDevices;
    private Map<String, Room> rooms;

    public SmartHomeController() {
        this.allDevices = new ArrayList<>();
        this.rooms = new HashMap<>();
        System.out.println("Smart Home Controller initialized");
    }

    public void addDevice(SmartDevice device) {
        allDevices.add(device);
        System.out.println(device.getDeviceType() + " added to system");
    }

    public void removeDevice(SmartDevice device) {
        allDevices.remove(device);
        System.out.println(device.getDeviceType() + " removed from system");
    }

    public Room createRoom(String roomId) {
        Room room = new Room(roomId);
        rooms.put(roomId, room);
        allDevices.add(room);
        System.out.println("Room " + roomId + " created");
        return room;
    }

    public void addDeviceToRoom(String roomName, SmartDevice device) {
        Room room = rooms.get(roomName);
        if (room != null) {
            room.addDevice(device);
        } else {
            room = createRoom(roomName);
            room.addDevice(device);
        }

        if (!allDevices.contains(device)) {
            allDevices.add(device);
        }
    }

    public void turnOnAll() {
        System.out.println("Turning on all devices");
        for (SmartDevice device : allDevices) {
            device.turnOn();
        }
    }

    public void turnOffAll() {
        System.out.println("Turning off all devices");
        for (SmartDevice device : allDevices) {
            device.turnOff();
        }
    }

    public void turnAllLightsOn() {
        System.out.println("Turning on all lights");
        for (SmartDevice device : allDevices) {
            if (device instanceof Light) {
                device.turnOn();
            }
        }
    }

    public void turnAllLightsOff() {
        System.out.println("Turning off all lights");
        for (SmartDevice device : allDevices) {
            if (device instanceof Light) {
                device.turnOff();
            }
        }
    }

    public void setGlobalTemperature(int temperature) {
        System.out.println("Setting all thermostats to " + temperature + "°C");
        for (SmartDevice device : allDevices) {
            if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(temperature);
            }
        }
    }

    public void showStatus() {
        System.out.println("\n=== SMART HOME STATUS ===");

        int totalDevices = 0;
        int activeDevices = 0;

        for (SmartDevice device : allDevices) {
            System.out.println(device.getStatus());

            if (!(device instanceof Room)) {
                totalDevices++;
                if (device.isOn()) {
                    activeDevices++;
                }
            }
        }

        System.out.println("\n=== SUMMARY ===");
        System.out.println("Total devices: " + totalDevices);
        System.out.println("Active devices: " + activeDevices);
        System.out.println("====================");
    }

    public void turnRoomOn(String roomId) {
        Room room = rooms.get(roomId);
        if (room != null) {
            System.out.println("Turning on all devices in room: " + roomId);
            room.turnOn();
        } else {
            System.out.println("Room " + roomId + " not found");
        }
    }

    public void turnRoomOff(String roomId) {
        Room room = rooms.get(roomId);
        if (room != null) {
            System.out.println("Turning off all devices in room: " + roomId);
            room.turnOff();
        } else {
            System.out.println("Room " + roomId + " not found");
        }
    }
}