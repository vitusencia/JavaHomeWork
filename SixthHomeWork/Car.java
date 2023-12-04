package SixthHomeWork;

public abstract class Car {

    private String brand;
    private String engine;
    private int power;

    public Car(String brand, String engine, int power) {
        this.brand = brand;
        this.engine = engine;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getEngine() {
        return engine;
    }

    public int getPower() {
        return power;
    }

    public void info() {
        System.out.println("Car brand: " + brand + "\nType of engive: " +
                engine + "\nPower: " + power + " PS");
    }

    public abstract void usage();

    public abstract void price();
}