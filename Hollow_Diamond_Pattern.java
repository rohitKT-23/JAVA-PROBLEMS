// Take N (number of rows), print the following pattern (for N = 5).

//      * * * * *
//      * *   * *
//      *       *
//      * *   * *
//      * * * * *
// Input Format
// Constraints
// 0 < N < 10 (where N is an odd number)

// Output Format
// Sample Input
// 5
// Sample Output
// *   *   *   *   *		  
// *   *       *   *
// *               *
// *   *       *   *
// *   *   *   *   *   
// Explanation
// Each '*' is separated from other by a tab.


import java.util.Scanner;

public class Hollow_Diamond_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int total_rows = sc.nextInt();
        int currentRow = 1;
        int starsLeft = total_rows / 2;
        int spaces = 1;
        int starsRight = total_rows / 2;
        while (currentRow <= total_rows) {
            int i = 1;
            while (i <= starsLeft + 1) {
                System.out.print("*" + "\t");
                i++;
            }
            int j = 1;
            while (j < spaces - 1) {
                System.out.print("\t");
                j++;
            }
            int k = 1;
            while (k <= starsRight) {
                System.out.print("*" + "\t");
                k++;
            }
            if (currentRow < (total_rows / 2 + 1)) {
                starsLeft--;
                if (currentRow != 1) {
                    starsRight--;
                }
                spaces += 2;
            } else {
                if (currentRow != (total_rows - 1)) {
                    starsRight++;
                }
                starsLeft++;
                spaces -= 2;
            }
            currentRow++;
            System.out.println();
        }
        sc.close();
    }
}
