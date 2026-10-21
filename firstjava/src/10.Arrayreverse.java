import java.util.Arrays;
import java.util.Scanner;

class Arrayreverse {
    static void main(String[] args) {
        System.out.println("enter the size of array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in array: ");
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }

        System.out.println("Original arrray: "+ Arrays.toString(arr));
        reverse(arr);
    }
    public static void reverse(int[] arr)
    {
        int right = 0;
        int left = arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            while(right<left){
            int temp = arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            right++;
            left--;}

        }
        System.out.println("Reverse Array: "+ Arrays.toString(arr));
    }
}
