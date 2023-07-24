package Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Task3 {
    /*
    Создать список типа ArrayList
    поместить в него как строки, так т целые числа.
    Пройти по списку, найти и удалить целые числа.
    */
    public static void main(String[] args) {
    
    List list = new ArrayList();
    list.add(4);
    list.add("10");
    list.add("фаврлф");
    list.add(7);
    list.add(4.5);
    list.add(null);
    removeIntegerV2(list);
    System.out.println(list);
    }

    static void removeInteger (List list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
    }

    static void removeIntegerV2(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object instanceof Integer){
                iterator.remove();
            }
        }
    }
}
