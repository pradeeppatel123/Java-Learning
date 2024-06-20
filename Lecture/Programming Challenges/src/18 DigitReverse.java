import java.util.Scanner;

class DigitReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you want to reverse : ");
        int num = input.nextInt();
        System.out.print("Reversed Digits Number is : "+reverseDigitOfNumber(num));
    }
    private static int reverseDigitOfNumber(int num){
        int revereDigit = 0;
        while (num > 0){
            int rem = num % 10;
            revereDigit = revereDigit * 10 + rem;
            num /= 10;
        }
        return revereDigit;
    }
}
