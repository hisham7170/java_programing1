package day16_nestedloop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username ");
        String u = input.next();

        System.out.println("Enter your password ");
        String p = input.next();

        if (u.equals("Cydeo ") && p.equals("WoodenSpoon")) {
            System.out.println("Logged");
        }else { // otherwise

            for (int i = 0; i < 3; i++){ // i :

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username ");
                u = input.next();
                System.out.println("Enter your password ");
                p = input.next();

                if (u.equals("Cydeo ") && p.equals("WoodenSpoon")){ // if thr user enter valid credentials
                    System.out.println("you are now logged in "); // exits the long
                    break;
                }
            }

            if ( !(u.equals("Cydeo ") && p.equals("WoodenSpoon"))) {
                System.out.println("you account now is locked , please contact the support team ");

            }

        }


    }
}
/*



1. -Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
•username: • Cydeo
password: •WoodenSpoon
• Ask• the •user• to enter •their credentials.•
If credentials are matched, your program should print "Logged in.
11
• If• the credentials are not • matched, • the program should allow
•the user • to • have • three attempts • to enter. cor t credentials ....if all three attempts are failed, then print "Your account is • lucked.
 */