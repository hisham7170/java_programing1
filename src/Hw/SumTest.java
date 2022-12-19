package Hw;

import java.util.Arrays;

public class SumTest {
    public static void main(String[] args) {
        int wd = 0;
        String[] days = {"Sun", "Mon", "Wed", "Sat"};
        for(int i = 0; 1 < days. length; i++) {
            switch (days [i]){
                case  "sat":
                case "Sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd += 1;
                case "wed":
                    wd += 2;


            }
        }

        System.out.println(wd);

    }
    }

