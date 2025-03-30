// if else condition 

import java.lang.*;
import java.util.Scanner;
public class ifElse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age" + " ");
        int age = input.nextInt();
        
        if(age >= 18){
         System.out.println("You can drink Milk as well as cofee");
        }else {
       System.out.println("You can drink only milk");            
        };
        
    }
}
