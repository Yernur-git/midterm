package main;

import composite.*;
import decorator.*;
import factory.*;
import facade.*;
import adapter.*;

public class SmartHomeDemo {
    public static void main(String[] args) {
        System.out.println("=== Smart Home System Demo ===\n");

        // creating factory
        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();

        // smart home controller
        SmartHomeController homeController = new SmartHomeController();

        System.out.println("\n--- Setting up smart home ---");

        // creating rooms
        homeController.createRoom("LivingRoom");
        homeController.createRoom("Kitchen");
        homeController.createRoom("Bedroom");

        // adding devices
        homeController.addDeviceToRoom("LivingRoom", advancedFactory.createLight("LR-Light1"));
        homeController.addDeviceToRoom("LivingRoom", basicFactory.createLight("LR-Light2"));
        homeController.addDeviceToRoom("LivingRoom", advancedFactory.createThermostat("LR-Thermo"));

        homeController.addDeviceToRoom("Kitchen", advancedFactory.createLight("K-Light"));

        homeController.addDeviceToRoom("Bedroom", basicFactory.createLight("BR-Light"));
        homeController.addDeviceToRoom("Bedroom", basicFactory.createThermostat("BR-Thermo"));

        // adding lockers through adapter
        homeController.addDeviceToRoom("LivingRoom", new LockAdapter(new OldLockSystem()));
        homeController.addDeviceToRoom("Kitchen", new LockAdapter(new OldLockSystem()));

        System.out.println("\n--- Demonstrating Smart Home System ---");

        System.out.println("\n1. Initial system status:");
        homeController.showStatus();

        System.out.println("\n2. Turn on specific devices:");
        homeController.turnRoomOn("LivingRoom");
        homeController.turnRoomOn("Kitchen");

        System.out.println("\n3. Set thermostat temperature:");
        homeController.setGlobalTemperature(22);

        System.out.println("\n4. Turn on all lights using facade:");
        homeController.turnAllLightsOn();

        System.out.println("\n5. Turn off all kitchen devices:");
        homeController.turnRoomOff("Kitchen");

        System.out.println("\n6. Final system status:");
        homeController.showStatus();
    }
}