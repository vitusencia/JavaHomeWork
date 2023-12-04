package SixthHomeWork;

public class ElectricCar extends Car {

    public ElectricCar(String brand, String engine, int power) {
        super(brand, engine, power);
    }

    @Override
    public void info() {
        System.out.println("Car brand: " + getBrand() + "\nType of engive: " +
                getEngine() + "\nPower: " + getPower() + " kW");
    }

    @Override
    public void usage() {
        System.out.println("Better choise for city driving.");
    }

    @Override
    public void price() {
        System.out.println("Price is from 5 000 000 to 15 000 000 rubles.\n");
    }
}