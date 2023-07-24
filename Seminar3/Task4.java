package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    /*
    Каталог товаров Книжного магазина созранен в виде двумерного списка List<ArrayList<String>> Так,
    что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных- название книг.
    Напишите метод для заполнения данной структуры.
    */
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList();
        
    }

    static void addBook (List<List<String>> shopBook, String generBook, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> genreList = shopBook.get(i);
            String genre = genreList.get(0);
            if (generBook.equalsIgnoreCase(genre)){
                genreList.add(nameBook);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(generBook);
        list.add(nameBook);
        shopBook.add(list);

    }
}
