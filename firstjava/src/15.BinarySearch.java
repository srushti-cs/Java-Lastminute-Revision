import java.util.Scanner;

class BinarySearch {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter the size of array: ");
         int size = input.nextInt();
         int[] arr = new int[size];
         System.out.println("enter only sorted elements in the array: ");
         for(int i=0;i< arr.length;i++)
         {
             arr[i]= input.nextInt();
         }
         System.out.println("enter the target element you want to search: ");
         int target = input.nextInt();
         int ans= findNumber(arr,target);
         System.out.println(ans);

     }
     public static int findNumber(int[] arr,int target)
     {
         int start =0;
         int end= arr.length-1;
         int mid=0;
         while(start<=end)
         {
              mid = start + (end-start)/2;
             if(target==arr[mid])
             {
                 return mid;
//                 break;
             }
             else if (target>arr[mid])
             {
                 start = mid+1;
             }
             else {
                 end = mid-1;
             }
         }
         return -1;
     }
}
