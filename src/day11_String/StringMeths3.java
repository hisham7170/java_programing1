package day11_String;

public class StringMeths3 {

    public static void main(String[] args) {

        String word = " java ";

     boolean r1 =   word.isEmpty();

        System.out.println(r1);

        //============================================

        String str = "     ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();


        System.out.println("r2 = "+ r2);

        System.out.println("r3 = "+ r3);

    }
}
