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

  public void printHeader(){
    for(int i = 0; i < 40; i++){ // 40 char output
      System.out.print("*");
    }
    System.out.println("");


  }

  int spaceLeft = 0;
  public void printOrder(){ //Prints only order without subtotals
    System.out.println("Kroger");
    System.out.println("Qty\t\t Item\t\t Price"); // 40 char out put if /t = 7
    // 3 + 2 + (3 * 4) + 4 + 2 + (3 * 4) + 5 = 40 char
    for (int i = 0; i < 5; i++){
      System.out.print(qty[i] + "\t\t "); // 1 + 2 + (3 * 4) = 15 char
      System.out.print(itemNames[i]);

      spaceLeft = 17 - itemNames[i].length(); // 40 char - 17 char - 5 char - 1 char - length of name (for dollar sign) =
      for (int j = 0; j < spaceLeft; j++){
        System.out.print(" ");
      }
      System.out.print("$"); // print dollar sign before

      if (prices[i] < 10.0) { //checks for number of characters
        System.out.print(" " + prices[i]); // prints out 5 chars
      }
      if (prices[i] >= 10.0) { //checks for number of characters
        System.out.print(prices[i]); // prints out 5 chars
      }
      System.out.println("");
    } // close for loop
    System.out.println("");
  }

  public void printTotals(){
    for (int i = 0; i < 19; i++){ // 40 - 8 - 7 - 1 - 5 char printed here for spaces
      System.out.print(" ");
    }
    System.out.print("Subtotal       $"); //15 chars printed here
    if (subtotal < 10.0) { //checks for number of characters
      System.out.print(" " + subtotal); // prints out 5 chars
    }
    if (subtotal >= 10.0) { //checks for number of characters
      System.out.print(subtotal); // prints out 5 chars
    }

    System.out.println("");



    for (int i = 0; i < 19; i++){ // 40 - 8 - 7 - 1 - 5 char printed here for spaces
      System.out.print(" ");
    }
    System.out.print("Tax 7%         $"); // 12 char printed here
    if ((subtotal * 0.07) < 10.0) { //checks for number of characters
      System.out.print(String.format(" " + "%.2f", (subtotal * 0.07))); // format to two decimal places; print tax
    }
    if ((subtotal * 0.07 )>= 10.0) { //checks for number of characters
      System.out.print(String.format("%.2f", (subtotal * 0.07))); // format to two decimal places; print tax
    }

    System.out.println("");



    for (int i = 0; i < 19; i++){ // 40 - 8 - 7 - 1 - 5 char printed here for spaces
      System.out.print(" ");
    }
    System.out.print("Total          $"); // 12 char printed here
    if ((subtotal + subtotal * 0.07) < 10.0) { //checks for number of characters
      System.out.print(" " + String.format("%.2f", (subtotal + subtotal * 0.07))); // format to two decimal places; print total
    }
    if (subtotal >= 10.0) { //checks for number of characters
      System.out.print(String.format("%.2f", (subtotal + subtotal * 0.07))); // format to two decimal places; print total
    }

    System.out.println("");



  }
}// close class
