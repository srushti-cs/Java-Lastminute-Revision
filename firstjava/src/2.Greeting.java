import java.sql.SQLOutput;
import java.util.Scanner;

class Greeting {
     static void main(String[] args) {
         System.out.println("Enter your name : ");
         Scanner input = new Scanner(System.in);
         String name = input.nextLine();
         System.out.println("Welcome to coding world " + name);
     }
}
