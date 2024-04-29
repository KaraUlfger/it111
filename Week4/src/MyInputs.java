import java.util.Scanner;

public class MyInputs {
    public static void main(String[] args) {
        String name, message;
        int age;
        double salary;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name, please!");
        name= myObj.next();
        System.out.println(name+ ", what is your age?");
        age=myObj.nextInt();
        System.out.println(name+ ", lastly what is your salary?");
        salary=myObj.nextDouble();

        if(salary < 50000){
            message = "Need a new job!";
        } else if (salary >=50000 && salary <60000) {
            message = "Not bad, hard to live in Seattle!";
        } else if (salary >=60000 && salary <70000) {
            message = "Getting Better";
        } else if (salary >=70000 && salary <80000) {
            message = "Almost livable in Seattle!";
        } else {
            message = "Life is Good!";
        }

        System.out.println("First Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
        System.out.println("Message: " +message);
    }
}
