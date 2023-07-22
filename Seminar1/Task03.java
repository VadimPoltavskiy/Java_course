public class Task03 {
    /*
    Во фразе "добро пожаловать на курс по Java"
    */
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        System.out.println(reverse(line));
        
    }
    static String reverse (String line){
        String[] temp = line.split(" ");
        String res = "";
        for (int i= temp.length-1; i>=0; i--){
            res += temp[i] + " ";
        
        }
        return res;
    }
}
