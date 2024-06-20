import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        if(isArmstrong(num)){
            System.out.print(num+ " is a Armstrong number");
        } else{
            System.out.print(num+" is not  a Armstrong number");
        }
    }
    private static boolean isArmstrong(int num){
        int copyNumber = num;
        int digitSum = 0;
        while(copyNumber > 0){
            int rem = copyNumber % 10;
            digitSum += rem * rem *rem;
            copyNumber /= 10;
        }
        return digitSum == num;
    }
}
