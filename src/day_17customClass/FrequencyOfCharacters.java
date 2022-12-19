package day_17customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "aabcood";

        String result = ""; //a2b1c3d1
                          // a b c d
                         /// 2 1 3 1

        char ch = str. charAt (0); //a
        int count = 0;
        for (int i = 0; i < str. length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println( ch + " :"+ count) ;

    }
}
/*
2. Write a program that can find the frequency of the characters from a string
Ex:
   str = "aabcood";
    output:
     a261c3d1 hisham
 */

