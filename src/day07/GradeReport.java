package day07;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85; // 0 ~ 100

        String result = "Your grade is";

        if (score >=90) {
            result += "A";
        }else if (score >=  80 &&  score< 90 ){
                result += "B";

        }else if (score >= 70 && score < 80){
            result += "c";

        }else if (score >= 60 && score < 70){
            result += "D";
        }else {
            result += "F";

        }

        System.out.println(result);


    }
}
