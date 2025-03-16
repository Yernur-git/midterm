package adapter;

import composite.SmartDevice;

public class LockAdapter implements SmartDevice, LegacyLockSystem {
    private OldLockSystem oldLock;

    public LockAdapter(OldLockSystem oldLock) {
        this.oldLock = oldLock;
    }

    public void unlockDoor() {
        oldLock.open();
    }

    public void lockDoor() {
        oldLock.close();
    }

    public boolean isLocked() {
        return oldLock.isLocked();
    }

    public void turnOn() {
        oldLock.close();
    }

    public void turnOff() {
        oldLock.open();
    }

    public boolean isOn() {
        return oldLock.isLocked();
    }

    public String getDeviceType() {
        return "Smart Lock";
    }

    public String getStatus() {
        return "Lock is " + (oldLock.isLocked() ? "locked" : "unlocked");
    }
}
