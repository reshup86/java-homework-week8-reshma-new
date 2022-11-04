package week8_java_hw_reshma;

public class getEvenDigitSum_11 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;

        if (number>=0){
            while (number >0){
                lastDigit = number%10;
                if (lastDigit%2 ==0){
                    sumOfEvenDigits +=lastDigit;
                }
                number /=10;
            }
            if (originalNumber>=0){
                System.out.println("The sum of Even digit numbers is: "+originalNumber);
            }
            return sumOfEvenDigits;
        }
        System.out.println("Invalid Input");
        return -1;
    }
}
