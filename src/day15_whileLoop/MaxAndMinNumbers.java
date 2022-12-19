package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -21344565;
        int min= -1234543234;

        for (int i = 0 ; i < 5; i ++){
            System.out.println("enter a number ");
            int num = input.nextInt();
            if (num > max ){
                max = num ;

            }
            if (num < min ){
                min =num;
            }
        }

        System.out.println("maximum number is :"+ max );
        System.out.println("minimum number is :"+ min);

    }
}

