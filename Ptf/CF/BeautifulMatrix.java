import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = -1;
        int col = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int n = sc.nextInt();
                if (n == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        sc.close();

        System.out.println(Math.abs(2 - row) + Math.abs(2 - col));
    }
}
