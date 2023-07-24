package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    /*
    Заполнить список десятью случайными числами.
    Отсортировать список методом sort() и вывести его на экран.
    */
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 7, 0, 2, 6, 2};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.sort(null);
        System.out.println(list);
    }
}
