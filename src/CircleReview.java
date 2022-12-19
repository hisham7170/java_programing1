import java.util.Scanner;

public class CircleReview {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double radius = 10;
        double area = radius * radius * 3.14;

        double perimeter = 2 *  radius * 3.14;

        System.out.println("area of the circle is " + area);
        System.out.println(" perimeter of the circle is " + Math.round(perimeter));

    }
}
