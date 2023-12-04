package SixthHomeWork;

public class Main {
    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar("Tesla", "Electric motor", 270);
        tesla.info();
        tesla.usage();
        tesla.price();

        GasolineCar subaru = new GasolineCar("Subaru", "ICE", 185);
        subaru.info();
        subaru.usage();
        subaru.price();

        Tractor mtz = new Tractor("MTZ", "ICE", 156);
        mtz.info();
        mtz.usage();
        mtz.price();
    }
}