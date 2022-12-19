package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int [5];

        int[] nums = {10, 20, 30, 40, 50};

        System.out.println (numbers.length);

        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("nUms = " + Arrays. toString (nums) );

        System.out.println("------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = 1;
        System.out.println( days [n-1] );

        System.out.println("----------------------------------------------------------");

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "JUl", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("month = " + Arrays. toString (month) );

        System.out.println("--------------------------------------------------------------------");

        int[] numbers2 ={ 41, 2, 3, 4, 5, 6, 7,3};









    }
}
