package HomeTask1;

/**
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangularNumber(i));
    }

    public static int triangularNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}