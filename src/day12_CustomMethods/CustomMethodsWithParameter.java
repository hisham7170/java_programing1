package day12_CustomMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(100);

        System.out.println("_________________________________");
        oddOrEven(10000);

    }
/// the method takes an argument number, and verifies if the number is odd number or even number
//2 usages

    public static void oddOrEven(int number){
        if (number % 2  ==0){
            System.out.println(number + "is even number ");
        }else{
            System.out.println(number + "is odd number ");
        }

    }

}
