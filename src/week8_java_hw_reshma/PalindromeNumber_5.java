/*
Programme5
Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
    isPalindrome(-1221); → should return true
    isPalindrome(707); → should return true
    isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
    11212.
*/


package week8_java_hw_reshma;

public class PalindromeNumber_5 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;

        while (number!=0)
        {
            int lastDigit = number%10;
            reverse = (reverse * 10)+ lastDigit;
            number /=10;
        }
        return num==reverse;
    }
}
