package Questions.String;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int j = 0; j < q; j++) {
            int n = sc.nextInt(); 

            StringBuilder a = new StringBuilder();
            StringBuilder e = new StringBuilder();
            StringBuilder i = new StringBuilder();
            StringBuilder o = new StringBuilder();
            StringBuilder u = new StringBuilder();

            int repeatCount = n / 5;
            int extra = n % 5;

            for (int k = 0; k < repeatCount; k++) {
                a.append('a');
                e.append('e');
                i.append('i');
                o.append('o');
                u.append('u');
            }

            if (extra > 0) a.append('a');
            if (extra > 1) e.append('e');
            if (extra > 2) i.append('i');
            if (extra > 3) o.append('o');
            if (extra > 4) u.append('u');

            String result = a.toString() + e.toString() + i.toString() + o.toString() + u.toString();

            System.out.println(result);
        }

        sc.close();
    }
}
