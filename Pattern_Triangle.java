// Take N (number of rows), print the following pattern (for N = 4).

//                        1 
//                      2 3 2
//                    3 4 5 4 3
//                  4 5 6 7 6 5 4
// Input Format
// Constraints
// 0 < N < 10

// Output Format
// Sample Input
// 4
// Sample Output
//              1
//          2   3   2
//      3   4   5   4   3
// 4    5   6   7   6   5   4
// Explanation
// Each number is separated from other by a tab.

import java.util.Scanner;

public class Pattern_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_num = sc.nextInt();
        int num = 1;
        int spaces = total_num - 1;
        while (num <= total_num) {
            int count = 1;
            while (count <= spaces) {
                System.out.print("\t");
                count++;
            }
            int cNum = num;
            count = 1;
            while (count <= num) {
                System.out.print(cNum + "\t");
                cNum++;
                count++;
            }
            cNum -= 2;
            count = 1;
            while (count < num) {
                System.out.print(cNum + "\t");
                cNum--;
                count++;
            }
            System.out.println();
            spaces--;
            num++;
        }
        sc.close();
    }
}
