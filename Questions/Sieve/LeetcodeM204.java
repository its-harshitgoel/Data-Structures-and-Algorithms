package Questions.Sieve;

import java.util.Scanner;

/*
 * Given an integer n, return the number of prime numbers that are STICTLY LESS THAN n.
 */

public class LeetcodeM204 {
    public static int countPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        int cnt = 0;

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                cnt++;
            }
        }

        return cnt;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(countPrimes(n));

    }
}
