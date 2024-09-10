package Questions.Sieve;

import java.util.Scanner;

public class PrimeFactorizationOfEveryQuery {
    
    static int[] smallestPrimeFactorInitialise(int n) {
        int[] spf = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) { 
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        return spf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] spf = smallestPrimeFactorInitialise(n);

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int query = sc.nextInt();
            System.out.print(query +": ");
            while(query > 1) {
                int smallestFactor = spf[query];
                System.out.print(smallestFactor + " ");
                query /= smallestFactor;
            }
            System.out.println();
        }

        sc.close();
    }
}
