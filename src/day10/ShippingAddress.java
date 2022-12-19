package day10;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");

         String full_name =input.nextLine();/// CYDEO School + Enter

        System.out.println("Enter your building number");
       String   buildingNumber  = input.nextLine(); /// 7925A + Enter


        input.nextLine(); // to clear the scanner

        System.out.println("Enter your Street name");
        String StreetName = input.nextLine(); // jones Branch Dr + Enter

        System.out.println("Enter your city name ");
        String cityName = input.nextLine(); // Mclean + Enter


        System.out.println("Enter your stat name:");
        String StatName = input.nextLine();


        System.out.println("Enter your zip code ");

        String ZipCode = input.next();


        //// ----------------------------------------------

        System.out.println("Your shipping address is");
        System.out.println("\t" + full_name);
        System.out.println("\t" + buildingNumber + "" + StatName);
        System.out.println( "\t" + cityName +"," +StatName + "" + ZipCode);


        input.close();


















    }





}


/*









    Create a class named ShippingAddress and ask the user to:
       1.1 Enter your full name ( nextLine())
       1.2 Enter your building number ( next)
       1.3 Enter your Street name ( nextLine0)
       1.4 Enter your city name ( nextLine0 )
      1.5 Enter your state ( nextLine())
      1.6 Enter your zip code ( next)

        1.7 Display the shipping address
       Ex:

        Your shipping address is:
            John Smith
            7925 Jones Branch Dr
            McLean, VA 22012
 */
