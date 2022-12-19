package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup [0] = "Gulcin";

        myGroup [myGroup.length-1] = "Aseel";

        myGroup [2] ="Suneve";
        myGroup [1] = "Abidullah";
        myGroup [3] = "Khashavar";

        System.out.println(Arrays.toString(myGroup));

        myGroup [1] = "Kuzzat";
      ///  myGroup[5| = "Muhtar";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------------------------");

        for (int i = myGroup.length-1; 1 >= 0; i--){
            System.out.println(myGroup[i]);


        }





    }
}
