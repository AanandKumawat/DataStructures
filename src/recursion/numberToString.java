package recursion;

public class numberToString {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigit(int number){
        if (number==0)return;
        int lastDigit=number%10;
        printDigit(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
       printDigit(2025);
    }
}
