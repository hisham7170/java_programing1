package day13_customMethods;

public class ReturnStatement {


    public static void main(String[] args) {



    }





    public static void eligible(int age ){
        if (age < 0 || age > 150){
            System.out.println("invalid age "+ age );
            return ; // exits the method
        }
            if (age >= 21 ){
                System.out.println("you aer eligible to buy alcohol ");
            }else {
                System.out.println("you are not eligible to buy alcohol ");
            }
    }


    public static int multiplication(int n1 , int n2 ){
        int result = n1 * n2;
        return result;

    }
}
