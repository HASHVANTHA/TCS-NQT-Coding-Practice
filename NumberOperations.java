/*
Question: Number Operations

1. Sum of digits from number
Input: 123
Output: 6

2. Find the length of the number
Input: 52357
Output: 5

3. Find largest digit from the number
Input: 56318
Output: 8
*/

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num:- ");
        int num = sc.nextInt();

        int sum = 0;
        int count = 0;
        int max = 0;

        while (num > 0) {
            int digit = num % 10;

            sum = sum + digit;
            count++;

            if (digit > max) {
                max = digit;
            }

            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Length of number: " + count);
        System.out.println("Largest digit: " + max);

        sc.close();
    }
}
