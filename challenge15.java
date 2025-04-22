// Challenge #15
// create a program that determines if a number is odd or Even


import java.lang.*;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        if(num % 2 == 0){
         System.out.println("Given Number is Even");
            
        }else{
            System.out.println("Given number is Odd");
        }
        
    input.close();
    }
}
