package day07;

public class LogicalOperator {
    public static void main(String[] args) {
        /*
        Write a program that can check if a person is eligible for a loan.
          Loan Requirements :
          1. Credit score must be 650 or greater
          2. Salary must be 40000 or greater
         */
        int salary = 75000;
        int creditScore =620;
         boolean isEligible = creditScore >= 650 && salary >= 40000;
         //                   false          &&        true


        System.out.println("isEligible =" + isEligible);
    }
}
