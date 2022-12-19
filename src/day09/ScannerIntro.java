package day09;

import java.util.Scanner;

 // import java.util.*


public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        byte num1 = input.nextByte();


        System.out.println("Enter your second number");
        short num2 = input.nextShort();


        System.out.println("Enter your third number ");
        int num3 = input.nextInt();

        System.out.println("Enter your fourth number");
        long num4 = input.nextLong();


        input.close();/// scanner is closed can not red user inputs again

        System.out.println("first number :" +num1);
        System.out.println("second number:" + num2) ;
        System.out.println("third number:"  +num3);
        System.out.println("fourth number"  +num4);


    }






    }

