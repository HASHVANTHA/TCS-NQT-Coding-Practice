/*
Question: Armstrong Number

An Armstrong number is a number that is equal to the sum of its digits
raised to the power of the number of digits.

Example:
Input: 153
Calculation: 1^3 + 5^3 + 3^3 = 153
Output: Armstrong

Input: 120
Output: Not Armstrong

Input: 1634
Calculation: 1^4 + 6^4 + 3^4 + 4^4 = 1634
Output: Armstrong
*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
