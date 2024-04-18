public class MyOperators2 {
    public static void main(String[]args){
        //boolean operators

//        boolean tuna = true;
//        boolean bread = true;
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }
        boolean tuna = false;
        boolean bread = false;
        if(tuna == true || bread == true) {
            System.out.println("We are having a some food");
        } else {
            System.out.println("We are not eating ;-;");
        }

        // drinking age

        int age=18;
        if(age >= 18) {
            System.out.println("We are having an alcohol!");
        } else {
            System.out.println("We are having a soda...");
        }

        // roller coaster ride

        float height=4f;
        if(height <4) {
            System.out.println("We can not ride the roller coaster...sad.");
        } else {
            System.out.println("We can ride, yay!");
        }

    }
}
