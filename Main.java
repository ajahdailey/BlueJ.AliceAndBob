/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
    
        Scanner Greeting = new Scanner (System.in);
        System.out.print ("What is your name?");

        String n = Greeting.nextLine();
        if((n.equals("Alice"))||( n.equals("Bob"))){
            
            System.out.println("Hello");
        }

    } 
        
        
}
