import java.util.Scanner;

class Cieling {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Enter the target: ");
        int target = input.nextInt();
        int ans = Solution(arr, target);
        System.out.println(ans);

    }

    public static int Solution(int[] arr, int target) {

        int start =0;
        int end=arr.length-1;
//        int mid=0;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
           else  {
                return arr[mid];
            }
        }
            if (start < arr.length)
            {
                return arr[start];

            }
            else {
                return -1;
            }
//            return -1;



//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==target || arr[i]>target)
//            {
//                return arr[i];
//            }
//        }
//        int start = 0;
//        int end = arr.length - 1;
//        int mid = 0;
//        while (start <= end) {
//            mid = start + (end - start) / 2;
//            if (target == arr[mid]) {
//                return arr[mid];
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//                if (target == arr[mid] || target < arr[mid]) {
//                    return arr[mid];
//                }
//            }else if (target < arr[mid]) {
//
//                    end = mid - 1;
////                if(target==arr[mid] || target<arr[mid])
////                    return arr[mid];
//                }
//            }

//            return -1;

        }

    }


