package day13_customMethods;

public class WarmupTasks2 {
    public static void main(String[] args) {
        ageGroups(15);

    }



    public static void ageGroups(int age){

        if (age <= 21 ) {
            System.out.println("teenager");



        }else if (age >= 21 &&  age <= 55) {
            System.out.println("a");



        } else if (age >= 55 && age <= 100) {

        }System.out.println("senior");

        System.out.println("-------------------------------------------------");








    }
    }








/*   2. Create a method named ageGroup that can print the age group of the person
    age groups are:
    Teenager (< 21)
    Adult   (>=21 && <55 )
    Senior  ( > 55 )  */
