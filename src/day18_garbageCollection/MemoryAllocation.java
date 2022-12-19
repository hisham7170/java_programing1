package day18_garbageCollection;

import day02.EmployeeInfo;

class car{
    public String brand;
    public String model;
    public String color;
    public int year;



}





public class MemoryAllocation {
    public static void main(String[] args) {
        int a = 100; // stack
        car car = new car();


        System.out.println("-----------------------------------");




    }

    public static void method1(){

        int b = 200;//stack


    }
    public static void method2(){

        String c = "hello world";
        //

        String d = new String("hello world");



    }
}
