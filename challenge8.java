
// Challenge
// Create a program that takes two numbers and show result of arithematic operators +,-,*,/,%

import java.lang.*;
import java.util.Scanner;

public class performArithematicOperations{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number a =" + " ");
        int a = input.nextInt();
        System.out.print("Enter a number b =" +" ");
        int b = input.nextInt();
        
        System.out.println("a+b =" +  " "+ (a+b));
        System.out.println("a-b =" +  " "+ (a-b));
        System.out.println("a X b =" +  " "+ (a*b));
        System.out.println("a/b =" +  " "+ (a/b));
        System.out.println("a%b =" +  " "+ (a%b));
    }
}
