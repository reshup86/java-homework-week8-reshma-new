package week8_java_hw_reshma;

public class FibonacciNumber_9 {
    public static void main(String[] args) {
        int n1 =0 ,n2 =1 ,n3;
        int i;
        int count =12;
        System.out.print(n1+"");
        for(i=0;i<=count;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
