import java.util.Scanner;

class Fibonacci {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TERM:");
        int a=0;
        int b=1;
        int sum =0;
        int n = input.nextInt();
        //System.out.print(a+" ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            sum = a + b;
            //System.out.print(sum+" ");
            a=b;
            b=sum;



        }
    }
}
