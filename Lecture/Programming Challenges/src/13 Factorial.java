import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int number = readNumber();
        long fact = returnFactorial(number);
        System.out.println("the factorial of "+number+" is = "+fact);
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        return input.nextInt();
    }
    public static long returnFactorial(int number){
        long fact = 1;
        for(int i = number;i >=1 ; i--){
            fact *= i;
        }
        return fact;
    }
}
