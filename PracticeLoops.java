
/**
 * Practice Loops
 * 
 * This program demonstrates the use of Java's 3 different loop structures.
 * 
 * There are 8 different loops total.
 * 
 * @author  Tony Aiello
 * 
 */
import java.util.*;

public class PracticeLoops
{
    public static void main(String [] args) {
        // set up Scanner for keyboard input
        Scanner keybd = new Scanner(System.in);

        System.out.println("          ------ Section A ------");
        System.out.println("(do-while) User enters a number between 2 and 10, inclusive.");
        System.out.println("(while) Loop runs to place that many spaces between \"Hello\" and \"Goodbye\".");
        System.out.println("(for) Loop runs to find that number's factorial value.");
        System.out.println("========================================================================");
        // entered value is used for factorial calculation
        int numberEntered = 4;  // 4 is a dummy value to prevent error message
        do {
            if (numberEntered < 2 || numberEntered > 10)    
                System.out.println("Error:  factorial number must be "
                                 + "between 2 and 10, inclusive.");                
            System.out.print("Enter a number to use for factorial: ");
            numberEntered = keybd.nextInt();
        } while (numberEntered < 2 || numberEntered > 10);

        // Loop to place (numberEntered) spaces between "Hello" and "Goodbye"
        System.out.print("Hello");
        int count = 0;
        while (count < numberEntered)   {
            System.out.print(" ");
            count++;
        }
        System.out.println("Goodbye");
        
        // use entered number to calculate factorial
        int factorial = 1;
        for (int i = 1; i <= numberEntered; i++)    {
            factorial = factorial * i;
        }
        System.out.printf("%2d! = %,2d\n",numberEntered,factorial);
        System.out.println("________________________________________________________________________");        
        System.out.println();
        // END SECTION A
        
        System.out.println("          ------ Section B ------");
        System.out.println("(while) Loop prints powers of 2 between 1 and 50, inclusive.");
        System.out.println("========================================================================");
        // from 1 to 50, print powers of 2, by checking each value
        int power = 0;
        int value = 1;  // begin with 2 to the 0 power
        while (value <= 50) {            
            System.out.printf("2 to the %d power = %2d\n",power,value);
            power++;
            value = value * 2;
        }        
        System.out.println("________________________________________________________________________");  
        System.out.println();
        // END SECTION B
        
        System.out.println("          ------ Section C ------");
        System.out.println("(do-while) User enters number (n): must be multiple of 3, between 3 and 24.");
        System.out.println("(for) Loop prints values n->0, separated by tabs, by 3's.");
        System.out.println("========================================================================");
        // user entered number divisible by 3, but not by 5
        int num = 0;
        do {
            System.out.print("Enter a multiple of 3: ");
            num = keybd.nextInt();
            if (num % 3 != 0 || num >= 25  || num < 3)
                System.out.println("Error: Enter a multiple of 3 between 3 and 24, inclusive.");
        } while (num % 3 != 0 || num >= 25  || num < 3);
        
        // now, print down to 0, by threes
        for (int i = num; i >= 0; i -= 3)   {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("________________________________________________________________________");  
        System.out.println();
        // END SECTION C       
        
        System.out.println("          ------ Section D ------");
        System.out.println("(for) Loop shows range of dinner prices from $10.00-> $15.00");
        System.out.println("and using .75 increments, calculates 20% tip, total, and prints a table.");
        System.out.println("========================================================================");
        // First, table heading
        System.out.println("  Dinner Price          20% tip         Total");
        System.out.println("----------------------------------------------------");
        for (double price = 10; price <= 15; price += .75)  {
            double pct20 = price * .2;
            double total = price + pct20;
            System.out.printf("\t$%5.2f\t\t$%5.2f\t\t$%5.2f\n",price,pct20,total);
        }
        System.out.println("________________________________________________________________________");
        // END SECTION D        
        
        System.out.println("          ------ Section E ------");
        System.out.println("2 different sums will be calculated.");
        System.out.println("(while) Loop: User enters unknown number of integer numbers.");
        System.out.println("First value will be added to sum#1, second value added to sum #2.");
        System.out.println("Actions will be repeated as long as user enters positive numbers.");
        System.out.println("========================================================================");
        // initialize accumulator variables
        int sum1 = 0;
        int sum2 = 0;
        int addValue = 1;
        boolean isFirstSum = true;
        // keep reading as long as non-negative number entered
        while (addValue > 0)   {
            System.out.print("Enter a number to add to ");
            if (isFirstSum) {
                System.out.print("first sum: ");
                addValue = keybd.nextInt();
                sum1 += addValue;
            }
            else    {   // must be for second sum
                System.out.print("second sum: ");
                addValue = keybd.nextInt();
                sum2 += addValue;
            }
            isFirstSum = !isFirstSum;
        }
        System.out.println();
        System.out.printf("First sum: %,d\t\tSecond sum: %,d\n",sum1,sum2);
        System.out.println("________________________________________________________________________");
        System.out.println();
        // END SECTION E  
    }
}
