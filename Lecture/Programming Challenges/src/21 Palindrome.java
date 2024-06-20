import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        if(isPalindrome(num)){
            System.out.print("Yes, "+num+"is a Palindrome Number");
        } else{
            System.out.print("No, "+num+"is not a Palindrome Number");
        }
    }
    private static boolean isPalindrome(int num) {
        int copyNumber = num;
        int reverseNum = 0;
        while (copyNumber > 0) {
            int rem = copyNumber % 10;
            reverseNum = reverseNum * 10 + rem;
            copyNumber /= 10;
        }
        return reverseNum == num;
    }
}
