public class FifthHomeWork {
    public static void main(String[] args) {

        int resultInt = 0;
        double resultDouble = 0;

        System.out.println(resultInt = adding(20, 10));
        System.out.println(resultDouble = adding(20.2, 10.1));

        System.out.println(resultInt = subtracting(20, 10));
        System.out.println(resultDouble = subtracting(20.2, 10.1));

        System.out.println(resultInt = multiplying(20, 10));
        System.out.println(resultDouble = multiplying(20.2, 10.1));

        System.out.println(resultInt = dividing(20, 10));
        System.out.println(resultDouble = dividing(20.2, 10.1));
    }

    public static int adding(int a, int b) {
        return a + b;
    }

    public static double adding(double x, double y) {
        return x + y;
    }

    public static int subtracting(int a, int b) {
        return a - b;
    }

    public static double subtracting(double x, double y) {
        return x - y;
    }

    public static int multiplying(int a, int b) {
        return a * b;
    }

    public static double multiplying(double x, double y) {
        return x * y;
    }

    public static int dividing(int a, int b) {
        if (b != 0) {
            return a / b;
        } else
            return 0;
    }

    public static double dividing(double x, double y) {
        if (y != 0) {
            return x / y;
        } else
            return 0;
    }
}