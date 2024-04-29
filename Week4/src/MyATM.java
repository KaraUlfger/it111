public class MyATM {
    public static void main(String[] args) {
        int withdrawl= 25, amount= 200;
        while( amount != 0) {
            amount -= withdrawl;
            //amount= amount-withdrawl;
//            System.out.println("Your current amount is $" +amount+ " Dollars");
            if(amount==0) {
                System.out.println("Out of Money");

            }else{
                System.out.println("Your current amount is $" +amount+ " Dollars");
            }
        } //end while loop
    }
}
