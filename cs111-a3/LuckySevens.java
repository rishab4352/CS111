/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author:
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/
import java.util.Scanner;
public class LuckySevens {

    public static void main(String[] args) {
        int speed; //Expected average speed
                int time;    //Distance traveled
                int distance; 
                
                Scanner keyboard = new Scanner(System.in);
                
                System.out.print("What is the expected average speed? ");
                speed = keyboard.nextInt();
                
                System.out.print("What is the maximum time traveled? ");
                time = keyboard.nextInt();
                
                System.out.println("Hour    Distance Traveled");
                System.out.println("-------------------------");
                
                for (int hour= 1; hour <= time; hour++); 
                {
           
  System.out.println(hour + "\t" 
                       + distance); 
                }
            }
    }
}
