import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        
     Scanner banner = new Scanner(System.in);
     
    System.out.print("Enter a ");
    int square = banner.nextInt();
    System.out.print("The area of square is " + (square*square) );
    }
}
