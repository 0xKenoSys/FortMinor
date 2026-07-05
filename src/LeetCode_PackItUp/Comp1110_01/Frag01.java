package LeetCode_PackItUp.Comp1110_01;

import java.util.Scanner;   //At first, I neglected this line /*util stands for utility*/

public class Frag01 {   /*Define a Class*/
    public static void main(String[] args){     /*The beginning of the process*/
        System.out.println("Turn back to the places you've been.");
        int i = 1;
        System.out.println("The value of i is " + i + ".");

        Scanner scan = new Scanner(System.in);  //I mistakenly named the scanner as "scam", probably because of the muscle memory of "system"
        System.out.println("To reassign i, type integer and press enter:");
        i = scan.nextInt(); //程序运行到这里，输入了一个数字和一个回车符，这一行拿走了数字就不管了。后来scan.nextLine()遇到回车符就终止了。
        System.out.println("Now the value of i is " + i + ".");

        scan.nextLine();    //清理回车符

        System.out.println("Type something and press enter:");
        String s = scan.nextLine();     //The process ends when I rewrite "String s = scan.next();" as "String s = scan.nextLine();". Why?因为读取了上一行的回车符。
        System.out.println(s);
    }
}
