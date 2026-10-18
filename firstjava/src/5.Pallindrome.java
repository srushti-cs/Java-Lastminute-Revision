import java.util.Scanner;

class Pallindrome {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println(" Enter the number: ");
         int n = input.nextInt();
         int digit=0;
         int rev=0;
         int num=n;

         while(num!=0)
         {
             digit=num%10;
             rev =(rev*10)+digit;
             num = num/10;
         }
         if(n==rev)
         {
             System.out.println(" the number is pallindrome");
         }
         else {
             System.out.println("the number is not pallindrome");
         }
     }
}
