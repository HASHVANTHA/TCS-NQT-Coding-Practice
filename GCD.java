/*
Question: Find the Greatest Common Divisor (GCD)

Example 1:
Input:
56
98

Output:
14

Example 2:
Input:
12
6

Output:
6
*/

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);

        sc.close();
    }
}
