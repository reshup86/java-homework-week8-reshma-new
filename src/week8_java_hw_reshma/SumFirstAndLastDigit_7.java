/*
Programme7
First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
*/

package week8_java_hw_reshma;

public class SumFirstAndLastDigit_7 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            System.out.print("Negative valued entered ");
            return -1;
        }
        int firstDigit = number%10;
        int lastDigit = 0;
        for(int i = number; i!=0; i/=10){
            lastDigit = i%10;
        }
        return firstDigit+lastDigit;
    }
}
