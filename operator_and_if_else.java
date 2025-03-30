// Reletional Operators in java

// <, >, <= , >=, ==, !=

// # equality
// @ == checks value equality
// @ === checks value and type equality

// # Inequality 
// @ != checks value inequality
// @ !== checks value and type inequality

// Relational Operators
// @ > Greater Than
// @ < Less Than
// @ >= Greater Than or Equal to
// @ <= Less Than or Equal to





import java.lang.*;
import java.util.Scanner;
public class relationalOperators{
    public static void main(String[] args){
    
    System.out.println("Welcome to Driving Lisence Portal");    
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Your age ");
    int age = input.nextInt();
    
  System.out.print("Enter Your Name  ");
  input.nextLine();
  String name = input.nextLine();
  
if(age >= 18){
    System.out.println("hello" + " " + name + " " + "you are elegible");
}else {
    System.out.println("hello" + " " +name + " " + "you are not elegible");
};
    
    }
}












