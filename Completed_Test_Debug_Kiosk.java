/*
******** Took 5 min and 1 second to type this class
*/
import java.util.Scanner;
public class Kiosk{
  public static void main(String args[]){
    String[] items = {"apple", "banana", "pear", "strawberry", "mango"};
    System.out.println("Welcome to Kroger! You will purchase then buy your items");
    double[] prices = {2.33, 2.89, 8.12, 9.15,10.34};
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
