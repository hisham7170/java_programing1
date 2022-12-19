package Hw;

public class switch_if_test {
    public static void main(String[] args) {

        char score = 'A';
        if (score == 'A') {
            System.out.println("Excellent");
        } else if (score == 'B') {
            System.out.println("good");


        } else if (score == 'C') {
            System.out.println("pass");


        } else {
            System.out.println("filed");

        }
        System.out.println("----------------------------------------");

        char sos = 'c';
        switch (sos){
            case 'A':
                System.out.println("Excellent");

        break;
            case 'b':
                System.out.println("good");
                break;
            case 'c':
                System.out.println("pass");
                break;
            default:
                System.out.println("not valid ");


        }


        System.out.println("--------------------------------------------");

        int cod = 900;

        switch (cod){
            case 200:
                System.out.println("ok");
                break;
            case 201:
                System.out.println("nice");
                break;
            case 202:
                System.out.println("fire");
                break;
            case 300:
                System.out.println("sure");
                break;
            case 500:
                System.out.println("no");
                break;
            default:
                System.out.println("yes");





        }






    }

}