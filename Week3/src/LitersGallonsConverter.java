public class LitersGallonsConverter {
    public static void main(String[] args) {
        double gal;
        int counter = 0;
        for (gal = 1; gal <= 100; gal = gal + 4) {
            double lit = gal * 3.785; // Convert gallons to liters
            System.out.printf("%.2f", lit);
            System.out.print(" Liters = ");
            if (gal == 1) {
                System.out.printf("%.2f", gal);
                System.out.println(" Gallon");
            } else {
                System.out.printf("%.2f", gal);
                System.out.println(" Gallons");
            }
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }

        } // end for loop
        System.out.println("We are done!");
    }
}