package day18_garbageCollection;

public class Pizza {
    public char size;
    public int number0fCheeseTopping, number0fPepperoniTopping;


    public double calcCost () {
        double totalPrice = 0;
        switch (size){
            case 'S':
            case 's':
                totalPrice =10 +2 *(number0fCheeseTopping + number0fCheeseTopping);
                break;
            case 'M':
            case 'm':
                totalPrice =12 +2 *(number0fCheeseTopping + number0fCheeseTopping);
                break;
            case 'L':
            case 'l':
                totalPrice =14 +2 *(number0fCheeseTopping + number0fCheeseTopping);
                break;

            default:
                System.out.println("invalid size "+size);

        }


        return totalPrice;

    }

    }


/*
Create a class named Pizza:
Attributes:
  1. size
  2. number0fCheeseTopping
   3. number0fPepperoniTopping

   Actions:


calcCost): returns the total cost of the pizza
toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost a

   Pizza cost is determined by:
   S: $10 + $2 per topping
   M: $12 + $2 per topping
   L: $14 + $2 per topping
 */