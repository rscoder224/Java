// if else statement using Java

import java.lang.*;

import java.util.Scanner;

public class hero{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your age:  ");
    int age = input.nextInt();
    
    if(age >= 18){
        System.out.println("You can Vote");
    }else{
        System.out.println("You cannot Vote");
    }
        
    }
}
