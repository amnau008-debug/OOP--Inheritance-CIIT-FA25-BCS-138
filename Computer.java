class Computer extends Device {

    protected String processor;
    protected int ram;

    // constructor
    public Computer(int deviceId, String brand, String processor, int ram) {
        super(deviceId, brand); // calling parent constructor
        this.processor = processor;
        this.ram = ram;
    }

    // override display
    @Override
    public void display() {
        super.display(); // reuse parent method
        System.out.println("Processor : " + processor);
        System.out.println("RAM       : " + ram + " GB");
    }

    // override toString
    @Override
    public String toString() {
        return super.toString() + ", Processor=" + processor + ", RAM=" + ram + "GB";
    }
}
