import java.lang.*;

import java.util.Scanner;

public class working{
    public static void main(String[] args){
       Scanner raju = new Scanner(System.in);
       System.out.print("Enter Your Name Here ");
          String name = raju.nextLine();
          System.out.print("Enter Your Age here ");
          int age = raju.nextInt();
          raju.close();
          
         System.out.println("Hello bro my name is " + name + " and I am " + age + " years old");
    }
}
