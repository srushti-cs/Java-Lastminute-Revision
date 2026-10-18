import java.util.Scanner;

class Largestnumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter two numbers:");
         System.out.println("NUmber 1: ");
         int num1 = input.nextInt();
         System.out.println("Number 2: ");
         int num2 = input.nextInt();
         if(num1>num2)
         {
             System.out.println(num1+ "is largest number.");
         }
         else if(num2>num1)

         {
             System.out.println(num2 + " is largest number.");
         }
         else
         {
             System.out.println("Both are equal number.");
         }
     }
}
