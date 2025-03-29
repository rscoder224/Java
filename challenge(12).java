
// Challenge
// Create a program to calculate simple interest



import java.lang.*;
import java.util.Scanner;

public class challenge_12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Principle =" + " ");
        double a = input.nextDouble();
        System.out.print("Rate =" +" ");
        double b = input.nextDouble();
         System.out.print("Time =" +" ");
        double c = input.nextDouble();
        
        
System.out.println("The Simple Interst   is " +  " "+ (a*b*c)/100);
       
    }
}


