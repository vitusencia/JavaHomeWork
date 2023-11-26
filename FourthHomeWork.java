import java.util.Scanner;

public class FourthHomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // simple calculator

        System.out.println("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = in.nextDouble();

        System.out.println("Выберите операцию: +, -, *, /");
        char operator = in.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Ошибка. Неверно введены данные.");
        }
        System.out.println("Ответ: " + result);
        in.close();
    }
}
