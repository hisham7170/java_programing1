package day04;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        /// ------Implicit Casting-------///

        byte a = 15;

        short b =(short) a;
        // short = b = (short)a;

        System.out.println(b);

        int c = a; ///// implicit casting.

        long d =  (long)3000l;

        float f = d; ///  implicit casting.


        /// ------Explicit Casting-------///

        int x = 1000;

        byte y = (byte)x;

        float z = 20.8f;


        short q = (short)z;

        System.out.println(q);

        double h1 = 2.5;

        short h = (short) h1;
        System.out.println(h);

    }





}
