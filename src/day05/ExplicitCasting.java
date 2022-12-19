package day05;

public class ExplicitCasting {
    public static void main(String[] args) {
        /*
        primitives:
          byte < short < int < long < < float < double
         */
        long x = 1000;

        int y = (int)x;
         double a = 10.5;
         int b = (int) a;
        System.out.println(b);
    }
}
