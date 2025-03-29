
// Challenge
// Create a program to calculate paremeter of a rectangle



import java.lang.*;
import java.util.Scanner;

public class challenge_10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side A =" + " ");
        double a = input.nextDouble();
        System.out.print("Enter side B =" +" ");
        double b = input.nextDouble();
        
        System.out.print("Enter side C =" +" ");
        double c = input.nextDouble();
        
        System.out.print("Enter side D =" +" ");
        double d = input.nextDouble();
        
   
      
        System.out.println("The Paremeter of rectangle  =" +  " "+ (a+b+c+d));
       
    }
}
