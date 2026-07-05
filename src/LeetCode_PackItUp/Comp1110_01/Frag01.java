package LeetCode_PackItUp.Comp1110_01;

import java.util.Scanner;   //At first, I neglected this line

public class Frag01 {
    public static void main(String[] args){
        System.out.println("Turn back to the places you've been.");
        int i = 1;
        System.out.println("The value of i is " + i + ".");

        Scanner scan = new Scanner(System.in);  //I mistakenly named the scanner as "scam", probably because of the muscle memory of "system"
        System.out.println("To reassign i, type integer and press enter:");
        i = scan.nextInt();
        System.out.println("Now the value of i is " + i + ".");

        System.out.println("Type something and press enter:");
        String s = scan.next();
        System.out.println(s);
    }
}
