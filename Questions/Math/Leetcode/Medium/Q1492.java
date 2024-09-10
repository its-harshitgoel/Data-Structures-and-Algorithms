package Leetcode.Medium;
/*
You are given two positive integers n and k. 
A factor of an integer n is defined as an integer i where n % i == 0.
Consider a list of all factors of n sorted in ascending order, 
return the kth factor in this list or return -1 if n has less than k factors.
*/

import java.util.Scanner;

public class Q1492 {
    public static int kthFactor(int n, int k) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(kthFactor(n, k));
    }
}
