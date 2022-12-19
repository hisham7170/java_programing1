package day07;

public class ifStatements {
    public static void main(String[] args) {

        char grade = 'B';
        String result = "";
        if (grade == 'A') {
            result = "Excellent";

        }

        if (grade == 'B') ;
        result = "Great job";



        if (grade == 'c'){
            result = "Good";

            if (grade == 'D');
               result = "passed";


               if (grade == 'F');
                  result = "Failed";
    }


        System.out.println(result);


    }



}

/*



Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
 'A': Excellent
 'B': Great job
 'C': Good
   'D': Passed
'  F': Failed
 */
