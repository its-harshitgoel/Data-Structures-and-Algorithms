import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char S_AB = sc.next().charAt(0);
        char S_AC = sc.next().charAt(0);
        char S_BC = sc.next().charAt(0);
        
        if (S_AB == '<' && S_AC == '<' && S_BC == '<') {
            // A < B < C
            System.out.println("B");
        } else if (S_AB == '<' && S_AC == '<' && S_BC == '>') {
            // A < B > C
            System.out.println("A");
        } else if (S_AB == '>' && S_AC == '<' && S_BC == '<') {
            // B < A < C
            System.out.println("A");
        } else if (S_AB == '>' && S_AC == '<' && S_BC == '>') {
            // B < A > C
            System.out.println("A");
        } else if (S_AB == '<' && S_AC == '>' && S_BC == '<') {
            // A < C < B
            System.out.println("C");
        } else if (S_AB == '>' && S_AC == '>' && S_BC == '>') {
            // C < B < A
            System.out.println("B");
        } else if (S_AB == '>' && S_AC == '>' && S_BC == '<') {
            // C < A < B
            System.out.println("A");
        } else if (S_AB == '<' && S_AC == '>' && S_BC == '>') {
            // C < A < B
            System.out.println("A");
        }
    }
}
