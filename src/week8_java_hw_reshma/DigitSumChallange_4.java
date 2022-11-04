/*
Programme4
*/

package week8_java_hw_reshma;

public class DigitSumChallange_4 {
    public static void main(String[] args) {
        System.out.println("The sum of digit 125 is " +sumDigits(125));
    }

    static int sumDigits(int number){
        int result = 0;
        if (number<0){
            return -1;
        }
        while (number>0){
            result += number % 10;
            number /= 10;
        } return result;
    }
}
