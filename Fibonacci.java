import java.util.Scanner;

public
class Fibonacci {
    public static void main(String[] args){

        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please insert any value of n upto which fibonacci series has to be displayed");
        n = sc.nextInt ( );
        int a=0,b=1,c;
        System.out.println ("Fibonacci Series upto "+n+" is :");
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
