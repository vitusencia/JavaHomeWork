import java.util.Scanner;

public class FirstHomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше ФИО");
        String name = in.nextLine();

        System.out.println("Введите ваш номер телефона");
        String phoneNumber = in.nextLine();

        System.out.println("Введите ваш средний балл атестата");
        float point = in.nextFloat();

        in.close();

        System.out.printf("\nВаше имя: " + name + "\nВаш номер телефона: " +
             phoneNumber + "\nВаш средний балл атестата: " + point);
    }
}
