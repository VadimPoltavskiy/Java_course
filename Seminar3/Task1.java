package Seminar3;

public class Task1 {
    /*
    даны следующие строки, сравить их с помощью  == и метода equals() класса Object
     */

     public static void main(String[] args) {
    
    String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e" + "l" + "l" + "o";
    String s5 = new String("hello");
    String s6 = new String(new char[]{'h','e','l','l','0'});
        
    System.out.println(s1 == s6); //этот метод не нужно использовать
    System.out.println(s1. equals(s6));//этот метод нужно использовать, когда работаем со строками.
    }
    
}
