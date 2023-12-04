package SixthHomeWork;

public class GasolineCar extends Car {

    public GasolineCar(String brand, String engine, int power) {
        super(brand, engine, power);
    }

    @Override
    public void usage() {
        System.out.println("Better choise for dirt driving.");
    }

    @Override
    public void price() {
        System.out.println("Price is from 1 000 000 to 5 000 000 rubles.\n");
    }
}