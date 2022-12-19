package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -21748977;//35

        for (int i = 0; i <5;){
            System.out.println("Enter a number ");
            int num = input.nextInt(); // -25 ,35, 15 , 40 ,0

            if (num > max ){
                   max = num;
            }
        }

        System.out.println("Maximum number  = "+ max);

    }
}
