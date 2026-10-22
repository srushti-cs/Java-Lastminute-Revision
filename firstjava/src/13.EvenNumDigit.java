class EvenNumDigit {
    static void main(String[] args) {
        int[] arr = {12,345,2,6,7869};
        int ans = findNumbers(arr);
        System.out.println("Total numbers with even number of digits are: " + ans);

    }
    public static int findNumbers(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i];
            int digit=0;
            while(n>0)
            {
                digit++;
                n=n/10;
            }
            if(digit%2==0)
            {
                count++;
            }
        }
        return count;
    }
    }