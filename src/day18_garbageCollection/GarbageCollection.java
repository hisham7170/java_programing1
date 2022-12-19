package day18_garbageCollection;

public class GarbageCollection {
    public static void main(String[] args) {
        String s1 ="java";
          s1= null;// "Java" will be eligible for garbage collection

        System.out.println(s1);

       //  System.out.printing(s1. toUpperCase ());

   ///     System.out.println(s1.replace(null,"python"));

        String a = "";
        String b = null;

        System.out.println("-----------------------------------------------");

        String str1 = "Python";
        str1 = "SVDEQ" ;
        System.out.println(str1);


        System.out.println("--------------------------------------------------------");


    }
}
