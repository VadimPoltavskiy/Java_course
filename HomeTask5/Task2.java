package HomeTask5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    /*
    Пусть дан список сотрудников: Иван Иванов, 
    Светлана Петрова, Кристина Белова, Анна Мусина, 
    Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, 
    Петр Чернышов, Мария Федорова, Марина Светлова, Мария 
    Cавина, Мария Рыкова, Марина Лугова, Анна Владимирова, 
    Иван Мечников, Петр Петин, Иван Ежов. Написать программу, 
    которая найдет и выведет повторяющиеся имена с количеством 
    повторений. Отсортировать по убыванию популярности. 
    Для сортировки использовать TreeMap.
    */
public static void main(String[] args) {
        Map<String, Integer> namesDict = new HashMap<>();

        String[] namesArr = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };

        for (String el: namesArr) {
            String name = el.split(" ")[0];

            if (namesDict.containsKey(name)) {
                namesDict.replace(name, namesDict.get(name) + 1);
            }
            else namesDict.put(name, 1);
        }

        Map<String, Integer> sortedDict = sortHashMap(namesDict);

        System.out.println(namesDict);
        System.out.println(sortedDict);
    }

    public static Map<String, Integer> sortHashMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        int max = 1;

        for (int value: map.values())
            if (value > max) max = value;

        for (int i = max; i > 0; i--) {
            for (var el: map.entrySet())
                if (map.get(el.getKey()) == i)
                    sortedMap.put(el.getKey(), el.getValue());
        }

        return sortedMap;
    }

}
