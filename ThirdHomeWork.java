import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
        	    System.out.println("Введи число: ");
            int i = in.nextInt();
            if (i == 0) {
                
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBazz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Bazz");
            } else {
                System.out.println(i);
            } 
        }
    }  
}