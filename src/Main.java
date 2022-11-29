import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int Number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int Number2 = new Scanner(System.in).nextInt();
        {
            String str = "qwerty";
            int x = Number;
            int y = Number2;
            int sum = x + y;
            int sum1 = x * y;
            int sum2 = x - y;
            double sum3 = (double) x / y;
            System.out.println("Сумма " + sum);
            System.out.println("Произведение " + sum1);
            System.out.println("Разность " + sum2);
            System.out.println("Частное " + sum3);
        }
    }
}


