import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String args[]) {
        int num;
        boolean isPrime = true;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please insert any number");
        num = sc.nextInt ( );
        for (int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println (num+" is prime number");
        }
        else {
            System.out.println (num+" is not a prime number");
        }
    }
}
