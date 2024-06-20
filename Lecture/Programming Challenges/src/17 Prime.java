import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        if(isPrime(number)){
            System.out.print(number+" is a prime number ");
        } else{
            System.out.print(number+" is not a prime number ");
        }
    }
    private static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
