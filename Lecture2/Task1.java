package Lecture2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте колличество цифр: ");
        int n = scan.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            sb.append(count);
            count ++;
        }
        System.out.println(sb);
    }
}
