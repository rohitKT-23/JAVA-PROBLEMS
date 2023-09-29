// Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

// Input Format
// Single integer N.

// Constraints
// N <= 20

// Output Format
// Print pattern.

// Sample Input
// 5
// Sample Output
//     *****
//    *   *
//   *   *
//  *   *
// *****
// Explanation
// For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= n) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
