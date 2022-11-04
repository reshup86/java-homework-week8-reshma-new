/*
Programme 3
Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
*/

package week8_java_hw_reshma;

import java.util.Scanner;

public class VowelOrConsonant_3 {
    public static void main(String[] args) {
        int i=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        char ch = s.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':  i++;
        }if (i==1)
            System.out.println("Entered character "+ch+" is Vowel");
        else
            if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
                System.out.println("Entered character "+ch+" is Consonant");
            else
                System.out.println("Invalid data");
        s.close();
    }
}
