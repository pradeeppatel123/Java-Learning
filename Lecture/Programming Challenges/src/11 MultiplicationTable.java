import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        printTable();
    }
    public static void printTable(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number of table : ");
        int start = input.nextInt();
        System.out.print("Enter the last number of table : ");
        int last = input.nextInt();
        for(int i = start;i<=last;i++){
            System.out.println("The table of "+i+" is ");
            for(int j=1;j<=10;j++){
                System.out.print(i*j+"\t");
            }
            System.out.print("\n");
        }
    }
}
