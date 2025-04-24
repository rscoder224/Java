// challenge #20 Create a program that categorise a person into different age groups 
// Child --> below 13  Teen --> below 20;
// Adult ---> below 60    Senior --> above 60;

import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number for Sum : ");
        int num = input.nextInt();
         int total = 0;
         int i = 0;
        while(i <= num){
          total = total +i;    
           i++;
        }
       
     System.out.print(total);
     
    }
}





