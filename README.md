# midterm
Overview

This project is a simulation of a Smart Home Control System using various design patterns, including Composite, Decorator, Abstract Factory, Facade, and Adapter.

Features

Composite Pattern: Organizes devices into rooms and allows group control.

Decorator Pattern: Adds features like scheduled activation.

Abstract Factory Pattern: Creates different types of smart devices.

Facade Pattern: Provides a simple interface to manage all devices.

Adapter Pattern: Integrates a legacy lock system.


## Structure of the Project

SmartHomeProject/ │── src/ │ ├── adapter/ │ │ ├── LockAdapter.java │ │ ├── LegacyLockSystem.java │ │ ├── OldLockSystem.java │ │ │ ├── composite/ │ │ ├── Light.java │ │ ├── Room.java │ │ ├── SmartDevice.java │ │ ├── Thermostat.java │ │ │ ├── decorator/ │ │ ├── SmartDeviceDecorator.java │ │ ├── ScheduledOperationDecorator.java │ │ │ ├── facade/ │ │ ├── SmartHomeController.java │ │ │ ├── factory/ │ │ ├── SmartHomeFactory.java │ │ ├── BasicSmartHomeFactory.java │ │ ├── AdvancedSmartHomeFactory.java │ │ │ ├── main/ │ │ ├── SmartHomeDemo.java │ │── test/ (For unit tests) │── README.md │── .gitignore │── pom.xml / build.gradle (If using Maven or Gradle)


