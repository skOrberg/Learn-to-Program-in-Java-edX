/*
BJP4 Exercise 12.2: writeNums
https://practiceit.cs.washington.edu/problem/view/bjp4/chapter12/e2-writeNums

Write a method writeNums that accepts an integer parameter n and prints the first n integers starting with 1 in
sequential order, separated by commas. For example, the following calls produce the following output:

Call	        Output
writeNums(5);	1, 2, 3, 4, 5
writeNums(12);	1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
Your method should throw an IllegalArgumentException if passed a value less than 1. Note that the output does not
advance to the next line.
 */

import java.util.Scanner;

public class WriteNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How long should the integer sequence be?: ");
        int num = input.nextInt();
        writeNums(num);
    }

    public static void writeNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }else if (n == 1) {
            System.out.print("1");
        } else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }
}