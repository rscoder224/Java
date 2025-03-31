// logical Operator in java 

// And &&  or|| !  

import java.lang.*;
import java.util.Scanner;
public class logicalOperators{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter area ");
        int area = input.nextInt();
         input.nextLine();
         System.out.print("Enter Your Colony Here "); 
         String name = input.nextLine();
         
         if(area > 1900 || name  == "S"){
             System.out.print("Elegible for L.D.A");
         }else
         {
             System.out.println("Not elegible for L.D.A");};
        
    };
};


