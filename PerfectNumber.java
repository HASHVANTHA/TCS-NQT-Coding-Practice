/*
Question: Perfect Number

A perfect number is a positive integer that equals the sum of its proper divisors,
excluding the number itself.

Example:
Input: 6
Divisors: 1, 2, 3
Sum: 1 + 2 + 3 = 6
Output: Perfect Number

Input: 8
Divisors: 1, 2, 4
Sum: 7
Output: Not Perfect Number
*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }

        sc.close();
    }
}