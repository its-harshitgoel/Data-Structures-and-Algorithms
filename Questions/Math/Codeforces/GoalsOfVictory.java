import java.util.Scanner;

class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < a - 1; j++) {
                int num = sc.nextInt();
                sum += num;
            }

            if (sum > 0) {
                System.out.println(sum * (-1));
            } else {
                System.out.println(sum / (-1));
            }
        }
    }

}