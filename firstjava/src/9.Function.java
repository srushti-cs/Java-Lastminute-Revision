import java.util.Scanner;

class Function {
     static void main(String[] args) {
         System.out.println("Welcome to Calculator:");
         Scanner input = new Scanner(System.in);
         System.out.println("ENTER NUM1: " );
         int num1 = input.nextInt();
         System.out.println("ENTER NUM2: " );
         int num2 = input.nextInt();
         System.out.println("Enter the number of time you have to do operation: ");
         int n= input.nextInt();
         while(n!=0) {
             System.out.println("Enter your choice, which operation you have to perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
             int choice = input.nextInt();
             switch (choice) {
                 case 1:
                     System.out.println(Addition(num1, num2));
                     break;

                 case 2:
                     System.out.println(Subtraction(num1, num2));
                     break;

                 case 3:
                     System.out.println(MUltiplication(num1, num2));
                     break;

                 case 4:

                     System.out.println(Division(num1,num2));
                     break;

                 default:
                     System.out.println("Invlaid Choice...");
             }
             n--;
         }

     }
     public static int Addition(int num1,int num2)
     {
         int sum = num1+num2;
         System.out.println("The addition is: ");
         return sum;
     }
     public static int Subtraction(int num1,int num2)
     {
         int sub = num1-num2;
         System.out.println("The subtraction is: ");
         return sub;
     }
     public static int MUltiplication(int num1, int num2)
    {
        int mul = num1*num2;
        System.out.println("The multiplication is: ");
        return mul;
    }
    public static float Division(int num1, int num2)
    {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter two numbers you want to delete: ");
//        int a = sc.nextInt();
//        int b= sc.nextInt();;
        if(num2!=0)
        {
            float div = (float)num1/num2;
            System.out.println("The division is: ");
            return div;
        }
        else
        {
            System.out.println("it cannot be delete invalid choice");
            return 0;
        }
    }
}
