
// Challenge
// Create a program to calculate compound interest formula (p*(1+r/100)*t)



import java.lang.*;
import java.util.Scanner;

public class challenge_13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Principle =" + " ");
        double a = input.nextDouble();
        System.out.print("Rate =" +" ");
        double b = input.nextDouble();
         System.out.print("Time =" +" ");
        double c = input.nextDouble();
        
System.out.println("The compond Interest is " + " "+ (a*(1+b/100)*c));
       
        
        
    }
}


