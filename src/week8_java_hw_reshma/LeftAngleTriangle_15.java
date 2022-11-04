/*
Display left angle triangle of * using nested for loops
         *
       * *
     * * *
   * * * *
 * * * * *
*/

package week8_java_hw_reshma;

public class LeftAngleTriangle_15 {
    public static void main(String[] args) {
        int x,y; //initialize for row and column of triangle

        for (x=0;x<=5;x++) //loop for rows
        {
            for(y=2*(5-x);y>=0;y--) //loop for space
            {
                System.out.print(" ");
            }
            for(y=0;y<=x;y++) //loop for column
            {
                System.out.print(" *");
            }
            System.out.println(); //new line after printing each line
        }
    }
}
