package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //If an integer is positive print “The integer is positive” otherwise print “The integer is not positive”

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer...");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        //2.way: Ternary
        // 1. condition 2. question mark ? 3. happy positive result 4. colon : 5. result for negative

        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println(result);


        int num1 = 1;
        int num2 = 1;

        int min = num1 < num2 ? num1  : num2;
        System.out.println(min);


    }
}