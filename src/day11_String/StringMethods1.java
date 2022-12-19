package day11_String;

import java.util.Locale;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "java programming";

        str1.toLowerCase(); /// "cydeo school"

        System.out.println(str1);

        ///========================================================


        String str2 = " java programming";

      str2 =  str2.toUpperCase(); /// java programming

        System.out.println(str2);


        ///=================================================

        String word = "wooden Spoon";

        word.toUpperCase(); ///  'WOODEN SPOON '

        word.toLowerCase();
        System.out.println(word); /// wooden Spoon

        //===========================================================

        String str4 =  "         Cydeo school";

        str4 = str4.trim();//Cydeo school

        System.out.println(str4);

         ///====================================================

        String sentence1 = " Today is sunday and we java class";

       int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        String s1 = " i love java programming ";

    int firstA  =  s1.indexOf('a');

    int secondA = s1.indexOf("a");

    String s2 = " java python  javaScript python";
    int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf('a');

        System.out.println(a2);

        int a3 = s2.indexOf("av");




    }
}
