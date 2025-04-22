
import java.lang.*;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int num = input.nextInt();
    
    if(num < 0){
        System.out.print("Number is Nagative");
    } else if(num == 0){
        System.out.print("Number is Zero");
    }else {
          System.out.print("Number is Positive");
    }
        
    }
}
