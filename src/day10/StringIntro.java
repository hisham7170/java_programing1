package day10;

import java.util.Scanner;
import java.lang.String;

public class StringIntro {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String str = "java";

        System.out.println();

        input.close();

        System.out.println("------------------------------------------");


        String s1 = "cat";

        String s2 = " dog";

        String s3 = "cat";
        String s4 = "cat";

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("--------------------------------------");

        String str1 = new String( "java");// Creates two objects: 1. String pool, 2. in heap (outside string)

        String str2 = new String("java");

        System.out.println(str1 == str2);

        System.out.println("------------------------------------------------------");

        String t1 = "python";
        String t2 = new String("python");
        String t3 = new String("python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);


        System.out.println(t1 == t2 );
        System.out.println(t3 == t2);





    }

}
