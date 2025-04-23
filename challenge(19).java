// Challenge #19 Create a program that calculate grade based on 
// A --> above 90%       B--> above 75% 
// C --> above 30%       D--> above 30%
// F --> below 30%


import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Percentage Here : ");
        int a = input.nextInt();
      
       if(a > 90 ){
           System.out.print("Grade A");
       }else if(a > 75){
           System.out.print("Grade B");
       }else if(a > 60){
           System.out.print("Grade C");
       }else if(a > 30){
           System.out.print("Grade D");
       }else{
              System.out.print("F");
       }
       
        input.close();
        
        
    }
}
