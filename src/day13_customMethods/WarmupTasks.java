package day13_customMethods;

public class WarmupTasks {

    public static void main(String[] args) {
        calculate(200 , 5 , '*');

        calculate(200,5,'+');

        calculate(7,8, '/');







    }

    public static void calculate(double num1, double num2, char mathOperator){

        double result = 0;

        switch (mathOperator){

            case '+': result = num1 + num2;
                System.out.println(num1 + " " +mathOperator+ " " + num2 + " = " + (num1 + num2));
                break;



            case '-':
                System.out.println(num1 + " " +mathOperator+ " " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " " +mathOperator+ " " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " " +mathOperator+ " " + num2 + " = " + (num1  / num2));
                break;

            default:
                System.out.println("invalid operator "+mathOperator );








        }

    }

    }


/*
1. Create a method named calculate that can take three arguments:
     num1 (double)
     num2 (double)
     math0operator (char)
The method should display the calculation result of those two numbers as long as the 3rd argument

        EX;
        calculate(10, 20, '+')
       output:
       10 + 20 = 30

 */