import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        int firstNum = readNumber();
        int secondNum = readNumber();
        int gcd = GCDOfTwoNumbers(firstNum,secondNum);
        System.out.print("GCD of "+firstNum+" and "+secondNum+ " is = "+gcd);
    }
    private static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        return input.nextInt();
    }
    private static int GCDOfTwoNumbers(int first,int second){
        int small = Math.min(first, second);
        for(int i = small;i>1;i--){
            if(first % i ==0 && second % i ==0){
                return i;
            }
        }
        return 1;
    }
}

