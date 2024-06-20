import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int secondNum = input.nextInt();
        System.out.println("Before Swapping the value of first Number is "+firstNum +" and second number is "+secondNum);
        // swapping operation
        firstNum = firstNum+secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum-secondNum;
        System.out.println("After Swapping is done the value of first Number is "+firstNum +" and second number is "+secondNum);


    }
}
