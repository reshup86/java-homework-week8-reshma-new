/*
Programme14
Write a program in Java to display the pattern like a diamond.
 While loop
                  *
                 * *
                * * *
               * * * *
             * * * * * *
            * * * * * * *
             * * * * * *
              * * * * *
               * * * *
                * * *
                 * *
                  *
*/

package week8_java_hw_reshma;

public class Diamond_14 {
    public static void main(String[] args) {
        int a = 1; //initialize row of triangle
        int b; //initialize column of triangle
        //loop for upper half triangle
        while (a <= 7) {
            b = 1;
            while (b++ <= 7 - a) {
                System.out.print(" ");
            }
            b = 1;
            while (b++ <= a * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            a++;
        }
        //loop for bottom half triangle
        a = 7 - 1;
        while (a > 0) {
            b = 1;
            while (b++ <= 7 - a) {
                System.out.print(" ");
            }
            b = 1;
            while (b++ <= a * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            a--;
        }
    }
}
