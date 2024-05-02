import java.util.Scanner;

public class MyEnums {
    enum WhoWins {HOME, VISITOR, NEITHER}
    public static void main(String[]args){

        WhoWins who;
        int seahawks, broncos;

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the score for the Seahawks:");
        seahawks=input.nextInt();
        System.out.println("Please enter the score for the Broncos:");
        broncos=input.nextInt();

        if(seahawks>broncos) {
            who=WhoWins.HOME;
            System.out.println(who+ " team won!");
            System.out.print("Seahawks win by ");
            System.out.println(seahawks-broncos+ "points");
        }else if(seahawks<broncos) {
            who=WhoWins.VISITOR;
            System.out.println(who+ " team won!");
            System.out.print("Broncos win by ");
            System.out.println(broncos-seahawks+ "points");
        }else{
            who=WhoWins.NEITHER;
            System.out.println(who+ " team won...");
            System.out.println("Twas a draw");
        }

    }
}
