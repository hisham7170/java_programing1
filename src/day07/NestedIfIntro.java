package day07;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 98;

        if (score >= 0 && score <= 100) { //// if the score is valid


            if (score >= 60) { /// if the score is grater or equal to 10
                System.out.println("passed");
            } else {// if the score is less than 60
                System.out.println("Failed");

            }

        } else {// if the score not valid
            System.out.println("invalid Score");
        }


        System.out.println("-===========-=================================");

        int age = 28;


        if (age >= 21) {
            System.out.println("Eligible");

        } else {
            System.out.println("NOT Eligible");
        }

        System.out.println("-===========-=================================");









    }}























