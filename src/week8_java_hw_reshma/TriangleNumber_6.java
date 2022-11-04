/*
Programme 6
Write a program in Java to display the pattern like a triangle with a number.
*/

package week8_java_hw_reshma;

import java.util.Scanner;

public class TriangleNumber_6 {
    public static void main(String[] args) {
        int x,y;
        Scanner s = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = s.nextInt();

        for(x=1;x<=num;x++){
            for (y=1;y<=x;y++)
                System.out.print(y);
            System.out.println(" ");
        }
        s.close();
    }
}

