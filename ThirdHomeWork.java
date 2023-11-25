import java.util.Scanner;

public class ThirdHomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte count = 0;

        System.out.println("Для выхода из программы введите три нуля подряд.");

        while (count <= 3) {
            System.out.println("Введите число: ");
            int num = in.nextInt();

            if (num == 0) {
                count++;
            } else {
                count = 0;
            }

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBazz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Bazz");
            } else {
                System.out.println(num);
            }
        }
        in.close();
    }
}