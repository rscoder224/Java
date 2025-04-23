// Challenge #17 Create a program that determines the greatest of three numbers.


import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Number A : ");
        int a = input.nextInt();
       System.out.print("Enter a Number B : ");
       int b = input.nextInt();
       System.out.print("Enter a Number C : ");
       int c = input.nextInt();
       
       if(a > b && a > c){
           System.out.print("A is Greater");

       }else if(b > a && b > c){
           System.out.print("B is Greater");

       }else{
           System.out.print("C is Greater");

       }

        input.close();
        
        
    }
}
