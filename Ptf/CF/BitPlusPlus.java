public class BitPlusPlus {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        while (n-- > 0) {
            String s = sc.nextLine();
            if (s.charAt(1) == '+') {
                x++;
            } else if (s.charAt(1) == '-') {
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
