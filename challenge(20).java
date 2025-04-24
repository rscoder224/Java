// challenge #20 Create a program that categorise a person into different age groups 
// Child --> below 13  Teen --> below 20;
// Adult ---> below 60    Senior --> above 60;

import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age Here : ");
        int age = input.nextInt();
        
        if( age < 13){
             System.out.print("Child");
        }else if( age < 20){
             System.out.print("Teen");
        }else if(age < 60){
              System.out.print("Adult");
        }else{
              System.out.print("Senior");
        }
    }
}





