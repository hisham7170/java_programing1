public class SwapVariblesReview {

    public static void main(String[] args) {
        /// with a temporary variable

        int x = 100;
        int y = x;
        int z = x; /// z = 100 used for containing the Original value of x

        x = y; // 200, x will have the value of y , x will no longer have the Original value
        y = z ;



        x= y;//// x = y /// x = 200
         y = x ;

        System.out.println("x = " + x); // 200
        System.out.println("y = " + y);/// 100


        System.out.println("--------------------------------------------");

        ///// without temporary variable


        int a = 10;
        int b = 20;

        a = a+ b; /// a = 30 // a is now equal to the sum of Originale values of a & b
        b = a - b; // = 10 from the sum
        a = a - b;
    }




}
