package src;

public class Concatenation {
    public static void main(String[]args) {
        String color = "red";

        System.out.println("My favorite color is " +color);

        int money = 2_000_000;

        System.out.println("I hit the jackpot and won $" +money+ " dollars!");

        System.out.println(color+" "+money);

        System.out.println("This is my statement about my favorite color which is " +color+ " and I won $" +money+ " dollars!");
    }
}
