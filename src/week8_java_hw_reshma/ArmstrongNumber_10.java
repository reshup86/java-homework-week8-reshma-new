/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
*/

package week8_java_hw_reshma;

import java.util.Scanner;

public class ArmstrongNumber_10 {
    public static void main(String[] args) {
        int num, remainder, result=0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = s.nextInt();
        int x= n;

        while(x!=0){
            remainder = x%10;
            result += Math.pow(remainder,3);
            x/=10;
        }
        if (result==n)
            System.out.println(n+" is an Armstrong number");
        else
            System.out.println(n+" is not an Armstrong number");
        s.close();
    }
}
