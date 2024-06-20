import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<myArray.length;i++){
            myArray[i]= input.nextInt();
        }
        for (int j : myArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print("Please enter the number you want to search : ");
        int search = input.nextInt();
        // searching
        int index = searching(myArray,search);
        if(index == -1){
            System.out.print("Element is not present in the array");
        } else{
            System.out.print("Element is present at index of "+index);
        }
    }
    public static int searching(int [] array,int search){
        for(int i=0;i<array.length;i++){
            if(search == array[i]){
                return i;
            }
        }
        return -1;
    }
}