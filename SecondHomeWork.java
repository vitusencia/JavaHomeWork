import java.util.Scanner;

public class SecondHomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        float firstNum = in.nextFloat();

        System.out.println("Введите второе число");
        float secondNum = in.nextFloat();

        System.out.println("Введите третье число");
        float thirdNum = in.nextFloat();

        in.close();

        System.out.println((firstNum + secondNum + thirdNum) / 3);
    }
}
