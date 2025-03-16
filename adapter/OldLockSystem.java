package adapter;

public class OldLockSystem {
    private boolean isLocked;

    public void open() {
        isLocked = false;
        System.out.println("Legacy lock opened");
    }
    public void close() {
        isLocked = true;
        System.out.println("Legacy lock closed");
    }

    public boolean isLocked() {
        return isLocked;
    }
}
