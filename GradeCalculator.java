import java.util.Scanner;

public
class GradeCalculator {
         public static void main(String args[]) {

             int total=0,average;
            Scanner sc = new Scanner(System.in);
             System.out.println("Enter the number of subjects");
             int num=sc.nextInt ();
             int markArr[] = new int[num];
            System.out.println("Enter the marks for all subjects");
             for(int i=0; i < num; i++){
                 markArr[i] = sc.nextInt();
                 total = total + markArr[i];
             }

             average = total/num;

             char grade;

            if(average>=80){
                grade = 'A';
            }else if(average>=60 && average<80){
                grade = 'B';
            }
            else if(average>=40 && average<60){
                grade = 'C';
            }
            else {
                grade = 'D';
            }

            switch(grade) {
                case 'A' :
                    System.out.println("Excellent!");
                    break;
                case 'B' :
                    System.out.println("Very Good!");
                    break;
                case 'C' :
                    System.out.println("Well done");
                    break;
                case 'D' :
                    System.out.println("You have passed");
                case 'F' :
                    System.out.println("Please study and try again");
                    break;
                default :
                    System.out.println("Invalid grade");
            }
             System.out.println("Student's total marks is "+total+" out of "+100*num);
             System.out.println("Student's Average is "+average);
             System.out.println("Student's Grade is "+grade);
        }
    }
