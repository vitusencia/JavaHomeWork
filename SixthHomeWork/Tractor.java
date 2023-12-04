package SixthHomeWork;

public class Tractor extends Car {

    public Tractor(String brand, String engine, int power) {
        super(brand, engine, power);
    }

    @Override
    public void usage() {
        System.out.println("Better choise for farm driving.");
    }

    @Override
    public void price() {
        System.out.println("Price is from 2 000 000 to 8 000 000 rubles.\n");
    }
}