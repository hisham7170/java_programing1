package day06;

public class RelationalOperatorsTst4 {
    public static void main(String[] args) {
       double salary = 60000;
       int creditScore = 650;
       int age = 25;


       boolean eligbleForlone = salary >= 30000 && creditScore >= 650 && age >= 18;
//
        System.out.println(eligbleForlone);

        System.out.println("------------------------------------------------------");
        String answer = "maybe ";

        boolean validAnswer = answer == " yes " || answer == "no";

        System.out.println(validAnswer);


        System.out.println("------------------------------------------------------");
        char grade = 'B';

        boolean passedExam = grade == 'A' || grade == 'B' || grade == 'C'|| grade == 'D';
        System.out.println(passedExam);



        System.out.println("true");

        String a = "yes";
        boolean yes = a == "yes";
        boolean no  = !yes;


        System.out.println("yes="+ yes);
        System.out.println("no ="+ no );

        System.out.println("------------------------------------------------------");
         int score = 65;
         boolean passed = score >= 60;
          boolean failed = !passed;


        System.out.println("passed =" +passed);
        System.out.println("failed =" + failed);

        System.out.println("------------------------------------------------------");
        System.out.println( true == !false && false == !true && true != !true);
    }
}
