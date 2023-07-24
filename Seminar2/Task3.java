package Seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
и метод, который записывает эту строку в простой тектовый файл, обработайте исключение.
*/
public class Task3 {


    static Logger logger; // создаем переменную на уровне класса. Эту переменную видят все методы.
    public static void main(String[] args) {
        int n =10;
        String s = "TEST";
        String s1 = duplicate(s, n);
        String filePath = "test.txt";    // создается строка с указание пути к фалу. path (это путь в переводе)
        createLogger(); // метод по созданию логгера
        writeToFile(s1, filePath);
        System.out.println(readerInFile(filePath));

        closeLogger(); // метод по закрыванию всех логгеров
    }
    private static void createLogger() {
    logger  = Logger.getAnonymousLogger();
    FileHandler fileHandler = null;
    try {
        fileHandler = new FileHandler("log.txt");
        logger.addHandler(fileHandler);
    } catch (IOException e) {
        e.printStackTrace();
    }
    SimpleFormatter formatter = new SimpleFormatter();
    fileHandler.setFormatter(formatter);
}
    private static void closeLogger() {
    for (Handler handler: logger.getHandlers()){
        handler.close();
    }
}
    static String readerInFile (String filePath) {
    File file = new File (filePath); // создание специального типа "переменной" чтобы filePath воспринемался как путь к файлу я не строка.
    StringBuffer sb = new StringBuffer(); 
    try(Scanner scanner = new Scanner(file)) {
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine()); // вывод в консоль всё что есть в строке до самого конца строки
            sb.append("\n"); // добавление новой строки, чтобы читалось в консоли как в файле
        }
    } catch(Exception e){
        e.printStackTrace();
    }
    return sb.toString(); // возврат "добавляемой стороки" в виде обычной строки
}

    static String duplicate( String s, int n) {
    return s.repeat(n); // повторение одно и то же знаениче несколько раз
}
    static void writeToFile(String s1, String filePath) {
    try(FileWriter writer = new FileWriter(filePath, true)){ // создается что-то что может записывать в фал значения (обязательно нужно тут указать путь к этому фалу в скобках))
    writer.write(s1); // записывается в файл строку s1
    writer.write("\n"); // перенос строки
    writer.flush(); // буфер отчищается и записывается в буфер
    writer.close(); // обязательно нужно закрыть фал после работы с ним
    logger.info(" Запись успешно выполнена");
    } catch (Exception e){
        e.printStackTrace();
        logger.warning("не удалось записать в файл");
    }
}
}
 