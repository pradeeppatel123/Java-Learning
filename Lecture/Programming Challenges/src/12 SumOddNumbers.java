import java.util.Scanner;

class SumOddNumbers {
    public static void main(String[] args) {
        int sum = sumOfOddNumbers();
        System.out.println("Sum of all odd numbers is : "+sum);
    }
    public static int sumOfOddNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();
        System.out.print("Enter the End number: ");
        int end = input.nextInt();
        int sum = 0;
        for(int i=start;i<=end;i++){
            if(i % 2 == 1 ){
                sum += i;
            }
        }
        return sum;
    }
}
