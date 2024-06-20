import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        int firstNum = readNumber();
        int secondNum = readNumber();
        int lcm = LCMOfTwoNumbers(firstNum,secondNum);
        System.out.print("LCM of "+firstNum+ " and "+secondNum+ " is = "+lcm);
    }
    private static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        return input.nextInt();
    }
    private static int LCMOfTwoNumbers(int first,int second){
        int ans = Math.max(first, second);
        while (ans % first != 0 || ans % second != 0) {
            ans++;
        }

        return ans;
    }
}
