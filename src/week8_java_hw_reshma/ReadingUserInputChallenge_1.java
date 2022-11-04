/*
Programme 1
Read 10 numbers from the console entered by the user and print the sum of those
numbers
*/

package week8_java_hw_reshma;

import java.util.Scanner;

public class ReadingUserInputChallenge_1 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        int x = 0;
        boolean num;

        Scanner s = new Scanner(System.in);
        while (count <= 10) {
            System.out.println("Enter number " + count +"#:");
            num = s.hasNextInt();

                if (num) {
                    x = s.nextInt();
                    sum+= x;
                    count++;
                } else {
                    System.out.println("Invalid number");
                }
                s.nextLine();
            }
            System.out.println("Sum of all numbers: " + sum);
            s.close();
        }
    }