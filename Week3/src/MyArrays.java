import java.util.Arrays;

public class MyArrays {
    public static void main(String[]args){

        //String car = "Volvo";

        String[] cars = new String[4];
        // some computer programs start counting at zero

        cars[0]= "Volkswagen";
        cars[1]= "Ford";
        cars[2]= "Toyota";
        cars[3]= "Honda";

        System.out.println(cars[0].toUpperCase());
        System.out.println(Arrays.toString(cars));

        //String[] books={"Doctor Sleep", "Lord of The Rings", "Legends and Lattes", "Tortall Series", "Dune"};
        String[] books=new String[5];
        books[0]= "Doctor Sleep";
        books[1]= "Lord of The Rings";
        books[2]= "Legends and lattes";
        books[3]= "Tortall Series";
        books[4]= "Dune";
        System.out.println(Arrays.toString(books));

        //build for each loop

        for(String book : books){
            System.out.println(book);
        }

        int[] numbers= new int[3];
        numbers[0]=20;
        numbers[1]=30;
        numbers[2]=50;

        System.out.println(Arrays.toString(numbers));

        for(int number : numbers){
            System.out.println(number);
        }

        String[] wines= new String[5];
        wines[0]= "Cabernet";
        wines[1]= "Merlot";
        wines[2]= "Syrah";
        wines[3]= "Port";
        wines[4]= "Cabernet-Frank";

        for(String wine : wines) {
            System.out.println(wine);
            System.out.println(wine.length());
        }
        for(String wine:wines){
            if(wine.equals("Port")) {
                break;
            }
            System.out.println(wine);
        }

    }
}
