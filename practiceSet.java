
import java.util.Scanner;
public class hello {
    public static void main(String[] args){
        System.out.println("hello bro");
        
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter Your name here ");
        String name = input.nextLine();
        
        System.out.print("Enter your age here");
        int age = input.nextInt();
        
        System.out.print("Hey " + name + "you are " + age + " now");
        
        
        
        
    }
}
