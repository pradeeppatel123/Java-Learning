import java.util.Scanner;

class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Numbers : ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        // Addition Operation
        System.out.println("The sum of "+numOne+" and "+numTwo+" is = "+(numOne + numTwo));
        // Subtraction operation
        System.out.println("The Difference of "+numOne+" and "+numTwo+" is = "+(numOne - numTwo));
        // Multiplication operation
        System.out.println("The Multiplication of "+numOne+" and "+numTwo+" is = "+(numOne * numTwo));
        // Division Operation
        System.out.println("The Division of "+numOne+" and "+numTwo+" is = "+(numOne / numTwo));
        // Modulus Operation
        System.out.println("The Modulus of "+numOne+" and "+numTwo+" is = "+(numOne % numTwo));
    }
}
