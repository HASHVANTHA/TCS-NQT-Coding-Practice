/*
Question: Create a Multiplication Table

Input:
5

Output:
1 * 5 = 5
2 * 5 = 10
...
10 * 5 = 50
*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num:- ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + num + " = " + (i * num));
        }

        sc.close();
    }
}