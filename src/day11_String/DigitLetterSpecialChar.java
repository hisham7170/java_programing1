package day11_String;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {



        String str = "";
if (str.length()>=1){

    char f = str.charAt(0);///  the first character of string

    if (f >= '0' && f <= '9'){
        System.out.println("first character is digit");

    } else if (f >= 'A'&& f <= 'Z') {
        System.out.println("the first character is uppercase letter");

    } else if ( f >= 'a' && f <= 'z') {
        System.out.println("the first character is lowercase letter");


    }else {
        System.out.println("the first character is special letter");
    }


}else {/// if string is empty
    System.out.println("String is empty");
}



    }
}
