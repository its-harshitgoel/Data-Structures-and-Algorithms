package Questions.String;
import java.util.Scanner;

public class camelCase {
    //determine the number of words
    public static int countWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countWords(s));
        sc.close();
    }
}
