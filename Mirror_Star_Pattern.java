// Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

//       *
//    *  *  *  
// *  *  *  *  *  
//    *  *  *
//       *
// Input Format
// Constraints
// 0 < N < 10 (only odd numbers allowed)

// Output Format
// Sample Input
// 5
// Sample Output
//       *
//     * * *
//   * * * * *
//     * * *
//       *
// Explanation
// Each '*' is separated from other by a tab.

import java.util.Scanner;

public class Mirror_Star_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();
        if (rows % 2 == 0) {
            System.out.println("only odd numbers are allowed.");
            return;
        }
        int i = 1;
        int spaces = rows / 2;
        int stars = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= spaces) {
                System.out.print("  ");
                j++;
            }
            j = 1;
            while (j <= stars) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            
            if (i <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            i++;
        }
    }
}
