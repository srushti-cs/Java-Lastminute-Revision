import java.util.Scanner;

class Onlythreedigitarmstrong {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter the number: ");
         int n= input.nextInt();
         System.out.println(isarmstrong(n));
         for(int i=0;i<1000;i++)
         {
             if(isarmstrong(i))
             {
                 System.out.println(i+" ");

             }
         }
         System.out.println("This the only three digit numbers: ");
     }
     static boolean isarmstrong(int n)
     {
         int num=n;
         int sum=0;
         while(num>0)
         {
             int digit = num%10;
             sum = sum + digit*digit*digit;
             num = num/10;

         }
         return sum==n;
//         if(sum==n)
//         {
//             System.out.println(n +" it is an armstrong number ");
//         }
//         else {
//             System.out.println("it is not an armstrong number");
//         }
     }
}
