import java.util.Scanner;

class Armstrong {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter the number: ");
         int n = input.nextInt();
         int num =n;
         int digit=0;
         int sum=0;

         while(num!=0)
         {
             digit =num%10;
             sum= sum +((digit)*(digit)*(digit));
             num = num/10;
         }
         if(n==sum)
         {
             System.out.println("it is an armstrong number");
         }
         else {
             System.out.println("it is not an armstrong number");
         }
     }
}
