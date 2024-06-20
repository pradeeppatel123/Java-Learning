import java.util.Scanner;

class DigitSum {
    public static void main(String[] args) {
        int number = readNumber();
        int digitSum = sumOfAllDigits(number);
        System.out.print("The digit of "+number+" is = "+digitSum);
    }
    private static int readNumber(){
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static int sumOfAllDigits(int number){
        int digitSum = 0;
        while(number > 0){
            int rem = number % 10;
            digitSum += rem;
            number /= 10;
        }
        return digitSum;
    }
}
