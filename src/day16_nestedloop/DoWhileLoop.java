package day16_nestedloop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition = false;

        for (;condition;){
            System.out.println("Heloo Cydeo -- for loop");
        }

        System.out.println("------------------------------");
        while (condition){
            System.out.println("Heloo Cydeo --- while loop ");

        }

        System.out.println("----------------------------------------");
        do {
            System.out.println("Heloo Cydeo --- Do&While loop ");
        }while (condition);
    }

}
