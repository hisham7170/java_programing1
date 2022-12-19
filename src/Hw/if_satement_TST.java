package Hw;

class if_statement_TST {
    public static void main(String[] args) {


        int number = 14 ;
        if (number <= 15){
            System.out.println( "Good");
        }else {
            System.out.println("Bad");
        }
        System.out.println("----------------------------------------");

        char score = 'A';
        if (score == 'A'){
            System.out.println("Excellent");
            } else if (score == 'B') {
            System.out.println("good");


        } else if (score == 'C') {
            System.out.println("pass");


        }else{
            System.out.println("filed");

    }


        System.out.println("---------------------------------");

        int grade = 90;
        if (grade >= 85){
            System.out.println("pig poos ");

        } else if (grade <= 80 ) {
            System.out.println("Good");

        } else if (grade <= 60) {
            System.out.println("not bad ");


        }else {
            System.out.println("keep going ");
        }



        System.out.println("--------------------------------------------------");


        int g = 5;
        String School = "kk";

        if (g == 7 && School == "hisham"  ) {
            System.out.println("lest go ");


        } else if (g == 8 && School == " asma") {
            System.out.println("lets go");
        }

     else if (g == 5 && School == "KK"){
                System.out.println("not going ");

            } else if (g == 8 && School == " hmadi") {
            System.out.println("coming with you");

    }else{
            System.out.println("not valid");
        }


    }

        }


