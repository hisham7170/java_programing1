package day12_CustomMethods;

public class FormatFullName {
    public static void main(String[] args) {


        String first = "CyDEO";
        String last = "SCHOOL";

      first   =  first.substring(0, 1).toUpperCase();
               //"c"
     last  = last.substring(0, 1).toUpperCase() +last.substring(1).toLowerCase();



        System.out.println(first);
        System.out.println(last);
    }

}

/*
Write a program that asks user to enter first and last names, and then prints
regular format (first character in upper case)
input:
firstName "CyDEO"

lastName = "SCHOOL"input:

lastName = "SCHOOL"
 */

