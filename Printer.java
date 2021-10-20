//Printer.java

/* This is a java file 'stub' or piece of a file designed to get you started on 
* learning to code in java, specifically with multiple classes and methods that rely on the other.
*
*For this assignment, I would like you to fork, modify and commit this project, while
* adding the following elements to your code.
*
* The receipt printer file could take arguments or parametrs from another class
* This file will be purely for output
****************************************
* 40 characters is a standard width    * 
* for typical receipt paper, your task *
* is to make output from the screen    *
* look like it is printing to a small  *
* receipt type printer, with all the   *
* text formatted to 40 characters wide *
*                                      *
* Have fun with the assignment!!       *
****************************************
*/



/*
******** Took 5 min and 34 second to type this class
*/
public class Printer { //prints recipt
  double subtotal;
  double[] prices = new double[5];
  int[] qty = new int[5];
  String[] itemNames = new String[5];
  public Printer(double totalPrice, int[] qtys, String[] items, double[] price){ //constructor
    subtotal = totalPrice;
    prices = price;
    qty = qtys;
    itemNames = items;}

    int spaceLeft = 0;
    public void printOrder(){ //Prints only order without subtotals
      System.out.println("Kroger");
      System.out.println("Qty  \t\t\tItem  \t\t\t\tPrice");
      for (int i = 0; i < 5; i++){
        System.out.print(qty[i] + "\t");
        System.out.print(itemNames[i]);
        spaceLeft = 29 - itemNames[i].lenght();
        for (int j = 0; j < 5; j++){
          System.out.print(" ");
        }
        if (prices[i] < 10.0) { //checks for number of characters
          System.out.print
          /*
            ******* This is where I stopped when the quiz ended;
          */
        }


    } // close for loop


}// close class
