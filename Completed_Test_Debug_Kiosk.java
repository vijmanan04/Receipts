/*
********Took 5 min and 1 second to type this class

Description of my process to make this program:
The process I used to make the changes from the quiz version to the current version is as follows. 
First, I worked through all the syntax errors that came when I had just type the code directly from the quiz.
They were mainly missing semi-colons and a few times where I needed to declare and initialize a variable, not just declare. 
After those changes were made, I realized that I needed to actually call the printer class within the file, so then I decided to create an instance of the printer class. 
From the quiz the printer class already had a constructor that required arguments, so I passed in the necessary parameters to this printer. 
Before I could call the functions needed from the printer, I needed to actually define them in Printer.java, so I went over on the other file and completed the methods (see other comment for other file comments). 
After completing the methods, I called them from the Printer instance. In general, my thought process in making this file involved lots of cross-checking to make sure that all necessary parameters were recorded and passed in the correct order. 
Also, I had to double-check the user interface for make it look clean multiple times, so user interface design was a large concern of mine in this file.
*/
import java.util.Scanner;
public class Kiosk{
  public static void main(String args[]){
    String[] items = {"apple", "banana", "pear", "strawberry", "mango"};
    System.out.println("Welcome to Kroger! You will purchase then buy your items");
    double[] prices = {2.33, 2.89, 8.12, 9.15,7.34};
    System.out.println("Please purchase your good. You will be prompted to buy a type of food, along with its price. You will need to enter the quantity you want to buy.");
    String buffer; // clear buffer
    Scanner scan = new Scanner(System.in); // Scanner
    int[] qty = {0,0,0,0,0};
    int purchaseQty;
    double totalPrice = 0;
    for (int i = 0; i < 5; i++) { // ask and update quantities
      System.out.print("How many " + items[i] + "(s) will you like to buy? (enter an integer): ");
      purchaseQty = scan.nextInt();
      buffer = scan.nextLine();
      qty[i] = purchaseQty;
      totalPrice += prices[i] * qty[i];
    }
    System.out.println("");

    System.out.println("Great! Here is your recipt.");
    Printer printer = new Printer(totalPrice, qty, items, prices); // load class; (i.e. send to job to printer)
    // call apropriate functions 
    printer.printHeader();
    printer.printOrder();
    printer.printTotals();
    printer.printHeader();
  } // close main
} // close main class
