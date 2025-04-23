// Challenge #18 Create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but not 100, unless also divisible by 400)


import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Year Over here ");
        int a = input.nextInt();
      
       if(a % 4 == 0 &&  a % 100 != 0 ){
           System.out.print("This a leap year");
       }else{
           System.out.print("This is not a leap year");

       }
        input.close();
        
        
    }
}
