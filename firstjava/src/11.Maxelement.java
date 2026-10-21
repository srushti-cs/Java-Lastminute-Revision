class Maxelement {
    static void main(String[] args) {
        int[] arr = {7,8,18,20,77,54,2,1};
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The maximum element: "+ max);
    }
}
