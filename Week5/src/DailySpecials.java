import java.util.Scanner;

public class DailySpecials {
    public static void main(String[] args) {

        String specials;
        Scanner input= new Scanner(System.in);
        Scanner total=new Scanner(System.in);

        System.out.println("Please enter a day excluding weekends! (Monday-Friday Only!)");

        specials=input.next();

        String coffee;
        double price;
        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");
        int totalCoffee=0;

        if(saturday||sunday) {
            System.out.println("Please enter a weekday and not a weekend day!");
            specials=input.next();
        }

        switch(specials) {
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price is $" + price);
                System.out.println("How many " + coffee + "s would you like?");
                totalCoffee = total.nextInt();
                System.out.println(totalCoffee + " " + coffee + "s have been ordered, and the total is ");
                System.out.print("$");
                System.out.printf("%.2f", totalCoffee * price);
                System.out.print(" dollars!");
                break;
            case "Tuesday":
                coffee= "Americano";
                price=2.95;
                System.out.println(specials+"'s coffee of the day is a "+coffee+ " and the price is $"+price);
                totalCoffee = total.nextInt();
                System.out.println(totalCoffee + " " + coffee + "s have been ordered, and the total is ");
                System.out.print("$");
                System.out.printf("%.2f", totalCoffee * price);
                System.out.print(" dollars!");
                break;
            case "Wednesday":
                coffee= "Frappe";
                price=5.95;
                System.out.println(specials+"'s coffee of the day is a "+coffee+ " and the price is $"+price);
                totalCoffee = total.nextInt();
                System.out.println(totalCoffee + " " + coffee + "s have been ordered, and the total is ");
                System.out.print("$");
                System.out.printf("%.2f", totalCoffee * price);
                System.out.print(" dollars!");
                break;
            case "Thursday":
                coffee= "Drip";
                price=1.95;
                System.out.println(specials+"'s coffee of the day is a "+coffee+ " and the price is $"+price);
                totalCoffee = total.nextInt();
                System.out.println(totalCoffee + " " + coffee + "s have been ordered, and the total is ");
                System.out.print("$");
                System.out.printf("%.2f", totalCoffee * price);
                System.out.print(" dollars!");
                break;
            case "Friday":
                coffee= "Iced Mocha";
                price=3.95;
                System.out.println(specials+"'s coffee of the day is a "+coffee+ " and the price is $"+price);
                totalCoffee = total.nextInt();
                System.out.println(totalCoffee + " " + coffee + "s have been ordered, and the total is ");
                System.out.print("$");
                System.out.printf("%.2f", totalCoffee * price);
                System.out.print(" dollars!");
                break;

//            default:
//                System.out.println("Please enter a valid day or check spelling.");
        }
        input.close();
        total.close();
    }
}
