public class MyOperators {
    public static void main(String[]args) {

        // Arithmetic Operators
        // employee, wage, hours worked, overtime, everything

      /*  int regHours, overtimeHours;
        double regPay, overtimePay, total;
        float wage;
        double regularWithOvertime;

        regHours = 40;
        overtimeHours = 5;
        wage = 25.50F;
        regPay = wage * regHours;
        overtimePay = (wage * 1.5) * overtimeHours;
        total = regPay + overtimePay;
        regularWithOvertime = total / (regHours + overtimeHours);

        System.out.println("Regular Pay: $" +regPay+ " dollars.");
        System.out.println("Overtime Pay: $" +overtimePay+ " dollars.");
        System.out.println("Total Pay: $" +total+ " dollars.");
        System.out.println("Hourly Rate with Overtime: " +regularWithOvertime+ " dollars.");
        System.out.print("Hourly Rate with Overtime: ");
        System.out.printf("%.2f", regularWithOvertime);*/

        int number1 = 2577, number2 = 2, number3 = number1 % number2;

        if (number3 == 0) {
            System.out.println(number1 + " is an even number!");

        } else {
            System.out.println(number1 + " is an odd number!");

        }

        //shopping
//        double tax=.10, priceOfItem=100, taxOnItem=priceOfItem*tax, totalPrice=priceOfItem+taxOnItem;
//
//        System.out.println("Price of Item $" +priceOfItem+ " dollars");
//        System.out.println("Tax $" +taxOnItem+ " dollars");
//        System.out.println("Total $" +totalPrice+ " dollars");
        double priceOfItem= 100;
        priceOfItem*=1.10;

        System.out.println("The total is $" +priceOfItem+ " dollars");
        System.out.print("The total is " );
        System.out.printf("$%.2f", priceOfItem);
        System.out.print(" dollars" );



    }
}
