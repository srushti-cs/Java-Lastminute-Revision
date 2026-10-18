import java.util.Scanner;

class EvenOdd {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int num = input.nextInt();
         if(num%2==0)
         {
             System.out.println("It is an even number.");
         }
         else
         {
             System.out.println("It is an odd number.");
         }
     }
}
