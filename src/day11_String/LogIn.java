package day11_String;

import java.util.Scanner;
import java.util.UUID;

public class LogIn {

    public static void main(String[] args) {

        String correctUserName = "Cydeo";
        String  correctUserPassword ="WoodSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Username");
        String Username = input.nextLine();

        System.out.println("Enter your password");
        String password = input.nextLine();
        input.close();





        }




    }



/*
     class named Login
        2.1 Ask the user to enter the username & password
 2.2print *You are now Longed in If user entered valid username and password
         otherwise print the error message "Incorrect username or password.
       Please try again


        Note: Assume that the valid credentials'
         username: Cu-deg
       password: NodeSpoon
 */
