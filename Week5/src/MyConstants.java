import java.util.Scanner;

public class MyConstants {
    public static void main(String[] args) {
        final int TOUCHDOWN=6;
        final int FIELDGOAL=3;
        final int CONVERSION=1;

        int td, fg, cn;
        //ask end user to enter the touchdowns, conversions, and fieldgoals

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of touchdowns!");
        td=input.nextInt()*TOUCHDOWN;
        System.out.println("Please enter the number of conversions!");
        cn=input.nextInt()*CONVERSION;
        System.out.println("Please enter the number of field goals!");
        fg=input.nextInt()*FIELDGOAL;

        System.out.println(td);
        System.out.println(cn);
        System.out.println(fg);
        System.out.print("Our total score is ");
        System.out.println(td + cn + fg);
    }
}
