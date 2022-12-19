package day12_CustomMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {





    }

    //// create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)
    public static void maxNum(double num1, double num2){
        if (num1 >num2){
            System.out.println(num1 + " is the maximum number ");
        } else if (num2 > num1) {
            System.out.println(num2 + "is the maximum number ");

        }else{
            System.out.println("Equal");
        }

    }
    ////Create a method that can display the initials of a person //(firstName, LastName)l
}
