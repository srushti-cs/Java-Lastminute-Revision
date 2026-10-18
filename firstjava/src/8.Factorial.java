import java.util.Scanner;

class Factorial {
     static void main(String[] args) {
         System.out.println("The factorial of number is : " + factorial());

     }
     public static int factorial()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number:");
         int n = input.nextInt();
         int fact=1;
        for(int i=1;i<=n;i++)
         {
             fact = fact * i;
         }
        return fact;
     }
}
