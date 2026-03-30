class Device {

    // attributes
    protected int deviceId;
    protected String brand;

    // constructor
    public Device(int deviceId, String brand) {
        this.deviceId = deviceId;
        this.brand = brand;
    }

    // functional methods
    public void powerOn() {
        System.out.println("Device is now ON.");
    }

    public void powerOff() {
        System.out.println("Device is now OFF.");
    }

    // display method
    public void display() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Brand     : " + brand);
    }

    // toString method
    public String toString() {
        return "Device[ID=" + deviceId + ", Brand=" + brand + "]";
    }
}