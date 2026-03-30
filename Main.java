public class Main {

    public static void main(String[] args) {

        // objects
        Device d = new Device(10, "Generic");
        Computer c = new Computer(20, "Dell", "Intel i5", 8);
        Laptop l = new Laptop(30, "HP", "Intel i7", 16, 6, 1.8);

        System.out.println("---- Device ----");
        d.display();
        System.out.println(d);
        d.powerOn();
        d.powerOff();

        System.out.println("\n---- Computer ----");
        c.display();
        System.out.println(c);
        c.powerOn();

        System.out.println("\n---- Laptop ----");
        l.display();
        System.out.println(l);
        l.powerOn();
    }
}