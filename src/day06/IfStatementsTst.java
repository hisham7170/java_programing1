package day06;

public class IfStatementsTst {

    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number  % 2 == 0; /// when we divide a number by 2 if the remainder is 0 , means number is even

        boolean isOdd = isEven; // if the number is not Even , then it's Odd


        System.out.println(number + " is an Even number " + isEven);

        System.out.println(number +"is  an Odd  number" + isOdd);

    }























        /*

    Warmup task:
1. Create a class named Odd0rEven, and write a program that can-identify-if-the-qiven-number-is-odd-or-even
         -EX:
        Number = 20

        output:
     20- is an •even • number: • true
      20- is an • odd •number: • false

Hint: even numbers are the • numbers• that are evenly divisible by 2• (remainder is zero)

         */



}
