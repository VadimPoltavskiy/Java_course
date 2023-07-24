package Seminar2;

public class Task2 {
    /*
    напишите метод, который сжимает строку
    */
    public static void main(String[] args) {
        String s = "aaaaaabbbcddddyyyygggg";
        System.out.println(squeeze(s));
    }
    
    static String squeeze(String line){
        int count = 1;
        char[] chars =line.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[i-1]){
                count ++;
            } else {
                stringBuilder.append(chars[i-1]);
                if (count != 1){
                  stringBuilder.append(count);
                  count = 1;  
                }
            }
         }
        stringBuilder.append(chars[chars.length-1]);
        if (count != 1){
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}
