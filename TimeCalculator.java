
import java.util.Scanner;
public class TimeCalculator {

public static void main(String[] args){
    double noOfMinutes;
    long noOfYears;
    int noOfDays;
    System.out.println ( "Please enter the Number Of Minutes" );
    Scanner s=new Scanner(System.in);
    noOfMinutes=s.nextDouble();
    noOfYears=(long)noOfMinutes/(24*60*365);
    noOfDays=(int)noOfMinutes/24/60%365;
    System.out.println ( "This time is equivalent to "+ noOfYears+" years and "+noOfDays+" days");

}
}
