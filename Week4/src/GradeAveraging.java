import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[]args){
        //ask end user to input their numerical grades
        int counter=1;
        int grade;
        double total=0;
        double average;

        Scanner input= new Scanner(System.in);

        // while loop to count how many times end user is asked to input grades
        while(counter<=5){
            System.out.println("Please enter your " +counter+ " numerical grade.");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } // close while loop

        String message;
        char letterGrade;

        counter-= 1;
        average= total/counter;
        System.out.println("You have earned at average grade of " +average);

        if(average >= 90 && average <= 100){
            letterGrade = 'A';
            message= "Excellent work!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message= "Solid work!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message= "Study More!!";
        } else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message= "Squeaking by!";
        }else {
            letterGrade = 'F';
            message = "Failed...";
        }
        System.out.println("You have earned a letter grade of " +letterGrade+ " and the message is " +message);

    }
}
