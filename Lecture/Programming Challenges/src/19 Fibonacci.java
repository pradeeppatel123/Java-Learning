import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        printFibonacci(n);
    }
    private static void printFibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibonacci Series is ");
        for(int i = 1;i<=n;i++){
            System.out.print(num1+" ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }
}
