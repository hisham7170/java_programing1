package day14_forLoop;

public class WarmupTasks {

    public static void main(String[] args) {

      String str3 =  combine("one","eight");

        System.out.println(str3);
        String S1 = "" + true; // "true
        String S2 = ""+ 'e';

        System.out.println("-----------------------------------------------------------------------------");



    }
    public static String combine(String str1 ,String str2){
        String result;

        if (str1.endsWith("" + str2.charAt(0))){
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }


        return result;

    }


}

/*
Task1:

    •Create a method named combine that can take two string and hen add them together and returns it.
    But if the last letter of the first word and the first letter of the last letter are the same,
    return• that character once.
    combine("one", "eight") - ==>-one eight

    -Task • 2:
.1.
     •create a method that can find the sum of two integer numbers
     - method •name: - sumOf2Numbers

 2. create a method that can find the sum of three integer numbers
    - method •name: • sum0f3Numbers

3. create a method that can find the sum of four integer numbers
   - method name: sumOf4Numbers
 */