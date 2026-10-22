 class Twosum {
     static void main(String[] args) {
         int[] arr = {5, 3, 2, 7, 1,4};
         int target = 6;
         int[] result= twosum(arr,target);
         System.out.println(java.util.Arrays.toString(result));
//         System.out.println(twosum(arr,target));


            }
            public static int[] twosum(int[] arr,int target)
            {
                for (int i = 0; i < arr.length; i++) {
                    for (int j =i+1; j <= arr.length - 1; j++) {
                        int sum = arr[i] + arr[j];
                        if (sum == target) {
                            return new int[] {i,j} ;
//                            continue;
//                            break;
                        }
             }


         }
                return new int[]{-1,-1};
     }
 }
