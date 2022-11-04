/*
Programme 8
Display right angle triangle of @ using nested for loops
*/

package week8_java_hw_reshma;

public class RightAngleTriangle_8 {
    public static void main(String[] args) {
        int a; int b; // declare variable 'a' as row and 'b' as column

        for (a=0;a<=5;a++){ //outer loop to indicate row of triangle
            for(b=0;b<=a;b++){ //inner loop to indicate column of triangle
            System.out.print("@");
            }
            System.out.println(); //new line after printing each line
        }
    }
}
