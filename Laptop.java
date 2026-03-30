class Laptop extends Computer {

    protected int batteryLife;
    protected double weight;

    // constructor
    public Laptop(int deviceId, String brand, String processor, int ram, int batteryLife, double weight) {
        super(deviceId, brand, processor, ram);
        this.batteryLife = batteryLife;
        this.weight = weight;
    }

    // override display
    @Override
    public void display() {
        super.display(); // calling parent display
        System.out.println("Battery   : " + batteryLife + " hours");
        System.out.println("Weight    : " + weight + " kg");
    }

    // override toString
    @Override
    public String toString() {
        return super.toString() + ", Battery=" + batteryLife + "hrs, Weight=" + weight + "kg";
    }
}
