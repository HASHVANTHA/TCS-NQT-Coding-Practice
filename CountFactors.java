/*
Question: Count the Number of Factors of a Given Number

Input:
12

Output:
6

Explanation:
Factors of 12 are 1, 2, 3, 4, 6, 12.
*/

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
