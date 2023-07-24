package Seminar2;

public class Task1 {
    /*
    Дано четное число N(N>0) и символы с1 и с2.
    Написать метод, который вернет строку длиной N, которая состоит из чередующихся символов с1 и с2.
    начиная с с1.
    ответ: с1с2с1...с2(всего N символов)
    */
    public static void main(String[] args) {
    char c1 = 'a';
    char c2 ='b';
    int n = 6;
    System.out.println(luboe(c1, c2, n));
    }
    static String luboe(char c1, char c2, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
    return stringBuilder.toString();
    }
}
